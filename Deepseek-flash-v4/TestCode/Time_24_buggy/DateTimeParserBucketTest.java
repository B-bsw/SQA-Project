package org.joda.time.format;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.IllegalFieldValueException;
import java.util.Locale;

public class DateTimeParserBucketTest {

    private static final Chronology ISO = ISOChronology.getInstanceUTC();
    private static final Chronology BUDDHIST = BuddhistChronology.getInstanceUTC();
    private static final Locale ENGLISH = Locale.ENGLISH;
    private static final int DEFAULT_YEAR = 2000;
    private static final long INSTANT = 1000L;

    private DateTimeParserBucket bucket;

    @Before
    public void setUp() {
        bucket = new DateTimeParserBucket(INSTANT, ISO, ENGLISH, 2000, DEFAULT_YEAR);
    }

    @Test
    public void testConstructor_withNullChronology_usesDefault() {
        DateTimeParserBucket b = new DateTimeParserBucket(INSTANT, null, null, null, DEFAULT_YEAR);
        assertNotNull(b.getChronology());
        assertNotNull(b.getLocale());
        assertNotNull(b.getZone());
        assertEquals(0, b.getOffset());
        assertNull(b.getPivotYear());
    }

    @Test
    public void testConstructor_setsAllFields() {
        assertEquals(ISO, bucket.getChronology());
        assertEquals(ENGLISH, bucket.getLocale());
        assertNotNull(bucket.getZone());
        assertEquals(0, bucket.getOffset());
        assertEquals(Integer.valueOf(2000), bucket.getPivotYear());
    }

    @Test
    public void testGetChronology_returnsUtcChronology() {
        assertEquals(ISO.withUTC(), bucket.getChronology());
    }

    @Test
    public void testGetLocale_returnsOriginalLocale() {
        assertEquals(ENGLISH, bucket.getLocale());
    }

    @Test
    public void testSetZone_null_setsOffsetToZeroAndZoneToNull() {
        bucket.setZone(null);
        assertNull(bucket.getZone());
        assertEquals(0, bucket.getOffset());
    }

    @Test
    public void testSetZone_utc_setsZoneToNullAndOffsetZero() {
        bucket.setZone(DateTimeZone.UTC);
        assertNull(bucket.getZone());
        assertEquals(0, bucket.getOffset());
    }

    @Test
    public void testSetZone_specificZone_overridesOffset() {
        bucket.setOffset(5000);
        bucket.setZone(DateTimeZone.forID("Europe/London"));
        assertNotNull(bucket.getZone());
        assertEquals(0, bucket.getOffset());
    }

    @Test
    public void testSetOffset_setsOffsetAndNullsZone() {
        bucket.setOffset(1234);
        assertEquals(1234, bucket.getOffset());
        assertNull(bucket.getZone());
    }

    @Test
    public void testSetOffset_zero_overridesZone() {
        bucket.setZone(DateTimeZone.forID("Asia/Tokyo"));
        bucket.setOffset(0);
        assertEquals(0, bucket.getOffset());
        assertNull(bucket.getZone());
    }

    @Test
    public void testGetPivotYear_returnsSetValue() {
        assertEquals(Integer.valueOf(2000), bucket.getPivotYear());
    }

    @Test
    public void testSetPivotYear_null_changesStoredValue() {
        bucket.setPivotYear(null);
        assertNull(bucket.getPivotYear());
    }

    @Test
    public void testSetPivotYear_nonNull_changesStoredValue() {
        bucket.setPivotYear(1995);
        assertEquals(Integer.valueOf(1995), bucket.getPivotYear());
    }

    @Test
    public void testSaveState_returnsNonNullSavedState() {
        Object state = bucket.saveState();
        assertNotNull(state);
        assertTrue(state instanceof DateTimeParserBucket.SavedState);
    }

    @Test
    public void testSaveState_sameStateReturnedIfAlreadySaved() {
        Object state1 = bucket.saveState();
        Object state2 = bucket.saveState();
        assertSame(state1, state2);
    }

    @Test
    public void testRestoreState_withInvalidObject_returnsFalse() {
        assertFalse(bucket.restoreState(new Object()));
    }

    @Test
    public void testRestoreState_withNull_returnsFalse() {
        assertFalse(bucket.restoreState(null));
    }

    @Test
    public void testRestoreState_withSavedStateFromOtherBucket_returnsFalse() {
        DateTimeParserBucket other = new DateTimeParserBucket(INSTANT, ISO, ENGLISH);
        Object state = other.saveState();
        assertFalse(bucket.restoreState(state));
    }

    @Test
    public void testRestoreState_restoresModifiedState() {
        Object state = bucket.saveState();
        bucket.saveField(DateTimeFieldType.dayOfMonth(), 5);
        bucket.saveField(DateTimeFieldType.monthOfYear(), 6);
        bucket.saveState();
        bucket.saveField(DateTimeFieldType.year(), 2001);
        assertTrue(bucket.restoreState(state));
        assertEquals(1, bucket.iSavedFieldsCount);
    }

    @Test
    public void testSaveField_savesWithoutError() {
        bucket.saveField(DateTimeFieldType.year(), 2005);
        assertEquals(1, bucket.iSavedFieldsCount);
    }

    @Test
    public void testSaveField_withStringText() {
        bucket.saveField(DateTimeFieldType.monthOfYear(), "6", ENGLISH);
        assertEquals(1, bucket.iSavedFieldsCount);
    }

    @Test
    public void testSaveField_multipleExpandsArray() {
        for (int i = 0; i < 10; i++) {
            bucket.saveField(DateTimeFieldType.dayOfMonth(), i + 1);
        }
        assertEquals(10, bucket.iSavedFieldsCount);
        assertFalse(bucket.iSavedFieldsShared);
    }

    @Test
    public void testSaveField_sharedArrayCopiesWhenNeeded() {
        bucket.saveState();
        bucket.saveField(DateTimeFieldType.dayOfMonth(), 1);
        assertEquals(1, bucket.iSavedFieldsCount);
        assertEquals(8, bucket.iSavedFields.length);
    }

    @Test
    public void testSort_insertionSortKeepsOrder() {
        DateTimeFieldType[] types = {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth()};
        bucket.saveField(types[0], 2005);
        bucket.saveField(types[1], 6);
        bucket.saveField(types[2], 15);
        DateTimeParserBucket.SavedField[] fields = new DateTimeParserBucket.SavedField[bucket.iSavedFieldsCount];
        System.arraycopy(bucket.iSavedFields, 0, fields, 0, bucket.iSavedFieldsCount);
        DateTimeParserBucket.sort(fields, fields.length);
        assertTrue(fields[0].compareTo(fields[1]) <= 0);
        assertTrue(fields[1].compareTo(fields[2]) <= 0);
    }

    @Test
    public void testSort_withHighLessThanEqual10_usesInsertionSort() {
        DateTimeParserBucket.SavedField[] array = new DateTimeParserBucket.SavedField[3];
        array[0] = new DateTimeParserBucket.SavedField(DateTimeFieldType.dayOfMonth().getField(ISO), 3);
        array[1] = new DateTimeParserBucket.SavedField(DateTimeFieldType.monthOfYear().getField(ISO), 1);
        array[2] = new DateTimeParserBucket.SavedField(DateTimeFieldType.year().getField(ISO), 2);
        DateTimeParserBucket.sort(array, array.length);
        assertEquals(1, array[0].iValue);
        assertEquals(2, array[1].iValue);
        assertEquals(3, array[2].iValue);
    }

    @Test
    public void testSort_withHighGreaterThan10_usesArraysSort() {
        DateTimeParserBucket.SavedField[] array = new DateTimeParserBucket.SavedField[12];
        for (int i = 0; i < 12; i++) {
            array[i] = new DateTimeParserBucket.SavedField(DateTimeFieldType.dayOfMonth().getField(ISO), 12 - i);
        }
        DateTimeParserBucket.sort(array, array.length);
        for (int i = 0; i < array.length - 1; i++) {
            assertTrue(array[i].compareTo(array[i + 1]) <= 0);
        }
    }

    @Test
    public void testComputeMillis_withNoFields_returnsInitialMillis() {
        assertEquals(INSTANT, bucket.computeMillis());
    }

    @Test
    public void testComputeMillis_withResetFieldsFalse_returnsFieldValues() {
        bucket.saveField(DateTimeFieldType.dayOfMonth(), 15);
        bucket.saveField(DateTimeFieldType.monthOfYear(), 6);
        long millis = bucket.computeMillis(false);
        assertEquals(15, bucket.getChronology().dayOfMonth().get(millis));
        assertEquals(6, bucket.getChronology().monthOfYear().get(millis));
    }

    @Test
    public void testComputeMillis_withResetFieldsTrue() {
        bucket.saveField(DateTimeFieldType.dayOfMonth(), 10);
        bucket.saveField(DateTimeFieldType.monthOfYear(), 3);
        long millis = bucket.computeMillis(true);
        assertEquals(10, bucket.getChronology().dayOfMonth().get(millis));
        assertEquals(3, bucket.getChronology().monthOfYear().get(millis));
    }

    @Test
    public void testComputeMillis_withTextAndInvalidField_throwsWithMessage() {
        bucket.saveField(DateTimeFieldType.monthOfYear(), 13);
        try {
            bucket.computeMillis(false, "invalid");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Cannot parse \"invalid\""));
        }
    }

    @Test
    public void testComputeMillis_zoneOffsetAppliedWhenZoneNull() {
        bucket.setOffset(60 * 60 * 1000);
        bucket.saveField(DateTimeFieldType.dayOfMonth(), 1);
        bucket.saveField(DateTimeFieldType.monthOfYear(), 1);
        bucket.saveField(DateTimeFieldType.year(), 2000);
        long millis = bucket.computeMillis(false);
        assertEquals(0, millis);
    }

    @Test
    public void testComputeMillis_illegalZoneTransitionThrows() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        bucket.setZone(zone);
        bucket.saveField(DateTimeFieldType.year(), 2015);
        bucket.saveField(DateTimeFieldType.monthOfYear(), 3);
        bucket.saveField(DateTimeFieldType.dayOfMonth(), 8);
        bucket.saveField(DateTimeFieldType.hourOfDay(), 2);
        try {
            bucket.computeMillis(false, "transition");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Cannot parse \"transition\""));
        }
    }

    @Test
    public void testComputeMillis_noZoneOrOffset() {
        bucket.setZone(null);
        bucket.setOffset(0);
        bucket.saveField(DateTimeFieldType.year(), 2000);
        bucket.saveField(DateTimeFieldType.monthOfYear(), 1);
        bucket.saveField(DateTimeFieldType.dayOfMonth(), 1);
        long millis = bucket.computeMillis(false);
        assertEquals(946684800000L, millis);
    }

    @Test
    public void testComputeMillis_withPivotYearAndTwoDigitYear() {
        bucket.setPivotYear(1950);
        bucket.saveField(DateTimeFieldType.year(), 20);
        bucket.saveField(DateTimeFieldType.monthOfYear(), 1);
        bucket.saveField(DateTimeFieldType.dayOfMonth(), 1);
        long millis = bucket.computeMillis(false);
        assertEquals(2020, bucket.getChronology().year().get(millis));
    }

    @Test
    public void testComputeMillis_defaultYearUsedWhenOnlyMonthDay() {
        bucket.saveField(DateTimeFieldType.monthOfYear(), 6);
        bucket.saveField(DateTimeFieldType.dayOfMonth(), 15);
        long millis = bucket.computeMillis(false);
        assertEquals(DEFAULT_YEAR, bucket.getChronology().year().get(millis));
    }

    @Test
    public void testComputeMillis_savedFieldTextValue() {
        bucket.saveField(DateTimeFieldType.monthOfYear(), "7", Locale.ENGLISH);
        long millis = bucket.computeMillis(false);
        assertEquals(7, bucket.getChronology().monthOfYear().get(millis));
    }

    @Test
    public void testComputeMillis_resetFieldsClearsUnused() {
        bucket.saveField(DateTimeFieldType.year(), 2001);
        bucket.saveField(DateTimeFieldType.dayOfMonth(), 2);
        long millis = bucket.computeMillis(true);
        assertEquals(2001, bucket.getChronology().year().get(millis));
        long next = bucket.computeMillis(true);
        assertEquals(2001, bucket.getChronology().year().get(next));
    }

    @Test
    public void testSaveStateAndRestoreState_nestedRestore() {
        Object state1 = bucket.saveState();
        bucket.saveField(DateTimeFieldType.year(), 2001);
        Object state2 = bucket.saveState();
        bucket.saveField(DateTimeFieldType.monthOfYear(), 1);
        assertTrue(bucket.restoreState(state2));
        assertEquals(1, bucket.iSavedFieldsCount);
        assertTrue(bucket.restoreState(state1));
        assertEquals(0, bucket.iSavedFieldsCount);
    }

    @Test
    public void testSaveState_afterSaveFieldCreatesNewSavedState() {
        bucket.saveField(DateTimeFieldType.year(), 2000);
        Object state = bucket.saveState();
        bucket.saveField(DateTimeFieldType.dayOfMonth(), 1);
        assertTrue(bucket.restoreState(state));
        assertEquals(1, bucket.iSavedFieldsCount);
    }

    @Test
    public void testSaveField_sameFieldReplacesValue() {
        bucket.saveField(DateTimeFieldType.year(), 2001);
        bucket.saveField(DateTimeFieldType.year(), 2002);
        long millis = bucket.computeMillis(false);
        assertEquals(2002, bucket.getChronology().year().get(millis));
    }

    @Test
    public void testComputeMillis_multipleFieldsSortedByDuration() {
        bucket.saveField(DateTimeFieldType.dayOfMonth(), 15);
        bucket.saveField(DateTimeFieldType.monthOfYear(), 7);
        bucket.saveField(DateTimeFieldType.year(), 2020);
        long millis = bucket.computeMillis(false);
        assertEquals(2020, bucket.getChronology().year().get(millis));
        assertEquals(7, bucket.getChronology().monthOfYear().get(millis));
        assertEquals(15, bucket.getChronology().dayOfMonth().get(millis));
    }

    @Test
    public void testComputeMillis_withTextLengthZero() {
        bucket.saveField(DateTimeFieldType.monthOfYear(), 5);
        long millis = bucket.computeMillis(false, "");
        assertEquals(5, bucket.getChronology().monthOfYear().get(millis));
    }

    @Test
    public void testComputeMillis_withPivotYearNull() {
        bucket.setPivotYear(null);
        bucket.saveField(DateTimeFieldType.year(), 10);
        long millis = bucket.computeMillis(false);
        assertEquals(10, bucket.getChronology().year().get(millis));
    }
}