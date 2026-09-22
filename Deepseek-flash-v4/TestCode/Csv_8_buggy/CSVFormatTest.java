package org.apache.commons.csv;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.io.StringReader;

import org.junit.Before;
import org.junit.Test;

public class CSVFormatTest {

    private CSVFormat format;

    @Before
    public void setUp() {
        format = CSVFormat.DEFAULT;
    }

    @Test
    public void testDefaultFormat() {
        assertEquals(',', format.getDelimiter());
        assertEquals(Character.valueOf('"'), format.getQuoteChar());
        assertNull(format.getQuotePolicy());
        assertNull(format.getCommentStart());
        assertNull(format.getEscape());
        assertFalse(format.getIgnoreSurroundingSpaces());
        assertTrue(format.getIgnoreEmptyLines());
        assertEquals("\r\n", format.getRecordSeparator());
        assertNull(format.getNullString());
        assertNull(format.getHeader());
        assertFalse(format.getSkipHeaderRecord());
        assertTrue(format.isQuoting());
        assertFalse(format.isEscaping());
        assertFalse(format.isCommentingEnabled());
        assertFalse(format.isNullHandling());
    }

    @Test
    public void testNewFormat() {
        CSVFormat custom = CSVFormat.newFormat('|');
        assertEquals('|', custom.getDelimiter());
        assertNull(custom.getQuoteChar());
        assertFalse(custom.isQuoting());
    }

    @Test
    public void testNewFormatWithLineBreakDelimiter() {
        try {
            CSVFormat.newFormat('\n');
            fail("Expected IllegalArgumentException for line break delimiter");
        } catch (IllegalArgumentException e) {
            assertEquals("The delimiter cannot be a line break", e.getMessage());
        }
    }

    @Test
    public void testWithDelimiter() {
        CSVFormat custom = format.withDelimiter(';');
        assertNotSame(format, custom);
        assertEquals(';', custom.getDelimiter());
        assertNotEquals(';', format.getDelimiter());
    }

    @Test
    public void testWithQuoteChar() {
        CSVFormat custom = format.withQuoteChar('\'');
        assertNotSame(format, custom);
        assertEquals(Character.valueOf('\''), custom.getQuoteChar());
    }

    @Test
    public void testWithQuoteCharNull() {
        CSVFormat custom = format.withQuoteChar((Character) null);
        assertNotSame(format, custom);
        assertNull(custom.getQuoteChar());
        assertFalse(custom.isQuoting());
    }

    @Test
    public void testWithQuoteCharLineBreak() {
        try {
            format.withQuoteChar('\n');
            fail("Expected IllegalArgumentException for line break quoteChar");
        } catch (IllegalArgumentException e) {
            assertEquals("The quoteChar cannot be a line break", e.getMessage());
        }
    }

    @Test
    public void testWithEscape() {
        CSVFormat custom = format.withEscape('\\');
        assertNotSame(format, custom);
        assertEquals(Character.valueOf('\\'), custom.getEscape());
        assertTrue(custom.isEscaping());
    }

    @Test
    public void testWithEscapeLineBreak() {
        try {
            format.withEscape('\r');
            fail("Expected IllegalArgumentException for line break escape");
        } catch (IllegalArgumentException e) {
            assertEquals("The escape character cannot be a line break", e.getMessage());
        }
    }

    @Test
    public void testWithCommentStart() {
        CSVFormat custom = format.withCommentStart('#');
        assertNotSame(format, custom);
        assertEquals(Character.valueOf('#'), custom.getCommentStart());
        assertTrue(custom.isCommentingEnabled());
    }

    @Test
    public void testWithCommentStartLineBreak() {
        try {
            format.withCommentStart('\n');
            fail("Expected IllegalArgumentException for line break comment start");
        } catch (IllegalArgumentException e) {
            assertEquals("The comment start character cannot be a line break", e.getMessage());
        }
    }

    @Test
    public void testWithNullString() {
        CSVFormat custom = format.withNullString("NULL");
        assertNotSame(format, custom);
        assertEquals("NULL", custom.getNullString());
        assertTrue(custom.isNullHandling());
    }

    @Test
    public void testWithIgnoreEmptyLines() {
        CSVFormat custom = format.withIgnoreEmptyLines(false);
        assertNotSame(format, custom);
        assertFalse(custom.getIgnoreEmptyLines());
        assertTrue(format.getIgnoreEmptyLines());
    }

    @Test
    public void testWithIgnoreSurroundingSpaces() {
        CSVFormat custom = format.withIgnoreSurroundingSpaces(true);
        assertNotSame(format, custom);
        assertTrue(custom.getIgnoreSurroundingSpaces());
        assertFalse(format.getIgnoreSurroundingSpaces());
    }

    @Test
    public void testWithRecordSeparatorString() {
        CSVFormat custom = format.withRecordSeparator("\n");
        assertNotSame(format, custom);
        assertEquals("\n", custom.getRecordSeparator());
    }

    @Test
    public void testWithRecordSeparatorChar() {
        CSVFormat custom = format.withRecordSeparator(';');
        assertNotSame(format, custom);
        assertEquals(";", custom.getRecordSeparator());
    }

    @Test
    public void testWithRecordSeparatorNull() {
        CSVFormat custom = format.withRecordSeparator((String) null);
        assertNotSame(format, custom);
        assertNull(custom.getRecordSeparator());
    }

    @Test
    public void testWithSkipHeaderRecord() {
        CSVFormat custom = format.withSkipHeaderRecord(true);
        assertNotSame(format, custom);
        assertTrue(custom.getSkipHeaderRecord());
        assertFalse(format.getSkipHeaderRecord());
    }

    @Test
    public void testWithHeader() {
        CSVFormat custom = format.withHeader("a", "b", "c");
        assertNotSame(format, custom);
        assertNotNull(custom.getHeader());
        assertEquals(3, custom.getHeader().length);
        assertEquals("a", custom.getHeader()[0]);
        assertEquals("b", custom.getHeader()[1]);
        assertEquals("c", custom.getHeader()[2]);
    }

    @Test
    public void testWithHeaderDuplicateNames() {
        try {
            format.withHeader("a", "a", "b");
            fail("Expected IllegalStateException for duplicate header names");
        } catch (IllegalStateException e) {
            assertEquals("The header contains duplicate names: [a, a, b]", e.getMessage());
        }
    }

    @Test
    public void testWithQuotePolicy() {
        CSVFormat custom = format.withQuotePolicy(Quote.ALL);
        assertNotSame(format, custom);
        assertEquals(Quote.ALL, custom.getQuotePolicy());
    }

    @Test
    public void testValidateWithQuoteEqualsDelimiter() {
        try {
            CSVFormat.invalidFormat('"', '"', null, null, null, false, false, null, null, null, false);
            fail("Expected IllegalStateException for quote equal to delimiter");
        } catch (IllegalStateException e) {
            assertEquals("The quoteChar character and the delimiter cannot be the same ('\"')", e.getMessage());
        }
    }

    @Test
    public void testValidateWithEscapeEqualsDelimiter() {
        try {
            CSVFormat.invalidFormat(',', null, null, null, ',', false, false, null, null, null, false);
            fail("Expected IllegalStateException for escape equal to delimiter");
        } catch (IllegalStateException e) {
            assertEquals("The escape character and the delimiter cannot be the same (',')", e.getMessage());
        }
    }

    @Test
    public void testValidateWithCommentStartEqualsDelimiter() {
        try {
            CSVFormat.invalidFormat(',', null, null, '#', null, false, false, null, null, null, false);
            fail("Expected IllegalStateException for comment start equal to delimiter");
        } catch (IllegalStateException e) {
            assertEquals("The comment start character and the delimiter cannot be the same ('#')", e.getMessage());
        }
    }

    @Test
    public void testValidateWithQuoteEqualsCommentStart() {
        try {
            CSVFormat.invalidFormat(',', '"', null, '"', null, false, false, null, null, null, false);
            fail("Expected IllegalStateException for quote equal to comment start");
        } catch (IllegalStateException e) {
            assertEquals("The comment start character and the quoteChar cannot be the same ('\"')", e.getMessage());
        }
    }

    @Test
    public void testValidateWithEscapeEqualsCommentStart() {
        try {
            CSVFormat.invalidFormat(',', null, null, '\\', '\\', false, false, null, null, null, false);
            fail("Expected IllegalStateException for escape equal to comment start");
        } catch (IllegalStateException e) {
            assertEquals("The comment start and the escape character cannot be the same ('\\')", e.getMessage());
        }
    }

    @Test
    public void testValidateNoQuotesAndNoEscape() {
        try {
            CSVFormat.invalidFormat(',', null, Quote.NONE, null, null, false, false, null, null, null, false);
            fail("Expected IllegalStateException for no quotes and no escape");
        } catch (IllegalStateException e) {
            assertEquals("No quotes mode set but no escape character is set", e.getMessage());
        }
    }

    @Test
    public void testEquals() {
        CSVFormat other = CSVFormat.DEFAULT;
        assertEquals(format, format);
        assertEquals(format, other);
        assertNotEquals(format, null);
        assertNotEquals(format, new Object());

        CSVFormat customDelimiter = format.withDelimiter(';');
        assertNotEquals(format, customDelimiter);

        CSVFormat customQuote = format.withQuoteChar('\'');
        assertNotEquals(format, customQuote);

        CSVFormat customComment = format.withCommentStart('#');
        assertNotEquals(format, customComment);

        CSVFormat customEscape = format.withEscape('\\');
        assertNotEquals(format, customEscape);

        CSVFormat customNullString = format.withNullString("NULL");
        assertNotEquals(format, customNullString);

        CSVFormat customSpace = format.withIgnoreSurroundingSpaces(true);
        assertNotEquals(format, customSpace);

        CSVFormat customEmptyLines = format.withIgnoreEmptyLines(false);
        assertNotEquals(format, customEmptyLines);

        CSVFormat customSep = format.withRecordSeparator("\n");
        assertNotEquals(format, customSep);

        CSVFormat customSkip = format.withSkipHeaderRecord(true);
        assertNotEquals(format, customSkip);

        CSVFormat customHeader = format.withHeader("a");
        assertNotEquals(format, customHeader);
    }

    @Test
    public void testHashCode() {
        CSVFormat other = CSVFormat.DEFAULT;
        assertEquals(format.hashCode(), other.hashCode());

        CSVFormat custom = format.withDelimiter(';');
        assertNotEquals(format.hashCode(), custom.hashCode());
    }

    @Test
    public void testGetHeaderClonesArray() {
        String[] header = {"a", "b"};
        CSVFormat custom = format.withHeader(header);
        header[0] = "c";
        assertEquals("a", custom.getHeader()[0]);
    }

    @Test
    public void testGetHeaderReturnsNullWhenNoHeader() {
        assertNull(format.getHeader());
    }

    @Test
    public void testParse() throws IOException {
        String input = "a,b,c\n1,2,3\n";
        CSVFormat custom = format.withHeader("col1", "col2", "col3");
        CSVParser parser = custom.parse(new StringReader(input));
        assertNotNull(parser);
        assertNotNull(parser.iterator().next());
    }

    @Test
    public void testFormatSimple() {
        assertEquals("\"a\"\r\n", format.format("a"));
    }

    @Test
    public void testFormatMultipleValues() {
        assertEquals("a,b,c\r\n", format.format("a", "b", "c"));
    }

    @Test
    public void testFormatIncludesDelimiter() {
        assertEquals("\"a,b\",c\r\n", format.format("a,b", "c"));
    }

    @Test
    public void testFormatWithQuoteChar() {
        assertEquals("\"a\"\"b\"\r\n", format.format("a\"b"));
    }

    @Test
    public void testFormatLineBreak() {
        assertEquals("\"a\nb\"\r\n", format.format("a\nb"));
    }

    @Test
    public void testFormatNullValues() {
        assertEquals("a,,c\r\n", format.format("a", null, "c"));
    }

    @Test
    public void testFormatWithNullString() {
        CSVFormat custom = format.withNullString("NULL");
        assertEquals("a,NULL,c\r\n", custom.format("a", null, "c"));
    }

    @Test
    public void testFormatWithEmptyValues() {
        assertEquals("\r\n", format.format());
    }

    @Test
    public void testToString() {
        format = CSVFormat.DEFAULT;
        String str = format.toString();
        assertEquals("Delimiter=<,>", str.substring(0, "Delimiter=<,>".length()));
        assertTrue(str.contains("QuoteChar=<\"'"));
        assertTrue(str.contains("EmptyLines:ignored"));
    }

    @Test
    public void testToStringWithAllFeatures() {
        CSVFormat custom = CSVFormat.DEFAULT
            .withDelimiter('|')
            .withQuoteChar('\'')
            .withCommentStart('#')
            .withEscape('\\')
            .withNullString("NULL")
            .withRecordSeparator("\n")
            .withIgnoreEmptyLines(false)
            .withIgnoreSurroundingSpaces(true)
            .withSkipHeaderRecord(true)
            .withHeader("a", "b");
        String str = custom.toString();
        assertTrue(str.contains("Delimiter=<|>"));
        assertTrue(str.contains("Escape=<\\>"));
        assertTrue(str.contains("QuoteChar=<'>"));
        assertTrue(str.contains("CommentStart=<#>"));
        assertTrue(str.contains("NullString=<NULL>"));
        assertTrue(str.contains("RecordSeparator=<\n>"));
        assertTrue(str.contains(" SurroundingSpaces:ignored"));
        assertTrue(str.contains("SkipHeaderRecord:true"));
        assertTrue(str.contains("Header:[a, b]"));
        assertFalse(str.contains("EmptyLines:ignored"));
    }

    @Test
    public void testTDFFormat() {
        CSVFormat tdf = CSVFormat.TDF;
        assertEquals('\t', tdf.getDelimiter());
        assertEquals(Character.valueOf('"'), tdf.getQuoteChar());
        assertTrue(tdf.getIgnoreSurroundingSpaces());
    }

    @Test
    public void testMYSQLFormat() {
        CSVFormat mysql = CSVFormat.MYSQL;
        assertEquals(',', mysql.getDelimiter());
        assertNull(mysql.getQuoteChar());
        assertEquals(Character.valueOf('\\'), mysql.getEscape());
        assertEquals("\n", mysql.getRecordSeparator());
        assertFalse(mysql.getIgnoreEmptyLines());
    }

    @Test
    public void testRFC4180Format() {
        CSVFormat rfc = CSVFormat.RFC4180;
        assertFalse(rfc.getIgnoreEmptyLines());
    }

    @Test
    public void testEXCELFormat() {
        CSVFormat excel = CSVFormat.EXCEL;
        assertFalse(excel.getIgnoreEmptyLines());
    }
}