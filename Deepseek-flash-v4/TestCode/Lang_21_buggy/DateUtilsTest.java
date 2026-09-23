package org.apache.commons.lang3.time;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.TimeZone;

public class DateUtilsTest {
    private Calendar cal1;
    private Calendar cal2;
    private Date date1;
    private Date date2;

    @Before
    public void setUp() {
        cal1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal1.set(2023, Calendar.JANUARY, 15, 10, 30, 45);
        cal1.set(Calendar.MILLISECOND, 123);
        cal2 = (Calendar) cal1.clone();
        date1 = cal1.getTime();
        date2 = cal2.getTime();
    }

    @After
    public void tearDown() {
        cal1 = null;
        cal2 = null;
        date1 = null;
        date2 = null;
    }

    @Test
    public void testIsSameDay_Date_Equal() {
        assertTrue(DateUtils.isSameDay(date1, (Date) cal2.getTime()));
    }

    @Test
    public void testIsSameDay_Date_Different() {
        cal2.set(Calendar.DAY_OF_MONTH, 16);
        assertFalse(DateUtils.isSameDay(date1, cal2.getTime()));
    }

    @Test
    public void testIsSameDay_Date_Null() {
        try {
            DateUtils.isSameDay((Date) null, date2);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testIsSameDay_Calendar_Equal() {
        assertTrue(DateUtils.isSameDay(cal1, cal2));
    }

    @Test
    public void testIsSameDay_Calendar_Different() {
        cal2.set(Calendar.YEAR, 2024);
        assertFalse(DateUtils.isSameDay(cal1, cal2));
    }

    @Test
    public void testIsSameDay_Calendar_Null() {
        assertFalse(DateUtils.isSameDay(null, cal2));
        assertFalse(DateUtils.isSameDay(cal1, null));
    }

    @Test
    public void testIsSameInstant_Date() {
        assertTrue(DateUtils.isSameInstant(date1, cal2.getTime()));
    }

    @Test
    public void testIsSameInstant_Calendar() {
        assertTrue(DateUtils.isSameInstant(cal1, cal2));
    }

    @Test
    public void testIsSameLocalTime() {
        assertTrue(DateUtils.isSameLocalTime(cal1, cal2));
        cal2.set(Calendar.MILLISECOND, 124);
        assertFalse(DateUtils.isSameLocalTime(cal1, cal2));
    }

    @Test
    public void testParseDate() throws ParseException {
        Date parsed = DateUtils.parseDate("2023-01-15", "yyyy-MM-dd", "MM/dd/yyyy");
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.set(2023, Calendar.JANUARY, 15, 0, 0, 0);
        cal.set(Calendar.MILLISECOND, 0);
        assertEquals(cal.getTime(), parsed);
    }

    @Test
    public void testParseDate_NullInput() {
        try {
            DateUtils.parseDate(null, "yyyy-MM-dd");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testParseDate_InvalidPattern() throws ParseException {
        try {
            DateUtils.parseDate("notadate", "yyyy-MM-dd");
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testAddYears() {
        Date result = DateUtils.addYears(date1, 1);
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.setTime(result);
        assertEquals(2024, cal.get(Calendar.YEAR));
    }

    @Test
    public void testAddMonths() {
        Date result = DateUtils.addMonths(date1, 2);
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.setTime(result);
        assertEquals(Calendar.MARCH, cal.get(Calendar.MONTH));
    }

    @Test
    public void testAddWeeks() {
        Date result = DateUtils.addWeeks(date1, 2);
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.setTime(result);
        assertEquals(29, cal.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testAddDays() {
        Date result = DateUtils.addDays(date1, 1);
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.setTime(result);
        assertEquals(16, cal.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testAddHours() {
        Date result = DateUtils.addHours(date1, 1);
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.setTime(result);
        assertEquals(11, cal.get(Calendar.HOUR_OF_DAY));
    }

    @Test
    public void testAddMinutes() {
        Date result = DateUtils.addMinutes(date1, 10);
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.setTime(result);
        assertEquals(40, cal.get(Calendar.MINUTE));
    }

    @Test
    public void testAddSeconds() {
        Date result = DateUtils.addSeconds(date1, 15);
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.setTime(result);
        assertEquals(0, cal.get(Calendar.SECOND));
    }

    @Test
    public void testAddMilliseconds() {
        Date result = DateUtils.addMilliseconds(date1, 100);
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.setTime(result);
        assertEquals(223, cal.get(Calendar.MILLISECOND));
    }

    @Test
    public void testSetYears() {
        Date result = DateUtils.setYears(date1, 2030);
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.setTime(result);
        assertEquals(2030, cal.get(Calendar.YEAR));
    }

    @Test
    public void testSetMonths() {
        Date result = DateUtils.setMonths(date1, Calendar.DECEMBER);
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.setTime(result);
        assertEquals(Calendar.DECEMBER, cal.get(Calendar.MONTH));
    }

    @Test
    public void testSetDays() {
        Date result = DateUtils.setDays(date1, 20);
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.setTime(result);
        assertEquals(20, cal.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testSetHours() {
        Date result = DateUtils.setHours(date1, 15);
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.setTime(result);
        assertEquals(15, cal.get(Calendar.HOUR_OF_DAY));
    }

    @Test
    public void testSetMinutes() {
        Date result = DateUtils.setMinutes(date1, 50);
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.setTime(result);
        assertEquals(50, cal.get(Calendar.MINUTE));
    }

    @Test
    public void testSetSeconds() {
        Date result = DateUtils.setSeconds(date1, 30);
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.setTime(result);
        assertEquals(30, cal.get(Calendar.SECOND));
    }

    @Test
    public void testSetMilliseconds() {
        Date result = DateUtils.setMilliseconds(date1, 500);
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.setTime(result);
        assertEquals(500, cal.get(Calendar.MILLISECOND));
    }

    @Test
    public void testToCalendar() {
        Calendar cal = DateUtils.toCalendar(date1);
        assertEquals(cal1.getTime(), cal.getTime());
    }

    @Test
    public void testGetFragmentInMilliseconds_Date() {
        long result = DateUtils.getFragmentInMilliseconds(date1, Calendar.YEAR);
        assertTrue(result >= 0);
    }

    @Test
    public void testGetFragmentInSeconds_Calendar() {
        long result = DateUtils.getFragmentInSeconds(cal1, Calendar.MINUTE);
        assertEquals(45, result);
    }

    @Test
    public void testGetFragmentInMinutes_Calendar() {
        long result = DateUtils.getFragmentInMinutes(cal1, Calendar.HOUR_OF_DAY);
        assertEquals(30, result);
    }

    @Test
    public void testGetFragmentInHours_Calendar() {
        long result = DateUtils.getFragmentInHours(cal1, Calendar.DAY_OF_YEAR);
        assertEquals(10, result);
    }

    @Test
    public void testGetFragmentInDays_Calendar() {
        long result = DateUtils.getFragmentInDays(cal1, Calendar.MONTH);
        assertEquals(14, result);
    }

    @Test
    public void testGetFragment_NullDate() {
        try {
            DateUtils.getFragmentInMilliseconds((Date) null, Calendar.YEAR);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testIterator_Date() {
        Iterator<?> it = DateUtils.iterator(date1, DateUtils.RANGE_WEEK_SUNDAY);
        assertNotNull(it);
        assertTrue(it.hasNext());
        while (it.hasNext()) {
            assertNotNull(it.next());
        }
    }

    @Test
    public void testIterator_Calendar() {
        Iterator<?> it = DateUtils.iterator(cal1, DateUtils.RANGE_MONTH_MONDAY);
        assertNotNull(it);
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertTrue(count >= 28);
    }

    @Test
    public void testIterator_NullDate() {
        try {
            DateUtils.iterator((Date) null, DateUtils.RANGE_WEEK_SUNDAY);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testTruncatedEquals_Calendar() {
        Calendar cal3 = (Calendar) cal1.clone();
        cal3.set(Calendar.MILLISECOND, 999);
        assertTrue(DateUtils.truncatedEquals(cal1, cal3, Calendar.SECOND));
    }

    @Test
    public void testTruncatedEquals_Date() {
        Date date3 = new Date(date1.getTime() + 500);
        assertTrue(DateUtils.truncatedEquals(date1, date3, Calendar.SECOND));
    }

    @Test
    public void testTruncatedCompareTo_Calendar() {
        Calendar cal3 = (Calendar) cal1.clone();
        cal3.add(Calendar.DAY_OF_MONTH, 1);
        assertTrue(DateUtils.truncatedCompareTo(cal1, cal3, Calendar.DAY_OF_YEAR) < 0);
    }

    @Test
    public void testTruncate() {
        Date truncated = DateUtils.truncate(date1, Calendar.DAY_OF_MONTH);
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.setTime(truncated);
        assertEquals(0, cal.get(Calendar.HOUR_OF_DAY));
        assertEquals(0, cal.get(Calendar.MINUTE));
    }

    @Test
    public void testCeiling() {
        Date ceiled = DateUtils.ceiling(date1, Calendar.HOUR_OF_DAY);
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.setTime(ceiled);
        assertEquals(11, cal.get(Calendar.HOUR_OF_DAY));
        assertEquals(0, cal.get(Calendar.MINUTE));
    }

    @Test
    public void testRound_Date() {
        Date rounded = DateUtils.round(date1, Calendar.MINUTE);
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.setTime(rounded);
        assertEquals(10, cal.get(Calendar.HOUR_OF_DAY));
        assertEquals(31, cal.get(Calendar.MINUTE));
    }

    @Test
    public void testRound_Object() {
        Object obj = date1;
        Date rounded = DateUtils.round(obj, Calendar.MINUTE);
        assertNotNull(rounded);
        obj = cal1;
        Calendar roundedCal = DateUtils.round((Calendar) obj, Calendar.MINUTE);
        assertNotNull(roundedCal);
    }

    @Test
    public void testDateIterator_NoSuchElement() {
        Iterator<?> it = DateUtils.iterator(date1, DateUtils.RANGE_WEEK_SUNDAY);
        while (it.hasNext()) {
            it.next();
        }
        try {
            it.next();
            fail("Expected NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testDateIterator_Remove() {
        Iterator<?> it = DateUtils.iterator(date1, DateUtils.RANGE_WEEK_SUNDAY);
        try {
            it.remove();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertNotNull(e.getMessage());
        }
    }
}