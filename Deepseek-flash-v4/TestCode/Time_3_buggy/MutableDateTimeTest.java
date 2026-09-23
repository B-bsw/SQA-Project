package org.joda.time;

import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.*;

public class MutableDateTimeTest {

    private MutableDateTime utc(int year, int month, int day,
                                int hour, int minute, int second, int millis) {
        return new MutableDateTime(
                year, month, day, hour, minute, second, millis, DateTimeZone.UTC);
    }

    @Test
    public void testConstructorAndAccessors() {
        MutableDateTime mdt = new MutableDateTime(2007, 12, 25, 13, 14, 15, 16, DateTimeZone.UTC);

        assertEquals(2007, mdt.getYear());
        assertEquals(12, mdt.getMonthOfYear());
        assertEquals(25, mdt.getDayOfMonth());
        assertEquals(13, mdt.getHourOfDay());
        assertEquals(14, mdt.getMinuteOfHour());
        assertEquals(15, mdt.getSecondOfMinute());
        assertEquals(16, mdt.getMillisOfSecond());
        assertEquals(DateTimeZone.UTC, mdt.getZone());
        assertNotNull(mdt.getChronology());
    }

    @Test
    public void testCopyAndClone() {
        MutableDateTime mdt = utc(2020, 6, 7, 8, 9, 10, 11);
        MutableDateTime copy = mdt.toMutable();

        assertEquals(mdt, copy);

        copy.addDays(1);
        assertFalse(mdt.equals(copy));
    }

    @Test
    public void testParse() {
        MutableDateTime mdt = MutableDateTime.parse("2020-07-15T10:20:30.500Z");

        assertEquals(2020, mdt.getYear());
        assertEquals(7, mdt.getMonthOfYear());
        assertEquals(15, mdt.getDayOfMonth());
        assertEquals(10, mdt.getHourOfDay());
        assertEquals(20, mdt.getMinuteOfHour());
        assertEquals(30, mdt.getSecondOfMinute());
        assertEquals(500, mdt.getMillisOfSecond());

        DateTimeFormatter formatter = ISODateTimeFormat.dateTimeParser().withOffsetParsed();
        MutableDateTime parsed = MutableDateTime.parse("2020-07-15T10:20:30.500Z", formatter);
        assertEquals(mdt, parsed);
    }

    @Test(expected = NullPointerException.class)
    public void testNowNullZoneThrows() {
        MutableDateTime.now((DateTimeZone) null);
    }

    @Test(expected = NullPointerException.class)
    public void testNowNullChronologyThrows() {
        MutableDateTime.now((Chronology) null);
    }

    @Test
    public void testPropertyMethods() {
        MutableDateTime mdt = utc(2000, 1, 31, 23, 59, 59, 900);

        MutableDateTime.Property day = mdt.dayOfMonth();
        day.set(15);
        assertEquals(15, day.get());

        day.add(3);
        assertEquals(18, day.get());

        MutableDateTime.Property month = mdt.monthOfYear();
        month.set(12);
        assertEquals(12, month.get());

        month.add(1);
        assertEquals(1, month.get());
        assertEquals(2001, mdt.getYear());

        day.set("20", Locale.ENGLISH);
        assertEquals(20, day.get());
    }

    @Test
    public void testPropertyRoundingMethods() {
        MutableDateTime mdt = utc(2000, 1, 1, 0, 0, 6, 500);

        mdt.secondOfMinute().roundFloor();
        assertEquals(6, mdt.getSecondOfMinute());
        assertEquals(0, mdt.getMillisOfSecond());

        mdt = utc(2000, 1, 1, 0, 0, 6, 500);
        mdt.secondOfMinute().roundCeiling();
        assertEquals(7, mdt.getSecondOfMinute());
        assertEquals(0, mdt.getMillisOfSecond());

        mdt = utc(2000, 1, 1, 0, 0, 6, 500);
        mdt.secondOfMinute().roundHalfFloor();
        assertEquals(6, mdt.getSecondOfMinute());
        assertEquals(0, mdt.getMillisOfSecond());

        mdt = utc(2000, 1, 1, 0, 0, 6, 500);
        mdt.secondOfMinute().roundHalfCeiling();
        assertEquals(7, mdt.getSecondOfMinute());
        assertEquals(0, mdt.getMillisOfSecond());

        mdt = utc(2000, 1, 1, 0, 0, 6, 500);
        mdt.secondOfMinute().roundHalfEven();
        assertEquals(6, mdt.getSecondOfMinute());
        assertEquals(0, mdt.getMillisOfSecond());

        mdt = utc(2000, 1, 1, 0, 0, 7, 500);
        mdt.secondOfMinute().roundHalfEven();
        assertEquals(8, mdt.getSecondOfMinute());
        assertEquals(0, mdt.getMillisOfSecond());
    }

    @Test
    public void testAddDurationAndPeriod() {
        MutableDateTime mdt = utc(2000, 1, 1, 0, 0, 0, 0);

        mdt.add(Period.seconds(1));
        assertEquals(1000L, mdt.getMillis());

        mdt.add(Days.days(1));
        assertEquals(utc(2000, 1, 2, 0, 0, 1, 0).getMillis(), mdt.getMillis());
    }

    @Test
    public void testAddNullDurationAndPeriodNoEffect() {
        MutableDateTime mdt = utc(2000, 1, 1, 0, 0, 0, 0);
        long before = mdt.getMillis();

        mdt.add((ReadableDuration) null, 1);
        assertEquals(before, mdt.getMillis());

        mdt.add((ReadablePeriod) null, 2);
        assertEquals(before, mdt.getMillis());
    }

    @Test
    public void testDateAndTimeSetters() {
        MutableDateTime mdt = utc(2000, 1, 31, 23, 59, 58, 123);

        mdt.setDayOfMonth(1);
        assertEquals(1, mdt.getDayOfMonth());

        mdt.addDays(1);
        assertEquals(2, mdt.getDayOfMonth());

        mdt.setHourOfDay(0);
        mdt.addHours(1);
        assertEquals(1, mdt.getHourOfDay());

        mdt.setMinuteOfHour(0);
        mdt.addMinutes(1);
        assertEquals(1, mdt.getMinuteOfHour());

        mdt.setSecondOfMinute(0);
        mdt.addSeconds(1);
        assertEquals(1, mdt.getSecondOfMinute());

        mdt.setMillisOfSecond(999);
        mdt.addMillis(2);
        assertEquals(2, mdt.getSecondOfMinute());
        assertEquals(1, mdt.getMillisOfSecond());
    }

    @Test
    public void testLeapYearSetters() {
        MutableDateTime mdt = utc(2000, 1, 31, 0, 0, 0, 0);

        mdt.setMonthOfYear(2);
        assertEquals(29, mdt.getDayOfMonth());

        mdt.addYears(1);
        assertEquals(28, mdt.getDayOfMonth());
    }

    @Test
    public void testSetDateTime() {
        MutableDateTime mdt = utc(2000, 1, 1, 0, 0, 0, 0);
        mdt.setDateTime(2012, 3, 4, 5, 6, 7, 8);

        assertEquals(2012, mdt.getYear());
        assertEquals(3, mdt.getMonthOfYear());
        assertEquals(4, mdt.getDayOfMonth());
        assertEquals(5, mdt.getHourOfDay());
        assertEquals(6, mdt.getMinuteOfHour());
        assertEquals(7, mdt.getSecondOfMinute());
        assertEquals(8, mdt.getMillisOfSecond());
    }

    @Test
    public void testZoneOperations() {
        MutableDateTime mdt = utc(2000, 1, 1, 12, 0, 0, 0);
        long originalMillis = mdt.getMillis();

        DateTimeZone plus1 = DateTimeZone.forOffsetHours(1);
        mdt.setZoneRetainFields(plus1);

        assertEquals(plus1, mdt.getZone());
        assertEquals(12, mdt.getHourOfDay());
        assertEquals(originalMillis - 3600000L, mdt.getMillis());

        mdt.setZone(DateTimeZone.UTC);
        assertEquals(DateTimeZone.UTC, mdt.getZone());
        assertEquals(11, mdt.getHourOfDay());
    }

    @Test
    public void testToString() {
        MutableDateTime mdt = utc(2020, 7, 15, 10, 20, 30, 500);
        assertEquals("2020-07-15T10:20:30.500Z", mdt.toString());
    }
}