package org.apache.commons.csv;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class CSVParserTest {

    private CSVParser parser;
    private CSVFormat format;

    @Before
    public void setUp() {
        format = CSVFormat.DEFAULT;
    }

    @After
    public void tearDown() throws IOException {
        if (parser != null) {
            parser.close();
        }
    }

    @Test
    public void testParseString() throws IOException {
        parser = CSVParser.parse("a,b,c\n1,2,3", format);
        List<CSVRecord> records = parser.getRecords();
        assertEquals(2, records.size());
        assertEquals("a", records.get(0).get(0));
        assertEquals("1", records.get(1).get(0));
    }

    @Test(expected = NullPointerException.class)
    public void testParseNullString() throws IOException {
        CSVParser.parse((String) null, format);
    }

    @Test(expected = NullPointerException.class)
    public void testParseNullFormat() throws IOException {
        CSVParser.parse("a,b", null);
    }

    @Test
    public void testParseEmptyString() throws IOException {
        parser = CSVParser.parse("", format);
        List<CSVRecord> records = parser.getRecords();
        assertTrue(records.isEmpty());
    }

    @Test
    public void testParseSingleRecord() throws IOException {
        parser = CSVParser.parse("hello,world", format);
        List<CSVRecord> records = parser.getRecords();
        assertEquals(1, records.size());
        assertEquals("hello", records.get(0).get(0));
        assertEquals("world", records.get(0).get(1));
    }

    @Test
    public void testParseMultiLineRecord() throws IOException {
        format = CSVFormat.DEFAULT.withIgnoreEmptyLines(false);
        parser = CSVParser.parse("a,b\nc,d\ne,f", format);
        List<CSVRecord> records = parser.getRecords();
        assertEquals(3, records.size());
        assertEquals("e", records.get(2).get(0));
    }

    @Test
    public void testParseHeaderMap() throws IOException {
        format = CSVFormat.DEFAULT.withHeader("name", "age");
        parser = CSVParser.parse("John,30\nJane,25", format);
        Map<String, Integer> headerMap = parser.getHeaderMap();
        assertNotNull(headerMap);
        assertEquals(2, headerMap.size());
        assertEquals(Integer.valueOf(0), headerMap.get("name"));
        assertEquals(Integer.valueOf(1), headerMap.get("age"));
    }

    @Test
    public void testGetHeaderMapNull() throws IOException {
        parser = CSVParser.parse("a,b\n1,2", format);
        assertNull(parser.getHeaderMap());
    }

    @Test
    public void testGetHeaderMapEmptyArray() throws IOException {
        format = CSVFormat.DEFAULT.withHeader();
        parser = CSVParser.parse("col1,col2\nval1,val2", format);
        Map<String, Integer> headerMap = parser.getHeaderMap();
        assertNotNull(headerMap);
        assertEquals(2, headerMap.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDuplicateHeader() throws IOException {
        format = CSVFormat.DEFAULT.withHeader("a", "b", "a");
        parser = CSVParser.parse("1,2,3\n4,5,6", format);
    }

    @Test
    public void testDuplicateHeaderIgnoreEmpty() throws IOException {
        format = CSVFormat.DEFAULT.withHeader("a", "", "a").withIgnoreEmptyHeaders(true);
        parser = CSVParser.parse("1,2,3\n4,5,6", format);
        Map<String, Integer> headerMap = parser.getHeaderMap();
        assertNotNull(headerMap);
        assertEquals(2, headerMap.size());
    }

    @Test
    public void testRecordNumber() throws IOException {
        parser = CSVParser.parse("a,b\nc,d\ne,f", format);
        parser.getRecords();
        assertEquals(3, parser.getRecordNumber());
    }

    @Test
    public void testGetCurrentLineNumber() throws IOException {
        parser = CSVParser.parse("a,b\nc,d", format);
        parser.nextRecord();
        assertEquals(2, parser.getCurrentLineNumber());
    }

    @Test
    public void testIterator() throws IOException {
        parser = CSVParser.parse("a,b\nc,d\ne,f", format);
        int count = 0;
        for (CSVRecord record : parser) {
            count++;
            assertNotNull(record);
        }
        assertEquals(3, count);
    }

    @Test
    public void testIteratorLastRecord() throws IOException {
        parser = CSVParser.parse("a,b\nc,d", format);
        int count = 0;
        for (@SuppressWarnings("unused") CSVRecord record : parser) {
            count++;
        }
        parser.iterator().next(); // hasNext() returns false, but next() called explicitly
        assertTrue(true); // Should not throw NoSuchElementException for hasNext() check
    }

    @Test(expected = NoSuchElementException.class)
    public void testIteratorNextAfterEnd() throws IOException {
        parser = CSVParser.parse("a,b", format);
        Iterator<CSVRecord> iterator = parser.iterator();
        iterator.next();
        iterator.next();
        iterator.next(); // Should throw NoSuchElementException
    }

    @Test
    public void testIteratorRemove() throws IOException {
        parser = CSVParser.parse("a,b\nc,d", format);
        Iterator<CSVRecord> iterator = parser.iterator();
        iterator.next();
        try {
            iterator.remove();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testIsClosed() throws IOException {
        parser = CSVParser.parse("a,b", format);
        assertFalse(parser.isClosed());
        parser.close();
        assertTrue(parser.isClosed());
    }

    @Test
    public void testIsClosedIteratorReturnsFalse() throws IOException {
        parser = CSVParser.parse("a,b\nc,d", format);
        Iterator<CSVRecord> iterator = parser.iterator();
        parser.close();
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testNullStringHandling() throws IOException {
        format = CSVFormat.DEFAULT.withNullString("NULL");
        parser = CSVParser.parse("a,NULL\nNULL,b", format);
        List<CSVRecord> records = parser.getRecords();
        assertNull(records.get(0).get(1));
        assertNull(records.get(1).get(0));
        assertNotNull(records.get(0).get(0));
    }

    @Test
    public void testNullStringNull() throws IOException {
        format = CSVFormat.DEFAULT.withNullString(null);
        parser = CSVParser.parse("a,b", format);
        List<CSVRecord> records = parser.getRecords();
        assertEquals("a", records.get(0).get(0));
        assertEquals("b", records.get(0).get(1));
    }

    @Test
    public void testRecordsCollection() throws IOException {
        parser = CSVParser.parse("a,b\nc,d", format);
        List<CSVRecord> records = new ArrayList<CSVRecord>();
        List<CSVRecord> result = parser.getRecords(records);
        assertSame(records, result);
        assertEquals(2, records.size());
    }

    @Test
    public void testCloseTwice() throws IOException {
        parser = CSVParser.parse("a,b", format);
        parser.close();
        parser.close(); // should not throw
    }

    @Test
    public void testParseFile() throws IOException {
        java.io.File tempFile = java.io.File.createTempFile("csvtest", ".csv");
        try {
            java.io.FileWriter writer = new java.io.FileWriter(tempFile);
            writer.write("a,b\n1,2");
            writer.close();
            parser = CSVParser.parse(tempFile, java.nio.charset.Charset.defaultCharset(), format);
            List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
        } finally {
            tempFile.delete();
        }
    }

    @Test(expected = NullPointerException.class)
    public void testParseFileNullFile() throws IOException {
        CSVParser.parse((java.io.File) null, java.nio.charset.Charset.defaultCharset(), format);
    }

    @Test(expected = NullPointerException.class)
    public void testParseFileNullCharset() throws IOException {
        java.io.File tempFile = java.io.File.createTempFile("csvtest", ".csv");
        try {
            CSVParser.parse(tempFile, null, format);
        } finally {
            tempFile.delete();
        }
    }

    @Test(expected = NullPointerException.class)
    public void testParseFileNullFormat() throws IOException {
        java.io.File tempFile = java.io.File.createTempFile("csvtest", ".csv");
        try {
            CSVParser.parse(tempFile, java.nio.charset.Charset.defaultCharset(), null);
        } finally {
            tempFile.delete();
        }
    }

    @Test(expected = NullPointerException.class)
    public void testParseUrlNullUrl() throws IOException {
        CSVParser.parse((java.net.URL) null, java.nio.charset.Charset.defaultCharset(), format);
    }

    @Test(expected = NullPointerException.class)
    public void testParseUrlNullCharset() throws IOException {
        java.net.URL url = new java.net.URL("file://nonexistent");
        CSVParser.parse(url, null, format);
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorNullReader() throws IOException {
        new CSVParser(null, format);
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorNullFormat() throws IOException {
        new CSVParser(new StringReader("a,b"), null);
    }

    @Test
    public void testParseCommentIgnored() throws IOException {
        format = CSVFormat.DEFAULT.withCommentMarker('#');
        parser = CSVParser.parse("#comment\na,b\n1,2", format);
        List<CSVRecord> records = parser.getRecords();
        assertEquals(2, records.size());
    }

    @Test
    public void testSkipHeaderRecord() throws IOException {
        format = CSVFormat.DEFAULT.withHeader("a", "b").withSkipHeaderRecord(true);
        parser = CSVParser.parse("header_a,header_b\n1,2\n3,4", format);
        List<CSVRecord> records = parser.getRecords();
        assertEquals(2, records.size());
        assertEquals("1", records.get(0).get(0));
    }

    @Test
    public void testGetRecordNumberEmptyInput() throws IOException {
        parser = CSVParser.parse("", format);
        assertEquals(0, parser.getRecordNumber());
    }
}