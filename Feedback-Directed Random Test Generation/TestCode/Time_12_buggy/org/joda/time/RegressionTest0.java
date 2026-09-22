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
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((java.lang.Object) 'a', dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now(dateTimeZone0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Zone must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withCenturyOfEra((int) 'a');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withMillisOfSecond(1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.plusDays((int) 'a');
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = localDate1.withField(dateTimeFieldType2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.joda.time.Chronology chronology0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now(chronology0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Chronology must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate.Property property3 = localDate1.property(dateTimeFieldType2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The calendar must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withYear((int) (short) 0);
        org.joda.time.DateTimeField dateTimeField4 = null;
        org.joda.time.LocalDate.Property property5 = new org.joda.time.LocalDate.Property(localDate1, dateTimeField4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = property5.getAsShortText();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withCenturyOfEra((int) 'a');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusDays((int) (byte) 10);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withCenturyOfEra((int) 'a');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withMillisOfSecond(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = localDateTime5.get(dateTimeFieldType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate.Property property2 = localDate1.dayOfYear();
        org.junit.Assert.assertNotNull(property2);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withYear((int) (short) 0);
        org.joda.time.ReadablePartial readablePartial4 = null;
        org.joda.time.LocalDate localDate5 = localDate3.withFields(readablePartial4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate7 = localDate5.plus(readablePeriod6);
        int int8 = localDate5.getEra();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.junit.Assert.assertNotNull(chronology2);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((int) (byte) 100, 1, 1, 0, (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now(dateTimeZone0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Zone must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withCenturyOfEra((int) 'a');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withMillisOfSecond(1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.plusMonths((int) (short) 10);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.era();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withCenturyOfEra((int) 'a');
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withMillisOfSecond(1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withWeekOfWeekyear(1);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.DateTime dateTime18 = localDateTime16.toDateTime(readableInstant17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = localDateTime16.toDateTime(dateTimeZone19);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = property8.getDifference((org.joda.time.ReadableInstant) dateTime20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withYear((int) (short) 0);
        org.joda.time.DateTimeField dateTimeField4 = null;
        org.joda.time.LocalDate.Property property5 = new org.joda.time.LocalDate.Property(localDate1, dateTimeField4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate6 = property5.withMinimumValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withCenturyOfEra((int) 'a');
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDurationAdded(readableDuration4, (int) (byte) -1);
        int int7 = localDateTime6.size();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withCenturyOfEra((int) 'a');
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDurationAdded(readableDuration4, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField8 = localDateTime1.getField((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime1.withMinuteOfHour((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        int int2 = localDate1.getCenturyOfEra();
        org.joda.time.LocalDate localDate4 = localDate1.withWeekyear((int) 'a');
        org.joda.time.LocalDate.Property property5 = localDate1.dayOfYear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        int int2 = localDate1.getCenturyOfEra();
        org.joda.time.LocalDate localDate4 = localDate1.withWeekyear((int) 'a');
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = localDate1.getFieldTypes();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withCenturyOfEra((int) 'a');
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDurationAdded(readableDuration4, (int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.withTime((int) (short) 1, (int) (short) 10, 10, 0);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.plusHours((int) (short) 1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withCenturyOfEra((int) 'a');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withMillisOfSecond(1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.minusYears((int) '4');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withCenturyOfEra((int) 'a');
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withDurationAdded(readableDuration12, (int) (byte) -1);
        boolean boolean15 = localDateTime7.isEqual((org.joda.time.ReadablePartial) localDateTime9);
        long long16 = localDateTime9.getLocalMillis();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky "1) test23(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1790070419042L + "'", long16 == 1790070419042L);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) -1, dateTimeZone1);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withCenturyOfEra((int) 'a');
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withMillisOfSecond(1);
        org.joda.time.Chronology chronology7 = localDateTime4.getChronology();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) (byte) 10, chronology7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.secondOfMinute();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withCenturyOfEra((int) 'a');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withMillisOfSecond(1);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.era();
        java.lang.String str7 = property6.getAsShortText();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AD" + "'", str7, "AD");
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withCenturyOfEra((int) 'a');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withMillisOfSecond(1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withWeekOfWeekyear(1);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusDays(0);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = localDateTime9.withTime((int) '4', (int) (short) 100, (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withCenturyOfEra((int) 'a');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withMillisOfSecond(1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withWeekOfWeekyear(1);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusDays(0);
        int int10 = localDateTime7.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime.Property property12 = localDateTime7.property(dateTimeFieldType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withCenturyOfEra((int) 'a');
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDurationAdded(readableDuration4, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField8 = localDateTime1.getField((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.minusWeeks((int) (short) 0);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withCenturyOfEra((int) 'a');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withMillisOfSecond(1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withWeekOfWeekyear(1);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusDays(0);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfDay();
        java.lang.String str11 = property10.getAsShortText();
        int int12 = property10.getMaximumValue();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
// flaky "2) test30(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "35225001" + "'", str11, "35225001");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86399999 + "'", int12 == 86399999);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withCenturyOfEra((int) 'a');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withMillisOfSecond(1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withWeekOfWeekyear(1);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusDays(0);
        int int10 = localDateTime7.getMonthOfYear();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.withWeekyear(86399999);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withCenturyOfEra((int) 'a');
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDurationAdded(readableDuration4, (int) (byte) -1);
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.centuryOfEra();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withCenturyOfEra((int) 'a');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withMillisOfSecond(1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withWeekOfWeekyear(1);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusDays(0);
        org.joda.time.DateTimeField dateTimeField11 = localDateTime7.getField((int) (byte) 0);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withYear((int) (short) 0);
        org.joda.time.ReadablePartial readablePartial4 = null;
        org.joda.time.LocalDate localDate5 = localDate3.withFields(readablePartial4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate7 = localDate5.plus(readablePeriod6);
        org.joda.time.DateTime dateTime8 = localDate5.toDateTimeAtStartOfDay();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withCenturyOfEra((int) 'a');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withMillisOfSecond(1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.plusMonths((int) (short) 10);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.era();
        org.joda.time.LocalDateTime localDateTime9 = property8.getLocalDateTime();
        java.util.Locale locale10 = null;
        int int11 = property8.getMaximumTextLength(locale10);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withCenturyOfEra((int) 'a');
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDurationAdded(readableDuration4, (int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.withTime((int) (short) 1, (int) (short) 10, 10, 0);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfDay();
        java.lang.String str13 = property12.getAsString();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4210000" + "'", str13, "4210000");
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withCenturyOfEra((int) 'a');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withMillisOfSecond(1);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.era();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readablePeriod7);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withYear((int) (short) 0);
        long long4 = localDate1.getLocalMillis();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1790035200000L + "'", long4 == 1790035200000L);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withWeekOfWeekyear((int) '4');
        int int4 = localDate1.getMonthOfYear();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withCenturyOfEra((int) 'a');
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDurationAdded(readableDuration4, (int) (byte) -1);
        int[] intArray7 = localDateTime1.getValues();
        org.joda.time.LocalDateTime.Property property8 = localDateTime1.monthOfYear();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "3) test40(org.joda.time.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 2026, 9, 22, 35232786 });
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withWeekOfWeekyear((int) '4');
        org.joda.time.LocalTime localTime4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = localDate3.toLocalDateTime(localTime4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The time must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getYearOfCentury();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 26 + "'", int1 == 26);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withCenturyOfEra((int) 'a');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withMillisOfSecond(1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withWeekOfWeekyear(1);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusDays(0);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withCenturyOfEra((int) 'a');
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond(1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.plusMonths((int) (short) 10);
        boolean boolean18 = localDateTime9.isEqual((org.joda.time.ReadablePartial) localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withCenturyOfEra((int) 'a');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withMillisOfSecond(1);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.era();
        java.util.Locale locale7 = null;
        java.lang.String str8 = property6.getAsShortText(locale7);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AD" + "'", str8, "AD");
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withCenturyOfEra((int) 'a');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withMillisOfSecond(1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.minusYears((int) '4');
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.weekyear();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withCenturyOfEra((int) 'a');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withMillisOfSecond(1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.plusMonths((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime3.withMonthOfYear((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withDate((int) '4', (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.fromDateFields(date0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        int int2 = localDate1.getCenturyOfEra();
        int int3 = localDate1.getCenturyOfEra();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withYear((int) (short) 0);
        int int4 = localDate1.getWeekOfWeekyear();
        org.joda.time.LocalDate.Property property5 = localDate1.year();
        org.joda.time.LocalDate localDate7 = property5.addWrapFieldToCopy(39);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 39 + "'", int4 == 39);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate7);
    }
}
