package com.fasterxml.jackson.databind.util;

import static org.junit.Assert.*;

import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Test;

public class StdDateFormatTest {

    private Date utc(int year, int month, int day, int hour, int minute, int second, int millis) {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.set(year, month - 1, day, hour, minute, second);
        cal.set(Calendar.MILLISECOND, millis);
        return cal.getTime();
    }

    private String formatEpoch(StdDateFormat df) {
        return df.format(new Date(0), new StringBuffer(), new FieldPosition(0)).toString();
    }

    @Test
    public void testParseISO8601WithMillisAndZ() throws Exception {
        StdDateFormat df = new StdDateFormat();
        Date expected = utc(2017, 1, 31, 12, 0, 0, 0);
        assertEquals(expected, df.parse("2017-01-31T12:00:00.000Z"));
    }

    @Test
    public void testParseISO8601ZuluWithoutMillis() throws Exception {
        StdDateFormat df = new StdDateFormat();
        Date expected = utc(2017, 1, 31, 12, 0, 0, 0);
        assertEquals(expected, df.parse("2017-01-31T12:00:00Z"));
    }

    @Test
    public void testParseISO8601WithColonTimezone() throws Exception {
        StdDateFormat df = new StdDateFormat();
        Date expected = utc(2017, 1, 31, 10, 0, 0, 0);
        assertEquals(expected, df.parse("2017-01-31T12:00:00.000+02:00"));
    }

    @Test
    public void testParseISO8601WithoutColonTimezone() throws Exception {
        StdDateFormat df = new StdDateFormat();
        Date expected = utc(2017, 1, 31, 10, 0, 0, 0);
        assertEquals(expected, df.parse("2017-01-31T12:00:00.000+0200"));
    }

    @Test
    public void testParseISO8601MissingTimezone() throws Exception {
        StdDateFormat df = new StdDateFormat();
        Date expected = utc(2017, 1, 31, 12, 0, 0, 0);
        assertEquals(expected, df.parse("2017-01-31T12:00:00"));
    }

    @Test
    public void testParsePlainDate() throws Exception {
        StdDateFormat df = new StdDateFormat();
        Date expected = utc(2017, 1, 31, 0, 0, 0, 0);
        assertEquals(expected, df.parse("2017-01-31"));
    }

    @Test
    public void testParseRFC1123() throws Exception {
        StdDateFormat df = new StdDateFormat();
        Date expected = utc(2017, 1, 31, 12, 0, 0, 0);
        assertEquals(expected, df.parse("Tue, 31 Jan 2017 12:00:00 GMT"));
    }

    @Test
    public void testParseNumericTimestamp() throws Exception {
        StdDateFormat df = new StdDateFormat();
        assertEquals(new Date(0), df.parse("0"));
        assertEquals(new Date(-1), df.parse("-1"));
    }

    @Test
    public void testParseISO8601WithHoursOnlyOffset() throws Exception {
        StdDateFormat df = new StdDateFormat();
        Date expected = utc(2017, 1, 31, 10, 0, 0, 0);
        assertEquals(expected, df.parse("2017-01-31T12:00:00+02"));
    }

    @Test(expected = ParseException.class)
    public void testParseInvalidThrowsParseException() throws Exception {
        new StdDateFormat().parse("not-a-date");
    }

    @Test(expected = NullPointerException.class)
    public void testParseNullThrowsNPE() throws Exception {
        new StdDateFormat().parse(null);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testParseEmptyThrowsException() throws Exception {
        new StdDateFormat().parse("");
    }

    @Test
    public void testFormatInGMT() {
        StdDateFormat df = new StdDateFormat();
        assertEquals("1970-01-01T00:00:00.000+0000", formatEpoch(df));
    }

    @Test
    public void testFormatWithTimeZone() {
        StdDateFormat df = new StdDateFormat(TimeZone.getTimeZone("GMT+02:00"), Locale.US);
        assertEquals("1970-01-01T02:00:00.000+0200", formatEpoch(df));
    }

    @Test
    public void testWithTimeZone() {
        StdDateFormat gmt = new StdDateFormat(TimeZone.getTimeZone("GMT"), Locale.US);
        assertSame(gmt, gmt.withTimeZone(TimeZone.getTimeZone("GMT")));
        assertSame(gmt, gmt.withTimeZone(null));
        StdDateFormat def = new StdDateFormat();
        assertNotSame(def, def.withTimeZone(TimeZone.getTimeZone("GMT")));
    }

    @Test
    public void testWithLocale() {
        StdDateFormat df = new StdDateFormat(TimeZone.getTimeZone("GMT"), Locale.US);
        assertSame(df, df.withLocale(Locale.US));
        StdDateFormat french = df.withLocale(Locale.FRANCE);
        assertNotSame(df, french);
        assertEquals(Locale.FRANCE, french._locale);
    }

    @Test
    public void testClone() {
        StdDateFormat df = new StdDateFormat(TimeZone.getTimeZone("GMT+03:00"), Locale.FRANCE);
        StdDateFormat copy = df.clone();
        assertNotSame(df, copy);
        assertEquals(df._timezone, copy._timezone);
        assertEquals(df._locale, copy._locale);
    }

    @Test
    public void testSetTimeZone() {
        StdDateFormat df = new StdDateFormat();
        df.setTimeZone(TimeZone.getTimeZone("GMT+05:30"));
        assertEquals("1970-01-01T05:30:00.000+0530", formatEpoch(df));
        df.setTimeZone(TimeZone.getTimeZone("GMT"));
        assertEquals("1970-01-01T00:00:00.000+0000", formatEpoch(df));
    }

    @Test
    public void testLooksLikeISO8601() {
        StdDateFormat df = new StdDateFormat();
        assertTrue(df.looksLikeISO8601("2017-01-31"));
        assertFalse(df.looksLikeISO8601("1234"));
        assertFalse(df.looksLikeISO8601("not-a-date"));
    }

    @Test
    public void testStaticFormats() {
        assertNotNull(StdDateFormat.getISO8601Format(TimeZone.getTimeZone("GMT"), Locale.US));
        assertNotNull(StdDateFormat.getRFC1123Format(TimeZone.getTimeZone("GMT"), Locale.US));
        assertEquals("GMT", StdDateFormat.getDefaultTimeZone().getID());
    }

    @Test
    public void testParseWithPositionInvalidReturnsNull() {
        StdDateFormat df = new StdDateFormat();
        ParsePosition pos = new ParsePosition(0);
        Date result = df.parse("not-a-date", pos);
        assertNull(result);
    }
}