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

public class FastDateFormatTest {
    private FastDateFormat format;
    private static final TimeZone UTC = TimeZone.getTimeZone("UTC");
    private static final TimeZone GMT_PLUS_2 = TimeZone.getTimeZone("GMT+02:00");

    @Before
    public void setUp() {
        format = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss", UTC);
    }

    @After
    public void tearDown() {
        format = null;
    }

    @Test
    public void testGetInstanceWithPattern() {
        FastDateFormat fmt = FastDateFormat.getInstance("yyyy");
        assertNotNull(fmt);
        assertEquals("yyyy", fmt.getPattern());
    }

    @Test
    public void testGetInstanceWithNullPattern() {
        try {
            FastDateFormat.getInstance(null);
            fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("The pattern must not be null", e.getMessage());
        }
    }

    @Test
    public void testGetInstanceCacheReuse() {
        FastDateFormat fmt1 = FastDateFormat.getInstance("yyyy-MM-dd");
        FastDateFormat fmt2 = FastDateFormat.getInstance("yyyy-MM-dd");
        assertSame(fmt1, fmt2);
    }

    @Test
    public void testGetDateInstanceWithStyle() {
        FastDateFormat fmt = FastDateFormat.getDateInstance(FastDateFormat.FULL);
        assertNotNull(fmt);
        assertTrue(fmt.getPattern().length() > 0);
    }

    @Test
    public void testGetTimeInstanceWithStyle() {
        FastDateFormat fmt = FastDateFormat.getTimeInstance(FastDateFormat.LONG);
        assertNotNull(fmt);
        assertTrue(fmt.getPattern().length() > 0);
    }

    @Test
    public void testGetDateTimeInstance() {
        FastDateFormat fmt = FastDateFormat.getDateTimeInstance(FastDateFormat.SHORT, FastDateFormat.MEDIUM);
        assertNotNull(fmt);
        assertTrue(fmt.getPattern().length() > 0);
    }

    @Test
    public void testFormatLong() {
        long millis = 86400000L;
        String result = format.format(millis);
        assertEquals("1970-01-02 00:00:00", result);
    }

    @Test
    public void testFormatDate() {
        Date date = new Date(0L);
        String result = format.format(date);
        assertEquals("1970-01-01 00:00:00", result);
    }

    @Test
    public void testFormatCalendar() {
        Calendar cal = new GregorianCalendar(UTC);
        cal.set(2023, Calendar.JANUARY, 15, 10, 30, 45);
        String result = format.format(cal);
        assertEquals("2023-01-15 10:30:45", result);
    }

    @Test
    public void testFormatWithTimeZoneForced() {
        FastDateFormat fmt = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss", GMT_PLUS_2);
        Calendar cal = new GregorianCalendar(UTC);
        cal.set(2023, Calendar.JANUARY, 15, 10, 30, 45);
        String result = fmt.format(cal);
        assertEquals("2023-01-15 12:30:45", result);
    }

    @Test
    public void testFormatWithInvalidObject() {
        try {
            format.format(new Object(), new StringBuffer(), null);
            fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testFormatWithStringBuffer() {
        StringBuffer buf = new StringBuffer();
        FastDateFormat fmt = FastDateFormat.getInstance("yyyy-MM-dd", UTC);
        Calendar cal = new GregorianCalendar(UTC);
        cal.set(2023, Calendar.MAY, 20);
        StringBuffer result = fmt.format(cal, buf);
        assertSame(buf, result);
        assertEquals("2023-05-20", result.toString());
    }

    @Test
    public void testFormatWithLongAndBuffer() {
        StringBuffer buf = new StringBuffer("prefix-");
        FastDateFormat fmt = FastDateFormat.getInstance("yyyy", UTC);
        StringBuffer result = fmt.format(0L, buf);
        assertSame(buf, result);
        assertEquals("prefix-1970", result.toString());
    }

    @Test
    public void testGetTimeZone() {
        assertSame(UTC, format.getTimeZone());
    }

    @Test
    public void testGetTimeZoneOverridesCalendar() {
        FastDateFormat fmt = FastDateFormat.getInstance("yyyy", UTC);
        assertTrue(fmt.getTimeZoneOverridesCalendar());
        FastDateFormat defaultFmt = FastDateFormat.getInstance("yyyy");
        assertFalse(defaultFmt.getTimeZoneOverridesCalendar());
    }

    @Test
    public void testGetLocale() {
        FastDateFormat fmt = FastDateFormat.getInstance("yyyy", Locale.US);
        assertEquals(Locale.US, fmt.getLocale());
    }

    @Test
    public void testGetMaxLengthEstimate() {
        assertTrue(format.getMaxLengthEstimate() > 0);
    }

    @Test
    public void testEquals() {
        FastDateFormat fmt1 = FastDateFormat.getInstance("yyyy-MM-dd");
        FastDateFormat fmt2 = FastDateFormat.getInstance("yyyy-MM-dd");
        assertTrue(fmt1.equals(fmt2));
        assertFalse(format.equals(null));
        assertFalse(format.equals("string"));
        assertFalse(format.equals(new Object()));
    }

    @Test
    public void testHashCode() {
        FastDateFormat fmt1 = FastDateFormat.getInstance("yyyy-MM-dd");
        FastDateFormat fmt2 = FastDateFormat.getInstance("yyyy-MM-dd");
        assertEquals(fmt1.hashCode(), fmt2.hashCode());
    }

    @Test
    public void testToString() {
        String str = format.toString();
        assertEquals("FastDateFormat[yyyy-MM-dd HH:mm:ss]", str);
    }

    @Test
    public void testFormatWithPatterns() {
        FastDateFormat fmt = FastDateFormat.getInstance("EEE, MMM d H:mm:ss z", UTC);
        Calendar cal = new GregorianCalendar(UTC);
        cal.set(2023, Calendar.DECEMBER, 25, 15, 30, 45);
        String result = fmt.format(cal);
        assertTrue(result.contains("Mon"));
        assertTrue(result.contains("Dec"));
        assertTrue(result.contains("15:30:45"));
        assertTrue(result.contains("UTC"));
    }

    @Test
    public void testFormatWithEra() {
        FastDateFormat fmt = FastDateFormat.getInstance("yyyy G", UTC);
        Calendar cal = new GregorianCalendar(UTC);
        cal.set(2023, Calendar.JANUARY, 1);
        assertTrue(fmt.format(cal).contains("AD"));
    }

    @Test
    public void testFormatWithHourFields() {
        FastDateFormat fmt12 = FastDateFormat.getInstance("hh", UTC);
        FastDateFormat fmt24 = FastDateFormat.getInstance("HH", UTC);
        FastDateFormat fmtK = FastDateFormat.getInstance("K", UTC);
        FastDateFormat fmtk = FastDateFormat.getInstance("k", UTC);
        Calendar cal = new GregorianCalendar(UTC);
        cal.set(2023, Calendar.JANUARY, 1, 0, 0, 0);
        assertEquals("12", fmt12.format(cal));
        assertEquals("00", fmt24.format(cal));
        assertEquals("0", fmtK.format(cal));
        assertEquals("24", fmtk.format(cal));
    }

    @Test
    public void testFormatWithMinuteSecondMillis() {
        FastDateFormat fmt = FastDateFormat.getInstance("mm:ss:SSS", UTC);
        Calendar cal = new GregorianCalendar(UTC);
        cal.set(2023, Calendar.JANUARY, 1, 10, 5, 7);
        cal.set(Calendar.MILLISECOND, 123);
        assertEquals("05:07:123", fmt.format(cal));
    }

    @Test
    public void testFormatWithDayOfWeekInMonth() {
        FastDateFormat fmt = FastDateFormat.getInstance("F", UTC);
        Calendar cal = new GregorianCalendar(UTC);
        cal.set(2023, Calendar.JANUARY, 15);
        assertEquals("3", fmt.format(cal));
    }

    @Test
    public void testFormatWithWeekOfYear() {
        FastDateFormat fmt = FastDateFormat.getInstance("ww", UTC);
        Calendar cal = new GregorianCalendar(UTC);
        cal.set(2023, Calendar.JANUARY, 1);
        assertEquals("01", fmt.format(cal));
    }

    @Test
    public void testFormatWithTimeZoneStyle() {
        FastDateFormat fmtShort = FastDateFormat.getInstance("z", UTC);
        FastDateFormat fmtLong = FastDateFormat.getInstance("zzzz", UTC);
        Calendar cal = new GregorianCalendar(UTC);
        cal.set(2023, Calendar.JANUARY, 1);
        assertTrue(fmtShort.format(cal).length() > 0);
        assertTrue(fmtLong.format(cal).length() > fmtShort.format(cal).length());
    }

    @Test
    public void testParseObjectReturnsNull() {
        assertNull(format.parseObject("invalid", new java.text.ParsePosition(0)));
    }
}