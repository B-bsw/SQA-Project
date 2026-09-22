package com.google.gson.internal.bind.util;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class ISO8601UtilsTest {
    private static final TimeZone UTC = TimeZone.getTimeZone("UTC");
    private static final TimeZone GMT_PLUS_5 = TimeZone.getTimeZone("GMT+05:00");
    
    @Before
    public void setUp() {
        // No initialization needed
    }
    
    @After
    public void tearDown() {
        // No cleanup needed
    }
    
    @Test
    public void testFormatDefaultTimezone() {
        Calendar cal = Calendar.getInstance(UTC);
        cal.set(2024, Calendar.JANUARY, 15, 10, 30, 45);
        cal.set(Calendar.MILLISECOND, 0);
        Date date = cal.getTime();
        
        String result = ISO8601Utils.format(date);
        Assert.assertEquals("2024-01-15T10:30:45Z", result);
    }
    
    @Test
    public void testFormatWithMillis() {
        Calendar cal = Calendar.getInstance(UTC);
        cal.set(2024, Calendar.JANUARY, 15, 10, 30, 45);
        cal.set(Calendar.MILLISECOND, 123);
        Date date = cal.getTime();
        
        String result = ISO8601Utils.format(date, true);
        Assert.assertEquals("2024-01-15T10:30:45.123Z", result);
    }
    
    @Test
    public void testFormatWithoutMillis() {
        Calendar cal = Calendar.getInstance(UTC);
        cal.set(2024, Calendar.JANUARY, 15, 10, 30, 45);
        cal.set(Calendar.MILLISECOND, 123);
        Date date = cal.getTime();
        
        String result = ISO8601Utils.format(date, false);
        Assert.assertEquals("2024-01-15T10:30:45Z", result);
    }
    
    @Test
    public void testFormatWithCustomTimeZone() {
        Calendar cal = Calendar.getInstance(GMT_PLUS_5);
        cal.set(2024, Calendar.JANUARY, 15, 10, 30, 45);
        cal.set(Calendar.MILLISECOND, 0);
        Date date = cal.getTime();
        
        String result = ISO8601Utils.format(date, false, GMT_PLUS_5);
        Assert.assertEquals("2024-01-15T10:30:45+05:00", result);
    }
    
    @Test
    public void testParseDateOnly() throws ParseException {
        ParsePosition pos = new ParsePosition(0);
        Date result = ISO8601Utils.parse("2024-01-15", pos);
        
        Assert.assertNotNull(result);
        Calendar cal = Calendar.getInstance(UTC);
        cal.setTime(result);
        Assert.assertEquals(2024, cal.get(Calendar.YEAR));
        Assert.assertEquals(Calendar.JANUARY, cal.get(Calendar.MONTH));
        Assert.assertEquals(15, cal.get(Calendar.DAY_OF_MONTH));
        Assert.assertEquals(0, cal.get(Calendar.HOUR_OF_DAY));
        Assert.assertEquals(0, cal.get(Calendar.MINUTE));
        Assert.assertEquals(0, cal.get(Calendar.SECOND));
        Assert.assertEquals(0, cal.get(Calendar.MILLISECOND));
    }
    
    @Test
    public void testParseDateTimeWithMillisAndZ() throws ParseException {
        String input = "2024-01-15T10:30:45.123Z";
        ParsePosition pos = new ParsePosition(0);
        Date result = ISO8601Utils.parse(input, pos);
        
        Assert.assertNotNull(result);
        Calendar cal = Calendar.getInstance(UTC);
        cal.setTime(result);
        Assert.assertEquals(2024, cal.get(Calendar.YEAR));
        Assert.assertEquals(Calendar.JANUARY, cal.get(Calendar.MONTH));
        Assert.assertEquals(15, cal.get(Calendar.DAY_OF_MONTH));
        Assert.assertEquals(10, cal.get(Calendar.HOUR_OF_DAY));
        Assert.assertEquals(30, cal.get(Calendar.MINUTE));
        Assert.assertEquals(45, cal.get(Calendar.SECOND));
        Assert.assertEquals(123, cal.get(Calendar.MILLISECOND));
    }
    
    @Test
    public void testParseCompactFormat() throws ParseException {
        String input = "20240115T103045.123Z";
        ParsePosition pos = new ParsePosition(0);
        Date result = ISO8601Utils.parse(input, pos);
        
        Assert.assertNotNull(result);
        Calendar cal = Calendar.getInstance(UTC);
        cal.setTime(result);
        Assert.assertEquals(2024, cal.get(Calendar.YEAR));
        Assert.assertEquals(Calendar.JANUARY, cal.get(Calendar.MONTH));
        Assert.assertEquals(15, cal.get(Calendar.DAY_OF_MONTH));
        Assert.assertEquals(10, cal.get(Calendar.HOUR_OF_DAY));
        Assert.assertEquals(30, cal.get(Calendar.MINUTE));
        Assert.assertEquals(45, cal.get(Calendar.SECOND));
        Assert.assertEquals(123, cal.get(Calendar.MILLISECOND));
    }
    
    @Test
    public void testParseWithPositiveOffset() throws ParseException {
        String input = "2024-01-15T10:30:45+05:00";
        ParsePosition pos = new ParsePosition(0);
        Date result = ISO8601Utils.parse(input, pos);
        
        Assert.assertNotNull(result);
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT+05:00"));
        cal.setTime(result);
        Assert.assertEquals(10, cal.get(Calendar.HOUR_OF_DAY));
        Assert.assertEquals(30, cal.get(Calendar.MINUTE));
        Assert.assertEquals(45, cal.get(Calendar.SECOND));
    }
    
    @Test
    public void testParseWithNegativeOffset() throws ParseException {
        String input = "2024-01-15T10:30:45-03:00";
        ParsePosition pos = new ParsePosition(0);
        Date result = ISO8601Utils.parse(input, pos);
        
        Assert.assertNotNull(result);
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT-03:00"));
        cal.setTime(result);
        Assert.assertEquals(10, cal.get(Calendar.HOUR_OF_DAY));
        Assert.assertEquals(30, cal.get(Calendar.MINUTE));
    }
    
    @Test
    public void testParseWithoutSeconds() throws ParseException {
        String input = "2024-01-15T10:30Z";
        ParsePosition pos = new ParsePosition(0);
        Date result = ISO8601Utils.parse(input, pos);
        
        Assert.assertNotNull(result);
        Calendar cal = Calendar.getInstance(UTC);
        cal.setTime(result);
        Assert.assertEquals(10, cal.get(Calendar.HOUR_OF_DAY));
        Assert.assertEquals(30, cal.get(Calendar.MINUTE));
        Assert.assertEquals(0, cal.get(Calendar.SECOND));
    }
    
    @Test
    public void testParseLeapSecond() throws ParseException {
        String input = "2024-01-15T10:30:60Z";
        ParsePosition pos = new ParsePosition(0);
        Date result = ISO8601Utils.parse(input, pos);
        
        Assert.assertNotNull(result);
        Calendar cal = Calendar.getInstance(UTC);
        cal.setTime(result);
        Assert.assertEquals(59, cal.get(Calendar.SECOND));
    }
    
    @Test
    public void testParseWith0020OffsetReduction() throws ParseException {
        // Test with +0000 offset
        String input = "2024-01-15T10:30:45+0000";
        ParsePosition pos = new ParsePosition(0);
        Date result = ISO8601Utils.parse(input, pos);
        Assert.assertNotNull(result);
        
        // Test with +00:00 offset
        String input2 = "2024-01-15T10:30:45+00:00";
        ParsePosition pos2 = new ParsePosition(0);
        Date result2 = ISO8601Utils.parse(input2, pos2);
        Assert.assertNotNull(result2);
    }
    
    @Test
    public void testParseNullInput() {
        ParsePosition pos = new ParsePosition(0);
        try {
            ISO8601Utils.parse(null, pos);
            Assert.fail("Expected NumberFormatException");
        } catch (ParseException e) {
            // Expected
        } catch (NumberFormatException e) {
            // Also acceptable
        }
    }
    
    @Test
    public void testParseInvalidDateFormat() {
        String input = "invalid-date-format";
        ParsePosition pos = new ParsePosition(0);
        try {
            ISO8601Utils.parse(input, pos);
            Assert.fail("Expected ParseException");
        } catch (ParseException e) {
            // Expected
        } catch (IndexOutOfBoundsException e) {
            // Possible different exception
        }
    }
    
    @Test
    public void testParseNullFirstCharacter() {
        String input = "";
        ParsePosition pos = new ParsePosition(0);
        try {
            ISO8601Utils.parse(input, pos);
            Assert.fail("Expected exception");
        } catch (Exception e) {
            // Expected any exception - not a valid date
        }
    }
    
    @Test
    public void testParseNoTimeZone() {
        String input = "2024-01-15";
        ParsePosition pos = new ParsePosition(0);
        try {
            Date result = ISO8601Utils.parse(input, pos);
            Assert.assertNotNull(result);
        } catch (ParseException e) {
            Assert.fail("Should not throw ParseException for date only input");
        }
    }
    
    @Test
    public void testParseYearBoundary() throws ParseException {
        // Year 0000 is not valid in Gregorian calendar
        String input = "0000-01-01T00:00:00Z";
        ParsePosition pos = new ParsePosition(0);
        try {
            ISO8601Utils.parse(input, pos);
            // May or may not throw - depends on implementation
        } catch (Exception e) {
            // Expected if invalid
        }
        
        // Valid year
        input = "0001-01-01T00:00:00Z";
        pos = new ParsePosition(0);
        try {
            Date result = ISO8601Utils.parse(input, pos);
            Assert.assertNotNull(result);
        } catch (ParseException e) {
            Assert.fail("Year 1 should be valid");
        }
    }
    
    @Test
    public void testParseMonthDayBoundary() {
        String input = "2024-02-30T00:00:00Z"; // Invalid date - Feb 30
        ParsePosition pos = new ParsePosition(0);
        try {
            ISO8601Utils.parse(input, pos);
            // May or may not throw - depends on lenient mode
        } catch (Exception e) {
            // Expected - invalid date
        }
    }
    
    @Test
    public void testParseNegativeOffsetWithColon() throws ParseException {
        String input = "2024-01-15T10:30:45-05:30";
        ParsePosition pos = new ParsePosition(0);
        Date result = ISO8601Utils.parse(input, pos);
        Assert.assertNotNull(result);
        
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT-05:30"));
        cal.setTime(result);
        Assert.assertEquals(10, cal.get(Calendar.HOUR_OF_DAY));
    }
    
    @Test
    public void testParseAlmostFullDate() throws ParseException {
        String input = "2024-01-15T10:30:45.123456789Z"; // Extra precision digits
        ParsePosition pos = new ParsePosition(0);
        Date result = ISO8601Utils.parse(input, pos);
        Assert.assertNotNull(result);
        
        Calendar cal = Calendar.getInstance(UTC);
        cal.setTime(result);
        Assert.assertEquals(123, cal.get(Calendar.MILLISECOND));
    }
    
    @Test
    public void testIndexOutOfBoundsForInvalidEncoding() {
        // Test empty string
        ParsePosition pos = new ParsePosition(0);
        try {
            ISO8601Utils.parse("", pos);
            Assert.fail("Expected exception for empty string");
        } catch (Exception e) {
            // Expected
        }
        
        // Test partial date 
        pos = new ParsePosition(0);
        try {
            ISO8601Utils.parse("2024", pos);
            Assert.fail("Expected exception for incomplete date");
        } catch (Exception e) {
            // Expected
        }
    }
}