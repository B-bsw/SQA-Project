package com.google.gson.internal.bind.util;

import org.junit.Assert;
import org.junit.Test;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class ISO8601UtilsTest {

    @Test
    public void constructor_shouldInstantiateSuccessfully() {
        ISO8601Utils utils = new ISO8601Utils();
        Assert.assertNotNull(utils);
    }

    @Test
    public void format_givenDate_shouldFormatUtcWithoutMillis() {
        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("UTC"), Locale.US);
        cal.set(2023, Calendar.OCTOBER, 25, 14, 30, 45);
        cal.set(Calendar.MILLISECOND, 123);
        Date date = cal.getTime();

        String formatted = ISO8601Utils.format(date);

        Assert.assertEquals("2023-10-25T14:30:45Z", formatted);
    }

    @Test
    public void format_givenDateAndMillisTrue_shouldFormatUtcWithMillis() {
        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("UTC"), Locale.US);
        cal.set(2023, Calendar.JANUARY, 5, 8, 9, 7);
        cal.set(Calendar.MILLISECOND, 42);
        Date date = cal.getTime();

        String formatted = ISO8601Utils.format(date, true);

        Assert.assertEquals("2023-01-05T08:09:07.042Z", formatted);
    }

    @Test
    public void format_givenDateAndMillisFalse_shouldFormatUtcWithoutMillis() {
        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("UTC"), Locale.US);
        cal.set(2023, Calendar.JANUARY, 5, 8, 9, 7);
        cal.set(Calendar.MILLISECOND, 42);
        Date date = cal.getTime();

        String formatted = ISO8601Utils.format(date, false);

        Assert.assertEquals("2023-01-05T08:09:07Z", formatted);
    }

    @Test
    public void format_givenPositiveOffsetTimezone_shouldFormatWithPositiveOffset() {
        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("GMT+05:30"), Locale.US);
        cal.set(2023, Calendar.OCTOBER, 25, 14, 30, 45);
        cal.set(Calendar.MILLISECOND, 0);
        Date date = cal.getTime();

        String formatted = ISO8601Utils.format(date, false, TimeZone.getTimeZone("GMT+05:30"));

        Assert.assertEquals("2023-10-25T14:30:45+05:30", formatted);
    }

    @Test
    public void format_givenNegativeOffsetTimezoneAndMillis_shouldFormatWithNegativeOffsetAndMillis() {
        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("GMT-08:00"), Locale.US);
        cal.set(2023, Calendar.DECEMBER, 31, 23, 59, 59);
        cal.set(Calendar.MILLISECOND, 999);
        Date date = cal.getTime();

        String formatted = ISO8601Utils.format(date, true, TimeZone.getTimeZone("GMT-08:00"));

        Assert.assertEquals("2023-12-31T23:59:59.999-08:00", formatted);
    }

    @Test
    public void format_givenGmtTimezone_shouldFormatWithZ() {
        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("GMT"), Locale.US);
        cal.set(2023, Calendar.MARCH, 1, 0, 0, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date date = cal.getTime();

        String formatted = ISO8601Utils.format(date, false, TimeZone.getTimeZone("GMT"));

        Assert.assertEquals("2023-03-01T00:00:00Z", formatted);
    }

    @Test
    public void parse_givenDateOnlyWithHyphens_shouldParseSuccessfully() throws ParseException {
        String input = "2023-10-25";
        ParsePosition pos = new ParsePosition(0);

        Date result = ISO8601Utils.parse(input, pos);

        Calendar expected = new GregorianCalendar(2023, Calendar.OCTOBER, 25);
        Assert.assertEquals(expected.getTime(), result);
        Assert.assertEquals(input.length(), pos.getIndex());
    }

    @Test
    public void parse_givenDateOnlyWithoutHyphens_shouldParseSuccessfully() throws ParseException {
        String input = "20231025";
        ParsePosition pos = new ParsePosition(0);

        Date result = ISO8601Utils.parse(input, pos);

        Calendar expected = new GregorianCalendar(2023, Calendar.OCTOBER, 25);
        Assert.assertEquals(expected.getTime(), result);
        Assert.assertEquals(input.length(), pos.getIndex());
    }

    @Test
    public void parse_givenDateOnlyWithZTimezone_shouldParseSuccessfully() throws ParseException {
        String input = "2023-10-25Z";
        ParsePosition pos = new ParsePosition(0);

        Date result = ISO8601Utils.parse(input, pos);

        Calendar expected = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        expected.set(2023, Calendar.OCTOBER, 25, 0, 0, 0);
        expected.set(Calendar.MILLISECOND, 0);
        Assert.assertEquals(expected.getTime(), result);
        Assert.assertEquals(input.length(), pos.getIndex());
    }

    @Test
    public void parse_givenDateTimeWithHyphensAndColons_shouldParseSuccessfully() throws ParseException {
        String input = "2023-10-25T14:30:45Z";
        ParsePosition pos = new ParsePosition(0);

        Date result = ISO8601Utils.parse(input, pos);

        Calendar expected = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        expected.set(2023, Calendar.OCTOBER, 25, 14, 30, 45);
        expected.set(Calendar.MILLISECOND, 0);
        Assert.assertEquals(expected.getTime(), result);
        Assert.assertEquals(input.length(), pos.getIndex());
    }

    @Test
    public void parse_givenDateTimeWithoutSeparators_shouldParseSuccessfully() throws ParseException {
        String input = "20231025T143045Z";
        ParsePosition pos = new ParsePosition(0);

        Date result = ISO8601Utils.parse(input, pos);

        Calendar expected = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        expected.set(2023, Calendar.OCTOBER, 25, 14, 30, 45);
        expected.set(Calendar.MILLISECOND, 0);
        Assert.assertEquals(expected.getTime(), result);
        Assert.assertEquals(input.length(), pos.getIndex());
    }

    @Test
    public void parse_givenDateTimeWithoutSeconds_shouldParseWithSecondsZero() throws ParseException {
        String input = "2023-10-25T14:30Z";
        ParsePosition pos = new ParsePosition(0);

        Date result = ISO8601Utils.parse(input, pos);

        Calendar expected = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        expected.set(2023, Calendar.OCTOBER, 25, 14, 30, 0);
        expected.set(Calendar.MILLISECOND, 0);
        Assert.assertEquals(expected.getTime(), result);
        Assert.assertEquals(input.length(), pos.getIndex());
    }

    @Test
    public void parse_givenOneDigitMillis_shouldScaleToHundreds() throws ParseException {
        String input = "2023-10-25T14:30:45.5Z";
        ParsePosition pos = new ParsePosition(0);

        Date result = ISO8601Utils.parse(input, pos);

        Calendar expected = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        expected.set(2023, Calendar.OCTOBER, 25, 14, 30, 45);
        expected.set(Calendar.MILLISECOND, 500);
        Assert.assertEquals(expected.getTime(), result);
        Assert.assertEquals(input.length(), pos.getIndex());
    }

    @Test
    public void parse_givenTwoDigitsMillis_shouldScaleToTens() throws ParseException {
        String input = "2023-10-25T14:30:45.25Z";
        ParsePosition pos = new ParsePosition(0);

        Date result = ISO8601Utils.parse(input, pos);

        Calendar expected = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        expected.set(2023, Calendar.OCTOBER, 25, 14, 30, 45);
        expected.set(Calendar.MILLISECOND, 250);
        Assert.assertEquals(expected.getTime(), result);
        Assert.assertEquals(input.length(), pos.getIndex());
    }

    @Test
    public void parse_givenThreeDigitsMillis_shouldParseCorrectly() throws ParseException {
        String input = "2023-10-25T14:30:45.123Z";
        ParsePosition pos = new ParsePosition(0);

        Date result = ISO8601Utils.parse(input, pos);

        Calendar expected = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        expected.set(2023, Calendar.OCTOBER, 25, 14, 30, 45);
        expected.set(Calendar.MILLISECOND, 123);
        Assert.assertEquals(expected.getTime(), result);
        Assert.assertEquals(input.length(), pos.getIndex());
    }

    @Test
    public void parse_givenMoreThanThreeDigitsMillis_shouldParseOnlyFirstThreeDigits() throws ParseException {
        String input = "2023-10-25T14:30:45.123456Z";
        ParsePosition pos = new ParsePosition(0);

        Date result = ISO8601Utils.parse(input, pos);

        Calendar expected = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        expected.set(2023, Calendar.OCTOBER, 25, 14, 30, 45);
        expected.set(Calendar.MILLISECOND, 123);
        Assert.assertEquals(expected.getTime(), result);
        Assert.assertEquals(input.length(), pos.getIndex());
    }

    @Test
    public void parse_givenLeapSeconds60_shouldTruncateTo59() throws ParseException {
        String input = "2023-10-25T23:59:60Z";
        ParsePosition pos = new ParsePosition(0);

        Date result = ISO8601Utils.parse(input, pos);

        Calendar expected = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        expected.set(2023, Calendar.OCTOBER, 25, 23, 59, 59);
        expected.set(Calendar.MILLISECOND, 0);
        Assert.assertEquals(expected.getTime(), result);
    }

    @Test
    public void parse_givenLeapSeconds61_shouldTruncateTo59() throws ParseException {
        String input = "2023-10-25T23:59:61Z";
        ParsePosition pos = new ParsePosition(0);

        Date result = ISO8601Utils.parse(input, pos);

        Calendar expected = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        expected.set(2023, Calendar.OCTOBER, 25, 23, 59, 59);
        expected.set(Calendar.MILLISECOND, 0);
        Assert.assertEquals(expected.getTime(), result);
    }

    @Test
    public void parse_givenLeapSeconds62_shouldTruncateTo59() throws ParseException {
        String input = "2023-10-25T23:59:62Z";
        ParsePosition pos = new ParsePosition(0);

        Date result = ISO8601Utils.parse(input, pos);

        Calendar expected = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        expected.set(2023, Calendar.OCTOBER, 25, 23, 59, 59);
        expected.set(Calendar.MILLISECOND, 0);
        Assert.assertEquals(expected.getTime(), result);
    }

    @Test
    public void parse_givenPositiveOffsetWithColon_shouldParseSuccessfully() throws ParseException {
        String input = "2023-10-25T14:30:45+02:00";
        ParsePosition pos = new ParsePosition(0);

        Date result = ISO8601Utils.parse(input, pos);

        Calendar expected = new GregorianCalendar(TimeZone.getTimeZone("GMT+02:00"));
        expected.set(2023, Calendar.OCTOBER, 25, 14, 30, 45);
        expected.set(Calendar.MILLISECOND, 0);
        Assert.assertEquals(expected.getTime(), result);
        Assert.assertEquals(input.length(), pos.getIndex());
    }

    @Test
    public void parse_givenPositiveOffsetWithoutColon_shouldParseSuccessfully() throws ParseException {
        String input = "2023-10-25T14:30:45+0200";
        ParsePosition pos = new ParsePosition(0);

        Date result = ISO8601Utils.parse(input, pos);

        Calendar expected = new GregorianCalendar(TimeZone.getTimeZone("GMT+02:00"));
        expected.set(2023, Calendar.OCTOBER, 25, 14, 30, 45);
        expected.set(Calendar.MILLISECOND, 0);
        Assert.assertEquals(expected.getTime(), result);
        Assert.assertEquals(input.length(), pos.getIndex());
    }

    @Test
    public void parse_givenNegativeOffset_shouldParseSuccessfully() throws ParseException {
        String input = "2023-10-25T14:30:45-05:00";
        ParsePosition pos = new ParsePosition(0);

        Date result = ISO8601Utils.parse(input, pos);

        Calendar expected = new GregorianCalendar(TimeZone.getTimeZone("GMT-05:00"));
        expected.set(2023, Calendar.OCTOBER, 25, 14, 30, 45);
        expected.set(Calendar.MILLISECOND, 0);
        Assert.assertEquals(expected.getTime(), result);
        Assert.assertEquals(input.length(), pos.getIndex());
    }

    @Test
    public void parse_givenZeroOffsetStringPlus0000_shouldParseAsUtc() throws ParseException {
        String input = "2023-10-25T14:30:45+0000";
        ParsePosition pos = new ParsePosition(0);

        Date result = ISO8601Utils.parse(input, pos);

        Calendar expected = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        expected.set(2023, Calendar.OCTOBER, 25, 14, 30, 45);
        expected.set(Calendar.MILLISECOND, 0);
        Assert.assertEquals(expected.getTime(), result);
    }

    @Test
    public void parse_givenZeroOffsetStringPlus00Colon00_shouldParseAsUtc() throws ParseException {
        String input = "2023-10-25T14:30:45+00:00";
        ParsePosition pos = new ParsePosition(0);

        Date result = ISO8601Utils.parse(input, pos);

        Calendar expected = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        expected.set(2023, Calendar.OCTOBER, 25, 14, 30, 45);
        expected.set(Calendar.MILLISECOND, 0);
        Assert.assertEquals(expected.getTime(), result);
    }

    @Test
    public void parse_givenStartOffsetInParsePosition_shouldParseFromOffset() throws ParseException {
        String input = "prefix 2023-10-25T14:30:45Z postfix";
        ParsePosition pos = new ParsePosition(7);

        Date result = ISO8601Utils.parse(input, pos);

        Calendar expected = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        expected.set(2023, Calendar.OCTOBER, 25, 14, 30, 45);
        expected.set(Calendar.MILLISECOND, 0);
        Assert.assertEquals(expected.getTime(), result);
        Assert.assertEquals(27, pos.getIndex());
    }

    @Test
    public void parse_givenMissingTimezoneIndicator_shouldThrowParseException() {
        String input = "2023-10-25T14:30:45";
        ParsePosition pos = new ParsePosition(0);

        try {
            ISO8601Utils.parse(input, pos);
            Assert.fail("Expected ParseException to be thrown");
        } catch (ParseException ex) {
            Assert.assertTrue(ex.getMessage().contains("No time zone indicator"));
            Assert.assertEquals(0, ex.getErrorOffset());
        }
    }

    @Test
    public void parse_givenInvalidTimezoneIndicatorChar_shouldThrowParseException() {
        String input = "2023-10-25T14:30:45X";
        ParsePosition pos = new ParsePosition(0);

        try {
            ISO8601Utils.parse(input, pos);
            Assert.fail("Expected ParseException to be thrown");
        } catch (ParseException ex) {
            Assert.assertTrue(ex.getMessage().contains("Invalid time zone indicator 'X'"));
        }
    }

    @Test
    public void parse_givenMismatchingTimezoneIndicator_shouldThrowParseException() {
        String input = "2023-10-25T14:30:45+INVALID";
        ParsePosition pos = new ParsePosition(0);

        try {
            ISO8601Utils.parse(input, pos);
            Assert.fail("Expected ParseException to be thrown");
        } catch (ParseException ex) {
            Assert.assertTrue(ex.getMessage().contains("Mismatching time zone indicator"));
        }
    }

    @Test
    public void parse_givenInvalidCalendarDay_shouldThrowParseException() {
        String input = "2023-02-31T10:00:00Z";
        ParsePosition pos = new ParsePosition(0);

        try {
            ISO8601Utils.parse(input, pos);
            Assert.fail("Expected ParseException for invalid calendar day");
        } catch (ParseException ex) {
            Assert.assertNotNull(ex.getCause());
            Assert.assertTrue(ex.getCause() instanceof IllegalArgumentException);
        }
    }

    @Test
    public void parse_givenNonDigitCharactersInYear_shouldThrowParseException() {
        String input = "ABCD-10-25T14:30:45Z";
        ParsePosition pos = new ParsePosition(0);

        try {
            ISO8601Utils.parse(input, pos);
            Assert.fail("Expected ParseException for non-digit year");
        } catch (ParseException ex) {
            Assert.assertNotNull(ex.getCause());
            Assert.assertTrue(ex.getCause() instanceof NumberFormatException);
        }
    }

    @Test
    public void parse_givenNonDigitSubsequentCharacterInNumber_shouldThrowParseException() {
        String input = "202A-10-25T14:30:45Z";
        ParsePosition pos = new ParsePosition(0);

        try {
            ISO8601Utils.parse(input, pos);
            Assert.fail("Expected ParseException for invalid digit in year");
        } catch (ParseException ex) {
            Assert.assertNotNull(ex.getCause());
            Assert.assertTrue(ex.getCause() instanceof NumberFormatException);
        }
    }

    @Test
    public void parse_givenEmptyString_shouldThrowParseExceptionWithClassNameWhenMessageIsEmpty() {
        String input = "";
        ParsePosition pos = new ParsePosition(0);

        try {
            ISO8601Utils.parse(input, pos);
            Assert.fail("Expected ParseException for empty input");
        } catch (ParseException ex) {
            Assert.assertNotNull(ex.getCause());
            Assert.assertTrue(ex.getMessage().contains(ex.getCause().getClass().getName()));
        }
    }

    @Test
    public void parse_givenStringShorterThanExpectedYear_shouldThrowParseException() {
        String input = "202";
        ParsePosition pos = new ParsePosition(0);

        try {
            ISO8601Utils.parse(input, pos);
            Assert.fail("Expected ParseException for incomplete year");
        } catch (ParseException ex) {
            Assert.assertNotNull(ex.getCause());
            Assert.assertTrue(ex.getCause() instanceof NumberFormatException);
        }
    }
}