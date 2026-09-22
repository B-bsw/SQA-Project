package org.joda.time.format;

import java.util.Locale;
import org.junit.Assert;
import org.junit.Test;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.UnsupportedDurationField;

/**
 * Complete Unit Test Suite for DateTimeParserBucket.
 */
public class DateTimeParserBucketTest {

    // -------------------------------------------------------------------------
    // Constructor & Getter/Setter Tests
    // -------------------------------------------------------------------------

    @Test
    public void constructor3Args_givenValidParams_shouldInitializeProperly() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeParserBucket bucket = new DateTimeParserBucket(1000L, chrono, Locale.UK);

        Assert.assertSame(chrono, bucket.getChronology());
        Assert.assertEquals(Locale.UK, bucket.getLocale());
        Assert.assertNull(bucket.getZone());
        Assert.assertEquals(0, bucket.getOffset());
        Assert.assertNull(bucket.getPivotYear());
    }

    @Test
    public void constructor4Args_givenPivotYear_shouldStorePivotYear() {
        Chronology chrono = ISOChronology.getInstance(DateTimeZone.forOffsetHours(2));
        Integer pivotYear = new Integer(2020);
        DateTimeParserBucket bucket = new DateTimeParserBucket(2000L, chrono, Locale.GERMAN, pivotYear);

        Assert.assertEquals(chrono.withUTC(), bucket.getChronology());
        Assert.assertEquals(Locale.GERMAN, bucket.getLocale());
        Assert.assertEquals(DateTimeZone.forOffsetHours(2), bucket.getZone());
        Assert.assertEquals(pivotYear, bucket.getPivotYear());
    }

    @Test
    public void constructor5Args_givenNullChronologyAndNullLocale_shouldUseDefaults() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, null, null, null, 1995);

        Assert.assertNotNull(bucket.getChronology());
        Assert.assertEquals(ISOChronology.getInstanceUTC(), bucket.getChronology());
        Assert.assertEquals(Locale.getDefault(), bucket.getLocale());
        Assert.assertNull(bucket.getPivotYear());
    }

    @Test
    public void setZone_givenNonUtcZone_shouldUpdateZoneAndClearOffset() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, ISOChronology.getInstanceUTC(), Locale.US);
        bucket.setOffset(3600000);
        Assert.assertEquals(3600000, bucket.getOffset());

        DateTimeZone tokyo = DateTimeZone.forID("Asia/Tokyo");
        bucket.setZone(tokyo);

        Assert.assertEquals(tokyo, bucket.getZone());
        Assert.assertEquals(0, bucket.getOffset());
    }

    @Test
    public void setZone_givenUtcZone_shouldSetZoneToNull() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, ISOChronology.getInstance(DateTimeZone.forOffsetHours(1)), Locale.US);
        Assert.assertNotNull(bucket.getZone());

        bucket.setZone(DateTimeZone.UTC);

        Assert.assertNull(bucket.getZone());
        Assert.assertEquals(0, bucket.getOffset());
    }

    @Test
    public void setOffset_givenOffset_shouldUpdateOffsetAndClearZone() {
        DateTimeZone tokyo = DateTimeZone.forID("Asia/Tokyo");
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, ISOChronology.getInstance(tokyo), Locale.US);
        Assert.assertEquals(tokyo, bucket.getZone());

        bucket.setOffset(7200000);

        Assert.assertNull(bucket.getZone());
        Assert.assertEquals(7200000, bucket.getOffset());
    }

    @Test
    public void setPivotYear_givenValueOrNull_shouldUpdateState() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, ISOChronology.getInstanceUTC(), Locale.US);
        Assert.assertNull(bucket.getPivotYear());

        Integer pivot = new Integer(1980);
        bucket.setPivotYear(pivot);
        Assert.assertEquals(pivot, bucket.getPivotYear());

        bucket.setPivotYear(null);
        Assert.assertNull(bucket.getPivotYear());
    }

    // -------------------------------------------------------------------------
    // saveField & Array Expansion Tests
    // -------------------------------------------------------------------------

    @Test
    public void saveField_givenDateTimeField_shouldSaveValueCorrectly() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, chrono, Locale.US);

        bucket.saveField(chrono.year(), 2021);
        long computed = bucket.computeMillis(false);

        long expected = chrono.year().set(0L, 2021);
        Assert.assertEquals(expected, computed);
    }

    @Test
    public void saveField_givenDateTimeFieldType_shouldSaveValueCorrectly() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, chrono, Locale.US);

        bucket.saveField(DateTimeFieldType.monthOfYear(), 10);
        bucket.saveField(DateTimeFieldType.year(), 2022);
        long computed = bucket.computeMillis(false);

        long expected = chrono.year().set(0L, 2022);
        expected = chrono.monthOfYear().set(expected, 10);
        Assert.assertEquals(expected, computed);
    }

    @Test
    public void saveField_givenTextAndLocale_shouldSaveAndParseText() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, chrono, Locale.UK);

        bucket.saveField(DateTimeFieldType.year(), 2023);
        bucket.saveField(DateTimeFieldType.monthOfYear(), "March", Locale.UK);
        long computed = bucket.computeMillis(false);

        long expected = chrono.year().set(0L, 2023);
        expected = chrono.monthOfYear().set(expected, 3);
        Assert.assertEquals(expected, computed);
    }

    @Test
    public void saveField_exceedingInitialCapacity_shouldExpandSavedFieldsArray() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, chrono, Locale.US);

        bucket.saveField(DateTimeFieldType.year(), 2020);
        bucket.saveField(DateTimeFieldType.monthOfYear(), 5);
        bucket.saveField(DateTimeFieldType.dayOfMonth(), 15);
        bucket.saveField(DateTimeFieldType.hourOfDay(), 10);
        bucket.saveField(DateTimeFieldType.minuteOfHour(), 20);
        bucket.saveField(DateTimeFieldType.secondOfMinute(), 30);
        bucket.saveField(DateTimeFieldType.millisOfSecond(), 400);
        bucket.saveField(DateTimeFieldType.dayOfWeek(), 5);
        bucket.saveField(DateTimeFieldType.dayOfYear(), 136);

        long computed = bucket.computeMillis(false);
        Assert.assertTrue(computed > 0L);
    }

    // -------------------------------------------------------------------------
    // saveState & restoreState Tests
    // -------------------------------------------------------------------------

    @Test
    public void restoreState_givenInvalidObjectType_shouldReturnFalse() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, ISOChronology.getInstanceUTC(), Locale.US);
        boolean restored = bucket.restoreState("NotASavedState");
        Assert.assertFalse(restored);
    }

    @Test
    public void restoreState_givenStateFromDifferentBucket_shouldReturnFalse() {
        DateTimeParserBucket bucket1 = new DateTimeParserBucket(0L, ISOChronology.getInstanceUTC(), Locale.US);
        DateTimeParserBucket bucket2 = new DateTimeParserBucket(0L, ISOChronology.getInstanceUTC(), Locale.US);

        Object state1 = bucket1.saveState();
        boolean restored = bucket2.restoreState(state1);
        Assert.assertFalse(restored);
    }

    @Test
    public void restoreState_givenValidState_shouldRevertFieldsZoneAndOffset() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, ISOChronology.getInstanceUTC(), Locale.US);
        bucket.setOffset(5000);
        bucket.saveField(DateTimeFieldType.year(), 2010);

        Object savedState = bucket.saveState();

        bucket.setZone(DateTimeZone.forOffsetHours(3));
        bucket.saveField(DateTimeFieldType.monthOfYear(), 8);

        boolean restored = bucket.restoreState(savedState);
        Assert.assertTrue(restored);
        Assert.assertEquals(5000, bucket.getOffset());
        Assert.assertNull(bucket.getZone());

        long computed = bucket.computeMillis(false);
        long expected = ISOChronology.getInstanceUTC().year().set(0L, 2010) - 5000;
        Assert.assertEquals(expected, computed);
    }

    @Test
    public void saveField_whenRestoredToFewerFields_shouldCopySharedArrayOnModification() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, ISOChronology.getInstanceUTC(), Locale.US);
        bucket.saveField(DateTimeFieldType.year(), 2015);
        Object state1 = bucket.saveState();

        bucket.saveField(DateTimeFieldType.monthOfYear(), 6);
        bucket.saveField(DateTimeFieldType.dayOfMonth(), 20);

        bucket.restoreState(state1);
        bucket.saveField(DateTimeFieldType.monthOfYear(), 11);

        long computed = bucket.computeMillis(false);
        long expected = ISOChronology.getInstanceUTC().year().set(0L, 2015);
        expected = ISOChronology.getInstanceUTC().monthOfYear().set(expected, 11);
        Assert.assertEquals(expected, computed);
    }

    // -------------------------------------------------------------------------
    // computeMillis Sorting & Field Ordering Tests
    // -------------------------------------------------------------------------

    @Test
    public void computeMillis_moreThan10Fields_shouldSortUsingArraysSort() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, chrono, Locale.US);

        bucket.saveField(DateTimeFieldType.millisOfSecond(), 1);
        bucket.saveField(DateTimeFieldType.secondOfMinute(), 2);
        bucket.saveField(DateTimeFieldType.minuteOfHour(), 3);
        bucket.saveField(DateTimeFieldType.hourOfDay(), 4);
        bucket.saveField(DateTimeFieldType.dayOfWeek(), 1);
        bucket.saveField(DateTimeFieldType.dayOfMonth(), 5);
        bucket.saveField(DateTimeFieldType.dayOfYear(), 5);
        bucket.saveField(DateTimeFieldType.weekOfWeekyear(), 1);
        bucket.saveField(DateTimeFieldType.monthOfYear(), 1);
        bucket.saveField(DateTimeFieldType.year(), 2020);
        bucket.saveField(DateTimeFieldType.centuryOfEra(), 20);

        long computed = bucket.computeMillis(false);
        Assert.assertTrue(computed > 0L);
    }

    @Test
    public void computeMillis_givenSharedFieldsBeforeCompute_shouldCloneArray() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, ISOChronology.getInstanceUTC(), Locale.US);
        bucket.saveField(DateTimeFieldType.year(), 2018);
        Object state = bucket.saveState();

        bucket.saveField(DateTimeFieldType.monthOfYear(), 2);
        bucket.restoreState(state);

        long computed = bucket.computeMillis(false);
        long expected = ISOChronology.getInstanceUTC().year().set(0L, 2018);
        Assert.assertEquals(expected, computed);
    }

    @Test
    public void computeMillis_whenFirstFieldIsMonthOrDayWithoutYear_shouldUseDefaultYear() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        int defaultYear = 1999;
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, chrono, Locale.US, null, defaultYear);

        bucket.saveField(DateTimeFieldType.monthOfYear(), 4);
        bucket.saveField(DateTimeFieldType.dayOfMonth(), 12);

        long computed = bucket.computeMillis(false);
        long expected = chrono.year().set(0L, defaultYear);
        expected = chrono.monthOfYear().set(expected, 4);
        expected = chrono.dayOfMonth().set(expected, 12);

        Assert.assertEquals(expected, computed);
    }

    @Test
    public void computeMillis_withResetFieldsTrue_shouldRoundFloorFields() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        long initialMillis = 123456789L;
        DateTimeParserBucket bucket = new DateTimeParserBucket(initialMillis, chrono, Locale.US);

        bucket.saveField(DateTimeFieldType.year(), 2024);
        bucket.saveField(DateTimeFieldType.monthOfYear(), 2);

        long computedWithReset = bucket.computeMillis(true);
        long expected = chrono.year().set(0L, 2024);
        expected = chrono.monthOfYear().set(expected, 2);
        expected = chrono.monthOfYear().roundFloor(expected);

        Assert.assertEquals(expected, computedWithReset);
    }

    @Test
    public void computeMillis_convenienceOverloads_shouldInvokeComputeMillisCorrectly() {
        DateTimeParserBucket bucket1 = new DateTimeParserBucket(0L, ISOChronology.getInstanceUTC(), Locale.US);
        bucket1.saveField(DateTimeFieldType.year(), 2005);
        long m1 = bucket1.computeMillis();

        DateTimeParserBucket bucket2 = new DateTimeParserBucket(0L, ISOChronology.getInstanceUTC(), Locale.US);
        bucket2.saveField(DateTimeFieldType.year(), 2005);
        long m2 = bucket2.computeMillis(false);

        Assert.assertEquals(m1, m2);
    }

    // -------------------------------------------------------------------------
    // TimeZone & Offset Handling Tests
    // -------------------------------------------------------------------------

    @Test
    public void computeMillis_givenOffset_shouldSubtractOffset() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, ISOChronology.getInstanceUTC(), Locale.US);
        bucket.setOffset(1800000);
        bucket.saveField(DateTimeFieldType.year(), 1970);

        long computed = bucket.computeMillis(false);
        Assert.assertEquals(-1800000L, computed);
    }

    @Test
    public void computeMillis_givenZone_shouldApplyZoneOffset() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(5);
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, ISOChronology.getInstanceUTC(), Locale.US);
        bucket.setZone(zone);
        bucket.saveField(DateTimeFieldType.year(), 1970);

        long computed = bucket.computeMillis(false);
        Assert.assertEquals(-18000000L, computed);
    }

    @Test
    public void computeMillis_givenDstGapTransition_shouldThrowIllegalArgumentExceptionWithText() {
        DateTimeZone ny = DateTimeZone.forID("America/New_York");
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, ISOChronology.getInstance(ny), Locale.US);
        bucket.setZone(ny);

        bucket.saveField(DateTimeFieldType.year(), 2007);
        bucket.saveField(DateTimeFieldType.monthOfYear(), 3);
        bucket.saveField(DateTimeFieldType.dayOfMonth(), 11);
        bucket.saveField(DateTimeFieldType.hourOfDay(), 2);
        bucket.saveField(DateTimeFieldType.minuteOfHour(), 30);

        try {
            bucket.computeMillis(false, "2007-03-11 02:30");
            Assert.fail("Expected IllegalArgumentException on DST gap");
        } catch (IllegalArgumentException e) {
            String message = e.getMessage();
            Assert.assertTrue(message.indexOf("Cannot parse \"2007-03-11 02:30\"") != -1);
            Assert.assertTrue(message.indexOf("Illegal instant due to time zone offset transition") != -1);
        }
    }

    @Test
    public void computeMillis_givenDstGapTransitionWithoutText_shouldThrowIllegalArgumentException() {
        DateTimeZone ny = DateTimeZone.forID("America/New_York");
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, ISOChronology.getInstance(ny), Locale.US);
        bucket.setZone(ny);

        bucket.saveField(DateTimeFieldType.year(), 2007);
        bucket.saveField(DateTimeFieldType.monthOfYear(), 3);
        bucket.saveField(DateTimeFieldType.dayOfMonth(), 11);
        bucket.saveField(DateTimeFieldType.hourOfDay(), 2);
        bucket.saveField(DateTimeFieldType.minuteOfHour(), 30);

        try {
            bucket.computeMillis(false, null);
            Assert.fail("Expected IllegalArgumentException on DST gap");
        } catch (IllegalArgumentException e) {
            String message = e.getMessage();
            Assert.assertTrue(message.indexOf("Cannot parse") == -1);
            Assert.assertTrue(message.indexOf("Illegal instant due to time zone offset transition") != -1);
        }
    }

    // -------------------------------------------------------------------------
    // Error & IllegalFieldValueException Tests
    // -------------------------------------------------------------------------

    @Test
    public void computeMillis_givenInvalidFieldValueWithText_shouldPrependTextMessage() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, ISOChronology.getInstanceUTC(), Locale.US);
        bucket.saveField(DateTimeFieldType.dayOfMonth(), 32);

        try {
            bucket.computeMillis(false, "invalid-day-32");
            Assert.fail("Expected IllegalFieldValueException");
        } catch (IllegalFieldValueException e) {
            String message = e.getMessage();
            Assert.assertTrue(message.indexOf("Cannot parse \"invalid-day-32\"") != -1);
        }
    }

    @Test
    public void computeMillis_givenInvalidFieldValueWithoutText_shouldNotPrependTextMessage() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, ISOChronology.getInstanceUTC(), Locale.US);
        bucket.saveField(DateTimeFieldType.dayOfMonth(), 32);

        try {
            bucket.computeMillis(false, null);
            Assert.fail("Expected IllegalFieldValueException");
        } catch (IllegalFieldValueException e) {
            String message = e.getMessage();
            Assert.assertTrue(message.indexOf("Cannot parse") == -1);
        }
    }

    // -------------------------------------------------------------------------
    // compareReverse Boundary Tests
    // -------------------------------------------------------------------------

    @Test
    public void compareReverse_givenVariousDurationFields_shouldCoverAllBranches() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        DurationField days = chrono.days();
        DurationField months = chrono.months();
        DurationField unsupported = UnsupportedDurationField.getInstance(DurationFieldType.eras());

        Assert.assertEquals(0, DateTimeParserBucket.compareReverse(null, null));
        Assert.assertEquals(0, DateTimeParserBucket.compareReverse(unsupported, null));
        Assert.assertEquals(0, DateTimeParserBucket.compareReverse(null, unsupported));
        Assert.assertEquals(0, DateTimeParserBucket.compareReverse(unsupported, unsupported));

        Assert.assertEquals(-1, DateTimeParserBucket.compareReverse(null, days));
        Assert.assertEquals(-1, DateTimeParserBucket.compareReverse(unsupported, days));

        Assert.assertEquals(1, DateTimeParserBucket.compareReverse(days, null));
        Assert.assertEquals(1, DateTimeParserBucket.compareReverse(days, unsupported));

        int standardComparison = -days.compareTo(months);
        Assert.assertEquals(standardComparison, DateTimeParserBucket.compareReverse(days, months));
    }

    @Test
    public void savedField_compareToEqualRangeDurationFields_shouldCompareDurationFields() {
        Chronology chrono = GJChronology.getInstanceUTC();
        DateTimeField dayOfWeek = chrono.dayOfWeek();
        DateTimeField dayOfMonth = chrono.dayOfMonth();

        DateTimeParserBucket.SavedField sf1 = new DateTimeParserBucket.SavedField(dayOfWeek, 1);
        DateTimeParserBucket.SavedField sf2 = new DateTimeParserBucket.SavedField(dayOfMonth, 1);

        int result = sf1.compareTo(sf2);
        Assert.assertEquals(0, result);
    }
}