package org.apache.commons.csv;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.io.StringReader;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.junit.Test;

public class CSVParserTest {

    @Test
    public void testParseStringWithHeader() throws IOException {
        String csv = "id,name,value\n1,John,10\n2,Jane,20";
        CSVFormat format = CSVFormat.DEFAULT.withHeader();
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            assertEquals(1L, parser.getRecordNumber());
            Map<String, Integer> headerMap = parser.getHeaderMap();
            assertNotNull(headerMap);
            assertEquals(3, headerMap.size());
            assertEquals(Integer.valueOf(0), headerMap.get("id"));
            assertEquals(Integer.valueOf(1), headerMap.get("name"));
            assertEquals(Integer.valueOf(2), headerMap.get("value"));
        }
    }

    @Test
    public void testParseWithNullString() throws IOException {
        String csv = "a,,b\n1,2,3";
        CSVFormat format = CSVFormat.DEFAULT.builder().setNullString("").get();
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            CSVRecord record = parser.nextRecord();
            assertNotNull(record);
            assertEquals("a", record.get(0));
            assertNull(record.get(1));
            assertEquals("b", record.get(2));
        }
    }

    @Test
    public void testParseWithHeaderSkipAndCustomHeader() throws IOException {
        String csv = "ignored\ncol1,col2\n1,2";
        CSVFormat format = CSVFormat.DEFAULT.builder()
                .setHeader()
                .setSkipHeaderRecord(true)
                .get();
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            Map<String, Integer> headerMap = parser.getHeaderMap();
            assertEquals(2, headerMap.size());
            assertTrue(headerMap.containsKey("col1"));
            assertTrue(headerMap.containsKey("col2"));
            CSVRecord record = parser.nextRecord();
            assertEquals("1", record.get("col1"));
            assertEquals("2", record.get("col2"));
        }
    }

    @Test
    public void testGetRecordsReturnsAll() throws IOException {
        String csv = "a,b\n1,2\n3,4\n5,6";
        try (CSVParser parser = CSVParser.parse(csv, CSVFormat.DEFAULT)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(3, records.size());
            assertEquals("1", records.get(0).get(0));
            assertEquals("6", records.get(2).get(1));
        }
    }

    @Test
    public void testGetRecordsEmptyInput() throws IOException {
        String csv = "";
        try (CSVParser parser = CSVParser.parse(csv, CSVFormat.DEFAULT)) {
            List<CSVRecord> records = parser.getRecords();
            assertNotNull(records);
            assertTrue(records.isEmpty());
        }
    }

    @Test
    public void testIteratorHasNextAndNext() throws IOException {
        String csv = "a,b\n1,2";
        try (CSVParser parser = CSVParser.parse(csv, CSVFormat.DEFAULT)) {
            Iterator<CSVRecord> it = parser.iterator();
            assertTrue(it.hasNext());
            CSVRecord record = it.next();
            assertEquals("a", record.get(0));
            assertEquals("b", record.get(1));
            assertTrue(it.hasNext());
            record = it.next();
            assertEquals("1", record.get(0));
            assertEquals("2", record.get(1));
            assertFalse(it.hasNext());
        }
    }

    @Test
    public void testIteratorNextWithoutHasNext() throws IOException {
        String csv = "a,b\n1,2";
        try (CSVParser parser = CSVParser.parse(csv, CSVFormat.DEFAULT)) {
            Iterator<CSVRecord> it = parser.iterator();
            CSVRecord record = it.next();
            assertNotNull(record);
            record = it.next();
            assertNotNull(record);
            try {
                it.next();
                fail("Expected NoSuchElementException");
            } catch (NoSuchElementException e) {
                // expected exception
            }
        }
    }

    @Test
    public void testIteratorRemoveThrowsUnsupported() throws IOException {
        String csv = "a,b";
        try (CSVParser parser = CSVParser.parse(csv, CSVFormat.DEFAULT)) {
            Iterator<CSVRecord> it = parser.iterator();
            try {
                it.remove();
                fail("Expected UnsupportedOperationException");
            } catch (UnsupportedOperationException e) {
                // expected exception
            }
        }
    }

    @Test
    public void testIsClosedInitiallyFalse() throws IOException {
        String csv = "a,b";
        CSVParser parser = CSVParser.parse(csv, CSVFormat.DEFAULT);
        assertFalse(parser.isClosed());
        parser.close();
        assertTrue(parser.isClosed());
    }

    @Test
    public void testParseNullStringThrows() throws IOException {
        try {
            CSVParser.parse((String) null, CSVFormat.DEFAULT);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected exception
        }
    }

    @Test
    public void testParseNullFormatThrows() throws IOException {
        try {
            CSVParser.parse("x", null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected exception
        }
    }

    @Test
    public void testParseNullReaderThrows() throws IOException {
        try {
            CSVFormat format = CSVFormat.DEFAULT;
            new CSVParser(null, format);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected exception
        }
    }

    @Test
    public void testGetRecordNumberIncrements() throws IOException {
        String csv = "a\nb\nc";
        try (CSVParser parser = CSVParser.parse(csv, CSVFormat.DEFAULT)) {
            assertEquals(0L, parser.getRecordNumber());
            iteratorNext(parser);
            assertEquals(1L, parser.getRecordNumber());
            iteratorNext(parser);
            assertEquals(2L, parser.getRecordNumber());
        }
    }

    private static void iteratorNext(CSVParser parser) {
        for (CSVRecord record : parser) {
            break;
        }
    }

    @Test
    public void testCustomHeaderWithMultipleRecords() throws IOException {
        String csv = "col1,col2\n1,2\n3,4";
        CSVFormat format = CSVFormat.DEFAULT.builder().setHeader().get();
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            CSVRecord record = parser.nextRecord();
            assertEquals("1", record.get("col1"));
            assertEquals("2", record.get("col2"));
            record = parser.nextRecord();
            assertEquals("3", record.get("col1"));
            assertEquals("4", record.get("col2"));
            assertNull(parser.nextRecord());
        }
    }

    @Test
    public void testCloseTwice() throws IOException {
        String csv = "a";
        CSVParser parser = CSVParser.parse(csv, CSVFormat.DEFAULT);
        parser.close();
        parser.close();
        assertTrue(parser.isClosed());
    }

    @Test
    public void testGetLineNumberWithSimpleRecords() throws IOException {
        String csv = "line1\nline2\nline3";
        try (CSVParser parser = CSVParser.parse(csv, CSVFormat.DEFAULT)) {
            assertEquals(0L, parser.getCurrentLineNumber());
            parser.nextRecord();
            assertEquals(1L, parser.getCurrentLineNumber());
            parser.nextRecord();
            assertEquals(2L, parser.getCurrentLineNumber());
            parser.nextRecord();
            assertEquals(3L, parser.getCurrentLineNumber());
        }
    }
}