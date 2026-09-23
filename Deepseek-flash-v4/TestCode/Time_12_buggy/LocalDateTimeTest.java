package org.joda.time;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.lang.reflect.Field;

public class LocalDateTimeTest {
    private LocalDateTime base;
    private static final long TEST_INSTANT = 946684800000L; // 2000-01-01T00:00:00.000Z

    @Before
    public void setUp() {
        base = new LocalDateTime(TEST_INSTANT);
    }

    @After
    public void tearDown() {
        base = null;
    }

    @Test
    public void testNow() {
        long before = System.currentTimeMillis();
        LocalDateTime now = LocalDateTime.now();
        long after = System.currentTimeMillis();
        assertNotNull(now);
        assertTrue(now.toDate().getTime() >= before - 1000 && now.toDate().getTime() <= after + 1000);
    }

    @Test
    public void testNowWithNullZone() {
        LocalDateTime result = LocalDateTime.now((DateTimeZone) null);
        assertNotNull(result);
        assertEquals(new LocalDateTime(TEST_INSTANT).getYear(), result.getYear());
    }

    @Test
    public void testNowWithNullChronology() {
        LocalDateTime result = LocalDateTime.now((Chronology) null);
        assertNotNull(result);
    }

    @Test
    public void testParseISODateTime() {
        LocalDateTime result = LocalDateTime.parse("2000-01-01T00:00:00.000");
        assertNotNull(result);
        assertEquals(2000, result.getYear());
        assertEquals(1, result.getMonthOfYear());
        assertEquals(1, result.getDayOfMonth());
    }

    @Test
    public void testParseNullString() {
        try {
            LocalDateTime.parse(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testConstructorWithNullCalendar() {
        try {
            new LocalDateTime((Calendar) null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) { }
    }

    @Test
    public void testConstructorWithNullDate() {
        try {
            new LocalDateTime((Date) null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) { }
    }

    @Test
    public void testConstructorWithNullObject() {
        try {
            new LocalDateTime((Object) null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) { }
    }

    @Test
    public void testConstructorWithNullZone() {
        LocalDateTime result = new LocalDateTime((DateTimeZone) null);
        assertNotNull(result);
        assertEquals(new LocalDateTime().getChronology().getZone(), result.getChronology().getZone());
    }

    @Test
    public void testSize() {
        assertEquals(4, base.size());
    }

    @Test
    public void testGetValueYearIndex() {
        assertEquals(2000, base.getValue(0));
    }

    @Test
    public void testGetValueMonthIndex() {
        assertEquals(1, base.getValue(1));
    }

    @Test
    public void testGetValueDayIndex() {
        assertEquals(1, base.getValue(2));
    }

    @Test
    public void testGetValueMillisOfDayIndex() {
        assertEquals(0, base.getValue(3));
    }

    @Test
    public void testGetValueWithInvalidIndex() {
        try {
            base.getValue(4);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) { }
    }

    @Test
    public void testGetYear() {
        assertEquals(2000, base.getYear());
    }

    @Test
    public void testGetMonthOfYear() {
        assertEquals(1, base.getMonthOfYear());
    }

    @Test
    public void testGetDayOfMonth() {
        assertEquals(1, base.getDayOfMonth());
    }

    @Test
    public void testGetDayOfWeek() {
        assertEquals(6, base.getDayOfWeek()); // 2000-01-01 was Saturday
    }

    @Test
    public void testGetEra() {
        assertEquals(1, base.getEra()); // CE
    }

    @Test
    public void testGetCenturyOfEra() {
        assertEquals(20, base.getCenturyOfEra());
    }

    @Test
    public void testGetYearOfEra() {
        assertEquals(2000, base.getYearOfEra());
    }

    @Test
    public void testGetYearOfCentury() {
        assertEquals(0, base.getYearOfCentury());
    }

    @Test
    public void testGetWeekyear() {
        assertEquals(1999, base.getWeekyear());
    }

    @Test
    public void testGetWeekOfWeekyear() {
        assertTrue(base.getWeekOfWeekyear() > 0);
    }

    @Test
    public void testGetDayOfYear() {
        assertEquals(1, base.getDayOfYear());
    }

    @Test
    public void testGetHourOfDay() {
        assertEquals(0, base.getHourOfDay());
    }

    @Test
    public void testGetMinuteOfHour() {
        assertEquals(0, base.getMinuteOfHour());
    }

    @Test
    public void testGetSecondOfMinute() {
        assertEquals(0, base.getSecondOfMinute());
    }

    @Test
    public void testGetMillisOfSecond() {
        assertEquals(0, base.getMillisOfSecond());
    }

    @Test
    public void testGetMillisOfDay() {
        assertEquals(0, base.getMillisOfDay());
    }

    @Test
    public void testWithYear() {
        LocalDateTime result = base.withYear(2001);
        assertEquals(2001, result.getYear());
        assertEquals(1, result.getMonthOfYear());
        assertNotSame(base, result);
    }

    @Test
    public void testWithYearSameValue() {
        LocalDateTime result = base.withYear(2000);
        assertSame(base, result);
    }

    @Test
    public void testWithMonthOfYear() {
        LocalDateTime result = base.withMonthOfYear(6);
        assertEquals(6, result.getMonthOfYear());
        assertNotSame(base, result);
    }

    @Test
    public void testWithDayOfMonth() {
        LocalDateTime result = base.withDayOfMonth(15);
        assertEquals(15, result.getDayOfMonth());
        assertNotSame(base, result);
    }

    @Test
    public void testWithDayOfMonthLeapYear() {
        LocalDateTime leap = new LocalDateTime(2000, 2, 29, 0, 0, 0, 0);
        LocalDateTime result = leap.withDayOfMonth(28);
        assertEquals(28, result.getDayOfMonth());
    }

    @Test
    public void testWithHourOfDay() {
        LocalDateTime result = base.withHourOfDay(12);
        assertEquals(12, result.getHourOfDay());
        assertEquals(0, result.getMinuteOfHour());
    }

    @Test
    public void testWithHourOfDayBoundaryMax() {
        LocalDateTime result = base.withHourOfDay(23);
        assertEquals(23, result.getHourOfDay());
    }

    @Test
    public void testWithMinuteOfHour() {
        LocalDateTime result = base.withMinuteOfHour(30);
        assertEquals(30, result.getMinuteOfHour());
    }

    @Test
    public void testWithSecondOfMinute() {
        LocalDateTime result = base.withSecondOfMinute(45);
        assertEquals(45, result.getSecondOfMinute());
    }

    @Test
    public void testWithMillisOfSecond() {
        LocalDateTime result = base.withMillisOfSecond(500);
        assertEquals(500, result.getMillisOfSecond());
    }

    @Test
    public void testPlusYears() {
        LocalDateTime result = base.plusYears(10);
        assertEquals(2010, result.getYear());
        assertEquals(1, result.getMonthOfYear());
    }

    @Test
    public void testPlusYearsZero() {
        LocalDateTime result = base.plusYears(0);
        assertSame(base, result);
    }

    @Test
    public void testPlusMonths() {
        LocalDateTime result = base.plusMonths(3);
        assertEquals(4, result.getMonthOfYear());
        assertEquals(2000, result.getYear());
    }

    @Test
    public void testPlusWeeks() {
        LocalDateTime result = base.plusWeeks(1);
        assertEquals(8, result.getDayOfMonth());
        assertEquals(1, result.getMonthOfYear());
    }

    @Test
    public void testPlusDays() {
        LocalDateTime result = base.plusDays(10);
        assertEquals(11, result.getDayOfMonth());
        assertEquals(1, result.getMonthOfYear());
    }

    @Test
    public void testPlusHours() {
        LocalDateTime result = base.plusHours(1);
        assertEquals(1, result.getHourOfDay());
        assertEquals(0, result.getMinuteOfHour());
    }

    @Test
    public void testPlusMinutes() {
        LocalDateTime result = base.plusMinutes(30);
        assertEquals(30, result.getMinuteOfHour());
        assertEquals(0, result.getHourOfDay());
    }

    @Test
    public void testPlusSeconds() {
        LocalDateTime result = base.plusSeconds(15);
        assertEquals(15, result.getSecondOfMinute());
    }

    @Test
    public void testPlusMillis() {
        LocalDateTime result = base.plusMillis(250);
        assertEquals(250, result.getMillisOfSecond());
    }

    @Test
    public void testMinusYears() {
        LocalDateTime result = base.minusYears(10);
        assertEquals(1990, result.getYear());
    }

    @Test
    public void testMinusMonths() {
        LocalDateTime result = base.minusMonths(3);
        assertEquals(10, result.getMonthOfYear());
        assertEquals(1999, result.getYear());
    }

    @Test
    public void testMinusWeeks() {
        LocalDateTime result = base.minusWeeks(1);
        assertEquals(25, result.getDayOfMonth());
        assertEquals(12, result.getMonthOfYear());
        assertEquals(1999, result.getYear());
    }

    @Test
    public void testMinusDays() {
        LocalDateTime result = base.minusDays(1);
        assertEquals(31, result.getDayOfMonth());
        assertEquals(12, result.getMonthOfYear());
        assertEquals(1999, result.getYear());
    }

    @Test
    public void testMinusHours() {
        LocalDateTime result = base.minusHours(1);
        assertEquals(23, result.getHourOfDay());
        assertEquals(31, result.getDayOfMonth());
        assertEquals(12, result.getMonthOfYear());
        assertEquals(1999, result.getYear());
    }

    @Test
    public void testMinusMinutes() {
        LocalDateTime result = base.minusMinutes(1);
        assertEquals(59, result.getMinuteOfHour());
        assertEquals(23, result.getHourOfDay());
    }

    @Test
    public void testMinusSeconds() {
        LocalDateTime result = base.minusSeconds(1);
        assertEquals(59, result.getSecondOfMinute());
    }

    @Test
    public void testMinusMillis() {
        LocalDateTime result = base.minusMillis(1);
        assertEquals(999, result.getMillisOfSecond());
        assertEquals(59, result.getSecondOfMinute());
    }

    @Test
    public void testEqualsSameObject() {
        assertTrue(base.equals(base));
    }

    @Test
    public void testEqualsEqualObject() {
        LocalDateTime other = new LocalDateTime(TEST_INSTANT);
        assertTrue(base.equals(other));
    }

    @Test
    public void testEqualsDifferentTime() {
        LocalDateTime other = new LocalDateTime(TEST_INSTANT + 1000);
        assertFalse(base.equals(other));
    }

    @Test
    public void testEqualsNull() {
        assertFalse(base.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() {
        assertFalse(base.equals("string"));
    }

    @Test
    public void testHashCode() {
        LocalDateTime other = new LocalDateTime(TEST_INSTANT);
        assertEquals(base.hashCode(), other.hashCode());
    }

    @Test
    public void testHashCodeDifferentTime() {
        LocalDateTime other = new LocalDateTime(TEST_INSTANT + 1000);
        assertNotSame(base.hashCode(), other.hashCode());
    }

    @Test
    public void testCompareTo() {
        LocalDateTime earlier = new LocalDateTime(TEST_INSTANT - 1000);
        LocalDateTime later = new LocalDateTime(TEST_INSTANT + 1000);
        assertTrue(earlier.compareTo(later) < 0);
        assertTrue(later.compareTo(earlier) > 0);
        assertEquals(0, earlier.compareTo(new LocalDateTime(TEST_INSTANT - 1000)));
    }

    @Test
    public void testToDate() {
        Date date = base.toDate();
        assertNotNull(date);
        assertEquals(TEST_INSTANT, date.getTime());
    }

    @Test
    public void testToDateTime() {
        DateTime dt = base.toDateTime();
        assertNotNull(dt);
        assertEquals(base.getYear(), dt.getYear());
        assertEquals(base.getMonthOfYear(), dt.getMonthOfYear());
    }

    @Test
    public void testToLocalDate() {
        LocalDate ld = base.toLocalDate();
        assertNotNull(ld);
        assertEquals(2000, ld.getYear());
        assertEquals(1, ld.getMonthOfYear());
        assertEquals(1, ld.getDayOfMonth());
    }

    @Test
    public void testToLocalTime() {
        LocalTime lt = base.toLocalTime();
        assertNotNull(lt);
        assertEquals(0, lt.getHourOfDay());
        assertEquals(0, lt.getMinuteOfHour());
    }

    @Test
    public void testWithFieldNullField() {
        try {
            base.withField(null, 1);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) { }
    }

    @Test
    public void testWithField() {
        LocalDateTime result = base.withField(DateTimeFieldType.year(), 2001);
        assertEquals(2001, result.getYear());
    }

    @Test
    public void testWithFieldZeroAmount() {
        LocalDateTime result = base.withField(DateTimeFieldType.hourOfDay(), base.getHourOfDay());
        assertSame(base, result);
    }

    @Test
    public void testWithDurationAdded() {
        LocalDateTime result = base.withDurationAdded(1, 1);
        assertEquals(2, result.getDayOfMonth());
        assertEquals(1, result.getMonthOfYear());
    }

    @Test
    public void testWithDurationAddedNull() {
        LocalDateTime result = base.withDurationAdded((ReadableDuration) null, 1);
        assertSame(base, result);
    }

    @Test
    public void testWithDurationAddedZeroScalar() {
        LocalDateTime result = base.withDurationAdded(1L, 0);
        assertSame(base, result);
    }

    @Test
    public void testWithPeriodAddedNull() {
        LocalDateTime result = base.withPeriodAdded((ReadablePeriod) null, 1);
        assertSame(base, result);
    }

    @Test
    public void testWithPeriodAddedZeroScalar() {
        LocalDateTime result = base.withPeriodAdded((ReadablePeriod) null, 1);
        assertSame(base, result);
    }

    @Test
    public void testProperty() {
        Property prop = base.property(DateTimeFieldType.year());
        assertNotNull(prop);
        assertEquals(2000, prop.get());
    }

    @Test
    public void testPropertyUnsupported() {
        try {
            base.property(DateTimeFieldType.secondOfMinute());
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) { }
    }

    @Test
    public void testToString() {
        String str = base.toString();
        assertNotNull(str);
        assertTrue(str.contains("2000"));
    }

    @Test
    public void testToStringWithPattern() {
        String str = base.toString("yyyy-MM-dd HH:mm:ss");
        assertEquals("2000-01-01 00:00:00", str);
    }

    @Test
    public void testToStringWithNullPattern() {
        String str = base.toString((String) null);
        assertNotNull(str);
    }

    @Test
    public void testToStringWithLocale() {
        String str = base.toString("MMM", Locale.US);
        assertEquals("Jan", str);
    }

    @Test
    public void testPropertyAddToCopy() {
        Property prop = base.property(DateTimeFieldType.dayOfMonth());
        LocalDateTime result = prop.addToCopy(1);
        assertEquals(2, result.getDayOfMonth());
    }

    @Test
    public void testPropertyAddWrapFieldToCopy() {
        Property prop = base.property(DateTimeFieldType.hourOfDay());
        LocalDateTime result = prop.addWrapFieldToCopy(1);
        assertEquals(1, result.getHourOfDay());
    }

    @Test
    public void testPropertySetCopyInt() {
        Property prop = base.property(DateTimeFieldType.year());
        LocalDateTime result = prop.setCopy(2001);
        assertEquals(2001, result.getYear());
    }

    @Test
    public void testPropertySetCopyString() {
        Property prop = base.property(DateTimeFieldType.monthOfYear());
        LocalDateTime result = prop.setCopy("6");
        assertEquals(6, result.getMonthOfYear());
    }

    @Test
    public void testPropertySetCopyNullString() {
        Property prop = base.property(DateTimeFieldType.monthOfYear());
        LocalDateTime result = prop.setCopy((String) null);
        assertEquals(1, result.getMonthOfYear());
    }

    @Test
    public void testPropertyWithMaximumValue() {
        Property prop = base.property(DateTimeFieldType.dayOfMonth());
        LocalDateTime result = prop.withMaximumValue();
        assertEquals(31, result.getDayOfMonth());
        assertEquals(1, result.getMonthOfYear());
    }

    @Test
    public void testPropertyWithMinimumValue() {
        Property prop = base.property(DateTimeFieldType.dayOfMonth());
        LocalDateTime result = prop.withMinimumValue();
        assertEquals(1, result.getDayOfMonth());
    }

    @Test
    public void testRoundFloor() {
        LocalDateTime dt = new LocalDateTime(2000, 1, 1, 5, 30, 0, 0);
        LocalDateTime result = dt.property(DateTimeFieldType.hourOfDay()).roundFloorCopy();
        assertEquals(5, result.getHourOfDay());
        assertEquals(0, result.getMinuteOfHour());
    }

    @Test
    public void testRoundCeiling() {
        LocalDateTime dt = new LocalDateTime(2000, 1, 1, 5, 30, 0, 0);
        LocalDateTime result = dt.property(DateTimeFieldType.minuteOfHour()).roundCeilingCopy();
        assertEquals(30, result.getMinuteOfHour());
    }

    @Test
    public void testRoundHalfFloor() {
        LocalDateTime dt = new LocalDateTime(2000, 1, 1, 5, 29, 30, 0);
        LocalDateTime result = dt.property(DateTimeFieldType.minuteOfHour()).roundHalfFloorCopy();
        assertEquals(29, result.getMinuteOfHour());
    }

    @Test
    public void testRoundHalfCeiling() {
        LocalDateTime dt = new LocalDateTime(2000, 1, 1, 5, 29, 30, 0);
        LocalDateTime result = dt.property(DateTimeFieldType.minuteOfHour()).roundHalfCeilingCopy();
        assertEquals(30, result.getMinuteOfHour());
    }

    @Test
    public void testRoundHalfEven() {
        LocalDateTime dt1 = new LocalDateTime(2000, 1, 1, 5, 29, 30, 0);
        LocalDateTime result1 = dt1.property(DateTimeFieldType.minuteOfHour()).roundHalfEvenCopy();
        assertEquals(30, result1.getMinuteOfHour());

        LocalDateTime dt2 = new LocalDateTime(2000, 1, 1, 5, 30, 30, 0);
        LocalDateTime result2 = dt2.property(DateTimeFieldType.minuteOfHour()).roundHalfEvenCopy();
        assertEquals(30, result2.getMinuteOfHour());
    }

    @Test
    public void testWithCenturyOfEra() {
        LocalDateTime result = base.withCenturyOfEra(20);
        assertEquals(20, result.getCenturyOfEra());
    }

    @Test
    public void testWithYearOfEra() {
        LocalDateTime result = base.withYearOfEra(2001);
        assertEquals(2001, result.getYearOfEra());
    }

    @Test
    public void testWithYearOfCentury() {
        LocalDateTime result = base.withYearOfCentury(1);
        assertEquals(1, result.getYearOfCentury());
    }

    @Test
    public void testWithWeekyear() {
        LocalDateTime result = base.withWeekyear(2001);
        assertEquals(2001, result.getWeekyear());
    }

    @Test
    public void testWithWeekOfWeekyear() {
        LocalDateTime result = base.withWeekOfWeekyear(2);
        assertEquals(2, result.getWeekOfWeekyear());
    }

    @Test
    public void testWithDayOfYear() {
        LocalDateTime result = base.withDayOfYear(10);
        assertEquals(10, result.getDayOfYear());
        assertEquals(1, result.getMonthOfYear());
    }

    @Test
    public void testWithDayOfWeek() {
        LocalDateTime result = base.withDayOfWeek(1);
        assertEquals(1, result.getDayOfWeek());
    }

    @Test
    public void testWithMillisOfDay() {
        LocalDateTime result = base.withMillisOfDay(5000);
        assertEquals(4, result.getHourOfDay());
        assertEquals(43, result.getMinuteOfHour());
        assertEquals(20, result.getSecondOfMinute());
        assertEquals(0, result.getMillisOfSecond());
    }

    @Test
    public void testGetEraProperty() {
        assertEquals(1, base.era().get());
    }

    @Test
    public void testYearOfCenturyProperty() {
        Property prop = base.yearOfCentury();
        assertEquals(0, prop.get());
    }

    @Test
    public void testDayOfYearProperty() {
        Property prop = base.dayOfYear();
        assertEquals(1, prop.get());
    }

    @Test
    public void testHourOfDayProperty() {
        Property prop = base.hourOfDay();
        assertEquals(0, prop.get());
    }

    @Test
    public void testMinuteOfHourProperty() {
        Property prop = base.minuteOfHour();
        assertEquals(0, prop.get());
    }

    @Test
    public void testSecondOfMinuteProperty() {
        Property prop = base.secondOfMinute();
        assertEquals(0, prop.get());
    }

    @Test
    public void testMillisOfSecondProperty() {
        Property prop = base.millisOfSecond();
        assertEquals(0, prop.get());
    }

    @Test
    public void testRemoveLocalMillis() throws Exception {
        LocalDateTime dt = new LocalDateTime(2000, 1, 2, 3, 4, 5, 6);
        Field field = LocalDateTime.class.getDeclaredField("iLocalMillis");
        field.setAccessible(true);
        long millis = (Long) field.get(dt);
        assertEquals(947007245006L, millis);
    }

    @Test
    public void testGetLocalMillisWithBase() {
        assertEquals(TEST_INSTANT, base.getLocalMillis());
    }
}