package org.apache.commons.lang3.time;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class FastDatePrinterTest {

    private static final TimeZone UTC = TimeZone.getTimeZone("UTC");
    private static final Locale US = Locale.US;
    private FastDatePrinter printer;

    @Before
    public void setUp() {
        printer = new FastDatePrinter("yyyy-MM-dd HH:mm:ss", UTC, US);
    }

    @After
    public void tearDown() {
        printer = null;
    }

    @Test
    public void testFormatLong() {
        long millis = 0L;
        String result = printer.format(millis);
        assertEquals("1970-01-01 00:00:00", result);
    }

    @Test
    public void testFormatDate() {
        Date date = new Date(86400000L);
        String result = printer.format(date);
        assertEquals("1970-01-02 00:00:00", result);
    }

    @Test
    public void testFormatCalendar() {
        Calendar cal = new GregorianCalendar(UTC, US);
        cal.set(2020, Calendar.FEBRUARY, 29, 12, 30, 45);
        String result = printer.format(cal);
        assertEquals("2020-02-29 12:30:45", result);
    }

    @Test
    public void testFormatLongBuffer() {
        StringBuffer buf = new StringBuffer();
        printer.format(86400000L, buf);
        assertEquals("1970-01-02 00:00:00", buf.toString());
    }

    @Test
    public void testFormatDateBuffer() {
        Date date = new Date(0L);
        StringBuffer buf = new StringBuffer();
        printer.format(date, buf);
        assertEquals("1970-01-01 00:00:00", buf.toString());
    }

    @Test
    public void testFormatCalendarBuffer() {
        Calendar cal = new GregorianCalendar(UTC, US);
        cal.set(2021, Calendar.DECEMBER, 31, 23, 59, 59);
        StringBuffer buf = new StringBuffer();
        printer.format(cal, buf);
        assertEquals("2021-12-31 23:59:59", buf.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatInvalidObject() {
        printer.format(new Object(), new StringBuffer(), null);
    }

    @Test
    public void testFormatNullObject() {
        try {
            printer.format(null, new StringBuffer(), null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Unknown class"));
        }
    }

    @Test
    public void testFormatLongObject() {
        StringBuffer buf = new StringBuffer();
        printer.format(0L, buf, null);
        assertEquals("1970-01-01 00:00:00", buf.toString());
    }

    @Test
    public void testFormatDateObject() {
        StringBuffer buf = new StringBuffer();
        printer.format(new Date(86400000L), buf, null);
        assertEquals("1970-01-02 00:00:00", buf.toString());
    }

    @Test
    public void testGetPattern() {
        assertEquals("yyyy-MM-dd HH:mm:ss", printer.getPattern());
    }

    @Test
    public void testGetTimeZone() {
        assertEquals(UTC, printer.getTimeZone());
    }

    @Test
    public void testGetLocale() {
        assertEquals(US, printer.getLocale());
    }

    @Test
    public void testGetMaxLengthEstimate() {
        assertTrue(printer.getMaxLengthEstimate() > 0);
    }

    @Test
    public void testEquals() {
        FastDatePrinter other = new FastDatePrinter("yyyy-MM-dd HH:mm:ss", UTC, US);
        assertEquals(printer, other);
    }

    @Test
    public void testEqualsDifferentPattern() {
        FastDatePrinter other = new FastDatePrinter("yyyy/MM/dd", UTC, US);
        assertFalse(printer.equals(other));
    }

    @Test
    public void testEqualsDifferentTimeZone() {
        FastDatePrinter other = new FastDatePrinter("yyyy-MM-dd HH:mm:ss", TimeZone.getTimeZone("GMT"), US);
        assertFalse(printer.equals(other));
    }

    @Test
    public void testEqualsDifferentLocale() {
        FastDatePrinter other = new FastDatePrinter("yyyy-MM-dd HH:mm:ss", UTC, Locale.UK);
        assertFalse(printer.equals(other));
    }

    @Test
    public void testEqualsNonNullNonInstance() {
        assertFalse(printer.equals("some string"));
    }

    @Test
    public void testHashCode() {
        FastDatePrinter other = new FastDatePrinter("yyyy-MM-dd HH:mm:ss", UTC, US);
        assertEquals(printer.hashCode(), other.hashCode());
    }

    @Test
    public void testToString() {
        String expected = "FastDatePrinter[yyyy-MM-dd HH:mm:ss,en_US,UTC]";
        assertEquals(expected, printer.toString());
    }

    @Test
    public void testFormatSingleDigit() {
        FastDatePrinter p = new FastDatePrinter("M/d/yy", UTC, US);
        Calendar cal = new GregorianCalendar(2001, Calendar.JANUARY, 1, 0, 0);
        assertEquals("1/1/01", p.format(cal));
    }

    @Test
    public void testFormatSingleDigitMilli() {
        FastDatePrinter p = new FastDatePrinter("S", UTC, US);
        Calendar cal = new GregorianCalendar(2001, Calendar.JANUARY, 1, 0, 0, 0);
        cal.set(Calendar.MILLISECOND, 5);
        assertEquals("5", p.format(cal));
    }

    @Test
    public void testFormatTwoDigitMilli() {
        FastDatePrinter p = new FastDatePrinter("SS", UTC, US);
        Calendar cal = new GregorianCalendar(2001, Calendar.JANUARY, 1, 0, 0, 0);
        cal.set(Calendar.MILLISECOND, 5);
        assertEquals("05", p.format(cal));
    }

    @Test
    public void testFormatPaddedMilli() {
        FastDatePrinter p = new FastDatePrinter("SSS", UTC, US);
        Calendar cal = new GregorianCalendar(2001, Calendar.JANUARY, 1, 0, 0, 0);
        cal.set(Calendar.MILLISECOND, 5);
        assertEquals("005", p.format(cal));
    }

    @Test
    public void testFormatTwelveHourMidnight() {
        FastDatePrinter p = new FastDatePrinter("h", UTC, US);
        Calendar cal = new GregorianCalendar(2001, Calendar.JANUARY, 1, 0, 0, 0);
        assertEquals("12", p.format(cal));
    }

    @Test
    public void testFormatTwelveHourNoon() {
        FastDatePrinter p = new FastDatePrinter("h", UTC, US);
        Calendar cal = new GregorianCalendar(2001, Calendar.JANUARY, 1, 12, 0, 0);
        assertEquals("12", p.format(cal));
    }

    @Test
    public void testFormatTwentyFourHour() {
        FastDatePrinter p = new FastDatePrinter("k", UTC, US);
        Calendar cal = new GregorianCalendar(2001, Calendar.JANUARY, 1, 0, 0, 0);
        assertEquals("24", p.format(cal));
    }

    @Test
    public void testFormatTwentyFourHourAfterMidnight() {
        FastDatePrinter p = new FastDatePrinter("k", UTC, US);
        Calendar cal = new GregorianCalendar(2001, Calendar.JANUARY, 1, 1, 0, 0);
        assertEquals("1", p.format(cal));
    }
}