package org.apache.commons.csv;

import static org.junit.Assert.assertEquals;
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

    private static final String CSV_STRING = "a,b,c\n1,2,3\n4,5,6";
    private static final String CSV_STRING_SINGLE = "a,b,c";
    private static final String CSV_STRING_EMPTY = "";
    private static final String CSV_STRING_MULTILINE = "a,b\n\"line1\nline2\",c\n\n";

    private CSVParser createParser(String csv, CSVFormat format) throws IOException {
        CSVParser parser = CSVParser.parse(csv, format);
        return parser;
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseNullString() throws IOException {
        CSVParser.parse((String) null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseNullFormat() throws IOException {
        CSVParser.parse("a,b", null);
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorNullReader() throws IOException {
        new CSVParser(null, CSVFormat.DEFAULT);
    }

    @Test
    public void testParseEmptyString() throws IOException {
        CSVParser parser = createParser(CSV_STRING_EMPTY, CSVFormat.DEFAULT);
        assertNotNull(parser);
        List<CSVRecord> records = parser.getRecords();
        assertEquals(0, records.size());
        parser.close();
    }

    @Test
    public void testParseSingleRecord() throws IOException {
        CSVParser parser = createParser(CSV_STRING_SINGLE, CSVFormat.DEFAULT);
        List<CSVRecord> records = parser.getRecords();
        assertEquals(1, records.size());
        CSVRecord record = records.get(0);
        assertEquals(3, record.size());
        assertEquals("a", record.get(0));
        assertEquals("b", record.get(1));
        assertEquals("c", record.get(2));
        parser.close();
    }

    @Test
    public void testParseMultipleRecords() throws IOException {
        CSVParser parser = createParser(CSV_STRING, CSVFormat.DEFAULT);
        List<CSVRecord> records = parser.getRecords();
        assertEquals(3, records.size());
        CSVRecord record = records.get(0);
        assertEquals(3, record.size());
        assertEquals("1", record.get(0));
        assertEquals("2", record.get(1));
        assertEquals("3", record.get(2));
        record = records.get(1);
        assertEquals("4", record.get(0));
        record = records.get(2);
        assertEquals("6", record.get(2));
        parser.close();
    }

    @Test
    public void testParseHeaders() throws IOException {
        CSVParser parser = createParser("col1,col2,col3\n1,2,3", CSVFormat.DEFAULT.withHeader());
        Map<String, Integer> headerMap = parser.getHeaderMap();
        assertNotNull(headerMap);
        assertEquals(3, headerMap.size());
        assertTrue(headerMap.containsKey("col1"));
        assertEquals(Integer.valueOf(0), headerMap.get("col1"));
        assertEquals(Integer.valueOf(1), headerMap.get("col2"));
        parser.close();
    }

    @Test
    public void testParseNoHeader() throws IOException {
        CSVParser parser = createParser("a,b\n1,2", CSVFormat.DEFAULT);
        assertNull(parser.getHeaderMap());
        parser.close();
    }

    @Test
    public void testParseEmptyHeader() throws IOException {
        CSVParser parser = createParser("a,b\n1,2", CSVFormat.DEFAULT.withHeader());
        assertNotNull(parser.getHeaderMap());
        assertEquals(2, parser.getHeaderMap().size());
        parser.close();
    }

    @Test
    public void testRecordNumber() throws IOException {
        CSVParser parser = createParser("a,b\n1,2\n3,4", CSVFormat.DEFAULT);
        assertEquals(0, parser.getRecordNumber());
        parser.nextRecord();
        assertEquals(1, parser.getRecordNumber());
        parser.nextRecord();
        assertEquals(2, parser.getRecordNumber());
        parser.nextRecord();
        assertEquals(3, parser.getRecordNumber());
        parser.close();
    }

    @Test
    public void testIterator() throws IOException {
        CSVParser parser = createParser("a,b\n1,2\n3,4", CSVFormat.DEFAULT);
        Iterator<CSVRecord> it = parser.iterator();
        assertTrue(it.hasNext());
        CSVRecord rec = it.next();
        assertEquals(2, rec.size());
        assertTrue(it.hasNext());
        it.next();
        assertTrue(it.hasNext());
        it.next();
        assertTrue(!it.hasNext());
        parser.close();
    }

    @Test(expected = NoSuchElementException.class)
    public void testIteratorNoSuchElement() throws IOException {
        CSVParser parser = createParser("a,b", CSVFormat.DEFAULT);
        Iterator<CSVRecord> it = parser.iterator();
        assertTrue(it.hasNext());
        it.next();
        try {
            it.next();
            fail("Expected NoSuchElementException");
        } catch (NoSuchElementException e) {
            // expected
            throw e;
        } finally {
            parser.close();
        }
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testIteratorRemove() throws IOException {
        CSVParser parser = createParser("a,b", CSVFormat.DEFAULT);
        Iterator<CSVRecord> it = parser.iterator();
        try {
            it.remove();
            fail("Expected UnsupportedOperationException");
        } finally {
            parser.close();
        }
    }

    @Test
    public void testClose() throws IOException {
        CSVParser parser = createParser("a,b", CSVFormat.DEFAULT);
        assertTrue(!parser.isClosed());
        parser.close();
        assertTrue(parser.isClosed());
    }

    @Test
    public void testParseWithNullString() throws IOException {
        CSVParser parser = createParser("a,,c", CSVFormat.DEFAULT.withNullString(""));
        List<CSVRecord> records = parser.getRecords();
        assertEquals(1, records.size());
        assertNull(records.get(0).get(1));
        assertEquals("a", records.get(0).get(0));
        parser.close();
    }

    @Test
    public void testParseCustomFormat() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withDelimiter(';');
        CSVParser parser = createParser("a;b;c\n1;2;3", format);
        List<CSVRecord> records = parser.getRecords();
        assertEquals(2, records.size());
        assertEquals("a", records.get(0).get(0));
        assertEquals("1", records.get(1).get(0));
        parser.close();
    }

    @Test(expected = IOException.class)
    public void testInvalidSequence() throws IOException {
        CSVParser parser = createParser("\"a\"\"b", CSVFormat.DEFAULT);
        parser.getRecords();
        fail("Expected IOException");
    }
}