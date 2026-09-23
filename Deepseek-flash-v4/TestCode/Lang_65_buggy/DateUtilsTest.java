package org.apache.commons.lang.time;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.util.*;
import java.text.*;

public class DateUtilsTest {
    private Date date1;
    private Date date2;
    private Calendar cal1;
    private Calendar cal2;

    @Before
    public void setUp() {
        Calendar c1 = Calendar.getInstance();
        c1.set(2023, Calendar.JANUARY, 15, 10, 30, 45);
        c1.set(Calendar.MILLISECOND, 100);
        date1 = c1.getTime();
        cal1 = (Calendar) c1.clone();
        
        Calendar c2 = Calendar.getInstance();
        c2.set(2023, Calendar.JANUARY, 15, 10, 30, 45);
        c2.set(Calendar.MILLISECOND, 200);
        date2 = c2.getTime();
        cal2 = (Calendar) c2.clone();
    }

    @After
    public void tearDown() {
        date1 = null;
        date2 = null;
        cal1 = null;
        cal2 = null;
    }

    @Test
    public void testIsSameDay_NullDates_ThrowsException() {
        try {
            DateUtils.isSameDay((Date) null, date2);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            DateUtils.isSameDay(date1, (Date) null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testIsSameDay_SameDate_ReturnsTrue() {
        assertTrue(DateUtils.isSameDay(date1, date1));
        assertTrue(DateUtils.isSameDay(date1, date2));
    }

    @Test
    public void testIsSameDay_DifferentDay_ReturnsFalse() {
        Calendar c3 = Calendar.getInstance();
        c3.set(2023, Calendar.JANUARY, 16, 10, 30, 45);
        assertFalse(DateUtils.isSameDay(date1, c3.getTime()));
    }

    @Test
    public void testIsSameDay_Calendar_Null_ThrowsException() {
        try {
            DateUtils.isSameDay((Calendar) null, cal2);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testIsSameDay_Calendar_SameDay_ReturnsTrue() {
        Calendar c2Clone = (Calendar) cal2.clone();
        c2Clone.add(Calendar.MILLISECOND, 1);
        assertTrue(DateUtils.isSameDay(cal1, c2Clone));
    }

    @Test
    public void testIsSameInstant_DifferentMillis_ReturnsFalse() {
        assertFalse(DateUtils.isSameInstant(date1, date2));
    }

    @Test
    public void testIsSameInstant_SameMillis_ReturnsTrue() {
        assertTrue(DateUtils.isSameInstant(date1, date1));
    }

    @Test
    public void testIsSameLocalTime_DifferentMillis_SameFields_ReturnsTrue() {
        assertTrue(DateUtils.isSameLocalTime(cal1, cal2));
    }

    @Test
    public void testIsSameLocalTime_DifferentDay_ReturnsFalse() {
        Calendar c3 = (Calendar) cal1.clone();
        c3.add(Calendar.DATE, 1);
        assertFalse(DateUtils.isSameLocalTime(cal1, c3));
    }

    @Test
    public void testParseDate_NullInput_ThrowsException() {
        try {
            DateUtils.parseDate(null, new String[]{"yyyy-MM-dd"});
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            DateUtils.parseDate("2023-01-15", null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test(expected = ParseException.class)
    public void testParseDate_InvalidDate_ThrowsParseException() throws Exception {
        DateUtils.parseDate("invalid", new String[]{"yyyy-MM-dd"});
    }

    @Test
    public void testParseDate_ValidDate_ReturnsDate() throws Exception {
        Date result = DateUtils.parseDate("2023-01-15", new String[]{"yyyy-MM-dd"});
        assertNotNull(result);
        assertEquals(2023, result.getYear() + 1900);
    }

    @Test
    public void testParseDate_MultiplePatterns_SecondMatch() throws Exception {
        Date result = DateUtils.parseDate("15/01/2023", 
            new String[]{"yyyy-MM-dd", "dd/MM/yyyy"});
        assertNotNull(result);
        assertEquals(15, result.getDate());
        assertEquals(0, result.getMonth());
    }

    @Test
    public void testAddYears_NullDate_ThrowsException() {
        try {
            DateUtils.addYears(null, 1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testAddYears_PositiveAmount_IncrementsYear() {
        Date result = DateUtils.addYears(date1, 1);
        assertEquals(2024, result.getYear() + 1900);
    }

    @Test
    public void testAddDays_ZeroAmount_ReturnsSameDay() {
        Date result = DateUtils.addDays(date1, 0);
        Calendar c = Calendar.getInstance();
        c.setTime(result);
        assertEquals(15, c.get(Calendar.DAY_OF_MONTH));
        assertEquals(10, c.get(Calendar.HOUR_OF_DAY));
    }

    @Test
    public void testAddDays_CrossMonthBoundary() {
        Calendar c = Calendar.getInstance();
        c.set(2023, Calendar.JANUARY, 31);
        Date result = DateUtils.addDays(c.getTime(), 1);
        Calendar resultCal = Calendar.getInstance();
        resultCal.setTime(result);
        assertEquals(1, resultCal.get(Calendar.DAY_OF_MONTH));
        assertEquals(Calendar.FEBRUARY, resultCal.get(Calendar.MONTH));
    }

    @Test
    public void testAddHours_EdgeOfDay() {
        Date result = DateUtils.addHours(date1, -10);
        Calendar c = Calendar.getInstance();
        c.setTime(result);
        assertEquals(0, c.get(Calendar.HOUR_OF_DAY));
    }

    @Test
    public void testAddMinutes_MidnightBoundary() {
        Calendar c = Calendar.getInstance();
        c.set(2023, Calendar.JANUARY, 15, 0, 0, 0);
        Date result = DateUtils.addMinutes(c.getTime(), -1);
        Calendar resultCal = Calendar.getInstance();
        resultCal.setTime(result);
        assertEquals(59, resultCal.get(Calendar.MINUTE));
        assertEquals(23, resultCal.get(Calendar.HOUR_OF_DAY));
        assertEquals(14, resultCal.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testAddSeconds_LeapYearDate() {
        Calendar c = Calendar.getInstance();
        c.set(2024, Calendar.FEBRUARY, 28, 23, 59, 59);
        Date result = DateUtils.addSeconds(c.getTime(), 1);
        Calendar resultCal = Calendar.getInstance();
        resultCal.setTime(result);
        assertEquals(29, resultCal.get(Calendar.DAY_OF_MONTH));
        assertEquals(0, resultCal.get(Calendar.SECOND));
    }

    @Test
    public void testTruncate_DateField() {
        Date truncated = DateUtils.truncate(date1, Calendar.DATE);
        Calendar c = Calendar.getInstance();
        c.setTime(truncated);
        assertEquals(0, c.get(Calendar.HOUR_OF_DAY));
        assertEquals(0, c.get(Calendar.MINUTE));
        assertEquals(0, c.get(Calendar.SECOND));
    }

    @Test
    public void testTruncate_MonthField() {
        Date truncated = DateUtils.truncate(date1, Calendar.MONTH);
        Calendar c = Calendar.getInstance();
        c.setTime(truncated);
        assertEquals(1, c.get(Calendar.DAY_OF_MONTH));
        assertEquals(0, c.get(Calendar.HOUR_OF_DAY));
    }

    @Test
    public void testTruncate_NullDate_ThrowsException() {
        try {
            DateUtils.truncate((Date) null, Calendar.DATE);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testTruncate_NullCalendar_ThrowsException() {
        try {
            DateUtils.truncate((Calendar) null, Calendar.DATE);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testRound_Date() {
        Calendar c = Calendar.getInstance();
        c.set(2023, Calendar.JANUARY, 15, 12, 30, 0);
        Date rounded = DateUtils.round(c.getTime(), Calendar.HOUR);
        Calendar resultCal = Calendar.getInstance();
        resultCal.setTime(rounded);
        assertEquals(13, resultCal.get(Calendar.HOUR_OF_DAY));
        assertEquals(0, resultCal.get(Calendar.MINUTE));
    }

    @Test
    public void testRound_CalendarFieldLessThanHalf() {
        Calendar c = Calendar.getInstance();
        c.set(2023, Calendar.JANUARY, 15, 10, 20, 0);
        Calendar rounded = DateUtils.round(c, Calendar.MINUTE);
        assertEquals(10, rounded.get(Calendar.HOUR_OF_DAY));
        assertEquals(20, rounded.get(Calendar.MINUTE));
    }

    @Test
    public void testRound_Object_Date() {
        Calendar c = Calendar.getInstance();
        c.set(2023, Calendar.JANUARY, 15, 10, 30, 0);
        Date rounded = DateUtils.round((Object) c.getTime(), Calendar.HOUR);
        assertEquals(11, rounded.getHours());
    }

    @Test
    public void testRound_Object_Calendar() {
        Calendar c = Calendar.getInstance();
        c.set(2023, Calendar.JANUARY, 15, 10, 30, 0);
        Date result = DateUtils.round((Object) c, Calendar.HOUR);
        assertEquals(11, result.getHours());
    }

    @Test
    public void testRound_Object_InvalidType_ThrowsException() {
        try {
            DateUtils.round(new StringBuilder("test"), Calendar.HOUR);
            fail("Expected ClassCastException");
        } catch (ClassCastException e) {
            // expected
        }
    }

    @Test
    public void testIterator_Date_WeekRange() {
        Iterator it = DateUtils.iterator(date1, DateUtils.RANGE_WEEK_SUNDAY);
        assertNotNull(it);
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(7, count);
    }

    @Test
    public void testIterator_Calendar_WeekRange() {
        Iterator it = DateUtils.iterator(cal1, DateUtils.RANGE_WEEK_MONDAY);
        assertNotNull(it);
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertTrue(count >= 5 && count <= 7);
    }

    @Test
    public void testIterator_NullDate_ThrowsException() {
        try {
            DateUtils.iterator((Date) null, DateUtils.RANGE_WEEK_SUNDAY);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testIterator_InvalidRangeStyle_ThrowsException() {
        try {
            DateUtils.iterator(date1, 999);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testIterator_Object_Date() {
        Iterator it = DateUtils.iterator((Object) date1, DateUtils.RANGE_WEEK_SUNDAY);
        assertNotNull(it);
        assertTrue(it.hasNext());
        it.next();
        assertTrue(it.hasNext());
    }

    @Test
    public void testIterator_Object_Calendar() {
        Iterator it = DateUtils.iterator((Object) cal1, DateUtils.RANGE_WEEK_SUNDAY);
        assertNotNull(it);
        assertTrue(it.hasNext());
        it.next();
        assertTrue(it.hasNext());
    }

    @Test
    public void testIterator_Object_InvalidType_ThrowsException() {
        try {
            DateUtils.iterator(new StringBuilder("test"), DateUtils.RANGE_WEEK_SUNDAY);
            fail("Expected ClassCastException");
        } catch (ClassCastException e) {
            // expected
        }
    }

    @Test
    public void testIterator_next_AtEnd_ThrowsNoSuchElement() {
        Iterator it = DateUtils.iterator(date1, DateUtils.RANGE_WEEK_SUNDAY);
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(7, count);
        try {
            it.next();
            fail("Expected NoSuchElementException");
        } catch (NoSuchElementException e) {
            // expected
        }
    }

    @Test
    public void testIterator_remove_ThrowsUnsupportedOperation() {
        Iterator it = DateUtils.iterator(date1, DateUtils.RANGE_WEEK_SUNDAY);
        try {
            it.remove();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testTruncate_Calendar_TwelveHours() {
        Calendar c = Calendar.getInstance();
        c.set(2023, Calendar.JANUARY, 15, 12, 30, 45);
        Calendar result = DateUtils.truncate(c, Calendar.DATE);
        assertEquals(0, result.get(Calendar.HOUR_OF_DAY));
        assertEquals(0, result.get(Calendar.MINUTE));
        assertEquals(0, result.get(Calendar.SECOND));
    }

    @Test
    public void testTruncate_Calendar_Hour() {
        Calendar c = Calendar.getInstance();
        c.set(2023, Calendar.JANUARY, 15, 12, 30, 45);
        Calendar result = DateUtils.truncate(c, Calendar.HOUR);
        assertEquals(12, result.get(Calendar.HOUR_OF_DAY));
        assertEquals(0, result.get(Calendar.MINUTE));
        assertEquals(0, result.get(Calendar.SECOND));
    }

    @Test
    public void testRound_Date_Month() {
        Calendar c = Calendar.getInstance();
        c.set(2023, Calendar.JANUARY, 20, 10, 0, 0);
        Date rounded = DateUtils.round(c.getTime(), Calendar.MONTH);
        Calendar resultCal = Calendar.getInstance();
        resultCal.setTime(rounded);
        assertEquals(Calendar.FEBRUARY, resultCal.get(Calendar.MONTH));
        assertEquals(1, resultCal.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testRound_Date_Year() {
        Calendar c = Calendar.getInstance();
        c.set(2023, Calendar.JULY, 15, 10, 0, 0);
        Date rounded = DateUtils.round(c.getTime(), Calendar.YEAR);
        Calendar resultCal = Calendar.getInstance();
        resultCal.setTime(rounded);
        assertEquals(2024, resultCal.get(Calendar.YEAR));
        assertEquals(1, resultCal.get(Calendar.DAY_OF_MONTH));
        assertEquals(Calendar.JANUARY, resultCal.get(Calendar.MONTH));
    }

    @Test
    public void testTruncate_Object_Date() {
        Object obj = date1;
        Date truncated = DateUtils.truncate(obj, Calendar.DATE);
        assertEquals(10, truncated.getHours());
    }

    @Test
    public void testTruncate_Object_Calendar() {
        Calendar c = Calendar.getInstance();
        c.set(2023, Calendar.JANUARY, 15, 10, 30, 45);
        Calendar result = DateUtils.truncate((Object) c, Calendar.DATE);
        assertEquals(0, result.get(Calendar.HOUR_OF_DAY));
        assertEquals(0, result.get(Calendar.MINUTE));
        assertEquals(0, result.get(Calendar.SECOND));
    }

    @Test
    public void testTruncate_Object_InvalidType_ThrowsException() {
        try {
            DateUtils.truncate(new StringBuilder("test"), Calendar.DATE);
            fail("Expected ClassCastException");
        } catch (ClassCastException e) {
            // expected
        }
    }

    @Test
    public void testIterator_Date_RangeWeekCenter() {
        Calendar c = Calendar.getInstance();
        c.set(2023, Calendar.JANUARY, 15);
        Iterator it = DateUtils.iterator(c.getTime(), DateUtils.RANGE_WEEK_CENTER);
        assertNotNull(it);
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(7, count);
    }

    @Test
    public void testIterator_Date_RangeWeekRelative() {
        Calendar c = Calendar.getInstance();
        c.set(2023, Calendar.JANUARY, 15);
        Iterator it = DateUtils.iterator(c.getTime(), DateUtils.RANGE_WEEK_RELATIVE);
        assertNotNull(it);
        int count = 0;
        while (it.hasNext()) {
            Object next = it.next();
            assertTrue(next instanceof Calendar);
            count++;
        }
        assertEquals(7, count);
    }
}