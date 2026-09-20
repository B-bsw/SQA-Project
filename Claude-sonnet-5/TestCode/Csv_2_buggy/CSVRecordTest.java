package org.apache.commons.csv;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.junit.Test;

public class CSVRecordTest {

    @Test
    public void testGetByIndexNormal() {
        String[] values = {"a", "b", "c"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        assertEquals("a", record.get(0));
        assertEquals("b", record.get(1));
        assertEquals("c", record.get(2));
    }

    @Test
    public void testGetByIndexBoundaryFirstLast() {
        String[] values = {"x", "y", "z"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        assertEquals("x", record.get(0));
        assertEquals("z", record.get(values.length - 1));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetByIndexOutOfBounds() {
        String[] values = {"a", "b"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        record.get(5);
    }

    @Test(expected = IllegalStateException.class)
    public void testGetByNameNoMapping() {
        String[] values = {"a", "b"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        record.get("name");
    }

    @Test
    public void testGetByNameFound() {
        String[] values = {"a", "b", "c"};
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("first", 0);
        mapping.put("second", 1);
        mapping.put("third", 2);
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        assertEquals("a", record.get("first"));
        assertEquals("b", record.get("second"));
        assertEquals("c", record.get("third"));
    }

    @Test
    public void testGetByNameNotFoundReturnsNull() {
        String[] values = {"a", "b"};
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("first", 0);
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        assertNull(record.get("nonexistent"));
    }

    @Test
    public void testIsConsistentNullMapping() {
        String[] values = {"a", "b"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        assertTrue(record.isConsistent());
    }

    @Test
    public void testIsConsistentTrue() {
        String[] values = {"a", "b"};
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("first", 0);
        mapping.put("second", 1);
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        assertTrue(record.isConsistent());
    }

    @Test
    public void testIsConsistentFalse() {
        String[] values = {"a", "b"};
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("first", 0);
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        assertFalse(record.isConsistent());
    }

    @Test
    public void testIsMappedNullMapping() {
        String[] values = {"a", "b"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        assertFalse(record.isMapped("first"));
    }

    @Test
    public void testIsMappedTrue() {
        String[] values = {"a", "b"};
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("first", 0);
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        assertTrue(record.isMapped("first"));
    }

    @Test
    public void testIsMappedFalse() {
        String[] values = {"a", "b"};
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("first", 0);
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        assertFalse(record.isMapped("nonexistent"));
    }

    @Test
    public void testIsSetTrue() {
        String[] values = {"a", "b"};
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("first", 0);
        mapping.put("second", 1);
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        assertTrue(record.isSet("first"));
        assertTrue(record.isSet("second"));
    }

    @Test
    public void testIsSetFalseNotMapped() {
        String[] values = {"a", "b"};
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("first", 0);
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        assertFalse(record.isSet("nonexistent"));
    }

    @Test
    public void testIsSetFalseIndexOutOfRange() {
        String[] values = {"a"};
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("first", 0);
        mapping.put("second", 5);
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        assertFalse(record.isSet("second"));
    }

    @Test
    public void testIteratorMultipleElements() {
        String[] values = {"a", "b", "c"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        Iterator<String> it = record.iterator();
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
        assertTrue(it.hasNext());
        assertEquals("b", it.next());
        assertTrue(