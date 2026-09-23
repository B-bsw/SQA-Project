package org.joda.time;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class LocalDateTest {

    private LocalDate localDate;
    private static final DateTimeZone TEST_ZONE = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone PARIS_ZONE = DateTimeZone.forID("Europe/Paris");

    @Before
    public void setUp() {
        localDate = new LocalDate(2023, 6, 15, TEST_ZONE);
    }

    @After
    public void tearDown() {
        localDate = null;
    }

    @Test
    public void testNow() {
        LocalDate now = LocalDate.now();
        assertNotNull(now);
    }

    @Test
    public void testNowWithZone() {
        LocalDate now = LocalDate.now(TEST_ZONE);
        assertNotNull(now);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNowWithNullZone() {
        LocalDate.now((DateTimeZone) null);
    }

    @Test
    public void testNowWithChronology() {
        LocalDate now = LocalDate.now(ISOChronology.getInstanceUTC());
        assertNotNull(now);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNowWithNullChronology() {
        LocalDate.now((Chronology) null);
    }

    @Test
    public void testParse() {
        LocalDate parsed = LocalDate.parse("2023-06-15");
        assertEquals(2023, parsed.getYear());
        assertEquals(6, parsed.getMonthOfYear());
        assertEquals(15, parsed.getDayOfMonth());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseWithNullString() {
        LocalDate.parse(null);
    }

    @Test
    public void testParseWithFormatter() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("dd/MM/yyyy");
        LocalDate parsed = LocalDate.parse("15/06/2023", formatter);
        assertEquals(2023, parsed.getYear());
        assertEquals(6, parsed.getMonthOfYear());
        assertEquals(15, parsed.getDayOfMonth());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseWithNullFormatter() {
        LocalDate.parse("2023-06-15", null);
    }

    @Test
    public void testFromCalendarFields() {
        Calendar calendar = Calendar.getInstance(TEST_ZONE.toTimeZone());
        calendar.set(2023, Calendar.JUNE, 15);
        LocalDate date = LocalDate.fromCalendarFields(calendar);
        assertEquals(2023, date.getYear());
        assertEquals(6, date.getMonthOfYear());
        assertEquals(15, date.getDayOfMonth());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFromCalendarFieldsWithNull() {
        LocalDate.fromCalendarFields(null);
    }

    @Test
    public void testFromDateFields() {
        Date date = new Date(2023 - 1900, Calendar.JUNE, 15);
        LocalDate localDateFromDate = LocalDate.fromDateFields(date);
        assertEquals(2023, localDateFromDate.getYear());
        assertEquals(6, localDateFromDate.getMonthOfYear());
        assertEquals(15, localDateFromDate.getDayOfMonth());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFromDateFieldsWithNull() {
        LocalDate.fromDateFields(null);
    }

    @Test
    public void testDefaultConstructor() {
        LocalDate date = new LocalDate();
        assertNotNull(date);
    }

    @Test
    public void testConstructorWithZone() {
        LocalDate date = new LocalDate(TEST_ZONE);
        assertNotNull(date);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithNullZone() {
        new LocalDate((DateTimeZone) null);
    }

    @Test
    public void testConstructorWithChronology() {
        LocalDate date = new LocalDate(ISOChronology.getInstanceUTC());
        assertNotNull(date);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithNullChronology() {
        new LocalDate((Chronology) null);
    }

    @Test
    public void testConstructorWithLong() {
        LocalDate date = new LocalDate(1688332800000L);
        assertNotNull(date);
    }

    @Test
    public void testConstructorWithLongAndZone() {
        LocalDate date = new LocalDate(1688332800000L, TEST_ZONE);
        assertNotNull(date);
    }

    @Test
    public void testConstructorWithObject() {
        LocalDate date = new LocalDate(new java.sql.Date(1688332800000L));
        assertNotNull(date);
    }

    @Test
    public void testConstructorWithObjectAndZone() {
        LocalDate date = new LocalDate(new java.sql.Date(1688332800000L), TEST_ZONE);
        assertNotNull(date);
    }

    @Test
    public void testToLocalDateWithUTC() {
        LocalDate result = localDate.toLocalDate();
        assertEquals(localDate.getLocalMillis(), result.getLocalMillis());
    }

    @Test
    public void testToLocalDateWithNonUTCChronology() {
        LocalDate nonUTC = new LocalDate(2023, 6, 15, PARIS_ZONE);
        LocalDate result = nonUTC.toLocalDate();
        assertEquals(nonUTC, result);
    }

    @Test
    public void testSize() {
        assertEquals(3, localDate.size());
    }

    @Test
    public void testGetField() {
        assertEquals(DateTimeFieldType.year(), localDate.getField(0));
        assertEquals(DateTimeFieldType.monthOfYear(), localDate.getField(1));
        assertEquals(DateTimeFieldType.dayOfMonth(), localDate.getField(2));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetFieldWithInvalidIndex() {
        localDate.getField(5);
    }

    @Test
    public void testGetValueByIndex() {
        assertEquals(2023, localDate.getValue(0));
        assertEquals(6, localDate.getValue(1));
        assertEquals(15, localDate.getValue(2));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetValueWithInvalidIndex() {
        localDate.getValue(5);
    }

    @Test
    public void testGetByFieldType() {
        assertEquals(2023, localDate.get(DateTimeFieldType.year()));
        assertEquals(6, localDate.get(DateTimeFieldType.monthOfYear()));
        assertEquals(15, localDate.get(DateTimeFieldType.dayOfMonth()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetWithNullFieldType() {
        localDate.get((DateTimeFieldType) null);
    }

    @Test
    public void testGetWithUnsupportedFieldType() {
        assertEquals(0, localDate.get(DateTimeFieldType.hourOfDay()));
    }

    @Test
    public void testIsSupportedDateTimeFieldType() {
        assertTrue(localDate.isSupported(DateTimeFieldType.year()));
        assertTrue(localDate.isSupported(DateTimeFieldType.monthOfYear()));
        assertTrue(localDate.isSupported(DateTimeFieldType.dayOfMonth()));
        assertFalse(localDate.isSupported(DateTimeFieldType.hourOfDay()));
        assertFalse(localDate.isSupported((DateTimeFieldType) null));
    }

    @Test
    public void testIsSupportedDurationFieldType() {
        assertTrue(localDate.isSupported(DurationFieldType.days()));
        assertTrue(localDate.isSupported(DurationFieldType.months()));
        assertFalse(localDate.isSupported(DurationFieldType.hours()));
        assertFalse(localDate.isSupported((DurationFieldType) null));
    }

    @Test
    public void testGetLocalMillis() {
        long expectedMillis = ISOChronology.getInstanceUTC().getDateTimeMillis(2023, 6, 15, 0);
        assertEquals(expectedMillis, localDate.getLocalMillis());
    }

    @Test
    public void testGetChronology() {
        assertNotNull(localDate.getChronology());
    }

    @Test
    public void testEquals() {
        LocalDate sameDate = new LocalDate(2023, 6, 15, TEST_ZONE);
        LocalDate differentDate = new LocalDate(2023, 6, 16, TEST_ZONE);
        assertTrue(localDate.equals(sameDate));
        assertFalse(localDate.equals(differentDate));
        assertFalse(localDate.equals(null));
        assertFalse(localDate.equals("string"));
        assertTrue(localDate.equals(localDate));
    }

    @Test
    public void testHashCode() {
        LocalDate sameDate = new LocalDate(2023, 6, 15, TEST_ZONE);
        assertEquals(localDate.hashCode(), sameDate.hashCode());
        assertNotEquals(localDate.hashCode(), new LocalDate(2023, 6, 16, TEST_ZONE).hashCode());
    }

    @Test
    public void testCompareTo() {
        LocalDate earlier = new LocalDate(2023, 6, 14, TEST_ZONE);
        LocalDate later = new LocalDate(2023, 6, 16, TEST_ZONE);
        assertEquals(0, localDate.compareTo(localDate));
        assertTrue(localDate.compareTo(earlier) > 0);
        assertTrue(localDate.compareTo(later) < 0);
        assertEquals(0, localDate.compareTo(sameLocalDate()));
    }

    private LocalDate sameLocalDate() {
        return new LocalDate(2023, 6, 15, TEST_ZONE);
    }

    @Test
    public void testToDateTimeAtStartOfDay() {
        DateTime dateTime = localDate.toDateTimeAtStartOfDay();
        assertEquals(0, dateTime.getHourOfDay());
        assertEquals(0, dateTime.getMinuteOfHour());
    }

    @Test
    public void testToDateTimeAtStartOfDayWithZone() {
        DateTime dateTime = localDate.toDateTimeAtStartOfDay(TEST_ZONE);
        assertEquals(0, dateTime.getHourOfDay());
        assertEquals(0, dateTime.getMinuteOfHour());
    }

    @Test
    public void testToDateTimeAtMidnight() {
        DateTime dateTime = localDate.toDateTimeAtMidnight();
        assertEquals(0, dateTime.getHourOfDay());
        assertEquals(0, dateTime.getMinuteOfHour());
    }

    @Test
    public void testToDateTimeAtMidnightWithZone() {
        DateTime dateTime = localDate.toDateTimeAtMidnight(TEST_ZONE);
        assertEquals(0, dateTime.getHourOfDay());
        assertEquals(0, dateTime.getMinuteOfHour());
    }

    @Test
    public void testToDateTimeAtCurrentTime() {
        DateTime dateTime = localDate.toDateTimeAtCurrentTime();
        assertNotNull(dateTime);
    }

    @Test
    public void testToDateMidnight() {
        DateMidnight dateMidnight = localDate.toDateMidnight();
        assertEquals(2023, dateMidnight.getYear());
        assertEquals(6, dateMidnight.getMonthOfYear());
        assertEquals(15, dateMidnight.getDayOfMonth());
    }

    @Test
    public void testToDateMidnightWithZone() {
        DateMidnight dateMidnight = localDate.toDateMidnight(TEST_ZONE);
        assertEquals(2023, dateMidnight.getYear());
        assertEquals(6, dateMidnight.getMonthOfYear());
        assertEquals(15, dateMidnight.getDayOfMonth());
    }

    @Test
    public void testToLocalDateTime() {
        LocalTime time = new LocalTime(14, 30);
        LocalDateTime localDateTime = localDate.toLocalDateTime(time);
        assertEquals(2023, localDateTime.getYear());
        assertEquals(6, localDateTime.getMonthOfYear());
        assertEquals(15, localDateTime.getDayOfMonth());
        assertEquals(14, localDateTime.getHourOfDay());
        assertEquals(30, localDateTime.getMinuteOfHour());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocalDateTimeWithNullTime() {
        localDate.toLocalDateTime(null);
    }

    @Test
    public void testToDateTimeWithTime() {
        LocalTime time = new LocalTime(14, 30);
        DateTime dateTime = localDate.toDateTime(time);
        assertEquals(2023, dateTime.getYear());
        assertEquals(6, dateTime.getMonthOfYear());
        assertEquals(15, dateTime.getDayOfMonth());
        assertEquals(14, dateTime.getHourOfDay());
        assertEquals(30, dateTime.getMinuteOfHour());
    }

    @Test
    public void testToDateTimeWithTimeAndZone() {
        LocalTime time = new LocalTime(14, 30);
        DateTime dateTime = localDate.toDateTime(time, TEST_ZONE);
        assertNotNull(dateTime);
    }

    @Test
    public void testToInterval() {
        Interval interval = localDate.toInterval();
        assertNotNull(interval);
    }

    @Test
    public void testToIntervalWithZone() {
        Interval interval = localDate.toInterval(TEST_ZONE);
        assertNotNull(interval);
    }

    @Test
    public void testToDate() {
        Date date = localDate.toDate();
        assertNotNull(date);
    }

    @Test
    public void testWithFields() {
        LocalDate other = new LocalDate(2024, 7, 20, TEST_ZONE);
        LocalDate result = localDate.withFields(other);
        assertEquals(2024, result.getYear());
        assertEquals(7, result.getMonthOfYear());
        assertEquals(20, result.getDayOfMonth());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithFieldsWithNull() {
        localDate.withFields(null);
    }

    @Test
    public void testWithField() {
        LocalDate result = localDate.withField(DateTimeFieldType.year(), 2024);
        assertEquals(2024, result.getYear());
        assertEquals(6, result.getMonthOfYear());
        assertEquals(15, result.getDayOfMonth());
    }

    @Test
    public void testWithFieldAdded() {
        LocalDate result = localDate.withFieldAdded(DurationFieldType.days(), 5);
        assertEquals(20, result.getDayOfMonth());
    }

    @Test
    public void testWithFieldAddedZeroAmount() {
        LocalDate result = localDate.withFieldAdded(DurationFieldType.days(), 0);
        assertEquals(localDate, result);
    }

    @Test
    public void testWithPeriodAdded() {
        LocalDate result = localDate.withPeriodAdded(Period.days(5), 1);
        assertEquals(20, result.getDayOfMonth());
    }

    @Test
    public void testWithPeriodAddedNullPeriod() {
        LocalDate result = localDate.withPeriodAdded(null, 1);
        assertEquals(localDate, result);
    }

    @Test
    public void testPlusPeriod() {
        LocalDate result = localDate.plus(Period.days(10));
        assertEquals(25, result.getDayOfMonth());
    }

    @Test
    public void testPlusYears() {
        LocalDate result = localDate.plusYears(2);
        assertEquals(2025, result.getYear());
        assertEquals(6, result.getMonthOfYear());
        assertEquals(15, result.getDayOfMonth());
    }

    @Test
    public void testPlusYearsZero() {
        LocalDate result = localDate.plusYears(0);
        assertEquals(localDate, result);
    }

    @Test
    public void testPlusMonths() {
        LocalDate result = localDate.plusMonths(3);
        assertEquals(9, result.getMonthOfYear());
        assertEquals(15, result.getDayOfMonth());
    }

    @Test
    public void testPlusMonthsZero() {
        LocalDate result = localDate.plusMonths(0);
        assertEquals(localDate, result);
    }

    @Test
    public void testPlusWeeks() {
        LocalDate result = localDate.plusWeeks(2);
        assertEquals(29, result.getDayOfMonth());
    }

    @Test
    public void testPlusWeeksZero() {
        LocalDate result = localDate.plusWeeks(0);
        assertEquals(localDate, result);
    }

    @Test
    public void testPlusDays() {
        LocalDate result = localDate.plusDays(5);
        assertEquals(20, result.getDayOfMonth());
    }

    @Test
    public void testPlusDaysZero() {
        LocalDate result = localDate.plusDays(0);
        assertEquals(localDate, result);
    }

    @Test
    public void testMinusPeriod() {
        LocalDate result = localDate.minus(Period.days(5));
        assertEquals(10, result.getDayOfMonth());
    }

    @Test
    public void testMinusYears() {
        LocalDate result = localDate.minusYears(2);
        assertEquals(2021, result.getYear());
    }

    @Test
    public void testMinusMonths() {
        LocalDate result = localDate.minusMonths(3);
        assertEquals(3, result.getMonthOfYear());
    }

    @Test
    public void testMinusWeeks() {
        LocalDate result = localDate.minusWeeks(2);
        assertEquals(1, result.getDayOfMonth());
    }

    @Test
    public void testMinusDays() {
        LocalDate result = localDate.minusDays(5);
        assertEquals(10, result.getDayOfMonth());
    }

    @Test
    public void testProperty() {
        Property property = localDate.property(DateTimeFieldType.year());
        assertNotNull(property);
        assertEquals(2023, property.get());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPropertyWithNull() {
        localDate.property(null);
    }

    @Test
    public void testGetEra() {
        assertEquals(1, localDate.getEra());
    }

    @Test
    public void testGetCenturyOfEra() {
        assertEquals(20, localDate.getCenturyOfEra());
    }

    @Test
    public void testGetYearOfEra() {
        assertEquals(2023, localDate.getYearOfEra());
    }

    @Test
    public void testGetYearOfCentury() {
        assertEquals(23, localDate.getYearOfCentury());
    }

    @Test
    public void testGetYear() {
        assertEquals(2023, localDate.getYear());
    }

    @Test
    public void testGetWeekyear() {
        assertEquals(2023, localDate.getWeekyear());
    }

    @Test
    public void testGetMonthOfYear() {
        assertEquals(6, localDate.getMonthOfYear());
    }

    @Test
    public void testGetWeekOfWeekyear() {
        assertEquals(24, localDate.getWeekOfWeekyear());
    }

    @Test
    public void testGetDayOfYear() {
        assertEquals(166, localDate.getDayOfYear());
    }

    @Test
    public void testGetDayOfMonth() {
        assertEquals(15, localDate.getDayOfMonth());
    }

    @Test
    public void testGetDayOfWeek() {
        assertEquals(4, localDate.getDayOfWeek());
    }

    @Test
    public void testWithEra() {
        LocalDate result = localDate.withEra(0);
        assertEquals(0, result.getEra());
    }

    @Test
    public void testWithCenturyOfEra() {
        LocalDate result = localDate.withCenturyOfEra(21);
        assertEquals(21, result.getCenturyOfEra());
    }

    @Test
    public void testWithYearOfEra() {
        LocalDate result = localDate.withYearOfEra(2024);
        assertEquals(2024, result.getYearOfEra());
    }

    @Test
    public void testWithYearOfCentury() {
        LocalDate result = localDate.withYearOfCentury(24);
        assertEquals(24, result.getYearOfCentury());
    }

    @Test
    public void testWithYear() {
        LocalDate result = localDate.withYear(2024);
        assertEquals(2024, result.getYear());
    }

    @Test
    public void testWithWeekyear() {
        LocalDate result = localDate.withWeekyear(2024);
        assertEquals(2024, result.getWeekyear());
    }

    @Test
    public void testWithMonthOfYear() {
        LocalDate result = localDate.withMonthOfYear(12);
        assertEquals(12, result.getMonthOfYear());
    }

    @Test
    public void testWithWeekOfWeekyear() {
        LocalDate result = localDate.withWeekOfWeekyear(1);
        assertEquals(1, result.getWeekOfWeekyear());
    }

    @Test
    public void testWithDayOfYear() {
        LocalDate result = localDate.withDayOfYear(200);
        assertEquals(200, result.getDayOfYear());
    }

    @Test
    public void testWithDayOfMonth() {
        LocalDate result = localDate.withDayOfMonth(25);
        assertEquals(25, result.getDayOfMonth());
    }

    @Test
    public void testWithDayOfWeek() {
        LocalDate result = localDate.withDayOfWeek(1);
        assertEquals(1, result.getDayOfWeek());
    }

    @Test
    public void testEraProperty() {
        Property property = localDate.era();
        assertNotNull(property);
        assertEquals(1, property.get());
    }

    @Test
    public void testCenturyOfEraProperty() {
        Property property = localDate.centuryOfEra();
        assertNotNull(property);
        assertEquals(20, property.get());
    }

    @Test
    public void testYearOfCenturyProperty() {
        Property property = localDate.yearOfCentury();
        assertNotNull(property);
        assertEquals(23, property.get());
    }

    @Test
    public void testYearOfEraProperty() {
        Property property = localDate.yearOfEra();
        assertNotNull(property);
        assertEquals(2023, property.get());
    }

    @Test
    public void testYearProperty() {
        Property property = localDate.year();
        assertNotNull(property);
        assertEquals(2023, property.get());
    }

    @Test
    public void testWeekyearProperty() {
        Property property = localDate.weekyear();
        assertNotNull(property);
        assertEquals(2023, property.get());
    }

    @Test
    public void testMonthOfYearProperty() {
        Property property = localDate.monthOfYear();
        assertNotNull(property);
        assertEquals(6, property.get());
    }

    @Test
    public void testWeekOfWeekyearProperty() {
        Property property = localDate.weekOfWeekyear();
        assertNotNull(property);
        assertEquals(24, property.get());
    }

    @Test
    public void testDayOfYearProperty() {
        Property property = localDate.dayOfYear();
        assertNotNull(property);
        assertEquals(166, property.get());
    }

    @Test
    public void testDayOfMonthProperty() {
        Property property = localDate.dayOfMonth();
        assertNotNull(property);
        assertEquals(15, property.get());
    }

    @Test
    public void testDayOfWeekProperty() {
        Property property = localDate.dayOfWeek();
        assertNotNull(property);
        assertEquals(4, property.get());
    }

    @Test
    public void testToString() {
        assertEquals("2023-06-15", localDate.toString());
    }

    @Test
    public void testToStringWithPattern() {
        assertEquals("2023/06/15", localDate.toString("yyyy/MM/dd"));
    }

    @Test
    public void testToStringWithNullPattern() {
        assertEquals("2023-06-15", localDate.toString((String) null));
    }

    @Test
    public void testToStringWithPatternAndLocale() {
        assertEquals("15/06/2023", localDate.toString("dd/MM/yyyy", Locale.ENGLISH));
    }

    @Test
    public void testPropertyGetField() {
        Property property = localDate.year();
        assertEquals(DateTimeFieldType.year(), property.getField());
    }

    @Test
    public void testPropertyGetLocalMillis() {
        Property property = localDate.year();
        long expected = localDate.getLocalMillis();
        assertEquals(expected, property.getLocalMillis());
    }

    @Test
    public void testPropertyGetChronology() {
        Property property = localDate.year();
        assertEquals(localDate.getChronology(), property.getChronology());
    }

    @Test
    public void testPropertyGetLocalDate() {
        Property property = localDate.year();
        assertEquals(localDate, property.getLocalDate());
    }

    @Test
    public void testPropertyAddToCopy() {
        Property property = localDate.year();
        LocalDate result = property.addToCopy(1);
        assertEquals(2024, result.getYear());
    }

    @Test
    public void testPropertyAddWrapFieldToCopy() {
        Property property = localDate.monthOfYear();
        LocalDate result = property.addWrapFieldToCopy(1);
        assertEquals(7, result.getMonthOfYear());
    }

    @Test
    public void testPropertySetCopy() {
        Property property = localDate.year();
        LocalDate result = property.setCopy(2025);
        assertEquals(2025, result.getYear());
    }

    @Test
    public void testPropertySetCopyWithText() {
        Property property = localDate.monthOfYear();
        LocalDate result = property.setCopy("7");
        assertEquals(7, result.getMonthOfYear());
    }

    @Test
    public void testPropertySetCopyWithTextAndLocale() {
        Property property = localDate.monthOfYear();
        LocalDate result = property.setCopy("7", Locale.ENGLISH);
        assertEquals(7, result.getMonthOfYear());
    }

    @Test
    public void testPropertyWithMaximumValue() {
        Property property = localDate.dayOfMonth();
        LocalDate result = property.withMaximumValue();
        assertEquals(30, result.getDayOfMonth());
    }

    @Test
    public void testPropertyWithMinimumValue() {
        Property property = localDate.dayOfMonth();
        LocalDate result = property.withMinimumValue();
        assertEquals(1, result.getDayOfMonth());
    }

    @Test
    public void testPropertyRoundFloorCopy() {
        Property property = localDate.dayOfMonth();
        LocalDate result = property.roundFloorCopy();
        assertEquals(15, result.getDayOfMonth());
    }

    @Test
    public void testPropertyRoundCeilingCopy() {
        Property property = localDate.dayOfMonth();
        LocalDate result = property.roundCeilingCopy();
        assertEquals(15, result.getDayOfMonth());
    }

    @Test
    public void testPropertyRoundHalfFloorCopy() {
        Property property = localDate.dayOfMonth();
        LocalDate result = property.roundHalfFloorCopy();
        assertEquals(15, result.getDayOfMonth());
    }

    @Test
    public void testPropertyRoundHalfCeilingCopy() {
        Property property = localDate.dayOfMonth();
        LocalDate result = property.roundHalfCeilingCopy();
        assertEquals(15, result.getDayOfMonth());
    }

    @Test
    public void testPropertyRoundHalfEvenCopy() {
        Property property = localDate.dayOfMonth();
        LocalDate result = property.roundHalfEvenCopy();
        assertEquals(15, result.getDayOfMonth());
    }
}