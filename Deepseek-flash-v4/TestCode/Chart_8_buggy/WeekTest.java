package org.jfree.data.time;

import org.junit.Before;
import org.junit.Test;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import static org.junit.Assert.*;

public class WeekTest {

    private Week week;
    private static final int DEFAULT_YEAR = 2007;
    private static final int DEFAULT_WEEK = 15;

    @Before
    public void setUp() {
        Calendar calendar = new GregorianCalendar(DEFAULT_YEAR, Calendar.JANUARY, 1);
        calendar.set(Calendar.WEEK_OF_YEAR, DEFAULT_WEEK);
        week = new Week(DEFAULT_WEEK, DEFAULT_YEAR);
    }

    @Test
    public void testConstructorWithWeekAndYear() {
        Week w = new Week(10, 2020);
        assertEquals(10, w.getWeek());
        assertEquals(2020, w.getYearValue());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithInvalidWeek() {
        new Week(0, 2020);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithWeekTooHigh() {
        new Week(54, 2020);
    }

    @Test
    public void testConstructorWithDate() {
        Calendar cal = Calendar.getInstance();
        cal.set(2007, Calendar.APRIL, 9); // April 9, 2007
        Week w = new Week(cal.getTime());
        assertEquals(15, w.getWeek());
        assertEquals(2007, w.getYearValue());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithNullDate() {
        new Week((Date) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithNullTimeZone() {
        new Week(new Date(), (TimeZone) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithNullLocale() {
        new Week(new Date(), TimeZone.getDefault(), null);
    }

    @Test
    public void testGetYear() {
        assertEquals(new Year(DEFAULT_YEAR), week.getYear());
    }

    @Test
    public void testGetYearValue() {
        assertEquals(DEFAULT_YEAR, week.getYearValue());
    }

    @Test
    public void testGetWeek() {
        assertEquals(DEFAULT_WEEK, week.getWeek());
    }

    @Test
    public void testGetFirstMillisecond() {
        Calendar cal = Calendar.getInstance();
        cal.set(DEFAULT_YEAR, Calendar.JANUARY, 1);
        cal.set(Calendar.WEEK_OF_YEAR, DEFAULT_WEEK);
        cal.set(Calendar.DAY_OF_WEEK, cal.getFirstDayOfWeek());
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        long expected = cal.getTimeInMillis();
        assertTrue(week.getFirstMillisecond() <= expected);
    }

    @Test
    public void testGetLastMillisecond() {
        assertTrue(week.getLastMillisecond() > week.getFirstMillisecond());
    }

    @Test
    public void testPeg() {
        Calendar cal = Calendar.getInstance();
        cal.set(DEFAULT_YEAR, Calendar.JANUARY, 1);
        week.peg(cal);
        assertNotNull(week);
    }

    @Test
    public void testPrevious() {
        Week prev = (Week) week.previous();
        assertNotNull(prev);
        if (DEFAULT_WEEK > 1) {
            assertEquals(DEFAULT_WEEK - 1, prev.getWeek());
            assertEquals(DEFAULT_YEAR, prev.getYearValue());
        }
    }

    @Test
    public void testNext() {
        Week next = (Week) week.next();
        assertNotNull(next);
        if (DEFAULT_WEEK < 52) {
            assertEquals(DEFAULT_WEEK + 1, next.getWeek());
            assertEquals(DEFAULT_YEAR, next.getYearValue());
        }
    }

    @Test
    public void testGetSerialIndex() {
        long expected = DEFAULT_YEAR * 53L + DEFAULT_WEEK;
        assertEquals(expected, week.getSerialIndex());
    }

    @Test
    public void testToString() {
        assertEquals("Week 15, 2007", week.toString());
    }

    @Test
    public void testEquals() {
        Week w1 = new Week(DEFAULT_WEEK, DEFAULT_YEAR);
        Week w2 = new Week(DEFAULT_WEEK, DEFAULT_YEAR);
        Week w3 = new Week(DEFAULT_WEEK + 1, DEFAULT_YEAR);
        Week w4 = new Week(DEFAULT_WEEK, DEFAULT_YEAR + 1);

        assertTrue(w1.equals(w1));
        assertTrue(w1.equals(w2));
        assertFalse(w1.equals(null));
        assertFalse(w1.equals("Not a week"));
        assertFalse(w1.equals(w3));
        assertFalse(w1.equals(w4));
    }

    @Test
    public void testHashCode() {
        Week w1 = new Week(DEFAULT_WEEK, DEFAULT_YEAR);
        Week w2 = new Week(DEFAULT_WEEK, DEFAULT_YEAR);
        assertEquals(w1.hashCode(), w2.hashCode());
    }

    @Test
    public void testCompareTo() {
        Week w1 = new Week(DEFAULT_WEEK, DEFAULT_YEAR);
        Week w2 = new Week(DEFAULT_WEEK, DEFAULT_YEAR);
        Week w3 = new Week(DEFAULT_WEEK + 1, DEFAULT_YEAR);
        Week w4 = new Week(DEFAULT_WEEK, DEFAULT_YEAR + 1);

        assertEquals(0, w1.compareTo(w2));
        assertTrue(w1.compareTo(w3) < 0);
        assertTrue(w3.compareTo(w1) > 0);
        assertTrue(w1.compareTo(w4) < 0);
        assertTrue(w4.compareTo(w1) > 0);
    }

    @Test
    public void testCompareToNonWeek() {
        assertTrue(week.compareTo(new Object()) > 0);
    }

    @Test
    public void testParseWeek() {
        Week parsed = Week.parseWeek("Week 15, 2007");
        assertNotNull(parsed);
        assertEquals(DEFAULT_WEEK, parsed.getWeek());
        assertEquals(DEFAULT_YEAR, parsed.getYearValue());

        assertNull(Week.parseWeek(null));
        assertNull(Week.parseWeek("invalid"));
    }

    @Test
    public void testWeekAtYearBoundary() {
        Calendar cal = Calendar.getInstance();
        cal.set(2007, Calendar.DECEMBER, 30); // Sunday of week 1 in 2008 per some calendars
        Week w = new Week(cal.getTime());
        assertNotNull(w);
    }

    @Test
    public void testWeek53() {
        Calendar cal = Calendar.getInstance();
        cal.set(2007, Calendar.DECEMBER, 31);
        Week w = new Week(53, 2007);
        assertEquals(53, w.getWeek());
        assertEquals(2007, w.getYearValue());
    }
}