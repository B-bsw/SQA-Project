package org.apache.commons.lang3.time;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class FastDateParserTest {

    private static final TimeZone GMT = TimeZone.getTimeZone("GMT");
    private static final TimeZone EST = TimeZone.getTimeZone("EST");
    private static final Locale US = Locale.US;

    @Test
    public void constructor_givenValidPattern_shouldInitializeProperties() {
        String pattern = "yyyy-MM-dd HH:mm:ss";
        FastDateParser parser = new FastDateParser(pattern, GMT, US);

        Assert.assertEquals(pattern, parser.getPattern());
        Assert.assertEquals(GMT, parser.getTimeZone());
        Assert.assertEquals(US, parser.getLocale());
        Assert.assertNotNull(parser.getParsePattern());
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenInvalidPattern_shouldThrowException() {
        new FastDateParser("", GMT, US);
    }

    @Test
    public void parse_givenIsoDateTime_shouldParseCorrectly() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd HH:mm:ss", GMT, US);
        Date date = parser.parse("2023-10-15 14:30:45");

        Calendar cal = Calendar.getInstance(GMT, US);
        cal.setTime(date);

        Assert.assertEquals(2023, cal.get(Calendar.YEAR));
        Assert.assertEquals(Calendar.OCTOBER, cal.get(Calendar.MONTH));
        Assert.assertEquals(15, cal.get(Calendar.DAY_OF_MONTH));
        Assert.assertEquals(14, cal.get(Calendar.HOUR_OF_DAY));
        Assert.assertEquals(30, cal.get(Calendar.MINUTE));
        Assert.assertEquals(45, cal.get(Calendar.SECOND));
    }

    @Test
    public void parseObject_givenValidString_shouldReturnDateInstance() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyy/MM/dd", GMT, US);
        Object obj = parser.parseObject("2021/05/20");

        Assert.assertTrue(obj instanceof Date);
        Calendar cal = Calendar.getInstance(GMT, US);
        cal.setTime((Date) obj);
        Assert.assertEquals(2021, cal.get(Calendar.YEAR));
        Assert.assertEquals(Calendar.MAY, cal.get(Calendar.MONTH));
        Assert.assertEquals(20, cal.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void parseObject_givenParsePosition_shouldParseAndAdvanceIndex() {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", GMT, US);
        ParsePosition pos = new ParsePosition(5);
        Object obj = parser.parseObject("Date:2022-12-25 Rest", pos);

        Assert.assertNotNull(obj);
        Assert.assertEquals(15, pos.getIndex());
        Calendar cal = Calendar.getInstance(GMT, US);
        cal.setTime((Date) obj);
        Assert.assertEquals(2022, cal.get(Calendar.YEAR));
        Assert.assertEquals(Calendar.DECEMBER, cal.get(Calendar.MONTH));
        Assert.assertEquals(25, cal.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void parse_givenMismatchedText_shouldReturnNullAndLeavePositionUnchanged() {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", GMT, US);
        ParsePosition pos = new ParsePosition(0);
        Date date = parser.parse("invalid-date", pos);

        Assert.assertNull(date);
        Assert.assertEquals(0, pos.getIndex());
    }

    @Test
    public void parse_givenUnparseableDate_shouldThrowParseException() {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", GMT, US);
        try {
            parser.parse("invalid-date");
            Assert.fail("Expected ParseException was not thrown");
        } catch (ParseException e) {
            Assert.assertEquals(0, e.getErrorOffset());
            Assert.assertTrue(e.getMessage().contains("Unparseable date: \"invalid-date\""));
        }
    }

    @Test
    public void parse_givenJapaneseImperialLocaleAndInvalidDate_shouldThrowParseExceptionWithImperialNotice() {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", GMT, FastDateParser.JAPANESE_IMPERIAL);
        try {
            parser.parse("invalid-date");
            Assert.fail("Expected ParseException was not thrown");
        } catch (ParseException e) {
            Assert.assertEquals(0, e.getErrorOffset());
            Assert.assertTrue(e.getMessage().contains("does not support dates before 1868 AD"));
        }
    }

    @Test
    public void adjustYear_givenTwoDigitYearScenarios_shouldComputeCorrectCentury() {
        FastDateParser parser = new FastDateParser("yy-MM-dd", GMT, US);
        int currentYear = Calendar.getInstance(GMT, US).get(Calendar.YEAR);
        int currentTwoDigit = currentYear % 100;

        int futureTwoDigit = (currentTwoDigit + 5) % 100;
        int expectedFuture = (futureTwoDigit + currentYear - (currentYear % 100));
        if (expectedFuture >= currentYear + 20) {
            expectedFuture -= 100;
        }
        Assert.assertEquals(expectedFuture, parser.adjustYear(futureTwoDigit));

        int pastTwoDigit = (currentTwoDigit + 30) % 100;
        int expectedPast = (pastTwoDigit + currentYear - (currentYear % 100));
        if (expectedPast >= currentYear + 20) {
            expectedPast -= 100;
        }
        Assert.assertEquals(expectedPast, parser.adjustYear(pastTwoDigit));
    }

    @Test
    public void parse_givenAbbreviatedYear_shouldAdjustYearProperly() throws ParseException {
        FastDateParser parser = new FastDateParser("yy-MM-dd", GMT, US);
        Date date = parser.parse("21-01-01");
        Calendar cal = Calendar.getInstance(GMT, US);
        cal.setTime(date);

        int expectedYear = parser.adjustYear(21);
        Assert.assertEquals(expectedYear, cal.get(Calendar.YEAR));
    }

    @Test
    public void parse_givenFourDigitYearStrategy_shouldParseLiteralYear() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", GMT, US);
        Date date = parser.parse("1995-04-12");
        Calendar cal = Calendar.getInstance(GMT, US);
        cal.setTime(date);
        Assert.assertEquals(1995, cal.get(Calendar.YEAR));
    }

    @Test
    public void parse_givenConsecutiveNumericFields_shouldUseFieldWidth() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyyMMddHHmmssSSS", GMT, US);
        Date date = parser.parse("20231127091530123");
        Calendar cal = Calendar.getInstance(GMT, US);
        cal.setTime(date);

        Assert.assertEquals(2023, cal.get(Calendar.YEAR));
        Assert.assertEquals(Calendar.NOVEMBER, cal.get(Calendar.MONTH));
        Assert.assertEquals(27, cal.get(Calendar.DAY_OF_MONTH));
        Assert.assertEquals(9, cal.get(Calendar.HOUR_OF_DAY));
        Assert.assertEquals(15, cal.get(Calendar.MINUTE));
        Assert.assertEquals(30, cal.get(Calendar.SECOND));
        Assert.assertEquals(123, cal.get(Calendar.MILLISECOND));
    }

    @Test
    public void parse_givenTextMonthAndEraAndDayOfWeek_shouldParseCorrectly() throws ParseException {
        FastDateParser parser = new FastDateParser("G yyyy MMM EEE", GMT, Locale.ENGLISH);
        Date date = parser.parse("AD 2023 Mar Wed");

        Calendar cal = Calendar.getInstance(GMT, Locale.ENGLISH);
        cal.setTime(date);

        Assert.assertEquals(Calendar.AD, cal.get(Calendar.ERA));
        Assert.assertEquals(2023, cal.get(Calendar.YEAR));
        Assert.assertEquals(Calendar.MARCH, cal.get(Calendar.MONTH));
        Assert.assertEquals(Calendar.WEDNESDAY, cal.get(Calendar.DAY_OF_WEEK));
    }

    @Test
    public void parse_givenFullMonthNameAndDayOfWeek_shouldParseCorrectly() throws ParseException {
        FastDateParser parser = new FastDateParser("MMMM d, yyyy, EEEE", GMT, Locale.ENGLISH);
        Date date = parser.parse("September 8, 2021, Wednesday");

        Calendar cal = Calendar.getInstance(GMT, Locale.ENGLISH);
        cal.setTime(date);

        Assert.assertEquals(Calendar.SEPTEMBER, cal.get(Calendar.MONTH));
        Assert.assertEquals(8, cal.get(Calendar.DAY_OF_MONTH));
        Assert.assertEquals(2021, cal.get(Calendar.YEAR));
        Assert.assertEquals(Calendar.WEDNESDAY, cal.get(Calendar.DAY_OF_WEEK));
    }

    @Test
    public void parse_givenAmPmStrategies_shouldParseMorningAndAfternoon() throws ParseException {
        FastDateParser parser = new FastDateParser("h:mm a", GMT, Locale.ENGLISH);

        Date morning = parser.parse("10:15 AM");
        Calendar calMorning = Calendar.getInstance(GMT, Locale.ENGLISH);
        calMorning.setTime(morning);
        Assert.assertEquals(Calendar.AM, calMorning.get(Calendar.AM_PM));
        Assert.assertEquals(10, calMorning.get(Calendar.HOUR));

        Date evening = parser.parse("10:15 PM");
        Calendar calEvening = Calendar.getInstance(GMT, Locale.ENGLISH);
        calEvening.setTime(evening);
        Assert.assertEquals(Calendar.PM, calEvening.get(Calendar.AM_PM));
        Assert.assertEquals(10, calEvening.get(Calendar.HOUR));
    }

    @Test
    public void parse_givenHourOfDays_shouldHandleModuloProperly() throws ParseException {
        FastDateParser parserH = new FastDateParser("H:mm", GMT, US);
        Date dateH = parserH.parse("24:00");
        Calendar calH = Calendar.getInstance(GMT, US);
        calH.setTime(dateH);
        Assert.assertEquals(0, calH.get(Calendar.HOUR_OF_DAY));

        FastDateParser parserK = new FastDateParser("k:mm", GMT, US);
        Date dateK = parserK.parse("24:00");
        Calendar calK = Calendar.getInstance(GMT, US);
        calK.setTime(dateK);
        Assert.assertEquals(24, calK.get(Calendar.HOUR_OF_DAY));

        FastDateParser parserSmallH = new FastDateParser("h:mm a", GMT, US);
        Date dateSmallH = parserSmallH.parse("12:00 AM");
        Calendar calSmallH = Calendar.getInstance(GMT, US);
        calSmallH.setTime(dateSmallH);
        Assert.assertEquals(0, calSmallH.get(Calendar.HOUR));

        FastDateParser parserBigK = new FastDateParser("K:mm a", GMT, US);
        Date dateBigK = parserBigK.parse("11:00 AM");
        Calendar calBigK = Calendar.getInstance(GMT, US);
        calBigK.setTime(dateBigK);
        Assert.assertEquals(11, calBigK.get(Calendar.HOUR));
    }

    @Test
    public void parse_givenVariousCalendarNumberFields_shouldSetCalendarCorrectly() throws ParseException {
        FastDateParser parser = new FastDateParser("D F w W", GMT, US);
        Date date = parser.parse("150 2 22 4");
        Calendar cal = Calendar.getInstance(GMT, US);
        cal.setTime(date);

        Assert.assertEquals(150, cal.get(Calendar.DAY_OF_YEAR));
        Assert.assertEquals(2, cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        Assert.assertEquals(22, cal.get(Calendar.WEEK_OF_YEAR));