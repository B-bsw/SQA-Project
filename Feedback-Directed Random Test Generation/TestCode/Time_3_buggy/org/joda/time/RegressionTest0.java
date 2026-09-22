package org.joda.time;

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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.parse("", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Zone must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        int int0 = org.joda.time.MutableDateTime.ROUND_HALF_FLOOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        int int0 = org.joda.time.MutableDateTime.ROUND_CEILING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        int int0 = org.joda.time.MutableDateTime.ROUND_NONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = mutableDateTime1.toMutableDateTime(dateTimeZone2);
        java.util.Locale locale4 = null;
        java.util.Calendar calendar5 = mutableDateTime1.toCalendar(locale4);
        org.joda.time.DateTimeField dateTimeField6 = null;
        org.joda.time.MutableDateTime.Property property7 = new org.joda.time.MutableDateTime.Property(mutableDateTime1, dateTimeField6);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(calendar5);
// flaky "1) test07(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1790094880799,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Los_Angeles\",offset=-28800000,dstSavings=3600000,useDaylight=true,transitions=185,lastRule=java.util.SimpleTimeZone[id=America/Los_Angeles,offset=-28800000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2026,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=265,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=34,SECOND=40,MILLISECOND=799,ZONE_OFFSET=-28800000,DST_OFFSET=3600000]");
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.Chronology chronology2 = null;
        mutableDateTime1.setChronology(chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime1.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = mutableDateTime5.get(dateTimeFieldType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone4);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = mutableDateTime1.toMutableDateTime(dateTimeZone2);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(chronology4);
        org.joda.time.Chronology chronology6 = null;
        mutableDateTime5.setChronology(chronology6);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime3);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = mutableDateTime1.toMutableDateTime(dateTimeZone2);
        mutableDateTime3.addWeekyears((int) (short) -1);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(chronology6);
        mutableDateTime3.setDate((org.joda.time.ReadableInstant) mutableDateTime7);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime3.setDayOfMonth(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime3);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.Chronology chronology2 = null;
        mutableDateTime1.setChronology(chronology2);
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime1.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.set(dateTimeFieldType5, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.hourOfDay();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.year();
        java.lang.String str4 = property3.getName();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "year" + "'", str4, "year");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(chronology1);
        org.joda.time.Chronology chronology3 = null;
        mutableDateTime2.setChronology(chronology3);
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime2.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((java.lang.Object) 1.0f, dateTimeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone5);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        int int2 = mutableDateTime1.getMinuteOfHour();
// flaky "2) test14(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.Chronology chronology2 = null;
        mutableDateTime1.setChronology(chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime1.getZone();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setSecondOfMinute(100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone4);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime4 = property2.add(0L);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(mutableDateTime4);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.hourOfDay();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.year();
        mutableDateTime1.addSeconds((int) (byte) 1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.Chronology chronology2 = null;
        mutableDateTime1.setChronology(chronology2);
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime1.hourOfDay();
        int int5 = property4.get();
        int int6 = property4.get();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = mutableDateTime1.toString("", locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfWeek();
        org.joda.time.DurationField durationField3 = property2.getLeapDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNull(durationField3);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.Chronology chronology2 = null;
        mutableDateTime1.setChronology(chronology2);
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime1.hourOfDay();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime1.hourOfDay();
        java.lang.String str6 = property5.getAsString();
        java.lang.Class<?> wildcardClass7 = property5.getClass();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9" + "'", str6, "9");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(chronology8);
        org.joda.time.Chronology chronology10 = null;
        mutableDateTime9.setChronology(chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime9.getZone();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((int) (byte) 1, (int) (byte) 10, (int) (byte) 10, 10, (int) (byte) 0, 0, (int) (byte) 10, dateTimeZone12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((java.lang.Object) 10.0f, dateTimeZone12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone12);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = mutableDateTime1.toMutableDateTime(dateTimeZone2);
        java.util.Locale locale4 = null;
        java.util.Calendar calendar5 = mutableDateTime1.toCalendar(locale4);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setDate(34, (int) '#', 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(calendar5);
// flaky "3) test23(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1790094902062,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Los_Angeles\",offset=-28800000,dstSavings=3600000,useDaylight=true,transitions=185,lastRule=java.util.SimpleTimeZone[id=America/Los_Angeles,offset=-28800000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2026,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=265,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=2,MILLISECOND=62,ZONE_OFFSET=-28800000,DST_OFFSET=3600000]");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.junit.Assert.assertNotNull(mutableDateTime0);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.Chronology chronology2 = null;
        mutableDateTime1.setChronology(chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime1.getZone();
        mutableDateTime1.setDate(0L);
        org.junit.Assert.assertNotNull(dateTimeZone4);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.hourOfDay();
        mutableDateTime1.setMillisOfDay(9);
        org.junit.Assert.assertNotNull(property2);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = mutableDateTime1.toMutableDateTime(dateTimeZone2);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(chronology4);
        org.joda.time.Chronology chronology6 = null;
        mutableDateTime5.setChronology(chronology6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.hourOfDay();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime5.hourOfDay();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) mutableDateTime5);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime1.minuteOfHour();
        long long12 = property11.remainder();
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property11);
// flaky "4) test27(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 6085L + "'", long12 == 6085L);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = mutableDateTime1.toMutableDateTime(dateTimeZone2);
        mutableDateTime3.addWeekyears((int) (short) -1);
        java.lang.Class<?> wildcardClass6 = mutableDateTime3.getClass();
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfWeek();
        int int3 = property2.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = mutableDateTime1.toMutableDateTime(dateTimeZone2);
        mutableDateTime3.addWeekyears((int) (short) -1);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(chronology6);
        mutableDateTime3.setDate((org.joda.time.ReadableInstant) mutableDateTime7);
        mutableDateTime3.setWeekyear(39);
        org.junit.Assert.assertNotNull(mutableDateTime3);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        int int0 = org.joda.time.MutableDateTime.ROUND_HALF_EVEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.Chronology chronology2 = null;
        mutableDateTime1.setChronology(chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime1.getZone();
        mutableDateTime1.setMinuteOfHour(2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.Chronology chronology2 = null;
        mutableDateTime1.setChronology(chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime1.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone4);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(chronology13);
        org.joda.time.Chronology chronology15 = null;
        mutableDateTime14.setChronology(chronology15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime14.getZone();
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((int) (byte) 1, (int) (byte) 10, (int) (byte) 10, 10, (int) (byte) 0, 0, (int) (byte) 10, dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime5.toMutableDateTime(dateTimeZone17);
        mutableDateTime5.setMonthOfYear(3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(mutableDateTime20);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.hourOfDay();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.year();
        org.joda.time.DateTimeField dateTimeField4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = mutableDateTime1.get(dateTimeField4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeField must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.Chronology chronology2 = null;
        mutableDateTime1.setChronology(chronology2);
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime1.hourOfDay();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime1.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.getMutableDateTime();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(3, (-1), (int) 'a', (int) ' ', 0, (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = mutableDateTime1.toMutableDateTime(dateTimeZone2);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(chronology4);
        org.joda.time.Chronology chronology6 = null;
        mutableDateTime5.setChronology(chronology6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.hourOfDay();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime5.hourOfDay();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) mutableDateTime5);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime1.minuteOfHour();
        int int12 = property11.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 59 + "'", int12 == 59);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = mutableDateTime1.toMutableDateTime(dateTimeZone2);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(chronology4);
        org.joda.time.Chronology chronology6 = null;
        mutableDateTime5.setChronology(chronology6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.hourOfDay();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime5.hourOfDay();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) mutableDateTime5);
        mutableDateTime1.add((long) (short) -1);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.hourOfDay();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.year();
        java.lang.String str4 = mutableDateTime1.toString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
// flaky "5) test39(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2026-09-22T09:35:16.402-07:00" + "'", str4, "2026-09-22T09:35:16.402-07:00");
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (short) -1);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = mutableDateTime1.toMutableDateTime(dateTimeZone2);
        mutableDateTime3.addMinutes((int) 'a');
        org.junit.Assert.assertNotNull(mutableDateTime3);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.Chronology chronology2 = null;
        mutableDateTime1.setChronology(chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime1.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone4);
        mutableDateTime5.setWeekOfWeekyear(9);
        org.junit.Assert.assertNotNull(dateTimeZone4);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = mutableDateTime1.toMutableDateTime(dateTimeZone2);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(chronology4);
        org.joda.time.Chronology chronology6 = null;
        mutableDateTime5.setChronology(chronology6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.hourOfDay();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime5.hourOfDay();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) mutableDateTime5);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(chronology11);
        org.joda.time.Chronology chronology13 = null;
        mutableDateTime12.setChronology(chronology13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime12.hourOfDay();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime12.hourOfDay();
        boolean boolean17 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime12);
        boolean boolean18 = mutableDateTime12.isBeforeNow();
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.Chronology chronology2 = null;
        mutableDateTime1.setChronology(chronology2);
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime1.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime6 = property4.set(39);
        mutableDateTime6.setSecondOfMinute((int) (byte) 0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime6);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.Chronology chronology2 = null;
        mutableDateTime1.setChronology(chronology2);
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime1.hourOfDay();
        int int5 = mutableDateTime1.getMonthOfYear();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = mutableDateTime1.toMutableDateTime(dateTimeZone2);
        java.util.Locale locale4 = null;
        java.util.Calendar calendar5 = mutableDateTime1.toCalendar(locale4);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime1.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime7 = property6.roundHalfCeiling();
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(calendar5);
// flaky "6) test46(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1790094922726,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Los_Angeles\",offset=-28800000,dstSavings=3600000,useDaylight=true,transitions=185,lastRule=java.util.SimpleTimeZone[id=America/Los_Angeles,offset=-28800000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2026,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=265,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=22,MILLISECOND=726,ZONE_OFFSET=-28800000,DST_OFFSET=3600000]");
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.Chronology chronology2 = null;
        mutableDateTime1.setChronology(chronology2);
        org.joda.time.MutableDateTime mutableDateTime4 = mutableDateTime1.copy();
        mutableDateTime4.setMillis(6085L);
        boolean boolean8 = mutableDateTime4.isAfter((long) 59);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = mutableDateTime1.toMutableDateTime(dateTimeZone2);
        boolean boolean4 = mutableDateTime3.isBeforeNow();
        int int5 = mutableDateTime3.getWeekOfWeekyear();
        mutableDateTime3.addMonths(10);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 39 + "'", int5 == 39);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.Chronology chronology2 = null;
        mutableDateTime1.setChronology(chronology2);
        int int4 = mutableDateTime1.getSecondOfMinute();
        boolean boolean5 = mutableDateTime1.isBeforeNow();
// flaky "7) test49(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 25 + "'", int4 == 25);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = mutableDateTime1.toMutableDateTime(dateTimeZone2);
        mutableDateTime3.addWeekyears((int) (short) -1);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(chronology6);
        mutableDateTime3.setDate((org.joda.time.ReadableInstant) mutableDateTime7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(chronology9);
        org.joda.time.Chronology chronology11 = null;
        mutableDateTime10.setChronology(chronology11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone13);
        org.joda.time.DateTime dateTime15 = mutableDateTime3.toDateTime(dateTimeZone13);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.hourOfDay();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.secondOfDay();
        org.joda.time.Chronology chronology4 = property3.getChronology();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(chronology4);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.hourOfDay();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.year();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(chronology4);
        org.joda.time.Chronology chronology6 = null;
        mutableDateTime5.setChronology(chronology6);
        org.joda.time.DateTimeZone dateTimeZone8 = mutableDateTime5.getZone();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(dateTimeZone8);
        mutableDateTime1.setZoneRetainFields(dateTimeZone8);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.Chronology chronology2 = null;
        mutableDateTime1.setChronology(chronology2);
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime1.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundFloor();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setMonthOfYear((int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(chronology7);
        org.joda.time.Chronology chronology9 = null;
        mutableDateTime8.setChronology(chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime8.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((int) (byte) 1, (int) (byte) 10, (int) (byte) 10, 10, (int) (byte) 0, 0, (int) (byte) 10, dateTimeZone11);
        mutableDateTime13.setMillis((long) (byte) 100);
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.Chronology chronology2 = null;
        mutableDateTime1.setChronology(chronology2);
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime1.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime6 = property4.set(39);
        long long7 = property4.getMillis();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime6);
// flaky "8) test56(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 61748238930652L + "'", long7 == 61748238930652L);
    }
}
