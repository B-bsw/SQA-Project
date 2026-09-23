package org.apache.commons.lang3.time;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class FastDateParserTest {

    private static final String PATTERN = "yyyy-MM-dd";
    private static final TimeZone TIME_ZONE = TimeZone.getTimeZone("UTC");
    private static final Locale LOCALE = Locale.US;
    
    private FastDateParser parser;

    @Before
    public void setUp() {
        parser = new FastDateParser(PATTERN, TIME_ZONE, LOCALE);
    }

    @After
    public void tearDown() {
        parser = null;
    }

    @Test
    public void testGetPattern() {
        assertEquals(PATTERN, parser.getPattern());
    }

    @Test
    public void testGetTimeZone() {
        assertEquals(TIME_ZONE, parser.getTimeZone());
    }

    @Test
    public void testGetLocale() {
        assertEquals(LOCALE, parser.getLocale());
    }

    @Test
    public void testParseValidDate() throws ParseException {
        Date date = parser.parse("2023-10-10");
        assertNotNull(date);
        Calendar cal = Calendar.getInstance(TIME_ZONE, LOCALE);
        cal.setTime(date);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(Calendar.OCTOBER, cal.get(Calendar.MONTH));
        assertEquals(10, cal.get(Calendar.DAY_OF_MONTH));
    }

    @Test(expected = ParseException.class)
    public void testParseInvalidDate() throws ParseException {
        parser.parse("invalid-date");
    }

    @Test
    public void testParseNullSource() throws ParseException {
        try {
            parser.parse((String) null);
            fail("Expected ParseException for null source");
        } catch (ParseException e) {
            // expected
        }
    }

    @Test
    public void testParseObject() throws ParseException {
        Object obj = parser.parseObject("2023-10-10");
        assertTrue(obj instanceof Date);
    }

    @Test
    public void testParseWithParsePosition() {
        ParsePosition pos = new ParsePosition(0);
        Date date = parser.parse("2023-10-10 extra", pos);
        assertNotNull(date);
        assertEquals(10, pos.getIndex());
    }

    @Test
    public void testParseWithInvalidPosition() {
        ParsePosition pos = new ParsePosition(5);
        Date date = parser.parse("2023-10-10", pos);
        assertNull(date);
    }

    @Test
    public void testEquals() {
        FastDateParser parser2 = new FastDateParser(PATTERN, TIME_ZONE, LOCALE);
        assertEquals(parser, parser2);
        assertFalse(parser.equals(new Object()));
    }

    @Test
    public void testHashCode() {
        FastDateParser parser2 = new FastDateParser(PATTERN, TIME_ZONE, LOCALE);
        assertEquals(parser.hashCode(), parser2.hashCode());
    }

    @Test
    public void testToString() {
        String str = parser.toString();
        assertTrue(str.contains(PATTERN));
        assertTrue(str.contains(LOCALE.toString()));
        assertTrue(str.contains(TIME_ZONE.getID()));
    }

    @Test
    public void testParseWithJapaneseImperial() throws ParseException {
        FastDateParser jpParser = new FastDateParser("yyyy-MM-dd", 
            TimeZone.getTimeZone("Asia/Tokyo"), FastDateParser.JAPANESE_IMPERIAL);
        try {
            jpParser.parse("1867-01-01");
            fail("Expected ParseException for Japanese Imperial before 1868");
        } catch (ParseException e) {
            assertTrue(e.getMessage().contains("1868"));
        }
    }

    @Test
    public void testParseWithTimeZoneStrategy() throws ParseException {
        FastDateParser tzParser = new FastDateParser("yyyy-MM-dd z", TIME_ZONE, LOCALE);
        Date date = tzParser.parse("2023-10-10 UTC");
        assertNotNull(date);
    }

    @Test
    public void testGetDisplayNamesForEra() {
        FastDateParser eraParser = new FastDateParser("G yyyy", TIME_ZONE, LOCALE);
        String[] eras = ((FastDateParser) eraParser).getDisplayNames(Calendar.ERA);
        assertNotNull(eras);
        assertTrue(eras.length > 0);
    }

    @Test
    public void testAdjustYear() {
        FastDateParser p = new FastDateParser("yy", TIME_ZONE, LOCALE);
        assertEquals(2023, p.adjustYear(23));
        assertEquals(1999, p.adjustYear(99));
        assertEquals(2020, p.adjustYear(0));
    }

    @Test
    public void testIsNextNumber() {
        FastDateParser p = new FastDateParser("MM-dd", TIME_ZONE, LOCALE);
        assertFalse(p.isNextNumber());
    }

    @Test
    public void testGetFieldWidth() {
        FastDateParser p = new FastDateParser("yyyy-MM-dd", TIME_ZONE, LOCALE);
        assertEquals(4, p.getFieldWidth());
    }
}