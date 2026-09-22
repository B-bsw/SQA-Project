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
import org.junit.Assert;
import org.junit.Test;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;

public class LocalDateTimeTest {

    @Test
    public void now_givenDefault_shouldCreateInstance() {
        // Arrange & Act
        LocalDateTime dt = LocalDateTime.now();

        // Assert
        Assert.assertNotNull(dt);
        Assert.assertEquals(ISOChronology.getInstanceUTC(), dt.getChronology());
    }

    @Test
    public void now_givenValidZone_shouldCreateInstance() {
        // Arrange
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);

        // Act
        LocalDateTime dt = LocalDateTime.now(zone);

        // Assert
        Assert.assertNotNull(dt);
        Assert.assertEquals(ISOChronology.getInstanceUTC(), dt.getChronology());
    }

    @Test(expected = NullPointerException.class)
    public void now_givenNullZone_shouldThrowNullPointerException() {
        // Act
        LocalDateTime.now((DateTimeZone) null);
    }

    @Test
    public void now_givenValidChronology_shouldCreateInstance() {
        // Arrange
        Chronology chrono = GJChronology.getInstance();

        // Act
        LocalDateTime dt = LocalDateTime.now(chrono);

        // Assert
        Assert.assertNotNull(dt);
        Assert.assertEquals(chrono.withUTC(), dt.getChronology());
    }

    @Test(expected = NullPointerException.class)
    public void now_givenNullChronology_shouldThrowNullPointerException() {
        // Act
        LocalDateTime.now((Chronology) null);
    }

    @Test
    public void parse_givenValidIsoString_shouldParseCorrectly() {
        // Arrange
        String text = "2023-05-18T14:30:45.123";

        // Act
        LocalDateTime dt = LocalDateTime.parse(text);

        // Assert
        Assert.assertEquals(2023, dt.getYear());
        Assert.assertEquals(5, dt.getMonthOfYear());
        Assert.assertEquals(18, dt.getDayOfMonth());
        Assert.assertEquals(14, dt.getHourOfDay());
        Assert.assertEquals(30, dt.getMinuteOfHour());
        Assert.assertEquals(45, dt.getSecondOfMinute());
        Assert.assertEquals(123, dt.getMillisOfSecond());
    }

    @Test
    public void parse_givenCustomFormatter_shouldParseCorrectly() {
        // Arrange
        String text = "18/05/2023 14:30";

        // Act
        LocalDateTime dt = LocalDateTime.parse(text, DateTimeFormat.forPattern("dd/MM/yyyy HH:mm"));

        // Assert
        Assert.assertEquals(2023, dt.getYear());
        Assert.assertEquals(5, dt.getMonthOfYear());
        Assert.assertEquals(18, dt.getDayOfMonth());
        Assert.assertEquals(14, dt.getHourOfDay());
        Assert.assertEquals(30, dt.getMinuteOfHour());
        Assert.assertEquals(0, dt.getSecondOfMinute());
    }

    @Test
    public void fromCalendarFields_givenValidCalendar_shouldConvertCorrectly() {
        // Arrange
        Calendar cal = new GregorianCalendar(2023, Calendar.MARCH, 15, 10, 20, 30);
        cal.set(Calendar.MILLISECOND, 400);

        // Act
        LocalDateTime dt = LocalDateTime.fromCalendarFields(cal);

        // Assert
        Assert.assertEquals(2023, dt.getYear());
        Assert.assertEquals(3, dt.getMonthOfYear());
        Assert.assertEquals(15, dt.getDayOfMonth());
        Assert.assertEquals(10, dt.getHourOfDay());
        Assert.assertEquals(20, dt.getMinuteOfHour());
        Assert.assertEquals(30, dt.getSecondOfMinute());
        Assert.assertEquals(400, dt.getMillisOfSecond());
    }

    @Test(expected = IllegalArgumentException.class)
    public void fromCalendarFields_givenNullCalendar_shouldThrowIllegalArgumentException() {
        // Act
        LocalDateTime.fromCalendarFields(null);
    }

    @Test
    public void fromDateFields_givenValidDate_shouldConvertCorrectly() {
        // Arrange
        Calendar cal = new GregorianCalendar(2023, Calendar.MARCH, 15, 10, 20, 30);
        cal.set(Calendar.MILLISECOND, 400);
        Date date = cal.getTime();

        // Act
        LocalDateTime dt = LocalDateTime.fromDateFields(date);

        // Assert
        Assert.assertEquals(2023, dt.getYear());
        Assert.assertEquals(3, dt.getMonthOfYear());
        Assert.assertEquals(15, dt.getDayOfMonth());
        Assert.assertEquals(10, dt.getHourOfDay());
        Assert.assertEquals(20, dt.getMinuteOfHour());
        Assert.assertEquals(30, dt.getSecondOfMinute());
        Assert.assertEquals(400, dt.getMillisOfSecond());
    }

    @Test(expected = IllegalArgumentException.class)
    public void fromDateFields_givenNullDate_shouldThrowIllegalArgumentException() {
        // Act
        LocalDateTime.fromDateFields(null);
    }

    @Test
    public void constructor_givenInstantAndZone_shouldConvertCorrectly() {
        // Arrange
        DateTimeZone zone = DateTimeZone.forOffsetHours(3);
        long instant = 10000000L;

        // Act
        LocalDateTime dt = new LocalDateTime(instant, zone);

        // Assert
        Assert.assertEquals(ISOChronology.getInstanceUTC(), dt.getChronology());
    }

    @Test
    public void constructor_givenInstantAndNullChronology_shouldUseISO() {
        // Act
        LocalDateTime dt = new LocalDateTime(10000000L, (Chronology) null);

        // Assert
        Assert.assertEquals(ISOChronology.getInstanceUTC(), dt.getChronology());
    }

    @Test
    public void constructor_givenObjectAndZone_shouldInitialize() {
        // Arrange
        String iso = "2023-01-01T12:00:00.000";
        DateTimeZone zone = DateTimeZone.UTC;

        // Act
        LocalDateTime dt = new LocalDateTime(iso, zone);

        // Assert
        Assert.assertEquals(2023, dt.getYear());
        Assert.assertEquals(1, dt.getMonthOfYear());
        Assert.assertEquals(1, dt.getDayOfMonth());
    }

    @Test
    public void constructor_givenObjectOnly_shouldInitialize() {
        // Arrange
        String iso = "2023-01-01T12:00:00.000";

        // Act
        LocalDateTime dt = new LocalDateTime(iso);

        // Assert
        Assert.assertEquals(2023, dt.getYear());
    }

    @Test
    public void constructor_givenVariousIntArguments_shouldSetFieldsCorrectly() {
        // Act
        LocalDateTime dt5 = new LocalDateTime(2023, 5, 10, 8, 30);
        LocalDateTime dt6 = new LocalDateTime(2023, 5, 10, 8, 30, 45);
        LocalDateTime dt7 = new LocalDateTime(2023, 5, 10, 8, 30, 45, 500);
        LocalDateTime dtChrono = new LocalDateTime(2023, 5, 10, 8, 30, 45, 500, ISOChronology.getInstance());

        // Assert
        Assert.assertEquals(0, dt5.getSecondOfMinute());
        Assert.assertEquals(0, dt5.getMillisOfSecond());
        Assert.assertEquals(45, dt6.getSecondOfMinute());
        Assert.assertEquals(0, dt6.getMillisOfSecond());
        Assert.assertEquals(500, dt7.getMillisOfSecond());
        Assert.assertEquals(ISOChronology.getInstanceUTC(), dtChrono.getChronology());
    }

    @Test
    public void size_givenAnyInstance_shouldReturnFour() {
        // Arrange
        LocalDateTime dt = new LocalDateTime(2023, 1, 1, 0, 0);

        // Act & Assert
        Assert.assertEquals(4, dt.size());
    }

    @Test
    public void getField_givenValidIndices_shouldReturnExpectedFields() {
        // Arrange
        LocalDateTime dt = new LocalDateTime(2023, 1, 1, 0, 0);
        Chronology chrono = dt.getChronology();

        // Act & Assert
        Assert.assertEquals(chrono.year(), dt.getField(0, chrono));
        Assert.assertEquals(chrono.monthOfYear(), dt.getField(1, chrono));
        Assert.assertEquals(chrono.dayOfMonth(), dt.getField(2, chrono));
        Assert.assertEquals(chrono.millisOfDay(), dt.getField(3, chrono));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getField_givenNegativeIndex_shouldThrowException() {
        // Arrange
        LocalDateTime dt = new LocalDateTime(2023, 1, 1, 0, 0);

        // Act
        dt.getField(-1, dt.getChronology());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getField_givenOverflowIndex_shouldThrowException() {
        // Arrange
        LocalDateTime dt = new LocalDateTime(2023, 1, 1, 0, 0);

        // Act
        dt.getField(4, dt.getChronology());
    }

    @Test
    public void getValue_givenValidIndices_shouldReturnExpectedValues() {
        // Arrange
        LocalDateTime dt = new LocalDateTime(2023, 5, 12, 10, 15, 30, 250);

        // Act & Assert
        Assert.assertEquals(2023, dt.getValue(0));
        Assert.assertEquals(5, dt.getValue(1));
        Assert.assertEquals(12, dt.getValue(2));
        Assert.assertEquals(dt.getMillisOfDay(), dt.getValue(3));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getValue_givenNegativeIndex_shouldThrowException() {
        // Arrange
        LocalDateTime dt = new LocalDateTime(2023, 1, 1, 0, 0);

        // Act
        dt.getValue(-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getValue_givenOverflowIndex_shouldThrowException() {
        // Arrange
        LocalDateTime dt = new LocalDateTime(2023, 1, 1, 0, 0);

        // Act
        dt.getValue(4);
    }

    @Test
    public void get_givenDateTimeFieldType_shouldReturnValue() {
        // Arrange
        LocalDateTime dt = new LocalDateTime(2023, 5, 12, 10, 15, 30, 250);

        // Act & Assert
        Assert.assertEquals(2023, dt.get(DateTimeFieldType.year()));
        Assert.assertEquals(5, dt.get(DateTimeFieldType.monthOfYear()));
        Assert.assertEquals(12, dt.get(DateTimeFieldType.dayOfMonth()));
        Assert.assertEquals(10, dt.get(DateTimeFieldType.hourOfDay()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void get_givenNullFieldType_shouldThrowIllegalArgumentException() {
        // Arrange
        LocalDateTime dt = new LocalDateTime(2023, 1, 1, 0, 0);

        // Act
        dt.get(null);
    }

    @Test
    public void isSupported_givenDateTimeFieldType_shouldCheckSupport() {
        // Arrange
        LocalDateTime dt = new LocalDateTime(2023, 1, 1, 0, 0);

        // Act & Assert
        Assert.assertTrue(dt.isSupported(DateTimeFieldType.year()));
        Assert.assertFalse(dt.isSupported((DateTimeFieldType) null));
    }

    @Test
    public void isSupported_givenDurationFieldType_shouldCheckSupport() {
        // Arrange
        LocalDateTime dt = new LocalDateTime(2023, 1, 1, 0, 0);

        // Act & Assert
        Assert.assertTrue(dt.isSupported(DurationFieldType.days()));
        Assert.assertFalse(dt.isSupported((DurationFieldType) null));
    }

    @Test
    public void equals_and_compareTo_givenVariousScenarios_shouldBranchCorrectly() {
        // Arrange
        LocalDateTime dt1 = new LocalDateTime(2023, 5, 12, 10, 15, 30, 0);
        LocalDateTime dt2 = new LocalDateTime(2023, 5, 12, 10, 15, 30, 0);
        LocalDateTime dt3 = new LocalDateTime(2023, 5, 12, 10, 15, 30, 1);
        LocalDateTime dtDiffChrono = new LocalDateTime(2023, 5, 12, 10, 15, 30, 0, GJChronology.getInstanceUTC());

        // Assert - equals
        Assert.assertTrue(dt1.equals(dt1));
        Assert.assertTrue(dt1.equals(dt2));
        Assert.assertFalse(dt1.equals(dt3));
        Assert.assertFalse(dt1.equals(dtDiffChrono));
        Assert.assertFalse(dt1.equals(null));
        Assert.assertFalse(dt1.equals("NotALocalDateTime"));

        // Assert - compareTo
        Assert.assertEquals(0, dt1.compareTo(dt1));
        Assert.assertEquals(0, dt1.compareTo(dt2));
        Assert.assertTrue(dt1.compareTo(dt3) < 0);
        Assert.assertTrue(dt3.compareTo(dt1) > 0);
    }

    @Test
    public void toDateTime_givenDefaultAndZone_shouldConvert() {
        // Arrange
        LocalDateTime dt = new LocalDateTime(2023, 5, 12, 10, 15, 30, 0);

        // Act
        DateTime defaultZoned = dt.toDateTime();
        DateTime utcZoned = dt.toDateTime(DateTimeZone.UTC);

        // Assert
        Assert.assertEquals(DateTimeZone.getDefault(), defaultZoned.getZone());
        Assert.assertEquals(DateTimeZone.UTC, utcZoned.getZone());
        Assert.assertEquals(2023, utcZoned.getYear());
        Assert.assertEquals(5, utcZoned.getMonthOfYear());
        Assert.assertEquals(12, utcZoned.getDayOfMonth());
        Assert.assertEquals(10, utcZoned.getHourOfDay());
    }

    @Test
    public void toLocalDate_and_toLocalTime_shouldConvertProperly() {
        // Arrange
        LocalDateTime dt = new LocalDateTime(2023, 5, 12, 10, 15, 30, 123);

        // Act
        LocalDate date = dt.toLocalDate();
        LocalTime time = dt.toLocalTime();

        // Assert
        Assert.assertEquals(new LocalDate(2023, 5, 12), date);
        Assert.assertEquals(new LocalTime(10, 15, 30, 123), time);
    }

    @Test
    public void toDate_givenStandardDateTime_shouldConvertBackAndForth() {
        // Arrange
        LocalDateTime dt = new LocalDateTime(2023, 5, 12, 10, 15, 30, 500);

        // Act
        Date date = dt.toDate();
        LocalDateTime back = LocalDateTime.fromDateFields(date);

        // Assert
        Assert.assertEquals(dt, back);
    }

    @Test
    public void withDate_givenNewValues_shouldModifyDateOnly() {
        // Arrange
        LocalDateTime dt = new LocalDateTime(2023, 5, 12, 10, 15, 30, 500);

        // Act
        LocalDateTime result = dt.withDate(2024, 6, 20);

        // Assert
        Assert.assertEquals(2024, result.getYear());
        Assert.assertEquals(6, result.getMonthOfYear());
        Assert.assertEquals(20, result.getDayOfMonth());
        Assert.assertEquals(10, result.getHourOfDay());
        Assert.assertEquals(15, result.getMinuteOfHour());
    }

    @Test
    public void withTime_givenNewValues_shouldModifyTimeOnly() {
        // Arrange
        LocalDateTime dt = new LocalDateTime(2023, 5, 12, 10, 15, 30, 500);

        // Act
        LocalDateTime result = dt.withTime(18, 45, 10, 200);

        // Assert
        Assert.assertEquals(2023, result.getYear());
        Assert.assertEquals(18, result.getHourOfDay());
        Assert.assertEquals(45, result.getMinuteOfHour());
        Assert.assertEquals(10, result.getSecondOfMinute());
        Assert.assertEquals(200, result.getMillisOfSecond());
    }

    @Test
    public void withFields_givenPartialOrNull_shouldModifyCorrectly() {
        // Arrange
        LocalDateTime dt = new LocalDateTime(2023, 5, 12, 10, 15, 30, 500);
        LocalTime time = new LocalTime(12, 0, 0, 0);

        // Act
        LocalDateTime result = dt.withFields(time);
        LocalDateTime same = dt.withFields(null);

        // Assert
        Assert.assertEquals(12, result.getHourOfDay());
        Assert.assertEquals(0, result.getMinuteOfHour());
        Assert.assertSame(dt, same);
    }

    @Test
    public void withField_givenFieldType_shouldUpdateValue() {
        // Arrange
        LocalDateTime dt = new LocalDateTime(2023, 5, 12, 10, 15, 30, 500);

        // Act
        LocalDateTime result = dt.withField(DateTimeFieldType.year(), 2025);

        // Assert
        Assert.assertEquals(2025, result.getYear());
    }

    @Test(expected = IllegalArgumentException.class)
    public void withField_givenNullFieldType_shouldThrowIllegalArgumentException() {
        // Arrange
        LocalDateTime dt = new LocalDateTime(2023, 5, 12, 10, 15);

        // Act
        dt.withField(null, 1);
    }

    @Test
    public void withFieldAdded_givenZeroOrNonZero_shouldHandleBranches() {
        // Arrange
        LocalDateTime dt = new LocalDateTime(2023, 5, 12, 10, 15);

        // Act
        LocalDateTime same = dt.withFieldAdded(DurationFieldType.days(), 0);
        LocalDateTime next = dt.withFieldAdded(DurationFieldType.days(), 1);

        // Assert
        Assert.assertSame(dt, same);
        Assert.assertEquals(13, next.getDayOfMonth());
    }

    @Test(expected = IllegalArgumentException.class)
    public void withFieldAdded_givenNullFieldType_shouldThrowIllegalArgumentException() {
        // Arrange
        LocalDateTime dt = new LocalDateTime(2023, 5, 12, 10, 15);

        // Act
        dt.withFieldAdded(null, 1);
    }

    @Test
    public void withDurationAdded_givenVariousInputs_shouldHandleBranches() {
        // Arrange
        LocalDateTime dt = new LocalDateTime(2023, 5, 12, 10, 15, 0, 0);
        Duration duration = new Duration(60000L);

        // Act & Assert
        Assert.assertSame(dt, dt.withDurationAdded(null, 1));
        Assert.assertSame(dt, dt.withDurationAdded(duration, 0));
        LocalDateTime plus1Min = dt.withDurationAdded(duration, 1);
        Assert.assertEquals(16, plus1Min.getMinuteOfHour());

        LocalDateTime plusConvenience = dt.plus(duration);
        Assert.assertEquals(16, plusConvenience.getMinuteOfHour());

        LocalDateTime minusConvenience = dt.minus(duration);
        Assert.assertEquals(14, minusConvenience.getMinuteOfHour());
    }

    @Test
    public void withPeriodAdded_givenVariousInputs_shouldHandleBranches() {
        // Arrange
        LocalDateTime dt = new LocalDateTime(2023, 5, 12, 10, 15, 0, 0);
        Period period = Period.days(2);

        // Act & Assert
        Assert.assertSame(dt, dt.withPeriodAdded(null, 1));
        Assert.assertSame(dt, dt.withPeriodAdded(period, 0));
        LocalDateTime plus2Days = dt.withPeriodAdded(period, 1);
        Assert.assertEquals(14, plus2Days.getDayOfMonth());

        LocalDateTime plusConvenience = dt.plus(period);
        Assert.assertEquals(14, plusConvenience.getDayOfMonth());

        LocalDateTime minusConvenience = dt.minus(period);
        Assert.assertEquals(10, minusConvenience.getDayOfMonth());
    }

    @Test
    public void plusAndMinusUnits_givenValues_shouldAddAndSubtractCorrectly() {
        // Arrange
        LocalDateTime dt = new LocalDateTime(2023, 5, 12, 10, 15, 30, 500);

        // Act & Assert - Zero cases return this
        Assert.assertSame(dt, dt.plusYears(0));
        Assert.assertSame(dt, dt.plusMonths(0));
        Assert.assertSame(dt, dt.plusWeeks(0));
        Assert.assertSame(dt, dt.plusDays(0));
        Assert.assertSame(dt, dt.plusHours(0));
        Assert.assertSame(dt, dt.plusMinutes(0));
        Assert.assertSame(dt, dt.plusSeconds(0));
        Assert.assertSame(dt, dt.plusMillis(0));

        Assert.assertSame(dt, dt.minusYears(0));
        Assert.assertSame(dt, dt.minusMonths(0));
        Assert.assertSame(dt, dt.minusWeeks(0));
        Assert.assertSame(dt, dt.minusDays(0));
        Assert.assertSame(dt, dt.minusHours(0));
        Assert.assertSame(dt, dt.minusMinutes(0));
        Assert.assertSame(dt, dt.minusSeconds(0));
        Assert.assertSame(dt, dt.minusMillis(0));

        // Non-zero modifications
        Assert.assertEquals(2025, dt.plusYears(2).getYear());
        Assert.assertEquals(2021, dt.minusYears(2).getYear());

        Assert.assertEquals(7, dt.plusMonths(2).getMonthOfYear());
        Assert.assertEquals(3, dt.minusMonths(2).getMonthOfYear());

        Assert.assertEquals(26, dt.plusWeeks(2).getDayOfMonth());
        Assert.assertEquals(28, dt.minusWeeks(2).getDayOfMonth());

        Assert.assertEquals(14, dt.plusDays(2).getDayOfMonth());
        Assert.assertEquals(10, dt.minusDays(2).getDayOfMonth());

        Assert.assertEquals(12, dt.plusHours(2).getHourOfDay());
        Assert.assertEquals(8, dt.minusHours(2).getHourOfDay());

        Assert.assertEquals(17, dt.plusMinutes(2).getMinuteOfHour());
        Assert.assertEquals(13, dt.minusMinutes(2).getMinuteOfHour());

        Assert.assertEquals(32, dt.plusSeconds(2).getSecondOfMinute());
        Assert.assertEquals(28, dt.minusSeconds(2).getSecondOfMinute());

        Assert.assertEquals(550, dt.plusMillis(50).getMillisOfSecond());
        Assert.assertEquals(450, dt.minusMillis(50).getMillisOfSecond());
    }

    @Test
    public void property_givenSupportedField_shouldReturnProperty() {
        // Arrange
        LocalDateTime dt = new LocalDateTime(2023, 5, 12, 10, 15, 30, 500);

        // Act
        LocalDateTime.Property p = dt.property(DateTimeFieldType.dayOfMonth());

        // Assert
        Assert.assertNotNull(p);
        Assert.assertEquals(12, p.get());
        Assert.assertSame(dt, p.getLocalDateTime());
    }

    @Test(expected = IllegalArgumentException.class)
    public void property_givenNullField_shouldThrowIllegalArgumentException() {
        // Arrange
        LocalDateTime dt = new LocalDateTime(2023, 5, 12, 10, 15);

        // Act
        dt.property(null);
    }

    @Test
    public void property_givenAllFieldAccessors_shouldReturnNonNullProperties() {
        // Arrange
        LocalDateTime dt = new LocalDateTime(2023, 5, 12, 10, 15, 30, 500);

        // Act & Assert
        Assert.assertNotNull(dt.era());
        Assert.assertNotNull(dt.centuryOfEra());
        Assert.assertNotNull(dt.yearOfCentury());
        Assert.assertNotNull(dt.yearOfEra());
        Assert.assertNotNull(dt.year());
        Assert.assertNotNull(dt.weekyear());
        Assert.assertNotNull(dt.monthOfYear());
        Assert.assertNotNull(dt.weekOfWeekyear());
        Assert.assertNotNull(dt.dayOfYear());
        Assert.assertNotNull(dt.dayOfMonth());
        Assert.assertNotNull(dt.dayOfWeek());
        Assert.assertNotNull(dt.hourOfDay());
        Assert.assertNotNull(dt.minuteOfHour());
        Assert.assertNotNull(dt.secondOfMinute());
        Assert.assertNotNull(dt.millisOfSecond());
        Assert.assertNotNull(dt.millisOfDay());
    }

    @Test
    public void getters_givenStandardDateTime_shouldReturnExpectedValues() {
        // Arrange
        LocalDateTime dt = new LocalDateTime(2023, 5, 12, 10, 15, 30, 500);

        // Act & Assert
        Assert.assertEquals(1, dt.getEra());
        Assert.assertEquals(20, dt.getCenturyOfEra());
        Assert.assertEquals(2023, dt.getYearOfEra());
        Assert.assertEquals(23, dt.getYearOfCentury());
        Assert.assertEquals(2023, dt.getYear());
        Assert.assertEquals(2023, dt.getWeekyear());
        Assert.assertEquals(5, dt.getMonthOfYear());
        Assert.assertTrue(dt.getWeekOfWeekyear() > 0);
        Assert.assertTrue(dt.getDayOfYear() > 0);
        Assert.assertEquals(12, dt.getDayOfMonth());
        Assert.assertEquals(DateTimeConstants.FRIDAY, dt.getDayOfWeek());
        Assert.assertEquals(10, dt.getHourOfDay());
        Assert.assertEquals(15, dt.getMinuteOfHour());
        Assert.assertEquals(30, dt.getSecondOfMinute());
        Assert.assertEquals(500, dt.getMillisOfSecond());
        Assert.assertTrue(dt.getMillisOfDay() > 0);
    }

    @Test
    public void withFieldMethods_givenValidValues_shouldMutateCorrectly() {
        // Arrange
        LocalDateTime dt = new LocalDateTime(2023, 5, 12, 10, 15, 30, 500);

        // Act & Assert
        Assert.assertEquals(1, dt.withEra(1).getEra());
        Assert.assertEquals(21, dt.withCenturyOfEra(21).getCenturyOfEra());
        Assert.assertEquals(2024, dt.withYearOfEra(2024).getYearOfEra());
        Assert.assertEquals(25, dt.withYearOfCentury(25).getYearOfCentury());
        Assert.assertEquals(2025, dt.withYear(2025).getYear());
        Assert.assertEquals(2024, dt.withWeekyear(2024).getWeekyear());
        Assert.assertEquals(6, dt.withMonthOfYear(6).getMonthOfYear());
        Assert.assertEquals(20, dt.withWeekOfWeekyear(20).getWeekOfWeekyear());
        Assert.assertEquals(100, dt.withDayOfYear(100).getDayOfYear());
        Assert.assertEquals(25, dt.withDayOfMonth(25).getDayOfMonth());
        Assert.assertEquals(DateTimeConstants.MONDAY, dt.withDayOfWeek(DateTimeConstants.MONDAY).getDayOfWeek());
        Assert.assertEquals(15, dt.withHourOfDay(15).getHourOfDay());
        Assert.assertEquals(45, dt.withMinuteOfHour(45).getMinuteOfHour());
        Assert.assertEquals(10, dt.withSecondOfMinute(10).getSecondOfMinute());
        Assert.assertEquals(200, dt.withMillisOfSecond(200).getMillisOfSecond());
        Assert.assertEquals(1000, dt.withMillisOfDay(1000).getMillisOfDay());
    }

    @Test
    public void toString_givenVariousFormatsAndLocales_shouldFormatExpectedString() {
        // Arrange
        LocalDateTime dt = new LocalDateTime(2023, 5, 12, 10, 15, 30, 500);

        // Act
        String iso = dt.toString();
        String custom = dt.toString("yyyy/MM/dd");
        String nullPattern = dt.toString((String) null);
        String customLocale = dt.toString("yyyy/MM/dd", Locale.ENGLISH);
        String nullPatternLocale = dt.toString(null, Locale.ENGLISH);

        // Assert
        Assert.assertTrue(iso.startsWith("2023-05-12T10:15:30.500"));
        Assert.assertEquals("2023/05/12", custom);
        Assert.assertEquals(iso, nullPattern);
        Assert.assertEquals("2023/05/12", customLocale);
        Assert.assertEquals(iso, nullPatternLocale);
    }

    @Test
    public void propertyOperations_givenMonthProperty_shouldPerformMutations() {
        // Arrange
        LocalDateTime dt = new LocalDateTime(2023, 5, 12, 10, 15, 30, 500);
        LocalDateTime.Property p = dt.monthOfYear();

        // Act & Assert
        Assert.assertEquals(6, p.addToCopy(1).getMonthOfYear());
        Assert.assertEquals(6, p.addToCopy(1L).getMonthOfYear());
        Assert.assertEquals(1, p.addWrapFieldToCopy(8).getMonthOfYear());
        Assert.assertEquals(8, p.setCopy(8).getMonthOfYear());
        Assert.assertEquals(6, p.setCopy("6").getMonthOfYear());
        Assert.assertEquals(6, p.setCopy("June", Locale.ENGLISH).getMonthOfYear());
        Assert.assertEquals(12, p.withMaximumValue().getMonthOfYear());
        Assert.assertEquals(1, p.withMinimumValue().getMonthOfYear());

        Assert.assertNotNull(p.getField());
        Assert.assertEquals(p.getMillis(), dt.getLocalMillis());
        Assert.assertEquals(p.getChronology(), dt.getChronology());
    }

    @Test
    public void propertyRounding_givenHourProperty_shouldRoundCorrectly() {
        // Arrange
        LocalDateTime dt = new LocalDateTime(2023, 5, 12, 10, 15, 30, 500);
        LocalDateTime.Property p = dt.hourOfDay();

        // Act & Assert
        Assert.assertEquals(0, p.roundFloorCopy().getMinuteOfHour());
        Assert.assertEquals(11, p.roundCeilingCopy().getHourOfDay());
        Assert.assertEquals(10, p.roundHalfFloorCopy().getHourOfDay());
        Assert.assertEquals(10, p.roundHalfCeilingCopy().getHourOfDay());
        Assert.assertEquals(10, p.roundHalfEvenCopy().getHourOfDay());
    }

    @Test
    public void serialization_givenLocalDateTime_shouldSerializeAndDeserializeCorrectly() throws Exception {
        // Arrange
        LocalDateTime original = new LocalDateTime(2023, 5, 12, 10, 15, 30, 500);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);

        // Act
        oos.writeObject(original);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        LocalDateTime deserialized = (LocalDateTime) ois.readObject();
        ois.close();

        // Assert
        Assert.assertEquals(original, deserialized);
    }

    @Test
    public void serialization_givenProperty_shouldSerializeAndDeserializeCorrectly() throws Exception {
        // Arrange
        LocalDateTime dt = new LocalDateTime(2023, 5, 12, 10, 15, 30, 500);
        LocalDateTime.Property original = dt.dayOfMonth();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);

        // Act
        oos.writeObject(original);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        LocalDateTime.Property deserialized = (LocalDateTime.Property) ois.readObject();
        ois.close();

        // Assert
        Assert.assertEquals(original.get(), deserialized.get());
        Assert.assertEquals(original.getLocalDateTime(), deserialized.getLocalDateTime());
    }
}