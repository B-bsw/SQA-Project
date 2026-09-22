package org.joda.time;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Locale;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.field.UnsupportedDurationField;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.junit.Assert;
import org.junit.Test;

public class MutableDateTimeTest {

    private static final DateTimeZone UTC = DateTimeZone.UTC;
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");

    @Test
    public void now_givenDefault_shouldCreateInstanceNearCurrentTime() {
        long before = System.currentTimeMillis();
        MutableDateTime mdt = MutableDateTime.now();
        long after = System.currentTimeMillis();

        Assert.assertNotNull(mdt);
        Assert.assertTrue(mdt.getMillis() >= before && mdt.getMillis() <= after);
    }

    @Test
    public void now_givenValidZone_shouldUseProvidedZone() {
        MutableDateTime mdt = MutableDateTime.now(PARIS);
        Assert.assertNotNull(mdt);
        Assert.assertEquals(PARIS, mdt.getZone());
    }

    @Test(expected = NullPointerException.class)
    public void now_givenNullZone_shouldThrowNullPointerException() {
        MutableDateTime.now((DateTimeZone) null);
    }

    @Test
    public void now_givenValidChronology_shouldUseProvidedChronology() {
        Chronology chrono = BuddhistChronology.getInstance(UTC);
        MutableDateTime mdt = MutableDateTime.now(chrono);
        Assert.assertNotNull(mdt);
        Assert.assertEquals(chrono, mdt.getChronology());
    }

    @Test(expected = NullPointerException.class)
    public void now_givenNullChronology_shouldThrowNullPointerException() {
        MutableDateTime.now((Chronology) null);
    }

    @Test
    public void parse_givenValidIsoString_shouldParseCorrectly() {
        MutableDateTime mdt = MutableDateTime.parse("2023-05-15T10:30:45.123Z");
        Assert.assertEquals(2023, mdt.getYear());
        Assert.assertEquals(5, mdt.getMonthOfYear());
        Assert.assertEquals(15, mdt.getDayOfMonth());
        Assert.assertEquals(10, mdt.getHourOfDay());
        Assert.assertEquals(30, mdt.getMinuteOfHour());
        Assert.assertEquals(45, mdt.getSecondOfMinute());
        Assert.assertEquals(123, mdt.getMillisOfSecond());
    }

    @Test
    public void parse_givenValidCustomFormatter_shouldParseCorrectly() {
        DateTimeFormatter fmt = DateTimeFormat.forPattern("yyyy/MM/dd HH:mm").withZone(UTC);
        MutableDateTime mdt = MutableDateTime.parse("2023/12/31 23:59", fmt);
        Assert.assertEquals(2023, mdt.getYear());
        Assert.assertEquals(12, mdt.getMonthOfYear());
        Assert.assertEquals(31, mdt.getDayOfMonth());
        Assert.assertEquals(23, mdt.getHourOfDay());
        Assert.assertEquals(59, mdt.getMinuteOfHour());
        Assert.assertEquals(UTC, mdt.getZone());
    }

    @Test
    public void constructors_givenVariousSignatures_shouldInitializeCorrectly() {
        MutableDateTime mdt1 = new MutableDateTime();
        Assert.assertNotNull(mdt1);

        MutableDateTime mdt2 = new MutableDateTime(PARIS);
        Assert.assertEquals(PARIS, mdt2.getZone());

        MutableDateTime mdt3 = new MutableDateTime(BuddhistChronology.getInstanceUTC());
        Assert.assertEquals(BuddhistChronology.getInstanceUTC(), mdt3.getChronology());

        MutableDateTime mdt4 = new MutableDateTime(1000L);
        Assert.assertEquals(1000L, mdt4.getMillis());

        MutableDateTime mdt5 = new MutableDateTime(1000L, PARIS);
        Assert.assertEquals(1000L, mdt5.getMillis());
        Assert.assertEquals(PARIS, mdt5.getZone());

        MutableDateTime mdt6 = new MutableDateTime(1000L, ISOChronology.getInstanceUTC());
        Assert.assertEquals(1000L, mdt6.getMillis());
        Assert.assertEquals(ISOChronology.getInstanceUTC(), mdt6.getChronology());

        MutableDateTime mdt7 = new MutableDateTime("2020-01-01T00:00:00.000Z");
        Assert.assertEquals(2020, mdt7.getYear());

        MutableDateTime mdt8 = new MutableDateTime("2020-01-01T00:00:00.000Z", PARIS);
        Assert.assertEquals(PARIS, mdt8.getZone());

        MutableDateTime mdt9 = new MutableDateTime("2020-01-01T00:00:00.000Z", ISOChronology.getInstanceUTC());
        Assert.assertEquals(ISOChronology.getInstanceUTC(), mdt9.getChronology());

        MutableDateTime mdt10 = new MutableDateTime(2020, 1, 2, 3, 4, 5, 6);
        Assert.assertEquals(2020, mdt10.getYear());
        Assert.assertEquals(1, mdt10.getMonthOfYear());
        Assert.assertEquals(2, mdt10.getDayOfMonth());
        Assert.assertEquals(3, mdt10.getHourOfDay());
        Assert.assertEquals(4, mdt10.getMinuteOfHour());
        Assert.assertEquals(5, mdt10.getSecondOfMinute());
        Assert.assertEquals(6, mdt10.getMillisOfSecond());

        MutableDateTime mdt11 = new MutableDateTime(2020, 1, 2, 3, 4, 5, 6, PARIS);
        Assert.assertEquals(PARIS, mdt11.getZone());
        Assert.assertEquals(2020, mdt11.getYear());

        MutableDateTime mdt12 = new MutableDateTime(2020, 1, 2, 3, 4, 5, 6, ISOChronology.getInstanceUTC());
        Assert.assertEquals(ISOChronology.getInstanceUTC(), mdt12.getChronology());
        Assert.assertEquals(2020, mdt12.getYear());
    }

    @Test
    public void setRounding_givenValidFieldAndAllRoundingModes_shouldRoundCorrectly() {
        MutableDateTime mdt = new MutableDateTime(2020, 1, 1, 10, 30, 45, 500, UTC);
        DateTimeField minuteField = ISOChronology.getInstanceUTC().minuteOfHour();

        mdt.setRounding(minuteField);
        Assert.assertEquals(MutableDateTime.ROUND_FLOOR, mdt.getRoundingMode());
        Assert.assertEquals(minuteField, mdt.getRoundingField());
        Assert.assertEquals(0, mdt.getSecondOfMinute());
        Assert.assertEquals(0, mdt.getMillisOfSecond());

        mdt.setMillis(new DateTime(2020, 1, 1, 10, 30, 45, 0, UTC).getMillis());
        mdt.setRounding(minuteField, MutableDateTime.ROUND_CEILING);
        Assert.assertEquals(31, mdt.getMinuteOfHour());

        mdt.setRounding(minuteField, MutableDateTime.ROUND_NONE);
        Assert.assertNull(mdt.getRoundingField());
        Assert.assertEquals(MutableDateTime.ROUND_NONE, mdt.getRoundingMode());

        mdt.setMillis(new DateTime(2020, 1, 1, 10, 30, 29, 0, UTC).getMillis());
        mdt.setRounding(minuteField, MutableDateTime.ROUND_HALF_FLOOR);
        Assert.assertEquals(30, mdt.getMinuteOfHour());

        mdt.setMillis(new DateTime(2020, 1, 1, 10, 30, 30, 0, UTC).getMillis());
        mdt.setRounding(minuteField, MutableDateTime.ROUND_HALF_FLOOR);
        Assert.assertEquals(30, mdt.getMinuteOfHour());

        mdt.setMillis(new DateTime(2020, 1, 1, 10, 30, 30, 0, UTC).getMillis());
        mdt.setRounding(minuteField, MutableDateTime.ROUND_HALF_CEILING);
        Assert.assertEquals(31, mdt.getMinuteOfHour());

        mdt.setMillis(new DateTime(2020, 1, 1, 10, 30, 30, 0, UTC).getMillis());
        mdt.setRounding(minuteField, MutableDateTime.ROUND_HALF_EVEN);
        Assert.assertEquals(30, mdt.getMinuteOfHour());

        mdt.setRounding(null, MutableDateTime.ROUND_FLOOR);
        Assert.assertNull(mdt.getRoundingField());
        Assert.assertEquals(MutableDateTime.ROUND_NONE, mdt.getRoundingMode());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setRounding_givenModeLessThanNone_shouldThrowIllegalArgumentException() {
        MutableDateTime mdt = new MutableDateTime(UTC);
        DateTimeField field = ISOChronology.getInstanceUTC().hourOfDay();
        mdt.setRounding(field, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setRounding_givenModeGreaterThanHalfEven_shouldThrowIllegalArgumentException() {
        MutableDateTime mdt = new MutableDateTime(UTC);
        DateTimeField field = ISOChronology.getInstanceUTC().hourOfDay();
        mdt.setRounding(field, 6);
    }

    @Test
    public void setMillis_givenReadableInstant_shouldUpdateMillis() {
        MutableDateTime mdt = new MutableDateTime(0L, UTC);
        Instant instant = new Instant(54321L);
        mdt.setMillis((ReadableInstant) instant);
        Assert.assertEquals(54321L, mdt.getMillis());

        mdt.setMillis((ReadableInstant) null);
        Assert.assertTrue(mdt.getMillis() > 0L);
    }

    @Test
    public void add_givenLongDuration_shouldIncreaseMillis() {
        MutableDateTime mdt = new MutableDateTime(1000L, UTC);
        mdt.add(500L);
        Assert.assertEquals(1500L, mdt.getMillis());
    }

    @Test
    public void add_givenReadableDuration_shouldIncreaseMillis() {
        MutableDateTime mdt = new MutableDateTime(1000L, UTC);
        Duration duration = new Duration(2000L);
        mdt.add((ReadableDuration) duration);
        Assert.assertEquals(3000L, mdt.getMillis());

        mdt.add(duration, 2);
        Assert.assertEquals(7000L, mdt.getMillis());

        mdt.add((ReadableDuration) null, 5);
        Assert.assertEquals(7000L, mdt.getMillis());

        mdt.add((ReadableDuration) null);
        Assert.assertEquals(7000L, mdt.getMillis());
    }

    @Test
    public void add_givenReadablePeriod_shouldIncreasePeriod() {
        MutableDateTime mdt = new MutableDateTime(2020, 1, 1, 0, 0, 0, 0, UTC);
        Period period = Period.days(2);
        mdt.add((ReadablePeriod) period);
        Assert.assertEquals(3, mdt.getDayOfMonth());

        mdt.add(period, 3);
        Assert.assertEquals(9, mdt.getDayOfMonth());

        mdt.add((ReadablePeriod) null, 2);
        Assert.assertEquals(9, mdt.getDayOfMonth());

        mdt.add((ReadablePeriod) null);
        Assert.assertEquals(9, mdt.getDayOfMonth());
    }

    @Test
    public void setChronology_givenValidAndNull_shouldUpdateChronology() {
        MutableDateTime mdt = new MutableDateTime(UTC);
        mdt.setChronology(GregorianChronology.getInstanceUTC());
        Assert.assertEquals(GregorianChronology.getInstanceUTC(), mdt.getChronology());

        mdt.setChronology(null);
        Assert.assertEquals(ISOChronology.getInstance(), mdt.getChronology());
    }

    @Test
    public void setZone_givenSameAndDifferentZones_shouldUpdateZoneOrKeepInstant() {
        MutableDateTime mdt = new MutableDateTime(1000000L, UTC);
        mdt.setZone(UTC);
        Assert.assertEquals(UTC, mdt.getZone());

        mdt.setZone(PARIS);
        Assert.assertEquals(PARIS, mdt.getZone());
        Assert.assertEquals(1000000L, mdt.getMillis());

        mdt.setZone(null);
        Assert.assertEquals(DateTimeZone.getDefault(), mdt.getZone());
    }

    @Test
    public void setZoneRetainFields_givenSameAndDifferentZones_shouldRetainLocalFields() {
        MutableDateTime mdt = new MutableDateTime(2020, 6, 1, 12, 0, 0, 0, UTC);
        mdt.setZoneRetainFields(UTC);
        Assert.assertEquals(12, mdt.getHourOfDay());

        mdt.setZoneRetainFields(PARIS);
        Assert.assertEquals(PARIS, mdt.getZone());
        Assert.assertEquals(12, mdt.getHourOfDay());

        mdt.setZoneRetainFields(null);
        Assert.assertEquals(DateTimeZone.getDefault(), mdt.getZone());
        Assert.assertEquals(12, mdt.getHourOfDay());
    }

    @Test
    public void set_givenDateTimeFieldType_shouldUpdateSpecifiedField() {
        MutableDateTime mdt = new MutableDateTime(2020, 1, 1, 0, 0, 0, 0, UTC);
        mdt.set(DateTimeFieldType.year(), 2025);
        Assert.assertEquals(2025, mdt.getYear());

        mdt.set(DateTimeFieldType.monthOfYear(), 11);
        Assert.assertEquals(11, mdt.getMonthOfYear());
    }

    @Test(expected = IllegalArgumentException.class)
    public void set_givenNullDateTimeFieldType_shouldThrowIllegalArgumentException() {
        MutableDateTime mdt = new MutableDateTime(UTC);
        mdt.set((DateTimeFieldType) null, 1);
    }

    @Test
    public void add_givenDurationFieldType_shouldAddCorrectly() {
        MutableDateTime mdt = new MutableDateTime(2020, 1, 1, 0, 0, 0, 0, UTC);
        mdt.add(DurationFieldType.years(), 2);
        Assert.assertEquals(2022, mdt.getYear());

        mdt.add(DurationFieldType.days(), 5);
        Assert.assertEquals(6, mdt.getDayOfMonth());
    }

    @Test(expected = IllegalArgumentException.class)
    public void add_givenNullDurationFieldType_shouldThrowIllegalArgumentException() {
        MutableDateTime mdt = new MutableDateTime(UTC);
        mdt.add((DurationFieldType) null, 1);
    }

    @Test
    public void setAndAddConvenienceMethods_shouldUpdateValuesCorrectly() {
        MutableDateTime mdt = new MutableDateTime(2020, 1, 1, 0, 0, 0, 0, UTC);

        mdt.setYear(2021);
        Assert.assertEquals(2021, mdt.getYear());
        mdt.addYears(2);
        Assert.assertEquals(2023, mdt.getYear());

        mdt.setWeekyear(2024);
        Assert.assertEquals(2024, mdt.getWeekyear());
        mdt.addWeekyears(-1);
        Assert.assertEquals(2023, mdt.getWeekyear());

        mdt.setMonthOfYear(5);
        Assert.assertEquals(5, mdt.getMonthOfYear());
        mdt.addMonths(2);
        Assert.assertEquals(7, mdt.getMonthOfYear());

        mdt.setWeekOfWeekyear(10);
        Assert.assertEquals(10, mdt.getWeekOfWeekyear());
        mdt.addWeeks(1);
        Assert.assertEquals(11, mdt.getWeekOfWeekyear());

        mdt.setDayOfYear(40);
        Assert.assertEquals(40, mdt.getDayOfYear());

        mdt.setDayOfMonth(15);
        Assert.assertEquals(15, mdt.getDayOfMonth());
        mdt.addDays(3);
        Assert.assertEquals(18, mdt.getDayOfMonth());

        mdt.setDayOfWeek(3);
        Assert.assertEquals(3, mdt.getDayOfWeek());

        mdt.setHourOfDay(14);
        Assert.assertEquals(14, mdt.getHourOfDay());
        mdt.addHours(2);
        Assert.assertEquals(16, mdt.getHourOfDay());

        mdt.setMinuteOfDay(120);
        Assert.assertEquals(120, mdt.getMinuteOfDay());

        mdt.setMinuteOfHour(45);
        Assert.assertEquals(45, mdt.getMinuteOfHour());
        mdt.addMinutes(5);
        Assert.assertEquals(50, mdt.getMinuteOfHour());

        mdt.setSecondOfDay(500);
        Assert.assertEquals(500, mdt.getSecondOfDay());

        mdt.setSecondOfMinute(30);
        Assert.assertEquals(30, mdt.getSecondOfMinute());
        mdt.addSeconds(10);
        Assert.assertEquals(40, mdt.getSecondOfMinute());

        mdt.setMillisOfDay(12345);
        Assert.assertEquals(12345, mdt.getMillisOfDay());

        mdt.setMillisOfSecond(250);
        Assert.assertEquals(250, mdt.getMillisOfSecond());
        mdt.addMillis(50);
        Assert.assertEquals(300, mdt.getMillisOfSecond());
    }

    @Test
    public void setDate_givenLongAndReadableInstantAndYMD_shouldUpdateDateFields() {
        MutableDateTime mdt = new MutableDateTime(2020, 1, 1, 15, 30, 0, 0, UTC);

        long targetDateMillis = new DateTime(2022, 5, 20, 8, 10, 0, 0, UTC).getMillis();
        mdt.setDate(targetDateMillis);
        Assert.assertEquals(2022, mdt.getYear());
        Assert.assertEquals(5, mdt.getMonthOfYear());
        Assert.assertEquals(20, mdt.getDayOfMonth());
        Assert.assertEquals(15, mdt.getHourOfDay());
        Assert.assertEquals(30, mdt.getMinuteOfHour());

        DateTime dtOtherZone = new DateTime(2023, 8, 12, 10, 0, 0, 0, PARIS);
        mdt.setDate(dtOtherZone);
        Assert.assertEquals(2023, mdt.getYear());
        Assert.assertEquals(8, mdt.getMonthOfYear());
        Assert.assertEquals(12, mdt.getDayOfMonth());

        Instant instant = new Instant(new DateTime(2024, 9, 14, 0, 0, 0, 0, UTC).getMillis());
        mdt.setDate((ReadableInstant) instant);
        Assert.assertEquals(2024, mdt.getYear());
        Assert.assertEquals(9, mdt.getMonthOfYear());
        Assert.assertEquals(14, mdt.getDayOfMonth());

        mdt.setDate(2025, 11, 28);
        Assert.assertEquals(2025, mdt.getYear());
        Assert.assertEquals(11, mdt.getMonthOfYear());
        Assert.assertEquals(28, mdt.getDayOfMonth());
        Assert.assertEquals(15, mdt.getHourOfDay());
    }

    @Test
    public void setTime_givenLongAndReadableInstantAndHMSM_shouldUpdateTimeFields() {
        MutableDateTime mdt = new MutableDateTime(2020, 5, 10, 0, 0, 0, 0, UTC);

        long timeInstant = new DateTime(1970, 1, 1, 14, 20, 30, 400, UTC).getMillis();
        mdt.setTime(timeInstant);
        Assert.assertEquals(2020, mdt.getYear());
        Assert.assertEquals(5, mdt.getMonthOfYear());
        Assert.assertEquals(10, mdt.getDayOfMonth());
        Assert.assertEquals(14, mdt.getHourOfDay());
        Assert.assertEquals(20, mdt.getMinuteOfHour());
        Assert.assertEquals(30, mdt.getSecondOfMinute());
        Assert.assertEquals(400, mdt.getMillisOfSecond());

        DateTime dtParis = new DateTime(2021, 1, 1, 18, 45, 15, 500, PARIS);
        mdt.setTime((ReadableInstant) dtParis);
        Assert.assertEquals(18, mdt.getHourOfDay());
        Assert.assertEquals(45, mdt.getMinuteOfHour());
        Assert.assertEquals(15, mdt.getSecondOfMinute());
        Assert.assertEquals(500, mdt.getMillisOfSecond());

        mdt.setTime(22, 15, 10, 999);
        Assert.assertEquals(22, mdt.getHourOfDay());
        Assert.assertEquals(15, mdt.getMinuteOfHour());
        Assert.assertEquals(10, mdt.getSecondOfMinute());
        Assert.assertEquals(999, mdt.getMillisOfSecond());
    }

    @Test
    public void setDateTime_givenAllFields_shouldUpdateEntireDateTime() {
        MutableDateTime mdt = new MutableDateTime(UTC);
        mdt.setDateTime(2022, 4, 18, 9, 25, 40, 123);
        Assert.assertEquals(2022, mdt.getYear());
        Assert.assertEquals(4, mdt.getMonthOfYear());
        Assert.assertEquals(18, mdt.getDayOfMonth());
        Assert.assertEquals(9, mdt.getHourOfDay());
        Assert.assertEquals(25, mdt.getMinuteOfHour());
        Assert.assertEquals(40, mdt.getSecondOfMinute());
        Assert.assertEquals(123, mdt.getMillisOfSecond());
    }

    @Test
    public void property_givenSupportedType_shouldReturnValidProperty() {
        MutableDateTime mdt = new MutableDateTime(2020, 1, 1, 0, 0, 0, 0, UTC);
        MutableDateTime.Property prop = mdt.property(DateTimeFieldType.monthOfYear());
        Assert.assertNotNull(prop);
        Assert.assertEquals(mdt, prop.getMutableDateTime());
        Assert.assertEquals(mdt.getChronology(), prop.getChronology());
        Assert.assertEquals(mdt.getMillis(), prop.getMillis());
    }

    @Test(expected = IllegalArgumentException.class)
    public void property_givenNullType_shouldThrowIllegalArgumentException() {
        MutableDateTime mdt = new MutableDateTime(UTC);
        mdt.property(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void property_givenUnsupportedType_shouldThrowIllegalArgumentException() {
        Chronology unsupportedChrono = new ISOChronology(null, null) {
            private static final long serialVersionUID = 1L;
            public DateTimeField hourOfDay() {
                return UnsupportedDateTimeField.getInstance(
                    DateTimeFieldType.hourOfDay(),
                    UnsupportedDurationField.getInstance(DurationFieldType.hours())
                );
            }
        };
        MutableDateTime mdt = new MutableDateTime(unsupportedChrono);
        mdt.property(DateTimeFieldType.hourOfDay());
    }

    @Test
    public void propertyAccessors_shouldReturnNonNullProperties() {
        MutableDateTime mdt = new MutableDateTime(2020, 1, 1, 0,