package org.apache.commons.csv;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.StringReader;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CSVParserTest {

    @Test
    public void parse_givenSimpleCsv_shouldParseRecords() throws IOException {
        // Arrange
        String csv = "a,b,c\r\n1,2,3";

        // Act
        CSVParser parser = CSVParser.parse(csv, CSVFormat.DEFAULT);
        List records = parser.getRecords();

        // Assert
        Assert.assertEquals(2, records.size());
        CSVRecord r1 = (CSVRecord) records.get(0);
        Assert.assertEquals("a", r1.get(0));
        Assert.assertEquals("b", r1.get(1));
        Assert.assertEquals("c", r1.get(2));

        CSVRecord r2 = (CSVRecord) records.get(1);
        Assert.assertEquals("1", r2.get(0));
        Assert.assertEquals("2", r2.get(1));
        Assert.assertEquals("3", r2.get(2));
        parser.close();
    }

    @Test
    public void parse_givenCustomDelimiter_shouldParseFieldsCorrectly() throws IOException {
        // Arrange
        String csv = "x;y;z";
        CSVFormat format = CSVFormat.DEFAULT.withDelimiter(';');

        // Act
        CSVParser parser = CSVParser.parse(csv, format);
        CSVRecord record = parser.nextRecord();

        // Assert
        Assert.assertNotNull(record);
        Assert.assertEquals(3, record.size());
        Assert.assertEquals("x", record.get(0));
        Assert.assertEquals("y", record.get(1));
        Assert.assertEquals("z", record.get(2));
        parser.close();
    }

    @Test
    public void parse_givenQuotesAndEscapes_shouldParseQuotedFields() throws IOException {
        // Arrange
        String csv = "\"hello, world\",second";

        // Act
        CSVParser parser = CSVParser.parse(csv, CSVFormat.DEFAULT);
        CSVRecord record = parser.nextRecord();

        // Assert
        Assert.assertNotNull(record);
        Assert.assertEquals("hello, world", record.get(0));
        Assert.assertEquals("second", record.get(1));
        parser.close();
    }

    @Test
    public void getHeaderMap_givenHeaderDefinition_shouldMapColumnNamesToIndices() throws IOException {
        // Arrange
        String csv = "Alice,30\r\nBob,25";
        CSVFormat format = CSVFormat.DEFAULT.withHeader("Name", "Age");

        // Act
        CSVParser parser = CSVParser.parse(csv, format);
        Map headerMap = parser.getHeaderMap();

        // Assert
        Assert.assertNotNull(headerMap);
        Assert.assertEquals(2, headerMap.size());
        Assert.assertEquals(new Integer(0), headerMap.get("Name"));
        Assert.assertEquals(new Integer(1), headerMap.get("Age"));

        CSVRecord r = parser.nextRecord();
        Assert.assertEquals("Alice", r.get("Name"));
        Assert.assertEquals("30", r.get("Age"));
        parser.close();
    }

    @Test
    public void iterator_shouldTraverseAllRecords() throws IOException {
        // Arrange
        String csv = "1\n2\n3";
        CSVParser parser = CSVParser.parse(csv, CSVFormat.DEFAULT);

        // Act
        Iterator it = parser.iterator();
        int count = 0;
        while (it.hasNext()) {
            CSVRecord r = (CSVRecord) it.next();
            Assert.assertNotNull(r);
            count++;
        }

        // Assert
        Assert.assertEquals(3, count);
        parser.close();
    }

    @Test
    public void getRecordNumber_shouldTrackRecordIndex() throws IOException {
        // Arrange
        String csv = "row1\nrow2";
        CSVParser parser = CSVParser.parse(csv, CSVFormat.DEFAULT);

        // Act & Assert
        CSVRecord r1 = parser.nextRecord();
        Assert.assertEquals(1L, r1.getRecordNumber());

        CSVRecord r2 = parser.nextRecord();
        Assert.assertEquals(2L, r2.getRecordNumber());
        parser.close();
    }

    @Test
    public void close_givenOpenParser_shouldClose() throws IOException {
        // Arrange
        CSVParser parser = CSVParser.parse("test", CSVFormat.DEFAULT);

        // Act
        parser.close();

        // Assert
        Assert.assertTrue(parser.isClosed());
    }

    @Test(expected = IllegalArgumentException.class)
    public void parse_givenNullReaderOrFormat_shouldThrowIllegalArgumentException() throws IOException {
        // Arrange, Act & Assert
        new CSVParser(null, CSVFormat.DEFAULT);
    }
}
