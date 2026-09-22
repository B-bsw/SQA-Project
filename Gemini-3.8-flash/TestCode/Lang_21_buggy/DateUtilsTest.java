package org.apache.commons.lang3.time;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.TimeZone;

import org.junit.Assert;
import org.junit.Test;

public class DateUtilsTest {

    @Test
    public void constructor_shouldInstantiateSuccessfully() {
        DateUtils utils = new DateUtils();
        Assert.assertNotNull(utils);
    }

    @Test
    public void constants_shouldHaveExpectedValues() {
        Assert.assertEquals(1000L, DateUtils.MILLIS_PER_SECOND);
        Assert.assertEquals(60000L, DateUtils.MILLIS_PER_MINUTE);
        Assert.assertEquals(3600000L, DateUtils.MILLIS_PER_HOUR);
        Assert.assertEquals(86400000L, DateUtils.MILLIS_PER_DAY);
        Assert.assertEquals(1001, DateUtils.SEMI_MONTH);
        Assert.assertEquals(TimeZone.getTimeZone("GMT"), DateUtils.UTC_TIME_ZONE);
    }

    // ==========================================
    // isSameDay tests
    // ==========================================

    @Test
    public void isSameDay_givenIdenticalDates_shouldReturnTrue() {
        Calendar cal = Calendar.getInstance();
        Date d1 = cal.getTime();
        Date d2 = new Date(d1.getTime());
        Assert.assertTrue(DateUtils.isSameDay(d1, d2));
    }

    @Test
    public void isSameDay_givenDifferentDays_shouldReturnFalse() {
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        cal1.set(2023, Calendar.JANUARY, 1, 10, 0, 0);
        cal2.set(2023, Calendar.JANUARY, 2, 10, 0, 0);
        Assert.assertFalse(DateUtils.isSameDay(cal1.getTime(), cal2.getTime()));
        Assert.assertFalse(DateUtils.isSameDay(cal1, cal2));
    }

    @Test
    public void isSameDay_givenDifferentYears_shouldReturnFalse() {
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        cal1.set(2022, Calendar.JANUARY, 1, 10, 0, 0);
        cal2.set(2023, Calendar.JANUARY, 1, 10, 0, 0);
        Assert.assertFalse(DateUtils.isSameDay(cal1, cal2));
    }

    @Test
    public void isSameDay_givenDifferentEras_shouldReturnFalse() {
        Calendar cal1 = new GregorianCalendar(2023, Calendar.JANUARY, 1);
        Calendar cal2 = new GregorianCalendar(2023, Calendar.JANUARY, 1);
        cal2.set(Calendar.ERA, GregorianCalendar.BC);
        Assert.assertFalse(DateUtils.isSameDay(cal1, cal2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void isSameDay_givenNullDate1_shouldThrowException() {
        DateUtils.isSameDay((Date) null, new Date());
    }

    @Test(expected = IllegalArgumentException.class)
    public void isSameDay_givenNullDate2_shouldThrowException() {
        DateUtils.isSameDay(new Date(), (Date) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void isSameDay_givenNullCalendar1_shouldThrowException() {
        DateUtils.isSameDay((Calendar) null, Calendar.getInstance());
    }

    @Test(expected = IllegalArgumentException.class)
    public void isSameDay_givenNullCalendar2_shouldThrowException() {
        DateUtils.isSameDay(Calendar.getInstance(), (Calendar) null);
    }

    // ==========================================
    // isSameInstant tests
    // ==========================================

    @Test
    public void isSameInstant_givenEqualTimestamps_shouldReturnTrue() {
        Date d1 = new Date(1672531199000L);
        Date d2 = new Date(1672531199000L);
        Calendar c1 = Calendar.getInstance();
        c1.setTime(d1);
        Calendar c2 = Calendar.getInstance();
        c2.setTime(d2);

        Assert.assertTrue(DateUtils.isSameInstant(d1, d2));
        Assert.assertTrue(DateUtils.isSameInstant(c1, c2));
    }

    @Test
    public void isSameInstant_givenDifferentTimestamps_shouldReturnFalse() {
        Date d1 = new Date(1672531199000L);
        Date d2 = new Date(1672531199001L);
        Calendar c1 = Calendar.getInstance();
        c1.setTime(d1);
        Calendar c2 = Calendar.getInstance();
        c2.setTime(d2);

        Assert.assertFalse(DateUtils.isSameInstant(d1, d2));
        Assert.assertFalse(DateUtils.isSameInstant(c1, c2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void isSameInstant_givenNullDate1_shouldThrowException() {
        DateUtils.isSameInstant((Date) null, new Date());
    }

    @Test(expected = IllegalArgumentException.class)
    public void isSameInstant_givenNullDate2_shouldThrowException() {
        DateUtils.isSameInstant(new Date(), (Date) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void isSameInstant_givenNullCal1_shouldThrowException() {
        DateUtils.isSameInstant((Calendar) null, Calendar.getInstance());
    }

    @Test(expected = IllegalArgumentException.class)
    public void isSameInstant_givenNullCal2_shouldThrowException() {
        DateUtils.isSameInstant(Calendar.getInstance(), (Calendar) null);
    }

    // ==========================================
    // isSameLocalTime tests
    // ==========================================

    @Test
    public void isSameLocalTime_givenIdenticalFields_shouldReturnTrue() {
        Calendar c1 = new GregorianCalendar(2023, Calendar.OCTOBER, 10, 15, 30, 45);
        c1.set(Calendar.MILLISECOND, 123);
        Calendar c2 = new GregorianCalendar(2023, Calendar.OCTOBER, 10, 15, 30, 45);
        c2.set(Calendar.MILLISECOND, 123);

        Assert.assertTrue(DateUtils.isSameLocalTime(c1, c2));
    }

    @Test
    public void isSameLocalTime_givenDifferentFields_shouldReturnFalse() {
        Calendar c1 = new GregorianCalendar(2023, Calendar.OCTOBER, 10, 15, 30, 45);
        c1.set(Calendar.MILLISECOND, 123);

        Calendar c2 = (Calendar) c1.clone();
        c2.set(Calendar.MILLISECOND, 124);
        Assert.assertFalse(DateUtils.isSameLocalTime(c1, c2));

        c2 = (Calendar) c1.clone();
        c2.set(Calendar.SECOND, 46);
        Assert.assertFalse(DateUtils.isSameLocalTime(c1, c2));

        c2 = (Calendar) c1.clone();
        c2.set(Calendar.MINUTE, 31);
        Assert.assertFalse(DateUtils.isSameLocalTime(c1, c2));

        c2 = (Calendar) c1.clone();
        c2.set(Calendar.HOUR, (c1.get(Calendar.HOUR) + 1) % 12);
        Assert.assertFalse(DateUtils.isSameLocalTime(c1, c2));

        c2 = (Calendar) c1.clone();
        c2.set(Calendar.DAY_OF_YEAR, c1.get(Calendar.DAY_OF_YEAR) + 1);
        Assert.assertFalse(DateUtils.isSameLocalTime(c1, c2));

        c2 = (Calendar) c1.clone();
        c2.set(Calendar.YEAR, 2024);
        Assert.assertFalse(DateUtils.isSameLocalTime(c1, c2));

        c2 = (Calendar) c1.clone();
        c2.set(Calendar.ERA, GregorianCalendar.BC);
        Assert.assertFalse(DateUtils.isSameLocalTime(c1, c2));
    }

    @Test
    public void isSameLocalTime_givenDifferentClasses_shouldReturnFalse() {
        Calendar c1 = new GregorianCalendar(2023, Calendar.OCTOBER, 10, 15, 30, 45);
        Calendar c2 = new GregorianCalendar(2023, Calendar.OCTOBER, 10, 15, 30, 45) {
            private static final long serialVersionUID = 1L;
        };
        Assert.assertFalse(DateUtils.isSameLocalTime(c1, c2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void isSameLocalTime_givenNullCal1_shouldThrowException() {
        DateUtils.isSameLocalTime(null, Calendar.getInstance());
    }

    @Test(expected = IllegalArgumentException.class)
    public void isSameLocalTime_givenNullCal2_shouldThrowException() {
        DateUtils.isSameLocalTime(Calendar.getInstance(), null);
    }

    // ==========================================
    // parseDate / parseDateStrictly tests
    // ==========================================

    @Test
    public void parseDate_givenValidPattern_shouldParse() throws ParseException {
        String[] patterns = new String[] {"yyyy-MM-dd HH:mm:ss", "yyyy/MM/dd"};
        Date parsed = DateUtils.parseDate("2023-05-15 12:30:00", patterns);
        Calendar cal = Calendar.getInstance();
        cal.setTime(parsed);
        Assert.assertEquals(2023, cal.get(Calendar.YEAR));
        Assert.assertEquals(Calendar.MAY, cal.get(Calendar.MONTH));
        Assert.assertEquals(15, cal.get(Calendar.DAY_OF_MONTH));
        Assert.assertEquals(12, cal.get(Calendar.HOUR_OF_DAY));
    }

    @Test
    public void parseDate_givenPatternEndingWithZZ_shouldParseTimeZoneOffset() throws ParseException {
        String[] patterns = new String[] {"yyyy-MM-dd'T'HH:mm:ssZZ"};
        Date parsed = DateUtils.parseDate("2023-05-15T12:30:00+07:00", patterns);
        Assert.assertNotNull(parsed);
    }

    @Test
    public void parseDate_givenLenientDate_shouldOverflowSuccessfully() throws ParseException {
        String[] patterns = new String[] {"yyyy-MM-dd"};
        Date parsed = DateUtils.parseDate("2023-02-30", patterns);
        Calendar cal = Calendar.getInstance();
        cal.setTime(parsed);
        Assert.assertEquals(Calendar.MARCH, cal.get(Calendar.MONTH));
    }

    @Test(expected = ParseException.class)
    public void parseDateStrictly_givenInvalidDate_shouldThrowParseException() throws ParseException {
        String[] patterns = new String[] {"yyyy-MM-dd"};
        DateUtils.parseDateStrictly("2023-02-30", patterns);
    }

    @Test(expected = ParseException.class)
    public void parseDate_givenUnmatchedPattern_shouldThrowParseException() throws ParseException {
        String[] patterns = new String[] {"yyyy/MM/dd"};
        DateUtils.parseDate("2023-05-15", patterns);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseDate_givenNullStr_shouldThrowException() throws ParseException {
        DateUtils.parseDate(null, new String[] {"yyyy"});
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseDate_givenNullPatterns_shouldThrowException() throws ParseException {
        DateUtils.parseDate("2023", (String[]) null);
    }

    // ==========================================
    // add* tests
    // ==========================================

    @Test
    public void addMethods_givenValidAmounts_shouldAlterFields() {
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 15, 10, 20, 30);
        cal.set(Calendar.MILLISECOND, 100);
        Date base = cal.getTime();

        Date rYear = DateUtils.addYears(base, 1);
        Assert.assertEquals(2024, getField(rYear, Calendar.YEAR));

        Date rMonth = DateUtils.addMonths(base, 2);
        Assert.assertEquals(Calendar.MARCH, getField(rMonth, Calendar.MONTH));

        Date rWeeks = DateUtils.addWeeks(base, 2);
        Assert.assertEquals(29, getField(rWeeks, Calendar.DAY_OF_MONTH));

        Date rDays = DateUtils.addDays(base, 5);
        Assert.assertEquals(20, getField(rDays, Calendar.DAY_OF_MONTH));

        Date rHours = DateUtils.addHours(base, 3);
        Assert.assertEquals(13, getField(rHours, Calendar.HOUR_OF_DAY));

        Date rMins = DateUtils.addMinutes(base, 10);
        Assert.assertEquals(30, getField(rMins, Calendar.MINUTE));

        Date rSecs = DateUtils.addSeconds(base, 15);
        Assert.assertEquals(45, getField(rSecs, Calendar.SECOND));

        Date rMillis = DateUtils.addMilliseconds(base, 200);
        Assert.assertEquals(300, getField(rMillis, Calendar.MILLISECOND));
    }

    @Test(expected = IllegalArgumentException.class)
    public void addYears_givenNullDate_shouldThrowException() {
        DateUtils.addYears(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addMonths_givenNullDate_shouldThrowException() {
        DateUtils.addMonths(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addWeeks_givenNullDate_shouldThrowException() {
        DateUtils.addWeeks(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addDays_givenNullDate_shouldThrowException() {
        DateUtils.addDays(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addHours_givenNullDate_shouldThrowException() {
        DateUtils.addHours(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addMinutes_givenNullDate_shouldThrowException() {
        DateUtils.addMinutes(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addSeconds_givenNullDate_shouldThrowException() {
        DateUtils.addSeconds(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addMilliseconds_givenNullDate_shouldThrowException() {
        DateUtils.addMilliseconds(null, 1);
    }

    // ==========================================
    // set* tests
    // ==========================================

    @Test
    public void setMethods_givenValidValues_shouldUpdateFields() {
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 15, 10, 20, 30);
        cal.set(Calendar.MILLISECOND, 100);
        Date base = cal.getTime();

        Date rYear = DateUtils.setYears(base, 2025);
        Assert.assertEquals(2025, getField(rYear, Calendar.YEAR));

        Date rMonth = DateUtils.setMonths(base, Calendar.AUGUST);
        Assert.assertEquals(Calendar.AUGUST, getField(rMonth, Calendar.MONTH));

        Date rDays = DateUtils.setDays(base, 5);
        Assert.assertEquals(5, getField(rDays, Calendar.DAY_OF_MONTH));

        Date rHours = DateUtils.setHours(base, 4);
        Assert.assertEquals(4, getField(rHours, Calendar.HOUR_OF_DAY));

        Date rMins = DateUtils.setMinutes(base, 55);
        Assert.assertEquals(55, getField(rMins, Calendar.MINUTE));

        Date rSecs = DateUtils.setSeconds(base, 12);
        Assert.assertEquals(12, getField(rSecs, Calendar.SECOND));

        Date rMillis = DateUtils.setMilliseconds(base, 999);
        Assert.assertEquals(999, getField(rMillis, Calendar.MILLISECOND));
    }

    @Test(expected = IllegalArgumentException.class)
    public void setYears_givenNullDate_shouldThrowException() {
        DateUtils.setYears(null, 2023);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setMonths_givenNullDate_shouldThrowException() {
        DateUtils.setMonths(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setDays_givenNullDate_shouldThrowException() {
        DateUtils.setDays(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setHours_givenNullDate_shouldThrowException() {
        DateUtils.setHours(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setMinutes_givenNullDate_shouldThrowException() {
        DateUtils.setMinutes(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setSeconds_givenNullDate_shouldThrowException() {
        DateUtils.setSeconds(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setMilliseconds_givenNullDate_shouldThrowException() {
        DateUtils.setMilliseconds(null, 1);
    }

    // ==========================================
    // toCalendar test
    // ==========================================

    @Test
    public void toCalendar_givenValidDate_shouldMatchTime() {
        Date d = new Date();
        Calendar cal = DateUtils.toCalendar(d);
        Assert.assertEquals(d.getTime(), cal.getTime().getTime());
    }

    // ==========================================
    // round / truncate / ceiling tests
    // ==========================================

    @Test
    public void round_truncate_ceiling_givenDate_shouldModifyCorrectly() {
        Calendar c = new GregorianCalendar(2023, Calendar.JANUARY, 15, 12, 30, 40);
        c.set(Calendar.MILLISECOND, 600);
        Date base = c.getTime();

        Date truncated = DateUtils.truncate(base, Calendar.DATE);
        Date rounded = DateUtils.round(base, Calendar.DATE);
        Date ceiled = DateUtils.ceiling(base, Calendar.DATE);

        Assert.assertEquals(15, getField(truncated, Calendar.DAY_OF_MONTH));
        Assert.assertEquals(0, getField(truncated, Calendar.HOUR_OF_DAY));

        Assert.assertEquals(16, getField(rounded, Calendar.DAY_OF_MONTH));
        Assert.assertEquals(16, getField(ceiled, Calendar.DAY_OF_MONTH));
    }

    @Test
    public void round_truncate_ceiling_givenCalendar_shouldModifyCorrectly() {
        Calendar c = new GregorianCalendar(2023, Calendar.JANUARY, 15, 12, 30, 40);
        c.set(Calendar.MILLISECOND, 200);

        Calendar truncCal = DateUtils.truncate(c, Calendar.HOUR_OF_DAY);
        Assert.assertEquals(0, truncCal.get(Calendar.MINUTE));
        Assert.assertEquals(0, truncCal.get(Calendar.SECOND));
        Assert.assertEquals(0, truncCal.get(Calendar.MILLISECOND));

        Calendar roundCal = DateUtils.round(c, Calendar.MINUTE);
        Assert.assertEquals(31, roundCal.get(Calendar.MINUTE));

        Calendar ceilCal = DateUtils.ceiling(c, Calendar.MINUTE);
        Assert.assertEquals(31, ceilCal.get(Calendar.MINUTE));
    }

    @Test
    public void round_truncate_ceiling_givenObject_shouldDispatchProperly() {
        Date d = new Date();
        Calendar c = Calendar.getInstance();

        Assert.assertNotNull(DateUtils.round((Object) d, Calendar.HOUR));
        Assert.assertNotNull(DateUtils.round((Object) c, Calendar.HOUR));
        Assert.assertNotNull(DateUtils.truncate((Object) d, Calendar.HOUR));
        Assert.assertNotNull(DateUtils.truncate((Object) c, Calendar.HOUR));
        Assert.assertNotNull(DateUtils.ceiling((Object) d, Calendar.HOUR));
        Assert.assertNotNull(DateUtils.ceiling((Object) c, Calendar.HOUR));
    }

    @Test(expected = ClassCastException.class)
    public void round_givenInvalidObjectType_shouldThrowClassCastException() {
        DateUtils.round("invalid", Calendar.HOUR);
    }

    @Test(expected = ClassCastException.class)
    public void truncate_givenInvalidObjectType_shouldThrowClassCastException() {
        DateUtils.truncate("invalid", Calendar.HOUR);
    }

    @Test(expected = ClassCastException.class)
    public void ceiling_givenInvalidObjectType_shouldThrowClassCastException() {
        DateUtils.ceiling("invalid", Calendar.HOUR);
    }

    @Test(expected = IllegalArgumentException.class)
    public void round_givenNullDate_shouldThrowException() {
        DateUtils.round((Date) null, Calendar.HOUR);
    }

    @Test(expected = IllegalArgumentException.class)
    public void round_givenNullCalendar_shouldThrowException() {
        DateUtils.round((Calendar) null, Calendar.HOUR);
    }

    @Test(expected = IllegalArgumentException.class)
    public void round_givenNullObject_shouldThrowException() {
        DateUtils.round((Object) null, Calendar.HOUR);
    }

    @Test(expected = IllegalArgumentException.class)
    public void truncate_givenNullDate_shouldThrowException() {
        DateUtils.truncate((Date) null, Calendar.HOUR);
    }

    @Test(expected = IllegalArgumentException.class)
    public void truncate_givenNullCalendar_shouldThrowException() {
        DateUtils.truncate((Calendar) null, Calendar.HOUR);
    }

    @Test(expected = IllegalArgumentException.class)
    public void truncate_givenNullObject_shouldThrowException() {
        DateUtils.truncate((Object) null, Calendar.HOUR);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ceiling_givenNullDate_shouldThrowException() {
        DateUtils.ceiling((Date) null, Calendar.HOUR);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ceiling_givenNullCalendar_shouldThrowException() {
        DateUtils.ceiling((Calendar) null, Calendar.HOUR);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ceiling_givenNullObject_shouldThrowException() {
        DateUtils.ceiling((Object) null, Calendar.HOUR);
    }

    @Test(expected = ArithmeticException.class)
    public void modify_givenYearTooLarge_shouldThrowArithmeticException() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 280000001);
        DateUtils.truncate(cal, Calendar.DAY_OF_MONTH);
    }

    @Test
    public void modify_givenMillisecondField_shouldReturnWithoutModifying() {
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 15, 10, 20, 30);
        cal.set(Calendar.MILLISECOND, 123);
        Calendar result = DateUtils.truncate(cal, Calendar.MILLISECOND);
        Assert.assertEquals(123, result.get(Calendar.MILLISECOND));
    }

    @Test
    public void modify_givenSemiMonth_shouldHandleBranches() {
        // Ceiling at day 1 -> day 16
        Calendar c1 = new GregorianCalendar(2023, Calendar.JANUARY, 1, 0, 0, 0);
        Calendar res1 = DateUtils.ceiling(c1, DateUtils.SEMI_MONTH);
        Assert.assertEquals(16, res1.get(Calendar.DATE));

        // Ceiling at day 16 -> next month day 1
        Calendar c2 = new GregorianCalendar(2023, Calendar.JANUARY, 16, 0, 0, 0);
        Calendar res2 = DateUtils.ceiling(c2, DateUtils.SEMI_MONTH);
        Assert.assertEquals(1, res2.get(Calendar.DATE));
        Assert.assertEquals(Calendar.FEBRUARY, res2.get(Calendar.MONTH));

        // Round up on semi-month (day 9 > 7 -> round up to 16)
        Calendar c3 = new GregorianCalendar(2023, Calendar.JANUARY, 9, 0, 0, 0);
        Calendar res3 = DateUtils.round(c3, DateUtils.SEMI_MONTH);
        Assert.assertEquals(16, res3.get(Calendar.DATE));

        // Round down on semi-month (day 5 -> round down to 1)
        Calendar c4 = new GregorianCalendar(2023, Calendar.JANUARY, 5, 0, 0, 0);
        Calendar res4 = DateUtils.round(c4, DateUtils.SEMI_MONTH);
        Assert.assertEquals(1, res4.get(Calendar.DATE));

        // Round up in second half of month (day 25 -> offset 24 - 15 = 9 > 7 -> round up to next month day 1)
        Calendar c5 = new GregorianCalendar(2023, Calendar.JANUARY, 25, 0, 0, 0);
        Calendar res5 = DateUtils.round(c5, DateUtils.SEMI_MONTH);
        Assert.assertEquals(1, res5.get(Calendar.DATE));
        Assert.assertEquals(Calendar.FEBRUARY, res5.get(Calendar.MONTH));
    }

    @Test
    public void modify_givenAmPm_shouldHandleBranches() {
        // Ceiling at midnight (hour 0) -> hour 12
        Calendar c1 = new GregorianCalendar(2023, Calendar.JANUARY, 1, 0, 0, 0);
        Calendar res1 = DateUtils.ceiling(c1, Calendar.AM_PM);
        Assert.assertEquals(12, res1.get(Calendar.HOUR_OF_DAY));

        // Ceiling at noon (hour 12) -> next day hour 0
        Calendar c2 = new GregorianCalendar(2023, Calendar.JANUARY, 1, 12, 0, 0);
        Calendar res2 = DateUtils.ceiling(c2, Calendar.AM_PM);
        Assert.assertEquals(0, res2.get(Calendar.HOUR_OF_DAY));
        Assert.assertEquals(2, res2.get(Calendar.DATE));

        // Round AM: hour 6 >= 6 -> round up to 12
        Calendar c3 = new GregorianCalendar(2023, Calendar.JANUARY, 1, 6, 0, 0);
        Calendar res3 = DateUtils.round(c3, Calendar.AM_PM);
        Assert.assertEquals(12, res3.get(Calendar.HOUR_OF_DAY));

        // Round AM: hour 5 < 6 -> round down to 0
        Calendar c4 = new GregorianCalendar(2023, Calendar.JANUARY, 1, 5, 0, 0);
        Calendar res4 = DateUtils.round(c4, Calendar.AM_PM);
        Assert.assertEquals(0, res4.get(Calendar.HOUR_OF_DAY));

        // Round PM: hour 18 -> offset 18 - 12 = 6 >= 6 -> round up to next day 0
        Calendar c5 = new GregorianCalendar(2023, Calendar.JANUARY, 1, 18, 0, 0);
        Calendar res5 = DateUtils.round(c5, Calendar.AM_PM);
        Assert.assertEquals(0, res5.get(Calendar.HOUR_OF_DAY));
        Assert.assertEquals(2, res5.get(Calendar.DATE));
    }

    @Test(expected = IllegalArgumentException.class)
    public void modify_givenUnsupportedField_shouldThrowIllegalArgumentException() {
        Calendar cal = Calendar.getInstance();
        DateUtils.truncate(cal, -999);
    }

    // ==========================================
    // iterator tests
    // ==========================================

    @Test
    public void iterator_givenMonthRanges_shouldIterateCorrectRange() {
        Calendar cal = new GregorianCalendar(2023, Calendar.OCTOBER, 15);

        Iterator<Calendar> itSunday = DateUtils.iterator(cal, DateUtils.RANGE_MONTH_SUNDAY);
        Assert.assertTrue(itSunday.hasNext());
        Calendar firstSun = itSunday.next();
        Assert.assertEquals(Calendar.SUNDAY, firstSun.get(Calendar.DAY_OF_WEEK));

        Iterator<Calendar> itMonday = DateUtils.iterator(cal, DateUtils.RANGE_MONTH_MONDAY);
        Assert.assertTrue(itMonday.hasNext());
        Calendar firstMon = itMonday.next();
        Assert.assertEquals(Calendar.MONDAY, firstMon.get(Calendar.DAY_OF_WEEK));
    }

    @Test
    public void iterator_givenWeekRanges_shouldIterateCorrectRange() {
        Calendar cal = new GregorianCalendar(2023, Calendar.OCTOBER, 18); // Wednesday

        Iterator<Calendar> itSun = DateUtils.iterator(cal, DateUtils.RANGE_WEEK_SUNDAY);
        Assert.assertEquals(Calendar.SUNDAY, itSun.next().get(Calendar.DAY_OF_WEEK));

        Iterator<Calendar> itMon = DateUtils.iterator(cal, DateUtils.RANGE_WEEK_MONDAY);
        Assert.assertEquals(Calendar.MONDAY, itMon.next().get(Calendar.DAY_OF_WEEK));

        Iterator<Calendar> itRel = DateUtils.iterator(cal, DateUtils.RANGE_WEEK_RELATIVE);
        Assert.assertEquals(cal.get(Calendar.DAY_OF_WEEK), itRel.next().get(Calendar.DAY_OF_WEEK));

        Iterator<Calendar> itCenter = DateUtils.iterator(cal, DateUtils.RANGE_WEEK_CENTER);
        Assert.assertNotNull(itCenter.next());
    }

    @Test
    public void iterator_givenDateAndObjectOverloads_shouldIterateCorrectly() {
        Date d = new GregorianCalendar(2023, Calendar.OCTOBER, 18).getTime();
        Calendar c = new GregorianCalendar(2023, Calendar.OCTOBER, 18);

        Iterator<Calendar> itDate = DateUtils.iterator(d, DateUtils.RANGE_WEEK_SUNDAY);
        Assert.assertTrue(itDate.hasNext());

        Iterator<?> itObjDate = DateUtils.iterator((Object) d, DateUtils.RANGE_WEEK_SUNDAY);
        Assert.assertTrue(itObjDate.hasNext());

        Iterator<?> itObjCal = DateUtils.iterator((Object) c, DateUtils.RANGE_WEEK_SUNDAY);
        Assert.assertTrue(itObjCal.hasNext());
    }

    @Test(expected = ClassCastException.class)
    public void iterator_givenUnsupportedObject_shouldThrowClassCastException() {
        DateUtils.iterator("not a date", DateUtils.RANGE_WEEK_SUNDAY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void iterator_givenNullDate_shouldThrowException() {
        DateUtils.iterator((Date) null, DateUtils.RANGE_WEEK_SUNDAY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void iterator_givenNullCalendar_shouldThrowException() {
        DateUtils.iterator((Calendar) null, DateUtils.RANGE_WEEK_SUNDAY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void iterator_givenNullObject_shouldThrowException() {
        DateUtils.iterator((Object) null, DateUtils.RANGE_WEEK_SUNDAY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void iterator_givenInvalidRangeStyle_shouldThrowException() {
        DateUtils.iterator(Calendar.getInstance(), 9999);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void iterator_removeOperation_shouldThrowException() {
        Iterator<Calendar> it = DateUtils.iterator(Calendar.getInstance(), DateUtils.RANGE_WEEK_SUNDAY);
        it.remove();
    }

    @Test(expected = NoSuchElementException.class)
    public void iterator_exhausted_shouldThrowNoSuchElementException() {
        Iterator<Calendar> it = DateUtils.iterator(Calendar.getInstance(), DateUtils.RANGE_WEEK_SUNDAY);
        while (it.hasNext()) {
            it.next();
        }
        it.next();
    }

    // ==========================================
    // getFragment* tests
    // ==========================================

    @Test
    public void getFragment_givenCalendarAndDate_shouldCalculateCorrectly() {
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 2, 3, 4, 5);
        cal.set(Calendar.MILLISECOND, 6);
        Date d = cal.getTime();

        Assert.assertEquals(DateUtils.getFragmentInMilliseconds(cal, Calendar.SECOND), 6L);
        Assert.assertEquals(DateUtils.getFragmentInMilliseconds(d, Calendar.SECOND), 6L);

        Assert.assertEquals(DateUtils.getFragmentInSeconds(cal, Calendar.MINUTE), 5L);
        Assert.assertEquals(DateUtils.getFragmentInSeconds(d, Calendar.MINUTE), 5L);

        Assert.assertEquals(DateUtils.getFragmentInMinutes(cal, Calendar.HOUR_OF_DAY), 4L);
        Assert.assertEquals(DateUtils.getFragmentInMinutes(d, Calendar.HOUR_OF_DAY), 4L);

        Assert.assertEquals(DateUtils.getFragmentInHours(cal, Calendar.DATE), 3L);
        Assert.assertEquals(DateUtils.getFragmentInHours(d, Calendar.DATE), 3L);

        Assert.assertEquals(DateUtils.getFragmentInDays(cal, Calendar.MONTH), 2L);
        Assert.assertEquals(DateUtils.getFragmentInDays(d, Calendar.MONTH), 2L);

        Assert.assertEquals(DateUtils.getFragmentInDays(cal, Calendar.YEAR), 2L);
        Assert.assertEquals(DateUtils.getFragmentInDays(d, Calendar.YEAR), 2L);

        Assert.assertEquals(0L, DateUtils.getFragmentInMilliseconds(cal, Calendar.MILLISECOND));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getFragment_givenNullDate_shouldThrowException() {
        DateUtils.getFragmentInDays((Date) null, Calendar.YEAR);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getFragment_givenNullCalendar_shouldThrowException() {
        DateUtils.getFragmentInDays((Calendar) null, Calendar.YEAR);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getFragment_givenUnsupportedFragment_shouldThrowException() {
        DateUtils.getFragmentInDays(Calendar.getInstance(), Calendar.ERA);
    }

    // ==========================================
    // truncatedEquals & truncatedCompareTo tests
    // ==========================================

    @Test
    public void truncatedEquals_and_truncatedCompareTo_shouldBehaveConsistently() {
        Calendar c1 = new GregorianCalendar(2023, Calendar.MARCH, 15, 10, 20, 30);
        Calendar c2 = new GregorianCalendar(2023, Calendar.MARCH, 15, 10, 45, 50);

        Assert.assertTrue(DateUtils.truncatedEquals(c1, c2, Calendar.HOUR_OF_DAY));
        Assert.assertFalse(DateUtils.truncatedEquals(c1, c2, Calendar.MINUTE));
        Assert.assertEquals(0, DateUtils.truncatedCompareTo(c1, c2, Calendar.HOUR_OF_DAY));
        Assert.assertTrue(DateUtils.truncatedCompareTo(c1, c2, Calendar.MINUTE) < 0);

        Date d1 = c1.getTime();
        Date d2 = c2.getTime();
        Assert.assertTrue(DateUtils.truncatedEquals(d1, d2, Calendar.HOUR_OF_DAY));
        Assert.assertFalse(DateUtils.truncatedEquals(d1, d2, Calendar.MINUTE));
        Assert.assertEquals(0, DateUtils.truncatedCompareTo(d1, d2, Calendar.HOUR_OF_DAY));
        Assert.assertTrue(DateUtils.truncatedCompareTo(d1, d2, Calendar.MINUTE) < 0);
    }

    // ==========================================
    // Helper method
    // ==========================================

    private static int getField(Date date, int field) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c.get(field);
    }
}