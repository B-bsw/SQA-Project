package org.joda.time.format;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadWritableInstant;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DateTimeFormatterTest {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");

    private MockPrinter printer;
    private MockParser parser;
    private DateTimeFormatter formatter;

    @Before
    public void setUp() {
        printer = new MockPrinter();
        parser = new MockParser();
        formatter = new DateTimeFormatter(printer, parser);
    }

    // --- Constructor & Capability Tests ---

    @Test
    public void isPrinter_givenPrinterProvided_shouldReturnTrue() {
        Assert.assertTrue(formatter.isPrinter());
        Assert.assertSame(printer, formatter.getPrinter());
    }

    @Test
    public void isPrinter_givenNullPrinter_shouldReturnFalse() {
        DateTimeFormatter noPrint = new DateTimeFormatter(null, parser);
        Assert.assertFalse(noPrint.isPrinter());
        Assert.assertNull(noPrint.getPrinter());
    }

    @Test
    public void isParser_givenParserProvided_shouldReturnTrue() {
        Assert.assertTrue(formatter.isParser());
        Assert.assertSame(parser, formatter.getParser());
    }

    @Test
    public void isParser_givenNullParser_shouldReturnFalse() {
        DateTimeFormatter noParse = new DateTimeFormatter(printer, null);
        Assert.assertFalse(noParse.isParser());
        Assert.assertNull(noParse.getParser());
    }

    // --- Fluent Mutator Tests ---

    @Test
    public void withLocale_givenSameOrEqualLocale_shouldReturnSameInstance() {
        Assert.assertNull(formatter.getLocale());
        DateTimeFormatter sameNull = formatter.withLocale(null);
        Assert.assertSame(formatter, sameNull);

        DateTimeFormatter withFr = formatter.withLocale(Locale.FRENCH);
        Assert.assertEquals(Locale.FRENCH, withFr.getLocale());

        DateTimeFormatter withFrAgain = withFr.withLocale(Locale.FRENCH);
        Assert.assertSame(withFr, withFrAgain);

        DateTimeFormatter withFrNew = withFr.withLocale(new Locale("fr"));
        Assert.assertSame(withFr, withFrNew);
    }

    @Test
    public void withLocale_givenDifferentLocale_shouldReturnNewInstance() {
        DateTimeFormatter f1 = formatter.withLocale(Locale.GERMAN);
        Assert.assertNotSame(formatter, f1);
        Assert.assertEquals(Locale.GERMAN, f1.getLocale());

        DateTimeFormatter f2 = f1.withLocale(Locale.ENGLISH);
        Assert.assertNotSame(f1, f2);
        Assert.assertEquals(Locale.ENGLISH, f2.getLocale());
    }

    @Test
    public void withOffsetParsed_whenCalled_shouldToggleFlagAndResetZone() {
        Assert.assertFalse(formatter.isOffsetParsed());

        DateTimeFormatter withZone = formatter.withZone(PARIS);
        DateTimeFormatter offsetParsed = withZone.withOffsetParsed();

        Assert.assertTrue(offsetParsed.isOffsetParsed());
        Assert.assertNull(offsetParsed.getZone());

        DateTimeFormatter offsetParsedAgain = offsetParsed.withOffsetParsed();
        Assert.assertSame(offsetParsed, offsetParsedAgain);
    }

    @Test
    public void withChronology_givenSameAndDifferentChronology_shouldHandleCorrectly() {
        Assert.assertNull(formatter.getChronology());
        Assert.assertNull(formatter.getChronolgy());

        DateTimeFormatter sameNull = formatter.withChronology(null);
        Assert.assertSame(formatter, sameNull);

        Chronology chrono = BuddhistChronology.getInstance();
        DateTimeFormatter withChrono = formatter.withChronology(chrono);
        Assert.assertNotSame(formatter, withChrono);
        Assert.assertSame(chrono, withChrono.getChronology());
        Assert.assertSame(chrono, withChrono.getChronolgy());

        DateTimeFormatter withSameChrono = withChrono.withChronology(chrono);
        Assert.assertSame(withChrono, withSameChrono);
    }

    @Test
    public void withZone_givenVariousZones_shouldUpdateZoneAndResetOffsetParsed() {
        Assert.assertNull(formatter.getZone());

        DateTimeFormatter sameNull = formatter.withZone(null);
        Assert.assertSame(formatter, sameNull);

        DateTimeFormatter withUtc = formatter.withZoneUTC();
        Assert.assertEquals(DateTimeZone.UTC, withUtc.getZone());

        DateTimeFormatter withParis = formatter.withOffsetParsed().withZone(PARIS);
        Assert.assertEquals(PARIS, withParis.getZone());
        Assert.assertFalse(withParis.isOffsetParsed());

        DateTimeFormatter withParisAgain = withParis.withZone(PARIS);
        Assert.assertSame(withParis, withParisAgain);
    }

    @Test
    public void withPivotYear_givenIntegerAndInt_shouldUpdateProperly() {
        Assert.assertNull(formatter.getPivotYear());

        DateTimeFormatter sameNull = formatter.withPivotYear((Integer) null);
        Assert.assertSame(formatter, sameNull);

        DateTimeFormatter with2010 = formatter.withPivotYear(2010);
        Assert.assertEquals(Integer.valueOf(2010), with2010.getPivotYear());

        DateTimeFormatter with2010Obj = with2010.withPivotYear(new Integer(2010));
        Assert.assertSame(with2010, with2010Obj);

        DateTimeFormatter with2020 = with2010.withPivotYear(2020);
        Assert.assertNotSame(with2010, with2020);
        Assert.assertEquals(Integer.valueOf(2020), with2020.getPivotYear());
    }

    @Test
    public void withDefaultYear_givenYear_shouldUpdateDefaultYear() {
        Assert.assertEquals(2000, formatter.getDefaultYear());

        DateTimeFormatter customYear = formatter.withDefaultYear(1995);
        Assert.assertEquals(1995, customYear.getDefaultYear());
    }

    // --- Printing Unsupported Cases ---

    @Test(expected = UnsupportedOperationException.class)
    public void print_whenPrinterIsNull_shouldThrowUnsupportedOperationException() {
        DateTimeFormatter noPrint = new DateTimeFormatter(null, parser);
        noPrint.print(0L);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void printReadableInstant_whenPrinterIsNull_shouldThrowUnsupportedOperationException() {
        DateTimeFormatter noPrint = new DateTimeFormatter(null, parser);
        noPrint.print(new Instant());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void printReadablePartial_whenPrinterIsNull_shouldThrowUnsupportedOperationException() {
        DateTimeFormatter noPrint = new DateTimeFormatter(null, parser);
        noPrint.print(new LocalDate());
    }

    // --- Printing Long Instant Tests ---

    @Test
    public void print_givenMillis_shouldFormatCorrectly() {
        String result = formatter.print(123456789L);
        Assert.assertEquals("PRINTED:123456789", result);
    }

    @Test
    public void printTo_givenStringBufferAndMillis_shouldAppend() {
        StringBuffer sb = new StringBuffer("Prefix:");
        formatter.printTo(sb, 1000L);
        Assert.assertEquals("Prefix:PRINTED:1000", sb.toString());
    }

    @Test
    public void printTo_givenWriterAndMillis_shouldWrite() throws IOException {
        StringWriter sw = new StringWriter();
        formatter.printTo((Writer) sw, 2000L);
        Assert.assertEquals("PRINTED:2000", sw.toString());
    }

    @Test
    public void printTo_givenAppendableAndMillis_shouldAppend() throws IOException {
        StringBuilder sb = new StringBuilder();
        formatter.printTo((Appendable) sb, 3000L);
        Assert.assertEquals("PRINTED:3000", sb.toString());
    }

    // --- Printing ReadableInstant Tests ---

    @Test
    public void print_givenReadableInstant_shouldFormatCorrectly() {
        Instant instant = new Instant(55555L);
        String result = formatter.print(instant);
        Assert.assertEquals("PRINTED:55555", result);
    }

    @Test
    public void print_givenNullReadableInstant_shouldUseCurrentTime() {
        String result = formatter.print((ReadableInstant) null);
        Assert.assertTrue(result.startsWith("PRINTED:"));
    }

    @Test
    public void printTo_givenWriterAndReadableInstant_shouldWrite() throws IOException {
        StringWriter sw = new StringWriter();
        formatter.printTo((Writer) sw, new Instant(777L));
        Assert.assertEquals("PRINTED:777", sw.toString());
    }

    @Test
    public void printTo_givenAppendableAndReadableInstant_shouldAppend() throws IOException {
        StringBuilder sb = new StringBuilder();
        formatter.printTo((Appendable) sb, new Instant(888L));
        Assert.assertEquals("PRINTED:888", sb.toString());
    }

    // --- Printing ReadablePartial Tests ---

    @Test
    public void print_givenReadablePartial_shouldFormatCorrectly() {
        LocalDate date = new LocalDate(2021, 5, 20);
        String result = formatter.print(date);
        Assert.assertEquals("PARTIAL:2021-05-20", result);
    }

    @Test
    public void printTo_givenStringBufferAndPartial_shouldAppend() {
        StringBuffer sb = new StringBuffer("Date=");
        LocalDate date = new LocalDate(2021, 5, 20);
        formatter.printTo(sb, date);
        Assert.assertEquals("Date=PARTIAL:2021-05-20", sb.toString());
    }

    @Test
    public void printTo_givenWriterAndPartial_shouldWrite() throws IOException {
        StringWriter sw = new StringWriter();
        LocalDate date = new LocalDate(2021, 5, 20);
        formatter.printTo((Writer) sw, date);
        Assert.assertEquals("PARTIAL:2021-05-20", sw.toString());
    }

    @Test
    public void printTo_givenAppendableAndPartial_shouldAppend() throws IOException {
        StringBuilder sb = new StringBuilder();
        LocalDate date = new LocalDate(2021, 5, 20);
        formatter.printTo((Appendable) sb, date);
        Assert.assertEquals("PARTIAL:2021-05-20", sb.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void printTo_givenNullPartialAndStringBuffer_shouldThrowIllegalArgumentException() {
        formatter.printTo(new StringBuffer(), (ReadablePartial) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void printTo_givenNullPartialAndWriter_shouldThrowIllegalArgumentException() throws IOException {
        formatter.printTo(new StringWriter(), (ReadablePartial) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void print_givenNullPartial_shouldThrowIllegalArgumentException() {
        formatter.print((ReadablePartial) null);
    }

    // --- Overflow Edge Cases in printTo ---

    @Test
    public void printTo_givenPositiveOverflowInstant_shouldFallbackToUTC() {
        DateTimeZone zoneWithPositiveOffset = DateTimeZone.forOffsetHours(5);
        DateTimeFormatter fmt = formatter.withZone(zoneWithPositiveOffset);

        long nearMax = Long.MAX_VALUE - 1000L;
        StringBuffer sb = new StringBuffer();
        fmt.printTo(sb, nearMax);

        Assert.assertEquals(DateTimeZone.UTC, printer.lastZone);
        Assert.assertEquals(0, printer.lastOffset);
        Assert.assertEquals(nearMax, printer.lastAdjustedInstant);
    }

    @Test
    public void printToWriter_givenNegativeOverflowInstant_shouldFallbackToUTC() throws IOException {
        DateTimeZone zoneWithNegativeOffset = DateTimeZone.forOffsetHours(-5);
        DateTimeFormatter fmt = formatter.withZone(zoneWithNegativeOffset);

        long nearMin = Long.MIN_VALUE + 1000L;
        StringWriter sw = new StringWriter();
        fmt.printTo((Writer) sw, nearMin);

        Assert.assertEquals(DateTimeZone.UTC, printer.lastZone);
        Assert.assertEquals(0, printer.lastOffset);
        Assert.assertEquals(nearMin, printer.lastAdjustedInstant);
    }

    // --- Parsing Unsupported Cases ---

    @Test(expected = UnsupportedOperationException.class)
    public void parseMillis_whenParserIsNull_shouldThrowUnsupportedOperationException() {
        DateTimeFormatter noParse = new DateTimeFormatter(printer, null);
        noParse.parseMillis("2020-01-01");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void parseInto_whenParserIsNull_shouldThrowUnsupportedOperationException() {
        DateTimeFormatter noParse = new DateTimeFormatter(printer, null);
        noParse.parseInto(new MutableDateTime(), "2020-01-01", 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseInto_givenNullInstant_shouldThrowIllegalArgumentException() {
        formatter.parseInto(null, "2020-01-01", 0);
    }

    // --- parseInto Tests ---

    @Test
    public void parseInto_givenValidText_shouldMutateInstant() {
        parser.parsedMillis = 1234567890L;
        parser.returnPosition = 10;

        MutableDateTime mdt = new MutableDateTime(0L, DateTimeZone.UTC);
        int pos = formatter.parseInto(mdt, "2020-01-01", 0);

        Assert.assertEquals(10, pos);
        Assert.assertEquals(1234567890L, mdt.getMillis());
    }

    @Test
    public void parseInto_givenOffsetParsedAndParsedOffset_shouldApplyParsedZone() {
        parser.parsedMillis = 1000L;
        parser.returnPosition = 6;
        parser.offsetInteger = Integer.valueOf(7200000); // +02:00

        DateTimeFormatter offsetFmt = formatter.withOffsetParsed();
        MutableDateTime mdt = new MutableDateTime(0L, DateTimeZone.UTC);
        int pos = offsetFmt.parseInto(mdt, "+02:00", 0);

        Assert.assertEquals(6, pos);
        Assert.assertEquals(DateTimeZone.forOffsetHours(2), mdt.getZone());
    }

    @Test
    public void parseInto_givenBucketZone_shouldApplyBucketZone() {
        parser.parsedMillis = 2000L;
        parser.returnPosition = 5;
        parser.bucketZone = TOKYO;

        MutableDateTime mdt = new MutableDateTime(0L, DateTimeZone.UTC);
        formatter.parseInto(mdt, "TOKYO", 0);

        Assert.assertEquals(TOKYO, mdt.getZone());
    }

    @Test
    public void parseInto_givenFormatterZone_shouldOverrideInstantZone() {
        parser.parsedMillis = 3000L;
        parser.returnPosition = 4;

        DateTimeFormatter zonedFmt = formatter.withZone(LONDON);
        MutableDateTime mdt = new MutableDateTime(0L, DateTimeZone.UTC);
        zonedFmt.parseInto(mdt, "TEST", 0);

        Assert.assertEquals(LONDON, mdt.getZone());
    }

    // --- parseMillis Tests ---

    @Test
    public void parseMillis_givenValidFullMatch_shouldReturnMillis() {
        parser.parsedMillis = 9876543210L;
        parser.returnPosition = 10;

        long millis = formatter.parseMillis("2020-01-01");
        Assert.assertEquals(9876543210L, millis);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseMillis_givenPartialMatch_shouldThrowIllegalArgumentException() {
        parser.parsedMillis = 1000L;
        parser.returnPosition = 4; // text has length 10

        formatter.parseMillis("2020-01-01");
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseMillis_givenNegativePosition_shouldThrowIllegalArgumentException() {
        parser.returnPosition = ~3; // Error at index 3

        formatter.parseMillis("2020-01-01");
    }

    // --- parseLocalDate & parseLocalTime Tests ---

    @Test
    public void parseLocalDate_givenValidText_shouldReturnLocalDate() {
        parser.parsedMillis = 1577836800000L; // 2020-01-01 UTC
        parser.returnPosition = 10;

        LocalDate date = formatter.parseLocalDate("2020-01-01");
        Assert.assertEquals(2020, date.getYear());
        Assert.assertEquals(1, date.getMonthOfYear());
        Assert.assertEquals(1, date.getDayOfMonth());
    }

    @Test
    public void parseLocalTime_givenValidText_shouldReturnLocalTime() {
        // 14:30:15 UTC -> 14*3600 + 30*60 + 15 = 52215 seconds = 52215000 millis
        parser.parsedMillis = 52215000L;
        parser.returnPosition = 8;

        LocalTime time = formatter.parseLocalTime("14:30:15");
        Assert.assertEquals(14, time.getHourOfDay());
        Assert.assertEquals(30, time.getMinuteOfHour());
        Assert.assertEquals(15, time.getSecondOfMinute());
    }

    // --- parseLocalDateTime Tests ---

    @Test
    public void parseLocalDateTime_givenValidTextWithBucketZone_shouldApplyZone() {
        parser.parsedMillis = 0L;
        parser.returnPosition = 5;
        parser.bucketZone = PARIS;

        LocalDateTime dt = formatter.parseLocalDateTime("12345");
        Assert.assertEquals(PARIS, dt.getChronology().getZone());
    }

    @Test
    public void parseLocalDateTime_givenValidTextWithOffset_shouldApplyOffsetZone() {
        parser.parsedMillis = 0L;
        parser.returnPosition = 5;
        parser.offsetInteger = Integer.valueOf(3600000);

        LocalDateTime dt = formatter.parseLocalDateTime("12345");
        Assert.assertEquals(DateTimeZone.forOffsetHours(1), dt.getChronology().getZone());
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseLocalDateTime_givenIncompleteMatch_shouldThrowIllegalArgumentException() {
        parser.returnPosition = 2;
        formatter.parseLocalDateTime("12345");
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseLocalDateTime_givenParseError_shouldThrowIllegalArgumentException() {
        parser.returnPosition = ~1;
        formatter.parseLocalDateTime("12345");
    }

    // --- parseDateTime Tests ---

    @Test
    public void parseDateTime_givenValidFullMatch_shouldReturnDateTime() {
        parser.parsedMillis = 100000L;
        parser.returnPosition = 4;

        DateTime dt = formatter.parseDateTime("2020");
        Assert.assertEquals(100000L, dt.getMillis());
    }

    @Test
    public void parseDateTime_givenOffsetParsedAndOffset_shouldSetZone() {
        parser.parsedMillis = 100000L;
        parser.returnPosition = 5;
        parser.offsetInteger = Integer.valueOf(3600000);

        DateTimeFormatter fmt = formatter.withOffsetParsed();
        DateTime dt = fmt.parseDateTime("12345");

        Assert.assertEquals(DateTimeZone.forOffsetHours(1), dt.getZone());
    }

    @Test
    public void parseDateTime_givenBucketZone_shouldSetZone() {
        parser.parsedMillis = 100000L;
        parser.returnPosition = 5;
        parser.bucketZone = TOKYO;

        DateTime dt = formatter.parseDateTime("12345");
        Assert.assertEquals(TOKYO, dt.getZone());
    }

    @Test
    public void parseDateTime_givenFormatterZone_shouldOverrideZone() {
        parser.parsedMillis = 100000L;
        parser.returnPosition = 5;
        parser.bucketZone = TOKYO;

        DateTimeFormatter fmt = formatter.withZone(LONDON);
        DateTime dt = fmt.parseDateTime("12345");

        Assert.assertEquals(LONDON, dt.getZone());
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseDateTime_givenPartialMatch_shouldThrowIllegalArgumentException() {
        parser.returnPosition = 2;
        formatter.parseDateTime("12345");
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseDateTime_givenNegativeMatch_shouldThrowIllegalArgumentException() {
        parser.returnPosition = ~0;
        formatter.parseDateTime("12345");
    }

    // --- parseMutableDateTime Tests ---

    @Test
    public void parseMutableDateTime_givenValidFullMatch_shouldReturnMutableDateTime() {
        parser.parsedMillis = 123456L;
        parser.returnPosition = 4;

        MutableDateTime mdt = formatter.parseMutableDateTime("2020");
        Assert.assertEquals(123456L, mdt.getMillis());
    }

    @Test
    public void parseMutableDateTime_givenOffsetParsedAndOffset_shouldSetZone() {
        parser.parsedMillis = 123456L;
        parser.returnPosition = 5;
        parser.offsetInteger = Integer.valueOf(7200000);

        DateTimeFormatter fmt = formatter.withOffsetParsed();
        MutableDateTime mdt = fmt.parseMutableDateTime("12345");

        Assert.assertEquals(DateTimeZone.forOffsetHours(2), mdt.getZone());
    }

    @Test
    public void parseMutableDateTime_givenBucketZone_shouldSetZone() {
        parser.parsedMillis = 123456L;
        parser.returnPosition = 5;
        parser.bucketZone = PARIS;

        MutableDateTime mdt = formatter.parseMutableDateTime("12345");
        Assert.assertEquals(PARIS, mdt.getZone());
    }

    @Test
    public void parseMutableDateTime_givenFormatterZone_shouldSetZone() {
        parser.parsedMillis = 123456L;
        parser.returnPosition = 5;

        DateTimeFormatter fmt = formatter.withZone(PARIS);
        MutableDateTime mdt = fmt.parseMutableDateTime("12345");

        Assert.assertEquals(PARIS, mdt.getZone());
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseMutableDateTime_givenPartialMatch_shouldThrowIllegalArgumentException() {
        parser.returnPosition = 3;
        formatter.parseMutableDateTime("12345");
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseMutableDateTime_givenParseError_shouldThrowIllegalArgumentException() {
        parser.returnPosition = ~2;
        formatter.parseMutableDateTime("12345");
    }

    // --- Chronology Selection Branch Tests ---

    @Test
    public void selectChronology_whenFormatterHasChronoAndZone_shouldCombineProperly() {
        Chronology coptic = CopticChronology.getInstanceUTC();
        DateTimeFormatter fmt = formatter.withChronology(coptic).withZone(PARIS);

        fmt.print(1000L);
        Assert.assertEquals(PARIS, printer.lastZone);
    }

    // --- Mock Classes for Testing ---

    private static class MockPrinter implements DateTimePrinter {
        long lastAdjustedInstant;
        Chronology lastChrono;
        int lastOffset;
        DateTimeZone lastZone;
        Locale lastLocale;

        public int estimatePrintedLength() {
            return 32;
        }

        public void printTo(StringBuffer buf, long instant, Chronology chrono,
                            int displayOffset, DateTimeZone displayZone, Locale locale) {
            this.lastAdjustedInstant = instant;
            this.lastChrono = chrono;
            this.lastOffset = displayOffset;
            this.lastZone = displayZone;
            this.lastLocale = locale;
            buf.append("PRINTED:").append(instant);
        }

        public void printTo(Writer out, long instant, Chronology chrono,
                            int displayOffset, DateTimeZone displayZone, Locale locale) throws IOException {
            this.lastAdjustedInstant = instant;
            this.lastChrono = chrono;
            this.lastOffset = displayOffset;
            this.lastZone = displayZone;
            this.lastLocale = locale;
            out.write("PRINTED:" + instant);
        }

        public void printTo(StringBuffer buf, ReadablePartial partial, Locale locale) {
            this.lastLocale = locale;
            buf.append("PARTIAL:").append(partial.toString());
        }

        public void printTo(Writer out, ReadablePartial partial, Locale locale) throws IOException {
            this.lastLocale = locale;
            out.write("PARTIAL:" + partial.toString());
        }
    }

    private static class MockParser implements DateTimeParser {
        int returnPosition = 0;
        long parsedMillis = 0L;
        Integer offsetInteger = null;
        DateTimeZone bucketZone = null;

        public int estimateParsedLength() {
            return 32;
        }

        public int parseInto(DateTimeParserBucket bucket, String text, int position) {
            if (offsetInteger != null) {
                bucket.setOffset(offsetInteger);
            }
            if (bucketZone != null) {
                bucket.setZone(bucketZone);
            }
            if (returnPosition >= 0) {
                bucket.saveField(DateTimeFieldType.millisOfSecond(), (int) (parsedMillis % 1000));
            }
            return returnPosition;
        }
    }
}