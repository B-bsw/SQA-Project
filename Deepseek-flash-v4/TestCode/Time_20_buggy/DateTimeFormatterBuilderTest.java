package org.joda.time.format;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.MutableDateTime;
import org.joda.time.format.DateTimeFormatterBuilder.MatchingParser;
import org.joda.time.format.DateTimeFormatterBuilder.NumberFormatter;
import org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber;
import org.joda.time.format.DateTimeFormatterBuilder.TextField;
import org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear;
import org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber;
import org.joda.time.format.DateTimeFormatterBuilder.FixedNumber;
import org.joda.time.format.DateTimeFormatterBuilder.StringLiteral;
import org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral;
import org.joda.time.format.DateTimeFormatterBuilder.Fraction;
import org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset;
import org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.*;

public class DateTimeFormatterBuilderTest {
    private DateTimeFormatterBuilder builder;

    @Before
    public void setUp() {
        builder = new DateTimeFormatterBuilder();
    }

    @After
    public void tearDown() {
        builder = null;
    }

    @Test
    public void testAppendLiteralNull() {
        builder.appendLiteral((String) null);
        assertTrue(builder.canBuildFormatter());
    }

    @Test
    public void testAppendLiteralEmptyString() {
        builder.appendLiteral("");
        assertTrue(builder.canBuildFormatter());
    }

    @Test
    public void testAppendLiteralSingleChar() {
        builder.appendLiteral('a');
        assertTrue(builder.canBuildPrinter());
        assertTrue(builder.canBuildParser());
    }

    @Test
    public void testAppendDecimalInvalidFieldType() {
        try {
            builder.appendDecimal(null, 1, 2);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testAppendDecimalInvalidMinDigits() {
        try {
            builder.appendDecimal(DateTimeFieldType.dayOfMonth(), -1, 2);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testAppendDecimalMaxLessThanMin() {
        try {
            builder.appendDecimal(DateTimeFieldType.dayOfMonth(), 3, 2);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testAppendFixedDecimalInvalidNumDigits() {
        try {
            builder.appendFixedDecimal(DateTimeFieldType.dayOfMonth(), 0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testAppendFractionMaxDigitsZero() {
        try {
            builder.appendFraction(DateTimeFieldType.hourOfDay(), 1, 0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testCanBuildFormatterFalse() {
        assertFalse(builder.canBuildFormatter());
        assertFalse(builder.canBuildPrinter());
        assertFalse(builder.canBuildParser());
    }

    @Test
    public void testClear() {
        builder.appendLiteral('a');
        assertTrue(builder.canBuildFormatter());
        builder.clear();
        assertFalse(builder.canBuildFormatter());
    }

    @Test
    public void testAppendTwoDigitYearDefault() {
        builder.appendTwoDigitYear(50);
        DateTimeFormatter formatter = builder.toFormatter();
        assertNotNull(formatter);
    }

    @Test
    public void testAppendTwoDigitYearInvalidPivot() {
        try {
            builder.appendTwoDigitYear(100);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testAppendTimeZoneId() {
        builder.appendTimeZoneId();
        assertTrue(builder.canBuildPrinter());
        assertTrue(builder.canBuildParser());
    }

    @Test
    public void testAppendPatternNull() {
        try {
            builder.appendPattern(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testAppendPatternEmpty() {
        builder.appendPattern("");
        assertTrue(builder.canBuildFormatter());
    }

    @Test
    public void testAppendPatternLiteral() {
        builder.appendPattern("'abc'");
        assertTrue(builder.canBuildFormatter());
    }

    @Test
    public void testAppendPatternNumber() {
        builder.appendPattern("YYYY");
        assertNotNull(builder.toFormatter());
    }

    @Test
    public void testAppendPatternUnknownChar() {
        builder.appendPattern("X");
        assertNotNull(builder.toFormatter());
    }

    @Test
    public void testNumberFormatterEstimateInRange() {
        NumberFormatter nf = new UnpaddedNumber(DateTimeFieldType.dayOfMonth(), 3, true, 2, 4);
        assertNotNull(nf);
        assertEquals(6, nf.estimateParsedLength());
    }

    @Test
    public void testPaddedNumberEstimate() {
        PaddedNumber pn = new PaddedNumber(DateTimeFieldType.dayOfMonth(), 3, true, 5);
        assertEquals(5, pn.estimatePrintedLength());
    }

    @Test
    public void testFixedNumberEstimateMinusOne() {
        FixedNumber fn = new FixedNumber(DateTimeFieldType.dayOfMonth(), 3, true, -1);
        assertEquals(2, fn.estimatePrintedLength());
    }

    @Test
    public void testTwoDigitYearParseLessThanTwoDigits() {
        TwoDigitYear tdy = new TwoDigitYear(DateTimeFieldType.year(), 50, true);
        String text = "5";
        DateTimeParserBucket bucket = new DateTimeParserBucket(0, null, null);
        int result = tdy.parseInto(bucket, text, 0);
        assertEquals(~1, result);
    }

    @Test
    public void testTwoDigitYearParseWithSign() {
        TwoDigitYear tdy = new TwoDigitYear(DateTimeFieldType.year(), 50, true);
        String text = "-5";
        DateTimeParserBucket bucket = new DateTimeParserBucket(0, null, null);
        int result = tdy.parseInto(bucket, text, 0);
        assertEquals(~1, result);
    }

    @Test
    public void testTwoDigitYearParseNormal() {
        TwoDigitYear tdy = new TwoDigitYear(DateTimeFieldType.year(), 50, true);
        String text = "99";
        DateTimeParserBucket bucket = new DateTimeParserBucket(50, null, null);
        int result = tdy.parseInto(bucket, text, 0);
        assertEquals(2, result);
    }

    @Test
    public void testTwoDigitYearParseLenient() {
        TwoDigitYear tdy = new TwoDigitYear(DateTimeFieldType.year(), 50, true);
        String text = "00";
        DateTimeParserBucket bucket = new DateTimeParserBucket(50, null, null);
        int result = tdy.parseInto(bucket, text, 0);
        assertEquals(2, result);
    }

    @Test
    public void testTwoDigitYearParseNonLenient() {
        TwoDigitYear tdy = new TwoDigitYear(DateTimeFieldType.year(), 50, false);
        String text = "00";
        DateTimeParserBucket bucket = new DateTimeParserBucket(0, null, null);
        int result = tdy.parseInto(bucket, text, 0);
        assertEquals(2, result);
    }

    @Test
    public void testTwoDigitYearParseNonLenientInvalid() {
        TwoDigitYear tdy = new TwoDigitYear(DateTimeFieldType.year(), 50, false);
        String text = "5";
        DateTimeParserBucket bucket = new DateTimeParserBucket(0, null, null);
        int result = tdy.parseInto(bucket, text, 0);
        assertEquals(~1, result);
    }

    @Test
    public void testTimeZoneOffsetParseInvalidMinutes() {
        TimeZoneOffset tzo = new TimeZoneOffset(null, 0, 4, 2, 2, 2, true);
        String text = "+25:61";
        DateTimeParserBucket bucket = new DateTimeParserBucket(0, null, null);
        int result = tzo.parseInto(bucket, text, 0);
        assertTrue(result < 0);
    }

    @Test
    public void testTimeZoneOffsetParseValid() {
        TimeZoneOffset tzo = new TimeZoneOffset(null, 0, 4, 2, 2, 2, true);
        String text = "+05:30";
        DateTimeParserBucket bucket = new DateTimeParserBucket(0, null, null);
        int result = tzo.parseInto(bucket, text, 0);
        assertEquals(6, result);
    }

    @Test
    public void testTimeZoneOffsetParseZeroOffsetNoSeparators() {
        TimeZoneOffset tzo = new TimeZoneOffset(null, 0, 1, 1, 1, 1, false);
        String text = "+0";
        DateTimeParserBucket bucket = new DateTimeParserBucket(0, null, null);
        int result = tzo.parseInto(bucket, text, 0);
        assertEquals(2, result);
    }

    @Test
    public void testTimeZoneOffsetParseWithSeparators() {
        TimeZoneOffset tzo = new TimeZoneOffset(null, 0, 3, 2, 2, 2, true);
        String text = "+05:30";
        DateTimeParserBucket bucket = new DateTimeParserBucket(0, null, null);
        int result = tzo.parseInto(bucket, text, 0);
        assertEquals(6, result);
    }

    @Test
    public void testTimeZoneOffsetParseHoursTooLarge() {
        TimeZoneOffset tzo = new TimeZoneOffset(null, 0, 4, 2, 2, 2, true);
        String text = "+24:00";
        DateTimeParserBucket bucket = new DateTimeParserBucket(0, null, null);
        int result = tzo.parseInto(bucket, text, 0);
        assertTrue(result < 0);
    }

    @Test
    public void testTimeZoneOffsetParseNoSign() {
        TimeZoneOffset tzo = new TimeZoneOffset(null, 0, 4, 2, 2, 2, false);
        String text = "0500";
        DateTimeParserBucket bucket = new DateTimeParserBucket(0, null, null);
        int result = tzo.parseInto(bucket, text, 0);
        assertEquals(4, result);
    }

    @Test
    public void testMatchingParserParse() {
        DateTimeParser parser = DateTimeFormat.longDateTime().getParser();
        MatchingParser mp = new MatchingParser(parser);
        String text = "January 1, 2020";
        DateTimeParserBucket bucket = new DateTimeParserBucket(0, null, null);
        int result = mp.parseInto(bucket, text, 0);
        assertTrue(result > 0);
    }

    @Test
    public void testMatchingParserParseFail() {
        DateTimeParser parser = DateTimeFormat.longDateTime().getParser();
        MatchingParser mp = new MatchingParser(parser);
        String text = "invalid";
        DateTimeParserBucket bucket = new DateTimeParserBucket(0, null, null);
        int result = mp.parseInto(bucket, text, 0);
        assertTrue(result < 0);
    }

    @Test
    public void testTimeZoneNameParse() {
        TimeZoneName tzn = new TimeZoneName(TimeZoneName.LONG_NAME, "EST", true);
        assertEquals(3, tzn.estimatePrintedLength());
    }

    @Test
    public void testFractionEstimate() {
        Fraction f = new Fraction(DateTimeFieldType.millisOfSecond(), 1, 3);
        assertEquals(3, f.estimatePrintedLength());
    }

    @Test
    public void testFractionParserMaxDigitsExceeded() {
        Fraction f = new Fraction(DateTimeFieldType.millisOfSecond(), 1, 1);
        String text = "12";
        DateTimeParserBucket bucket = new DateTimeParserBucket(0, null, null);
        int result = f.parseInto(bucket, text, 0);
        assertEquals(1, result);
    }

    @Test
    public void testFractionParserFractionZero() {
        Fraction f = new Fraction(DateTimeFieldType.millisOfSecond(), 0, 0);
        String text = "000";
        DateTimeParserBucket bucket = new DateTimeParserBucket(0, null, null);
        int result = f.parseInto(bucket, text, 0);
        assertEquals(0, result);
    }
}