package org.joda.time.format;

import org.junit.Before;
import org.junit.Test;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Locale;
import org.joda.time.*;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeParser;
import org.joda.time.format.DateTimePrinter;

import static org.junit.Assert.*;

public class DateTimeFormatterTest {

    private DateTimePrinter mockPrinter;
    private DateTimeParser mockParser;
    private DateTimeFormatter formatter;

    @Before
    public void setUp() {
        mockPrinter = new MockDateTimePrinter();
        mockParser = new MockDateTimeParser();
        formatter = new DateTimeFormatter(mockPrinter, mockParser);
    }

    // --- Inner mock classes ---
    static class MockDateTimePrinter implements DateTimePrinter {
        int estimatePrintedLength() { return 10; }
        void printTo(StringBuffer buf, long instant, Chronology chrono, int displayOffset, DateTimeZone displayZone, Locale locale) {
            buf.append("printed");
        }
        void printTo(Writer out, long instant, Chronology chrono, int displayOffset, DateTimeZone displayZone, Locale locale) throws IOException {
            out.write("printed");
        }
        void printTo(StringBuffer buf, ReadablePartial partial, Locale locale) {
            buf.append("partial");
        }
        void printTo(Writer out, ReadablePartial partial, Locale locale) throws IOException {
            out.write("partial");
        }
    }

    static class MockDateTimeParser implements DateTimeParser {
        int estimateParsedLength() { return 10; }
        int parseInto(DateTimeParserBucket bucket, String text, int position) {
            // Simulate successful parse by returning full length
            return text.length();
        }
    }

    // --- Tests for isPrinter / isParser ---
    @Test
    public void testIsPrinterTrue() {
        assertTrue(formatter.isPrinter());
    }

    @Test
    public void testIsPrinterFalse() {
        DateTimeFormatter f = new DateTimeFormatter(null, mockParser);
        assertFalse(f.isPrinter());
    }

    @Test
    public void testIsParserTrue() {
        assertTrue(formatter.isParser());
    }

    @Test
    public void testIsParserFalse() {
        DateTimeFormatter f = new DateTimeFormatter(mockPrinter, null);
        assertFalse(f.isParser());
    }

    @Test
    public void testGetPrinter() {
        assertSame(mockPrinter, formatter.getPrinter());
    }

    @Test
    public void testGetParser() {
        assertSame(mockParser, formatter.getParser());
    }

    // --- withLocale ---
    @Test
    public void testWithLocaleSame() {
        Locale locale = Locale.US;
        DateTimeFormatter withLocale = formatter.withLocale(locale);
        assertSame(withLocale, formatter.withLocale(locale)); // second call returns same
    }

    @Test
    public void testWithLocaleDifferent() {
        Locale locale1 = Locale.US;
        Locale locale2 = Locale.FRANCE;
        DateTimeFormatter f1 = formatter.withLocale(locale1);
        DateTimeFormatter f2 = f1.withLocale(locale2);
        assertNotSame(f1, f2);
        assertEquals(locale2, f2.getLocale());
    }

    @Test
    public void testWithLocaleNull() {
        DateTimeFormatter f = formatter.withLocale(null);
        assertNull(f.getLocale());
    }

    // --- withOffsetParsed ---
    @Test
    public void testWithOffsetParsedAlreadyTrue() {
        DateTimeFormatter f = formatter.withOffsetParsed();
        assertTrue(f.isOffsetParsed());
        assertSame(f, f.withOffsetParsed());
    }

    @Test
    public void testWithOffsetParsedNew() {
        assertFalse(formatter.isOffsetParsed());
        DateTimeFormatter f = formatter.withOffsetParsed();
        assertTrue(f.isOffsetParsed());
    }

    // --- withChronology ---
    @Test
    public void testWithChronologySame() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeFormatter f = formatter.withChronology(chrono);
        assertSame(f, f.withChronology(chrono));
    }

    @Test
    public void testWithChronologyDifferent() {
        Chronology chrono1 = ISOChronology.getInstanceUTC();
        Chronology chrono2 = ISOChronology.getInstance();
        DateTimeFormatter f1 = formatter.withChronology(chrono1);
        DateTimeFormatter f2 = f1.withChronology(chrono2);
        assertNotSame(f1, f2);
        assertEquals(chrono2, f2.getChronology());
    }

    @Test
    public void testWithChronologyNull() {
        DateTimeFormatter f = formatter.withChronology(null);
        assertNull(f.getChronology());
    }

    // --- withZoneUTC ---
    @Test
    public void testWithZoneUTC() {
        DateTimeFormatter f = formatter.withZoneUTC();
        assertEquals(DateTimeZone.UTC, f.getZone());
        assertFalse(f.isOffsetParsed());
    }

    // --- withZone ---
    @Test
    public void testWithZoneSame() {
        DateTimeZone zone = DateTimeZone.UTC;
        DateTimeFormatter f = formatter.withZone(zone);
        assertSame(f, f.withZone(zone));
    }

    @Test
    public void testWithZoneDifferent() {
        DateTimeZone zone1 = DateTimeZone.UTC;
        DateTimeZone zone2 = DateTimeZone.forID("America/New_York");
        DateTimeFormatter f1 = formatter.withZone(zone1);
        DateTimeFormatter f2 = f1.withZone(zone2);
        assertNotSame(f1, f2);
        assertEquals(zone2, f2.getZone());
        assertFalse(f2.isOffsetParsed());
    }

    @Test
    public void testWithZoneNull() {
        DateTimeFormatter f = formatter.withZone(null);
        assertNull(f.getZone());
    }

    // --- withPivotYear(Integer) ---
    @Test
    public void testWithPivotYearIntegerSame() {
        Integer pivot = Integer.valueOf(2000);
        DateTimeFormatter f = formatter.withPivotYear(pivot);
        assertSame(f, f.withPivotYear(pivot));
    }

    @Test
    public void testWithPivotYearIntegerDifferent() {
        Integer pivot1 = Integer.valueOf(2000);
        Integer pivot2 = Integer.valueOf(2010);
        DateTimeFormatter f1 = formatter.withPivotYear(pivot1);
        DateTimeFormatter f2 = f1.withPivotYear(pivot2);
        assertNotSame(f1, f2);
        assertEquals(pivot2, f2.getPivotYear());
    }

    @Test
    public void testWithPivotYearIntegerNull() {
        DateTimeFormatter f = formatter.withPivotYear((Integer) null);
        assertNull(f.getPivotYear());
    }

    // --- withPivotYear(int) ---
    @Test
    public void testWithPivotYearInt() {
        DateTimeFormatter f = formatter.withPivotYear(2005);
        assertEquals(Integer.valueOf(2005), f.getPivotYear());
    }

    // --- withDefaultYear ---
    @Test
    public void testWithDefaultYear() {
        DateTimeFormatter f = formatter.withDefaultYear(1990);
        assertEquals(1990, f.getDefaultYear());
        assertNotSame(formatter, f);
    }

    // --- printTo(StringBuffer, ReadableInstant) ---
    @Test
    public void testPrintToBufferReadableInstant() {
        DateTime dt = new DateTime(1000L, DateTimeZone.UTC);
        StringBuffer buf = new StringBuffer();
        formatter.printTo(buf, (ReadableInstant) dt);
        assertEquals("printed", buf.toString());
    }

    // --- printTo(Writer, ReadableInstant) ---
    @Test
    public void testPrintToWriterReadableInstant() throws IOException {
        DateTime dt = new DateTime(1000L, DateTimeZone.UTC);
        StringWriter sw = new StringWriter();
        formatter.printTo(sw, (ReadableInstant) dt);
        assertEquals("printed", sw.toString());
    }

    // --- printTo(Appendable, ReadableInstant) ---
    @Test
    public void testPrintToAppendableReadableInstant() throws IOException {
        DateTime dt = new DateTime(1000L, DateTimeZone.UTC);
        StringBuilder sb = new StringBuilder();
        formatter.printTo((Appendable) sb, (ReadableInstant) dt);
        assertEquals("printed", sb.toString());
    }

    // --- printTo(StringBuffer, long) ---
    @Test
    public void testPrintToBufferLong() {
        StringBuffer buf = new StringBuffer();
        formatter.printTo(buf, 2000L);
        assertEquals("printed", buf.toString());
    }

    // --- printTo(Writer, long) ---
    @Test
    public void testPrintToWriterLong() throws IOException {
        StringWriter sw = new StringWriter();
        formatter.printTo(sw, 2000L);
        assertEquals("printed", sw.toString());
    }

    // --- printTo(Appendable, long) ---
    @Test
    public void testPrintToAppendableLong() throws IOException {
        StringBuilder sb = new StringBuilder();
        formatter.printTo((Appendable) sb, 2000L);
        assertEquals("printed", sb.toString());
    }

    // --- printTo(StringBuffer, ReadablePartial) ---
    @Test
    public void testPrintToBufferReadablePartial() {
        LocalDate date = new LocalDate(2020, 1, 1);
        StringBuffer buf = new StringBuffer();
        formatter.printTo(buf, (ReadablePartial) date);
        assertEquals("partial", buf.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintToBufferReadablePartialNull() {
        formatter.printTo(new StringBuffer(), (ReadablePartial) null);
    }

    // --- printTo(Writer, ReadablePartial) ---
    @Test
    public void testPrintToWriterReadablePartial() throws IOException {
        LocalDate date = new LocalDate(2020, 1, 1);
        StringWriter sw = new StringWriter();
        formatter.printTo(sw, (ReadablePartial) date);
        assertEquals("partial", sw.toString());
    }

    // --- print(ReadableInstant) ---
    @Test
    public void testPrintReadableInstant() {
        DateTime dt = new DateTime(1000L, DateTimeZone.UTC);
        assertEquals("printed", formatter.print(dt));
    }

    // --- print(long) ---
    @Test
    public void testPrintLong() {
        assertEquals("printed", formatter.print(1000L));
    }

    // --- print(ReadablePartial) ---
    @Test
    public void testPrintReadablePartial() {
        LocalDate date = new LocalDate(2020, 1, 1);
        assertEquals("partial", formatter.print(date));
    }

    // --- parseInto ---
    @Test(expected = IllegalArgumentException.class)
    public void testParseIntoNullInstant() {
        formatter.parseInto(null, "test", 0);
    }

    @Test
    public void testParseIntoSuccess() {
        MutableDateTime mdt = new MutableDateTime(1000L, DateTimeZone.UTC);
        int pos = formatter.parseInto(mdt, "test", 0);
        assertEquals(4, pos);
    }

    // --- parseMillis ---
    @Test
    public void testParseMillisSuccess() {
        long millis = formatter.parseMillis("test");
        assertTrue(millis >= 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseMillisFailure() {
        // Use a parser that returns position 0 (less than length) to trigger exception
        DateTimeParser parserFail = new DateTimeParser() {
            public int estimateParsedLength() { return 10; }
            public int parseInto(DateTimeParserBucket bucket, String text, int position) {
                return 0;
            }
        };
        DateTimeFormatter failFormatter = new DateTimeFormatter(mockPrinter, parserFail);
        failFormatter.parseMillis("test");
    }

    // --- parseLocalDateTime ---
    @Test
    public void testParseLocalDateTimeSuccess() {
        LocalDateTime ldt = formatter.parseLocalDateTime("test");
        assertNotNull(ldt);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseLocalDateTimeFailure() {
        DateTimeParser parserFail = new DateTimeParser() {
            public int estimateParsedLength() { return 10; }
            public int parseInto(DateTimeParserBucket bucket, String text, int position) {
                return 0;
            }
        };
        DateTimeFormatter failFormatter = new DateTimeFormatter(mockPrinter, parserFail);
        failFormatter.parseLocalDateTime("test");
    }

    // --- parseDateTime ---
    @Test
    public void testParseDateTimeSuccess() {
        DateTime dt = formatter.parseDateTime("test");
        assertNotNull(dt);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseDateTimeFailure() {
        DateTimeParser parserFail = new DateTimeParser() {
            public int estimateParsedLength() { return 10; }
            public int parseInto(DateTimeParserBucket bucket, String text, int position) {
                return 0;
            }
        };
        DateTimeFormatter failFormatter = new DateTimeFormatter(mockPrinter, parserFail);
        failFormatter.parseDateTime("test");
    }

    // --- parseMutableDateTime ---
    @Test
    public void testParseMutableDateTimeSuccess() {
        MutableDateTime mdt = formatter.parseMutableDateTime("test");
        assertNotNull(mdt);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseMutableDateTimeFailure() {
        DateTimeParser parserFail = new DateTimeParser() {
            public int estimateParsedLength() { return 10; }
            public int parseInto(DateTimeParserBucket bucket, String text, int position) {
                return 0;
            }
        };
        DateTimeFormatter failFormatter = new DateTimeFormatter(mockPrinter, parserFail);
        failFormatter.parseMutableDateTime("test");
    }

    // --- requirePrinter (via print or printTo when printer null) ---
    @Test(expected = UnsupportedOperationException.class)
    public void testRequirePrinterNull() {
        DateTimeFormatter f = new DateTimeFormatter(null, mockParser);
        f.print(1000L);
    }

    // --- requireParser (via parseMillis when parser null) ---
    @Test(expected = UnsupportedOperationException.class)
    public void testRequireParserNull() {
        DateTimeFormatter f = new DateTimeFormatter(mockPrinter, null);
        f.parseMillis("test");
    }

    // --- selectChronology (test via printTo with long and null chrono, which internally selects) ---
    @Test
    public void testSelectChronologyWithIChrono() {
        Chronology customChrono = ISOChronology.getInstance().withZone(DateTimeZone.forID("America/New_York"));
        DateTimeFormatter f = new DateTimeFormatter(mockPrinter, mockParser).withChronology(customChrono);
        // This should use iChrono, not the passed null.
        // We can verify by checking that printTo uses the chronology's zone.
        // Since our mock printer ignores zone, we just ensure no exception.
        StringBuffer buf = new StringBuffer();
        f.printTo(buf, 1000L); // passes null internally
        assertEquals("printed", buf.toString());
    }

    @Test
    public void testSelectChronologyWithIChronoAndIZone() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        DateTimeFormatter f = new DateTimeFormatter(mockPrinter, mockParser)
                .withChronology(chrono)
                .withZone(zone);
        StringBuffer buf = new StringBuffer();
        f.printTo(buf, 1000L);
        // Should use chrono with zone
        assertEquals("printed", buf.toString());
    }

    // --- Parsing methods with null check for parser (already tested) ---
}