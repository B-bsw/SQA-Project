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
    public void constructor_givenValidParameters_shouldInitializeCorrectly() {
        // Arrange & Act
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", GMT, US);

        // Assert
        Assert.assertEquals("yyyy-MM-dd", parser.getPattern());
        Assert.assertEquals(GMT, parser.getTimeZone());
        Assert.assertEquals(US, parser.getLocale());
        Assert.assertNotNull(parser.getParsePattern());
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenEmptyPattern_shouldThrowException() {
        // Arrange, Act & Assert
        new FastDateParser("", GMT, US);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenInvalidCharacterPattern_shouldThrowException() {
        // Arrange, Act & Assert
        new FastDateParser("?invalid?", GMT, US);
    }

    @Test
    public void equalsAndHashCode_givenVariousInstances_shouldFollowContract() {
        // Arrange
        FastDateParser parser1 = new FastDateParser("yyyy-MM-dd", GMT, US);
        FastDateParser parser2 = new FastDateParser("yyyy-MM-dd", GMT, US);
        FastDateParser parserDiffPattern = new FastDateParser("yyyy/MM/dd", GMT, US);
        FastDateParser parserDiffTz = new FastDateParser("yyyy-MM-dd", EST, US);
        FastDateParser parserDiffLocale = new FastDateParser("yyyy-MM-dd", GMT, Locale.GERMANY);

        // Act & Assert
        Assert.assertTrue(parser1.equals(parser1));
        Assert.assertTrue(parser1.equals(parser2));
        Assert.assertEquals(parser1.hashCode(), parser2.hashCode());

        Assert.assertFalse(parser1.equals(null));
        Assert.assertFalse(parser1.equals("Not a FastDateParser"));
        Assert.assertFalse(parser1.equals(parserDiffPattern));
        Assert.assertFalse(parser1.equals(parserDiffTz));
        Assert.assertFalse(parser1.equals(parserDiffLocale));
    }

    @Test
    public void toString_givenValidParser_shouldReturnDescriptiveString() {
        // Arrange
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", GMT, US);

        // Act
        String str = parser.toString();

        // Assert
        Assert.assertEquals("FastDateParser[yyyy-MM-dd,en_US,GMT]", str);
    }

    @Test
    public void serialization_givenSerializedInstance_shouldDeserializeAndMatch() throws Exception {
        // Arrange
        FastDateParser original = new FastDateParser("yyyy-MM-dd HH:mm:ss", GMT, US);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);

        // Act
        oos.writeObject(original);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        FastDateParser deserialized = (FastDateParser) ois.readObject();
        ois.close();

        Date parsedOrig = original.parse("2023-10-15 12:30:45");
        Date parsedDeser = deserialized.parse("2023-10-15 12:30:45");

        // Assert
        Assert.assertEquals(original, deserialized);
        Assert.assertEquals(parsedOrig, parsedDeser);
    }

    @Test
    public void parse_givenNumericDateComponents_shouldParseCorrectly() throws ParseException {
        // Arrange: yyyy, MM, dd, HH, mm, ss, SSS
        FastDateParser parser = new FastDateParser("yyyy-MM-dd HH:mm:ss.SSS", GMT, US);

        // Act
        Date date = parser.parse("2023-11-25 14:20:30.123");

        // Assert
        Calendar cal = Calendar.getInstance(GMT, US);
        cal.setTime(date);
        Assert.assertEquals(2023, cal.get(Calendar.YEAR));
        Assert.assertEquals(Calendar.NOVEMBER, cal.get(Calendar.MONTH));
        Assert.assertEquals(25, cal.get(Calendar.DAY_OF_MONTH));
        Assert.assertEquals(14, cal.get(Calendar.HOUR_OF_DAY));
        Assert.assertEquals(20, cal.get(Calendar.MINUTE));
        Assert.assertEquals(30, cal.get(Calendar.SECOND));
        Assert.assertEquals(123, cal.get(Calendar.MILLISECOND));
    }

    @Test
    public void parse_givenAdjacentNumbers_shouldParseFieldWidthsCorrectly() throws ParseException {
        // Arrange: Adjacent numeric patterns trigger isNextNumber()
        FastDateParser parser = new FastDateParser("yyyyMMddHHmmss", GMT, US);

        // Act
        Date date = parser.parse("20231125142030");

        // Assert
        Calendar cal = Calendar.getInstance(GMT, US);
        cal.setTime(date);
        Assert.assertEquals(2023, cal.get(Calendar.YEAR));
        Assert.assertEquals(Calendar.NOVEMBER, cal.get(Calendar.MONTH));
        Assert.assertEquals(25, cal.get(Calendar.DAY_OF_MONTH));
        Assert.assertEquals(14, cal.get(Calendar.HOUR_OF_DAY));
        Assert.assertEquals(20, cal.get(Calendar.MINUTE));
        Assert.assertEquals(30, cal.get(Calendar.SECOND));
    }

    @Test
    public void parse_givenTwoDigitYear_shouldAdjustToCentury() throws ParseException {
        // Arrange
        FastDateParser parser = new FastDateParser("yy-MM-dd", GMT, US);
        Calendar currentCal = Calendar.getInstance(GMT, US);
        int currentYear = currentCal.get(Calendar.YEAR);
        int currentCentury = currentYear - (currentYear % 100);

        // Act
        Date dateNear = parser.parse("23-01-01");
        Calendar calNear = Calendar.getInstance(GMT, US);
        calNear.setTime(dateNear);

        // Assert
        int expectedYear = parser.adjustYear(23);
        Assert.assertEquals(expectedYear, calNear.get(Calendar.YEAR));
    }

    @Test
    public void adjustYear_givenBoundaryValues_shouldCalculateExpectedYear() {
        // Arrange
        FastDateParser parser = new FastDateParser("yy", GMT, US);
        int thisYear = Calendar.getInstance(GMT, US).get(Calendar.YEAR);
        int century = thisYear - (thisYear % 100);

        // Act & Assert
        int trialPast = (thisYear + 25) % 100;
        int adjustedPast = parser.adjustYear(trialPast);
        Assert.assertTrue(adjustedPast < thisYear + 20);

        int trialFuture = (thisYear + 10) % 100;
        int adjustedFuture = parser.adjustYear(trialFuture);
        Assert.assertEquals(century + trialFuture, adjustedFuture);
    }

    @Test
    public void parse_givenAllTimeStrategies_shouldParseExpectedFields() throws ParseException {
        // Arrange:
        // K: hour (0-11)
        // h: modulo hour (1-12)
        // k: hour of day (1-24)
        // H: modulo hour of day (0-23)
        // a: am/pm
        FastDateParser parser = new FastDateParser("K h k H a", GMT, US);

        // Act
        Date date = parser.parse("11 12 24 0 PM");

        // Assert
        Calendar cal = Calendar.getInstance(GMT, US);
        cal.setTime(date);
        Assert.assertEquals(Calendar.PM, cal.get(Calendar.AM_PM));
        Assert.assertEquals(0, cal.get(Calendar.HOUR));
    }

    @Test
    public void parse_givenCalendarWeekAndDayStrategies_shouldParse() throws ParseException {
        // Arrange:
        // D: day of year
        // w: week of year
        // W: week of month
        // F: day of week in month
        FastDateParser parser = new FastDateParser("yyyy D w W F", GMT, US);

        // Act
        Date date = parser.parse("2023 100 15 2 2");

        // Assert
        Assert.assertNotNull(date);
    }

    @Test
    public void parse_givenTextErasAndTextMonthsAndDaysOfWeek_shouldParse() throws ParseException {
        // Arrange:
        // G: Era (AD / BC)
        // MMMM: Long month
        // EEEE: Long day of week
        FastDateParser parser = new FastDateParser("G yyyy MMMM EEEE", GMT, US);

        // Act
        Date date = parser.parse("AD 2023 July Monday");

        // Assert
        Calendar cal = Calendar.getInstance(GMT, US);
        cal.setTime(date);
        Assert.assertEquals(Calendar.AD, cal.get(Calendar.ERA));
        Assert.assertEquals(2023, cal.get(Calendar.YEAR));
        Assert.assertEquals(Calendar.JULY, cal.get(Calendar.MONTH));
        Assert.assertEquals(Calendar.MONDAY, cal.get(Calendar.DAY_OF_WEEK));
    }

    @Test
    public void parse_givenShortMonthAndShortDayOfWeek_shouldParse() throws ParseException {
        // Arrange
        FastDateParser parser = new FastDateParser("MMM d, EEE", GMT, US);

        // Act
        Date date = parser.parse("Dec 1, Fri");

        // Assert
        Calendar cal = Calendar.getInstance(GMT, US);
        cal.setTime(date);
        Assert.assertEquals(Calendar.DECEMBER, cal.get(Calendar.MONTH));
        Assert.assertEquals(1, cal.get(Calendar.DAY_OF_MONTH));
        Assert.assertEquals(Calendar.FRIDAY, cal.get(Calendar.DAY_OF_WEEK));
    }

    @Test
    public void parse_givenTimeZonesZAndz_shouldParseOffsetsAndNames() throws ParseException {
        // Arrange: RFC 822 / ISO 8601 offset
        FastDateParser parserZ = new FastDateParser("yyyy-MM-dd Z", GMT, US);

        // Act: +0200
        Date datePlus = parserZ.parse("2023-01-01 +0200");
        Date dateMinus = parserZ.parse("2023-01-01 -05:00");
        Date dateGmt = parserZ.parse("2023-01-01 GMT+03:00");

        // Assert
        Assert.assertNotNull(datePlus);
        Assert.assertNotNull(dateMinus);
        Assert.assertNotNull(dateGmt);

        // Act: Timezone name
        FastDateParser parserNamed = new FastDateParser("yyyy-MM-dd z", GMT, US);
        Date dateUtc = parserNamed.parse("2023-01-01 UTC");
        Date datePst = parserNamed.parse("2023-01-01 PST");

        // Assert
        Assert.assertNotNull(dateUtc);
        Assert.assertNotNull(datePst);
    }

    @Test
    public void parse_givenQuotedAndEscapedLiterals_shouldParse() throws ParseException {
        // Arrange: Quoted literal, escaped quotes, special regex meta characters
        FastDateParser parser = new FastDateParser("yyyy'T'MM'/'dd ''special'' [?.+*^$(){}\\]", GMT, US);

        // Act
        Date date = parser.parse("2023T10/15 'special' [?.+*^$(){}\\]");

        // Assert
        Calendar cal = Calendar.getInstance(GMT, US);
        cal.setTime(date);
        Assert.assertEquals(2023, cal.get(Calendar.YEAR));
        Assert.assertEquals(Calendar.OCTOBER, cal.get(Calendar.MONTH));
        Assert.assertEquals(15, cal.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void parse_givenConsecutiveWhitespaceInPattern_shouldMatchVariableWhitespace() throws ParseException {
        // Arrange
        FastDateParser parser = new FastDateParser("yyyy   MM   dd", GMT, US);

        // Act
        Date date = parser.parse("2023  10 15");

        // Assert
        Calendar cal = Calendar.getInstance(GMT, US);
        cal.setTime(date);
        Assert.assertEquals(2023, cal.get(Calendar.YEAR));
        Assert.assertEquals(Calendar.OCTOBER, cal.get(Calendar.MONTH));
        Assert.assertEquals(15, cal.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void parse_givenParsePosition_shouldAdvanceIndexCorrectly() {
        // Arrange
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", GMT, US);
        ParsePosition pos = new ParsePosition(5);
        String text = "Date:2023-10-15-End";

        // Act
        Date date = parser.parse(text, pos);

        // Assert
        Assert.assertNotNull(date);
        Assert.assertEquals(15, pos.getIndex());
    }

    @Test
    public void parse_givenMismatchedPrefix_shouldReturnNullAndNotAdvanceIndex() {
        // Arrange
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", GMT, US);
        ParsePosition pos = new ParsePosition(0);

        // Act
        Date date = parser.parse("NotADate", pos);

        // Assert
        Assert.assertNull(date);
        Assert.assertEquals(0, pos.getIndex());
    }

    @Test
    public void parseObject_givenValidAndInvalidInputs_shouldMatchParseBehavior() throws ParseException {
        // Arrange
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", GMT, US);

        // Act
        Object obj1 = parser.parseObject("2023-10-15");
        ParsePosition pos = new ParsePosition(0);
        Object obj2 = parser.parseObject("2023-10-15", pos);

        // Assert
        Assert.assertTrue(obj1 instanceof Date);
        Assert.assertTrue(obj2 instanceof Date);
        Assert.assertEquals(obj1, obj2);
    }

    @Test
    public void parse_givenUnparseableDateStandardLocale_shouldThrowParseException() {
        // Arrange
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", GMT, US);

        // Act & Assert
        try {
            parser.parse("invalid-date");
            Assert.fail("Expected ParseException was not thrown");
        } catch (ParseException ex) {
            Assert.assertEquals(0, ex.getErrorOffset());
            Assert.assertTrue(ex.getMessage().contains("Unparseable date: \"invalid-date\""));
        }
    }

    @Test
    public void parse_givenJapaneseImperialLocaleMismatch_shouldThrowParseExceptionWithEraNote() {
        // Arrange
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", GMT, FastDateParser.JAPANESE_IMPERIAL);

        // Act & Assert
        try {
            parser.parse("invalid-date");
            Assert.fail("Expected ParseException was not thrown");
        } catch (ParseException ex) {
            Assert.assertTrue(ex.getMessage().contains("does not support dates before 1868 AD"));
        }
    }

    @Test
    public void getDisplayNames_givenInvalidField_shouldThrowIllegalArgumentException() {
        // Arrange
        FastDateParser parser = new FastDateParser("yyyy", GMT, US);

        // Act & Assert
        try {
            parser.getDisplayNames(Calendar.MILLISECOND);
            Assert.fail("Expected IllegalArgumentException for invalid field");
        } catch (IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().contains("Invalid field value"));
        }
    }

    @Test
    public void parse_givenQuotedSingleQuoteAtEnd_shouldHandleSafely() throws ParseException {
        // Arrange: Quoted block ending with apostrophe
        FastDateParser parser = new FastDateParser("yyyy'abc'''", GMT, US);

        // Act
        Date date = parser.parse("2023abc'");

        // Assert
        Assert.assertNotNull(date);
    }
}