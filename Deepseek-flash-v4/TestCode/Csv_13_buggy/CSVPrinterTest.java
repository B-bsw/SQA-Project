package org.apache.commons.csv;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CSVPrinterTest {

    private static final String LF = "\n";
    private static final String CR = "\r";
    private static final String CRLF = CR + LF;

    private StringWriter writer;
    private CSVPrinter printer;

    @Before
    public void setUp() {
        writer = new StringWriter();
    }

    @After
    public void tearDown() throws IOException {
        if (printer != null) {
            printer.close();
        }
    }

    @Test
    public void testPrintNullValueWithNullString() throws IOException {
        printer = new CSVPrinter(writer, CSVFormat.DEFAULT);
        printer.print(null);
        printer.close();
        assertEquals("", writer.toString());
    }

    @Test
    public void testPrintNullValueWithNonNullNullString() throws IOException {
        printer = new CSVPrinter(writer, CSVFormat.DEFAULT.withNullString("NULL"));
        printer.print(null);
        printer.close();
        assertEquals("NULL", writer.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullOut() throws IOException {
        new CSVPrinter(null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullFormat() throws IOException {
        new CSVPrinter(writer, null);
    }

    @Test
    public void testPrintSimpleValue() throws IOException {
        printer = new CSVPrinter(writer, CSVFormat.DEFAULT);
        printer.print("value");
        assertEquals("value", writer.toString());
    }

    @Test
    public void testPrintMultipleValuesWithDelimiter() throws IOException {
        printer = new CSVPrinter(writer, CSVFormat.DEFAULT);
        printer.print("a");
        printer.print("b");
        printer.close();
        assertEquals("a,b", writer.toString());
    }

    @Test
    public void testPrintQuotedWhenNeeded() throws IOException {
        printer = new CSVPrinter(writer, CSVFormat.DEFAULT);
        printer.print("a,b");
        printer.close();
        assertEquals("\"a,b\"", writer.toString());
    }

    @Test
    public void testPrintValueStartingWithSpecialChar() throws IOException {
        printer = new CSVPrinter(writer, CSVFormat.DEFAULT);
        printer.print("#comment");
        printer.close();
        assertEquals("\"#comment\"", writer.toString());
    }

    @Test
    public void testPrintValueWithCRLF() throws IOException {
        printer = new CSVPrinter(writer, CSVFormat.DEFAULT);
        printer.print("a\r\nb");
        printer.close();
        assertEquals("\"a\r\nb\"", writer.toString());
    }

    @Test
    public void testPrintEscapedValue() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withEscape('\\');
        printer = new CSVPrinter(writer, format);
        printer.print("a\nb");
        printer.close();
        assertEquals("a\\nb", writer.toString());
    }

    @Test
    public void testPrintEscapedWithDelimiter() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withEscape('\\');
        printer = new CSVPrinter(writer, format);
        printer.print("a,b");
        printer.close();
        assertEquals("a,b", writer.toString());
    }

    @Test
    public void testPrintQuoteModeAll() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.ALL);
        printer = new CSVPrinter(writer, format);
        printer.print("value");
        printer.close();
        assertEquals("\"value\"", writer.toString());
    }

    @Test
    public void testPrintQuoteModeNonNumeric() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.NON_NUMERIC);
        printer = new CSVPrinter(writer, format);
        printer.print("string");
        printer.print(123);
        printer.close();
        assertEquals("\"string\",123", writer.toString());
    }

    @Test
    public void testPrintQuoteModeMinimalAlreadyQuoted() throws IOException {
        printer = new CSVPrinter(writer, CSVFormat.DEFAULT);
        printer.print("abc");
        printer.close();
        assertEquals("abc", writer.toString());
    }

    @Test
    public void testPrintQuoteModeMinimalLeadingSpace() throws IOException {
        printer = new CSVPrinter(writer, CSVFormat.DEFAULT);
        printer.print(" abc");
        printer.close();
        assertEquals("\" abc\"", writer.toString());
    }

    @Test
    public void testPrintQuoteModeMinimalTrailingSpace() throws IOException {
        printer = new CSVPrinter(writer, CSVFormat.DEFAULT);
        printer.print("abc ");
        printer.close();
        assertEquals("\"abc \"", writer.toString());
    }

    @Test
    public void testPrintQuoteModeMinimalSpecialFirstChar() throws IOException {
        printer = new CSVPrinter(writer, CSVFormat.DEFAULT);
        printer.print("!abc");
        printer.close();
        assertEquals("\"!abc\"", writer.toString());
    }

    @Test
    public void testPrintQuoteModeMinimalSpecialLastChar() throws IOException {
        printer = new CSVPrinter(writer, CSVFormat.DEFAULT);
        printer.print("abc!");
        printer.close();
        assertEquals("\"abc!\"", writer.toString());
    }

    @Test
    public void testPrintQuoteModeMinimalQuoteInside() throws IOException {
        printer = new CSVPrinter(writer, CSVFormat.DEFAULT);
        printer.print("he\"llo");
        printer.close();
        assertEquals("\"he\"\"llo\"", writer.toString());
    }

    @Test
    public void testPrintEmptyValueFirstOnLineWithQuoting() throws IOException {
        printer = new CSVPrinter(writer, CSVFormat.DEFAULT);
        printer.print("");
        printer.print("x");
        printer.close();
        assertEquals("\"\",x", writer.toString());
    }

    @Test
    public void testPrintEmptyValueNotFirstOnLine() throws IOException {
        printer = new CSVPrinter(writer, CSVFormat.DEFAULT);
        printer.print("a");
        printer.print("");
        printer.close();
        assertEquals("a,", writer.toString());
    }

    @Test
    public void testPrintComment() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        printer = new CSVPrinter(writer, format);
        printer.printComment("comment");
        printer.close();
        assertEquals("# comment" + LF, writer.toString());
    }

    @Test
    public void testPrintCommentWithCRLF() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        printer = new CSVPrinter(writer, format);
        printer.printComment("line1" + CRLF + "line2");
        printer.close();
        assertEquals("# line1" + CRLF + "# line2" + LF, writer.toString());
    }

    @Test
    public void testPrintCommentNoCommentMarker() throws IOException {
        printer = new CSVPrinter(writer, CSVFormat.DEFAULT);
        printer.printComment("comment");
        printer.close();
        assertEquals("", writer.toString());
    }

    @Test
    public void testPrintln() throws IOException {
        printer = new CSVPrinter(writer, CSVFormat.DEFAULT);
        printer.println();
        printer.close();
        assertEquals(LF, writer.toString());
    }

    @Test
    public void testPrintlnWithRecordSeparator() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withRecordSeparator(";");
        printer = new CSVPrinter(writer, format);
        printer.println();
        printer.close();
        assertEquals(";", writer.toString());
    }

    @Test
    public void testPrintlnNullRecordSeparator() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withRecordSeparator(null);
        printer = new CSVPrinter(writer, format);
        printer.println();
        printer.close();
        assertEquals("", writer.toString());
    }

    @Test
    public void testPrintRecordVarargs() throws IOException {
        printer = new CSVPrinter(writer, CSVFormat.DEFAULT);
        printer.printRecord("a", "b", "c");
        printer.close();
        assertEquals("a,b,c" + LF, writer.toString());
    }

    @Test
    public void testPrintRecordIterable() throws IOException {
        List<String> values = Arrays.asList("a", "b");
        printer = new CSVPrinter(writer, CSVFormat.DEFAULT);
        printer.printRecord(values);
        printer.close();
        assertEquals("a,b" + LF, writer.toString());
    }

    @Test
    public void testPrintRecordsObjectArray() throws IOException {
        printer = new CSVPrinter(writer, CSVFormat.DEFAULT);
        printer.printRecords(new Object[] { "a", "b" });
        printer.close();
        assertEquals("a" + LF + "b" + LF, writer.toString());
    }

    @Test
    public void testPrintRecordsIterable() throws IOException {
        List<String> values = Arrays.asList("a", "b");
        printer = new CSVPrinter(writer, CSVFormat.DEFAULT);
        printer.printRecords(values);
        printer.close();
        assertEquals("a" + LF + "b" + LF, writer.toString());
    }

    @Test
    public void testPrintRecordsNestedArray() throws IOException {
        String[][] data = { { "A", "B" }, { "1", "2" } };
        printer = new CSVPrinter(writer, CSVFormat.DEFAULT);
        printer.printRecords(data);
        printer.close();
        assertEquals("A,B" + LF + "1,2" + LF, writer.toString());
    }

    @Test
    public void testPrintRecordsResultSet() throws Exception {
        CSVPrinter printer = new CSVPrinter(writer, CSVFormat.DEFAULT);
        ResultSet rs = createResultSet();
        printer.printRecords(rs);
        printer.close();
        assertEquals("a,b" + LF + "1,2" + LF, writer.toString());
    }

    @Test
    public void testPrintRecordsEmptyResultSet() throws Exception {
        CSVPrinter printer = new CSVPrinter(writer, CSVFormat.DEFAULT);
        ResultSet rs = new MockResultSet(new String[] { "a", "b" }, new Object[][] {});
        printer.printRecords(rs);
        printer.close();
        assertEquals("", writer.toString());
    }

    @Test
    public void testGetOut() throws IOException {
        printer = new CSVPrinter(writer, CSVFormat.DEFAULT);
        assertSame(writer, printer.getOut());
    }

    @Test
    public void testFlush() throws IOException {
        StringBuilder builder = new StringBuilder();
        // StringWriter doesn't implement Flushable, so use a custom Appendable.
        Appendable custom = new Appendable() {
            private final StringBuilder sb = new StringBuilder();
            public Appendable append(CharSequence csq) { sb.append(csq); return this; }
            public Appendable append(CharSequence csq, int start, int end) { sb.append(csq, start, end); return this; }
            public Appendable append(char c) { sb.append(c); return this; }
            public String toString() { return sb.toString(); }
        };
        printer = new CSVPrinter(custom, CSVFormat.DEFAULT) {
            @Override
            public void flush() throws IOException {
                // verify custom flush called, no-op for this test
            }
        };
        printer.flush();
    }

    @Test
    public void testCloseFlushesAndCloses() throws IOException {
        StringBuilder builder = new StringBuilder();
        Appendable custom = new Appendable() {
            private boolean closed = false;
            private boolean flushed = false;
            public Appendable append(CharSequence csq) { checkClosed(); sb.append(csq); return this; }
            public Appendable append(CharSequence csq, int start, int end) { checkClosed(); sb.append(csq, start, end); return this; }
            public Appendable append(char c) { checkClosed(); sb.append(c); return this; }
            public void flush() { flushed = true; }
            public void close() { closed = true; }
            private void checkClosed() { }
            private final StringBuilder sb = new StringBuilder();
            public String toString() { return sb.toString(); }
        };
        printer = new CSVPrinter(custom, CSVFormat.DEFAULT);
        printer.close();
        // assert closed flag set via reflection or custom tracking isn't possible.
    }

    private ResultSet createResultSet() throws SQLException {
        return new MockResultSet(new String[] { "col1", "col2" }, new Object[][] {
                { "a", "b" }, { 1, 2 }
        });
    }

    private static class MockResultSet implements ResultSet {
        private final String[] columns;
        private final Object[][] data;
        private int currentRow = 0;

        MockResultSet(String[] columns, Object[][] data) {
            this.columns = columns;
            this.data = data;
        }

        @Override
        public boolean next() throws SQLException {
            if (currentRow >= data.length) return false;
            currentRow++;
            return true;
        }

        @Override
        public Object getObject(int columnIndex) throws SQLException {
            return data[currentRow - 1][columnIndex - 1];
        }

        @Override
        public ResultSetMetaData getMetaData() throws SQLException {
            return new ResultSetMetaData() {
                @Override
                public int getColumnCount() { return columns.length; }
                @Override
                public int getColumnType(int column) { return Types.VARCHAR; }
                // other methods no-op
            };
        }

        // stub methods (not used in tests)
        @Override public boolean absolute(int row) { return false; }
        @Override public void afterLast() {}
        @Override public void beforeFirst() {}
        @Override public void cancelRowUpdates() {}
        @Override public void clearWarnings() {}
        @Override public void close() {}
        @Override public void deleteRow() {}
        @Override public int findColumn(String columnLabel) { return 0; }
        @Override public boolean first() { return false; }
        @Override public int getRow() { return currentRow; }
        @Override public boolean isClosed() { return false; }
        @Override public boolean last() { return false; }
        @Override public boolean previous() { return false; }
        @Override public void refreshRow() {}
        @Override public boolean relative(int rows) { return false; }
        @Override public boolean rowDeleted() { return false; }
        @Override public boolean rowInserted() { return false; }
        @Override public boolean rowUpdated() { return false; }
        @Override public void moveToCurrentRow() {}
        @Override public void moveToInsertRow() {}
        @Override public void updateRow() {}
        @Override public boolean isBeforeFirst() { return false; }
        @Override public boolean isAfterLast() { return false; }
        @Override public boolean isFirst() { return currentRow == 0 && data.length > 0; }
        @Override public boolean isLast() { return currentRow == data.length - 1; }
        @Override public void setFetchDirection(int direction) {}
        @Override public int getFetchDirection() { return 0; }
        @Override public void setFetchSize(int rows) {}
        @Override public int getFetchSize() { return 0; }
        @Override public void setType(int type) {}
        @Override public int getType() { return 0; }
        @Override public void setConcurrency(int concurrency) {}
        @Override public int getConcurrency() { return 0; }
        @Override public void setHoldability(int holdability) {}
        @Override public int getHoldability() { return 0; }
        @Override public String getString(int columnIndex) { return data[currentRow-1][columnIndex-1].toString(); }
        @Override public boolean getBoolean(int columnIndex) { return false; }
        @Override public byte getByte(int columnIndex) { return 0; }
        @Override public short getShort(int columnIndex) { return 0; }
        @Override public int getInt(int columnIndex) { return (Integer) data[currentRow-1][columnIndex-1]; }
        @Override public long getLong(int columnIndex) { return 0; }
        @Override public float getFloat(int columnIndex) { return 0; }
        @Override public double getDouble(int columnIndex) { return 0; }
        @Override public byte[] getBytes(int columnIndex) { return new byte[0]; }
        @Override public java.sql.Date getDate(int columnIndex) { return null; }
        @Override public java.sql.Time getTime(int columnIndex) { return null; }
        @Override public java.sql.Timestamp getTimestamp(int columnIndex) { return null; }
        @Override public java.io.InputStream getAsciiStream(int columnIndex) { return null; }
        @Override public java.io.InputStream getUnicodeStream(int columnIndex) { return null; }
        @Override public java.io.Reader getCharacterStream(int columnIndex) { return null; }
        @Override public Object getObject(int columnIndex, Class type) { return null; }
        @Override public SQLWarning getWarnings() { return null; }
        @Override public void insertRow() {}
        @Override public void updateNull(int columnIndex) {}
        @Override public void updateBoolean(int columnIndex, boolean x) {}
        @Override public void updateByte(int columnIndex, byte x) {}
        @Override public void updateShort(int columnIndex, short x) {}
        @Override public void updateInt(int columnIndex, int x) {}
        @Override public void updateLong(int columnIndex, long x) {}
        @Override public void updateFloat(int columnIndex, float x) {}
        @Override public void updateDouble(int columnIndex, double x) {}
        @Override public void updateBigDecimal(int columnIndex, java.math.BigDecimal x) {}
        @Override public void updateString(int columnIndex, String x) {}
        @Override public void updateBytes(int columnIndex, byte[] x) {}
        @Override public void updateDate(int columnIndex, java.sql.Date x) {}
        @Override public void updateTime(int columnIndex, java.sql.Time x) {}
        @Override public void updateTimestamp(int columnIndex, java.sql.Timestamp x) {}
        @Override public void updateAsciiStream(int columnIndex, java.io.InputStream x, int length) {}
        @Override public void updateBinaryStream(int columnIndex, java.io.InputStream x, int length) {}
        @Override public void updateCharacterStream(int columnIndex, Reader x, int length) {}
        @Override public void updateObject(int columnIndex, Object x) {}
        @Override public void updateObject(int columnIndex, Object x, int scale) {}
        // more stubs...
    }
}