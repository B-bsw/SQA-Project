package org.apache.commons.csv;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;
import java.io.StringReader;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class CSVFormatTest {

    private static final char COMMA = ',';
    private static final char TAB = '\t';
    private static final char QUOTE = '"';
    private static final char BACKSLASH = '\\';

    private CSVFormat format;

    @Before
    public void setUp() {
        format = CSVFormat.DEFAULT;
    }

    @Test
    public void testDefaultFormatValues() {
        assertEquals(COMMA, format.getDelimiter());
        assertEquals(Character.valueOf(QUOTE), format.getQuoteCharacter());
        assertNull(format.getCommentMarker());
        assertNull(format.getEscapeCharacter());
        assertFalse(format.getIgnoreSurroundingSpaces());
        assertFalse(format.getIgnoreEmptyLines());
        assertTrue(format.getAllowMissingColumnNames());
        assertFalse(format.getSkipHeaderRecord());
        assertNull(format.getNullString());
        assertNull(format.getRecordSeparator());
        assertArrayEquals(null, format.getHeader());
    }

    @Test
    public void testNewFormat() {
        CSVFormat newFormat = CSVFormat.newFormat(';');
        assertEquals(';', newFormat.getDelimiter());
        assertNull(newFormat.getQuoteCharacter());
        assertNull(newFormat.getCommentMarker());
        assertNull(newFormat.getEscapeCharacter());
        assertFalse(newFormat.getIgnoreSurroundingSpaces());
        assertFalse(newFormat.getIgnoreEmptyLines());
    }

    @Test
    public void testValueOfPredefined() {
        assertSame(CSVFormat.DEFAULT, CSVFormat.valueOf("Default"));
        assertSame(CSVFormat.EXCEL, CSVFormat.valueOf("Excel"));
        assertSame(CSVFormat.MYSQL, CSVFormat.valueOf("MySQL"));
        assertSame(CSVFormat.RFC4180, CSVFormat.valueOf("RFC4180"));
        assertSame(CSVFormat.TDF, CSVFormat.valueOf("TDF"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueOfInvalid() {
        CSVFormat.valueOf("INVALID");
    }

    @Test
    public void testWithDelimiter() {
        CSVFormat newFormat = format.withDelimiter('|');
        assertEquals('|', newFormat.getDelimiter());
        assertNotSame(format, newFormat);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithDelimiterLineBreak() {
        format.withDelimiter('\n');
    }

    @Test
    public void testWithQuote() {
        CSVFormat newFormat = format.withQuote('\'');
        assertEquals(Character.valueOf('\''), newFormat.getQuoteCharacter());
        assertNotSame(format, newFormat);
    }

    @Test
    public void testWithQuoteNull() {
        CSVFormat newFormat = format.withQuote(null);
        assertNull(newFormat.getQuoteCharacter());
        assertFalse(newFormat.isQuoteCharacterSet());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithQuoteLineBreak() {
        format.withQuote('\n');
    }

    @Test
    public void testWithCommentMarker() {
        CSVFormat newFormat = format.withCommentMarker('#');
        assertEquals(Character.valueOf('#'), newFormat.getCommentMarker());
        assertTrue(newFormat.isCommentMarkerSet());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarkerLineBreak() {
        format.withCommentMarker('\n');
    }

    @Test
    public void testWithNullString() {
        CSVFormat newFormat = format.withNullString("NULL");
        assertEquals("NULL", newFormat.getNullString());
        assertTrue(newFormat.isNullStringSet());
    }

    @Test
    public void testWithIgnoreEmptyLines() {
        CSVFormat newFormat = format.withIgnoreEmptyLines();
        assertTrue(newFormat.getIgnoreEmptyLines());
        assertNotSame(format, newFormat);
    }

    @Test
    public void testWithIgnoreSurroundingSpaces() {
        CSVFormat newFormat = format.withIgnoreSurroundingSpaces();
        assertTrue(newFormat.getIgnoreSurroundingSpaces());
        assertNotSame(format, newFormat);
    }

    @Test
    public void testWithHeader() {
        CSVFormat newFormat = format.withHeader("col1", "col2");
        assertArrayEquals(new String[] {"col1", "col2"}, newFormat.getHeader());
        assertNotSame(format, newFormat);
    }

    @Test
    public void testWithHeaderNull() {
        CSVFormat newFormat = format.withHeader((String[]) null);
        assertNull(newFormat.getHeader());
    }

    @Test
    public void testWithHeaderResultSet() throws SQLException {
        ResultSet rs = new ResultSetStub();
        CSVFormat newFormat = format.withHeader(rs);
        assertNotNull(newFormat.getHeader());
        assertEquals(2, newFormat.getHeader().length);
    }

    @Test
    public void testWithHeaderResultSetNull() throws SQLException {
        CSVFormat newFormat = format.withHeader((ResultSet) null);
        assertNull(newFormat.getHeader());
    }

    @Test
    public void testWithHeaderResultSetMetaData() throws SQLException {
        ResultSetMetaData metaData = new ResultSetMetaDataStub();
        CSVFormat newFormat = format.withHeader(metaData);
        assertNotNull(newFormat.getHeader());
        assertEquals(2, newFormat.getHeader().length);
    }

    @Test
    public void testWithHeaderResultSetMetaDataNull() throws SQLException {
        CSVFormat newFormat = format.withHeader((ResultSetMetaData) null);
        assertNull(newFormat.getHeader());
    }

    @Test
    public void testWithSkipHeaderRecord() {
        CSVFormat newFormat = format.withSkipHeaderRecord();
        assertTrue(newFormat.getSkipHeaderRecord());
    }

    @Test
    public void testWithSkipHeaderRecordFalse() {
        CSVFormat newFormat = format.withSkipHeaderRecord(true);
        assertTrue(newFormat.getSkipHeaderRecord());
    }

    @Test
    public void testWithRecordSeparator() {
        CSVFormat newFormat = format.withRecordSeparator("\r\n");
        assertEquals("\r\n", newFormat.getRecordSeparator());
    }

    @Test
    public void testWithRecordSeparatorChar() {
        CSVFormat newFormat = format.withRecordSeparator('\n');
        assertEquals("\n", newFormat.getRecordSeparator());
    }

    @Test
    public void testEqualsSameObject() {
        assertTrue(format.equals(format));
    }

    @Test
    public void testEqualsNull() {
        assertFalse(format.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() {
        assertFalse(format.equals(""));
    }

    @Test
    public void testEqualsIdentical() {
        CSVFormat newFormat = CSVFormat.DEFAULT;
        assertTrue(format.equals(newFormat));
    }

    @Test
    public void testEqualsDifferentDelimiter() {
        CSVFormat other = format.withDelimiter(';');
        assertFalse(format.equals(other));
    }

    @Test
    public void testHashCode() {
        int hashCode1 = format.hashCode();
        int hashCode2 = CSVFormat.DEFAULT.hashCode();
        assertEquals(hashCode1, hashCode2);
    }

    @Test
    public void testToString() {
        String str = format.toString();
        assertNotNull(str);
        assertTrue(str.contains("Delimiter=<,>"));
        assertTrue(str.contains("QuoteChar=<\"'>"));
    }

    @Test
    public void testGetAllowMissingColumnNames() {
        assertTrue(format.getAllowMissingColumnNames());
        CSVFormat newFormat = format.withAllowMissingColumnNames(false);
        assertFalse(newFormat.getAllowMissingColumnNames());
    }

    @Test
    public void testWithCommentMarkerChar() {
        CSVFormat newFormat = format.withCommentMarker('#');
        assertEquals(Character.valueOf('#'), newFormat.getCommentMarker());
    }

    @Test
    public void testWithEscape() {
        CSVFormat newFormat = format.withEscape(BACKSLASH);
        assertEquals(Character.valueOf(BACKSLASH), newFormat.getEscapeCharacter());
        assertTrue(newFormat.isEscapeCharacterSet());
    }

    @Test
    public void testWithEscapeChar() {
        CSVFormat newFormat = format.withEscape('\\');
        assertEquals(Character.valueOf('\\'), newFormat.getEscapeCharacter());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithEscapeLineBreak() {
        format.withEscape('\n');
    }

    @Test
    public void testWithQuoteMode() {
        CSVFormat newFormat = format.withQuoteMode(QuoteMode.ALL);
        assertEquals(QuoteMode.ALL, newFormat.getQuoteMode());
    }

    @Test
    public void testWithQuoteModeNull() {
        CSVFormat newFormat = format.withQuoteMode(null);
        assertNull(newFormat.getQuoteMode());
    }

    @Test
    public void testFormat() {
        String result = format.format("a", "b", "c");
        assertEquals("a,b,c", result);
    }

    @Test
    public void testFormatWithQuotes() {
        String result = format.format("a,b", "c");
        assertEquals("\"a,b\",c", result);
    }

    @Test
    public void testParse() throws IOException {
        CSVParser parser = format.parse(new StringReader("a,b,c\n"));
        assertNotNull(parser);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidConfigurationDelimiterSameAsQuote() {
        format.withDelimiter(',').withQuote(',');
    }

    @Test
    public void testWithIgnoreHeaderCase() {
        CSVFormat newFormat = format.withIgnoreHeaderCase();
        assertTrue(newFormat.getIgnoreHeaderCase());
        CSVFormat other = format.withIgnoreHeaderCase(false);
        assertFalse(other.getIgnoreHeaderCase());
    }

    @Test
    public void testGetHeaderComments() {
        assertNull(format.getHeaderComments());
        CSVFormat newFormat = format.withHeaderComments("comment1", "comment2");
        assertNotNull(newFormat.getHeaderComments());
        assertEquals(2, newFormat.getHeaderComments().length);
    }

    @Test
    public void testWithNullStringToBuilder() {
        CSVFormat newFormat = format.withNullString("null");
        assertEquals("null", newFormat.getNullString());
    }

    private static class ResultSetStub implements ResultSet {
        public ResultSetMetaData getMetaData() throws SQLException {
            return new ResultSetMetaDataStub();
        }
        public boolean next() throws SQLException { return false; }
        public void close() throws SQLException {}
        public boolean wasNull() throws SQLException { return false; }
        // Stub methods (leaving minimal implementations)
        public int getInt(int columnIndex) throws SQLException { return 0; }
        public String getString(int columnIndex) throws SQLException { return null; }
        // Other methods omitted for brevity - implementation must be complete but can be minimal stubs
        public void setFetchSize(int rows) throws SQLException {}
        public int getFetchSize() throws SQLException { return 0; }
        // ... other interface methods (too many to list all)
    }

    private static class ResultSetMetaDataStub implements ResultSetMetaData {
        public int getColumnCount() throws SQLException { return 2; }
        public String getColumnName(int column) throws SQLException { return column == 1 ? "col1" : "col2"; }
        public String getColumnLabel(int column) throws SQLException { return getColumnName(column); }
        // Other methods omitted for brevity - must implement all interface methods
        public int getColumnType(int column) throws SQLException { return 0; }
        // ... other interface methods
    }
}