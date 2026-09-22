package org.apache.commons.csv;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.Map;

public class CSVParserTest {
    private CSVParser parser;
    private static final String SIMPLE_CSV = "a,b,c\n1,2,3\n4,5,6";
    private static final String HEADER_CSV = "name,age,city\nJohn,25,NYC\nJane,30,LA";

    @Before
    public void setUp() throws IOException {
        // Initialize with default format
        parser = new CSVParser(new StringReader(SIMPLE_CSV), CSVFormat.DEFAULT);
    }

    @After
    public void tearDown() throws IOException {
        if (parser != null) {
            parser.close();
        }
    }

    @Test
    public void testParseString() throws IOException {
        CSVParser result = CSVParser.parse(SIMPLE_CSV, CSVFormat.DEFAULT);
        assertNotNull(result);
        assertEquals(3, result.getRecords().size());
        result.close();
    }

    @Test(expected = NullPointerException.class)
    public void testParseNullString() throws IOException {
        CSVParser.parse((String) null, CSVFormat.DEFAULT);
    }

    @Test
    public void testParseEmptyString() throws IOException {
        CSVParser result = CSVParser.parse("", CSVFormat.DEFAULT);
        assertNotNull(result);
        assertEquals(0, result.getRecords().size());
        result.close();
    }

    @Test
    public void testGetRecords() throws IOException {
        List<CSVRecord> records = parser.getRecords();
        assertEquals(3, records.size());
        assertEquals("1", records.get(0).get(0));
        assertEquals("3", records.get(0).get(2));
    }

    @Test
    public void testGetRecordNumber() throws IOException {
        parser.getRecords();
        assertEquals(3L, parser.getRecordNumber());
    }

    @Test
    public void testHeaderMap() throws IOException {
        CSVParser headerParser = null;
        try {
            headerParser = CSVParser.parse(HEADER_CSV, CSVFormat.DEFAULT.withFirstRecordAsHeader());
            Map<String, Integer> headerMap = headerParser.getHeaderMap();
            assertNotNull(headerMap);
            assertEquals(3, headerMap.size());
            assertEquals(Integer.valueOf(0), headerMap.get("name"));
            assertEquals(Integer.valueOf(1), headerMap.get("age"));
            assertEquals(Integer.valueOf(2), headerMap.get("city"));
        } finally {
            if (headerParser != null) {
                headerParser.close();
            }
        }
    }

    @Test
    public void testHeaderMapNullWhenNoHeader() {
        assertNull(parser.getHeaderMap());
    }

    @Test(expected = IOException.class)
    public void testParseNullReader() throws IOException {
        CSVParser.parse((Reader) null, CSVFormat.DEFAULT);
    }

    @Test
    public void testInputStreamParser() throws IOException {
        java.io.InputStream input = new java.io.ByteArrayInputStream(SIMPLE_CSV.getBytes());
        CSVParser streamParser = null;
        try {
            streamParser = CSVParser.parse(input, java.nio.charset.StandardCharsets.UTF_8, CSVFormat.DEFAULT);
            assertEquals(3, streamParser.getRecords().size());
        } finally {
            if (streamParser != null) {
                streamParser.close();
            }
        }
    }

    @Test
    public void testClose() throws IOException {
        parser.close();
        assertTrue(parser.isClosed());
    }

    @Test
    public void testIsNotClosedInitially() {
        assertFalse(parser.isClosed());
    }

    @Test
    public void testSingleRecord() throws IOException {
        CSVParser singleParser = null;
        try {
            singleParser = CSVParser.parse("single,record,here", CSVFormat.DEFAULT);
            List<CSVRecord> records = singleParser.getRecords();
            assertEquals(1, records.size());
            assertEquals("single", records.get(0).get(0));
        } finally {
            if (singleParser != null) {
                singleParser.close();
            }
        }
    }

    @Test
    public void testEmptyRecords() throws IOException {
        CSVParser emptyParser = null;
        try {
            emptyParser = CSVParser.parse("\n\n", CSVFormat.DEFAULT);
            List<CSVRecord> records = emptyParser.getRecords();
            assertNotNull(records);
        } finally {
            if (emptyParser != null) {
                emptyParser.close();
            }
        }
    }

    @Test
    public void testGetFirstEndOfLine() throws IOException {
        CSVParser eolParser = null;
        try {
            eolParser = CSVParser.parse("a\nb\r\nc", CSVFormat.DEFAULT);
            eolParser.getRecords();
            assertNotNull(eolParser.getFirstEndOfLine());
        } finally {
            if (eolParser != null) {
                eolParser.close();
            }
        }
    }

    @Test
    public void testIterator() throws IOException {
        int count = 0;
        for (@SuppressWarnings("unused") CSVRecord record : parser) {
            count++;
        }
        assertEquals(3, count);
    }

    @Test
    public void testIteratorHasNextAfterClose() throws IOException {
        parser.close();
        java.util.Iterator<CSVRecord> iterator = parser.iterator();
        assertFalse(iterator.hasNext());
    }

    @Test(expected = java.util.NoSuchElementException.class)
    public void testIteratorNextWithoutHasNext() {
        java.util.Iterator<CSVRecord> iterator = parser.iterator();
        iterator.next(); // Should throw NoSuchElementException
    }

    @Test
    public void testWithQuotedFields() throws IOException {
        CSVParser quotedParser = null;
        try {
            String quotedCsv = "\"quoted, value\",second\n\"line, break\",third";
            quotedParser = CSVParser.parse(quotedCsv, CSVFormat.DEFAULT);
            List<CSVRecord> records = quotedParser.getRecords();
            assertEquals(2, records.size());
            assertEquals("quoted, value", records.get(0).get(0));
        } finally {
            if (quotedParser != null) {
                quotedParser.close();
            }
        }
    }

    @Test
    public void testTrailingDelimiter() throws IOException {
        CSVParser trailingParser = null;
        try {
            String trailingCsv = "a,b,\nc,d,";
            trailingParser = CSVParser.parse(trailingCsv, CSVFormat.DEFAULT.withTrailingDelimiter());
            List<CSVRecord> records = trailingParser.getRecords();
            assertEquals(2, records.size());
        } finally {
            if (trailingParser != null) {
                trailingParser.close();
            }
        }
    }
}