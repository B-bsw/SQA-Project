package com.fasterxml.jackson.databind.util;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.FieldPosition;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class StdDateFormatTest {

    private StdDateFormat format;
    private Locale originalLocale;
    private TimeZone originalTimeZone;

    @Before
    public void setUp() {
        format = new StdDateFormat();
        originalLocale = Locale.getDefault();
        originalTimeZone = TimeZone.getDefault();
        Locale.setDefault(Locale.US);
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
    }

    @After
    public void tearDown() {
        Locale.setDefault(originalLocale);
        TimeZone.setDefault(originalTimeZone);
    }

    @Test
    public void testParseISO8601DateWithTimeZone() throws ParseException {
        String dateStr = "2023-05-15T10:30:45.123Z";
        Date result = format.parse(dateStr);
        assertNotNull(result);
        assertEquals(1684143045123L, result.getTime());
    }

    @Test
    public void testParsePlainDate() throws ParseException {
        String dateStr = "2023-05-15";
        Date result = format.parse(dateStr);
        assertNotNull(result);
    }

    @Test
    public void testParseLongTimestamp() throws ParseException {
        String dateStr = "1684143045123";
        Date result = format.parse(dateStr);
        assertNotNull(result);
        assertEquals(1684143045123L, result.getTime());
    }

    @Test
    public void testParseRFC1123Date() throws ParseException {
        String dateStr = "Mon, 15 May 2023 10:30:45 GMT";
        Date result = format.parse(dateStr);
        assertNotNull(result);
    }

    @Test(expected = ParseException.class)
    public void testParseInvalidDateThrowsParseException() throws ParseException {
        format.parse("invalid-date");
    }

    @Test
    public void testParseInvalidDateWithNullInput() {
        assertThrows(NullPointerException.class, () -> format.parse(null));
    }

    @Test
    public void testParseEmptyStringThrowsParseException() {
        try {
            format.parse("");
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testParseWithWhitespace() throws ParseException {
        String dateStr = "  2023-05-15  ";
        Date result = format.parse(dateStr);
        assertNotNull(result);
    }

    @Test
    public void testFormatWithDefaultTimeZone() {
        Date date = new Date(1684143045123L);
        StringBuffer sb = new StringBuffer();
        FieldPosition fp = new FieldPosition(0);
        format.format(date, sb, fp);
        assertTrue(sb.toString().contains("T"));
        assertTrue(sb.toString().contains(":"));
    }

    @Test
    public void testFormatWithCustomTimeZone() {
        StdDateFormat customFormat = format.withTimeZone(TimeZone.getTimeZone("Asia/Tokyo"));
        assertNotSame(format, customFormat);
        Date date = new Date(1684143045123L);
        StringBuffer sb = new StringBuffer();
        customFormat.format(date, sb, new FieldPosition(0));
        assertTrue(sb.length() > 10);
    }

    @Test
    public void testWithTimeZoneReturnsSameInstance() {
        StdDateFormat withTz = format.withTimeZone(TimeZone.getTimeZone("UTC"));
        assertSame(format, withTz);
    }

    @Test
    public void testWithLocaleReturnsSameInstance() {
        StdDateFormat withLoc = format.withLocale(Locale.US);
        assertSame(format, withLoc);
    }

    @Test
    public void testWithLenientReturnsSameInstance() {
        StdDateFormat withLenient = format.withLenient(null);
        assertSame(format, withLenient);
    }

    @Test
    public void testWithColonInTimeZoneReturnsSameInstance() {
        StdDateFormat withColon = format.withColonInTimeZone(false);
        assertSame(format, withColon);
    }

    @Test
    public void testWithTimeZoneNull() {
        StdDateFormat withNullTz = format.withTimeZone(null);
        assertNotNull(withNullTz);
    }

    @Test
    public void testClone() {
        StdDateFormat cloned = format.clone();
        assertNotSame(format, cloned);
    }

    @Test
    public void testGetISO8601Format() {
        DateFormat df = StdDateFormat.getISO8601Format(TimeZone.getDefault(), Locale.US);
        assertNotNull(df);
    }

    @Test
    public void testGetRFC1123Format() {
        DateFormat df = StdDateFormat.getRFC1123Format(TimeZone.getDefault(), Locale.US);
        assertNotNull(df);
    }

    @Test
    public void testGetTimeZoneDefault() {
        assertNotNull(StdDateFormat.getDefaultTimeZone());
    }

    @Test
    public void testIsLenientDefault() {
        assertTrue(format.isLenient());
    }

    @Test
    public void testSetLenientFalse() {
        format.setLenient(false);
        assertFalse(format.isLenient());
    }

    @Test
    public void testIsColonIncludedDefault() {
        assertFalse(format.isColonIncludedInTimeZone());
    }

    @Test
    public void testSetTimeZone() {
        TimeZone tz = TimeZone.getTimeZone("Asia/Bangkok");
        format.setTimeZone(tz);
        assertEquals(tz, format.getTimeZone());
    }

    @Test
    public void testToString() {
        assertNotNull(format.toString());
        assertTrue(format.toString().contains("DateFormat"));
    }

    @Test
    public void testToPattern() {
        assertNotNull(format.toPattern());
        assertTrue(format.toPattern().contains("one of:"));
    }

    @Test
    public void testEqualsSameInstance() {
        assertTrue(format.equals(format));
    }

    @Test
    public void testEqualsDifferentInstance() {
        assertFalse(format.equals(new StdDateFormat()));
    }

    @Test
    public void testHashCode() {
        assertEquals(format.hashCode(), format.hashCode());
    }

    @Test
    public void testParseWithISO8601WithTimezoneOffset() throws ParseException {
        String dateStr = "2023-05-15T10:30:45.123+0500";
        Date result = format.parse(dateStr);
        assertNotNull(result);
    }

    @Test
    public void testParseDateWithColonInTimezone() throws ParseException {
        String dateStr = "2023-05-15T10:30:45.123+05:00";
        Date result = format.parse(dateStr);
        assertNotNull(result);
    }

    @Test
    public void testParseWithNoFractionalSeconds() throws ParseException {
        String dateStr = "2023-05-15T10:30:45Z";
        Date result = format.parse(dateStr);
        assertNotNull(result);
    }

    @Test
    public void testParseWithMinuteFractional() throws ParseException {
        String dateStr = "2023-05-15T10:30:45.1Z";
        Date result = format.parse(dateStr);
        assertNotNull(result);
    }

    @Test
    public void testParseWithHundredthsFractional() throws ParseException {
        String dateStr = "2023-05-15T10:30:45.12Z";
        Date result = format.parse(dateStr);
        assertNotNull(result);
    }

    @Test
    public void testWithLocaleCustom() {
        StdDateFormat custom = format.withLocale(Locale.FRANCE);
        assertNotSame(format, custom);
    }

    @Test
    public void testWithLenientCustom() {
        StdDateFormat custom = format.withLenient(Boolean.FALSE);
        assertNotSame(format, custom);
        assertFalse(custom.isLenient());
    }

    @Test
    public void testWithColonInTimeZoneCustom() {
        StdDateFormat custom = format.withColonInTimeZone(true);
        assertNotSame(format, custom);
        assertTrue(custom.isColonIncludedInTimeZone());
    }

    @Test
    public void testParseDateStringWithLeadingMinus() throws ParseException {
        String dateStr = "-2023-05-15";
        Date result = format.parse(dateStr);
        assertNotNull(result);
    }

    @Test
    public void testParseDateWith12HourTime() {
        String dateStr = "2023-05-15T10:30:45";
        try {
            Date result = format.parse(dateStr);
            assertNotNull(result);
        } catch (ParseException e) {
            fail("Should parse ISO8601 without timezone");
        }
    }
}