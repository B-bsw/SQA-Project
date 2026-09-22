package org.apache.commons.csv;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.List;

public class CSVPrinterTest {

    @Test
    public void constructor_givenValidAppendableAndFormat_shouldInitialize() throws IOException {
        // Arrange
        StringWriter sw = new StringWriter();

        // Act
        CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);

        // Assert
        Assert.assertNotNull(printer);
        Assert.assertSame(sw, printer.getOut());
        printer.close();
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenNullAppendable_shouldThrowIllegalArgumentException() throws IOException {
        // Arrange, Act & Assert
        new CSVPrinter(null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenNullFormat_shouldThrowIllegalArgumentException() throws IOException {
        // Arrange, Act & Assert
        new CSVPrinter(new StringWriter(), null);
    }

    @Test
    public void printRecord_givenArrayOfObjects_shouldWriteRecordWithDelimiterAndNewline() throws IOException {
        // Arrange
        StringWriter sw = new StringWriter();
        CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);

        // Act
        printer.printRecord("A", "B", "C");
        printer.close();

        // Assert
        Assert.assertEquals("A,B,C\r\n", sw.toString());
    }

    @Test
    public void printRecord_givenIterable_shouldWriteRecord() throws IOException {
        // Arrange
        StringWriter sw = new StringWriter();
        CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);
        List list = Arrays.asList(new String[] { "1", "2", "3" });

        // Act
        printer.printRecord(list);
        printer.close();

        // Assert
        Assert.assertEquals("1,2,3\r\n", sw.toString());
    }

    @Test
    public void printRecords_givenMultipleRecords_shouldWriteAllRecords() throws IOException {
        // Arrange
        StringWriter sw = new StringWriter();
        CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);
        List r1 = Arrays.asList(new String[] { "row1_col1", "row1_col2" });
        List r2 = Arrays.asList(new String[] { "row2_col1", "row2_col2" });
        List all = Arrays.asList(new List[] { r1, r2 });

        // Act
        printer.printRecords(all);
        printer.close();

        // Assert
        Assert.assertEquals("row1_col1,row1_col2\r\nrow2_col1,row2_col2\r\n", sw.toString());
    }

    @Test
    public void printComment_givenCommentString_shouldWriteCommentMarkerAndComment() throws IOException {
        // Arrange
        StringWriter sw = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        CSVPrinter printer = new CSVPrinter(sw, format);

        // Act
        printer.printComment("This is a comment");
        printer.printRecord("data1", "data2");
        printer.close();

        // Assert
        String result = sw.toString();
        Assert.assertTrue(result.startsWith("# This is a comment"));
        Assert.assertTrue(result.contains("data1,data2"));
    }

    @Test
    public void print_givenValueContainingDelimiter_shouldQuoteValue() throws IOException {
        // Arrange
        StringWriter sw = new StringWriter();
        CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);

        // Act
        printer.printRecord("hello, world", "regular");
        printer.close();

        // Assert
        Assert.assertEquals("\"hello, world\",regular\r\n", sw.toString());
    }

    @Test
    public void print_givenValueContainingQuote_shouldEscapeQuotes() throws IOException {
        // Arrange
        StringWriter sw = new StringWriter();
        CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);

        // Act
        printer.printRecord("a \"quoted\" word", "plain");
        printer.close();

        // Assert
        Assert.assertEquals("\"a \"\"quoted\"\" word\",plain\r\n", sw.toString());
    }

    @Test
    public void println_shouldWriteRecordSeparator() throws IOException {
        // Arrange
        StringWriter sw = new StringWriter();
        CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);

        // Act
        printer.print("val");
        printer.println();
        printer.close();

        // Assert
        Assert.assertEquals("val\r\n", sw.toString());
    }

    @Test
    public void flushAndClose_givenOpenPrinter_shouldFlushAndCloseWithoutError() throws IOException {
        // Arrange
        StringWriter sw = new StringWriter();
        CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);

        // Act
        printer.print("test");
        printer.flush();
        printer.close();

        // Assert
        Assert.assertEquals("test", sw.toString());
    }
}
