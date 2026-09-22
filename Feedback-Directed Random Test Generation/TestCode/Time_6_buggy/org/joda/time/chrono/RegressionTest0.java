package org.joda.time.chrono;

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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.joda.time.Instant instant0 = org.joda.time.chrono.GJChronology.DEFAULT_CUTOVER;
        java.lang.Class<?> wildcardClass1 = instant0.getClass();
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, (long) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, 100L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.yearOfEra();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.Instant instant1 = gJChronology0.getGregorianCutover();
        org.joda.time.DurationField durationField2 = gJChronology0.weeks();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(durationField2);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.Instant instant1 = gJChronology0.getGregorianCutover();
        long long3 = gJChronology0.julianToGregorianByYear(0L);
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1123200000L) + "'", long3 == (-1123200000L));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.weekyear();
        java.lang.Class<?> wildcardClass3 = gJChronology0.getClass();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.weekyearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = gJChronology0.getDateTimeMillis((int) (short) -1, (int) (short) -1, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.Instant instant1 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = gJChronology0.get(readablePeriod3, (long) 0, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = gJChronology0.getDateTimeMillis((long) '#', (int) (byte) 0, (int) (short) 100, 10, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.Instant instant1 = org.joda.time.chrono.GJChronology.DEFAULT_CUTOVER;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, (org.joda.time.ReadableInstant) instant1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant1);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DurationField durationField1 = gJChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.dayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = gJChronology0.get(readablePeriod3, (long) (short) 100, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.weekyearOfCentury();
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.Instant instant5 = gJChronology4.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology4.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology4.secondOfDay();
        boolean boolean8 = gJChronology0.equals((java.lang.Object) dateTimeField7);
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, (long) (short) -1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(gJChronology3);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        long long2 = gJChronology0.julianToGregorianByWeekyear((long) 4);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.year();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1209599996L) + "'", long2 == (-1209599996L));
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gJChronology0.eras();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(durationField1);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.Instant instant1 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        int int1 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.weekyear();
        org.joda.time.DurationField durationField3 = gJChronology0.hours();
        org.joda.time.DurationField durationField4 = gJChronology0.months();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        long long2 = gJChronology0.julianToGregorianByWeekyear((long) 4);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.dayOfMonth();
        org.joda.time.DurationField durationField4 = gJChronology0.minutes();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1209599996L) + "'", long2 == (-1209599996L));
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        int int1 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField2 = gJChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.hourOfHalfday();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.Instant instant2 = gJChronology1.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, (org.joda.time.ReadableInstant) instant2);
        org.junit.Assert.assertNotNull(gJChronology1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(gJChronology3);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DurationField durationField1 = gJChronology0.weekyears();
        long long3 = gJChronology0.julianToGregorianByWeekyear((long) 100);
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1209599900L) + "'", long3 == (-1209599900L));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = gJChronology1.weekyear();
        org.joda.time.DurationField durationField3 = gJChronology1.halfdays();
        long long5 = gJChronology1.julianToGregorianByYear((long) (byte) 100);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology1.minuteOfHour();
        org.junit.Assert.assertNotNull(gJChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1123199900L) + "'", long5 == (-1123199900L));
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DurationField durationField1 = gJChronology0.weekyears();
        org.joda.time.DurationField durationField2 = gJChronology0.years();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DurationField durationField1 = gJChronology0.centuries();
        org.joda.time.DurationField durationField2 = gJChronology0.weekyears();
        org.joda.time.DurationField durationField3 = gJChronology0.years();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        int int1 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.Chronology chronology2 = gJChronology0.withUTC();
        org.joda.time.DurationField durationField3 = gJChronology0.seconds();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(durationField3);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DurationField durationField1 = gJChronology0.centuries();
        org.joda.time.DurationField durationField2 = gJChronology0.weekyears();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = gJChronology0.add(readablePeriod3, (long) '#', (int) (short) 10);
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.yearOfCentury();
        long long3 = gJChronology0.julianToGregorianByWeekyear((long) 10);
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1209599990L) + "'", long3 == (-1209599990L));
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.chrono.AssembledChronology.Fields fields1 = null;
        gJChronology0.assemble(fields1);
        org.joda.time.Chronology chronology3 = gJChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.monthOfYear();
        long long8 = gJChronology0.add((long) (short) 1, 0L, (int) (short) 100);
        org.joda.time.DurationField durationField9 = gJChronology0.millis();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField2 = gJChronology0.months();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.Instant instant1 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        java.lang.String str4 = gJChronology0.toString();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[America/Los_Angeles]" + "'", str4, "GJChronology[America/Los_Angeles]");
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.chrono.AssembledChronology.Fields fields1 = null;
        gJChronology0.assemble(fields1);
        org.joda.time.Chronology chronology3 = gJChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField6 = gJChronology0.weeks();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        int int1 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.weekyear();
        org.joda.time.DurationField durationField3 = gJChronology0.hours();
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology0.getZone();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        long long2 = gJChronology0.julianToGregorianByWeekyear((long) 4);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.dayOfMonth();
        org.joda.time.DurationField durationField4 = gJChronology0.halfdays();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1209599996L) + "'", long2 == (-1209599996L));
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.era();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.Instant instant1 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.yearOfEra();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.chrono.AssembledChronology.Fields fields1 = null;
        gJChronology0.assemble(fields1);
        org.joda.time.Chronology chronology3 = gJChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.monthOfYear();
        long long8 = gJChronology0.add((long) (short) 1, 0L, (int) (short) 100);
        org.joda.time.DurationField durationField9 = gJChronology0.weekyears();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = gJChronology1.weekyear();
        org.joda.time.Instant instant3 = gJChronology1.getGregorianCutover();
        org.junit.Assert.assertNotNull(gJChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(instant3);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.chrono.AssembledChronology.Fields fields1 = null;
        gJChronology0.assemble(fields1);
        org.joda.time.Chronology chronology3 = gJChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.yearOfCentury();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }
}

