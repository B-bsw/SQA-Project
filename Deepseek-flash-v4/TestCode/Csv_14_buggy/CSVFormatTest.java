package org.apache.commons.csv;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;

import org.junit.Before;
import org.junit.Test;

public class CSVFormatTest {

    private CSVFormat format;

    @Before
    public void setUp() {
        format = CSVFormat.DEFAULT;
    }

    @Test
    public void testNewFormatValidDelimiter() {
        CSVFormat fmt = CSVFormat.newFormat('|');
        assertEquals('|', fmt.getDelimiter());
        assertFalse(fmt.isQuoteCharacterSet());
        assertFalse(fmt.isEscapeCharacterSet());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNewFormatInvalidDelimiter() {
        CSVFormat.newFormat('\n');
    }

    @Test
    public void testValueOfValidPredefined() {
        assertSame(CSVFormat.DEFAULT, CSVFormat.valueOf("Default"));
        assertSame(CSVFormat.EXCEL, CSVFormat.valueOf("Excel"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueOfInvalidFormat() {
        CSVFormat.valueOf("non-existent");
    }

    @Test
    public void testEqualsSameObject() {
        assertTrue(format.equals(format));
        assertEquals(format.hashCode(), format.hashCode());
    }

    @Test
    public void testEqualsNull() {
        assertFalse(format.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() {
        assertFalse(format.equals(new Object()));
    }

    @Test
    public void testEqualsDifferentDelimiter() {
        CSVFormat other = format.withDelimiter(';');
        assertFalse(format.equals(other));
    }

    @Test
    public void testEqualsSameProperties() {
        CSVFormat other = format.withDelimiter(format.getDelimiter())
                .withQuote(format.getQuoteCharacter())
                .withQuoteMode(format.getQuoteMode())
                .withCommentMarker(format.getCommentMarker())
                .withEscape(format.getEscapeCharacter())
                .withIgnoreSurroundingSpaces(format.getIgnoreSurroundingSpaces())
                .withIgnoreEmptyLines(format.getIgnoreEmptyLines())
                .withSkipHeaderRecord(format.getSkipHeaderRecord())
                .withRecordSeparator(format.getRecordSeparator())
                .withNullString(format.getNullString())
                .withTrailingDelimiter(format.getTrailingDelimiter())
                .withTrim(format.getTrim())
                .withIgnoreHeaderCase(format.getIgnoreHeaderCase())
                .withAllowMissingColumnNames(format.getAllowMissingColumnNames());
        assertEquals(format, other);
        assertEquals(format.hashCode(), other.hashCode());
    }

    @Test
    public void testFormatWithValues() throws IOException {
        StringWriter sw = new StringWriter();
        format.print("a", sw, true);
        format.print("b", sw, false);
        format.println(sw);
        assertEquals("a,b\r\n", sw.toString());
    }

    @Test
    public void testFormatWithNullValue() throws IOException {
        StringWriter sw = new StringWriter();
        format.print(null, sw, true);
        format.print("x", sw, false);
        format.println(sw);
        assertEquals(",x\r\n", sw.toString());
    }

    @Test
    public void testFormatWithNullValueAndNullString() throws IOException {
        CSVFormat fmt = format.withNullString("NULL");
        StringWriter sw = new StringWriter();
        fmt.print(null, sw, true);
        fmt.println(sw);
        assertEquals("NULL\r\n", sw.toString());
    }

    @Test
    public void testFormatWithQuoting() throws IOException {
        CSVFormat fmt = format.withQuote('"');
        StringWriter sw = new StringWriter();
        fmt.print("a,b", sw, true);
        fmt.println(sw);
        assertEquals("\"a,b\"\r\n", sw.toString());
    }

    @Test
    public void testFormatWithEscape() throws IOException {
        CSVFormat fmt = format.withEscape('\\');
        StringWriter sw = new StringWriter();
        fmt.print("a,b", sw, true);
        fmt.println(sw);
        assertEquals("a\\,b\r\n", sw.toString());
    }

    @Test
    public void testFormatWithTrailingDelimiter() throws IOException {
        CSVFormat fmt = format.withTrailingDelimiter();
        StringWriter sw = new StringWriter();
        fmt.print("a", sw, true);
        fmt.println(sw);
        assertEquals("a,\r\n", sw.toString());
    }

    @Test
    public void testFormatWithNewRecordFalse() throws IOException {
        StringWriter sw = new StringWriter();
        format.print("a", sw, false);
        format.print("b", sw, false);
        assertEquals("ab", sw.toString());
    }

    @Test(expected = IllegalStateException.class)
    public void testWithQuoteCharLineBreak() {
        format.withQuote('\n');
    }

    @Test(expected = IllegalStateException.class)
    public void testWithEscapeCharLineBreak() {
        format.withEscape('\r');
    }

    @Test(expected = IllegalStateException.class)
    public void testWithCommentMarkerLineBreak() {
        format.withCommentMarker('\n');
    }

    @Test
    public void testWithDelimiterSwappedWithQuote() {
        CSVFormat fmt = format.withDelimiter('"');
        assertEquals('"', fmt.getDelimiter());
        assertNull(fmt.getQuoteCharacter());
    }

    @Test
    public void testWithDelimiterSwappedWithEscape() {
        CSVFormat fmt = format.withDelimiter('\\');
        assertEquals('\\', fmt.getDelimiter());
        assertNull(fmt.getEscapeCharacter());
    }

    @Test
    public void testWithDelimiterSwappedWithComment() {
        CSVFormat fmt = format.withDelimiter('#');
        assertEquals('#', fmt.getDelimiter());
        assertNull(fmt.getCommentMarker());
    }

    @Test
    public void testWithQuoteAndCommentSame() {
        CSVFormat fmt = format.withQuote('#').withCommentMarker('#');
        assertNull(fmt.getQuoteCharacter());
    }

    @Test
    public void testWithNoEscapeWhenQuoteModeNone() {
        CSVFormat fmt = format.withQuoteMode(QuoteMode.NONE);
        assertNull(fmt.getEscapeCharacter());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithDuplicateHeaders() {
        format.withHeader("a", "a");
    }

    @Test
    public void testWithHeaderNull() {
        CSVFormat fmt = format.withHeader((String[]) null);
        assertNull(fmt.getHeader());
    }

    @Test
    public void testWithHeaderEnumClass() {
        CSVFormat fmt = format.withHeader(TestHeader.class);
        assertArrayEquals(new String[] {"A", "B"}, fmt.getHeader());
    }

    @Test
    public void testWithHeaderResultSet() throws SQLException {
        ResultSet rs = new MockResultSet();
        CSVFormat fmt = format.withHeader(rs);
        assertArrayEquals(new String[] {"COL1", "COL2"}, fmt.getHeader());
    }

    @Test
    public void testWithResultSetMetaData() throws SQLException {
        ResultSetMetaData md = new MockResultSetMetaData();
        CSVFormat fmt = format.withHeader(md);
        assertArrayEquals(new String[] {"COL1", "COL2"}, fmt.getHeader());
    }

    @Test
    public void testWithNullResultSet() throws SQLException {
        CSVFormat fmt = format.withHeader((ResultSet) null);
        assertNull(fmt.getHeader());
    }

    @Test
    public void testWithNullResultSetMetaData() throws SQLException {
        CSVFormat fmt = format.withHeader((ResultSetMetaData) null);
        assertNull(fmt.getHeader());
    }

    @Test
    public void testGetHeaderCommentsCopy() {
        CSVFormat fmt = format.withHeaderComments("h1", "h2");
        String[] comments = fmt.getHeaderComments();
        comments[0] = "changed";
        assertArrayEquals(new String[] {"h1", "h2"}, fmt.getHeaderComments());
    }

    @Test
    public void testGetHeaderNull() {
        assertNull(format.getHeader());
    }

    @Test
    public void testWithTrimAndIgnoreEmptyLines() {
        CSVFormat fmt = format.withTrim().withIgnoreEmptyLines(true);
        assertTrue(fmt.getTrim());
        assertTrue(fmt.getIgnoreEmptyLines());
    }

    @Test
    public void testWithSkipHeaderAndIgnoreCase() {
        CSVFormat fmt = format.withSkipHeaderRecord().withIgnoreHeaderCase();
        assertTrue(fmt.getSkipHeaderRecord());
        assertTrue(fmt.getIgnoreHeaderCase());
    }

    @Test
    public void testWithBooleanFlags() {
        CSVFormat fmt = format.withTrailingDelimiter(false)
                .withTrim(false)
                .withIgnoreSurroundingSpaces(false)
                .withIgnoreEmptyLines(false);
        assertFalse(fmt.getTrailingDelimiter());
        assertFalse(fmt.getTrim());
        assertFalse(fmt.getIgnoreSurroundingSpaces());
        assertFalse(fmt.getIgnoreEmptyLines());
    }

    @Test
    public void testPrintWithRecordSeparator() throws IOException {
        CSVFormat fmt = format.withRecordSeparator("|");
        StringWriter sw = new StringWriter();
        fmt.print("a", sw, true);
        fmt.println(sw);
        assertEquals("a|", sw.toString());
    }

    @Test
    public void testPrintCharRecordSeparator() throws IOException {
        CSVFormat fmt = format.withRecordSeparator(';');
        StringWriter sw = new StringWriter();
        fmt.print("a", sw, true);
        fmt.println(sw);
        assertEquals("a;", sw.toString());
    }

    @Test
    public void testParse() throws IOException {
        CSVParser parser = format.parse(new StringReader("a,b\r\n"));
        assertNotNull(parser);
    }

    @Test
    public void testPrintAppendable() throws IOException {
        CSVPrinter printer = format.print(new StringWriter());
        assertNotNull(printer);
    }

    @Test
    public void testPrintFile() throws IOException {
        java.io.File f = java.io.File.createTempFile("test", ".csv");
        try {
            CSVPrinter printer = format.print(f, StandardCharsets.UTF_8);
            assertNotNull(printer);
        } finally {
            f.delete();
        }
    }

    @Test(expected = IOException.class)
    public void testPrintInvalidPath() throws IOException {
        java.io.File f = new java.io.File("/proc/does-not-exist/test.csv");
        format.print(f, StandardCharsets.UTF_8);
    }

    @Test
    public void testQuoteModeAll() throws IOException {
        CSVFormat fmt = format.withQuote('"').withQuoteMode(QuoteMode.ALL);
        StringWriter sw = new StringWriter();
        fmt.print("abc", sw, true);
        fmt.println(sw);
        assertEquals("\"abc\"\r\n", sw.toString());
    }

    @Test
    public void testQuoteModeNonNumeric() throws IOException {
        CSVFormat fmt = format.withQuote('"').withQuoteMode(QuoteMode.NON_NUMERIC);
        StringWriter sw = new StringWriter();
        fmt.print(123, sw, true);
        fmt.print("abc", sw, false);
        fmt.println(sw);
        assertEquals("123\t\"abc\"\r\n", sw.toString());
    }

    @Test
    public void testQuoteModeMinimalNoQuoteNeeded() throws IOException {
        CSVFormat fmt = format.withQuote('"').withQuoteMode(QuoteMode.MINIMAL);
        StringWriter sw = new StringWriter();
        fmt.print("abc", sw, true);
        fmt.println(sw);
        assertEquals("abc\r\n", sw.toString());
    }

    @Test
    public void testQuoteModeMinimalWithSpecial() throws IOException {
        CSVFormat fmt = format.withQuote('"').withQuoteMode(QuoteMode.MINIMAL);
        StringWriter sw = new StringWriter();
        fmt.print("a,b", sw, true);
        fmt.println(sw);
        assertEquals("\"a,b\"\r\n", sw.toString());
    }

    private enum TestHeader {
        A, B;
    }

    private static class MockResultSet extends java.lang.Object implements ResultSet {
        private int row = 0;
        public boolean next() { return row++ == 0; }
        public ResultSetMetaData getMetaData() { return new MockResultSetMetaData(); }
        public void close() {}
        public boolean wasNull() { return false; }
        public String getString(int columnIndex) { return null; }
        public boolean getBoolean(int columnIndex) { return false; }
        public byte getByte(int columnIndex) { return 0; }
        public short getShort(int columnIndex) { return 0; }
        public int getInt(int columnIndex) { return 0; }
        public long getLong(int columnIndex) { return 0; }
        public float getFloat(int columnIndex) { return 0; }
        public double getDouble(int columnIndex) { return 0; }
        public java.math.BigDecimal getBigDecimal(int columnIndex, int scale) { return null; }
        public byte[] getBytes(int columnIndex) { return null; }
        public java.sql.Date getDate(int columnIndex) { return null; }
        public java.sql.Time getTime(int columnIndex) { return null; }
        public java.sql.Timestamp getTimestamp(int columnIndex) { return null; }
        public java.io.InputStream getAsciiStream(int columnIndex) { return null; }
        public java.io.InputStream getUnicodeStream(int columnIndex) { return null; }
        public java.io.Reader getCharacterStream(int columnIndex) { return null; }
        public java.math.BigDecimal getBigDecimal(int columnIndex) { return null; }
        public Object getObject(int columnIndex) { return null; }
        public String getString(String columnLabel) { return null; }
        public boolean getBoolean(String columnLabel) { return false; }
        public byte getByte(String columnLabel) { return 0; }
        public short getShort(String columnLabel) { return 0; }
        public int getInt(String columnLabel) { return 0; }
        public long getLong(String columnLabel) { return 0; }
        public float getFloat(String columnLabel) { return 0; }
        public double getDouble(String columnLabel) { return 0; }
        public java.math.BigDecimal getBigDecimal(String columnLabel, int scale) { return null; }
        public byte[] getBytes(String columnLabel) { return null; }
        public java.sql.Date getDate(String columnLabel) { return null; }
        public java.sql.Time getTime(String columnLabel) { return null; }
        public java.sql.Timestamp getTimestamp(String columnLabel) { return null; }
        public java.io.InputStream getAsciiStream(String columnLabel) { return null; }
        public java.io.InputStream getUnicodeStream(String columnLabel) { return null; }
        public java.io.Reader getCharacterStream(String columnLabel) { return null; }
        public java.math.BigDecimal getBigDecimal(String columnLabel) { return null; }
        public Object getObject(String columnLabel) { return null; }
        public int findColumn(String columnLabel) { return 0; }
        public java.io.Reader getNCharacterStream(int columnIndex) { return null; }
        public java.sql.NClob getNClob(int columnIndex) { return null; }
        public java.sql.SQLXML getSQLXML(int columnIndex) { return null; }
        public String getNString(int columnIndex) { return null; }
        public java.sql.Ref getRef(int columnIndex) { return null; }
        public java.sql.Blob getBlob(int columnIndex) { return null; }
        public java.sql.Clob getClob(int columnIndex) { return null; }
        public java.sql.Array getArray(int columnIndex) { return null; }
        public java.sql.Date getDate(int columnIndex, java.util.Calendar cal) { return null; }
        public java.sql.Time getTime(int columnIndex, java.util.Calendar cal) { return null; }
        public java.sql.Timestamp getTimestamp(int columnIndex, java.util.Calendar cal) { return null; }
        public java.sql.Ref getRef(String columnLabel) { return null; }
        public java.sql.Blob getBlob(String columnLabel) { return null; }
        public java.sql.Clob getClob(String columnLabel) { return null; }
        public java.sql.Array getArray(String columnLabel) { return null; }
        public java.sql.Date getDate(String columnLabel, java.util.Calendar cal) { return null; }
        public java.sql.Time getTime(String columnLabel, java.util.Calendar cal) { return null; }
        public java.sql.Timestamp getTimestamp(String columnLabel, java.util.Calendar cal) { return null; }
        public java.net.URL getURL(int columnIndex) { return null; }
        public java.net.URL getURL(String columnLabel) { return null; }
        public void updateRef(int columnIndex, java.sql.Ref x) {}
        public void updateRef(String columnLabel, java.sql.Ref x) {}
        public void updateBlob(int columnIndex, java.sql.Blob x) {}
        public void updateBlob(String columnLabel, java.sql.Blob x) {}
        public void updateClob(int columnIndex, java.sql.Clob x) {}
        public void updateClob(String columnLabel, java.sql.Clob x) {}
        public void updateArray(int columnIndex, java.sql.Array x) {}
        public void updateArray(String columnLabel, java.sql.Array x) {}
        public java.sql.RowId getRowId(int columnIndex) { return null; }
        public java.sql.RowId getRowId(String columnLabel) { return null; }
        public void updateRowId(int columnIndex, java.sql.RowId x) {}
        public void updateRowId(String columnLabel, java.sql.RowId x) {}
        public int getHoldability() { return 0; }
        public boolean isClosed() { return false; }
        public void updateNString(int columnIndex, String nString) {}
        public void updateNString(String columnLabel, String nString) {}
        public void updateNClob(int columnIndex, java.sql.NClob nClob) {}
        public void updateNClob(String columnLabel, java.sql.NClob nClob) {}
        public java.sql.NClob getNClob(String columnLabel) { return null; }
        public java.sql.SQLXML getSQLXML(String columnLabel) { return null; }
        public void updateSQLXML(int columnIndex, java.sql.SQLXML xmlObject) {}
        public void updateSQLXML(String columnLabel, java.sql.SQLXML xmlObject) {}
        public String getNString(String columnLabel) { return null; }
        public java.io.Reader getNCharacterStream(String columnLabel) { return null; }
        public void updateNCharacterStream(int columnIndex, java.io.Reader x, long length) {}
        public void updateNCharacterStream(String columnLabel, java.io.Reader reader, long length) {}
        public void updateAsciiStream(int columnIndex, java.io.InputStream x, long length) {}
        public void updateBinaryStream(int columnIndex, java.io.InputStream x, long length) {}
        public void updateCharacterStream(int columnIndex, java.io.Reader x, long length) {}
        public void updateAsciiStream(String columnLabel, java.io.InputStream x, long length) {}
        public void updateBinaryStream(String columnLabel, java.io.InputStream x, long length) {}
        public void updateCharacterStream(String columnLabel, java.io.Reader reader, long length) {}
        public void updateBlob(int columnIndex, java.io.InputStream inputStream, long length) {}
        public void updateBlob(String columnLabel, java.io.InputStream inputStream, long length) {}
        public void updateClob(int columnIndex, java.io.Reader reader, long length) {}
        public void updateClob(String columnLabel, java.io.Reader reader, long length) {}
        public void updateNClob(int columnIndex, java.io.Reader reader, long length) {}
        public void updateNClob(String columnLabel, java.io.Reader reader, long length) {}
        public void updateNCharacterStream(int columnIndex, java.io.Reader x) {}
        public void updateNCharacterStream(String columnLabel, java.io.Reader reader) {}
        public void updateAsciiStream(int columnIndex, java.io.InputStream x) {}
        public void updateBinaryStream(int columnIndex, java.io.InputStream x) {}
        public void updateCharacterStream(int columnIndex, java.io.Reader x) {}
        public void updateAsciiStream(String columnLabel, java.io.InputStream x) {}
        public void updateBinaryStream(String columnLabel, java.io.InputStream x) {}
        public void updateCharacterStream(String columnLabel, java.io.Reader reader) {}
        public void updateBlob(int columnIndex, java.io.InputStream inputStream) {}
        public void updateBlob(String columnLabel, java.io.InputStream inputStream) {}
        public void updateClob(int columnIndex, java.io.Reader reader) {}
        public void updateClob(String columnLabel, java.io.Reader reader) {}
        public void updateNClob(int columnIndex, java.io.Reader reader) {}
        public void updateNClob(String columnLabel, java.io.Reader reader) {}
        public boolean getBoolean(String columnLabel, Class<?> type) { return false; }
        public byte getByte(String columnLabel, Class<?> type) { return 0; }
        public short getShort(String columnLabel, Class<?> type) { return 0; }
        public int getInt(String columnLabel, Class<?> type) { return 0; }
        public long getLong(String columnLabel, Class<?> type) { return 0; }
        public float getFloat(String columnLabel, Class<?> type) { return 0; }
        public double getDouble(String columnLabel, Class<?> type) { return 0; }
        public java.math.BigDecimal getBigDecimal(String columnLabel, Class<?> type) { return null; }
        public java.sql.Date getDate(String columnLabel, Class<?> type) { return null; }
        public java.sql.Time getTime(String columnLabel, Class<?> type) { return null; }
        public java.sql.Timestamp getTimestamp(String columnLabel, Class<?> type) { return null; }
        public Object getObject(String columnLabel, Class<?> type) { return null; }
        public Object getObject(String columnLabel, java.util.Map<String,Class<?>> map) { return null; }
        public Object getObject(int columnIndex, java.util.Map<String,Class<?>> map) { return null; }
        public Object getObject(int columnIndex, Class<?> type) { return null; }
        public boolean isBeforeFirst() { return false; }
        public boolean isAfterLast() { return false; }
        public boolean isFirst() { return false; }
        public boolean isLast() { return false; }
        public void beforeFirst() {}
        public void afterLast() {}
        public boolean first() { return false; }
        public boolean last() { return false; }
        public int getRow() { return 0; }
        public boolean absolute(int row) { return false; }
        public boolean relative(int rows) { return false; }
        public boolean previous() { return false; }
        public void setFetchDirection(int direction) {}
        public int getFetchDirection() { return 0; }
        public void setFetchSize(int rows) {}
        public int getFetchSize() { return 0; }
        public int getType() { return 0; }
        public int getConcurrency() { return 0; }
        public boolean rowUpdated() { return false; }
        public boolean rowInserted() { return false; }
        public boolean rowDeleted() { return false; }
        public void updateNull(int columnIndex) {}
        public void updateNull(String columnLabel) {}
        public void updateBoolean(int columnIndex, boolean x) {}
        public void updateBoolean(String columnLabel, boolean x) {}
        public void updateByte(int columnIndex, byte x) {}
        public void updateByte(String columnLabel, byte x) {}
        public void updateShort(int columnIndex, short x) {}
        public void updateShort(String columnLabel, short x) {}
        public void updateInt(int columnIndex, int x) {}
        public void updateInt(String columnLabel, int x) {}
        public void updateLong(int columnIndex, long x) {}
        public void updateLong(String columnLabel, long x) {}
        public void updateFloat(int columnIndex, float x) {}
        public void updateFloat(String columnLabel, float x) {}
        public void updateDouble(int columnIndex, double x) {}
        public void updateDouble(String columnLabel, double x) {}
        public void updateBigDecimal(int columnIndex, java.math.BigDecimal x) {}
        public void updateBigDecimal(String columnLabel, java.math.BigDecimal x) {}
        public void updateString(int columnIndex, String x) {}
        public void updateString(String columnLabel, String x) {}
        public void updateBytes(int columnIndex, byte[] x) {}
        public void updateBytes(String columnLabel, byte[] x) {}
        public void updateDate(int columnIndex, java.sql.Date x) {}
        public void updateDate(String columnLabel, java.sql.Date x) {}
        public void updateTime(int columnIndex, java.sql.Time x) {}
        public void updateTime(String columnLabel, java.sql.Time x) {}
        public void updateTimestamp(int columnIndex, java.sql.Timestamp x) {}
        public void updateTimestamp(String columnLabel, java.sql.Timestamp x) {}
        public void updateAsciiStream(int columnIndex, java.io.InputStream x, int length) {}
        public void updateAsciiStream(String columnLabel, java.io.InputStream x, int length) {}
        public void updateBinaryStream(int columnIndex, java.io.InputStream x, int length) {}
        public void updateBinaryStream(String columnLabel, java.io.InputStream x, int length) {}
        public void updateCharacterStream(int columnIndex, java.io.Reader x, int length) {}
        public void updateCharacterStream(String columnLabel, java.io.Reader reader, int length) {}
        public void updateObject(int columnIndex, Object x, int scaleOrLength) {}
        public void updateObject(int columnIndex, Object x) {}
        public void updateObject(String columnLabel, Object x, int scaleOrLength) {}
        public void updateObject(String columnLabel, Object x) {}
        public void insertRow() {}
        public void updateRow() {}
        public void deleteRow() {}
        public void refreshRow() {}
        public void cancelRowUpdates() {}
        public void moveToInsertRow() {}
        public void moveToCurrentRow() {}
        public java.sql.Statement getStatement() { return null; }
        public Object getObject(int columnIndex, java.util.Map<String,Class<?>> map) { return null; }
        public <T> T unwrap(Class<T> iface) { return null; }
        public boolean isWrapperFor(Class<?> iface) { return false; }
    }

    private static class MockResultSetMetaData extends java.lang.Object implements ResultSetMetaData {
        private String[] names = {"COL1", "COL2"};
        public int getColumnCount() { return names.length; }
        public boolean isAutoIncrement(int column) { return false; }
        public boolean isCaseSensitive(int column) { return false; }
        public boolean isSearchable(int column) { return false; }
        public boolean isCurrency(int column) { return false; }
        public int isNullable(int column) { return 0; }
        public boolean isSigned(int column) { return false; }
        public int getColumnDisplaySize(int column) { return 0; }
        public String getColumnLabel(int column) { return names[column - 1]; }
        public String getColumnName(int column) { return names[column - 1]; }
        public String getSchemaName(int column) { return null; }
        public int getPrecision(int column) { return 0; }
        public int getScale(int column) { return 0; }
        public String getTableName(int column) { return null; }
        public String getCatalogName(int column) { return null; }
        public int getColumnType(int column) { return Types.VARCHAR; }
        public String getColumnTypeName(int column) { return "VARCHAR"; }
        public boolean isReadOnly(int column) { return false; }
        public boolean isWritable(int column) { return false; }
        public boolean isDefinitelyWritable(int column) { return false; }
        public String getColumnClassName(int column) { return "java.lang.String"; }
        public <T> T unwrap(Class<T> iface) { return null; }
        public boolean isWrapperFor(Class<?> iface) { return false; }
    }
}