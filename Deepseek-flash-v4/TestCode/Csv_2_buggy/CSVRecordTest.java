package org.apache.commons.csv;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class CSVRecordTest {

    private CSVRecord recordWithMapping;
    private CSVRecord recordWithoutMapping;
    private Map<String, Integer> mapping;
    private String[] values;

    @Before
    public void setUp() {
        values = new String[] {"John", "Doe", "30"};
        mapping = new HashMap<String, Integer>();
        mapping.put("first", 0);
        mapping.put("last", 1);
        mapping.put("age", 2);
        recordWithMapping = new CSVRecord(values, mapping, "comment", 1L);
        recordWithoutMapping = new CSVRecord(values, null, null, 2L);
    }

    @After
    public void tearDown() {
        recordWithMapping = null;
        recordWithoutMapping = null;
        mapping = null;
        values = null;
    }

    @Test
    public void testGetByIndex() {
        assertEquals("John", recordWithMapping.get(0));
        assertEquals("Doe", recordWithMapping.get(1));
        assertEquals("30", recordWithMapping.get(2));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetByIndexOutOfBounds() {
        recordWithMapping.get(3);
    }

    @Test
    public void testGetByName() {
        assertEquals("John", recordWithMapping.get("first"));
        assertEquals("Doe", recordWithMapping.get("last"));
        assertEquals("30", recordWithMapping.get("age"));
    }

    @Test
    public void testGetByNameNotMapped() {
        assertNull(recordWithMapping.get("nonexistent"));
    }

    @Test(expected = IllegalStateException.class)
    public void testGetByNameNoMapping() {
        recordWithoutMapping.get("first");
    }

    @Test
    public void testIsConsistent() {
        assertTrue(recordWithMapping.isConsistent());
        assertTrue(recordWithoutMapping.isConsistent());

        Map<String, Integer> shortMapping = new HashMap<String, Integer>();
        shortMapping.put("only", 0);
        CSVRecord inconsistent = new CSVRecord(values, shortMapping, null, 3L);
        assertFalse(inconsistent.isConsistent());
    }

    @Test
    public void testIsMapped() {
        assertTrue(recordWithMapping.isMapped("first"));
        assertFalse(recordWithMapping.isMapped("nonexistent"));
        assertFalse(recordWithoutMapping.isMapped("first"));
    }

    @Test
    public void testIsSet() {
        assertTrue(recordWithMapping.isSet("first"));
        assertFalse(recordWithMapping.isSet("nonexistent"));

        Map<String, Integer> outOfBoundsMap = new HashMap<String, Integer>();
        outOfBoundsMap.put("out", 10);
        CSVRecord outOfBounds = new CSVRecord(values, outOfBoundsMap, null, 4L);
        assertFalse(outOfBounds.isSet("out"));

        assertFalse(recordWithoutMapping.isSet("first"));
    }

    @Test
    public void testIterator() {
        Iterator<String> it = recordWithMapping.iterator();
        assertTrue(it.hasNext());
        assertEquals("John", it.next());
        assertEquals("Doe", it.next());
        assertEquals("30", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testValuesMethod() {
        assertSame(values, recordWithMapping.values());
    }

    @Test
    public void testGetComment() {
        assertEquals("comment", recordWithMapping.getComment());
        assertNull(recordWithoutMapping.getComment());
    }

    @Test
    public void testGetRecordNumber() {
        assertEquals(1L, recordWithMapping.getRecordNumber());
        assertEquals(2L, recordWithoutMapping.getRecordNumber());
    }

    @Test
    public void testSize() {
        assertEquals(3, recordWithMapping.size());
        assertEquals(0, new CSVRecord(new String[0], null, null, 0L).size());
    }

    @Test
    public void testToString() {
        assertEquals("[John, Doe, 30]", recordWithMapping.toString());
    }

    @Test
    public void testNullValuesArray() {
        CSVRecord nullValues = new CSVRecord(null, null, null, 5L);
        assertEquals(0, nullValues.size());
        assertTrue(nullValues.isConsistent());
        assertFalse(nullValues.isMapped("anything"));
    }

    @Test
    public void testEdgeCases() {
        Map<String, Integer> oneItemMap = new HashMap<String, Integer>();
        oneItemMap.put("single", 0);
        CSVRecord oneItem = new CSVRecord(new String[] {"value"}, oneItemMap, null, 6L);
        
        assertTrue(oneItem.isConsistent());
        assertTrue(oneItem.isMapped("single"));
        assertTrue(oneItem.isSet("single"));
        assertEquals("value", oneItem.get("single"));
        assertEquals(1, oneItem.size());
        
        CSVRecord emptyRecord = new CSVRecord(new String[0], new HashMap<String, Integer>(), "", 7L);
        assertTrue(emptyRecord.isConsistent());
        assertEquals("", emptyRecord.getComment());
    }
}