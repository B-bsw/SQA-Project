package org.apache.commons.lang.time;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.TimeZone;

public class DateUtilsTest {

    private Calendar calendar;
    private Date date;

    @Before
    public void setUp() {
        calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(2023, Calendar.JANUARY, 15, 10, 30, 45);
        date = calendar.getTime();
    }

    @After
    public void tearDown() {
        calendar = null;
        date = null;
    }

    @Test
    public void testIsSameDayWithDates() {
        Date date1 = new Date();
        Date date2 = new Date();
        assertTrue(DateUtils.isSameDay(date1, date2));
        
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(date1);
        cal1.add(Calendar.DAY_OF_MONTH, 1);
        Date date3 = cal1.getTime();
        assertFalse(DateUtils.isSameDay(date1, date3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDayWithNullDate() {
        DateUtils.isSameDay(null, new Date());
    }

    @Test
    public void testIsSameDayWithCalendars() {
        Calendar cal1 = Calendar.getInstance();
        cal1.clear();
        cal1.set(2023, Calendar.JANUARY, 15);
        Calendar cal2 = Calendar.getInstance();
        cal2.clear();
        cal2.set(2023, Calendar.JANUARY, 15);
        assertTrue(DateUtils.isSameDay(cal1, cal2));
        
        cal2.add(Calendar.DAY_OF_MONTH, 1);
        assertFalse(DateUtils.isSameDay(cal1, cal2));
    }

    @Test
    public void testIsSameDayWithNullCalendars() {
        assertFalse(DateUtils.isSameDay(null, null));
        assertFalse(DateUtils.isSameDay(Calendar.getInstance(), null));
    }

    @Test
    public void testIsSameInstantWithDates() {
        Date date1 = new Date();
        Date date2 = new Date(date1.getTime());
        assertTrue(DateUtils.isSameInstant(date1, date2));
        
        Date date3 = new Date(date1.getTime() + 1000);
        assertFalse(DateUtils.isSameInstant(date1, date3));
    }

    @Test
    public void testIsSameInstantWithCalendars() {
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        assertTrue(DateUtils.isSameInstant(cal1, cal2));
        
        cal2.add(Calendar.MINUTE, 1);
        assertFalse(DateUtils.isSameInstant(cal1, cal2));
    }

    @Test
    public void testIsSameLocalTime() {
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = (Calendar) cal1.clone();
        assertTrue(DateUtils.isSameLocalTime(cal1, cal2));
        
        cal2.add(Calendar.HOUR_OF_DAY, 1);
        assertFalse(DateUtils.isSameLocalTime(cal1, cal2));
    }

    @Test
    public void testIsSameLocalTimeWithDifferentClasses() {
        Calendar cal1 = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date d = sdf.parse("2023-01-15 10:30:45");
            Calendar cal2 = new java.util.GregorianCalendar();
            cal2.setTime(d);
            assertTrue(DateUtils.isSameLocalTime(cal1, cal2));
        } catch (ParseException e) {
            fail("Unexpected ParseException");
        }
    }

    @Test
    public void testParseDate() throws ParseException {
        String[] patterns = {"yyyy-MM-dd", "yyyy/MM/dd"};
        Date parsed = DateUtils.parseDate("2023-01-15", patterns);
        Calendar cal = Calendar.getInstance();
        cal.setTime(parsed);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(Calendar.JANUARY, cal.get(Calendar.MONTH));
        assertEquals(15, cal.get(Calendar.DAY_OF_MONTH));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseDateWithNullString() throws ParseException {
        DateUtils.parseDate(null, new String[]{"yyyy-MM-dd"});
    }

    @Test(expected = ParseException.class)
    public void testParseDateWithInvalidPattern() throws ParseException {
        DateUtils.parseDate("2023-01-15", new String[]{"MM/dd/yyyy"});
    }

    @Test
    public void testAddYears() {
        Date result = DateUtils.addYears(date, 2);
        Calendar cal = Calendar.getInstance();
        cal.setTime(result);
        assertEquals(2025, cal.get(Calendar.YEAR));
        assertEquals(Calendar.JANUARY, cal.get(Calendar.MONTH));
        assertEquals(15, cal.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testAddDays() {
        Date result = DateUtils.addDays(date, 10);
        Calendar cal = Calendar.getInstance();
        cal.setTime(result);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(Calendar.JANUARY, cal.get(Calendar.MONTH));
        assertEquals(25, cal.get(Calendar.DAY_OF_MONTH));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddWithNullDate() {
        DateUtils.add(null, Calendar.YEAR, 1);
    }

    @Test
    public void testTruncateDate() {
        Date truncated = DateUtils.truncate(date, Calendar.MONTH);
        Calendar cal = Calendar.getInstance();
        cal.setTime(truncated);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(Calendar.JANUARY, cal.get(Calendar.MONTH));
        assertEquals(1, cal.get(Calendar.DAY_OF_MONTH));
        assertEquals(0, cal.get(Calendar.HOUR_OF_DAY));
        assertEquals(0, cal.get(Calendar.MINUTE));
        assertEquals(0, cal.get(Calendar.SECOND));
    }

    @Test
    public void testTruncateCalendar() {
        Calendar input = Calendar.getInstance();
        input.setTime(date);
        Calendar truncated = DateUtils.truncate(input, Calendar.DAY_OF_MONTH);
        assertEquals(0, truncated.get(Calendar.HOUR_OF_DAY));
        assertEquals(0, truncated.get(Calendar.MINUTE));
        assertEquals(0, truncated.get(Calendar.SECOND));
        assertEquals(0, truncated.get(Calendar.MILLISECOND));
    }

    @Test
    public void testRoundDate() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MINUTE, 15);
        Date rounded = DateUtils.round(cal.getTime(), Calendar.HOUR);
        cal.setTime(rounded);
        assertEquals(11, cal.get(Calendar.HOUR_OF_DAY));
        assertEquals(0, cal.get(Calendar.MINUTE));
    }

    @Test
    public void testRoundCalendar() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MINUTE, 20);
        Calendar rounded = DateUtils.round(cal, Calendar.HOUR);
        assertEquals(11, rounded.get(Calendar.HOUR_OF_DAY));
        assertEquals(0, rounded.get(Calendar.MINUTE));
    }

    @Test
    public void testRoundObject() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MINUTE, 15);
        Date rounded = DateUtils.round((Object) cal.getTime(), Calendar.HOUR);
        cal.setTime(rounded);
        assertEquals(11, cal.get(Calendar.HOUR_OF_DAY));
    }

    @Test(expected = ClassCastException.class)
    public void testRoundWithInvalidObject() {
        DateUtils.round(new Object(), Calendar.YEAR);
    }

    @Test
    public void testIteratorWithDate() {
        Iterator iterator = DateUtils.iterator(date, DateUtils.RANGE_WEEK_SUNDAY);
        assertNotNull(iterator);
        assertTrue(iterator.hasNext());
        int count = 0;
        while (iterator.hasNext()) {
            iterator.next();
            count++;
        }
        assertEquals(8, count);
    }

    @Test
    public void testIteratorWithCalendar() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        Iterator iterator = DateUtils.iterator(cal, DateUtils.RANGE_WEEK_MONDAY);
        assertNotNull(iterator);
        assertTrue(iterator.hasNext());
        int count = 0;
        while (iterator.hasNext()) {
            iterator.next();
            count++;
        }
        assertEquals(8, count);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIteratorWithNullFocus() {
        DateUtils.iterator((Date) null, DateUtils.RANGE_WEEK_SUNDAY);
    }

    @Test(expected = ClassCastException.class)
    public void testIteratorWithInvalidObject() {
        DateUtils.iterator(new Object(), DateUtils.RANGE_WEEK_SUNDAY);
    }

    @Test
    public void testIteratorNextAndRemove() {
        Iterator iterator = DateUtils.iterator(date, DateUtils.RANGE_WEEK_SUNDAY);
        assertNotNull(iterator.next());
        try {
            iterator.remove();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    @Test(expected = NoSuchElementException.class)
    public void testIteratorNextAtEnd() {
        Calendar end = (Calendar) calendar.clone();
        end.add(Calendar.DATE, 1);
        DateUtils.DateIterator iterator = new DateUtils.DateIterator((Calendar) calendar.clone(), end);
        iterator.next();
        iterator.next();
    }

    @Test
    public void testTruncateObjectDate() {
        Date truncated = DateUtils.truncate((Object) date, Calendar.DAY_OF_MONTH);
        Calendar cal = Calendar.getInstance();
        cal.setTime(truncated);
        assertEquals(0, cal.get(Calendar.HOUR_OF_DAY));
        assertEquals(0, cal.get(Calendar.MINUTE));
    }

    @Test
    public void testTruncateObjectCalendar() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        Date truncated = DateUtils.truncate((Object) cal, Calendar.DAY_OF_MONTH);
        Calendar result = Calendar.getInstance();
        result.setTime(truncated);
        assertEquals(0, result.get(Calendar.HOUR_OF_DAY));
    }

    @Test(expected = ClassCastException.class)
    public void testTruncateObjectInvalid() {
        DateUtils.truncate(new Object(), Calendar.DAY_OF_MONTH);
    }
}