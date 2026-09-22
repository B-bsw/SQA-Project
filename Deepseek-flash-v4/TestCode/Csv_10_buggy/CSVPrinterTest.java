package org.apache.commons.csv;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.io.StringWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;

public class CSVPrinterTest {

    private static final String LF = "\n";
    private static final String CR = "\r";
    private static final String CRLF = "\r\n";

    private StringWriter writer;
    private CSVPrinter printer;

    private void createPrinter(CSVFormat format) {
        writer = new StringWriter();
        try {
            printer = new CSVPrinter(writer, format);
        } catch (IOException e) {
            fail("IOException: " + e.getMessage());
        }
    }

    private void createDefaultPrinter() {
        createPrinter(CSVFormat.DEFAULT);
    }

    // ===== Constructor Tests =====
    @Test
    public void testConstructorNullOut() {
        try {
            new CSVPrinter(null, CSVFormat.DEFAULT);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("out", e.getMessage());
        } catch (IOException e) {
            fail("Unexpected IOException: " + e.getMessage());
        }
    }

    @Test
    public void testConstructorNullFormat() {
        try {
            new CSVPrinter(new StringWriter(), null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("format", e.getMessage());
        } catch (IOException e) {
            fail("Unexpected IOException: " + e.getMessage());
        }
    }

    @Test
    public void testConstructorWithHeader() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withHeader("A", "B");
        StringWriter sw = new StringWriter();
        CSVPrinter p = new CSVPrinter(sw, format);
        assertNotNull(p);
        assertSame(sw, p.getOut());
    }

    // ===== Close / Flush =====
    @Test
    public void testClose() throws IOException {
        createDefaultPrinter();
        printer.close();
        // Should not throw
    }

    @Test
    public void testFlush() throws IOException {
        createDefaultPrinter();
        printer.print("test");
        printer.flush();
        assertEquals("test", writer.toString());
    }

    // ===== print(value) Tests =====
    @Test
    public void testPrintNullValue() throws IOException {
        createPrinter(CSVFormat.DEFAULT.withNullString("NULL"));
        printer.print(null);
        assertEquals("NULL", writer.toString());
    }

    @Test
    public void testPrintNullValueNoNullString() throws IOException {
        createPrinter(CSVFormat.DEFAULT);
        printer.print(null);
        assertEquals("", writer.toString());
    }

    @Test
    public void testPrintNonNullValue() throws IOException {
        createDefaultPrinter();
        printer.print("hello");
        assertEquals("hello", writer.toString());
    }

    @Test
    public void testPrintMultipleValues() throws IOException {
        createDefaultPrinter();
        printer.print("a");
        printer.print("b");
        printer.print("c");
        assertEquals("a,b,c", writer.toString());
    }

    // ===== Escape Tests =====
    @Test
    public void testPrintEscapingDelimiter() throws IOException {
        createPrinter(CSVFormat.DEFAULT.withEscape('\\'));
        printer.print("a,b");
        assertEquals("\"a,b\"", writer.toString());
    }

    @Test
    public void testPrintEscapingNewline() throws IOException {
        createPrinter(CSVFormat.DEFAULT.withEscape('\\'));
        printer.print("a" + LF + "b");
        assertEquals("\"a\\nb\"", writer.toString());
    }

    @Test
    public void testPrintEscapingCRLF() throws IOException {
        createPrinter(CSVFormat.DEFAULT.withEscape('\\'));
        printer.print("a" + CRLF + "b");
        assertEquals("\"a\\r\\nb\"", writer.toString());
    }

    @Test
    public void testPrintEscapingEscapeChar() throws IOException {
        createPrinter(CSVFormat.DEFAULT.withEscape('\\'));
        printer.print("a\\b");
        assertEquals("\"a\\\\b\"", writer.toString());
    }

    // ===== Quoting Tests =====
    @Test
    public void testPrintQuoteAll() throws IOException {
        createPrinter(CSVFormat.DEFAULT.withQuotePolicy(Quote.ALL));
        printer.print("a");
        assertEquals("\"a\"", writer.toString());
    }

    @Test
    public void testPrintQuoteNone() throws IOException {
        createPrinter(CSVFormat.DEFAULT.withQuotePolicy(Quote.NONE));
        printer.print("a,b");
        assertEquals("\"a,b\"", writer.toString());
    }

    @Test
    public void testPrintQuoteNoneNoSpecial() throws IOException {
        createPrinter(CSVFormat.DEFAULT.withQuotePolicy(Quote.NONE));
        printer.print("a");
        assertEquals("a", writer.toString());
    }

    @Test
    public void testPrintQuoteMinimalNormalValue() throws IOException {
        createPrinter(CSVFormat.DEFAULT.withQuotePolicy(Quote.MINIMAL));
        printer.print("a");
        assertEquals("a", writer.toString());
    }

    @Test
    public void testPrintQuoteMinimalValueStartingWithNumber() throws IOException {
        createPrinter(CSVFormat.DEFAULT.withQuotePolicy(Quote.MINIMAL));
        printer.print("1a");
        assertEquals("1a", writer.toString());
    }

    @Test
    public void testPrintQuoteMinimalValueStartingWithSpecialChar() throws IOException {
        createPrinter(CSVFormat.DEFAULT.withQuotePolicy(Quote.MINIMAL));
        printer.print("#a");
        assertEquals("\"#a\"", writer.toString());
    }

    @Test
    public void testPrintQuoteMinimalValueEndingWithWhitespace() throws IOException {
        createPrinter(CSVFormat.DEFAULT.withQuotePolicy(Quote.MINIMAL));
        printer.print("a ");
        assertEquals("\"a \"", writer.toString());
    }

    @Test
    public void testPrintQuoteMinimalValueEndingWithSpace() throws IOException {
        createPrinter(CSVFormat.DEFAULT.withQuotePolicy(Quote.MINIMAL));
        printer.print("a ");
        assertEquals("\"a \"", writer.toString());
    }

    @Test
    public void testPrintQuoteMinimalValueContainingQuote() throws IOException {
        createPrinter(CSVFormat.DEFAULT.withQuotePolicy(Quote.MINIMAL));
        printer.print("a\"b");
        assertEquals("\"a\"\"b\"", writer.toString());
    }

    @Test
    public void testPrintQuoteNonNumericWithString() throws IOException {
        createPrinter(CSVFormat.DEFAULT.withQuotePolicy(Quote.NON_NUMERIC));
        printer.print("abc");
        assertEquals("\"abc\"", writer.toString());
    }

    @Test
    public void testPrintQuoteNonNumericWithNumber() throws IOException {
        createPrinter(CSVFormat.DEFAULT.withQuotePolicy(Quote.NON_NUMERIC));
        printer.print(123);
        assertEquals("123", writer.toString());
    }

    @Test
    public void testPrintEmptyTokenAtStart() throws IOException {
        createDefaultPrinter();
        printer.print("");
        printer.print("a");
        assertEquals(",a", writer.toString());
    }

    @Test
    public void testPrintNullTokenAtStart() throws IOException {
        createDefaultPrinter();
        printer.print(null);
        printer.print("a");
        assertEquals(",a", writer.toString());
    }

    // ===== printComment =====
    @Test
    public void testPrintCommentDisabled() throws IOException {
        createPrinter(CSVFormat.DEFAULT.withCommentMarker(null));
        printer.printComment("test");
        assertEquals("", writer.toString());
    }

    @Test
    public void testPrintCommentEnabled() throws IOException {
        createPrinter(CSVFormat.DEFAULT.withCommentMarker('#'));
        printer.printComment("hello");
        assertEquals("# hello", writer.toString());
    }

    @Test
    public void testPrintCommentWithLineBreak() throws IOException {
        createPrinter(CSVFormat.DEFAULT.withCommentMarker('#'));
        printer.printComment("line1" + LF + "line2");
        assertEquals("# line1#line line2", writer.toString());
    }

    @Test
    public void testPrintCommentWithCR() throws IOException {
        createPrinter(CSVFormat.DEFAULT.withCommentMarker('#'));
        printer.printComment("line1" + CR + "line2");
        assertEquals("# line1# line2", writer.toString());
    }

    @Test
    public void testPrintCommentWithCRLF() throws IOException {
        createPrinter(CSVFormat.DEFAULT.withCommentMarker('#'));
        printer.printComment("line1" + CRLF + "line2");
        assertEquals("# line1# line2", writer.toString());
    }

    // ===== println =====
    @Test
    public void testPrintln() throws IOException {
        createPrinter(CSVFormat.DEFAULT.withRecordSeparator("\n"));
        printer.println();
        assertEquals("\n", writer.toString());
        printer.print("b");
        printer.println();
        assertEquals("\nb\n", writer.toString());
    }

    @Test
    public void testPrintlnNullRecordSeparator() throws IOException {
        createPrinter(CSVFormat.DEFAULT.withRecordSeparator(null));
        printer.println();
        assertEquals("", writer.toString());
    }

    // ===== printRecord(Iterable) =====
    @Test
    public void testPrintRecordIterable() throws IOException {
        createDefaultPrinter();
        printer.printRecord(Arrays.asList("a", "b", "c"));
        assertEquals("a,b,c" + LF, writer.toString());
    }

    @Test
    public void testPrintRecordIterableEmpty() throws IOException {
        createDefaultPrinter();
        printer.printRecord(Collections.emptyList());
        assertEquals(LF, writer.toString());
    }

    @Test
    public void testPrintRecordIterableNullElement() throws IOException {
        createDefaultPrinter();
        printer.printRecord(Arrays.asList("a", null, "c"));
        assertEquals("a,,c" + LF, writer.toString());
    }

    @Test
    public void testPrintMultipleRecords() throws IOException {
        createDefaultPrinter();
        printer.printRecord("a", "b");
        printer.printRecord("c", "d");
        assertEquals("a,b" + LF + "c,d" + LF, writer.toString());
    }

    // ===== printRecord(Object...) =====
    @Test
    public void testPrintRecordVarargs() throws IOException {
        createDefaultPrinter();
        printer.printRecord("a", "b", "c");
        assertEquals("a,b,c" + LF, writer.toString());
    }

    @Test
    public void testPrintRecordVarargsEmpty() throws IOException {
        createDefaultPrinter();
        printer.printRecord(new Object[0]);
        assertEquals(LF, writer.toString());
    }

    @Test
    public void testPrintRecordVarargsNull() throws IOException {
        createDefaultPrinter();
        printer.printRecord((Object[]) null);
        assertEquals(LF, writer.toString());
    }

    @Test
    public void testPrintRecordWithNewlineInValue() throws IOException {
        createDefaultPrinter();
        printer.printRecord("a" + LF + "b");
        assertEquals("\"a\nb\"" + LF, writer.toString());
    }

    // ===== printRecords(Iterable) =====
    @Test
    public void testPrintRecordsIterableOfIterables() throws IOException {
        createDefaultPrinter();
        printer.printRecords(Arrays.asList(
                Arrays.asList("a", "b"),
                Arrays.asList("c", "d")
        ));
        assertEquals("a,b" + LF + "c,d" + LF, writer.toString());
    }

    @Test
    public void testPrintRecordsIterableOfArrays() throws IOException {
        createDefaultPrinter();
        printer.printRecords(Arrays.asList(
                new Object[]{"a", "b"},
                new Object[]{"c", "d"}
        ));
        assertEquals("a,b" + LF + "c,d" + LF, writer.toString());
    }

    @Test
    public void testPrintRecordsIterableOfObjects() throws IOException {
        createDefaultPrinter();
        printer.printRecords(Arrays.asList("a", "b"));
        assertEquals("a" + LF + "b" + LF, writer.toString());
    }

    @Test
    public void testPrintRecordsIterableEmpty() throws IOException {
        createDefaultPrinter();
        printer.printRecords(Collections.emptyList());
        assertEquals("", writer.toString());
    }

    // ===== printRecords(Object[]) =====
    @Test
    public void testPrintRecordsArray() throws IOException {
        createDefaultPrinter();
        printer.printRecords(new Object[]{
                new Object[]{"a", "b"},
                new Object[]{"c", "d"}
        });
        assertEquals("a,b" + LF + "c,d" + LF, writer.toString());
    }

    @Test
    public void testPrintRecordsArrayEmpty() throws IOException {
        createDefaultPrinter();
        printer.printRecords(new Object[0]);
        assertEquals("", writer.toString());
    }

    @Test
    public void testPrintRecordsArrayNull() throws IOException {
        createDefaultPrinter();
        printer.printRecords((Object[]) null);
        assertEquals("", writer.toString());
    }

    // ===== printRecords(ResultSet) =====
    @Test
    public void testPrintRecordsResultSet() throws SQLException, IOException {
        ResultSet rs = new SingleResultSet("a", "b", "c");
        createDefaultPrinter();
        printer.printRecords(rs);
        assertEquals("a,b,c" + LF, writer.toString());
    }

    @Test
    public void testPrintRecordsResultSetMultipleRows() throws SQLException, IOException {
        ResultSet rs = new MultiResultSet(
                new String[]{"a", "b"},
                new String[]{"c", "d"}
        );
        createDefaultPrinter();
        printer.printRecords(rs);
        assertEquals("a,b" + LF + "c,d" + LF, writer.toString());
    }

    @Test
    public void testPrintRecordsResultSetEmpty() throws SQLException, IOException {
        ResultSet rs = new MultiResultSet();
        createDefaultPrinter();
        printer.printRecords(rs);
        assertEquals("", writer.toString());
    }

    @Test
    public void testPrintRecordsResultSetWithNull() throws SQLException, IOException {
        ResultSet rs = new SingleResultSet("a", null, "c");
        createDefaultPrinter();
        printer.printRecords(rs);
        assertEquals("a,,c" + LF, writer.toString());
    }

    // ===== getOut =====
    @Test
    public void testGetOut() throws IOException {
        StringWriter sw = new StringWriter();
        CSVPrinter p = new CSVPrinter(sw, CSVFormat.DEFAULT);
        assertSame(sw, p.getOut());
    }

    // ===== Dummy ResultSet implementations for testing =====
    private static class SingleResultSet implements ResultSet {
        private final Object[] row;
        private boolean hasNext = true;

        SingleResultSet(Object... row) {
            this.row = row;
        }

        @Override
        public boolean next() throws SQLException {
            if (!hasNext) return false;
            hasNext = false;
            return true;
        }

        @Override
        public java.sql.ResultSetMetaData getMetaData() throws SQLException {
            return new java.sql.ResultSetMetaData() {
                @Override
                public int getColumnCount() {
                    return row.length;
                }
                // ... other methods omitted for brevity
                public <T> T unwrap(Class<T> iface) { return null; }
                public boolean isWrapperFor(Class<?> iface) { return false; }
                public String getColumnLabel(int column) { return ""; }
                public String getColumnName(int column) { return ""; }
                public int getColumnType(int column) { return java.sql.Types.VARCHAR; }
                public boolean isNullable(int column) { return true; }
                // ... other methods
            };
        }

        @Override
        public String getString(int columnIndex) throws SQLException {
            if (columnIndex < 1 || columnIndex > row.length) {
                throw new SQLException("Invalid column index");
            }
            Object val = row[columnIndex - 1];
            return val == null ? null : val.toString();
        }

        // ... other required methods stubbed out
        public void close() {}
        public boolean wasNull() { return false; }
        // ... (many methods omitted for brevity)
    }

    private static class MultiResultSet implements ResultSet {
        private final Object[][] rows;
        private int index = -1;

        MultiResultSet(Object[]... rows) {
            this.rows = rows;
        }

        @Override
        public boolean next() throws SQLException {
            index++;
            return index < rows.length;
        }

        @Override
        public java.sql.ResultSetMetaData getMetaData() throws SQLException {
            if (rows.length == 0) {
                return new java.sql.ResultSetMetaData() {
                    @Override
                    public int getColumnCount() { return 0; }
                    // ... other methods
                };
            }
            final int colCount = rows[0].length;
            return new java.sql.ResultSetMetaData() {
                @Override
                public int getColumnCount() { return colCount; }
                // ... other methods
            };
        }

        @Override
        public String getString(int columnIndex) throws SQLException {
            if (rows.length == 0 || columnIndex < 1 || columnIndex > rows[index].length) {
                throw new SQLException("Invalid column index");
            }
            Object val = rows[index][columnIndex - 1];
            return val == null ? null : val.toString();
        }

        // ... other methods stubbed
        public void close() {}
        public boolean wasNull() { return false; }
        // ... (many methods omitted)
    }
}