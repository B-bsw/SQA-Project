package org.apache.commons.csv;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.junit.Test;

public class CSVRecordTest {

    private CSVRecord createRecord(final String[] values, final Map<String, Integer> mapping,
            final String comment, final long recordNumber) {
        try {
            final java.lang.reflect.Constructor<CSVRecord> constructor = CSVRecord.class
                    .getDeclaredConstructor(String[].class, Map.class, String.class, long.class);
            constructor.setAccessible(true);
            return constructor.newInstance(values, mapping, comment, recordNumber);
        } catch (final Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testGetByIndexNormalAndBoundary() {
        final CSVRecord record = createRecord(new String[] { "a", "b", "c" }, null, null, 1L);
        assertEquals("a", record.get(0));
        assertEquals("c", record.get(2));
        try {
            record.get(3);
            fail("Expected ArrayIndexOutOfBoundsException");
        } catch (final ArrayIndexOutOfBoundsException e) {
            // expected
        }
        try {
            record.get(-1);
            fail("Expected ArrayIndexOutOfBoundsException");
        } catch (final ArrayIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testGetByEnum() {
        final CSVRecord record = createRecord(new String[] { "x", "y" }, null, null, 1L);
        assertEquals("x", record.get(TestEnum.FIRST));
        assertEquals("y", record.get(TestEnum.SECOND));
    }

    @Test
    public void testGetByNameWithMapping() {
        final Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("A", Integer.valueOf(0));
        mapping.put("B", Integer.valueOf(1));
        final CSVRecord record = createRecord(new String[] { "v1", "v2" }, mapping, null, 1L);
        assertEquals("v1", record.get("A"));
        assertEquals("v2", record.get("B"));
    }

    @Test
    public void testGetByNameNoMapping() {
        final CSVRecord record = createRecord(new String[] { "a" }, null, null, 1L);
        try {
            record.get("A");
            fail("Expected IllegalStateException");
        } catch (final IllegalStateException e) {
            // expected
        }
    }

    @Test
    public void testGetByNameUnknownName() {
        final Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("A", Integer.valueOf(0));
        final CSVRecord record = createRecord(new String[] { "a" }, mapping, null, 1L);
        try {
            record.get("B");
            fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testGetByNameIndexOutOfBounds() {
        final Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("A", Integer.valueOf(5));
        final CSVRecord record = createRecord(new String[] { "a" }, mapping, null, 1L);
        try {
            record.get("A");
            fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testGetCommentNullAndNonNull() {
        final CSVRecord nullComment = createRecord(new String[] { "a" }, null, null, 1L);
        assertNull(nullComment.getComment());
        final CSVRecord comment = createRecord(new String[] { "a" }, null, "comment", 1L);
        assertEquals("comment", comment.getComment());
    }

    @Test
    public void testGetRecordNumber() {
        final CSVRecord record = createRecord(new String[] { "a" }, null, null, 42L);
        assertEquals(42L, record.getRecordNumber());
    }

    @Test
    public void testIsConsistent() {
        final Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("A", Integer.valueOf(0));
        final CSVRecord nullMapping = createRecord(new String[] { "a" }, null, null, 1L);
        assertTrue(nullMapping.isConsistent());
        final CSVRecord consistent = createRecord(new String[] { "a" }, mapping, null, 1L);
        assertTrue(consistent.isConsistent());
        final Map<String, Integer> largeMapping = new HashMap<String, Integer>();
        largeMapping.put("A", Integer.valueOf(0));
        largeMapping.put("B", Integer.valueOf(1));
        final CSVRecord inconsistent = createRecord(new String[] { "a" }, largeMapping, null, 1L);
        assertFalse(inconsistent.isConsistent());
    }

    @Test
    public void testIsMapped() {
        final Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("A", Integer.valueOf(0));
        final CSVRecord recordWithMapping = createRecord(new String[] { "a" }, mapping, null, 1L);
        assertTrue(recordWithMapping.isMapped("A"));
        assertFalse(recordWithMapping.isMapped("B"));
        final CSVRecord noMapping = createRecord(new String[] { "a" }, null, null, 1L);
        assertFalse(noMapping.isMapped("A"));
    }

    @Test
    public void testIsSet() {
        final Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("A", Integer.valueOf(0));
        mapping.put("B", Integer.valueOf(1));
        mapping.put("C", Integer.valueOf(5));
        final CSVRecord record = createRecord(new String[] { "a", "b" }, mapping, null, 1L);
        assertTrue(record.isSet("A"));
        assertTrue(record.isSet("B"));
        assertFalse(record.isSet("C"));
        assertFalse(record.isSet("D"));
        final CSVRecord noMapping = createRecord(new String[] { "a" }, null, null, 1L);
        assertFalse(noMapping.isSet("A"));
    }

    @Test
    public void testIteratorNormalAndEmpty() {
        final CSVRecord record = createRecord(new String[] { "a", "b" }, null, null, 1L);
        final Iterator<String> it = record.iterator();
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
        assertEquals("b", it.next());
        assertFalse(it.hasNext());

        final CSVRecord empty = createRecord(new String[] {}, null, null, 1L);
        assertFalse(empty.iterator().hasNext());
    }

    @Test
    public void testPutIn() {
        final Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("A", Integer.valueOf(0));
        mapping.put("B", Integer.valueOf(1));
        mapping.put("C", Integer.valueOf(5));
        final CSVRecord record = createRecord(new String[] { "a", "b" }, mapping, null, 1L);
        final Map<String, String> map = new HashMap<String, String>();
        final Map<String, String> result = record.putIn(map);
        assertEquals(2, result.size());
        assertEquals("a", result.get("A"));
        assertEquals("b", result.get("B"));
        assertNull(result.get("C"));
    }

    @Test
    public void testSize() {
        final CSVRecord record = createRecord(new String[] { "a", "b", "c" }, null, null, 1L);
        assertEquals(3, record.size());
        final CSVRecord empty = createRecord(new String[] {}, null, null, 1L);
        assertEquals(0, empty.size());
    }

    @Test
    public void testToMap() {
        final Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("A", Integer.valueOf(0));
        final CSVRecord record = createRecord(new String[] { "a" }, mapping, null, 1L);
        final Map<String, String> map = record.toMap();
        assertNotNull(map);
        assertEquals(1, map.size());
        assertEquals("a", map.get("A"));
    }

    @Test
    public void testToString() {
        final CSVRecord record = createRecord(new String[] { "a", "b" }, null, null, 1L);
        assertEquals("[a, b]", record.toString());
    }

    @Test
    public void testValues() {
        final String[] values = new String[] { "a", "b" };
        final CSVRecord record = createRecord(values, null, null, 1L);
        assertEquals(2, record.values().length);
        assertEquals("a", record.values()[0]);
    }

    private enum TestEnum {
        FIRST, SECOND;
    }
}