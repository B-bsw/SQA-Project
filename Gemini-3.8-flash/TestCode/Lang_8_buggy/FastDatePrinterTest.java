package org.apache.commons.lang3.time;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.FieldPosition;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

public class FastDatePrinterTest {

    private static final TimeZone GMT = TimeZone.getTimeZone("GMT");
    private static final TimeZone NEW_YORK = TimeZone.getTimeZone("America/New_York");
    private static final Locale US = Locale.US;

    private FastDatePrinter getInstance(String pattern) {
        return new FastDatePrinter(pattern, GMT, US);
    }

    private FastDatePrinter getInstance(String pattern, TimeZone timeZone, Locale locale) {
        return new FastDatePrinter(pattern, timeZone, locale);
    }

    private Calendar createCalendar(int year, int month, int day, int hourOfDay, int minute, int second, int millis, TimeZone tz, Locale loc) {
        Calendar cal = new GregorianCalendar(tz, loc);
        cal.clear();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DAY_OF_MONTH, day);
        cal.set(Calendar.HOUR_OF_DAY, hourOfDay);
        cal.set(Calendar.MINUTE, minute);
        cal.set(Calendar.SECOND, second);
        cal.set(Calendar.MILLISECOND, millis);
        return cal;
    }

    @Test
    public void testConstants() {
        Assert.assertEquals(java.text.DateFormat.FULL, FastDatePrinter.FULL);
        Assert.assertEquals(java.text.DateFormat.LONG, FastDatePrinter.LONG);
        Assert.assertEquals(java.text.DateFormat.MEDIUM, FastDatePrinter.MEDIUM);
        Assert.assertEquals(java.text.DateFormat.SHORT, FastDatePrinter.SHORT);
    }

    @Test
    public void format_givenDate_shouldFormatCorrectly() {
        FastDatePrinter printer = getInstance("yyyy-MM-dd HH:mm:ss.SSS");
        Calendar cal = createCalendar(2023, Calendar.JANUARY, 15, 10, 30, 45, 123, GMT, US);
        Date date = cal.getTime();

        String result = printer.format(date);
        Assert.assertEquals("2023-01-15 10:30:45.123", result);

        StringBuffer sb = new StringBuffer("Prefix: ");
        StringBuffer returnedSb = printer.format(date, sb);
        Assert.assertSame(sb, returnedSb);
        Assert.assertEquals("Prefix: 2023-01-15 10:30:45.123", returnedSb.toString());
    }

    @Test
    public void format_givenCalendar_shouldFormatCorrectly() {
        FastDatePrinter printer = getInstance("yyyy-MM-dd HH:mm:ss");
        Calendar cal = createCalendar(2023, Calendar.OCTOBER, 5, 8, 9, 7, 0, GMT, US);

        String result = printer.format(cal);
        Assert.assertEquals("2023-10-05 08:09:07", result);

        StringBuffer sb = new StringBuffer();
        StringBuffer returnedSb = printer.format(cal, sb);
        Assert.assertSame(sb, returnedSb);
        Assert.assertEquals("2023-10-05 08:09:07", sb.toString());
    }

    @Test
    public void format_givenMillis_shouldFormatCorrectly() {
        FastDatePrinter printer = getInstance("yyyy-MM-dd");
        Calendar cal = createCalendar(2023, Calendar.MARCH, 10, 0, 0, 0, 0, GMT, US);
        long millis = cal.getTimeInMillis();

        String result = printer.format(millis);
        Assert.assertEquals("2023-03-10", result);

        StringBuffer sb = new StringBuffer();
        StringBuffer returnedSb = printer.format(millis, sb);
        Assert.assertSame(sb, returnedSb);
        Assert.assertEquals("2023-03-10", sb.toString());
    }

    @Test
    public void format_givenObjectOverload_shouldHandleAllTypes() {
        FastDatePrinter printer = getInstance("yyyy-MM-dd");
        Calendar cal = createCalendar(2023, Calendar.APRIL, 1, 0, 0, 0, 0, GMT, US);
        Date date = cal.getTime();
        Long millis = Long.valueOf(cal.getTimeInMillis());
        FieldPosition pos = new FieldPosition(0);

        StringBuffer sb1 = printer.format((Object) date, new StringBuffer(), pos);
        Assert.assertEquals("2023-04-01", sb1.toString());

        StringBuffer sb2 = printer.format((Object) cal, new StringBuffer(), pos);
        Assert.assertEquals("2023-04-01", sb2.toString());

        StringBuffer sb3 = printer.format((Object) millis, new StringBuffer(), pos);
        Assert.assertEquals("2023-04-01", sb3.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void format_givenUnknownObjectType_shouldThrowException() {
        FastDatePrinter printer = getInstance("yyyy-MM-dd");
        printer.format("2023-01-01", new StringBuffer(), new FieldPosition(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void format_givenNullObject_shouldThrowException() {
        FastDatePrinter printer = getInstance("yyyy-MM-dd");
        printer.format((Object) null, new StringBuffer(), new FieldPosition(0));
    }

    @Test
    public void parsePattern_givenEraPattern_shouldFormatEra() {
        FastDatePrinter printer = getInstance("G");
        Calendar cal = createCalendar(2023, Calendar.JANUARY, 1, 0, 0, 0, 0, GMT, US);
        Assert.assertEquals("AD", printer.format(cal));
    }

    @Test
    public void parsePattern_givenYearPatterns_shouldHandleVariousLengths() {
        Calendar cal = createCalendar(2023, Calendar.JANUARY, 1, 0, 0, 0, 0, GMT, US);

        FastDatePrinter y2 = getInstance("yy");
        Assert.assertEquals("23", y2.format(cal));

        FastDatePrinter y1 = getInstance("y");
        Assert.assertEquals("2023", y1.format(cal));

        FastDatePrinter y3 = getInstance("yyy");
        Assert.assertEquals("2023", y3.format(cal));

        FastDatePrinter y4 = getInstance("yyyy");
        Assert.assertEquals("2023", y4.format(cal));

        FastDatePrinter y5 = getInstance("yyyyy");
        Assert.assertEquals("02023", y5.format(cal));
    }

    @Test
    public void parsePattern_givenMonthPatterns_shouldHandleVariousLengths() {
        Calendar cal = createCalendar(2023, Calendar.SEPTEMBER, 5, 0, 0, 0, 0, GMT, US);

        FastDatePrinter m1 = getInstance("M");
        Assert.assertEquals("9", m1.format(cal));

        FastDatePrinter m2 = getInstance("MM");
        Assert.assertEquals("09", m2.format(cal));

        FastDatePrinter m3 = getInstance("MMM");
        Assert.assertEquals("Sep", m3.format(cal));

        FastDatePrinter m4 = getInstance("MMMM");
        Assert.assertEquals("September", m4.format(cal));

        Calendar calOct = createCalendar(2023, Calendar.OCTOBER, 5, 0, 0, 0, 0, GMT, US);
        Assert.assertEquals("10", m1.format(calOct));
        Assert.assertEquals("10", m2.format(calOct));
        Assert.assertEquals("Oct", m3.format(calOct));
        Assert.assertEquals("October", m4.format(calOct));
    }

    @Test
    public void parsePattern_givenDayOfMonthPatterns_shouldHandleVariousLengths() {
        Calendar cal = createCalendar(2023, Calendar.JANUARY, 5, 0, 0, 0, 0, GMT, US);

        FastDatePrinter d1 = getInstance("d");
        Assert.assertEquals("5", d1.format(cal));

        FastDatePrinter d2 = getInstance("dd");
        Assert.assertEquals("05", d2.format(cal));

        FastDatePrinter d3 = getInstance("ddd");
        Assert.assertEquals("005", d3.format(cal));

        Calendar cal15 = createCalendar(2023, Calendar.JANUARY, 15, 0, 0, 0, 0, GMT, US);
        Assert.assertEquals("15", d1.format(cal15));
        Assert.assertEquals("15", d2.format(cal15));
        Assert.assertEquals("015", d3.format(cal15));
    }

    @Test
    public void parsePattern_givenTwelveHourField_shouldFormatTwelveHourClock() {
        FastDatePrinter h1 = getInstance("h");
        FastDatePrinter h2 = getInstance("hh");

        Calendar calMidnight = createCalendar(2023, Calendar.JANUARY, 1, 0, 0, 0, 0, GMT, US);
        Assert.assertEquals("12", h1.format(calMidnight));
        Assert.assertEquals("12", h2.format(calMidnight));

        Calendar calNoon = createCalendar(2023, Calendar.JANUARY, 1, 12, 0, 0, 0, GMT, US);
        Assert.assertEquals("12", h1.format(calNoon));
        Assert.assertEquals("12", h2.format(calNoon));

        Calendar cal3Am = createCalendar(2023, Calendar.JANUARY, 1, 3, 0, 0, 0, GMT, US);
        Assert.assertEquals("3", h1.format(cal3Am));
        Assert.assertEquals("03", h2.format(cal3Am));

        Calendar cal3Pm = createCalendar(2023, Calendar.JANUARY, 1, 15, 0, 0, 0, GMT, US);
        Assert.assertEquals("3", h1.format(cal3Pm));
        Assert.assertEquals("03", h2.format(cal3Pm));
    }

    @Test
    public void parsePattern_givenTwentyFourHourField_shouldFormat24HourClockKk() {
        FastDatePrinter k1 = getInstance("k");
        FastDatePrinter k2 = getInstance("kk");

        Calendar calMidnight = createCalendar(2023, Calendar.JANUARY, 1, 0, 0, 0, 0, GMT, US);
        Assert.assertEquals("24", k1.format(calMidnight));
        Assert.assertEquals("24", k2.format(calMidnight));

        Calendar cal1Am = createCalendar(2023, Calendar.JANUARY, 1, 1, 0, 0, 0, GMT, US);
        Assert.assertEquals("1", k1.format(cal1Am));
        Assert.assertEquals("01", k2.format(cal1Am));

        Calendar cal23 = createCalendar(2023, Calendar.JANUARY, 1, 23, 0, 0, 0, GMT, US);
        Assert.assertEquals("23", k1.format(cal23));
        Assert.assertEquals("23", k2.format(cal23));

        FastDatePrinter K1 = getInstance("K");
        FastDatePrinter K2 = getInstance("KK");
        Assert.assertEquals("0", K1.format(calMidnight));
        Assert.assertEquals("00", K2.format(calMidnight));
        Assert.assertEquals("0", K1.format(calNoonHour(calMidnight)));
        Assert.assertEquals("00", K2.format(calNoonHour(calMidnight)));
    }

    private Calendar calNoonHour(Calendar base) {
        Calendar cal = (Calendar) base.clone();
        cal.set(Calendar.HOUR_OF_DAY, 12);
        return cal;
    }

    @Test
    public void parsePattern_givenHourOfDayAndMinuteAndSecond_shouldFormatProperly() {
        FastDatePrinter printer = getInstance("H HH m mm s ss");
        Calendar cal = createCalendar(2023, Calendar.JANUARY, 1, 5, 8, 9, 0, GMT, US);
        Assert.assertEquals("5 05 8 08 9 09", printer.format(cal));

        Calendar cal2 = createCalendar(2023, Calendar.JANUARY, 1, 15, 25, 35, 0, GMT, US);
        Assert.assertEquals("15 15 25 25 35 35", printer.format(cal2));
    }

    @Test
    public void parsePattern_givenMillisecondPatterns_shouldFormatProperly() {
        FastDatePrinter s1 = getInstance("S");
        FastDatePrinter s2 = getInstance("SS");
        FastDatePrinter s3 = getInstance("SSS");
        FastDatePrinter s4 = getInstance("SSSS");

        Calendar cal5 = createCalendar(2023, Calendar.JANUARY, 1, 0, 0, 0, 5, GMT, US);
        Assert.assertEquals("5", s1.format(cal5));
        Assert.assertEquals("05", s2.format(cal5));
        Assert.assertEquals("005", s3.format(cal5));
        Assert.assertEquals("0005", s4.format(cal5));

        Calendar cal50 = createCalendar(2023, Calendar.JANUARY, 1, 0, 0, 0, 50, GMT, US);
        Assert.assertEquals("50", s1.format(cal50));
        Assert.assertEquals("50", s2.format(cal50));
        Assert.assertEquals("050", s3.format(cal50));
        Assert.assertEquals("0050", s4.format(cal50));

        Calendar cal500 = createCalendar(2023, Calendar.JANUARY, 1, 0, 0, 0, 500, GMT, US);
        Assert.assertEquals("500", s1.format(cal500));
        Assert.assertEquals("500", s2.format(cal500));
        Assert.assertEquals("500", s3.format(cal500));
        Assert.assertEquals("0500", s4.format(cal500));
    }

    @Test
    public void parsePattern_givenDayOfWeekPatterns_shouldFormatProperly() {
        FastDatePrinter shortDow = getInstance("E");
        FastDatePrinter fullDow = getInstance("EEEE");

        Calendar sunday = createCalendar(2023, Calendar.JANUARY, 1, 0, 0, 0, 0, GMT, US);
        Assert.assertEquals("Sun", shortDow.format(sunday));
        Assert.assertEquals("Sunday", fullDow.format(sunday));
    }

    @Test
    public void parsePattern_givenDayOfYearAndWeekPatterns_shouldFormatProperly() {
        FastDatePrinter printer = getInstance("D DD DDD F FF w ww W WW");
        Calendar cal = createCalendar(2023, Calendar.FEBRUARY, 1, 0, 0, 0, 0, GMT, US);
        String formatted = printer.format(cal);
        Assert.assertTrue(formatted.length() > 0);
    }

    @Test
    public void parsePattern_givenAmPmPattern_shouldFormatAmPm() {
        FastDatePrinter printer = getInstance("a");
        Calendar amCal = createCalendar(2023, Calendar.JANUARY, 1, 9, 0, 0, 0, GMT, US);
        Calendar pmCal = createCalendar(2023, Calendar.JANUARY, 1, 21, 0, 0, 0, GMT, US);

        Assert.assertEquals("AM", printer.format(amCal));
        Assert.assertEquals("PM", printer.format(pmCal));
    }

    @Test
    public void parsePattern_givenTimeZoneNamePatterns_shouldHandleShortAndLong() {
        FastDatePrinter shortTz = getInstance("z", NEW_YORK, US);
        FastDatePrinter longTz = getInstance("zzzz", NEW_YORK, US);

        Calendar standardCal = createCalendar(2023, Calendar.JANUARY, 1, 12, 0, 0, 0, NEW_YORK, US);
        Assert.assertEquals("EST", shortTz.format(standardCal));
        Assert.assertEquals("Eastern Standard Time", longTz.format(standardCal));

        Calendar daylightCal = createCalendar(2023, Calendar.JULY, 1, 12, 0, 0, 0, NEW_YORK, US);
        Assert.assertEquals("EDT", shortTz.format(daylightCal));
        Assert.assertEquals("Eastern Daylight Time", longTz.format(daylightCal));

        TimeZone nonDstTz = TimeZone.getTimeZone("GMT");
        FastDatePrinter nonDstPrinter = getInstance("z", nonDstTz, US);
        Assert.assertEquals("GMT", nonDstPrinter.format(standardCal));
    }

    @Test
    public void parsePattern_givenTimeZoneNumberPatterns_shouldHandleColonAndNonColon() {
        TimeZone tzMinus5 = new SimpleTimeZone(-5 * 60 * 60 * 1000, "GMT-5");
        FastDatePrinter noColon = getInstance("Z", tzMinus5, US);
        FastDatePrinter colon = getInstance("ZZ", tzMinus5, US);

        Calendar cal = createCalendar(2023, Calendar.JANUARY, 1, 0, 0, 0, 0, tzMinus5, US);
        Assert.assertEquals("-0500", noColon.format(cal));
        Assert.assertEquals("-05:00", colon.format(cal));

        TimeZone tzPlus530 = new SimpleTimeZone(5 * 60 * 60 * 1000 + 30 * 60 * 1000, "GMT+5:30");
        FastDatePrinter noColonPlus = getInstance("Z", tzPlus530, US);
        FastDatePrinter colonPlus = getInstance("ZZ", tzPlus530, US);
        Calendar calPlus = createCalendar(2023, Calendar.JANUARY, 1, 0, 0, 0, 0, tzPlus530, US);
        Assert.assertEquals("+0530", noColonPlus.format(calPlus));
        Assert.assertEquals("+05:30", colonPlus.format(calPlus));
    }

    @Test
    public void parsePattern_givenLiteralPatterns_shouldHandleSingleAndStringLiterals() {
        FastDatePrinter singleChar = getInstance("'T'");
        FastDatePrinter stringLit = getInstance("'Hello World'");
        FastDatePrinter escapedQuote = getInstance("''");
        FastDatePrinter mixedQuote = getInstance("'It''s 'HH''mm");

        Calendar cal = createCalendar(2023, Calendar.JANUARY, 1, 14, 25, 0, 0, GMT, US);

        Assert.assertEquals("T", singleChar.format(cal));
        Assert.assertEquals("Hello World", stringLit.format(cal));
        Assert.assertEquals("'", escapedQuote.format(cal));
        Assert.assertEquals("It's 14'25", mixedQuote.format(cal));
    }

    @Test
    public void parsePattern_givenUnquotedNonLetterCharacters_shouldOutputDirectly() {
        FastDatePrinter printer = getInstance("yyyy-MM-dd / : #");
        Calendar cal = createCalendar(2023, Calendar.JANUARY, 1, 0, 0, 0, 0, GMT, US);
        Assert.assertEquals("2023-01-01 / : #", printer.format(cal));
    }

    @Test(expected = IllegalArgumentException.class)
    public void parsePattern_givenIllegalToken_shouldThrowException() {
        getInstance("yyyy-MM-dd X");
    }

    @Test
    public void parsePattern_givenEmptyPattern_shouldReturnEmptyString() {
        FastDatePrinter printer = getInstance("");
        Calendar cal = createCalendar(2023, Calendar.JANUARY, 1, 0, 0, 0, 0, GMT, US);
        Assert.assertEquals("", printer.format(cal));
        Assert.assertEquals(0, printer.getMaxLengthEstimate());
    }

    @Test
    public void testGetters() {
        FastDatePrinter printer = getInstance("yyyy-MM-dd", NEW_YORK, Locale.GERMANY);
        Assert.assertEquals("yyyy-MM-dd", printer.getPattern());
        Assert.assertEquals(NEW_YORK, printer.getTimeZone());
        Assert.assertEquals(Locale.GERMANY, printer.getLocale());
        Assert.assertTrue(printer.getMaxLengthEstimate() > 0);
    }

    @Test
    public void testEqualsAndHashCode() {
        FastDatePrinter p1 = getInstance("yyyy-MM-dd", GMT, US);
        FastDatePrinter p2 = getInstance("yyyy-MM-dd", GMT, US);
        FastDatePrinter p3 = getInstance("yyyy/MM/dd", GMT, US);
        FastDatePrinter p4 = getInstance("yyyy-MM-dd", NEW_YORK, US);
        FastDatePrinter p5 = getInstance("yyyy-MM-dd", GMT, Locale.FRANCE);

        Assert.assertEquals(p1, p1);
        Assert.assertEquals(p1, p2);
        Assert.assertEquals(p1.hashCode(), p2.hashCode());

        Assert.assertFalse(p1.equals(null));
        Assert.assertFalse(p1.equals("Not AFastDatePrinter"));
        Assert.assertFalse(p1.equals(p3));
        Assert.assertFalse(p1.equals(p4));
        Assert.assertFalse(p1.equals(p5));
    }

    @Test
    public void testToString() {
        FastDatePrinter printer = getInstance("yyyy-MM-dd", GMT, US);
        String str = printer.toString();
        Assert.assertTrue(str.startsWith("FastDatePrinter["));
        Assert.assertTrue(str.contains("yyyy-MM-dd"));
        Assert.assertTrue(str.contains("en_US") || str.contains("en"));
        Assert.assertTrue(str.contains("GMT"));
    }

    @Test
    public void testSerialization() throws Exception {
        FastDatePrinter printer = getInstance("yyyy-MM-dd HH:mm:ss.SSS", GMT, US);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(printer);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        FastDatePrinter deserialized = (FastDatePrinter) ois.readObject();
        ois.close();

        Assert.assertEquals(printer, deserialized);
        Calendar cal = createCalendar(2023, Calendar.JANUARY, 1, 10, 20, 30, 456, GMT, US);
        Assert.assertEquals(printer.format(cal), deserialized.format(cal));
    }

    @Test
    public void getTimeZoneDisplay_givenCacheScenarios_shouldReturnCorrectName() {
        String name1 = FastDatePrinter.getTimeZoneDisplay(GMT, false, TimeZone.SHORT, US);
        String name2 = FastDatePrinter.getTimeZoneDisplay(GMT, false, TimeZone.SHORT, US);
        Assert.assertEquals("GMT", name1);
        Assert.assertEquals(name1, name2);

        String nameNyLong = FastDatePrinter.getTimeZoneDisplay(NEW_YORK, true, TimeZone.LONG, US);
        Assert.assertEquals("Eastern Daylight Time", nameNyLong);
    }

    @Test
    public void paddedNumberField_givenValuesExceedingThresholds_shouldFormatProperly() {
        FastDatePrinter printer = getInstance("DDDD");
        Calendar cal99 = createCalendar(2023, Calendar.JANUARY, 1, 0, 0, 0, 0, GMT, US);
        cal99.set(Calendar.DAY_OF_YEAR, 99);
        Assert.assertEquals("0099", printer.format(cal99));

        Calendar cal100 = createCalendar(2023, Calendar.JANUARY, 1, 0, 0, 0, 0, GMT, US);
        cal100.set(Calendar.DAY_OF_YEAR, 100);
        Assert.assertEquals("0100", printer.format(cal100));

        Calendar cal365 = createCalendar(2023, Calendar.JANUARY, 1, 0, 0, 0, 0, GMT, US);
        cal365.set(Calendar.DAY_OF_YEAR, 365);
        Assert.assertEquals("0365", printer.format(cal365));

        FastDatePrinter printer5 = getInstance("DDDDD");
        Calendar cal1000 = createCalendar(2023, Calendar.JANUARY, 1, 0, 0, 0, 0, GMT, US);
        cal1000.set(Calendar.DAY_OF_YEAR, 1000);
        Assert.assertEquals("01000", printer5.format(cal1000));
    }

    @Test
    public void selectNumberRule_givenDifferentPaddings_shouldSelectCorrectRule() {
        FastDatePrinter printer = getInstance("d dd ddd");
        Calendar cal = createCalendar(2023, Calendar.JANUARY, 8, 0, 0, 0, 0, GMT, US);
        Assert.assertEquals("8 08 008", printer.format(cal));
    }

    @Test
    public void twoDigitNumberField_givenValueGreaterThanHundred_shouldAppendFullNumber() {
        FastDatePrinter printer = getInstance("yy");
        Calendar cal = createCalendar(2105, Calendar.JANUARY, 1, 0, 0, 0, 0, GMT, US);
        Assert.assertEquals("05", printer.format(cal));
    }
}