package org.apache.commons.lang3.time;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class FastDateFormatTest {
    
    private FastDateFormat format;
    private TimeZone originalTimeZone;
    private Locale originalLocale;
    
    @Before
    public void setUp() {
        originalTimeZone = TimeZone.getDefault();
        originalLocale = Locale.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("GMT"));
        Locale.setDefault(Locale.US);
    }
    
    @After
    public void tearDown() {
        TimeZone.setDefault(originalTimeZone);
        Locale.setDefault(originalLocale);
    }
    
    @Test
    public void testGetInstanceDefault() {
        FastDateFormat instance = FastDateFormat.getInstance();
        assertNotNull(instance);
        assertNotNull(instance.getPattern());
        assertEquals(TimeZone.getDefault(), instance.getTimeZone());
        assertEquals(Locale.getDefault(), instance.getLocale());
        assertFalse(instance.getTimeZoneOverridesCalendar());
    }
    
    @Test
    public void testGetInstanceWithNullPattern() {
        try {
            FastDateFormat.getInstance(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }
    
    @Test
    public void testGetInstanceWithPattern() {
        FastDateFormat instance = FastDateFormat.getInstance("yyyy-MM-dd");
        assertNotNull(instance);
        assertEquals("yyyy-MM-dd", instance.getPattern());
    }
    
    @Test
    public void testGetInstanceWithPatternAndTimeZone() {
        TimeZone tz = TimeZone.getTimeZone("America/New_York");
        FastDateFormat instance = FastDateFormat.getInstance("yyyy", tz);
        assertNotNull(instance);
        assertEquals(tz, instance.getTimeZone());
        assertTrue(instance.getTimeZoneOverridesCalendar());
    }
    
    @Test
    public void testGetInstanceWithPatternAndLocale() {
        Locale locale = Locale.FRANCE;
        FastDateFormat instance = FastDateFormat.getInstance("yyyy", locale);
        assertNotNull(instance);
        assertEquals(locale, instance.getLocale());
        assertNotNull(instance.getPattern());
    }
    
    @Test
    public void testGetDateInstanceShort() {
        FastDateFormat instance = FastDateFormat.getDateInstance(FastDateFormat.SHORT);
        assertNotNull(instance);
        assertNotNull(instance.getPattern());
    }
    
    @Test
    public void testGetDateInstanceMedium() {
        FastDateFormat instance = FastDateFormat.getDateInstance(FastDateFormat.MEDIUM);
        assertNotNull(instance);
        assertNotNull(instance.getPattern());
    }
    
    @Test
    public void testGetDateInstanceLong() {
        FastDateFormat instance = FastDateFormat.getDateInstance(FastDateFormat.LONG);
        assertNotNull(instance);
        assertNotNull(instance.getPattern());
    }
    
    @Test
    public void testGetDateInstanceFull() {
        FastDateFormat instance = FastDateFormat.getDateInstance(FastDateFormat.FULL);
        assertNotNull(instance);
        assertNotNull(instance.getPattern());
    }
    
    @Test
    public void testGetDateInstanceWithLocale() {
        FastDateFormat instance = FastDateFormat.getDateInstance(FastDateFormat.SHORT, Locale.UK);
        assertNotNull(instance);
        assertEquals(Locale.UK, instance.getLocale());
    }
    
    @Test
    public void testGetDateInstanceWithTimeZone() {
        TimeZone tz = TimeZone.getTimeZone("PST");
        FastDateFormat instance = FastDateFormat.getDateInstance(FastDateFormat.SHORT, tz);
        assertNotNull(instance);
        assertEquals(tz, instance.getTimeZone());
    }
    
    @Test
    public void testGetTimeInstanceShort() {
        FastDateFormat instance = FastDateFormat.getTimeInstance(FastDateFormat.SHORT);
        assertNotNull(instance);
        assertNotNull(instance.getPattern());
    }
    
    @Test
    public void testGetTimeInstanceMedium() {
        FastDateFormat instance = FastDateFormat.getTimeInstance(FastDateFormat.MEDIUM);
        assertNotNull(instance);
    }
    
    @Test
    public void testGetTimeInstanceLong() {
        FastDateFormat instance = FastDateFormat.getTimeInstance(FastDateFormat.LONG);
        assertNotNull(instance);
    }
    
    @Test
    public void testGetTimeInstanceFull() {
        FastDateFormat instance = FastDateFormat.getTimeInstance(FastDateFormat.FULL);
        assertNotNull(instance);
    }
    
    @Test
    public void testGetTimeInstanceWithLocale() {
        FastDateFormat instance = FastDateFormat.getTimeInstance(FastDateFormat.SHORT, Locale.GERMANY);
        assertNotNull(instance);
        assertEquals(Locale.GERMANY, instance.getLocale());
    }
    
    @Test
    public void testGetTimeInstanceWithTimeZone() {
        TimeZone tz = TimeZone.getTimeZone("EST");
        FastDateFormat instance = FastDateFormat.getTimeInstance(FastDateFormat.SHORT, tz);
        assertNotNull(instance);
        assertEquals(tz, instance.getTimeZone());
    }
    
    @Test
    public void testGetDateTimeInstanceShortShort() {
        FastDateFormat instance = FastDateFormat.getDateTimeInstance(FastDateFormat.SHORT, FastDateFormat.SHORT);
        assertNotNull(instance);
    }
    
    @Test
    public void testGetDateTimeInstanceMediumShort() {
        FastDateFormat instance = FastDateFormat.getDateTimeInstance(FastDateFormat.MEDIUM, FastDateFormat.SHORT);
        assertNotNull(instance);
    }
    
    @Test
    public void testGetDateTimeInstanceLongMedium() {
        FastDateFormat instance = FastDateFormat.getDateTimeInstance(FastDateFormat.LONG, FastDateFormat.MEDIUM);
        assertNotNull(instance);
    }
    
    @Test
    public void testGetDateTimeInstanceFullLong() {
        FastDateFormat instance = FastDateFormat.getDateTimeInstance(FastDateFormat.FULL, FastDateFormat.LONG);
        assertNotNull(instance);
    }
    
    @Test
    public void testGetDateTimeInstanceWithLocale() {
        FastDateFormat instance = FastDateFormat.getDateTimeInstance(
            FastDateFormat.SHORT, FastDateFormat.SHORT, Locale.FRENCH);
        assertNotNull(instance);
        assertEquals(Locale.FRENCH, instance.getLocale());
    }
    
    @Test
    public void testGetDateTimeInstanceWithTimeZone() {
        TimeZone tz = TimeZone.getTimeZone("CET");
        FastDateFormat instance = FastDateFormat.getDateTimeInstance(
            FastDateFormat.SHORT, FastDateFormat.SHORT, tz);
        assertNotNull(instance);
        assertEquals(tz, instance.getTimeZone());
    }
    
    @Test
    public void testFormatLong() {
        FastDateFormat instance = FastDateFormat.getInstance("yyyy-MM-dd");
        long millis = new GregorianCalendar(2023, Calendar.JANUARY, 15).getTimeInMillis();
        String result = instance.format(millis);
        assertEquals("2023-01-15", result);
    }
    
    @Test
    public void testFormatDate() {
        FastDateFormat instance = FastDateFormat.getInstance("yyyy/MM/dd");
        Date date = new GregorianCalendar(2023, Calendar.JUNE, 1).getTime();
        String result = instance.format(date);
        assertEquals("2023/06/01", result);
    }
    
    @Test
    public void testFormatCalendar() {
        FastDateFormat instance = FastDateFormat.getInstance("HH:mm:ss");
        Calendar cal = new GregorianCalendar(2023, Calendar.MARCH, 10, 14, 30, 45);
        String result = instance.format(cal);
        assertEquals("14:30:45", result);
    }
    
    @Test
    public void testFormatLongWithBuffer() {
        FastDateFormat instance = FastDateFormat.getInstance("yyyy");
        StringBuffer buf = new StringBuffer();
        long millis = new GregorianCalendar(2023, Calendar.DECEMBER, 25).getTimeInMillis();
        StringBuffer result = instance.format(millis, buf);
        assertSame(buf, result);
        assertEquals("2023", result.toString());
    }
    
    @Test
    public void testFormatDateWithBuffer() {
        FastDateFormat instance = FastDateFormat.getInstance("MM/dd");
        StringBuffer buf = new StringBuffer();
        Date date = new GregorianCalendar(2023, Calendar.JULY, 4).getTime();
        StringBuffer result = instance.format(date, buf);
        assertSame(buf, result);
        assertEquals("07/04", result.toString());
    }
    
    @Test
    public void testFormatCalendarWithBuffer() {
        FastDateFormat instance = FastDateFormat.getInstance("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        Calendar cal = new GregorianCalendar(2023, Calendar.OCTOBER, 31, 23, 59, 58);
        cal.set(Calendar.MILLISECOND, 123);
        StringBuffer buf = new StringBuffer();
        StringBuffer result = instance.format(cal, buf);
        assertSame(buf, result);
        assertEquals("2023-10-31T23:59:58.123+0000", result.toString());
    }
    
    @Test
    public void testFormatObjectDate() {
        FastDateFormat instance = FastDateFormat.getInstance("yyyy");
        Date date = new GregorianCalendar(2023, Calendar.FEBRUARY, 28).getTime();
        String result = instance.format(date, new StringBuffer(), new java.text.FieldPosition(0)).toString();
        assertEquals("2023", result);
    }
    
    @Test
    public void testFormatObjectCalendar() {
        FastDateFormat instance = FastDateFormat.getInstance("MM");
        Calendar cal = new GregorianCalendar(2023, Calendar.NOVEMBER, 15);
        String result = instance.format(cal, new StringBuffer(), new java.text.FieldPosition(0)).toString();
        assertEquals("11", result);
    }
    
    @Test
    public void testFormatObjectLong() {
        FastDateFormat instance = FastDateFormat.getInstance("dd");
        long millis = new GregorianCalendar(2023, Calendar.MAY, 20).getTimeInMillis();
        String result = instance.format(Long.valueOf(millis), new StringBuffer(), new java.text.FieldPosition(0)).toString();
        assertEquals("20", result);
    }
    
    @Test
    public void testFormatObjectInvalid() {
        FastDateFormat instance = FastDateFormat.getInstance("yyyy");
        try {
            instance.format("not a date", new StringBuffer(), new java.text.FieldPosition(0));
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }
    
    @Test
    public void testParseObjectReturnsNull() {
        FastDateFormat instance = FastDateFormat.getInstance("yyyy");
        ParsePosition pos = new ParsePosition(0);
        Object result = instance.parseObject("2023", pos);
        assertNull(result);
    }
    
    @Test
    public void testGetPattern() {
        FastDateFormat instance = FastDateFormat.getInstance("yyyy-MM-dd");
        assertEquals("yyyy-MM-dd", instance.getPattern());
    }
    
    @Test
    public void testGetTimeZone() {
        TimeZone tz = TimeZone.getTimeZone("GMT+02:00");
        FastDateFormat instance = FastDateFormat.getInstance("yyyy", tz);
        assertEquals(tz, instance.getTimeZone());
    }
    
    @Test
    public void testGetTimeZoneOverridesCalendarFalse() {
        FastDateFormat instance = FastDateFormat.getInstance("yyyy");
        assertFalse(instance.getTimeZoneOverridesCalendar());
    }
    
    @Test
    public void testGetTimeZoneOverridesCalendarTrue() {
        FastDateFormat instance = FastDateFormat.getInstance("yyyy", TimeZone.getTimeZone("PST"));
        assertTrue(instance.getTimeZoneOverridesCalendar());
    }
    
    @Test
    public void testGetLocale() {
        FastDateFormat instance = FastDateFormat.getInstance("yyyy", Locale.CANADA);
        assertEquals(Locale.CANADA, instance.getLocale());
    }
    
    @Test
    public void testGetMaxLengthEstimate() {
        FastDateFormat instance = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss.SSS");
        assertTrue(instance.getMaxLengthEstimate() > 0);
    }
    
    @Test
    public void testEqualsSameInstance() {
        FastDateFormat instance = FastDateFormat.getInstance("yyyy");
        assertTrue(instance.equals(instance));
    }
    
    @Test
    public void testEqualsDifferentPattern() {
        FastDateFormat instance1 = FastDateFormat.getInstance("yyyy");
        FastDateFormat instance2 = FastDateFormat.getInstance("MM");
        assertFalse(instance1.equals(instance2));
    }
    
    @Test
    public void testEqualsNull() {
        FastDateFormat instance = FastDateFormat.getInstance("yyyy");
        assertFalse(instance.equals(null));
    }
    
    @Test
    public void testEqualsDifferentType() {
        FastDateFormat instance = FastDateFormat.getInstance("yyyy");
        assertFalse(instance.equals("not a FastDateFormat"));
    }
    
    @Test
    public void testEqualsSamePattern() {
        FastDateFormat instance1 = FastDateFormat.getInstance("yyyy-MM-dd");
        FastDateFormat instance2 = FastDateFormat.getInstance("yyyy-MM-dd");
        assertTrue(instance1.equals(instance2));
        assertEquals(instance1.hashCode(), instance2.hashCode());
    }
    
    @Test
    public void testHashCodeConsistency() {
        FastDateFormat instance = FastDateFormat.getInstance("yyyy");
        int hash1 = instance.hashCode();
        int hash2 = instance.hashCode();
        assertEquals(hash1, hash2);
    }
    
    @Test
    public void testToString() {
        FastDateFormat instance = FastDateFormat.getInstance("yyyy");
        assertEquals("FastDateFormat[y]", instance.toString());
    }
    
    @Test
    public void testFormatWithWeekYear() {
        FastDateFormat instance = FastDateFormat.getInstance("YYYY", TimeZone.getTimeZone("UTC"));
        Calendar cal = new GregorianCalendar(2023, Calendar.DECEMBER, 31);
        cal.setTimeZone(TimeZone.getTimeZone("UTC"));
        String result = instance.format(cal);
        assertEquals("2023", result);
    }
    
    @Test
    public void testFormatWithMonthName() {
        FastDateFormat instance = FastDateFormat.getInstance("MMMM", Locale.US);
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 1);
        String result = instance.format(cal);
        assertEquals("January", result);
    }
    
    @Test
    public void testFormatWithShortMonthName() {
        FastDateFormat instance = FastDateFormat.getInstance("MMM", Locale.US);
        Calendar cal = new GregorianCalendar(2023, Calendar.FEBRUARY, 14);
        String result = instance.format(cal);
        assertEquals("Feb", result);
    }
    
    @Test
    public void testFormatWithTwoDigitMonth() {
        FastDateFormat instance = FastDateFormat.getInstance("MM", Locale.US);
        Calendar cal = new GregorianCalendar(2023, Calendar.MARCH, 1);
        String result = instance.format(cal);
        assertEquals("03", result);
    }
    
    @Test
    public void testFormatWithUnpaddedMonth() {
        FastDateFormat instance = FastDateFormat.getInstance("M", Locale.US);
        Calendar cal = new GregorianCalendar(2023, Calendar.MARCH, 1);
        String result = instance.format(cal);
        assertEquals("3", result);
    }
    
    @Test
    public void testFormatWithDayOfMonth() {
        FastDateFormat instance = FastDateFormat.getInstance("dd", Locale.US);
        Calendar cal = new GregorianCalendar(2023, Calendar.APRIL, 5);
        String result = instance.format(cal);
        assertEquals("05", result);
    }
    
    @Test
    public void testFormatWithUnpaddedDay() {
        FastDateFormat instance = FastDateFormat.getInstance("d", Locale.US);
        Calendar cal = new GregorianCalendar(2023, Calendar.APRIL, 5);
        String result = instance.format(cal);
        assertEquals("5", result);
    }
    
    @Test
    public void testFormatTwelveHour() {
        FastDateFormat instance = FastDateFormat.getInstance("hh", Locale.US);
        Calendar cal = new GregorianCalendar(2023, Calendar.MAY, 1, 0, 0);
        String result = instance.format(cal);
        assertEquals("12", result);
    }
    
    @Test
    public void testFormatTwentyFourHour() {
        FastDateFormat instance = FastDateFormat.getInstance("HH", Locale.US);
        Calendar cal = new GregorianCalendar(2023, Calendar.MAY, 1, 23, 0);
        String result = instance.format(cal);
        assertEquals("23", result);
    }
    
    @Test
    public void testFormatTwentyFourHourDay() {
        FastDateFormat instance = FastDateFormat.getInstance("kk", Locale.US);
        Calendar cal = new GregorianCalendar(2023, Calendar.MAY, 1, 0, 0);
        String result = instance.format(cal);
        assertEquals("24", result);
    }
    
    @Test
    public void testFormatTwelveHourDay() {
        FastDateFormat instance = FastDateFormat.getInstance("KK", Locale.US);
        Calendar cal = new GregorianCalendar(2023, Calendar.MAY, 1, 0, 0);
        String result = instance.format(cal);
        assertEquals("00", result);
    }
    
    @Test
    public void testFormatMinute() {
        FastDateFormat instance = FastDateFormat.getInstance("mm", Locale.US);
        Calendar cal = new GregorianCalendar(2023, Calendar.MAY, 1, 12, 34);
        String result = instance.format(cal);
        assertEquals("34", result);
    }
    
    @Test
    public void testFormatSecond() {
        FastDateFormat instance = FastDateFormat.getInstance("ss", Locale.US);
        Calendar cal = new GregorianCalendar(2023, Calendar.MAY, 1, 12, 34, 56);
        String result = instance.format(cal);
        assertEquals("56", result);
    }
    
    @Test
    public void testFormatMillisecond() {
        FastDateFormat instance = FastDateFormat.getInstance("SSS", Locale.US);
        Calendar cal = new GregorianCalendar(2023, Calendar.MAY, 1, 12, 0, 0);
        cal.set(Calendar.MILLISECOND, 789);
        String result = instance.format(cal);
        assertEquals("789", result);
    }
    
    @Test
    public void testFormatDayOfWeek() {
        FastDateFormat instance = FastDateFormat.getInstance("EEEE", Locale.US);
        Calendar cal = new GregorianCalendar(2023, Calendar.MAY, 7);
        String result = instance.format(cal);
        assertEquals("Sunday", result);
    }
    
    @Test
    public void testFormatShortDayOfWeek() {
        FastDateFormat instance = FastDateFormat.getInstance("E", Locale.US);
        Calendar cal = new GregorianCalendar(2023, Calendar.MAY, 7);
        String result = instance.format(cal);
        assertEquals("Sun", result);
    }
    
    @Test
    public void testFormatDayOfYear() {
        FastDateFormat instance = FastDateFormat.getInstance("DDD", Locale.US);
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 1);
        String result = instance.format(cal);
        assertEquals("001", result);
    }
    
    @Test
    public void testFormatWeekOfYear() {
        FastDateFormat instance = FastDateFormat.getInstance("ww", Locale.US);
        Calendar cal = new GregorianCalendar(2023, Calendar.JUNE, 1);
        String result = instance.format(cal);
        assertNotNull(instance.format(cal));
    }
    
    @Test
    public void testFormatAmPm() {
        FastDateFormat instance = FastDateFormat.getInstance("a", Locale.US);
        Calendar cal = new GregorianCalendar(2023, Calendar.JUNE, 1, 13, 0);
        String result = instance.format(cal);
        assertEquals("PM", result);
    }
    
    @Test
    public void testFormatLiteralQuote() {
        FastDateFormat instance = FastDateFormat.getInstance("'T'yyyy", Locale.US);
        Calendar cal = new GregorianCalendar(2023, Calendar.JUNE, 1);
        String result = instance.format(cal);
        assertEquals("T2023", result);
    }
    
    @Test
    public void testFormatTimeZoneName() {
        FastDateFormat instance = FastDateFormat.getInstance("z", TimeZone.getTimeZone("America/New_York"));
        Calendar cal = new GregorianCalendar(2023, Calendar.JUNE, 1);
        cal.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        String result = instance.format(cal);
        assertNotNull(result);
        assertTrue(result.length() > 0);
    }
    
    @Test
    public void testFormatTimeZoneNumeric() {
        FastDateFormat instance = FastDateFormat.getInstance("Z");
        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("GMT+05:30"));
        cal.setTimeZone(TimeZone.getTimeZone("GMT+05:30"));
        String result = instance.format(cal);
        assertEquals("+0530", result);
    }
}