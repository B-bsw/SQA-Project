package org.apache.commons.csv;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.junit.Test;

public class CSVRecordTest {

    private static final String[] VALUES = {"A", "B", "C"};
    private static final Map<String, Integer> MAPPING = new HashMap<String, Integer>();
    static {
        MAPPING.put("col1", 0);
        MAPPING.put("col2", 1);
        MAPPING.put("col3", 2);
        MAPPING.put("invalid", 5);
    }
    private static final String COMMENT = "comment";
    private static final long RECORD_NUMBER = 42L;

    private CSVRecord createRecord() {
        return new CSVRecord(VALUES, MAPPING, COMMENT, RECORD_NUMBER);
    }

    private CSVRecord createRecordWithNullComment() {
        return new CSVRecord(VALUES, MAPPING, null, RECORD_NUMBER);
    }

    private CSVRecord createRecordWithNullMapping() {
        return new CSVRecord(VALUES, null, COMMENT, RECORD_NUMBER);
    }

    private CSVRecord createRecordWithNullValues() {
        return new CSVRecord(null, MAPPING, COMMENT, RECORD_NUMBER);
    }

    @Test
    public void testGetByIndex() {
        CSVRecord record = createRecord();
        assertEquals("A", record.get(0));
        assertEquals("B", record.get(1));
        assertEquals("C", record.get(2));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetByIndexNegative() {
        createRecord().get(-1);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetByIndexOutOfBounds() {
        createRecord().get(3);
    }

    @Test
    public void testGetByEnum() {
        CSVRecord record = createRecord();
        assertEquals("A", record.get(TestEnum.COL1));
        assertEquals("B", record.get(TestEnum.COL2));
    }

    @Test
    public void testGetByName() {
        CSVRecord record = createRecord();
        assertEquals("A", record.get("col1"));
        assertEquals("B", record.get("col2"));
        assertEquals("C", record.get("col3"));
    }

    @Test
    public void testGetByNameNullMapping() {
        CSVRecord record = createRecordWithNullMapping();
        try {
            record.get("col1");
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
    }

    @Test
    public void testGetByNameNotMapped() {
        CSVRecord record = createRecord();
        try {
            record.get("missing");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("missing"));
        }
    }

    @Test
    public void testGetByNameIndexOutOfBounds() {
        CSVRecord record = createRecord();
        try {
            record.get("invalid");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("invalid"));
        }
    }

    @Test
    public void testGetComment() {
        assertEquals(COMMENT, createRecord().getComment());
        assertNull(createRecordWithNullComment().getComment());
    }

    @Test
    public void testGetRecordNumber() {
        assertEquals(RECORD_NUMBER, createRecord().getRecordNumber());
    }

    @Test
    public void testIsConsistent() {
        assertTrue(createRecord().isConsistent());
        CSVRecord inconsistent = new CSVRecord(VALUES, MAPPING, COMMENT, 1L);
        inconsistent = new CSVRecord(new String[]{"A"}, MAPPING, COMMENT, 1L);
        assertFalse(inconsistent.isConsistent());
        assertTrue(createRecordWithNullMapping().isConsistent());
    }

    @Test
    public void testIsMapped() {
        assertTrue(createRecord().isMapped("col1"));
        assertFalse(createRecord().isMapped("missing"));
        assertFalse(createRecordWithNullMapping().isMapped("col1"));
    }

    @Test
    public void testIsSet() {
        CSVRecord record = createRecord();
        assertTrue(record.isSet("col1"));
        assertFalse(record.isSet("invalid"));
        assertFalse(record.isSet("missing"));
        assertFalse(createRecordWithNullMapping().isSet("col1"));
    }

    @Test
    public void testIterator() {
        CSVRecord record = createRecord();
        Iterator<String> it = record.iterator();
        assertTrue(it.hasNext());
        assertEquals("A", it.next());
        assertTrue(it.hasNext());
        assertEquals("B", it.next());
        assertTrue(it.hasNext());
        assertEquals("C", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testPutIn() {
        CSVRecord record = createRecord();
        Map<String, String> map = record.putIn(new HashMap<String, String>());
        assertEquals(3, map.size());
        assertEquals("A", map.get("col1"));
        assertEquals("B", map.get("col2"));
        assertEquals("C", map.get("col3"));
    }

    @Test
    public void testPutInWithInvalidIndex() {
        CSVRecord record = createRecord();
        try {
            record.putIn(new HashMap<String, String>());
            fail("Expected ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testPutInWithNullMapping() {
        CSVRecord record = new CSVRecord(VALUES, null, COMMENT, 1L);
        Map<String, String> map = record.putIn(new HashMap<String, String>());
        assertTrue(map.isEmpty());
    }

    @Test
    public void testSize() {
        assertEquals(3, createRecord().size());
        assertEquals(0, createRecordWithNullValues().size());
    }

    @Test
    public void testToString() {
        assertEquals("[A, B, C]", createRecord().toString());
        assertEquals("[]", createRecordWithNullValues().toString());
    }

    private enum TestEnum {
        COL1, COL2, COL3
    }
}