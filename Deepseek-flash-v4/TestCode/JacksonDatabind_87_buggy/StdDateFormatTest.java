package com.fasterxml.jackson.databind.util;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Before;
import org.junit.Test;

public class StdDateFormatTest {

    private StdDateFormat std;

    @Before
    public void setUp() {
        std = new StdDateFormat();
    }

    @Test
    public void testDefaultTimeZoneIsUtc() {
        assertEquals("UTC", StdDateFormat.getDefaultTimeZone().getID());
        assertNull(std.getTimeZone());
    }

    @Test
    public void testParseIsoZulu() throws Exception {
        assertEquals(new Date(0), std.parse("1970-01-01T00:00:00.000Z"));
    }

    @Test
    public void testParseIsoZuluWithoutMillis() throws Exception {
        assertEquals(new Date(0), std.parse("1970-01-01T00:00:00Z"));
    }

    @Test
    public void testParseIsoPlainDate() throws Exception {
        assertEquals(new Date(0), std.parse("1970-01-01"));
    }

    @Test
    public void testParseIsoWithoutTimeZone() throws Exception {
        assertEquals(new Date(0), std.parse("1970-01-01T00:00:00"));
    }

    @Test
    public void testParseIsoWithColonOffset() throws Exception {
        assertEquals(new Date(0), std.parse("1970-01-01T01:00:00.000+01:00"));
    }

    @Test
    public void testParseIsoWithNumericOffset() throws Exception {
        assertEquals(new Date(0), std.parse("1970-01-01T01:00:00.000+0100"));
    }

    @Test
    public void testParseRfc1123() throws Exception {
        assertEquals(new Date(0), std.parse("Thu, 01 Jan 1970 00:00:00 GMT"));
    }

    @Test
    public void testParseNumericTimestamp() throws Exception {
        assertEquals(new Date(0), std.parse("0"));
        assertEquals(new Date(-1), std.parse("-1"));
    }

    @Test(expected = ParseException.class)
    public void testParseInvalidThrows() throws Exception {
        std.parse("not-a-date");
    }

    @Test(expected = NullPointerException.class)
    public void testParseNullThrows() throws Exception {
        std.parse(null);
    }

    @Test
    public void testParseWithPositionIso() {
        ParsePosition pos = new ParsePosition(0);
        assertEquals(new Date(0), std.parse("1970-01-01", pos));
    }

    @Test
    public void testParseWithPositionInvalidReturnsNull() {
        ParsePosition pos = new ParsePosition(0);
        assertNull(std.parse("not-a-date", pos));
    }

    @Test
    public void testParseWithPositionLenientFalseReturnsNull() {
        std.setLenient(false);
        ParsePosition pos = new ParsePosition(0);
        assertNull(std.parse("2017-02-29", pos));
    }

    @Test
    public void testFormat() {
        StringBuffer sb = new StringBuffer();
        StringBuffer result = std.format(new Date(0), sb,
                new FieldPosition(DateFormat.DATE_FIELD));
        assertSame(sb, result);
        assertEquals("1970-01-01T00:00:00.000+0000", sb.toString());
    }

    @Test
    public void testWithTimeZone() {
        TimeZone utc = TimeZone.getTimeZone("UTC");
        StdDateFormat withTz = std.withTimeZone(utc);
        assertNotSame(std, withTz);
        assertEquals(utc, withTz.getTimeZone());
        assertSame(withTz, withTz.withTimeZone(utc));
    }

    @Test
    public void testWithTimeZoneNullUsesUtc() {
        StdDateFormat withUtc = std.withTimeZone(null);
        assertEquals(StdDateFormat.getDefaultTimeZone(), withUtc.getTimeZone());
    }

    @Test
    public void testWithLocale() {
        assertSame(std, std.withLocale(Locale.US));
        StdDateFormat french = std.withLocale(Locale.FRANCE);
        assertNotSame(std, french);
        assertTrue(french.toString().contains("fr_FR"));
    }

    @Test
    public void testClonePreservesConfiguration() {
        StdDateFormat configured = std.withTimeZone(TimeZone.getTimeZone("GMT+01:00"));
        configured.setLenient(false);

        StdDateFormat copy = configured.clone();
        assertNotSame(configured, copy);
        assertEquals(configured.getTimeZone(), copy.getTimeZone());
        assertFalse(copy.isLenient());
    }

    @Test
    public void testSetTimeZone() {
        TimeZone tz = TimeZone.getTimeZone("GMT+02:00");
        std.setTimeZone(tz);
        assertEquals(tz, std.getTimeZone());
    }

    @Test
    public void testSetLenient() {
        assertTrue(std.isLenient());
        std.setLenient(false);
        assertFalse(std.isLenient());
        std.setLenient(true);
        assertTrue(std.isLenient());
    }

    @Test
    public void testSetLenientStrictParsingRejectsInvalidDate() throws Exception {
        std.setLenient(false);
        try {
            std.parse("2017-02-29");
            fail("Should have thrown ParseException");
        } catch (ParseException expected) {
            // expected
        }
    }

    @Test
    public void testGetISO8601Format() {
        DateFormat df = StdDateFormat.getISO8601Format(
                TimeZone.getTimeZone("UTC"), Locale.US);
        assertEquals("1970-01-01T00:00:00.000+0000", df.format(new Date(0)));
    }

    @Test
    public void testGetISO8601FormatNonDefaultLocale() {
        DateFormat df = StdDateFormat.getISO8601Format(
                TimeZone.getTimeZone("GMT+05:30"), Locale.FRANCE);
        assertEquals("1970-01-01T05:30:00.000+0530", df.format(new Date(0)));
    }

    @Test
    public void testGetRFC1123Format() {
        DateFormat df = StdDateFormat.getRFC1123Format(
                TimeZone.getTimeZone("GMT"), Locale.US);
        assertEquals("Thu, 01 Jan 1970 00:00:00 GMT", df.format(new Date(0)));
    }

    @Test
    public void testEqualsAndHashCode() {
        assertTrue(std.equals(std));
        assertFalse(std.equals(new StdDateFormat()));
        assertEquals(std.hashCode(), std.hashCode());
    }

    @Test
    public void testToString() {
        assertTrue(std.toString().contains("com.fasterxml.jackson.databind.util.StdDateFormat"));
        assertTrue(std.toString().contains("en_US"));
    }
}