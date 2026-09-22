package org.joda.time.chrono;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.Partial;
import org.joda.time.YearMonthDay;
import org.junit.Assert;
import org.junit.Test;

public class GJChronologyTest {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone OFFSET_ZONE = DateTimeZone.forOffsetHours(2);

    @Test
    public void getInstanceUTC_default_shouldReturnUtcWithDefaultCutoverAndFourMinDays() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        Assert.assertNotNull(chrono);
        Assert.assertEquals(DateTimeZone.UTC, chrono.getZone());
        Assert.assertEquals(GJChronology.DEFAULT_CUTOVER, chrono.getGregorianCutover());
        Assert.assertEquals(4, chrono.getMinimumDaysInFirstWeek());
    }

    @Test
    public void getInstance_default_shouldReturnDefaultZoneInstance() {
        GJChronology chrono = GJChronology.getInstance();
        Assert.assertNotNull(chrono);
        Assert.assertEquals(DateTimeZone.getDefault(), chrono.getZone());
        Assert.assertEquals(GJChronology.DEFAULT_CUTOVER, chrono.getGregorianCutover());
        Assert.assertEquals(4, chrono.getMinimumDaysInFirstWeek());
    }

    @Test
    public void getInstance_withZone_shouldReturnSpecifiedZone() {
        GJChronology chrono = GJChronology.getInstance(PARIS);
        Assert.assertNotNull(chrono);
        Assert.assertEquals(PARIS, chrono.getZone());
        Assert.assertEquals(GJChronology.DEFAULT_CUTOVER, chrono.getGregorianCutover());
        Assert.assertEquals(4, chrono.getMinimumDaysInFirstWeek());
    }

    @Test
    public void getInstance_withNullZone_shouldUseDefaultZone() {
        GJChronology chrono = GJChronology.getInstance((DateTimeZone) null);
        Assert.assertEquals(DateTimeZone.getDefault(), chrono.getZone());
    }

    @Test
    public void getInstance_withZoneAndCutover_shouldReturnConfiguredInstance() {
        Instant cutover = new Instant(0L);
        GJChronology chrono = GJChronology.getInstance(LONDON, cutover);
        Assert.assertEquals(LONDON, chrono.getZone());
        Assert.assertEquals(cutover, chrono.getGregorianCutover());
        Assert.assertEquals(4, chrono.getMinimumDaysInFirstWeek());
    }

    @Test
    public void getInstance_withNullCutover_shouldUseDefaultCutover() {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, (Instant) null, 4);
        Assert.assertEquals(GJChronology.DEFAULT_CUTOVER, chrono.getGregorianCutover());
    }

    @Test
    public void getInstance_cacheHit_shouldReturnSameCachedInstance() {
        GJChronology first = GJChronology.getInstance(OFFSET_ZONE, GJChronology.DEFAULT_CUTOVER, 3);
        GJChronology second = GJChronology.getInstance(OFFSET_ZONE, GJChronology.DEFAULT_CUTOVER, 3);
        Assert.assertSame(first, second);
    }

    @Test
    public void getInstance_differentParams_shouldReturnDifferentInstances() {
        GJChronology chrono3 = GJChronology.getInstance(DateTimeZone.UTC, GJChronology.DEFAULT_CUTOVER, 3);
        GJChronology chrono4 = GJChronology.getInstance(DateTimeZone.UTC, GJChronology.DEFAULT_CUTOVER, 4);
        Assert.assertFalse(chrono3.equals(chrono4));
    }

    @Test
    public void getInstance_longCutoverDefault_shouldMatchDefaultCutover() {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, GJChronology.DEFAULT_CUTOVER.getMillis(), 4);
        Assert.assertEquals(GJChronology.DEFAULT_CUTOVER, chrono.getGregorianCutover());
    }

    @Test
    public void getInstance_longCutoverCustom_shouldCreateInstant() {
        long customMillis = 10000000L;
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, customMillis, 4);
        Assert.assertEquals(new Instant(customMillis), chrono.getGregorianCutover());
    }

    @Test
    public void withUTC_onUtcChronology_shouldReturnSame() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        Assert.assertSame(chrono, chrono.withUTC());
    }

    @Test
    public void withUTC_onNonUtcChronology_shouldReturnUtcInstance() {
        GJChronology chrono = GJChronology.getInstance(PARIS);
        Chronology utcChrono = chrono.withUTC();
        Assert.assertEquals(DateTimeZone.UTC, utcChrono.getZone());
    }

    @Test
    public void withZone_nullZone_shouldReturnDefaultZone() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        Chronology withNull = chrono.withZone(null);
        Assert.assertEquals(DateTimeZone.getDefault(), withNull.getZone());
    }

    @Test
    public void withZone_sameZone_shouldReturnThis() {
        GJChronology chrono = GJChronology.getInstance(PARIS);
        Assert.assertSame(chrono, chrono.withZone(PARIS));
    }

    @Test
    public void withZone_differentZone_shouldReturnNewZoneInstance() {
        GJChronology chrono = GJChronology.getInstance(PARIS);
        Chronology londonChrono = chrono.withZone(LONDON);
        Assert.assertEquals(LONDON, londonChrono.getZone());
    }

    @Test
    public void getDateTimeMillis_4paramsBeforeCutover_shouldCalculateJulian() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        long millis = chrono.getDateTimeMillis(1500, 1, 1, 500);
        Assert.assertTrue(millis < GJChronology.DEFAULT_CUTOVER.getMillis());
        Assert.assertEquals(1500, chrono.year().get(millis));
        Assert.assertEquals(1, chrono.monthOfYear().get(millis));
        Assert.assertEquals(1, chrono.dayOfMonth().get(millis));
        Assert.assertEquals(500, chrono.millisOfDay().get(millis));
    }

    @Test
    public void getDateTimeMillis_4paramsAfterCutover_shouldCalculateGregorian() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        long millis = chrono.getDateTimeMillis(2000, 6, 15, 12000);
        Assert.assertTrue(millis >= GJChronology.DEFAULT_CUTOVER.getMillis());
        Assert.assertEquals(2000, chrono.year().get(millis));
        Assert.assertEquals(6, chrono.monthOfYear().get(millis));
        Assert.assertEquals(15, chrono.dayOfMonth().get(millis));
        Assert.assertEquals(12000, chrono.millisOfDay().get(millis));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getDateTimeMillis_4paramsInCutoverGap_shouldThrowException() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        chrono.getDateTimeMillis(1582, 10, 5, 0);
    }

    @Test
    public void getDateTimeMillis_7paramsBeforeCutover_shouldCalculateJulian() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        long millis = chrono.getDateTimeMillis(1500, 5, 10, 10, 20, 30, 400);
        Assert.assertTrue(millis < GJChronology.DEFAULT_CUTOVER.getMillis());
        Assert.assertEquals(1500, chrono.year().get(millis));
        Assert.assertEquals(5, chrono.monthOfYear().get(millis));
        Assert.assertEquals(10, chrono.dayOfMonth().get(millis));
        Assert.assertEquals(10, chrono.hourOfDay().get(millis));
        Assert.assertEquals(20, chrono.minuteOfHour().get(millis));
        Assert.assertEquals(30, chrono.secondOfMinute().get(millis));
        Assert.assertEquals(400, chrono.millisOfSecond().get(millis));
    }

    @Test
    public void getDateTimeMillis_7paramsAfterCutover_shouldCalculateGregorian() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        long millis = chrono.getDateTimeMillis(2010, 11, 25, 8, 15, 45, 250);
        Assert.assertTrue(millis >= GJChronology.DEFAULT_CUTOVER.getMillis());
        Assert.assertEquals(2010, chrono.year().get(millis));
        Assert.assertEquals(11, chrono.monthOfYear().get(millis));
        Assert.assertEquals(25, chrono.dayOfMonth().get(millis));
        Assert.assertEquals(8, chrono.hourOfDay().get(millis));
        Assert.assertEquals(15, chrono.minuteOfHour().get(millis));
        Assert.assertEquals(45, chrono.secondOfMinute().get(millis));
        Assert.assertEquals(250, chrono.millisOfSecond().get(millis));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getDateTimeMillis_7paramsInCutoverGap_shouldThrowException() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        chrono.getDateTimeMillis(1582, 10, 14, 23, 59, 59, 999);
    }

    @Test
    public void getDateTimeMillis_delegationToBase_shouldWorkForZoned() {
        GJChronology chrono = GJChronology.getInstance(OFFSET_ZONE);
        long millis4 = chrono.getDateTimeMillis(2005, 5, 1, 100);
        Assert.assertEquals(100, chrono.millisOfDay().get(millis4));

        long millis7 = chrono.getDateTimeMillis(2005, 5, 1, 12, 30, 40, 50);
        Assert.assertEquals(12, chrono.hourOfDay().get(millis7));
        Assert.assertEquals(30, chrono.minuteOfHour().get(millis7));
    }

    @Test
    public void equalsAndHashCode_variousScenarios_shouldAdhereToContract() {
        GJChronology chrono1 = GJChronology.getInstance(DateTimeZone.UTC, GJChronology.DEFAULT_CUTOVER, 4);
        GJChronology chrono2 = GJChronology.getInstance(DateTimeZone.UTC, GJChronology.DEFAULT_CUTOVER, 4);
        GJChronology chronoDiffCutover = GJChronology.getInstance(DateTimeZone.UTC, 0L, 4);
        GJChronology chronoDiffDays = GJChronology.getInstance(DateTimeZone.UTC, GJChronology.DEFAULT_CUTOVER, 1);

        Assert.assertTrue(chrono1.equals(chrono1));
        Assert.assertTrue(chrono1.equals(chrono2));
        Assert.assertEquals(chrono1.hashCode(), chrono2.hashCode());

        Assert.assertFalse(chrono1.equals(null));
        Assert.assertFalse(chrono1.equals("NotAChronology"));
        Assert.assertFalse(chrono1.equals(chronoDiffCutover));
        Assert.assertFalse(chrono1.equals(chronoDiffDays));
    }

    @Test
    public void toString_defaultCutoverAndFourDays_shouldPrintStandardFormat() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        Assert.assertEquals("GJChronology[UTC]", chrono.toString());
    }

    @Test
    public void toString_nonDefaultCutoverAtMidnight_shouldPrintDateCutover() {
        long cutoverMillis = GJChronology.getInstanceUTC().getDateTimeMillis(2000, 1, 1, 0);
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, cutoverMillis, 4);
        Assert.assertEquals("GJChronology[UTC,cutover=2000-01-01]", chrono.toString());
    }

    @Test
    public void toString_nonDefaultCutoverWithTimeAndMinDays_shouldPrintFullDetails() {
        long cutoverMillis = GJChronology.getInstanceUTC().getDateTimeMillis(2000, 1, 1, 12, 0, 0, 0);
        GJ