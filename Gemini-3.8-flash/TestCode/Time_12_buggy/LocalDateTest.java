package org.joda.time;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LocalDateTest {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone NEW_YORK = DateTimeZone.forID("America/New_York");

    private long testCurrentMillis;

    @Before
    public void setUp() throws Exception {
        DateTimeUtils.setCurrentMillisFixed(1577836800000L); // 2020-01-01T00:00:00Z
        testCurrentMillis = DateTimeUtils.currentTimeMillis();
    }

    @After
    public void tearDown() throws Exception {
        DateTimeUtils.setCurrentMillisSystem();
    }

    // =========================================================================
    // Static Factories
    // =========================================================================

    @Test
    public void now_default_shouldReturnCurrentDate() {
        LocalDate date = LocalDate.now();
        Assert.assertNotNull(date);
        Assert.assertEquals(2020, date.getYear());
        Assert.assertEquals(1, date.getMonthOfYear());
        Assert.assertEquals(1, date.getDayOfMonth());
    }

    @Test
    public void now_givenValidZone_shouldReturnCurrentDateInZone() {
        LocalDate date = LocalDate.now(PARIS);
        Assert.assertNotNull(date);
        Assert.assertEquals(ISOChronology.getInstanceUTC(), date.getChronology());
    }

    @Test(expected = NullPointerException.class)
    public void now_givenNullZone_shouldThrowNullPointerException() {
        LocalDate.now((DateTimeZone) null);
    }

    @Test
    public void now_givenValidChronology_shouldReturnCurrentDateInChronology() {
        LocalDate date = LocalDate.now(CopticChronology.getInstance(LONDON));
        Assert.assertNotNull(date);
        Assert.assertEquals(CopticChronology.getInstanceUTC(), date.getChronology());
    }

    @Test(expected = NullPointerException.class)
    public void now_givenNullChronology_shouldThrowNullPointerException() {
        LocalDate.now((Chronology) null);
    }

    @Test
    public void parse_givenValidString_shouldParseIsoFormat() {
        LocalDate parsed = LocalDate.parse("2021-05-18");
        Assert.assertEquals(2021, parsed.getYear());
        Assert.assertEquals(5, parsed.getMonthOfYear());
        Assert.assertEquals(18, parsed.getDayOfMonth());
    }

    @Test
    public void parse_givenValidStringAndCustomFormatter_shouldParseCorrectly() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("dd/MM/yyyy");
        LocalDate parsed = LocalDate.parse("18/05/2021", formatter);
        Assert.assertEquals(2021, parsed.getYear());
        Assert.assertEquals(5, parsed.getMonthOfYear());
        Assert.assertEquals(18, parsed.getDayOfMonth());
    }

    @Test
    public void fromCalendarFields_givenCalendar_shouldExtractDateFields() {
        Calendar cal = new GregorianCalendar(2022, Calendar.FEBRUARY, 15, 10, 30, 45);
        LocalDate date = LocalDate.fromCalendarFields(cal);
        Assert.assertEquals(2022, date.getYear());
        Assert.assertEquals(2, date.getMonthOfYear());
        Assert.assertEquals(15, date.getDayOfMonth());
    }

    @Test(expected = IllegalArgumentException.class)
    public void fromCalendarFields_givenNullCalendar_shouldThrowIllegalArgumentException() {
        LocalDate.fromCalendarFields(null);
    }

    @Test
    public void fromDateFields_givenDate_shouldExtractDateFields() {
        Calendar cal = Calendar.getInstance();
        cal.set(2019, Calendar.OCTOBER, 31, 23, 59, 59);
        Date d = cal.getTime();
        LocalDate date = LocalDate.fromDateFields(d);
        Assert.assertEquals(2019, date.getYear());
        Assert.assertEquals(10, date.getMonthOfYear());
        Assert.assertEquals(31, date.getDayOfMonth());
    }

    @Test(expected = IllegalArgumentException.class)
    public void fromDateFields_givenNullDate_shouldThrowIllegalArgumentException() {
        LocalDate.fromDateFields(null);
    }

    // =========================================================================
    // Constructors
    // =========================================================================

    @Test
    public void constructor_noArg_shouldUseCurrentMillisAndISO() {
        LocalDate date = new LocalDate();
        Assert.assertEquals(2020, date.getYear());
        Assert.assertEquals(1, date.getMonthOfYear());
        Assert.assertEquals(1, date.getDayOfMonth());
        Assert.assertEquals(ISOChronology.getInstanceUTC(), date.getChronology());
    }

    @Test
    public void constructor_givenZone_shouldUseZoneChronologyConvertedToUtc() {
        LocalDate date = new LocalDate(PARIS);
        Assert.assertEquals(ISOChronology.getInstanceUTC(), date.getChronology());
    }

    @Test
    public void constructor_givenNullZone_shouldUseDefaultZone() {
        LocalDate date = new LocalDate((DateTimeZone) null);
        Assert.assertEquals(ISOChronology.getInstanceUTC(), date.getChronology());
    }

    @Test
    public void constructor_givenChronology_shouldUseSpecifiedChronology() {
        LocalDate date = new LocalDate(CopticChronology.getInstance());
        Assert.assertEquals(CopticChronology.getInstanceUTC(), date.getChronology());
    }

    @Test
    public void constructor_givenNullChronology_shouldUseISO() {
        LocalDate date = new LocalDate((Chronology) null);
        Assert.assertEquals(ISOChronology.getInstanceUTC(), date.getChronology());
    }

    @Test
    public void constructor_givenMillis_shouldCalculateDateFields() {
        LocalDate date = new LocalDate(testCurrentMillis);
        Assert.assertEquals(2020, date.getYear());
        Assert.assertEquals(1, date.getMonthOfYear());
        Assert.assertEquals(1, date.getDayOfMonth());
    }

    @Test
    public void constructor_givenMillisAndZone_shouldCalculateDateFields() {
        LocalDate date = new LocalDate(testCurrentMillis, PARIS);
        Assert.assertEquals(ISOChronology.getInstanceUTC(), date.getChronology());
    }

    @Test
    public void constructor_givenMillisAndNullZone_shouldUseDefaultZone() {
        LocalDate date = new LocalDate(testCurrentMillis, (DateTimeZone) null);
        Assert.assertEquals(ISOChronology.getInstanceUTC(), date.getChronology());
    }

    @Test
    public void constructor_givenMillisAndChronology_shouldCalculateDateFields() {
        LocalDate date = new LocalDate(testCurrentMillis, CopticChronology.getInstanceUTC());
        Assert.assertEquals(CopticChronology.getInstanceUTC(), date.getChronology());
    }

    @Test
    public void constructor_givenObjectString_shouldParseIso() {
        LocalDate date = new LocalDate("2023-04-12");
        Assert.assertEquals(2023, date.getYear());
        Assert.assertEquals(4, date.getMonthOfYear());
        Assert.assertEquals(12, date.getDayOfMonth());
    }

    @Test
    public void constructor_givenObjectAndZone_shouldApplyZone() {
        LocalDate date = new LocalDate("2023-04-12", PARIS);
        Assert.assertEquals(2023, date.getYear());
        Assert.assertEquals(4, date.getMonthOfYear());
        Assert.assertEquals(12, date.getDayOfMonth());
    }

    @Test
    public void constructor_givenObjectAndChronology_shouldApplyChronology() {
        LocalDate date = new LocalDate("2023-04-12", ISOChronology.getInstance());
        Assert.assertEquals(2023, date.getYear());
        Assert.assertEquals(4, date.getMonthOfYear());
        Assert.assertEquals(12, date.getDayOfMonth());
        Assert.assertEquals(ISOChronology.getInstanceUTC(), date.getChronology());
    }

    @Test
    public void constructor_givenYearMonthDay_shouldCreateExactDate() {
        LocalDate date = new LocalDate(2024, 6, 25);
        Assert.assertEquals(2024, date.getYear());
        Assert.assertEquals(6, date.getMonthOfYear());
        Assert.assertEquals(25, date.getDayOfMonth());
        Assert.assertEquals(ISOChronology.getInstanceUTC(), date.getChronology());
    }

    @Test
    public void constructor_givenYearMonthDayAndChronology_shouldCreateExactDate() {
        LocalDate date = new LocalDate(1736, 10, 5, CopticChronology.getInstanceUTC());
        Assert.assertEquals(1736, date.getYear());
        Assert.assertEquals(10, date.getMonthOfYear());
        Assert.assertEquals(5, date.getDayOfMonth());
        Assert.assertEquals(CopticChronology.getInstanceUTC(), date.getChronology());
    }

    @Test
    public void constructor_givenYearMonthDayAndNullChronology_shouldUseISOUTC() {
        LocalDate date = new LocalDate(2024, 6, 25, null);
        Assert.assertEquals(2024, date.getYear());
        Assert.assertEquals(6, date.getMonthOfYear());
        Assert.assertEquals(25, date.getDayOfMonth());
        Assert.assertEquals(ISOChronology.getInstanceUTC(), date.getChronology());
    }

    // =========================================================================
    // Size, Index, GetField, GetValue
    // =========================================================================

    @Test
    public void size_always_shouldReturnThree() {
        LocalDate date = new LocalDate(2021, 3, 10);
        Assert.assertEquals(3, date.size());
    }

    @Test
    public void getField_givenValidIndices_shouldReturnCorrespondingField() {
        LocalDate date = new LocalDate(2021, 3, 10);
        Chronology chrono = ISOChronology.getInstanceUTC();
        Assert.assertEquals(chrono.year(), date.getField(0, chrono));
        Assert.assertEquals(chrono.monthOfYear(), date.getField(1, chrono));
        Assert.assertEquals(chrono.dayOfMonth(), date.getField(2, chrono));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getField_givenNegativeIndex_shouldThrowIndexOutOfBoundsException() {
        LocalDate date = new LocalDate(2021, 3, 10);
        date.getField(-1, ISOChronology.getInstanceUTC());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getField_givenTooLargeIndex_shouldThrowIndexOutOfBoundsException() {
        LocalDate date = new LocalDate(2021, 3, 10);
        date.getField(3, ISOChronology.getInstanceUTC());
    }

    @Test
    public void getValue_givenValidIndices_shouldReturnCorrectValues() {
        LocalDate date = new LocalDate(2021, 3, 10);
        Assert.assertEquals(2021, date.getValue(0));
        Assert.assertEquals(3, date.getValue(1));
        Assert.assertEquals(10, date.getValue(2));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getValue_givenNegativeIndex_shouldThrowIndexOutOfBoundsException() {
        LocalDate date = new LocalDate(2021, 3, 10);
        date.getValue(-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getValue_givenTooLargeIndex_shouldThrowIndexOutOfBoundsException() {
        LocalDate date = new LocalDate(2021, 3, 10);
        date.getValue(3);
    }

    // =========================================================================
    // get(DateTimeFieldType) and isSupported
    // =========================================================================

    @Test
    public void get_givenSupportedFieldType_shouldReturnValue() {
        LocalDate date = new LocalDate(2021, 3, 10);
        Assert.assertEquals(2021, date.get(DateTimeFieldType.year()));
        Assert.assertEquals(3, date.get(DateTimeFieldType.monthOfYear()));
        Assert.assertEquals(10, date.get(DateTimeFieldType.dayOfMonth()));
        Assert.assertEquals(3, date.get(DateTimeFieldType.dayOfWeek()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void get_givenNullFieldType_shouldThrowIllegalArgumentException() {
        LocalDate date = new LocalDate(2021, 3, 10);
        date.get(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void get_givenUnsupportedFieldType_shouldThrowIllegalArgumentException() {
        LocalDate date = new LocalDate(2021, 3, 10);
        date.get(DateTimeFieldType.hourOfDay());
    }

    @Test
    public void isSupported_givenDateTimeFieldType_shouldCheckCorrectly() {
        LocalDate date = new LocalDate(2021, 3, 10);
        Assert.assertFalse(date.isSupported((DateTimeFieldType) null));
        Assert.assertTrue(date.isSupported(DateTimeFieldType.year()));
        Assert.assertTrue(date.isSupported(DateTimeFieldType.monthOfYear()));
        Assert.assertTrue(date.isSupported(DateTimeFieldType.dayOfMonth()));
        Assert.assertTrue(date.isSupported(DateTimeFieldType.dayOfWeek()));
        Assert.assertTrue(date.isSupported(DateTimeFieldType.dayOfYear()));
        Assert.assertTrue(date.isSupported(DateTimeFieldType.weekOfWeekyear()));
        Assert.assertTrue(date.isSupported(DateTimeFieldType.weekyear()));
        Assert.assertTrue(date.isSupported(DateTimeFieldType.centuryOfEra()));
        Assert.assertTrue(date.isSupported(DateTimeFieldType.era()));
        Assert.assertFalse(date.isSupported(DateTimeFieldType.hourOfDay()));
        Assert.assertFalse(date.isSupported(DateTimeFieldType.minuteOfHour()));
        Assert.assertFalse(date.isSupported(DateTimeFieldType.secondOfMinute()));
        Assert.assertFalse(date.isSupported(DateTimeFieldType.millisOfSecond()));
    }

    @Test
    public void isSupported_givenDurationFieldType_shouldCheckCorrectly() {
        LocalDate date = new LocalDate(2021, 3, 10);
        Assert.assertFalse(date.isSupported((DurationFieldType) null));
        Assert.assertTrue(date.isSupported(DurationFieldType.days()));
        Assert.assertTrue(date.isSupported(DurationFieldType.weeks()));
        Assert.assertTrue(date.isSupported(DurationFieldType.months()));
        Assert.assertTrue(date.isSupported(DurationFieldType.weekyears()));
        Assert.assertTrue(date.isSupported(DurationFieldType.years()));
        Assert.assertTrue(date.isSupported(DurationFieldType.centuries()));
        Assert.assertTrue(date.isSupported(DurationFieldType.eras()));
        Assert.assertFalse(date.isSupported(DurationFieldType.hours()));
        Assert.assertFalse(date.isSupported(DurationFieldType.minutes()));
        Assert.assertFalse(date.isSupported(DurationFieldType.seconds()));
        Assert.assertFalse(date.isSupported(DurationFieldType.millis()));
    }

    // =========================================================================
    // equals, hashCode, compareTo
    // =========================================================================

    @Test
    public void equals_shouldHandleSameInstanceEqualValuesAndDifferences() {
        LocalDate date1 = new LocalDate(2021, 3, 10);
        LocalDate date2 = new LocalDate(2021, 3, 10);
        LocalDate dateDifferentDay = new LocalDate(2021, 3, 11);
        LocalDate dateDifferentChrono = new LocalDate(2021, 3, 10, GJChronology.getInstanceUTC());

        Assert.assertTrue(date1.equals(date1));
        Assert.assertTrue(date1.equals(date2));
        Assert.assertFalse(date1.equals(dateDifferentDay));
        Assert.assertFalse(date1.equals(dateDifferentChrono));
        Assert.assertFalse(date1.equals(null));
        Assert.assertFalse(date1.equals("NotALocalDate"));
    }

    @Test
    public void hashCode_shouldBeConsistentAndMatchEqualInstances() {
        LocalDate date1 = new LocalDate(2021, 3, 10);
        LocalDate date2 = new LocalDate(2021, 3, 10);
        Assert.assertEquals(date1.hashCode(), date2.hashCode());
        Assert.assertEquals(date1.hashCode(), date1.hashCode());
    }

    @Test
    public void compareTo_shouldOrderDatesChronologically() {
        LocalDate early = new LocalDate(2021, 3, 9);
        LocalDate middle = new LocalDate(2021, 3, 10);
        LocalDate middleCopy = new LocalDate(2021, 3, 10);
        LocalDate late = new LocalDate(2021, 3, 11);

        Assert.assertEquals(0, middle.compareTo(middle));
        Assert.assertEquals(0, middle.compareTo(middleCopy));
        Assert.assertTrue(middle.compareTo(early) > 0);
        Assert.assertTrue(middle.compareTo(late) < 0);
    }

    @Test
    public void compareTo_givenDifferentReadablePartial_shouldFallBackToSuper() {
        LocalDate date = new LocalDate(2021, 3, 10);
        YearMonth ym = new YearMonth(2021, 3);
        try {
            date.compareTo(ym);
        } catch (ClassCastException ex) {
            // Expected when fields do not match ReadablePartial types
            Assert.assertNotNull(ex);
        }
    }

    // =========================================================================
    // Conversions: toDateTime*, toInterval, toDate, toLocalDateTime
    // =========================================================================

    @Test
    public void toDateTimeAtStartOfDay_noZoneAndWithZone_shouldResolveToMidnightStart() {
        LocalDate date = new LocalDate(2021, 3, 10);
        DateTime dtDefault = date.toDateTimeAtStartOfDay();
        Assert.assertNotNull(dtDefault);

        DateTime dtLondon = date.toDateTimeAtStartOfDay(LONDON);
        Assert.assertEquals(2021, dtLondon.getYear());
        Assert.assertEquals(3, dtLondon.getMonthOfYear());
        Assert.assertEquals(10, dtLondon.getDayOfMonth());
        Assert.assertEquals(0, dtLondon.getHourOfDay());
        Assert.assertEquals(0, dtLondon.getMinuteOfHour());
    }

    @Test
    @SuppressWarnings("deprecation")
    public void toDateTimeAtMidnight_noZoneAndWithZone_shouldResolveToMidnight() {
        LocalDate date = new LocalDate(2021, 3, 10);
        DateTime dtDefault = date.toDateTimeAtMidnight();
        Assert.assertNotNull(dtDefault);

        DateTime dtParis = date.toDateTimeAtMidnight(PARIS);
        Assert.assertEquals(2021, dtParis.getYear());
        Assert.assertEquals(3, dtParis.getMonthOfYear());
        Assert.assertEquals(10, dtParis.getDayOfMonth());
        Assert.assertEquals(0, dtParis.getHourOfDay());
    }

    @Test
    public void toDateTimeAtCurrentTime_noZoneAndWithZone_shouldKeepCurrentTimeParts() {
        LocalDate date = new LocalDate(2021, 3, 10);
        DateTime dtDefault = date.toDateTimeAtCurrentTime();
        Assert.assertEquals(2021, dtDefault.getYear());
        Assert.assertEquals(3, dtDefault.getMonthOfYear());
        Assert.assertEquals(10, dtDefault.getDayOfMonth());

        DateTime dtNy = date.toDateTimeAtCurrentTime(NEW_YORK);
        Assert.assertEquals(2021, dtNy.getYear());
        Assert.assertEquals(3, dtNy.getMonthOfYear());
        Assert.assertEquals(10, dtNy.getDayOfMonth());
    }

    @Test
    @SuppressWarnings("deprecation")
    public void toDateMidnight_noZoneAndWithZone_shouldReturnDateMidnight() {
        LocalDate date = new LocalDate(2021, 3, 10);
        DateMidnight dmDefault = date.toDateMidnight();
        Assert.assertEquals(2021, dmDefault.getYear());
        Assert.assertEquals(3, dmDefault.getMonthOfYear());
        Assert.assertEquals(10, dmDefault.getDayOfMonth());

        DateMidnight dmLondon = date.toDateMidnight(LONDON);
        Assert.assertEquals(2021, dmLondon.getYear());
        Assert.assertEquals(3, dmLondon.getMonthOfYear());
        Assert.assertEquals(10, dmLondon.getDayOfMonth());
    }

    @Test
    public void toLocalDateTime_givenValidLocalTime_shouldCombineCorrectly() {
        LocalDate date = new LocalDate(2021, 3, 10);
        LocalTime time = new LocalTime(14, 30, 45, 123);
        LocalDateTime ldt = date.toLocalDateTime(time);
        Assert.assertEquals(2021, ldt.getYear());
        Assert.assertEquals(3, ldt.getMonthOfYear());
        Assert.assertEquals(10, ldt.getDayOfMonth());
        Assert.assertEquals(14, ldt.getHourOfDay());
        Assert.assertEquals(30, ldt.getMinuteOfHour());
        Assert.assertEquals(45, ldt.getSecondOfMinute());
        Assert.assertEquals(123, ldt.getMillisOfSecond());
    }

    @Test(expected = IllegalArgumentException.class)
    public void toLocalDateTime_givenNullLocalTime_shouldThrowIllegalArgumentException() {
        LocalDate date = new LocalDate(2021, 3, 10);
        date.toLocalDateTime(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void toLocalDateTime_givenMismatchedChronology_shouldThrowIllegalArgumentException() {
        LocalDate date = new LocalDate(2021, 3, 10, ISOChronology.getInstanceUTC());
        LocalTime time = new LocalTime(14, 30, CopticChronology.getInstanceUTC());
        date.toLocalDateTime(time);
    }

    @Test
    public void toDateTime_givenLocalTimeAndZone_shouldCombineCorrectly() {
        LocalDate date = new LocalDate(2021, 3, 10);
        LocalTime time = new LocalTime(10, 15, 20);

        DateTime dt = date.toDateTime(time);
        Assert.assertEquals(2021, dt.getYear());
        Assert.assertEquals(3, dt.getMonthOfYear());
        Assert.assertEquals