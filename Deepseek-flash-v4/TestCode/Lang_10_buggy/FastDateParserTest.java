package org.apache.commons.lang3.time;

import org.junit.Before;
import org.junit.Test;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.*;

import static org.junit.Assert.*;

public class FastDateParserTest {

    private TimeZone tz;
    private Locale locale;

    @Before
    public void setUp() {
        tz = TimeZone.getTimeZone("GMT");
        locale = Locale.US;
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithInvalidPattern() {
        new FastDateParser("noformat", tz, locale);
    }

    @Test
    public void testParse_YYYYMMDD() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyyMMdd", tz, locale);
        Date date = parser.parse("20231015");
        Calendar cal = Calendar.getInstance(tz, locale);
        cal.clear();
        cal.set(2023, Calendar.OCTOBER, 15, 0, 0, 0);
        cal.set(Calendar.MILLISECOND, 0);
        assertEquals(cal.getTime(), date);
    }

    @Test
    public void testParse_WithTimeZone() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd z", tz, locale);
        Date date = parser.parse("2023-10-15 GMT");
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"), locale);
        cal.clear();
        cal.set(2023, Calendar.OCTOBER, 15, 0, 0, 0);
        cal.set(Calendar.MILLISECOND, 0);
        assertEquals(cal.getTime(), date);
    }

    @Test
    public void testParse_TwoDigitYearAdjust() throws ParseException {
        FastDateParser parser = new FastDateParser("yy", tz, locale);
        Calendar cal = Calendar.getInstance(tz, locale);
        int currentYear = cal.get(Calendar.YEAR);
        // For two-digit year "00" -> adjust to 2000 if within 20 years
        Date d00 = parser.parse("00");
        cal.setTime(d00);
        int year00 = cal.get(Calendar.YEAR);
        assertEquals(2000, year00);

        // For two-digit year "99" -> adjust to 1999 (back 100 years) if current year is 2020+
        Date d99 = parser.parse("99");
        cal.setTime(d99);
        int year99 = cal.get(Calendar.YEAR);
        assertEquals(1999, year99);
    }

    @Test
    public void testParse_AmPm() throws ParseException {
        FastDateParser parser = new FastDateParser("h:mm a", tz, locale);
        Date date = parser.parse("3:30 PM");
        Calendar cal = Calendar.getInstance(tz, locale);
        cal.clear();
        cal.set(Calendar.HOUR, 3);
        cal.set(Calendar.MINUTE, 30);
        cal.set(Calendar.AM_PM, Calendar.PM);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        assertEquals(cal.getTime(), date);
    }

    @Test
    public void testParse_MonthText() throws ParseException {
        FastDateParser parser = new FastDateParser("MMM yyyy", tz, locale);
        Date date = parser.parse("Oct 2023");
        Calendar cal = Calendar.getInstance(tz, locale);
        cal.clear();
        cal.set(Calendar.MONTH, Calendar.OCTOBER);
        cal.set(Calendar.YEAR, 2023);
        assertEquals(cal.getTime(), date);
    }

    @Test
    public void testParse_MonthNumber() throws ParseException {
        FastDateParser parser = new FastDateParser("MM yyyy", tz, locale);
        Date date = parser.parse("10 2023");
        Calendar cal = Calendar.getInstance(tz, locale);
        cal.clear();
        cal.set(Calendar.MONTH, Calendar.OCTOBER);
        cal.set(Calendar.YEAR, 2023);
        assertEquals(cal.getTime(), date);
    }

    @Test
    public void testParse_DayOfWeek() throws ParseException {
        FastDateParser parser = new FastDateParser("E yyyy", tz, locale);
        Date date = parser.parse("Sun 2023");
        Calendar cal = Calendar.getInstance(tz, locale);
        cal.clear();
        cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        cal.set(Calendar.YEAR, 2023);
        assertEquals(cal.getTime(), date);
    }

    @Test
    public void testParse_QuotedLiteral() throws ParseException {
        FastDateParser parser = new FastDateParser("'Date:' yyyy MM dd", tz, locale);
        Date date = parser.parse("Date: 2023 10 15");
        Calendar cal = Calendar.getInstance(tz, locale);
        cal.clear();
        cal.set(2023, Calendar.OCTOBER, 15, 0, 0, 0);
        cal.set(Calendar.MILLISECOND, 0);
        assertEquals(cal.getTime(), date);
    }

    @Test(expected = NullPointerException.class)
    public void testParse_NullSource() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyy", tz, locale);
        parser.parse((String) null);
    }

    @Test
    public void testParse_UnparseableReturnNull() {
        FastDateParser parser = new FastDateParser("yyyy", tz, locale);
        ParsePosition pos = new ParsePosition(0);
        Date date = parser.parse("abc", pos);
        assertNull(date);
        assertEquals(0, pos.getIndex());
    }

    @Test(expected = ParseException.class)
    public void testParse_UnparseableException() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyy", tz, locale);
        parser.parse("abc");
    }

    @Test
    public void testParse_JapaneseImperialException() {
        FastDateParser parser = new FastDateParser("yyyy", tz, FastDateParser.JAPANESE_IMPERIAL);
        try {
            parser.parse("invalid");
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertTrue(e.getMessage().contains("1868"));
        }
    }

    @Test
    public void testGetPatternTimeZoneLocale() {
        FastDateParser parser = new FastDateParser("yyyy", tz, locale);
        assertEquals("yyyy", parser.getPattern());
        assertEquals(tz, parser.getTimeZone());
        assertEquals(locale, parser.getLocale());
    }

    @Test
    public void testEqualsHashCodeToString() {
        FastDateParser p1 = new FastDateParser("yyyy", tz, locale);
        FastDateParser p2 = new FastDateParser("yyyy", tz, locale);
        FastDateParser p3 = new FastDateParser("MM", tz, locale);

        assertEquals(p1, p2);
        assertNotEquals(p1, p3);
        assertEquals(p1.hashCode(), p2.hashCode());
        assertNotNull(p1.toString());
        assertTrue(p1.toString().contains("FastDateParser"));
    }

    @Test
    public void testParseObject() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyyMMdd", tz, locale);
        Object obj = parser.parseObject("20231015");
        assertTrue(obj instanceof Date);
        Calendar cal = Calendar.getInstance(tz, locale);
        cal.clear();
        cal.set(2023, Calendar.OCTOBER, 15, 0, 0, 0);
        cal.set(Calendar.MILLISECOND, 0);
        assertEquals(cal.getTime(), obj);
    }

    @Test
    public void testParseObjectWithPos() {
        FastDateParser parser = new FastDateParser("yyyyMMdd", tz, locale);
        ParsePosition pos = new ParsePosition(0);
        Object obj = parser.parseObject("20231015", pos);
        assertTrue(obj instanceof Date);
        assertEquals(8, pos.getIndex());
    }
}