package org.apache.commons.csv;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import org.junit.Test;

public class CSVFormatTest {

    @Test
    public void testNewFormat() {
        CSVFormat format = CSVFormat.newFormat(';');
        assertEquals(';', format.getDelimiter());
        assertFalse(format.isQuoteCharacterSet());
        assertFalse(format.isCommentMarkerSet());
        assertFalse(format.isEscapeCharacterSet());
        assertFalse(format.isNullStringSet());
        assertNull(format.getQuoteCharacter());
        assertNull(format.getCommentMarker());
        assertNull(format.getEscapeCharacter());
        assertNull(format.getNullString());
        assertNull(format.getRecordSeparator());
        assertNull(format.getHeader());
        assertFalse(format.getSkipHeaderRecord());
        assertFalse(format.getAllowMissingColumnNames());
        assertFalse(format.getIgnoreEmptyLines());
        assertFalse(format.getIgnoreSurroundingSpaces());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNewFormatWithLineBreakDelimiter() {
        CSVFormat.newFormat('\n');
    }

    @Test
    public void testDelimiterCannotBeLineBreak() {
        try {
            CSVFormat.DEFAULT.withDelimiter('\r');
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testWithDelimiter() {
        CSVFormat format = CSVFormat.DEFAULT.withDelimiter('|');
        assertEquals('|', format.getDelimiter());
        assertEquals(CSVFormat.DEFAULT.getDelimiter(), ',');
        assertFalse(format.equals(CSVFormat.DEFAULT));
    }

    @Test
    public void testWithQuoteChar() {
        CSVFormat format = CSVFormat.DEFAULT.withQuote('\'');
        assertEquals(Character.valueOf('\''), format.getQuoteCharacter());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithQuoteCharLineBreak() {
        CSVFormat.DEFAULT.withQuote('\n');
    }

    @Test
    public void testWithQuoteCharacter() {
        CSVFormat format = CSVFormat.DEFAULT.withQuote(Character.valueOf('"'));
        assertEquals(Character.valueOf('"'), format.getQuoteCharacter());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithQuoteCharacterLineBreak() {
        CSVFormat.DEFAULT.withQuote(Character.valueOf('\n'));
    }

    @Test
    public void testWithQuoteMode() {
        CSVFormat format = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.ALL);
        assertEquals(QuoteMode.ALL, format.getQuoteMode());
    }

    @Test
    public void testWithRecordSeparatorChar() {
        CSVFormat format = CSVFormat.DEFAULT.withRecordSeparator(';');
        assertEquals(";", format.getRecordSeparator());
    }

    @Test
    public void testWithRecordSeparatorString() {
        CSVFormat format = CSVFormat.DEFAULT.withRecordSeparator("##");
        assertEquals("##", format.getRecordSeparator());
    }

    @Test
    public void testWithSkipHeaderRecord() {
        CSVFormat format = CSVFormat.DEFAULT.withSkipHeaderRecord(true);
        assertTrue(format.getSkipHeaderRecord());
    }

    @Test
    public void testWithHeader() {
        CSVFormat format = CSVFormat.DEFAULT.withHeader("a", "b", "c");
        assertArrayEquals(new String[] {"a", "b", "c"}, format.getHeader());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithHeaderDuplicateEntries() {
        CSVFormat.DEFAULT.withHeader("a", "a");
    }

    @Test
    public void testWithHeaderNull() {
        CSVFormat format = CSVFormat.DEFAULT.withHeader((String[]) null);
        assertNull(format.getHeader());
    }

    @Test
    public void testWithAllowMissingColumnNames() {
        CSVFormat format = CSVFormat.DEFAULT.withAllowMissingColumnNames(true);
        assertTrue(format.getAllowMissingColumnNames());
    }

    @Test
    public void testWithIgnoreEmptyLines() {
        CSVFormat format = CSVFormat.DEFAULT.withIgnoreEmptyLines(true);
        assertTrue(format.getIgnoreEmptyLines());
    }

    @Test
    public void testWithIgnoreSurroundingSpaces() {
        CSVFormat format = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(true);
        assertTrue(format.getIgnoreSurroundingSpaces());
    }

    @Test
    public void testWithNullString() {
        CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");
        assertEquals("NULL", format.getNullString());
    }

    @Test
    public void testWithCommentMarkerChar() {
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        assertEquals(Character.valueOf('#'), format.getCommentMarker());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarkerLineBreak() {
        CSVFormat.DEFAULT.withCommentMarker('\n');
    }

    @Test
    public void testWithCommentMarkerCharacter() {
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker(Character.valueOf('#'));
        assertEquals(Character.valueOf('#'), format.getCommentMarker());
    }

    @Test
    public void testWithEscapeChar() {
        CSVFormat format = CSVFormat.DEFAULT.withEscape('\\');
        assertEquals(Character.valueOf('\\'), format.getEscapeCharacter());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithEscapeLineBreak() {
        CSVFormat.DEFAULT.withEscape('\n');
    }

    @Test
    public void testWithEscapeCharacter() {
        CSVFormat format = CSVFormat.DEFAULT.withEscape(Character.valueOf('\\'));
        assertEquals(Character.valueOf('\\'), format.getEscapeCharacter());
    }

    @Test
    public void testGetters() {
        CSVFormat format = CSVFormat.DEFAULT;
        assertEquals(',', format.getDelimiter());
        assertEquals(Character.valueOf('"'), format.getQuoteCharacter());
        assertTrue(format.isQuoteCharacterSet());
        assertFalse(format.isCommentMarkerSet());
        assertFalse(format.isEscapeCharacterSet());
        assertFalse(format.isNullStringSet());
        assertNull(format.getCommentMarker());
        assertNull(format.getEscapeCharacter());
        assertNull(format.getNullString());
        assertNull(format.getHeader());
        assertNull(format.getRecordSeparator());
        assertFalse(format.getSkipHeaderRecord());
        assertFalse(format.getAllowMissingColumnNames());
        assertFalse(format.getIgnoreEmptyLines());
        assertFalse(format.getIgnoreSurroundingSpaces());
    }

    @Test
    public void testEquals() {
        CSVFormat format1 = CSVFormat.DEFAULT;
        CSVFormat format2 = CSVFormat.DEFAULT;
        assertEquals(format1, format2);
        assertEquals(format1.hashCode(), format2.hashCode());
    }

    @Test
    public void testNotEquals() {
        CSVFormat format1 = CSVFormat.DEFAULT;
        CSVFormat format2 = CSVFormat.DEFAULT.withDelimiter(';');
        assertFalse(format1.equals(format2));
    }

    @Test
    public void testEqualsNull() {
        assertFalse(CSVFormat.DEFAULT.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() {
        assertFalse(CSVFormat.DEFAULT.equals("test"));
    }

    @Test
    public void testEqualsSameObject() {
        CSVFormat format = CSVFormat.DEFAULT;
        assertEquals(format, format);
    }

    @Test
    public void testToString() {
        String str = CSVFormat.DEFAULT.toString();
        assertNotNull(str);
        assertTrue(str.contains("Delimiter=<,>"));
        assertTrue(str.contains("QuoteChar=<\">"));
    }

    @Test
    public void testParse() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT;
        CSVParser parser = format.parse(new StringReader("a,b,c"));
        assertNotNull(parser);
    }

    @Test
    public void testPrint() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT;
        StringWriter writer = new StringWriter();
        CSVPrinter printer = format.print(writer);
        assertNotNull(printer);
    }

    @Test
    public void testFormat() {
        String result = CSVFormat.DEFAULT.format("a", "b", "c");
        assertEquals("a,b,c", result);
    }

    @Test
    public void testFormatWithQuotes() {
        String result = CSVFormat.DEFAULT.format("a,b", "c");
        assertEquals("\"a,b\",c", result);
    }

    @Test(expected = IllegalStateException.class)
    public void testFormatThrowsIOException() {
        CSVFormat format = CSVFormat.DEFAULT;
        format.format(new Object() {
            public String toString() {
                throw new RuntimeException("boom");
            }
        });
    }

    @Test
    public void testStaticConstants() {
        assertEquals(',', CSVFormat.DEFAULT.getDelimiter());
        assertEquals(',', CSVFormat.RFC4180.getDelimiter());
        assertEquals(',', CSVFormat.EXCEL.getDelimiter());
        assertEquals('\t', CSVFormat.TDF.getDelimiter());
        assertEquals(',', CSVFormat.MYSQL.getDelimiter());
    }

    @Test
    public void testValidateQuoteCharAndDelimiterSame() {
        try {
            CSVFormat.DEFAULT.withQuote(',').withDelimiter(',');
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testValidateEscapeAndDelimiterSame() {
        try {
            CSVFormat.DEFAULT.withEscape(',').withDelimiter(',');
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testValidateCommentMarkerAndDelimiterSame() {
        try {
            CSVFormat.DEFAULT.withCommentMarker(',').withDelimiter(',');
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testValidateQuoteCharAndCommentMarkerSame() {
        try {
            CSVFormat.DEFAULT.withQuote('#').withCommentMarker('#');
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testValidateEscapeAndCommentMarkerSame() {
        try {
            CSVFormat.DEFAULT.withEscape('#').withCommentMarker('#');
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testValidateEscapeNullQuoteModeNone() {
        try {
            CSVFormat.DEFAULT.withEscape((Character) null).withQuoteMode(QuoteMode.NONE);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testHashCode() {
        CSVFormat format1 = CSVFormat.DEFAULT;
        CSVFormat format2 = CSVFormat.DEFAULT;
        assertEquals(format1.hashCode(), format2.hashCode());
    }

    @Test
    public void testHashCodeDifferent() {
        CSVFormat format1 = CSVFormat.DEFAULT;
        CSVFormat format2 = CSVFormat.DEFAULT.withDelimiter(';');
        assertFalse(format1.hashCode() == format2.hashCode());
    }

    @Test
    public void testGettersWithValues() {
        CSVFormat format = CSVFormat.DEFAULT
                .withCommentMarker('#')
                .withEscape('\\')
                .withNullString("NULL")
                .withHeader("a", "b")
                .withRecordSeparator(";")
                .withIgnoreEmptyLines(true)
                .withIgnoreSurroundingSpaces(true)
                .withAllowMissingColumnNames(true)
                .withSkipHeaderRecord(true)
                .withQuoteMode(QuoteMode.MINIMAL);

        assertTrue(format.isCommentMarkerSet());
        assertTrue(format.isEscapeCharacterSet());
        assertTrue(format.isNullStringSet());
        assertTrue(format.isQuoteCharacterSet());
        assertEquals(Character.valueOf('#'), format.getCommentMarker());
        assertEquals(Character.valueOf('\\'), format.getEscapeCharacter());
        assertEquals("NULL", format.getNullString());
        assertArrayEquals(new String[] {"a", "b"}, format.getHeader());
        assertEquals(";", format.getRecordSeparator());
        assertTrue(format.getIgnoreEmptyLines());
        assertTrue(format.getIgnoreSurroundingSpaces());
        assertTrue(format.getAllowMissingColumnNames());
        assertTrue(format.getSkipHeaderRecord());
        assertEquals(QuoteMode.MINIMAL, format.getQuoteMode());
    }

    @Test
    public void testWithIgnoreEmptyLinesFalse() {
        CSVFormat format = CSVFormat.DEFAULT.withIgnoreEmptyLines(false);
        assertFalse(format.getIgnoreEmptyLines());
    }

    @Test
    public void testWithIgnoreSurroundingSpacesFalse() {
        CSVFormat format = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(false);
        assertFalse(format.getIgnoreSurroundingSpaces());
    }

    @Test
    public void testWithSkipHeaderRecordFalse() {
        CSVFormat format = CSVFormat.DEFAULT.withSkipHeaderRecord(false);
        assertFalse(format.getSkipHeaderRecord());
    }

    @Test
    public void testWithAllowMissingColumnNamesFalse() {
        CSVFormat format = CSVFormat.DEFAULT.withAllowMissingColumnNames(false);
        assertFalse(format.getAllowMissingColumnNames());
    }
}