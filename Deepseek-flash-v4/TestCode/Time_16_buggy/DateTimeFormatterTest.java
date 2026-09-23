package org.joda.time.format;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadWritableInstant;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.ISOChronology;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Locale;

public class DateTimeFormatterTest {
    private DateTimeFormatter formatter;
    private final DateTimeZone originalZone = DateTimeZone.getDefault();
    private final Locale originalLocale = Locale.getDefault();

    @Before
    public void setUp() {
        DateTimeZone.setDefault(DateTimeZone.UTC);
        Locale.setDefault(Locale.US);
        formatter = new DateTimeFormatter(null, null);
    }

    @After
    public void tearDown() {
        DateTimeZone.setDefault(originalZone);
        Locale.setDefault(originalLocale);
    }

    private static class TestPrinter implements DateTimePrinter {
        public int estimatePrintedLength() { return 10; }
        public void printTo(StringBuffer buf, long instant, Chronology chrono, int displayOffset, DateTimeZone zone, Locale locale) {
            buf.append("PRINTED:" + instant);
        }
        public void printTo(Writer out, long instant, Chronology chrono, int displayOffset, DateTimeZone zone, Locale locale) throws IOException {
            out.write("PRINTED:" + instant);
        }
        public void printTo(StringBuffer buf, ReadablePartial partial, Locale locale) {
            buf.append("PRINTED_PARTIAL");
        }
        public void printTo(Writer out, ReadablePartial partial, Locale locale) throws IOException {
            out.write("PRINTED_PARTIAL");
        }
    }

    private static class TestParser implements DateTimeParser {
        public int estimateParsedLength() { return 10; }
        public int parseInto(DateTimeParserBucket bucket, String text, int position) {
            if (text == null || position < 0 || position > text.length()) return ~position;
            if (text.equals("FAIL")) return ~position;
            bucket.computeMillis(true, text);
            return text.length();
        }
    }

    @Test
    public void testConstructorWithNullPrinterAndParser() {
        assertFalse(formatter.isPrinter());
        assertFalse(formatter.isParser());
        assertNull(formatter.getPrinter());
        assertNull(formatter.getParser());
        assertNull(formatter.getLocale());
        assertNull(formatter.getChronology());
        assertNull(formatter.getZone());
        assertNull(formatter.getPivotYear());
        assertEquals(2000, formatter.getDefaultYear());
        assertFalse(formatter.isOffsetParsed());
    }

    @Test
    public void testIsPrinterAndIsParser() {
        assertFalse(formatter.isPrinter());
        assertFalse(formatter.isParser());
        DateTimeFormatter printerOnly = new DateTimeFormatter(new TestPrinter(), null);
        assertTrue(printerOnly.isPrinter());
        assertFalse(printerOnly.isParser());
        DateTimeFormatter parserOnly = new DateTimeFormatter(null, new TestParser());
        assertFalse(parserOnly.isPrinter());
        assertTrue(parserOnly.isParser());
    }

    @Test
    public void testWithLocale() {
        assertSame(formatter, formatter.withLocale(null));
        Locale locale = Locale.FRANCE;
        DateTimeFormatter changed = formatter.withLocale(locale);
        assertNotSame(formatter, changed);
        assertEquals(locale, changed.getLocale());
        assertSame(changed, changed.withLocale(locale));
    }

    @Test
    public void testWithOffsetParsed() {
        assertFalse(formatter.isOffsetParsed());
        DateTimeFormatter changed = formatter.withOffsetParsed();
        assertTrue(changed.isOffsetParsed());
        assertNotSame(formatter, changed);
        assertSame(changed, changed.withOffsetParsed());
    }

    @Test
    public void testWithChronology() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        assertSame(formatter, formatter.withChronology(null));
        DateTimeFormatter changed = formatter.withChronology(chrono);
        assertNotSame(formatter, changed);
        assertSame(chrono, changed.getChronology());
        assertSame(changed, changed.withChronology(chrono));
    }

    @Test
    public void testWithZoneUTC() {
        DateTimeFormatter utc = formatter.withZoneUTC();
        assertEquals(DateTimeZone.UTC, utc.getZone());
        assertNotNull(utc);
    }

    @Test
    public void testWithZone() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        assertSame(formatter, formatter.withZone(null));
        DateTimeFormatter changed = formatter.withZone(zone);
        assertNotSame(formatter, changed);
        assertEquals(zone, changed.getZone());
        assertSame(changed, changed.withZone(zone));
    }

    @Test
    public void testWithPivotYear() {
        Integer pivot = Integer.valueOf(2020);
        assertSame(formatter, formatter.withPivotYear((Integer) null));
        DateTimeFormatter changed = formatter.withPivotYear(pivot);
        assertNotSame(formatter, changed);
        assertEquals(pivot, changed.getPivotYear());
        assertSame(changed, changed.withPivotYear(pivot));
        assertNull(formatter.getPivotYear());
        assertEquals(pivot, formatter.withPivotYear(2020).getPivotYear());
    }

    @Test
    public void testWithDefaultYear() {
        DateTimeFormatter changed = formatter.withDefaultYear(1990);
        assertNotSame(formatter, changed);
        assertEquals(1990, changed.getDefaultYear());
        assertEquals(2000, formatter.getDefaultYear());
    }

    @Test
    public void testPrintToReadableInstant() {
        DateTimeFormatter printer = new DateTimeFormatter(new TestPrinter(), null);
        StringBuffer buf = new StringBuffer();
        printer.printTo(buf, (ReadableInstant) null);
        assertTrue(buf.length() > 0);
    }

    @Test
    public void testPrintToWriterReadableInstant() throws IOException {
        DateTimeFormatter printer = new DateTimeFormatter(new TestPrinter(), null);
        StringWriter writer = new StringWriter();
        printer.printTo(writer, (ReadableInstant) null);
        assertTrue(writer.toString().length() > 0);
    }

    @Test
    public void testPrintToAppendableReadableInstant() throws IOException {
        DateTimeFormatter printer = new DateTimeFormatter(new TestPrinter(), null);
        StringBuilder sb = new StringBuilder();
        printer.printTo((Appendable) sb, (ReadableInstant) null);
        assertTrue(sb.length() > 0);
    }

    @Test
    public void testPrintToLong() {
        DateTimeFormatter printer = new DateTimeFormatter(new TestPrinter(), null);
        StringBuffer buf = new StringBuffer();
        printer.printTo(buf, 0L);
        assertTrue(buf.length() > 0);
    }

    @Test
    public void testPrintToWriterLong() throws IOException {
        DateTimeFormatter printer = new DateTimeFormatter(new TestPrinter(), null);
        StringWriter writer = new StringWriter();
        printer.printTo(writer, 0L);
        assertTrue(writer.toString().length() > 0);
    }

    @Test
    public void testPrintToAppendableLong() throws IOException {
        DateTimeFormatter printer = new DateTimeFormatter(new TestPrinter(), null);
        StringBuilder sb = new StringBuilder();
        printer.printTo((Appendable) sb, 0L);
        assertTrue(sb.length() > 0);
    }

    @Test
    public void testPrintToReadablePartial() {
        DateTimeFormatter printer = new DateTimeFormatter(new TestPrinter(), null);
        StringBuffer buf = new StringBuffer();
        printer.printTo(buf, (ReadablePartial) null);
        assertEquals(0, buf.length());
    }

    @Test
    public void testPrintToWriterReadablePartial() throws IOException {
        DateTimeFormatter printer = new DateTimeFormatter(new TestPrinter(), null);
        StringWriter writer = new StringWriter();
        printer.printTo(writer, (ReadablePartial) null);
        assertEquals(0, writer.toString().length());
    }

    @Test
    public void testPrintToAppendableReadablePartial() throws IOException {
        DateTimeFormatter printer = new DateTimeFormatter(new TestPrinter(), null);
        StringBuilder sb = new StringBuilder();
        printer.printTo((Appendable) sb, (ReadablePartial) null);
        assertEquals(0, sb.length());
    }

    @Test
    public void testPrintReadableInstant() {
        DateTimeFormatter printer = new DateTimeFormatter(new TestPrinter(), null);
        String result = printer.print((ReadableInstant) null);
        assertNotNull(result);
        assertTrue(result.length() > 0);
    }

    @Test
    public void testPrintLong() {
        DateTimeFormatter printer = new DateTimeFormatter(new TestPrinter(), null);
        String result = printer.print(123456789L);
        assertNotNull(result);
    }

    @Test
    public void testPrintWithNullPartial() {
        DateTimeFormatter printer = new DateTimeFormatter(new TestPrinter(), null);
        String result = printer.print((ReadablePartial) null);
        assertNotNull(result);
    }

    @Test
    public void testParseIntoWithNullInstant() {
        DateTimeFormatter parser = new DateTimeFormatter(null, new TestParser());
        try {
            parser.parseInto(null, "text", 0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Instant must not be null", e.getMessage());
        }
    }

    @Test
    public void testParseIntoWithValidInstant() {
        DateTimeFormatter parser = new DateTimeFormatter(null, new TestParser());
        MutableDateTime mdt = new MutableDateTime(0L);
        int pos = parser.parseInto(mdt, "test", 0);
        assertEquals(4, pos);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testParseIntoWithNullParser() {
        formatter.parseInto(new MutableDateTime(0L), "text", 0);
    }

    @Test
    public void testParseMillis() {
        DateTimeFormatter parser = new DateTimeFormatter(null, new TestParser());
        long millis = parser.parseMillis("test");
        assertTrue(millis >= 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseMillisWithNullText() {
        DateTimeFormatter parser = new DateTimeFormatter(null, new TestParser());
        parser.parseMillis(null);
    }

    @Test
    public void testParseLocalDateTime() {
        DateTimeFormatter parser = new DateTimeFormatter(null, new TestParser());
        LocalDateTime ldt = parser.parseLocalDateTime("test");
        assertNotNull(ldt);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testParseLocalDateTimeWithNoParser() {
        formatter.parseLocalDateTime("test");
    }

    @Test
    public void testParseLocalDate() {
        DateTimeFormatter parser = new DateTimeFormatter(null, new TestParser());
        LocalDate ld = parser.parseLocalDate("test");
        assertNotNull(ld);
    }

    @Test
    public void testParseLocalTime() {
        DateTimeFormatter parser = new DateTimeFormatter(null, new TestParser());
        LocalTime lt = parser.parseLocalTime("test");
        assertNotNull(lt);
    }

    @Test
    public void testParseDateTime() {
        DateTimeFormatter parser = new DateTimeFormatter(null, new TestParser());
        DateTime dt = parser.parseDateTime("test");
        assertNotNull(dt);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testParseDateTimeWithNoParser() {
        formatter.parseDateTime("test");
    }

    @Test
    public void testParseMutableDateTime() {
        DateTimeFormatter parser = new DateTimeFormatter(null, new TestParser());
        MutableDateTime mdt = parser.parseMutableDateTime("test");
        assertNotNull(mdt);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testParseMutableDateTimeWithNoParser() {
        formatter.parseMutableDateTime("test");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testRequirePrinterWhenNull() {
        formatter.print(0L);
    }

    @Test
    public void testRequirePrinterWhenNotNull() {
        DateTimeFormatter printer = new DateTimeFormatter(new TestPrinter(), null);
        String result = printer.print(0L);
        assertNotNull(result);
    }

    @Test
    public void testSelectChronology() {
        Chronology chrono = ISOChronology.getInstance();
        Chronology selected = formatter.selectChronology(chrono);
        assertNotNull(selected);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintToReadablePartialWithNull() {
        DateTimeFormatter printer = new DateTimeFormatter(new TestPrinter(), null);
        printer.printTo((StringBuffer) null, (ReadablePartial) null);
    }
}