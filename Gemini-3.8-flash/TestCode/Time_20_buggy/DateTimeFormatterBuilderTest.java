package org.joda.time.format;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.MutableDateTime;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DateTimeFormatterBuilderTest {

    private DateTimeFormatterBuilder builder;
    private Chronology chrono;
    private DateTimeZone originalZone;
    private Locale originalLocale;

    @Before
    public void setUp() {
        builder = new DateTimeFormatterBuilder();
        chrono = ISOChronology.getInstanceUTC();
        originalZone = DateTimeZone.getDefault();
        originalLocale = Locale.getDefault();
        DateTimeZone.setDefault(DateTimeZone.UTC);
        Locale.setDefault(Locale.ENGLISH);
    }

    @After
    public void tearDown() {
        DateTimeZone.setDefault(originalZone);
        Locale.setDefault(originalLocale);
    }

    // =========================================================================
    // Core Builder Lifecycle & Validation
    // =========================================================================

    @Test
    public void canBuildFormatter_givenEmptyBuilder_shouldReturnFalse() {
        Assert.assertFalse(builder.canBuildFormatter());
        Assert.assertFalse(builder.canBuildPrinter());
        Assert.assertFalse(builder.canBuildParser());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void toFormatter_givenEmptyBuilder_shouldThrowUnsupportedOperationException() {
        builder.toFormatter();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void toPrinter_givenEmptyBuilder_shouldThrowUnsupportedOperationException() {
        builder.toPrinter();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void toParser_givenEmptyBuilder_shouldThrowUnsupportedOperationException() {
        builder.toParser();
    }

    @Test
    public void clear_givenPopulatedBuilder_shouldResetState() {
        builder.appendLiteral('X');
        Assert.assertTrue(builder.canBuildFormatter());
        builder.clear();
        Assert.assertFalse(builder.canBuildFormatter());
        Assert.assertFalse(builder.canBuildPrinter());
        Assert.assertFalse(builder.canBuildParser());
    }

    @Test
    public void toFormatter_givenPrinterOnly_shouldBuildFormatterWithoutParser() {
        DateTimePrinter printer = new DateTimeFormatterBuilder.CharacterLiteral('A');
        builder.append(printer);
        Assert.assertTrue(builder.canBuildFormatter());
        Assert.assertTrue(builder.canBuildPrinter());
        Assert.assertFalse(builder.canBuildParser());

        DateTimeFormatter formatter = builder.toFormatter();
        Assert.assertNotNull(formatter.getPrinter());
        Assert.assertNull(formatter.getParser());
        Assert.assertNotNull(builder.toPrinter());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void toParser_givenPrinterOnly_shouldThrowException() {
        DateTimePrinter printer = new DateTimeFormatterBuilder.CharacterLiteral('A');
        builder.append(printer);
        builder.toParser();
    }

    @Test
    public void toFormatter_givenParserOnly_shouldBuildFormatterWithoutPrinter() {
        DateTimeParser parser = new DateTimeFormatterBuilder.CharacterLiteral('A');
        builder.append(parser);
        Assert.assertTrue(builder.canBuildFormatter());
        Assert.assertFalse(builder.canBuildPrinter());
        Assert.assertTrue(builder.canBuildParser());

        DateTimeFormatter formatter = builder.toFormatter();
        Assert.assertNull(formatter.getPrinter());
        Assert.assertNotNull(formatter.getParser());
        Assert.assertNotNull(builder.toParser());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void toPrinter_givenParserOnly_shouldThrowException() {
        DateTimeParser parser = new DateTimeFormatterBuilder.CharacterLiteral('A');
        builder.append(parser);
        builder.toPrinter();
    }

    // =========================================================================
    // Append Formatter / Printer / Parser
    // =========================================================================

    @Test(expected = IllegalArgumentException.class)
    public void append_givenNullFormatter_shouldThrowIllegalArgumentException() {
        builder.append((DateTimeFormatter) null);
    }

    @Test
    public void append_givenValidFormatter_shouldAppendPrinterAndParser() {
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-dd");
        builder.append(f);
        Assert.assertTrue(builder.canBuildFormatter());
        Assert.assertTrue(builder.canBuildPrinter());
        Assert.assertTrue(builder.canBuildParser());
        DateTime dt = builder.toFormatter().parseDateTime("2023-11-20");
        Assert.assertEquals(2023, dt.getYear());
        Assert.assertEquals(11, dt.getMonthOfYear());
        Assert.assertEquals(20, dt.getDayOfMonth());
    }

    @Test(expected = IllegalArgumentException.class)
    public void append_givenNullPrinter_shouldThrowIllegalArgumentException() {
        builder.append((DateTimePrinter) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void append_givenNullParser_shouldThrowIllegalArgumentException() {
        builder.append((DateTimeParser) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void append_givenPrinterAndNullParser_shouldThrowIllegalArgumentException() {
        DateTimePrinter printer = new DateTimeFormatterBuilder.CharacterLiteral('A');
        builder.append(printer, (DateTimeParser) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void append_givenNullPrinterAndParser_shouldThrowIllegalArgumentException() {
        DateTimeParser parser = new DateTimeFormatterBuilder.CharacterLiteral('A');
        builder.append((DateTimePrinter) null, parser);
    }

    @Test
    public void append_givenPrinterAndParser_shouldAppendBoth() {
        DateTimePrinter printer = new DateTimeFormatterBuilder.CharacterLiteral('A');
        DateTimeParser parser = new DateTimeFormatterBuilder.CharacterLiteral('A');
        builder.append(printer, parser);
        Assert.assertTrue(builder.canBuildFormatter());
        Assert.assertEquals("A", builder.toFormatter().print(0L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void append_givenNullParsersArray_shouldThrowIllegalArgumentException() {
        builder.append((DateTimePrinter) null, (DateTimeParser[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void append_givenEmptyParsersArrayWithSingleNull_shouldThrowIllegalArgumentException() {
        builder.append((DateTimePrinter) null, new DateTimeParser[] { null });
    }

    @Test(expected = IllegalArgumentException.class)
    public void append_givenParsersArrayWithNullElement_shouldThrowIllegalArgumentException() {
        DateTimeParser p1 = new DateTimeFormatterBuilder.CharacterLiteral('1');
        builder.append((DateTimePrinter) null, new DateTimeParser[] { p1, null, p1 });
    }

    @Test
    public void append_givenParsersArraySingleElement_shouldAppendDirectly() {
        DateTimeParser p1 = new DateTimeFormatterBuilder.CharacterLiteral('A');
        builder.append((DateTimePrinter) null, new DateTimeParser[] { p1 });
        Assert.assertTrue(builder.canBuildParser());
        Assert.assertFalse(builder.canBuildPrinter());
    }

    @Test
    public void append_givenParsersArrayMultipleElements_shouldAppendMatchingParser() {
        DateTimeParser p1 = new DateTimeFormatterBuilder.CharacterLiteral('A');
        DateTimeParser p2 = new DateTimeFormatterBuilder.CharacterLiteral('B');
        DateTimePrinter printer = new DateTimeFormatterBuilder.CharacterLiteral('Z');
        builder.append(printer, new DateTimeParser[] { p1, p2 });

        DateTimeFormatter f = builder.toFormatter();
        Assert.assertEquals("Z", f.print(0L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void appendOptional_givenNullParser_shouldThrowIllegalArgumentException() {
        builder.appendOptional(null);
    }

    @Test
    public void appendOptional_givenValidParser_shouldParseOptionalContent() {
        builder.appendLiteral('a');
        builder.appendOptional(new DateTimeFormatterBuilder.CharacterLiteral('b'));
        DateTimeFormatter f = builder.toFormatter();

        MutableDateTime mdt1 = new MutableDateTime(0L, DateTimeZone.UTC);
        int pos1 = f.getParser().parseInto(new DateTimeParserBucket(0L, chrono, Locale.ENGLISH, null, 2000), "a", 0);
        Assert.assertEquals(1, pos1);

        int pos2 = f.getParser().parseInto(new DateTimeParserBucket(0L, chrono, Locale.ENGLISH, null, 2000), "ab", 0);
        Assert.assertEquals(2, pos2);

        int pos3 = f.getParser().parseInto(new DateTimeParserBucket(0L, chrono, Locale.ENGLISH, null, 2000), "x", 0);
        Assert.assertTrue(pos3 < 0);
    }

    // =========================================================================
    // Literal Append Tests
    // =========================================================================

    @Test(expected = IllegalArgumentException.class)
    public void appendLiteral_givenNullString_shouldThrowIllegalArgumentException() {
        builder.appendLiteral((String) null);
    }

    @Test
    public void appendLiteral_givenEmptyString_shouldNotModifyBuilder() {
        builder.appendLiteral("");
        Assert.assertFalse(builder.canBuildFormatter());
    }

    @Test
    public void appendLiteral_givenSingleCharString_shouldAppendCharacterLiteral() {
        builder.appendLiteral("Z");
        DateTimeFormatter f = builder.toFormatter();
        Assert.assertEquals("Z", f.print(0L));
    }

    @Test
    public void appendLiteral_givenMultiCharString_shouldAppendStringLiteral() {
        builder.appendLiteral("Hello");
        DateTimeFormatter f = builder.toFormatter();
        Assert.assertEquals("Hello", f.print(0L));
    }

    @Test
    public void appendLiteral_charLiteralPrintAndParse_shouldWorkCaseInsensitively() throws IOException {
        DateTimeFormatterBuilder.CharacterLiteral cl = new DateTimeFormatterBuilder.CharacterLiteral('X');
        Assert.assertEquals(1, cl.estimatePrintedLength());
        Assert.assertEquals(1, cl.estimateParsedLength());

        StringBuffer buf = new StringBuffer();
        cl.printTo(buf, 0L, chrono, 0, DateTimeZone.UTC, Locale.ENGLISH);
        Assert.assertEquals("X", buf.toString());

        StringWriter sw = new StringWriter();
        cl.printTo((Writer) sw, 0L, chrono, 0, DateTimeZone.UTC, Locale.ENGLISH);
        Assert.assertEquals("X", sw.toString());

        buf = new StringBuffer();
        cl.printTo(buf, new LocalDate(2020, 1, 1), Locale.ENGLISH);
        Assert.assertEquals("X", buf.toString());

        sw = new StringWriter();
        cl.printTo((Writer) sw, new LocalDate(2020, 1, 1), Locale.ENGLISH);
        Assert.assertEquals("X", sw.toString());

        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, chrono, Locale.ENGLISH, null, 2000);
        Assert.assertEquals(1, cl.parseInto(bucket, "X", 0));
        Assert.assertEquals(1, cl.parseInto(bucket, "x", 0));
        Assert.assertTrue(cl.parseInto(bucket, "Y", 0) < 0);
        Assert.assertTrue(cl.parseInto(bucket, "", 0) < 0);
    }

    @Test
    public void appendLiteral_stringLiteralPrintAndParse_shouldHandleMatching() throws IOException {
        DateTimeFormatterBuilder.StringLiteral sl = new DateTimeFormatterBuilder.StringLiteral("Test");
        Assert.assertEquals(4, sl.estimatePrintedLength());
        Assert.assertEquals(4, sl.estimateParsedLength());

        StringBuffer buf = new StringBuffer();
        sl.printTo(buf, 0L, chrono, 0, DateTimeZone.UTC, Locale.ENGLISH);
        Assert.assertEquals("Test", buf.toString());

        StringWriter sw = new StringWriter();
        sl.printTo((Writer) sw, 0L, chrono, 0, DateTimeZone.UTC, Locale.ENGLISH);
        Assert.assertEquals("Test", sw.toString());

        buf = new StringBuffer();
        sl.printTo(buf, new LocalDate(2020, 1, 1), Locale.ENGLISH);
        Assert.assertEquals("Test", buf.toString());

        sw = new StringWriter();
        sl.printTo((Writer) sw, new LocalDate(2020, 1, 1), Locale.ENGLISH);
        Assert.assertEquals("Test", sw.toString());

        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, chrono, Locale.ENGLISH, null, 2000);
        Assert.assertEquals(4, sl.parseInto(bucket, "test123", 0));
        Assert.assertEquals(4, sl.parseInto(bucket, "TEST", 0));
        Assert.assertTrue(sl.parseInto(bucket, "fail", 0) < 0);
    }

    // =========================================================================
    // Decimal & Number Formatters
    // =========================================================================

    @Test(expected = IllegalArgumentException.class)
    public void appendDecimal_givenNullFieldType_shouldThrowIllegalArgumentException() {
        builder.appendDecimal(null, 1, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void appendDecimal_givenNegativeMinDigits_shouldThrowIllegalArgumentException() {
        builder.appendDecimal(DateTimeFieldType.year(), -1, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void appendDecimal_givenZeroMaxDigits_shouldThrowIllegalArgumentException() {
        builder.appendDecimal(DateTimeFieldType.year(), 0, 0);
    }

    @Test
    public void appendDecimal_givenMinDigitsLessThanOrEqualTo1_shouldAppendUnpaddedNumber() {
        builder.appendDecimal(DateTimeFieldType.year(), 1, 4);
        DateTimeFormatter f = builder.toFormatter();
        DateTime dt = new DateTime(2023, 5, 1, 0, 0, DateTimeZone.UTC);
        Assert.assertEquals("2023", f.print(dt));
        DateTime parsed = f.parseDateTime("2023");
        Assert.assertEquals(2023, parsed.getYear());
    }

    @Test
    public void appendDecimal_givenMinDigitsGreaterThan1_shouldAppendPaddedNumber() {
        builder.appendDecimal(DateTimeFieldType.monthOfYear(), 2, 2);
        DateTimeFormatter f = builder.toFormatter();
        DateTime dt = new DateTime(2023, 5, 1, 0, 0, DateTimeZone.UTC);
        Assert.assertEquals("05", f.print(dt));
        DateTime parsed = f.parseDateTime("05");
        Assert.assertEquals(5, parsed.getMonthOfYear());
    }

    @Test(expected = IllegalArgumentException.class)
    public void appendFixedDecimal_givenNullFieldType_shouldThrowIllegalArgumentException() {
        builder.appendFixedDecimal(null, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void appendFixedDecimal_givenZeroDigits_shouldThrowIllegalArgumentException() {
        builder.appendFixedDecimal(DateTimeFieldType.year(), 0);
    }

    @Test
    public void appendFixedDecimal_givenValidParams_shouldPrintAndParseFixedNumber() {
        builder.appendFixedDecimal(DateTimeFieldType.year(), 4);
        DateTimeFormatter f = builder.toFormatter();
        Assert.assertEquals("2023", f.print(new DateTime(2023, 1, 1, 0, 0, DateTimeZone.UTC)));
        Assert.assertEquals(2023, f.parseDateTime("2023").getYear());
    }

    @Test(expected = IllegalArgumentException.class)
    public void appendSignedDecimal_givenNullFieldType_shouldThrowIllegalArgumentException() {
        builder.appendSignedDecimal(null, 1, 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void appendSignedDecimal_givenInvalidDigits_shouldThrowIllegalArgumentException() {
        builder.appendSignedDecimal(DateTimeFieldType.year(), -1, 0);
    }

    @Test
    public void appendSignedDecimal_givenValidParams_shouldHandleSignedValues() {
        builder.appendSignedDecimal(DateTimeFieldType.year(), 1, 4);
        DateTimeFormatter f = builder.toFormatter();
        DateTime parsedPos = f.parseDateTime("+2023");
        Assert.assertEquals(2023, parsedPos.getYear());
        DateTime parsedNeg = f.parseDateTime("-0050");
        Assert.assertEquals(-50, parsedNeg.getYear());
    }

    @Test(expected = IllegalArgumentException.class)
    public void appendFixedSignedDecimal_givenNullFieldType_shouldThrowIllegalArgumentException() {
        builder.appendFixedSignedDecimal(null, 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void appendFixedSignedDecimal_givenZeroDigits_shouldThrowIllegalArgumentException() {
        builder.appendFixedSignedDecimal(DateTimeFieldType.year(), 0);
    }

    @Test
    public void appendFixedSignedDecimal_givenValidParams_shouldParseSignedFixedDigits() {
        builder.appendFixedSignedDecimal(DateTimeFieldType.year(), 4);
        DateTimeFormatter f = builder.toFormatter();
        DateTime dtPos = f.parseDateTime("+2023");
        Assert.assertEquals(2023, dtPos.getYear());
        DateTime dtNeg = f.parseDateTime("-2023");
        Assert.assertEquals(-2023, dtNeg.getYear());
    }

    @Test
    public void numberFormatter_edgeCasesInParsing_shouldHandleVariousLengthsAndFailures() {
        DateTimeFormatterBuilder.UnpaddedNumber un = new DateTimeFormatterBuilder.UnpaddedNumber(DateTimeFieldType.year(), 10, true);
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, chrono, Locale.ENGLISH, null, 2000);

        // Digits >= 9
        int res9 = un.parseInto(bucket, "1234567890", 0);
        Assert.assertEquals(10, res9);

        // Sign with not enough digits
        int failSign = un.parseInto(bucket, "+", 0);
        Assert.assertTrue(failSign < 0);

        // Non-digit immediately
        int failNonDigit = un.parseInto(bucket, "abc", 0);
        Assert.assertTrue(failNonDigit < 0);

        // Negative sign
        int resNeg = un.parseInto(bucket, "-123", 0);
        Assert.assertEquals(4, resNeg);
    }

    @Test
    public void unpaddedAndPaddedNumber_partialPrint_shouldHandleSupportedAndUnsupported() throws IOException {
        DateTimeFormatterBuilder.UnpaddedNumber un = new DateTimeFormatterBuilder.UnpaddedNumber(DateTimeFieldType.hourOfDay(), 2, false);
        StringBuffer sb = new StringBuffer();
        un.printTo(sb, new LocalTime(14, 30), Locale.ENGLISH);
        Assert.assertEquals("14", sb.toString());

        StringWriter sw = new StringWriter();
        un.printTo((Writer) sw, new LocalTime(14, 30), Locale.ENGLISH);
        Assert.assertEquals("14", sw.toString());

        // Unsupported field
        sb = new StringBuffer();
        un.printTo(sb, new LocalDate(2023, 1, 1), Locale.ENGLISH);
        Assert.assertEquals("\ufffd", sb.toString());

        sw = new StringWriter();
        un.printTo((Writer) sw, new LocalDate(2023, 1, 1), Locale.ENGLISH);
        Assert.assertEquals("\ufffd", sw.toString());

        DateTimeFormatterBuilder.PaddedNumber pn = new DateTimeFormatterBuilder.PaddedNumber(DateTimeFieldType.hourOfDay(), 2, false, 2);
        sb = new StringBuffer();
        pn.printTo(sb, new LocalTime(5, 30), Locale.ENGLISH);
        Assert.assertEquals("05", sb.toString());

        sw = new StringWriter();
        pn.printTo((Writer) sw, new LocalTime(5, 30), Locale.ENGLISH);
        Assert.assertEquals("05", sw.toString());

        sb = new StringBuffer();
        pn.printTo(sb, new LocalDate(2023, 1, 1), Locale.ENGLISH);
        Assert.assertEquals("\ufffd\ufffd", sb.toString());

        sw = new StringWriter();
        pn.printTo((Writer) sw, new LocalDate(2023, 1, 1), Locale.ENGLISH);
        Assert.assertEquals("\ufffd\ufffd", sw.toString());
    }

    // =========================================================================
    // TwoDigitYear and TwoDigitWeekyear Tests
    // =========================================================================

    @Test
    public void appendTwoDigitYear_defaultPivot_shouldFormatAndParseCorrectly() throws IOException {
        builder.appendTwoDigitYear(2000);
        DateTimeFormatter f = builder.toFormatter();
        DateTime dt = new DateTime(1995, 1, 1, 0, 0, DateTimeZone.UTC);
        Assert.assertEquals("95", f.print(dt));

        DateTime parsed = f.parseDateTime("95");
        Assert.assertEquals(1995, parsed.getYear());

        DateTime parsed05 = f.parseDateTime("05");
        Assert.assertEquals(2005, parsed05.getYear());
    }

    @Test
    public void appendTwoDigitYear_lenientParse_shouldParseMultipleDigitsAndSigns() {
        builder.appendTwoDigitYear(2000, true);
        DateTimeFormatter f = builder.toFormatter();

        DateTime parsed2 = f.parseDateTime("20");
        Assert.assertEquals(2020, parsed2.getYear());

        DateTime parsed4 = f.parseDateTime("1985");
        Assert.assertEquals(1985, parsed4.getYear());

        DateTime parsedNeg = f.parseDateTime("-50");
        Assert.assertEquals(-50, parsedNeg.getYear());

        DateTime parsedPos = f.parseDateTime("+2025");
        Assert.assertEquals(2025, parsedPos.getYear());
    }

    @Test
    public void appendTwoDigitYear_printPartial_shouldHandleSupportedAndUnsupported() throws IOException {
        DateTimeFormatterBuilder.TwoDigitYear tdy = new DateTimeFormatterBuilder.TwoDigitYear(DateTimeFieldType.year(), 2000, false);
        StringBuffer sb = new StringBuffer();
        tdy.printTo(sb, new LocalDate(2023, 1, 1), Locale.ENGLISH);
        Assert.assertEquals("23", sb.toString());

        StringWriter sw = new StringWriter();
        tdy.printTo((Writer) sw, new LocalDate(2023, 1, 1), Locale.ENGLISH);
        Assert.assertEquals("23", sw.toString());

        sb = new StringBuffer();
        tdy.printTo(sb, new LocalTime(10, 0), Locale.ENGLISH);
        Assert.assertEquals("\ufffd\ufffd", sb.toString());

        sw = new StringWriter();
        tdy.printTo((Writer) sw, new LocalTime(10, 0), Locale.ENGLISH);
        Assert.assertEquals("\ufffd\ufffd", sw.toString());
    }

    @Test
    public void appendTwoDigitWeekyear_shouldFormatAndParse() {
        builder.appendTwoDigitWeekyear(2000);
        DateTimeFormatter f = builder.toFormatter();
        DateTime dt = new DateTime(2023, 1, 1, 0, 0, DateTimeZone.UTC);
        Assert.assertNotNull(f.print(dt));
    }

    @Test
    public void appendTwoDigitWeekyear_withLenient_shouldWork() {
        builder.appendTwoDigitWeekyear(2000, true);
        DateTimeFormatter f = builder.toFormatter();
        Assert.assertNotNull(f.parseDateTime("23"));
    }

    @Test
    public void twoDigitYear_negativePivot_shouldCalculateCorrectly() {
        DateTimeFormatterBuilder.TwoDigitYear tdy = new DateTimeFormatterBuilder.TwoDigitYear(DateTimeFieldType.year(), -50, false);
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, chrono, Locale.ENGLISH, null, 2000);
        int pos = tdy.parseInto(bucket, "10", 0);
        Assert.assertEquals(2, pos);
    }

    @Test
    public void twoDigitYear_bucketPivotOverride_shouldUseBucketPivot() {
        DateTimeFormatterBuilder.TwoDigitYear tdy = new DateTimeFormatterBuilder.TwoDigitYear(DateTimeFieldType.year(), 2000, false);
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, chrono, Locale.ENGLISH, Integer.valueOf(1950), 1950);
        int pos = tdy.parseInto(bucket, "40", 0);
        Assert.assertEquals(2, pos);
    }

    // =========================================================================
    // Text and Short Text Fields
    // =========================================================================

    @Test(expected = IllegalArgumentException.class)
    public void appendText_givenNullFieldType_shouldThrowIllegalArgumentException() {
        builder.appendText(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void appendShortText_givenNullFieldType_shouldThrowIllegalArgumentException() {
        builder.appendShortText(null);
    }

    @Test
    public void appendTextAndShortText_givenValidField_shouldFormatAndParse() throws IOException {
        builder.appendMonthOfYearText();
        builder.appendLiteral(' ');
        builder.appendDayOfWeekShortText();
        DateTimeFormatter f = builder.toFormatter();

        DateTime dt = new DateTime(2023, 11, 20, 0, 0, DateTimeZone.UTC); // Nov 20, 2023 is Monday
        String printed = f.print(dt);
        Assert.assertEquals("November Mon", printed);

        DateTimeFormatterBuilder b2 = new DateTimeFormatterBuilder();
        b2.appendMonthOfYearText();
        DateTimeFormatter f2 = b2.toFormatter();
        DateTime parsed = f2.parseDateTime("November");
        Assert.assertEquals(11, parsed.getMonthOfYear());
    }

    @Test
    public void textField_printPartial_shouldHandleSupportedAndUnsupported() throws IOException {
        DateTimeFormatterBuilder.TextField tf = new DateTimeFormatterBuilder.TextField(DateTimeFieldType.monthOfYear(), false);
        StringBuffer sb = new StringBuffer();
        tf.printTo(sb, new LocalDate(2023, 11, 1), Locale.ENGLISH);
        Assert.assertEquals("November", sb.toString());

        StringWriter sw = new StringWriter();
        tf.printTo((Writer) sw, new LocalDate(2023, 11, 1), Locale.ENGLISH);
        Assert.assertEquals("November", sw.toString());

        sb = new StringBuffer();
        tf.printTo(sb, new LocalTime(12, 0), Locale.ENGLISH);
        Assert.assertEquals("\ufffd", sb.toString());

        sw = new StringWriter();
        tf.printTo((Writer) sw, new LocalTime(12, 0), Locale.ENGLISH);
        Assert.assertEquals("\ufffd", sw.toString());
    }

    @Test
    public void textField_eraTextEn_shouldSupportBCEandCE() {
        DateTimeFormatterBuilder.TextField tf = new DateTimeFormatterBuilder.TextField(DateTimeFieldType.era(), false);
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, chrono, Locale.ENGLISH, null, 2000);
        int posCE = tf.parseInto(bucket, "CE", 0);
        Assert.assertEquals(2, posCE);
        int posBCE = tf.parseInto(bucket, "BCE", 0);
        Assert.assertEquals(3, posBCE);
        int posInvalid = tf.parseInto(bucket, "XYZ", 0);
        Assert.assertTrue(posInvalid < 0);
    }

    // =========================================================================
    // Fraction Fields
    // =========================================================================

    @Test(expected = IllegalArgumentException.class)
    public void appendFraction_givenNullFieldType_shouldThrowIllegalArgumentException() {
        builder.appendFraction(null, 1, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void appendFraction_givenInvalidRange_shouldThrowIllegalArgumentException() {
        builder.appendFraction(DateTimeFieldType.secondOfDay(), -1, 3);
    }

    @Test
    public void appendFraction_givenValidRange_shouldFormatAndParse() throws IOException {
        builder.appendFraction(DateTimeFieldType.secondOfDay(), 1, 3);
        DateTimeFormatter f = builder.toFormatter();
        DateTime dt = new DateTime(2023, 1, 1, 0, 0, 0, 500, DateTimeZone.UTC);
        String printed = f.print(dt);
        Assert.assertNotNull(printed);

        DateTimeFormatterBuilder.Fraction frac = new DateTimeFormatterBuilder.Fraction(DateTimeFieldType.secondOfDay(), 1, 3);
        StringBuffer sb = new StringBuffer();
        frac.printTo(sb, dt.getMillis(), chrono, 0, DateTimeZone.UTC, Locale.ENGLISH);
        Assert.assertTrue(sb.length() > 0);

        StringWriter sw = new StringWriter();
        frac.printTo((Writer) sw, dt.getMillis(), chrono, 0, DateTimeZone.UTC, Locale.ENGLISH);
        Assert.assertTrue(sw.toString().length() > 0);

        sb = new StringBuffer();
        frac.printTo(sb, new LocalTime(0, 0, 0, 500), Locale.ENGLISH);
        Assert.assertTrue(sb.length() > 0);

        sw = new StringWriter();
        frac.printTo((Writer) sw, new LocalTime(0, 0, 0, 500), Locale.ENGLISH);
        Assert.assertTrue(sw.toString().length() > 0);
    }

    @Test
    public void appendFractionShortcuts_shouldBuildCorrectly() {
        builder.appendFractionOfSecond(1, 3);
        builder.appendFractionOfMinute(1, 3);
        builder.appendFractionOfHour(1, 3);
        builder.appendFractionOfDay(1, 3);
        Assert.assertTrue(builder.canBuildFormatter());
    }

    // =========================================================================
    // Specific Field Shortcuts (Days, Months, Years, Hours, Minutes, etc.)
    // =========================================================================

    @Test
    public void appendShortcuts_shouldAssembleValidPipeline() {
        builder.appendMillisOfSecond(3);
        builder.appendMillisOfDay(5);
        builder.appendSecondOfMinute(2);
        builder.appendSecondOfDay(4);
        builder.appendMinuteOfHour(2);
        builder.appendMinuteOfDay(3);
        builder.appendHourOfDay(2);
        builder.appendClockhourOfDay(2);
        builder.appendHourOfHalfday(2);
        builder.appendClockhourOfHalfday(2);
        builder.appendDayOfWeek(1);
        builder.appendDayOfMonth(2);
        builder.appendDayOfYear(3);
        builder.appendWeekOfWeekyear(2);
        builder.appendWeekyear(4, 4);
        builder.appendMonthOfYear(2);
        builder.appendYear(4, 4);
        builder.appendYearOfEra(4, 4);
        builder.appendYearOfCentury(2, 2);
        builder.appendCenturyOfEra(2, 2);
        builder.appendHalfdayOfDayText();
        builder.appendDayOfWeekText();
        builder.appendMonthOfYearShortText();
        builder.appendEraText();
        Assert.assertTrue(builder.canBuildFormatter());
    }

    // =========================================================================
    // TimeZone Offset, Name, and ID
    // =========================================================================

    @Test(expected = IllegalArgumentException.class)
    public void appendTimeZoneOffset_givenInvalidMinMaxFields_shouldThrowIllegalArgumentException() {
        builder.appendTimeZoneOffset("Z", false, 0, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void appendTimeZoneOffset_givenMinGreaterThanMax_shouldThrowIllegalArgumentException() {
        builder.appendTimeZoneOffset("Z", false, 3, 2);
    }

    @Test
    public void appendTimeZoneOffset_printAndParse_shouldHandleOffsets() throws IOException {
        builder.appendTimeZoneOffset("Z", true, 2, 4);
        DateTimeFormatter f = builder.toFormatter();

        DateTime dtUtc = new DateTime(2023, 1, 1, 0, 0, DateTimeZone.UTC);
        Assert.assertEquals("Z", f.print(dtUtc));

        DateTimeZone plus2 = DateTimeZone.forOffsetHours(2);
        DateTime dtPlus2 = new DateTime(2023, 1, 1, 0, 0, plus2);
        Assert.assertEquals("+02:00", f.print(dtPlus2));

        DateTime parsedUtc = f.parseDateTime("Z");
        Assert.assertEquals(0, parsedUtc.getZone().getOffset(0L));

        DateTime parsedPlus2 = f.parseDateTime("+02:00");
        Assert.assertEquals(2 * 3600000, parsedPlus2.getZone().getOffset(0L));
    }

    @Test
    public void timeZoneOffset_variousFieldCombinations_shouldPrintAccurately() throws IOException {
        DateTimeZone tzWithMillis = DateTimeZone.forOffsetMillis(3600000 + 60000 + 1000 + 250); // 01:01:01.250
        DateTimeFormatterBuilder.TimeZoneOffset tzo = new DateTimeFormatterBuilder.TimeZoneOffset(null, null, true, 4, 4);

        StringBuffer sb = new StringBuffer();
        tzo.printTo(sb, 0L, chrono, tzWithMillis.getOffset(0L), tzWithMillis, Locale.ENGLISH);
        Assert.assertEquals("+01:01:01.250", sb.toString());

        StringWriter sw = new StringWriter();
        tzo.printTo((Writer) sw, 0L, chrono, tzWithMillis.getOffset(0L), tzWithMillis, Locale.ENGLISH);
        Assert.assertEquals("+01:01:01.250", sw.toString());

        // Max fields 1
        DateTimeFormatterBuilder.TimeZoneOffset tzo1 = new DateTimeFormatterBuilder.TimeZoneOffset(null, null, true, 1, 1);
        sb = new StringBuffer();
        tzo1.printTo(sb, 0L, chrono, 3600000, DateTimeZone.forOffsetHours(1), Locale.ENGLISH);
        Assert.assertEquals("+01", sb.toString());

        // Max fields 2
        DateTimeFormatterBuilder.TimeZoneOffset tzo2 = new DateTimeFormatterBuilder.TimeZoneOffset(null, null, true, 2, 2);
        sb = new StringBuffer();
        tzo2.printTo(sb, 0L, chrono, 3600000 + 1800000, DateTimeZone.forOffsetHoursMinutes(1, 30), Locale.ENGLISH);
        Assert.assertEquals("+01:30", sb.toString());

        // Max fields 3
        DateTimeFormatterBuilder.TimeZoneOffset tzo3 = new DateTimeFormatterBuilder.TimeZoneOffset(null, null, true, 3, 3);
        sb = new StringBuffer();
        tzo3.printTo(sb, 0L, chrono, 3600000 + 60000 + 1000, DateTimeZone.forOffsetMillis(3661000), Locale.ENGLISH);
        Assert.assertEquals("+01:01:01", sb.toString());
    }

    @Test
    public void timeZoneOffset_parseIntoVariants_shouldParseOrReject() {
        DateTimeFormatterBuilder.TimeZoneOffset tzo = new DateTimeFormatterBuilder.TimeZoneOffset("Z", "Z", true, 1, 4);
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, chrono, Locale.ENGLISH, null, 2000);

        // Zero offset match
        int posZ = tzo.parseInto(bucket, "Z", 0);
        Assert.assertEquals(1, posZ);

        // Negative offset
        int posNeg = tzo.parseInto(bucket, "-05:00", 0);
        Assert.assertEquals(6, posNeg);

        // Invalid sign
        int posInvalid = tzo.parseInto(bucket, "invalid", 0);
        Assert.assertTrue(posInvalid < 0);

        // Hours out of bounds (> 23)
        int posHourExceed = tzo.parseInto(bucket, "+25:00", 0);
        Assert.assertTrue(posHourExceed < 0);

        // Empty zeroOffsetParseText
        DateTimeFormatterBuilder.TimeZoneOffset tzoEmptyZero = new DateTimeFormatterBuilder.TimeZoneOffset(null, "", false, 1, 2);
        int posEmpty = tzoEmptyZero.parseInto(bucket, "ABC", 0);
        Assert.assertEquals(0, posEmpty);
    }

    @Test
    public void appendTimeZoneName_andShortName_shouldFormatAndParse() throws IOException {
        Map<String, DateTimeZone> lookup = new HashMap<String, DateTimeZone>();
        lookup.put("UTC", DateTimeZone.UTC);
        lookup.put("GMT", DateTimeZone.UTC);

        builder.appendTimeZoneName(lookup);
        builder.appendLiteral(' ');
        builder.appendTimeZoneShortName(lookup);
        DateTimeFormatter f = builder.toFormatter();

        DateTime dt = new DateTime(0L, DateTimeZone.UTC);
        String printed = f.print(dt);
        Assert.assertNotNull(printed);

        DateTime parsed = f.parseDateTime("UTC GMT");
        Assert.assertEquals(DateTimeZone.UTC, parsed.getZone());

        DateTimeFormatterBuilder b2 = new DateTimeFormatterBuilder();
        b2.appendTimeZoneName();
        b2.appendLiteral('-');
        b2.appendTimeZoneShortName();
        Assert.assertTrue(b2.canBuildPrinter());
        Assert.assertFalse(b2.canBuildParser());
    }

    @Test
    public void appendTimeZoneId_shouldPrintAndParseZoneId() throws IOException {
        builder.appendTimeZoneId();
        DateTimeFormatter f = builder.toFormatter();

        DateTime dt = new DateTime(0L, DateTimeZone.UTC);
        Assert.assertEquals("UTC", f.print(dt));

        DateTime parsed = f.parseDateTime("UTC");
        Assert.assertEquals(DateTimeZone.UTC, parsed.getZone());

        StringWriter sw = new StringWriter();
        f.getPrinter().printTo((Writer) sw, 0L, chrono, 0, DateTimeZone.UTC, Locale.ENGLISH);
        Assert.assertEquals("UTC", sw.toString());
    }

    // =========================================================================
    // Pattern Parsing Integration
    // =========================================================================

    @Test
    public void appendPattern_givenValidPattern_shouldFormatAndParse() {
        builder.appendPattern("yyyy-MM-dd HH:mm:ss.SSS");
        DateTimeFormatter f = builder.toFormatter();
        DateTime dt = new DateTime(2023, 11, 20, 15, 30, 45, 123, DateTimeZone.UTC);
        Assert.assertEquals("2023-11-20 15:30:45.123", f.print(dt));

        DateTime parsed = f.parseDateTime("2023-11-20 15:30:45.123");
        Assert.assertEquals(dt.getMillis(), parsed.getMillis());
    }

    // =========================================================================
    // Composite & Matching Parser Integration
    // =========================================================================

    @Test
    public void composite_printerAndParserOperations_shouldCoverBranches() throws IOException {
        builder.appendLiteral("Start ");
        builder.appendPattern("yyyy-MM-dd");
        DateTimeFormatter f = builder.toFormatter();

        StringBuffer sb = new StringBuffer();
        f.getPrinter().printTo(sb, 0L, chrono, 0, DateTimeZone.UTC, (Locale) null);
        Assert.assertTrue(sb.toString().startsWith("Start "));

        StringWriter sw = new StringWriter();
        f.getPrinter().printTo((Writer) sw, 0L, chrono, 0, DateTimeZone.UTC, (Locale) null);
        Assert.assertTrue(sw.toString().startsWith("Start "));

        sb = new StringBuffer();
        f.getPrinter().printTo(sb, new LocalDate(2023, 1, 1), (Locale) null);
        Assert.assertEquals("Start 2023-01-01", sb.toString());

        sw = new StringWriter();
        f.getPrinter().printTo((Writer) sw, new LocalDate(2023, 1, 1), (Locale) null);
        Assert.assertEquals("Start 2023-01-01", sw.toString());

        Assert.assertTrue(f.getPrinter().estimatePrintedLength() > 0);
        Assert.assertTrue(f.getParser().estimateParsedLength() > 0);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void composite_emptyPrinterPrintTo_shouldThrowUnsupportedOperationException() {
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder();
        b.append((DateTimePrinter) null, new DateTimeFormatterBuilder.CharacterLiteral('A'));
        b.append((DateTimePrinter) null, new DateTimeFormatterBuilder.CharacterLiteral('B'));
        DateTimeFormatter f = b.toFormatter();
        f.print(0L);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void composite_emptyParserParseInto_shouldThrowUnsupportedOperationException() {
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder();
        b.append(new DateTimeFormatterBuilder.CharacterLiteral('A'), (DateTimeParser) null);
        b.append(new DateTimeFormatterBuilder.CharacterLiteral('B'), (DateTimeParser) null);
        DateTimeFormatter f = b.toFormatter();
        f.parseDateTime("AB");
    }

    @Test
    public void matchingParser_multipleParsers_shouldPickBestMatch() {
        DateTimeParser p1 = DateTimeFormat.forPattern("yyyy/MM/dd").getParser();
        DateTimeParser p2 = DateTimeFormat.forPattern("yyyy-MM-dd").getParser();
        builder.append(null, new DateTimeParser[] { p1, p2 });
        DateTimeFormatter f = builder.toFormatter();

        DateTime dt1 = f.parseDateTime("2023/11/20");
        Assert.assertEquals(2023, dt1.getYear());
        Assert.assertEquals(11, dt1.getMonthOfYear());

        DateTime dt2 = f.parseDateTime("2023-11-20");
        Assert.assertEquals(2023, dt2.getYear());
        Assert.assertEquals(11, dt2.getMonthOfYear());
    }

    @Test(expected = IllegalArgumentException.class)
    public void matchingParser_allInvalidInputs_shouldFailParse() {
        DateTimeParser p1 = DateTimeFormat.forPattern("yyyy/MM/dd").getParser();
        DateTimeParser p2 = DateTimeFormat.forPattern("yyyy-MM-dd").getParser();
        builder.append(null, new DateTimeParser[] { p1, p2 });
        DateTimeFormatter f = builder.toFormatter();

        f.parseDateTime("invalid-date-string");
    }

    // =========================================================================
    // Static Utility Methods
    // =========================================================================

    @Test
    public void appendUnknownString_and_printUnknownString_shouldWriteUnicodeReplacementChar() throws IOException {
        StringBuffer sb = new StringBuffer();
        DateTimeFormatterBuilder.appendUnknownString(sb, 3);
        Assert.assertEquals("\ufffd\ufffd\ufffd", sb.toString());

        StringWriter sw = new StringWriter();
        DateTimeFormatterBuilder.printUnknownString(sw, 2);
        Assert.assertEquals("\ufffd\ufffd", sw.toString());
    }
}