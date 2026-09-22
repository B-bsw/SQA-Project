package org.joda.time.format;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
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
import org.joda.time.chrono.ISOChronology;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DateTimeFormatterTest {

    private static class MockPrinter implements DateTimePrinter {
        private final int length;
        private final String printResult;

        public MockPrinter(int length, String printResult) {
            this.length = length;
            this.printResult = printResult;
        }

        public int estimatePrintedLength() {
            return this.length;
        }

        public void printTo(StringBuffer buf, long instant, Chronology chrono, int displayOffset, DateTimeZone displayZone, Locale locale) {
            buf.append(this.printResult);
        }

        public void printTo(Writer out, long instant, Chronology chrono, int displayOffset, DateTimeZone displayZone, Locale locale) throws IOException {
            out.write(this.printResult);
        }

        public void printTo(StringBuffer buf, ReadablePartial partial, Locale locale) {
            buf.append(this.printResult);
        }

        public void printTo(Writer out, ReadablePartial partial, Locale locale) throws IOException {
            out.write(this.printResult);
        }
    }

    private static class MockParser implements DateTimeParser {
        private final int length;
        private final int parseResult;
        private Integer offsetIntegerToSet;
        private DateTimeZone zoneToSet;
        private Integer yearToSet;

        public MockParser(int length, int parseResult) {
            this.length = length;
            this.parseResult = parseResult;
        }

        public void setOffsetIntegerToSet(Integer offset) {
            this.offsetIntegerToSet = offset;
        }

        public void setZoneToSet(DateTimeZone zone) {
            this.zoneToSet = zone;
        }

        public void setYearToSet(Integer year) {
            this.yearToSet = year;
        }

        public int estimateParsedLength() {
            return this.length;
        }

        public int parseInto(DateTimeParserBucket bucket, String text, int position) {
            if (this.offsetIntegerToSet != null) {
                bucket.setOffset(this.offsetIntegerToSet);
            }
            if (this.zoneToSet != null) {
                bucket.setZone(this.zoneToSet);
            }
            if (this.yearToSet != null) {
                bucket.saveField(org.joda.time.DateTimeFieldType.year(), this.yearToSet.intValue());
            }
            return this.parseResult;
        }
    }

    private MockPrinter printer;
    private MockParser parser;
    private DateTimeFormatter formatter;

    @Before
    public void setUp() {
        this.printer = new MockPrinter(10, "2000-01-01");
        this.parser = new MockParser(10, 10);
        this.formatter = new DateTimeFormatter(printer, parser);
    }

    @Test
    public void constructor_givenPrinterAndParser_shouldInitializeCorrectly() {
        Assert.assertTrue(formatter.isPrinter());
        Assert.assertSame(printer, formatter.getPrinter());
        Assert.assertTrue(formatter.isParser());
        Assert.assertSame(parser, formatter.getParser());
        Assert.assertNull(formatter.getLocale());
        Assert.assertFalse(formatter.isOffsetParsed());
        Assert.assertNull(formatter.getChronology());
        Assert.assertNull(formatter.getChronolgy());
        Assert.assertNull(formatter.getZone());
        Assert.assertNull(formatter.getPivotYear());
        Assert.assertEquals(2000, formatter.getDefaultYear());
    }

    @Test
    public void isPrinter_givenNullPrinter_shouldReturnFalse() {
        DateTimeFormatter noPrinterFormatter = new DateTimeFormatter(null, parser);
        Assert.assertFalse(noPrinterFormatter.isPrinter());
        Assert.assertNull(noPrinterFormatter.getPrinter());
    }

    @Test
    public void isParser_givenNullParser_shouldReturnFalse() {
        DateTimeFormatter noParserFormatter = new DateTimeFormatter(printer, null);
        Assert.assertFalse(noParserFormatter.isParser());
        Assert.assertNull(noParserFormatter.getParser());
    }

    @Test
    public void withLocale_givenSameLocale_shouldReturnSameInstance() {
        Assert.assertSame(formatter, formatter.withLocale(null));

        DateTimeFormatter frFormatter = formatter.withLocale(Locale.FRENCH);
        Assert.assertEquals(Locale.FRENCH, frFormatter.getLocale());
        Assert.assertSame(frFormatter, frFormatter.withLocale(Locale.FRENCH));
        Assert.assertSame(frFormatter, frFormatter.withLocale(new Locale("fr")));
    }

    @Test
    public void withLocale_givenDifferentLocale_shouldReturnNewInstance() {
        DateTimeFormatter frFormatter = formatter.withLocale(Locale.FRENCH);
        Assert.assertNotSame(formatter, frFormatter);
        Assert.assertEquals(Locale.FRENCH, frFormatter.getLocale());

        DateTimeFormatter usFormatter = frFormatter.withLocale(Locale.US);
        Assert.assertNotSame(frFormatter, usFormatter);
        Assert.assertEquals(Locale.US, usFormatter.getLocale());

        DateTimeFormatter nullFormatter = usFormatter.withLocale(null);
        Assert.assertNotSame(usFormatter, nullFormatter);
        Assert.assertNull(nullFormatter.getLocale());
    }

    @Test
    public void withOffsetParsed_whenCalled_shouldToggleFlagAndClearZone() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        DateTimeFormatter zonedFormatter = formatter.withZone(zone);
        Assert.assertEquals(zone, zonedFormatter.getZone());
        Assert.assertFalse(zonedFormatter.isOffsetParsed());

        DateTimeFormatter offsetParsedFormatter = zonedFormatter.withOffsetParsed();
        Assert.assertTrue(offsetParsedFormatter.isOffsetParsed());
        Assert.assertNull(offsetParsedFormatter.getZone());
        Assert.assertSame(offsetParsedFormatter, offsetParsedFormatter.withOffsetParsed());
    }

    @Test
    public void withChronology_givenSameAndDifferentChronologies_shouldBehaveCorrectly() {
        Chronology bst = BuddhistChronology.getInstanceUTC();
        Assert.assertSame(formatter, formatter.withChronology(null));

        DateTimeFormatter bstFormatter = formatter.withChronology(bst);
        Assert.assertNotSame(formatter, bstFormatter);
        Assert.assertSame(bst, bstFormatter.getChronology());
        Assert.assertSame(bst, bstFormatter.getChronolgy());
        Assert.assertSame(bstFormatter, bstFormatter.withChronology(bst));

        DateTimeFormatter isoFormatter = bstFormatter.withChronology(ISOChronology.getInstanceUTC());
        Assert.assertNotSame(bstFormatter, isoFormatter);
        Assert.assertSame(ISOChronology.getInstanceUTC(), isoFormatter.getChronology());
    }

    @Test
    public void withZone_givenVariousZones_shouldReturnExpectedInstances() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(5);
        Assert.assertSame(formatter, formatter.withZone(null));

        DateTimeFormatter zonedFormatter = formatter.withZone(zone);
        Assert.assertNotSame(formatter, zonedFormatter);
        Assert.assertSame(zone, zonedFormatter.getZone());
        Assert.assertSame(zonedFormatter, zonedFormatter.withZone(zone));

        DateTimeFormatter utcFormatter = zonedFormatter.withZoneUTC();
        Assert.assertNotSame(zonedFormatter, utcFormatter);
        Assert.assertEquals(DateTimeZone.UTC, utcFormatter.getZone());
    }

    @Test
    public void withPivotYear_givenIntOrInteger_shouldHandleEqualityProperly() {
        Assert.assertSame(formatter, formatter.withPivotYear((Integer) null));

        DateTimeFormatter pivot2020 = formatter.withPivotYear(2020);
        Assert.assertNotSame(formatter, pivot2020);
        Assert.assertEquals(Integer.valueOf(2020), pivot2020.getPivotYear());
        Assert.assertSame(pivot2020, pivot2020.withPivotYear(2020));
        Assert.assertSame(pivot2020, pivot2020.withPivotYear(Integer.valueOf(2020)));

        DateTimeFormatter pivot2030 = pivot2020.withPivotYear(Integer.valueOf(2030));
        Assert.assertNotSame(pivot2020, pivot2030);
        Assert.assertEquals(Integer.valueOf(2030), pivot2030.getPivotYear());

        DateTimeFormatter pivotNull = pivot2030.withPivotYear((Integer) null);
        Assert.assertNotSame(pivot2030, pivotNull);
        Assert.assertNull(pivotNull.getPivotYear());
    }

    @Test
    public void withDefaultYear_givenDifferentYears_shouldUpdateDefaultYear() {
        DateTimeFormatter year1990 = formatter.withDefaultYear(1990);
        Assert.assertNotSame(formatter, year1990);
        Assert.assertEquals(1990, year1990.getDefaultYear());
    }

    @Test
    public void print_givenReadableInstant_shouldReturnPrintedString() {
        Instant instant = new Instant(0L);
        String result = formatter.print(instant);
        Assert.assertEquals("2000-01-01", result);
    }

    @Test
    public void print_givenLongInstant_shouldReturnPrintedString() {
        String result = formatter.print(123456789L);
        Assert.assertEquals("2000-01-01", result);
    }

    @Test
    public void print_givenReadablePartial_shouldReturnPrintedString() {
        LocalDate date = new LocalDate(2021, 5, 10);
        String result = formatter.print(date);
        Assert.assertEquals("2000-01-01", result);
    }

    @Test
    public void printTo_givenStringBufferAndReadableInstant_shouldAppend() {
        StringBuffer buf = new StringBuffer("Prefix:");
        formatter.printTo(buf, new Instant(1000L));
        Assert.assertEquals("Prefix:2000-01-01", buf.toString());
    }

    @Test
    public void printTo_givenWriterAndReadableInstant_shouldWrite() throws IOException {
        StringWriter writer = new StringWriter();
        formatter.printTo(writer, new Instant(1000L));
        Assert.assertEquals("2000-01-01", writer.toString());
    }

    @Test
    public void printTo_givenAppendableAndReadableInstant_shouldAppend() throws IOException {
        StringBuilder sb = new StringBuilder();
        formatter.printTo((Appendable) sb, new Instant(1000L));
        Assert.assertEquals("2000-01-01", sb.toString());
    }

    @Test
    public void printTo_givenStringBufferAndLong_shouldAppend() {
        StringBuffer buf = new StringBuffer("Val=");
        formatter.printTo(buf, 1000L);
        Assert.assertEquals("Val=2000-01-01", buf.toString());
    }

    @Test
    public void printTo_givenWriterAndLong_shouldWrite() throws IOException {
        CharArrayWriter writer = new CharArrayWriter();
        formatter.printTo((Writer) writer, 1000L);
        Assert.assertEquals("2000-01-01", writer.toString());
    }

    @Test
    public void printTo_givenAppendableAndLong_shouldAppend() throws IOException {
        StringBuffer sb = new StringBuffer();
        formatter.printTo((Appendable) sb, 1000L);
        Assert.assertEquals("2000-01-01", sb.toString());
    }

    @Test
    public void printTo_givenStringBufferAndReadablePartial_shouldAppend() {
        StringBuffer buf = new StringBuffer();
        formatter.printTo(buf, new LocalTime(12, 0));
        Assert.assertEquals("2000-01-01", buf.toString());
    }

    @Test
    public void printTo_givenWriterAndReadablePartial_shouldWrite() throws IOException {
        StringWriter writer = new StringWriter();
        formatter.printTo(writer, new LocalTime(12, 0));
        Assert.assertEquals("2000-01-01", writer.toString());
    }

    @Test
    public void printTo_givenAppendableAndReadablePartial_shouldAppend() throws IOException {
        StringBuilder sb = new StringBuilder();
        formatter.printTo((Appendable) sb, new LocalTime(12, 0));
        Assert.assertEquals("2000-01-01", sb.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void printTo_givenNullPartialToStringBuffer_shouldThrowIllegalArgumentException() {
        formatter.printTo(new StringBuffer(), (ReadablePartial) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void printTo_givenNullPartialToWriter_shouldThrowIllegalArgumentException() throws IOException {
        formatter.printTo(new StringWriter(), (ReadablePartial) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void print_givenNullPartial_shouldThrowIllegalArgumentException() {
        formatter.print((ReadablePartial) null);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void print_whenNoPrinterConfigured_shouldThrowUnsupportedOperationException() {
        DateTimeFormatter noPrinter = new DateTimeFormatter(null, parser);
        noPrinter.print(0L);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void printPartial_whenNoPrinterConfigured_shouldThrowUnsupportedOperationException() {
        DateTimeFormatter noPrinter = new DateTimeFormatter(null, parser);
        noPrinter.print(new LocalDate());
    }

    @Test
    public void printTo_whenArithmeticOverflowOccurs_shouldFallbackToUTC() {
        DateTimeZone plusTwoZone = DateTimeZone.forOffsetHours(2);
        DateTimeFormatter zonedFormatter = formatter.withZone(plusTwoZone);
        StringBuffer buf = new StringBuffer();
        zonedFormatter.printTo(buf, Long.MAX_VALUE);
        Assert.assertEquals("2000-01-01", buf.toString());

        StringWriter writer = new StringWriter();
        try {
            zonedFormatter.printTo((Writer) writer, Long.MAX_VALUE);
            Assert.assertEquals("2000-01-01", writer.toString());
        } catch (IOException e) {
            Assert.fail("Unexpected IOException: " + e.getMessage());
        }
    }

    @Test
    public void printTo_whenFormatterHasCustomChronologyAndZone_shouldApplyThem() {
        DateTimeFormatter customized = formatter.withChronology(ISOChronology.getInstanceUTC())
                                                .withZone(DateTimeZone.forOffsetHours(3));
        StringBuffer buf = new StringBuffer();
        customized.printTo(buf, 0L);
        Assert.assertEquals("2000-01-01", buf.toString());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void parseMillis_whenNoParserConfigured_shouldThrowUnsupportedOperationException() {
        DateTimeFormatter noParser = new DateTimeFormatter(printer, null);
        noParser.parseMillis("2000-01-01");
    }

    @Test
    public void parseMillis_givenValidText_shouldReturnParsedMillis() {
        long result = formatter.parseMillis("2000-01-01");
        Assert.assertEquals(0L, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseMillis_givenIncompleteMatch_shouldThrowIllegalArgumentException() {
        MockParser shortParser = new MockParser(5, 5);
        DateTimeFormatter f = new DateTimeFormatter(printer, shortParser);
        f.parseMillis("2000-01-01");
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseMillis_givenNegativeParsePosition_shouldThrowIllegalArgumentException() {
        MockParser failingParser = new MockParser(10, ~2);
        DateTimeFormatter f = new DateTimeFormatter(printer, failingParser);
        f.parseMillis("2000-01-01");
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseInto_givenNullInstant_shouldThrowIllegalArgumentException() {
        formatter.parseInto(null, "2000-01-01", 0);
    }

    @Test
    public void parseInto_givenReadWritableInstant_shouldSetParsedValues() {
        MutableDateTime mdt = new MutableDateTime(0L, DateTimeZone.UTC);
        int pos = formatter.parseInto(mdt, "2000-01-01", 0);
        Assert.assertEquals(10, pos);
        Assert.assertEquals(0L, mdt.getMillis());
    }

    @Test
    public void parseInto_givenOffsetParsedAndOffsetInBucket_shouldUpdateChronologyZone() {
        parser.setOffsetInteger(Integer.valueOf(3600000));
        DateTimeFormatter offsetFormatter = formatter.withOffsetParsed();
        MutableDateTime mdt = new MutableDateTime(0L, DateTimeZone.UTC);
        offsetFormatter.parseInto(mdt, "2000-01-01", 0);
        Assert.assertEquals(DateTimeZone.forOffsetMillis(3600000), mdt.getChronology().getZone());
    }

    @Test
    public void parseInto_givenZoneInBucketWithoutOffsetParsed_shouldUpdateChronologyZone() {
        DateTimeZone customZone = DateTimeZone.forOffsetHours(4);
        parser.setZoneToSet(customZone);
        MutableDateTime mdt = new MutableDateTime(0L, DateTimeZone.UTC);
        formatter.parseInto(mdt, "2000-01-01", 0);
        Assert.assertEquals(customZone, mdt.getChronology().getZone());
    }

    @Test
    public void parseInto_givenFormatterWithZone_shouldEnforceZoneOnInstant() {
        DateTimeZone targetZone = DateTimeZone.forOffsetHours(-5);
        DateTimeFormatter zonedFormatter = formatter.withZone(targetZone);
        MutableDateTime mdt = new MutableDateTime(0L, DateTimeZone.UTC);
        zonedFormatter.parseInto(mdt, "2000-01-01", 0);
        Assert.assertEquals(targetZone, mdt.getZone());
    }

    @Test
    public void parseLocalDate_givenValidText_shouldReturnCorrectDate() {
        parser.setYearToSet(Integer.valueOf(2022));
        LocalDate date = formatter.parseLocalDate("2000-01-01");
        Assert.assertNotNull(date);
        Assert.assertEquals(2022, date.getYear());
    }

    @Test
    public void parseLocalTime_givenValidText_shouldReturnCorrectTime() {
        LocalTime time = formatter.parseLocalTime("2000-01-01");
        Assert.assertNotNull(time);
    }

    @Test
    public void parseLocalDateTime_givenOffsetInBucket_shouldApplyOffsetZone() {
        parser.setOffsetInteger(Integer.valueOf(7200000));
        LocalDateTime ldt = formatter.parseLocalDateTime("2000-01-01");
        Assert.assertNotNull(ldt);
        Assert.assertEquals(DateTimeZone.forOffsetMillis(7200000), ldt.getChronology().getZone());
    }

    @Test
    public void parseLocalDateTime_givenZoneInBucket_shouldApplyZone() {
        DateTimeZone tokyo = DateTimeZone.forOffsetHours(9);
        parser.setZoneToSet(tokyo);
        LocalDateTime ldt = formatter.parseLocalDateTime("2000-01-01");
        Assert.assertNotNull(ldt);
        Assert.assertEquals(tokyo, ldt.getChronology().getZone());
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseLocalDateTime_givenIncompleteParse_shouldThrowIllegalArgumentException() {
        MockParser shortParser = new MockParser(5, 3);
        DateTimeFormatter f = new DateTimeFormatter(printer, shortParser);
        f.parseLocalDateTime("2000-01-01");
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseLocalDateTime_givenNegativeParsePos_shouldThrowIllegalArgumentException() {
        MockParser negParser = new MockParser(10, -1);
        DateTimeFormatter f = new DateTimeFormatter(printer, negParser);
        f.parseLocalDateTime("2000-01-01");
    }

    @Test
    public void parseDateTime_givenValidText_shouldReturnDateTime() {
        DateTime dt = formatter.parseDateTime("2000-01-01");
        Assert.assertNotNull(dt);
        Assert.assertEquals(0L, dt.getMillis());
    }

    @Test
    public void parseDateTime_givenOffsetParsedAndOffsetInBucket_shouldSetOffsetZone() {
        parser.setOffsetInteger(Integer.valueOf(10800000));
        DateTimeFormatter offsetFormatter = formatter.withOffsetParsed();
        DateTime dt = offsetFormatter.parseDateTime("2000-01-01");
        Assert.assertEquals(DateTimeZone.forOffsetMillis(10800000), dt.getZone());
    }

    @Test
    public void parseDateTime_givenZoneInBucketWithoutOffsetParsed_shouldSetZone() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(-3);
        parser.setZoneToSet(zone);
        DateTime dt = formatter.parseDateTime("2000-01-01");
        Assert.assertEquals(zone, dt.getZone());
    }

    @Test
    public void parseDateTime_givenFormatterZone_shouldApplyZoneOverride() {
        DateTimeZone formatterZone = DateTimeZone.forOffsetHours(7);
        DateTimeFormatter zonedFormatter = formatter.withZone(formatterZone);
        DateTime dt = zonedFormatter.parseDateTime("2000-01-01");
        Assert.assertEquals(formatterZone, dt.getZone());
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseDateTime_givenIncompleteParse_shouldThrowIllegalArgumentException() {
        MockParser shortParser = new MockParser(5, 2);
        DateTimeFormatter f = new DateTimeFormatter(printer, shortParser);
        f.parseDateTime("2000-01-01");
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseDateTime_givenNegativePos_shouldThrowIllegalArgumentException() {
        MockParser negParser = new MockParser(10, ~0);
        DateTimeFormatter f = new DateTimeFormatter(printer, negParser);
        f.parseDateTime("2000-01-01");
    }

    @Test
    public void parseMutableDateTime_givenValidText_shouldReturnMutableDateTime() {
        MutableDateTime mdt = formatter.parseMutableDateTime("2000-01-01");
        Assert.assertNotNull(mdt);
        Assert.assertEquals(0L, mdt.getMillis());
    }

    @Test
    public void parseMutableDateTime_givenOffsetParsedAndOffsetInBucket_shouldSetOffsetZone() {
        parser.setOffsetInteger(Integer.valueOf(-14400000));
        DateTimeFormatter offsetFormatter = formatter.withOffsetParsed();
        MutableDateTime mdt = offsetFormatter.parseMutableDateTime("2000-01-01");
        Assert.assertEquals(DateTimeZone.forOffsetMillis(-14400000), mdt.getZone());
    }

    @Test
    public void parseMutableDateTime_givenZoneInBucketWithoutOffsetParsed_shouldSetZone() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(6);
        parser.setZoneToSet(zone);
        MutableDateTime mdt = formatter.parseMutableDateTime("2000-01-01");
        Assert.assertEquals(zone, mdt.getZone());
    }

    @Test
    public void parseMutableDateTime_givenFormatterZone_shouldApplyZoneOverride() {
        DateTimeZone formatterZone = DateTimeZone.forOffsetHours(-8);
        DateTimeFormatter zonedFormatter = formatter.withZone(formatterZone);
        MutableDateTime mdt = zonedFormatter.parseMutableDateTime("2000-01-01");
        Assert.assertEquals(formatterZone, mdt.getZone());
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseMutableDateTime_givenIncompleteParse_shouldThrowIllegalArgumentException() {
        MockParser shortParser = new MockParser(5, 4);
        DateTimeFormatter f = new DateTimeFormatter(printer, shortParser);
        f.parseMutableDateTime("2000-01-01");
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseMutableDateTime_givenNegativePos_shouldThrowIllegalArgumentException() {
        MockParser negParser = new MockParser(10, ~1);
        DateTimeFormatter f = new DateTimeFormatter(printer, negParser);
        f.parseMutableDateTime("2000-01-01");
    }
}