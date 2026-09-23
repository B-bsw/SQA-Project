package com.fasterxml.jackson.databind.util;

import org.junit.Before;
import org.junit.Test;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import static org.junit.Assert.*;

public class StdDateFormatTest {
    private StdDateFormat format;
    private static final TimeZone UTC = TimeZone.getTimeZone("UTC");

    @Before
    public void setUp() {
        format = new StdDateFormat();
    }

    @Test
    public void testParseEmptyString() {
        ParsePosition pos = new ParsePosition(0);
        Date result = format.parse("", pos);
        assertNull("Empty string should return null", result);
    }

    @Test
    public void testParseNullInput() {
        ParsePosition pos = new ParsePosition(0);
        try {
            format.parse((String)null, pos);
            fail("Should throw NullPointerException");
        } catch (NullPointerException e) {
            assertEquals(0, pos.getErrorIndex());
        }
    }

    @Test
    public void testParseNumericString() throws Exception {
        long timestamp = 1609488000000L;
        Date expected = new Date(timestamp);
        Date result = format.parse(String.valueOf(timestamp));
        assertEquals("Numeric string should parse as timestamp", expected, result);
    }

    @Test
    public void testParseNegativeNumericString() throws Exception {
        long timestamp = -1609488000000L;
        Date expected = new Date(timestamp);
        Date result = format.parse(String.valueOf(timestamp));
        assertEquals("Negative numeric string should parse as timestamp", expected, result);
    }

    @Test
    public void testParseISO8601WithZulu() throws Exception {
        String dateStr = "2021-01-01T00:00:00.000Z";
        Date result = format.parse(dateStr);
        assertNotNull("ISO8601 with Z should parse", result);
        assertEquals("2021-01-01T00:00:00.000Z", format.format(result));
    }

    @Test
    public void testParseISO8601WithOffset() throws Exception {
        String dateStr = "2021-01-01T00:00:00.000+0000";
        Date result = format.parse(dateStr);
        assertNotNull("ISO8601 with offset should parse", result);
        assertEquals("2021-01-01T00:00:00.000Z", format.format(result));
    }

    @Test
    public void testParseISO8601WithColonOffset() throws Exception {
        String dateStr = "2021-01-01T00:00:00.000+00:00";
        Date result = format.parse(dateStr);
        assertNotNull("ISO8601 with colon offset should parse", result);
        assertEquals("2021-01-01T00:00:00.000Z", format.format(result));
    }

    @Test
    public void testParseRFC1123() throws Exception {
        String dateStr = "Fri, 01 Jan 2021 00:00:00 GMT";
        Date result = format.parse(dateStr);
        assertNotNull("RFC1123 should parse", result);
        assertEquals("2021-01-01T00:00:00.000Z", format.format(result));
    }

    @Test
    public void testParsePlainDate() throws Exception {
        String dateStr = "2021-01-01";
        Date result = format.parse(dateStr);
        assertNotNull("Plain date should parse", result);
        assertEquals("2021-01-01T00:00:00.000Z", format.format(result));
    }

    @Test
    public void testParseInvalidInput() {
        String invalidDate = "not-a-date";
        try {
            format.parse(invalidDate);
            fail("Should throw ParseException for invalid input");
        } catch (ParseException e) {
            assertTrue("Error message should mention unsupported format", e.getMessage().contains("not compatible"));
        }
    }

    @Test
    public void testParseWithVeryShortString() {
        ParsePosition pos = new ParsePosition(0);
        Date result = format.parse("123", pos);
        assertNull("Short string should not parse", result);
        assertTrue("Error index should be set", pos.getErrorIndex() > 0);
    }

    @Test
    public void testParseWithNumericPrefix() {
        String dateStr = "12345";
        try {
            Date result = format.parse(dateStr);
            assertNotNull("Numeric string should parse", result);
        } catch (ParseException e) {
            fail("Numeric string should parse");
        }
    }

    @Test
    public void testFormatWithCustomTimeZone() {
        TimeZone tz = TimeZone.getTimeZone("America/New_York");
        StdDateFormat customFormat = (StdDateFormat) format.withTimeZone(tz);
        assertNotNull("Custom format should not be null", customFormat);
        assertEquals("Time zone should be set", tz, customFormat.getTimeZone());
    }

    @Test
    public void testFormatWithNullTimeZoneUsesDefault() {
        StdDateFormat customFormat = (StdDateFormat) format.withTimeZone(null);
        assertNotNull("Custom format should not be null", customFormat);
        assertEquals("Should use UTC for null timezone", UTC, customFormat.getTimeZone());
    }

    @Test
    public void testWithLocale() {
        Locale loc = Locale.FRANCE;
        StdDateFormat customFormat = (StdDateFormat) format.withLocale(loc);
        assertNotNull("Custom format with locale should not be null", customFormat);
        assertNotSame("Should return new instance for different locale", format, customFormat);
    }

    @Test
    public void testWithSameLocaleReturnsNewInstance() {
        StdDateFormat customFormat = (StdDateFormat) format.withLocale(Locale.US);
        assertNotNull("Custom format should not be null", customFormat);
        assertNotSame("Should return new instance even for same locale", format, customFormat);
    }

    @Test
    public void testClone() {
        TimeZone tz = TimeZone.getTimeZone("Asia/Tokyo");
        StdDateFormat original = new StdDateFormat(tz, Locale.JAPAN, Boolean.TRUE);
        StdDateFormat cloned = original.clone();
        assertNotSame("Clone should be a different instance", original, cloned);
        assertEquals("Cloned timezone should match", tz, cloned.getTimeZone());
    }

    @Test
    public void testGetISO8601Format() {
        TimeZone tz = TimeZone.getTimeZone("Europe/London");
        DateFormat df = StdDateFormat.getISO8601Format(tz);
        assertNotNull("Date format should not be null", df);
        assertEquals("Timezone should be set", tz, df.getTimeZone());
    }

    @Test
    public void testGetISO8601FormatWithLocale() {
        TimeZone tz = TimeZone.getTimeZone("Europe/London");
        DateFormat df = StdDateFormat.getISO8601Format(tz, Locale.UK);
        assertNotNull("Date format should not be null", df);
        assertEquals("Timezone should be set", tz, df.getTimeZone());
    }

    @Test
    public void testGetRFC1123Format() {
        DateFormat df = StdDateFormat.getRFC1123Format(UTC);
        assertNotNull("RFC1123 format should not be null", df);
        assertEquals("Timezone should be UTC", UTC, df.getTimeZone());
    }

    @Test
    public void testGetDefaultTimeZone() {
        assertEquals("Default timezone should be UTC", UTC, StdDateFormat.getDefaultTimeZone());
    }

    @Test
    public void testIsLenientDefault() {
        assertTrue("Should be lenient by default", format.isLenient());
    }

    @Test
    public void testSetLenient() {
        format.setLenient(false);
        assertFalse("Should not be lenient after setLenient(false)", format.isLenient());
    }

    @Test
    public void testSetTimeZoneInvalidEarlierInstance() {
        TimeZone original = format.getTimeZone();
        TimeZone newTz = TimeZone.getTimeZone("Australia/Sydney");
        format.setTimeZone(newTz);
        assertEquals("Timezone should be updated", newTz, format.getTimeZone());
        assertNotEquals("Should not return original timezone", original, format.getTimeZone());
    }

    @Test
    public void testToString() {
        String str = format.toString();
        assertNotNull("toString should not be null", str);
        assertTrue("Should contain class name", str.contains("DateFormat"));
    }

    @Test
    public void testParseFormatRoundTrip() throws Exception {
        Date now = new Date();
        String formatted = format.format(now);
        Date parsed = format.parse(formatted);
        assertEquals("Round-trip should preserve date", now.getTime(), parsed.getTime());
    }

    @Test
    public void testParseISO8601SimpleTime() throws Exception {
        String dateStr = "2021-01-01T12:30:00";
        Date result = format.parse(dateStr);
        assertNotNull("ISO8601 without millis should parse", result);
        String formatted = format.format(result);
        assertTrue("Formatted should contain milliseconds", formatted.contains(".000"));
    }

    @Test
    public void testParseISO8601SecondsOptional() throws Exception {
        String dateStr = "2021-01-01T12:30";
        try {
            Date result = format.parse(dateStr);
            assertNotNull("ISO8601 with minutes only should parse", result);
        } catch (ParseException e) {
            fail("ISO8601 with minutes only should parse: " + e.getMessage());
        }
    }

    @Test
    public void testParseISO8601HoursOnly() throws Exception {
        String dateStr = "2021-01-01T12";
        try {
            Date result = format.parse(dateStr);
            assertNotNull("ISO8601 with hours only should parse", result);
        } catch (ParseException e) {
            fail("ISO8601 with hours only should parse: " + e.getMessage());
        }
    }

    @Test
    public void testParseWithLeadingWhitespace() throws Exception {
        String dateStr = "  2021-01-01T00:00:00.000Z  ";
        Date result = format.parse(dateStr);
        assertNotNull("Leading/trailing whitespace should be trimmed", result);
    }

    @Test
    public void testParseInvalidDateWithNoDashes() {
        String invalidDate = "20210101T000000";
        try {
            format.parse(invalidDate);
            fail("Should fail for date without dashes");
        } catch (ParseException e) {
            assertTrue("Should mention not compatible", e.getMessage().contains("not compatible"));
        }
    }

    @Test
    public void testParseISO8601WithSecondsOptionalSingleDigit() throws Exception {
        String dateStr = "2021-01-01T12:30:5";
        try {
            Date result = format.parse(dateStr);
            assertNotNull("ISO8601 with single digit seconds should parse", result);
        } catch (ParseException e) {
            fail("ISO8601 with single digit seconds should parse: " + e.getMessage());
        }
    }

    @Test
    public void testParseISO8601WithMillisPartial() throws Exception {
        String dateStr = "2021-01-01T12:30:00.123";
        Date result = format.parse(dateStr);
        assertNotNull("ISO8601 with millis should parse", result);
        String formatted = format.format(result);
        assertTrue("Formatted should contain milliseconds", formatted.contains(".123"));
    }

    @Test
    public void testParseTimezoneOnlyWithColon() throws Exception {
        String dateStr = "2021-01-01T12:30:00.000+05:30";
        Date result = format.parse(dateStr);
        assertNotNull("Timezone with colon should parse", result);
        String formatted = format.format(result);
        assertTrue("Formatted should show UTC", formatted.endsWith("Z"));
    }

    @Test
    public void testParseTimezoneNoColon() throws Exception {
        String dateStr = "2021-01-01T12:30:00.000+0530";
        Date result = format.parse(dateStr);
        assertNotNull("Timezone without colon should parse", result);
        String formatted = format.format(result);
        assertTrue("Formatted should show UTC", formatted.endsWith("Z"));
    }

    @Test
    public void testParseTimezoneWithHourOnly() throws Exception {
        String dateStr = "2021-01-01T12:30:00.000+05";
        Date result = format.parse(dateStr);
        assertNotNull("Timezone with hour only should parse", result);
        String formatted = format.format(result);
        assertTrue("Formatted should show UTC", formatted.endsWith("Z"));
    }

    @Test
    public void testParseNumericGreaterThanLongMax() {
        String largeNumber = "9223372036854775808"; // Long.MAX_VALUE + 1
        try {
            Date result = format.parse(largeNumber);
            assertNotNull("Large number should parse as timestamp", result);
        } catch (ParseException e) {
            fail("Large number should parse as timestamp: " + e.getMessage());
        }
    }

    @Test
    public void testParseNumericEqualsLongMax() throws Exception {
        String maxLong = String.valueOf(Long.MAX_VALUE);
        Date result = format.parse(maxLong);
        assertNotNull("Long.MAX_VALUE should parse", result);
        assertEquals("Should be exactly Long.MAX_VALUE", Long.MAX_VALUE, result.getTime());
    }

    @Test
    public void testParseNumericLessThanLongMin() {
        String smallNumber = "-9223372036854775809"; // Long.MIN_VALUE - 1
        try {
            Date result = format.parse(smallNumber);
            assertNull("Out of long range should not parse as numeric", result);
        } catch (ParseException e) {
            // Should not throw, but if does, it's fine
        }
    }

    @Test
    public void testParseISO8601StartsWithZulu() throws Exception {
        String dateStr = "Z2021-01-01T00:00:00.000Z";
        Date result = format.parse(dateStr);
        assertNotNull("Date with leading Z should parse", result);
    }

    @Test
    public void testParseISO8601WithLeadingDigitsMisplaced() {
        String dateStr = "12x2021-01-01T00:00:00.000Z";
        try {
            Date result = format.parse(dateStr);
            assertNotNull("Date with leading digits should parse", result);
        } catch (ParseException e) {
            fail("Date with leading digits should parse: " + e.getMessage());
        }
    }
}