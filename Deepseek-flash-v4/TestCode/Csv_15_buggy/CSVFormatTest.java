package org.apache.commons.csv;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.junit.Assert;
import org.apache.commons.csv.CSVFormat.Predefined;
import org.apache.commons.csv.CSVFormat.QuoteMode;

import java.io.IOException;
import java.io.StringWriter;
import java.io.StringReader;
import java.util.Arrays;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.util.List;
import java.util.Iterator;

public class CSVFormatTest {

    private static final String NL = System.lineSeparator();
    private CSVFormat format;
    private static final String SAMPLE_HEADER = "a,b,c";

    @Before
    public void setUp() {
        format = CSVFormat.DEFAULT;
    }

    @After
    public void tearDown() {
        format = null;
    }

    @Test
    public void testGetFormatForPredefinedDefault() {
        Assert.assertSame(CSVFormat.DEFAULT, Predefined.Default.getFormat());
    }

    @Test
    public void testGetFormatForPredefinedExcel() {
        Assert.assertSame(CSVFormat.EXCEL, Predefined.Excel.getFormat());
    }

    @Test
    public void testGetFormatForPredefinedTDF() {
        Assert.assertSame(CSVFormat.TDF, Predefined.TDF.getFormat());
    }

    @Test
    public void testNewFormat() {
        CSVFormat f = CSVFormat.newFormat(';');
        Assert.assertEquals(';', f.getDelimiter());
        Assert.assertNull(f.getQuoteCharacter());
        Assert.assertNull(f.getQuoteMode());
        Assert.assertNull(f.getCommentMarker());
        Assert.assertNull(f.getEscapeCharacter());
        Assert.assertFalse(f.getIgnoreSurroundingSpaces());
        Assert.assertFalse(f.getIgnoreEmptyLines());
    }

    @Test
    public void testValueOfValid() {
        Assert.assertSame(CSVFormat.DEFAULT, CSVFormat.valueOf("Default"));
        Assert.assertSame(CSVFormat.EXCEL, CSVFormat.valueOf("Excel"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueOfInvalid() {
        CSVFormat.valueOf("InvalidName");
    }

    @Test
    public void testEqualsSameObject() {
        Assert.assertTrue(format.equals(format));
    }

    @Test
    public void testEqualsNull() {
        Assert.assertFalse(format.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() {
        Assert.assertFalse(format.equals("not a csvformat"));
    }

    @Test
    public void testEqualsDifferentDelimiter() {
        CSVFormat other = CSVFormat.newFormat(';');
        Assert.assertFalse(format.equals(other));
    }

    @Test
    public void testEqualsDifferentQuoteMode() {
        CSVFormat other = format.withQuoteMode(QuoteMode.ALL);
        Assert.assertNotEquals(format, other);
    }

    @Test
    public void testEqualsDifferentQuoteChar() {
        CSVFormat other = format.withQuote('*');
        Assert.assertNotEquals(format, other);
    }

    @Test
    public void testEqualsDifferentCommentMarker() {
        CSVFormat other = format.withCommentMarker('#');
        Assert.assertNotEquals(format, other);
    }

    @Test
    public void testEqualsDifferentEscapeChar() {
        CSVFormat other = format.withEscape('\\');
        Assert.assertNotEquals(format, other);
    }

    @Test
    public void testEqualsDifferentNullString() {
        CSVFormat other = format.withNullString("NULL");
        Assert.assertNotEquals(format, other);
    }

    @Test
    public void testEqualsDifferentHeader() {
        CSVFormat other = format.withHeader("a", "b");
        Assert.assertNotEquals(format, other);
    }

    @Test
    public void testEqualsDifferentIgnoreSurroundingSpaces() {
        CSVFormat other = format.withIgnoreSurroundingSpaces(true);
        Assert.assertNotEquals(format, other);
    }

    @Test
    public void testEqualsDifferentIgnoreEmptyLines() {
        CSVFormat other = format.withIgnoreEmptyLines(true);
        Assert.assertNotEquals(format, other);
    }

    @Test
    public void testEqualsDifferentSkipHeaderRecord() {
        CSVFormat other = format.withSkipHeaderRecord();
        Assert.assertNotEquals(format, other);
    }

    @Test
    public void testEqualsDifferentRecordSeparator() {
        CSVFormat other = format.withRecordSeparator(";");
        Assert.assertNotEquals(format, other);
    }

    @Test
    public void testEqualsSame() {
        CSVFormat other = CSVFormat.DEFAULT;
        Assert.assertEquals(format, other);
    }

    @Test
    public void testHashCodeConsistency() {
        int hash1 = format.hashCode();
        int hash2 = format.withDelimiter(',').hashCode();
        Assert.assertEquals(hash1, hash2);
    }

    @Test
    public void testFormatSimple() throws IOException {
        String result = format.format("a", "b", "c");
        Assert.assertEquals("a,b,c", result);
    }

    @Test
    public void testFormatNullValue() throws IOException {
        Object[] values = null;
        Assert.assertNull(format.format(values));
    }

    @Test
    public void testFormatSingleValue() throws IOException {
        Assert.assertEquals("hello", format.format("hello"));
    }

    @Test
    public void testFormatEscapesComma() throws IOException {
        Assert.assertEquals("\"a,b\"", format.format("a,b"));
    }

    @Test
    public void testFormatEscapesQuote() throws IOException {
        Assert.assertEquals("\"a\"\"b\"", format.format("a\"b"));
    }

    @Test
    public void testFormatEscapesNewline() throws IOException {
        String s = "a" + NL + "b";
        Assert.assertEquals("\"a" + NL + "b\"", format.format(s));
    }

    @Test
    public void testFormatNullString() throws IOException {
        CSVFormat f = format.withNullString("NULL");
        String result = f.format((Object) null);
        Assert.assertEquals("NULL", result);
    }

    @Test
    public void testFormatDelimiterOnly() throws IOException {
        CSVFormat f = format.withDelimiter(';');
        Assert.assertEquals("a;b", f.format("a", "b"));
    }

    @Test
    public void testGetAllowMissingColumnNamesDefault() {
        Assert.assertFalse(format.getAllowMissingColumnNames());
    }

    @Test
    public void testWithAllowMissingColumnNames() {
        CSVFormat f = format.withAllowMissingColumnNames();
        Assert.assertTrue(f.getAllowMissingColumnNames());
    }

    @Test
    public void testWithCommentMarkerChar() {
        CSVFormat f = format.withCommentMarker('#');
        Assert.assertEquals(Character.valueOf('#'), f.getCommentMarker());
    }

    @Test
    public void testWithCommentMarkerCharLineBreak() {
        try {
            format.withCommentMarker('\n');
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testWithCommentMarkerNull() {
        CSVFormat f = format.withCommentMarker((Character) null);
        Assert.assertFalse(f.isCommentMarkerSet());
    }

    @Test
    public void testGetDelimiterDefault() {
        Assert.assertEquals(',', format.getDelimiter());
    }

    @Test
    public void testWithDelimiter() {
        CSVFormat f = format.withDelimiter(';');
        Assert.assertEquals(';', f.getDelimiter());
    }

    @Test
    public void testWithDelimiterLineBreakThrows() {
        try {
            format.withDelimiter('\n');
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testWithEscapeChar() {
        CSVFormat f = format.withEscape('\\');
        Assert.assertEquals(Character.valueOf('\\'), f.getEscapeCharacter());
    }

    @Test
    public void testWithEscapeCharLineBreakThrows() {
        try {
            format.withEscape('\n');
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testWithEscapeCharacterNull() {
        CSVFormat f = format.withEscape((Character) null);
        Assert.assertFalse(f.isEscapeCharacterSet());
    }

    @Test
    public void testWithFirstRecordAsHeader() {
        CSVFormat f = format.withFirstRecordAsHeader();
        Assert.assertTrue(f.getSkipHeaderRecord());
        String[] header = f.getHeader();
        Assert.assertNotNull(header);
        Assert.assertEquals(0, header.length);
    }

    @Test
    public void testWithHeaderClass() {
        CSVFormat f = format.withHeader(HeaderClass.class);
        String[] header = f.getHeader();
        Assert.assertArrayEquals(new String[]{"col1", "col2"}, header);
    }

    @Test
    public void testWithHeaderClassNull() {
        CSVFormat f = format.withHeader((Class<?>) null);
        Assert.assertNull(f.getHeader());
    }

    @Test
    public void testWithHeaderResultSet() throws SQLException {
        java.sql.ResultSet rs = createMockResultSet();
        CSVFormat f = format.withHeader(rs);
        Assert.assertArrayEquals(new String[]{"id", "name"}, f.getHeader());
    }

    @Test
    public void testWithHeaderResultSetNull() throws SQLException {
        CSVFormat f = format.withHeader((ResultSet) null);
        Assert.assertNull(f.getHeader());
    }

    @Test
    public void testWithHeaderMetaData() throws SQLException {
        java.sql.ResultSetMetaData meta = createMockMetaData();
        CSVFormat f = format.withHeader(meta);
        Assert.assertArrayEquals(new String[]{"id", "name"}, f.getHeader());
    }

    @Test
    public void testWithHeaderMetaDataNull() throws SQLException {
        CSVFormat f = format.withHeader((ResultSetMetaData) null);
        Assert.assertNull(f.getHeader());
    }

    @Test
    public void testWithHeaderVarargs() {
        CSVFormat f = format.withHeader("a", "b");
        Assert.assertArrayEquals(new String[]{"a", "b"}, f.getHeader());
    }

    @Test
    public void testWithHeaderEmpty() {
        CSVFormat f = format.withHeader();
        String[] header = f.getHeader();
        Assert.assertNotNull(header);
        Assert.assertEquals(0, header.length);
        Assert.assertTrue(f.getSkipHeaderRecord());
    }

    @Test
    public void testWithHeaderDuplicateThrows() {
        try {
            format.withHeader("a", "a");
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testWithHeaderComments() {
        CSVFormat f = format.withHeaderComments("comment");
        Assert.assertArrayEquals(new Object[]{"comment"}, f.getHeaderComments());
    }

    @Test
    public void testWithIgnoreEmptyLines() {
        CSVFormat f = format.withIgnoreEmptyLines(true);
        Assert.assertTrue(f.getIgnoreEmptyLines());
    }

    @Test
    public void testWithIgnoreEmptyLinesSet() {
        CSVFormat f = format.withIgnoreEmptyLines();
        Assert.assertTrue(f.getIgnoreEmptyLines());
    }

    @Test
    public void testWithIgnoreHeaderCase() {
        CSVFormat f = format.withIgnoreHeaderCase();
        Assert.assertTrue(f.getIgnoreHeaderCase());
    }

    @Test
    public void testWithIgnoreHeaderCaseParam() {
        CSVFormat f = format.withIgnoreHeaderCase(false);
        Assert.assertFalse(f.getIgnoreHeaderCase());
    }

    @Test
    public void testWithIgnoreSurroundingSpaces() {
        CSVFormat f = format.withIgnoreSurroundingSpaces(true);
        Assert.assertTrue(f.getIgnoreSurroundingSpaces());
    }

    @Test
    public void testWithNullString() {
        CSVFormat f = format.withNullString("NIL");
        Assert.assertEquals("NIL", f.getNullString());
    }

    @Test
    public void testWithQuoteChar() {
        CSVFormat f = format.withQuote('*');
        Assert.assertEquals(Character.valueOf('*'), f.getQuoteCharacter());
    }

    @Test
    public void testWithQuoteCharLineBreakThrows() {
        try {
            format.withQuote('\n');
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testWithQuoteCharacterNull() {
        CSVFormat f = format.withQuote((Character) null);
        Assert.assertFalse(f.isQuoteCharacterSet());
    }

    @Test
    public void testWithQuoteMode() {
        CSVFormat f = format.withQuoteMode(QuoteMode.ALL);
        Assert.assertEquals(QuoteMode.ALL, f.getQuoteMode());
    }

    @Test
    public void testWithQuoteModeNull() {
        CSVFormat f = format.withQuoteMode((QuoteMode) null);
        Assert.assertNull(f.getQuoteMode());
    }

    @Test
    public void testWithRecordSeparatorChar() {
        CSVFormat f = format.withRecordSeparator(';');
        Assert.assertEquals(";", f.getRecordSeparator());
    }

    @Test
    public void testWithRecordSeparatorString() {
        CSVFormat f = format.withRecordSeparator("--");
        Assert.assertEquals("--", f.getRecordSeparator());
    }

    @Test
    public void testWithRecordSeparatorNull() {
        CSVFormat f = format.withRecordSeparator((String) null);
        Assert.assertNull(f.getRecordSeparator());
    }

    @Test
    public void testWithSkipHeaderRecord() {
        CSVFormat f = format.withSkipHeaderRecord();
        Assert.assertTrue(f.getSkipHeaderRecord());
    }

    @Test
    public void testWithSkipHeaderRecordFalse() {
        CSVFormat f = format.withSkipHeaderRecord(false);
        Assert.assertFalse(f.getSkipHeaderRecord());
    }

    @Test
    public void testWithTrailingDelimiter() {
        CSVFormat f = format.withTrailingDelimiter();
        Assert.assertTrue(f.getTrailingDelimiter());
    }

    @Test
    public void testWithTrailingDelimiterFalse() {
        CSVFormat f = format.withTrailingDelimiter(true);
        Assert.assertTrue(f.getTrailingDelimiter());
    }

    @Test
    public void testWithTrim() {
        CSVFormat f = format.withTrim();
        Assert.assertTrue(f.getTrim());
    }

    @Test
    public void testWithTrimFalse() {
        CSVFormat f = format.withTrim(false);
        Assert.assertFalse(f.getTrim());
    }

    @Test
    public void testSkipHeaderRecordInToString() {
        CSVFormat f = format.withSkipHeaderRecord();
        Assert.assertTrue(f.toString().contains("skipHeaderRecord"));
    }

    @Test
    public void testToStringIncludesDelimiter() {
        String str = format.withDelimiter(';').toString();
        Assert.assertTrue(str.contains("delimiter="));
    }

    @Test
    public void testToStringQuotes() {
        String str = CSVFormat.DEFAULT.toString();
        Assert.assertTrue(str.contains("quoteCharacter="));
        Assert.assertTrue(str.contains("recordSeparator="));
    }

    @Test
    public void testPrintWithNullValueAllQuoteMode() throws IOException {
        CSVFormat f = format.withQuoteMode(QuoteMode.ALL);
        StringWriter w = new StringWriter();
        CSVPrinter p = f.print(w);
        p.printRecord(new Object[]{null});
        Assert.assertEquals("\"\"\r\n", w.toString());
    }

    @Test
    public void testPrintWithNullValueNullQuoteMode() throws IOException {
        CSVFormat f = format.withQuoteMode(QuoteMode.NONE).withNullString("NULL");
        StringWriter w = new StringWriter();
        CSVPrinter p = f.print(w);
        p.printRecord(new Object[]{null});
        Assert.assertEquals("NULL\r\n", w.toString());
    }

    @Test
    public void testPrintEscapeWithEscapeChar() throws IOException {
        CSVFormat f = format.withEscape('\\').withQuote(null);
        StringWriter w = new StringWriter();
        CSVPrinter p = f.print(w);
        p.printRecord("a,b");
        Assert.assertEquals("a\\,b\r\n", w.toString());
    }

    @Test
    public void testPrintWithCRLF() throws IOException {
        CSVFormat f = format.withRecordSeparator("\r\n");
        StringWriter w = new StringWriter();
        CSVPrinter p = f.print(w);
        p.printRecord("a", "b");
        Assert.assertEquals("a,b\r\n", w.toString());
    }

    @Test
    public void testPrintWithLF() throws IOException {
        CSVFormat f = format.withRecordSeparator("\n");
        StringWriter w = new StringWriter();
        CSVPrinter p = f.print(w);
        p.printRecord("a", "b");
        Assert.assertEquals("a,b\n", w.toString());
    }

    @Test
    public void testPrintWithQuoteModeAll() throws IOException {
        CSVFormat f = format.withQuoteMode(QuoteMode.ALL);
        StringWriter w = new StringWriter();
        CSVPrinter p = f.print(w);
        p.printRecord("a", "b");
        Assert.assertEquals("\"a\",\"b\"\r\n", w.toString());
    }

    @Test
    public void testPrintWithQuoteModeNonNumeric() throws IOException {
        CSVFormat f = format.withQuoteMode(QuoteMode.NON_NUMERIC);
        StringWriter w = new StringWriter();
        CSVPrinter p = f.print(w);
        p.printRecord("a", 1);
        Assert.assertEquals("\"a\",\"1\"\r\n", w.toString());
    }

    @Test
    public void testPrintWithQuoteModeNoQuote() throws IOException {
        CSVFormat f = format.withQuoteMode(QuoteMode.NONE);
        StringWriter w = new StringWriter();
        CSVPrinter p = f.print(w);
        try {
            p.printRecord("a\"b");
            Assert.fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
        }
    }

    @Test
    public void testPrintWithEscapeAndQuote() throws IOException {
        CSVFormat f = format.withEscape('\\');
        StringWriter w = new StringWriter();
        CSVPrinter p = f.print(w);
        p.printRecord("a\"b");
        Assert.assertEquals("\"a\"\"b\"\r\n", w.toString());
    }

    @Test
    public void testPrintWithCommentMarker() throws IOException {
        CSVFormat f = format.withCommentMarker('#');
        StringWriter w = new StringWriter();
        CSVPrinter p = f.print(w);
        p.printComment("comment");
        Assert.assertEquals("#comment\r\n", w.toString());
    }

    @Test
    public void testPrintWithEscapeSpecial() throws IOException {
        CSVFormat f = format.withEscape('\\').withQuote(null);
        StringWriter w = new StringWriter();
        CSVPrinter p = f.print(w);
        p.print("a,b");
        p.close();
        Assert.assertEquals("a\\,b", w.toString());
    }
    
    @Test
    public void testFormatWithNullStringSet() throws IOException {
        CSVFormat f = format.withNullString("NIL");
        String result = f.format(new Object[]{null});
        Assert.assertEquals("NIL", result);
    }

    @Test
    public void testFormatWithEscapeCharacter() throws IOException {
        CSVFormat f = format.withEscape('\\').withQuote(null);
        String result = f.format("a,b");
        Assert.assertEquals("a\\,b", result);
    }

    @Test
    public void testFormatWithQuoteNull() throws IOException {
        CSVFormat f = format.withQuote(null);
        Assert.assertFalse(f.isQuoteCharacterSet());
        String result = f.format("a,b");
        Assert.assertEquals("a,b", result);
    }

    @Test
    public void testParse() throws IOException {
        CSVParser parser = format.parse(new StringReader("a,b,c"));
        List<CSVRecord> records = parser.getRecords();
        Assert.assertEquals(1, records.size());
        CSVRecord rec = records.get(0);
        Assert.assertEquals(3, rec.size());
        Assert.assertEquals("a", rec.get(0));
        Assert.assertEquals("b", rec.get(1));
        Assert.assertEquals("c", rec.get(2));
    }

    @Test
    public void testParseEmpty() throws IOException {
        CSVParser parser = format.parse(new StringReader(""));
        List<CSVRecord> records = parser.getRecords();
        Assert.assertTrue(records.isEmpty());
    }

    @Test
    public void testParseWithHeader() throws IOException {
        CSVFormat f = format.withHeader("col1", "col2");
        CSVParser parser = f.parse(new StringReader("1,2"));
        CSVRecord rec = parser.iterator().next();
        Assert.assertEquals("1", rec.get("col1"));
        Assert.assertEquals("2", rec.get("col2"));
    }
    
    // Helper methods for ResultSet mocking (inside same class)
    private ResultSet createMockResultSet() throws SQLException {
        return new ResultSetStub();
    }

    private ResultSetMetaData createMockMetaData() throws SQLException {
        return new ResultSetMetaDataStub();
    }

    private enum HeaderClass {
        col1, col2
    }

    static class ResultSetMetaDataStub extends java.sql.ResultSetMetaData {
        @Override
        public int getColumnCount() { return 2; }
        @Override
        public String getColumnLabel(int column) { return column == 1 ? "id" : "name"; }
        @Override
        public boolean isAutoIncrement(int column) { return false; }
        @Override
        public boolean isCaseSensitive(int column) { return false; }
        @Override
        public boolean isSearchable(int column) { return false; }
        @Override
        public boolean isCurrency(int column) { return false; }
        @Override
        public int isNullable(int column) { return columnNullable; }
        @Override
        public boolean isSigned(int column) { return false; }
        @Override
        public int getColumnDisplaySize(int column) { return 10; }
        @Override
        public String getColumnLabel(int column) throws SQLException { return column == 1 ? "id" : "name"; }
        @Override
        public String getColumnName(int column) { return column == 1 ? "id" : "name"; }
        @Override
        public String getSchemaName(int column) { return ""; }
        @Override
        public int getPrecision(int column) { return 10; }
        @Override
        public int getScale(int column) { return 0; }
        @Override
        public String getTableName(int column) { return ""; }
        @Override
        public String getCatalogName(int column) { return ""; }
        @Override
        public int getColumnType(int column) { return java.sql.Types.VARCHAR; }
        @Override
        public String getColumnTypeName(int column) { return "VARCHAR"; }
        @Override
        public boolean isReadOnly(int column) { return false; }
        @Override
        public boolean isWritable(int column) { return false; }
        @Override
        public boolean isDefinitelyWritable(int column) { return false; }
        @Override
        public String getColumnClassName(int column) { return "java.lang.String"; }
        @Override
        public <T> T unwrap(Class<T> iface) throws SQLException { return null; }
        @Override
        public boolean isWrapperFor(Class<?> iface) throws SQLException { return false; }
    }

    static class ResultSetStub extends java.sql.ResultSet {
        private boolean hasNext = true;
        @Override
        public boolean next() throws SQLException { 
            if (hasNext) { hasNext = false; return true; } 
            return false; 
        }
        @Override
        public ResultSetMetaData getMetaData() throws SQLException { return createMockMetaData(); }
        // Implement abstract methods with dummies
        @Override public void close() throws SQLException {}
        @Override public boolean wasNull() throws SQLException { return false; }
        @Override public java.sql.Date getDate(int columnIndex) throws SQLException { return null; }
        @Override public java.sql.Time getTime(int columnIndex) throws SQLException { return null; }
        @Override public java.sql.Timestamp getTimestamp(int columnIndex) throws SQLException { return null; }
        @Override public String getString(int columnIndex) throws SQLException { return null; }
        @Override public boolean getBoolean(int columnIndex) throws SQLException { return false; }
        @Override public byte getByte(int columnIndex) throws SQLException { return 0; }
        @Override public short getShort(int columnIndex) throws SQLException { return 0; }
        @Override public int getInt(int columnIndex) throws SQLException { return 0; }
        @Override public long getLong(int columnIndex) throws SQLException { return 0; }
        @Override public float getFloat(int columnIndex) throws SQLException { return 0; }
        @Override public double getDouble(int columnIndex) throws SQLException { return 0; }
        @Override public byte[] getBytes(int columnIndex) throws SQLException { return null; }
        @Override public java.io.InputStream getAsciiStream(int columnIndex) throws SQLException { return null; }
        @Override public java.io.InputStream getUnicodeStream(int columnIndex) throws SQLException { return null; }
        @Override public java.io.InputStream getBinaryStream(int columnIndex) throws SQLException { return null; }
        @Override public Object getObject(int columnIndex) throws SQLException { return null; }
        @Override public String getString(String columnLabel) throws SQLException { return null; }
        @Override public boolean getBoolean(String columnLabel) throws SQLException { return false; }
        @Override public byte getByte(String columnLabel) throws SQLException { return 0; }
        @Override public short getShort(String columnLabel) throws SQLException { return 0; }
        @Override public int getInt(String columnLabel) throws SQLException { return 0; }
        @Override public long getLong(String columnLabel) throws SQLException { return 0; }
        @Override public float getFloat(String columnLabel) throws SQLException { return 0; }
        @Override public double getDouble(String columnLabel) throws SQLException { return 0; }
        @Override public byte[] getBytes(String columnLabel) throws SQLException { return null; }
        @Override public java.sql.Date getDate(String columnLabel) throws SQLException { return null; }
        @Override public java.sql.Time getTime(String columnLabel) throws SQLException { return null; }
        @Override public java.sql.Timestamp getTimestamp(String columnLabel) throws SQLException { return null; }
        @Override public java.io.InputStream getAsciiStream(String columnLabel) throws SQLException { return null; }
        @Override public java.io.InputStream getUnicodeStream(String columnLabel) throws SQLException { return null; }
        @Override public java.io.InputStream getBinaryStream(String columnLabel) throws SQLException { return null; }
        @Override public Object getObject(String columnLabel) throws SQLException { return null; }
        @Override public int findColumn(String columnLabel) throws SQLException { return 1; }
        @Override public boolean first() throws SQLException { return false; }
        @Override public boolean isFirst() throws SQLException { return false; }
        @Override public boolean isLast() throws SQLException { return false; }
        @Override public boolean last() throws SQLException { return false; }
        @Override public boolean beforeFirst() throws SQLException { return false; }
        @Override public boolean afterLast() throws SQLException { return false; }
        @Override public boolean absolute(int row) throws SQLException { return false; }
        @Override public boolean relative(int rows) throws SQLException { return false; }
        @Override public boolean previous() throws SQLException { return false; }
        @Override public int getRow() throws SQLException { return 0; }
        @Override public boolean isBeforeFirst() throws SQLException { return false; }
        @Override public boolean isAfterLast() throws SQLException { return false; }
        @Override public boolean isClosed() throws SQLException { return false; }
        @Override public java.util.Map<String, Class<?>> getTypeMap() throws SQLException { return null; }
        @Override public java.sql.Statement getStatement() throws SQLException { return null; }
        @Override public int getFetchDirection() throws SQLException { return 0; }
        @Override public void setFetchDirection(int direction) throws SQLException {}
        @Override public int getFetchSize() throws SQLException { return 0; }
        @Override public void setFetchSize(int rows) throws SQLException {}
        @Override public java.io.Reader getCharacterStream(int columnIndex) throws SQLException { return null; }
        @Override public int getHoldability() throws SQLException { return 0; }
        @Override public java.io.Reader getCharacterStream(String columnLabel) throws SQLException { return null; }
        @Override public java.math.BigDecimal getBigDecimal(int columnIndex) throws SQLException { return null; }
        @Override public java.sql.Ref getRef(int columnIndex) throws SQLException { return null; }
        @Override public java.sql.Blob getBlob(int columnIndex) throws SQLException { return null; }
        @Override public java.sql.Clob getClob(int columnIndex) throws SQLException { return null; }
        @Override public java.sql.Array getArray(int columnIndex) throws SQLException { return null; }
        @Override public java.sql.Blob getBlob(String columnLabel) throws SQLException { return null; }
        @Override public java.sql.Clob getClob(String columnLabel) throws SQLException { return null; }
        @Override public java.sql.Array getArray(String columnLabel) throws SQLException { return null; }
        @Override public java.sql.Date getDate(int columnIndex, java.util.Calendar cal) throws SQLException { return null; }
        @Override public java.sql.Date getDate(String columnLabel, java.util.Calendar cal) throws SQLException { return null; }
        @Override public java.sql.Time getTime(int columnIndex, java.util.Calendar cal) throws SQLException { return null; }
        @Override public java.sql.Time getTime(String columnLabel, java.util.Calendar cal) throws SQLException { return null; }
        @Override public java.sql.Timestamp getTimestamp(int columnIndex, java.util.Calendar cal) throws SQLException { return null; }
        @Override public java.sql.Timestamp getTimestamp(String columnLabel, java.util.Calendar cal) throws SQLException { return null; }
        @Override public java.sql.Ref getRef(String columnLabel) throws SQLException { return null; }
        @Override public java.math.BigDecimal getBigDecimal(String columnLabel) throws SQLException { return null; }
        @Override public void updateNull(int columnIndex) throws SQLException {}
        @Override public void updateBoolean(int columnIndex, boolean x) throws SQLException {}
        @Override public void updateByte(int columnIndex, byte x) throws SQLException {}
        @Override public void updateShort(int columnIndex, short x) throws SQLException {}
        @Override public void updateInt(int columnIndex, int x) throws SQLException {}
        @Override public void updateLong(int columnIndex, long x) throws SQLException {}
        @Override public void updateFloat(int columnIndex, float x) throws SQLException {}
        @Override public void updateDouble(int columnIndex, double x) throws SQLException {}
        @Override public void updateBigDecimal(int columnIndex, java.math.BigDecimal x) throws SQLException {}
        @Override public void updateString(int columnIndex, String x) throws SQLException {}
        @Override public void updateBytes(int columnIndex, byte[] x) throws SQLException {}
        @Override public void updateDate(int columnIndex, java.sql.Date x) throws SQLException {}
        @Override public void updateTime(int columnIndex, java.sql.Time x) throws SQLException {}
        @Override public void updateTimestamp(int columnIndex, java.sql.Timestamp x) throws SQLException {}
        @Override public void updateAsciiStream(int columnIndex, java.io.InputStream x, int length) throws SQLException {}
        @Override public void updateBinaryStream(int columnIndex, java.io.InputStream x, int length) throws SQLException {}
        @Override public void updateObject(int columnIndex, Object x, int scaleOrLength) throws SQLException {}
        @Override public void updateObject(int columnIndex, Object x) throws SQLException {}
        @Override public void updateNull(String columnLabel) throws SQLException {}
        @Override public void updateBoolean(String columnLabel, boolean x) throws SQLException {}
        @Override public void updateByte(String columnLabel, byte x) throws SQLException {}
        @Override public void updateShort(String columnLabel, short x) throws SQLException {}
        @Override public void updateInt(String columnLabel, int x) throws SQLException {}
        @Override public void updateLong(String columnLabel, long x) throws SQLException {}
        @Override public void updateFloat(String columnLabel, float x) throws SQLException {}
        @Override public void updateDouble(String columnLabel, double x) throws SQLException {}
        @Override public void updateBigDecimal(String columnLabel, java.math.BigDecimal x) throws SQLException {}
        @Override public void updateString(String columnLabel, String x) throws SQLException {}
        @Override public void updateBytes(String columnLabel, byte[] x) throws SQLException {}
        @Override public void updateDate(String columnLabel, java.sql.Date x) throws SQLException {}
        @Override public void updateTime(String columnLabel, java.sql.Time x) throws SQLException {}
        @Override public void updateTimestamp(String columnLabel, java.sql.Timestamp x) throws SQLException {}
        @Override public void updateAsciiStream(String columnLabel, java.io.InputStream x, int length) throws SQLException {}
        @Override public void updateBinaryStream(String columnLabel, java.io.InputStream x, int length) throws SQLException {}
        @Override public void updateObject(String columnLabel, Object x, int scaleOrLength) throws SQLException {}
        @Override public void updateObject(String columnLabel, Object x) throws SQLException {}
        @Override public void insertRow() throws SQLException {}
        @Override public void updateRow() throws SQLException {}
        @Override public void deleteRow() throws SQLException {}
        @Override public void refreshRow() throws SQLException {}
        @Override public void cancelRowUpdates() throws SQLException {}
        @Override public void moveToInsertRow() throws SQLException {}
        @Override public void moveToCurrentRow() throws SQLException {}
        @Override public java.sql.Statement getStatement() throws SQLException { return null; }
        @Override public void close() throws SQLException {}
        @Override public java.io.InputStream getAsciiStream(String columnLabel) throws SQLException { return null; }
        @Override public java.io.InputStream getBinaryStream(String columnLabel) throws SQLException { return null; }
        @Override public <T> T getObject(int columnIndex, Class<T> type) throws SQLException { return null; }
        @Override public <T> T getObject(String columnLabel, Class<T> type) throws SQLException { return null; }
        @Override public <T> T unwrap(Class<T> iface) throws SQLException { return null; }
        @Override public boolean isWrapperFor(Class<?> iface) throws SQLException { return false; }
    }
}