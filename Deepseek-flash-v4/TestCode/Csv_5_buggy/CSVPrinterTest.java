package org.apache.commons.csv;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.io.StringWriter;

import org.junit.Before;
import org.junit.Test;

public class CSVPrinterTest {

    private StringWriter writer;
    private CSVPrinter printer;

    @Before
    public void setUp() throws IOException {
        writer = new StringWriter();
    }

    @Test
    public void testPrintNullValue() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT;
        printer = new CSVPrinter(writer, format);
        printer.print(null);
        printer.flush();
        assertEquals("", writer.toString());
    }

    @Test
    public void testPrintNullValueWithNullString() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");
        printer = new CSVPrinter(writer, format);
        printer.print(null);
        printer.flush();
        assertEquals("NULL", writer.toString());
    }

    @Test
    public void testPrintWithDelimiter() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withDelimiter(',');
        printer = new CSVPrinter(writer, format);
        printer.print("a");
        printer.print("b");
        printer.flush();
        assertEquals("a,b", writer.toString());
    }

    @Test
    public void testPrintWithQuotingAndQuoteCharInValue() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withQuote('"');
        printer = new CSVPrinter(writer, format);
        printer.print("a\"b");
        printer.flush();
        assertEquals("\"a\"\"b\"", writer.toString());
    }

    @Test
    public void testPrintWithLineSeparatorInValue() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT;
        printer = new CSVPrinter(writer, format);
        printer.print("a\nb");
        printer.flush();
        assertEquals("\"a\nb\"", writer.toString());
    }

    @Test
    public void testPrintWithCarriageReturnInValue() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT;
        printer = new CSVPrinter(writer, format);
        printer.print("a\rb");
        printer.flush();
        assertEquals("\"a\rb\"", writer.toString());
    }

    @Test
    public void testPrintWithEscapingAndSpecialChars() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withEscape('\\').withQuoting(false);
        printer = new CSVPrinter(writer, format);
        printer.print("a\nb");
        printer.flush();
        assertEquals("a\\nb", writer.toString());
    }

    @Test
    public void testPrintFirstValueNeedsQuotingDueToCommentChar() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withCommentStart('#');
        printer = new CSVPrinter(writer, format);
        printer.print("#start");
        printer.flush();
        assertEquals("\"#start\"", writer.toString());
    }

    @Test
    public void testPrintValueEndingWithSpaceNeedsQuoting() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT;
        printer = new CSVPrinter(writer, format);
        printer.print("end ");
        printer.flush();
        assertEquals("\"end \"", writer.toString());
    }

    @Test
    public void testPrintValueWithLeadingSpaceNeedsQuoting() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT;
        printer = new CSVPrinter(writer, format);
        printer.print(" start");
        printer.flush();
        assertEquals("\" start\"", writer.toString());
    }

    @Test
    public void testPrintEmptyValueInMiddleNeedsQuoting() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT;
        printer = new CSVPrinter(writer, format);
        printer.print("");
        printer.print("b");
        printer.flush();
        assertEquals("\"\",b", writer.toString());
    }

    @Test
    public void testPrintWithQuotePolicyAll() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withQuotePolicy(Quote.ALL);
        printer = new CSVPrinter(writer, format);
        printer.print("a");
        printer.flush();
        assertEquals("\"a\"", writer.toString());
    }

    @Test
    public void testPrintWithQuotePolicyNonNumeric() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withQuotePolicy(Quote.NON_NUMERIC);
        printer = new CSVPrinter(writer, format);
        printer.print("a");
        printer.print(123);
        printer.flush();
        assertEquals("\"a\",123", writer.toString());
    }

    @Test
    public void testPrintWithQuotePolicyNone() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withQuotePolicy(Quote.NONE).withEscape('\\');
        printer = new CSVPrinter(writer, format);
        printer.print("a,b");
        printer.flush();
        assertEquals("a\\,b", writer.toString());
    }

    @Test
    public void testPrintWithEmptyTokenAtBeginning() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT;
        printer = new CSVPrinter(writer, format);
        printer.print("");
        printer.flush();
        assertEquals("\"\"", writer.toString());
    }

    @Test
    public void testPrintRecordWithArray() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT;
        printer = new CSVPrinter(writer, format);
        printer.printRecord(new Object[] {"a", "b"});
        printer.flush();
        assertEquals("a,b" + format.getRecordSeparator(), writer.toString());
    }

    @Test
    public void testPrintRecordWithIterable() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT;
        printer = new CSVPrinter(writer, format);
        java.util.Arrays.asList("a", "b");
        printer.printRecord(java.util.Arrays.asList("a", "b"));
        printer.flush();
        assertEquals("a,b" + format.getRecordSeparator(), writer.toString());
    }

    @Test
    public void testPrintRecordWithValues() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT;
        printer = new CSVPrinter(writer, format);
        printer.printRecord("a", "b");
        printer.flush();
        assertEquals("a,b" + format.getRecordSeparator(), writer.toString());
    }

    @Test
    public void testPrintRecordsWithIterableContainingArrays() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT;
        printer = new CSVPrinter(writer, format);
        Object[] record1 = {"a", "b"};
        Object[] record2 = {"c", "d"};
        printer.printRecords(java.util.Arrays.asList((Object) record1, (Object) record2));
        printer.flush();
        assertEquals("a,b" + format.getRecordSeparator() + "c,d" + format.getRecordSeparator(), writer.toString());
    }

    @Test
    public void testPrintRecordsWithIterableContainingIterables() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT;
        printer = new CSVPrinter(writer, format);
        java.util.List<Object> record1 = java.util.Arrays.asList("a", "b");
        java.util.List<Object> record2 = java.util.Arrays.asList("c", "d");
        printer.printRecords(java.util.Arrays.asList((Object) record1, (Object) record2));
        printer.flush();
        assertEquals("a,b" + format.getRecordSeparator() + "c,d" + format.getRecordSeparator(), writer.toString());
    }

    @Test
    public void testPrintRecordsWithIterableContainingScalars() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT;
        printer = new CSVPrinter(writer, format);
        printer.printRecords(java.util.Arrays.asList("a", "b"));
        printer.flush();
        assertEquals("a" + format.getRecordSeparator() + "b" + format.getRecordSeparator(), writer.toString());
    }

    @Test
    public void testPrintRecordsWithArray() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT;
        printer = new CSVPrinter(writer, format);
        printer.printRecords(new Object[] {"a", "b"});
        printer.flush();
        assertEquals("a" + format.getRecordSeparator() + "b" + format.getRecordSeparator(), writer.toString());
    }

    @Test
    public void testPrintCommentWhenDisabled() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withCommentStart('#').withCommentingDisabled();
        printer = new CSVPrinter(writer, format);
        printer.printComment("test");
        printer.flush();
        assertEquals("", writer.toString());
    }

    @Test
    public void testPrintCommentWithCRLF() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withCommentStart('#');
        printer = new CSVPrinter(writer, format);
        printer.printComment("line1\r\nline2");
        printer.flush();
        assertEquals(format.getRecordSeparator() + "# line1" + format.getRecordSeparator() + "# line2", writer.toString());
    }

    @Test
    public void testPrintCommentWithLF() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withCommentStart('#');
        printer = new CSVPrinter(writer, format);
        printer.printComment("line1\nline2");
        printer.flush();
        assertEquals(format.getRecordSeparator() + "# line1" + format.getRecordSeparator() + "# line2", writer.toString());
    }

    @Test
    public void testPrintCommentNormal() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withCommentStart('#');
        printer = new CSVPrinter(writer, format);
        printer.printComment("hello");
        printer.flush();
        assertEquals(format.getRecordSeparator() + "# hello", writer.toString());
    }

    @Test
    public void testPrintln() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT;
        printer = new CSVPrinter(writer, format);
        printer.print("a");
        printer.println();
        printer.flush();
        assertEquals("a" + format.getRecordSeparator(), writer.toString());
    }

    @Test
    public void testCloseWhenOutIsCloseable() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT;
        printer = new CSVPrinter(writer, format);
        printer.close();
    }

    @Test
    public void testFlushWhenOutIsFlushable() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT;
        printer = new CSVPrinter(writer, format);
        printer.flush();
    }

    @Test
    public void testGetOut() {
        CSVFormat format = CSVFormat.DEFAULT;
        printer = new CSVPrinter(writer, format);
        assertSame(writer, printer.getOut());
    }

    @Test
    public void testConstructorWithNullOut() {
        try {
            new CSVPrinter(null, CSVFormat.DEFAULT);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testConstructorWithNullFormat() {
        try {
            new CSVPrinter(writer, null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testPrintRecordsWithJDBCResultSet() throws Exception {
        CSVFormat format = CSVFormat.DEFAULT;
        printer = new CSVPrinter(writer, format);
        java.sql.ResultSet rs = new java.sql.ResultSet() {
            private boolean hasNext = true;
            private int row = 0;

            @Override
            public boolean next() {
                if (row == 0) {
                    row++;
                    return true;
                }
                return false;
            }

            @Override
            public java.sql.ResultSetMetaData getMetaData() {
                return new java.sql.ResultSetMetaData() {
                    @Override
                    public int getColumnCount() {
                        return 2;
                    }

                    @Override
                    public String getColumnName(int column) {
                        return "col" + column;
                    }

                    @Override
                    public String getColumnLabel(int column) {
                        return "col" + column;
                    }

                    @Override
                    public int getColumnType(int column) { return java.sql.Types.VARCHAR; }

                    @Override
                    public String getColumnTypeName(int column) { return "VARCHAR"; }

                    @Override
                    public int getPrecision(int column) { return 0; }

                    @Override
                    public int getScale(int column) { return 0; }

                    @Override
                    public String getTableName(int column) { return ""; }

                    @Override
                    public String getSchemaName(int column) { return ""; }

                    @Override
                    public String getCatalogName(int column) { return ""; }

                    @Override
                    public boolean isNullable(int column) { return true; }

                    @Override
                    public boolean isAutoIncrement(int column) { return false; }

                    @Override
                    public boolean isCaseSensitive(int column) { return false; }

                    @Override
                    public boolean isCurrency(int column) { return false; }

                    @Override
                    public boolean isDefinitelyWritable(int column) { return false; }

                    @Override
                    public boolean isReadOnly(int column) { return false; }

                    @Override
                    public boolean isSearchable(int column) { return false; }

                    @Override
                    public boolean isSigned(int column) { return false; }

                    @Override
                    public boolean isWritable(int column) { return false; }

                    @Override
                    public boolean isWrapperFor(Class<?> iface) { return false; }

                    @Override
                    public <T> T unwrap(Class<T> iface) { return null; }
                };
            }

            @Override
            public String getString(int columnIndex) {
                return row + ":" + columnIndex;
            }

            @Override
            public boolean isWrapperFor(Class<?> iface) { return false; }

            @Override
            public <T> T unwrap(Class<T> iface) { return null; }

            // Dummy implementations for other ResultSet methods
            public boolean absolute(int row) { return false; }
            public void afterLast() {}
            public void beforeFirst() {}
            public void cancelRowUpdates() {}
            public void clearWarnings() {}
            public void close() {}
            public void deleteRow() {}
            public int findColumn(String columnLabel) { return 1; }
            public boolean first() { return false; }
            public java.sql.Array getArray(int columnIndex) { return null; }
            public java.sql.Array getArray(String columnLabel) { return null; }
            public java.io.InputStream getAsciiStream(int columnIndex) { return null; }
            public java.io.InputStream getAsciiStream(String columnLabel) { return null; }
            public java.math.BigDecimal getBigDecimal(int columnIndex) { return null; }
            public java.math.BigDecimal getBigDecimal(String columnLabel) { return null; }
            public java.math.BigDecimal getBigDecimal(int columnIndex, int scale) { return null; }
            public java.math.BigDecimal getBigDecimal(String columnLabel, int scale) { return null; }
            public java.io.InputStream getBinaryStream(int columnIndex) { return null; }
            public java.io.InputStream getBinaryStream(String columnLabel) { return null; }
            public java.sql.Blob getBlob(int columnIndex) { return null; }
            public java.sql.Blob getBlob(String columnLabel) { return null; }
            public boolean getBoolean(int columnIndex) { return false; }
            public boolean getBoolean(String columnLabel) { return false; }
            public byte getByte(int columnIndex) { return 0; }
            public byte getByte(String columnLabel) { return 0; }
            public byte[] getBytes(int columnIndex) { return null; }
            public byte[] getBytes(String columnLabel) { return null; }
            public java.io.Reader getCharacterStream(int columnIndex) { return null; }
            public java.io.Reader getCharacterStream(String columnLabel) { return null; }
            public java.sql.Clob getClob(int columnIndex) { return null; }
            public java.sql.Clob getClob(String columnLabel) { return null; }
            public int getConcurrency() { return 0; }
            public java.sql.Date getDate(int columnIndex) { return null; }
            public java.sql.Date getDate(String columnLabel) { return null; }
            public java.sql.Date getDate(int columnIndex, java.util.Calendar cal) { return null; }
            public java.sql.Date getDate(String columnLabel, java.util.Calendar cal) { return null; }
            public double getDouble(int columnIndex) { return 0; }
            public double getDouble(String columnLabel) { return 0; }
            public int getFetchDirection() { return 0; }
            public int getFetchSize() { return 0; }
            public float getFloat(int columnIndex) { return 0; }
            public float getFloat(String columnLabel) { return 0; }
            public int getHoldability() { return 0; }
            public int getInt(int columnIndex) { return 0; }
            public int getInt(String columnLabel) { return 0; }
            public long getLong(int columnIndex) { return 0; }
            public long getLong(String columnLabel) { return 0; }
            public int getMaxFieldSize() { return 0; }
            public int getMaxRows() { return 0; }
            public java.sql.ResultSetMetaData getMetaData() { return getMetaData(); }
            public java.io.Reader getNCharacterStream(int columnIndex) { return null; }
            public java.io.Reader getNCharacterStream(String columnLabel) { return null; }
            public java.sql.NClob getNClob(int columnIndex) { return null; }
            public java.sql.NClob getNClob(String columnLabel) { return null; }
            public String getNString(int columnIndex) { return null; }
            public String getNString(String columnLabel) { return null; }
            public java.sql.Ref getRef(int columnIndex) { return null; }
            public java.sql.Ref getRef(String columnLabel) { return null; }
            public int getRow() { return 1; }
            public short getShort(int columnIndex) { return 0; }
            public short getShort(String columnLabel) { return 0; }
            public java.sql.SQLXML getSQLXML(int columnIndex) { return null; }
            public java.sql.SQLXML getSQLXML(String columnLabel) { return null; }
            public java.sql.Statement getStatement() { return null; }
            public String getString(String columnLabel) { return null; }
            public java.sql.Time getTime(int columnIndex) { return null; }
            public java.sql.Time getTime(String columnLabel) { return null; }
            public java.sql.Time getTime(int columnIndex, java.util.Calendar cal) { return null; }
            public java.sql.Time getTime(String columnLabel, java.util.Calendar cal) { return null; }
            public java.sql.Timestamp getTimestamp(int columnIndex) { return null; }
            public java.sql.Timestamp getTimestamp(String columnLabel) { return null; }
            public java.sql.Timestamp getTimestamp(int columnIndex, java.util.Calendar cal) { return null; }
            public java.sql.Timestamp getTimestamp(String columnLabel, java.util.Calendar cal) { return null; }
            public int getType() { return java.sql.ResultSet.TYPE_FORWARD_ONLY; }
            public java.net.URL getURL(int columnIndex) { return null; }
            public java.net.URL getURL(String columnLabel) { return null; }
            public java.io.InputStream getUnicodeStream(int columnIndex) { return null; }
            public java.io.InputStream getUnicodeStream(String columnLabel) { return null; }
            public java.sql.SQLWarning getWarnings() { return null; }
            public void insertRow() {}
            public boolean isAfterLast() { return false; }
            public boolean isBeforeFirst() { return false; }
            public boolean isClosed() { return false; }
            public boolean isFirst() { return false; }
            public boolean isLast() { return false; }
            public boolean last() { return false; }
            public void moveToCurrentRow() {}
            public void moveToInsertRow() {}
            public boolean previous() { return false; }
            public void refreshRow() {}
            public boolean relative(int rows) { return false; }
            public boolean rowDeleted() { return false; }
            public boolean rowInserted() { return false; }
            public boolean rowUpdated() { return false; }
            public void setFetchDirection(int direction) {}
            public void setFetchSize(int rows) {}
            public void updateArray(int columnIndex, java.sql.Array x) {}
            public void updateArray(String columnLabel, java.sql.Array x) {}
            public void updateAsciiStream(int columnIndex, java.io.InputStream x) {}
            public void updateAsciiStream(String columnLabel, java.io.InputStream x) {}
            public void updateAsciiStream(int columnIndex, java.io.InputStream x, int length) {}
            public void updateAsciiStream(String columnLabel, java.io.InputStream x, int length) {}
            public void updateAsciiStream(int columnIndex, java.io.InputStream x, long length) {}
            public void updateAsciiStream(String columnLabel, java.io.InputStream x, long length) {}
            public void updateBigDecimal(int columnIndex, java.math.BigDecimal x) {}
            public void updateBigDecimal(String columnLabel, java.math.BigDecimal x) {}
            public void updateBinaryStream(int columnIndex, java.io.InputStream x) {}
            public void updateBinaryStream(String columnLabel, java.io.InputStream x) {}
            public void updateBinaryStream(int columnIndex, java.io.InputStream x, int length) {}
            public void updateBinaryStream(String columnLabel, java.io.InputStream x, int length) {}
            public void updateBinaryStream(int columnIndex, java.io.InputStream x, long length) {}
            public void updateBinaryStream(String columnLabel, java.io.InputStream x, long length) {}
            public void updateBlob(int columnIndex, java.sql.Blob x) {}
            public void updateBlob(String columnLabel, java.sql.Blob x) {}
            public void updateBlob(int columnIndex, java.io.InputStream x) {}
            public void updateBlob(String columnLabel, java.io.InputStream x) {}
            public void updateBlob(int columnIndex, java.io.InputStream x, long length) {}
            public void updateBlob(String columnLabel, java.io.InputStream x, long length) {}
            public void updateBoolean(int columnIndex, boolean x) {}
            public void updateBoolean(String columnLabel, boolean x) {}
            public void updateByte(int columnIndex, byte x) {}
            public void updateByte(String columnLabel, byte x) {}
            public void updateBytes(int columnIndex, byte[] x) {}
            public void updateBytes(String columnLabel, byte[] x) {}
            public void updateCharacterStream(int columnIndex, java.io.Reader x) {}
            public void updateCharacterStream(String columnLabel, java.io.Reader x) {}
            public void updateCharacterStream(int columnIndex, java.io.Reader x, int length) {}
            public void updateCharacterStream(String columnLabel, java.io.Reader x, int length) {}
            public void updateCharacterStream(int columnIndex, java.io.Reader x, long length) {}
            public void updateCharacterStream(String columnLabel, java.io.Reader x, long length) {}
            public void updateClob(int columnIndex, java.sql.Clob x) {}
            public void updateClob(String columnLabel, java.sql.Clob x) {}
            public void updateClob(int columnIndex, java.io.Reader x) {}
            public void updateClob(String columnLabel, java.io.Reader x) {}
            public void updateClob(int columnIndex, java.io.Reader x, long length) {}
            public void updateClob(String columnLabel, java.io.Reader x, long length) {}
            public void updateDate(int columnIndex, java.sql.Date x) {}
            public void updateDate(String columnLabel, java.sql.Date x) {}
            public void updateDouble(int columnIndex, double x) {}
            public void updateDouble(String columnLabel, double x) {}
            public void updateFloat(int columnIndex, float x) {}
            public void updateFloat(String columnLabel, float x) {}
            public void updateInt(int columnIndex, int x) {}
            public void updateInt(String columnLabel, int x) {}
            public void updateLong(int columnIndex, long x) {}
            public void updateLong(String columnLabel, long x) {}
            public void updateNCharacterStream(int columnIndex, java.io.Reader x) {}
            public void updateNCharacterStream(String columnLabel, java.io.Reader x) {}
            public void updateNCharacterStream(int columnIndex, java.io.Reader x, long length) {}
            public void updateNCharacterStream(String columnLabel, java.io.Reader x, long length) {}
            public void updateNClob(int columnIndex, java.sql.NClob x) {}
            public void updateNClob(String columnLabel, java.sql.NClob x) {}
            public void updateNClob(int columnIndex, java.io.Reader x) {}
            public void updateNClob(String columnLabel, java.io.Reader x) {}
            public void updateNClob(int columnIndex, java.io.Reader x, long length) {}
            public void updateNClob(String columnLabel, java.io.Reader x, long length) {}
            public void updateNString(int columnIndex, String x) {}
            public void updateNString(String columnLabel, String x) {}
            public void updateNull(int columnIndex) {}
            public void updateNull(String columnLabel) {}
            public void updateObject(int columnIndex, Object x) {}
            public void updateObject(String columnLabel, Object x) {}
            public void updateObject(int columnIndex, Object x, int scale) {}
            public void updateObject(String columnLabel, Object x, int scale) {}
            public void updateRef(int columnIndex, java.sql.Ref x) {}
            public void updateRef(String columnLabel, java.sql.Ref x) {}
            public void updateRow() {}
            public void updateShort(int columnIndex, short x) {}
            public void updateShort(String columnLabel, short x) {}
            public void updateSQLXML(int columnIndex, java.sql.SQLXML x) {}
            public void updateSQLXML(String columnLabel, java.sql.SQLXML x) {}
            public void updateString(int columnIndex, String x) {}
            public void updateString(String columnLabel, String x) {}
            public void updateTime(int columnIndex, java.sql.Time x) {}
            public void updateTime(String columnLabel, java.sql.Time x) {}
            public void updateTimestamp(int columnIndex, java.sql.Timestamp x) {}
            public void updateTimestamp(String columnLabel, java.sql.Timestamp x) {}
        };
        printer.printRecords(rs);
        printer.flush();
        assertEquals("1:1,1:2" + format.getRecordSeparator(), writer.toString());
    }
}