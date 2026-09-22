package org.apache.commons.collections4.map;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class MultiValueMapTest {

    private MultiValueMap<String, String> map;

    @Before
    public void setUp() {
        map = new MultiValueMap<String, String>();
    }

    @Test
    public void testConstructorWithNullFactory() {
        try {
            new MultiValueMap<String, String>(new HashMap<String, Object>(), null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testPutNewKey() {
        Object result = map.put("key1", "value1");
        assertEquals("value1", result);
        assertEquals(1, map.totalSize());
        assertEquals(1, map.size("key1"));
        assertTrue(map.containsValue("value1"));
    }

    @Test
    public void testPutExistingKey() {
        map.put("key1", "value1");
        Object result = map.put("key1", "value2");
        assertEquals("value2", result);
        assertEquals(2, map.totalSize());
        assertEquals(2, map.size("key1"));
    }

    @Test
    public void testPutNullKey() {
        Object result = map.put(null, "value");
        assertEquals("value", result);
        assertTrue(map.containsKey(null));
    }

    @Test
    public void testPutAllSingleValueMap() {
        Map<String, String> input = new HashMap<String, String>();
        input.put("key1", "value1");
        input.put("key2", "value2");
        map.putAll(input);
        assertEquals(2, map.totalSize());
        assertEquals(1, map.size("key1"));
        assertEquals(1, map.size("key2"));
    }

    @Test
    public void testPutAllMultiMap() {
        MultiValueMap<String, String> multiMap = new MultiValueMap<String, String>();
        multiMap.put("key1", "value1");
        multiMap.put("key1", "value2");
        map.putAll(multiMap);
        assertEquals(2, map.totalSize());
        assertEquals(2, map.size("key1"));
    }

    @Test
    public void testRemoveMappingExisting() {
        map.put("key1", "value1");
        map.put("key1", "value2");
        assertTrue(map.removeMapping("key1", "value1"));
        assertEquals(1, map.size("key1"));
        assertTrue(map.containsValue("value2"));
    }

    @Test
    public void testRemoveMappingLastValue() {
        map.put("key1", "value1");
        assertTrue(map.removeMapping("key1", "value1"));
        assertFalse(map.containsKey("key1"));
        assertTrue(map.getCollection("key1") == null);
    }

    @Test
    public void testRemoveMappingNonExistentKey() {
        assertFalse(map.removeMapping("nonexistent", "value"));
    }

    @Test
    public void testRemoveMappingNonExistentValue() {
        map.put("key1", "value1");
        assertFalse(map.removeMapping("key1", "nonexistent"));
        assertEquals(1, map.size("key1"));
    }

    @Test
    public void testContainsValueExisting() {
        map.put("key1", "value1");
        assertTrue(map.containsValue("value1"));
    }

    @Test
    public void testContainsValueNonExistent() {
        map.put("key1", "value1");
        assertFalse(map.containsValue("nonexistent"));
    }

    @Test
    public void testGetCollectionExistingKey() {
        map.put("key1", "value1");
        map.put("key1", "value2");
        Collection<String> coll = map.getCollection("key1");
        assertNotNull(coll);
        assertEquals(2, coll.size());
        assertTrue(coll.contains("value1"));
        assertTrue(coll.contains("value2"));
    }

    @Test
    public void testGetCollectionNonExistentKey() {
        assertNull(map.getCollection("nonexistent"));
    }

    @Test
    public void testSizeExistingKey() {
        map.put("key1", "value1");
        map.put("key1", "value2");
        assertEquals(2, map.size("key1"));
    }

    @Test
    public void testSizeNonExistentKey() {
        assertEquals(0, map.size("nonexistent"));
    }

    @Test
    public void testTotalSizeEmpty() {
        assertEquals(0, map.totalSize());
    }

    @Test
    public void testTotalSizeMultiple() {
        map.put("key1", "value1");
        map.put("key1", "value2");
        map.put("key2", "value3");
        assertEquals(3, map.totalSize());
    }

    @Test
    public void testIteratorExistingKey() {
        map.put("key1", "value1");
        map.put("key1", "value2");
        Iterator<String> iter = map.iterator("key1");
        assertTrue(iter.hasNext());
        assertEquals("value1", iter.next());
        assertTrue(iter.hasNext());
        assertEquals("value2", iter.next());
        assertFalse(iter.hasNext());
    }

    @Test
    public void testIteratorNonExistentKey() {
        Iterator<String> iter = map.iterator("nonexistent");
        assertFalse(iter.hasNext());
    }

    @Test
    public void testIteratorRemove() {
        map.put("key1", "value1");
        map.put("key1", "value2");
        Iterator<String> iter = map.iterator("key1");
        assertTrue(iter.hasNext());
        iter.next();
        iter.remove();
        assertEquals(1, map.size("key1"));
    }

    @Test
    public void testIteratorRemoveLastValue() {
        map.put("key1", "value1");
        Iterator<String> iter = map.iterator("key1");
        assertTrue(iter.hasNext());
        iter.next();
        iter.remove();
        assertFalse(map.containsKey("key1"));
    }

    @Test
    public void testEntrySet() {
        map.put("key1", "value1");
        map.put("key1", "value2");
        Set<Map.Entry<String, Object>> entries = map.entrySet();
        assertEquals(1, entries.size());
        Map.Entry<String, Object> entry = entries.iterator().next();
        assertEquals("key1", entry.getKey());
        Collection<String> values = (Collection<String>) entry.getValue();
        assertEquals(2, values.size());
    }

    @Test
    public void testValues() {
        map.put("key1", "value1");
        map.put("key1", "value2");
        map.put("key2", "value3");
        Collection<Object> values = map.values();
        assertEquals(3, values.size());
        assertTrue(values.contains("value1"));
        assertTrue(values.contains("value2"));
        assertTrue(values.contains("value3"));
    }

    @Test
    public void testClear() {
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.clear();
        assertEquals(0, map.totalSize());
        assertTrue(map.isEmpty());
    }

    @Test
    public void testPutAllWithEmptyCollection() {
        map.putAll("key1", new ArrayList<String>());
        assertFalse(map.containsKey("key1"));
    }

    @Test
    public void testIteratorAllEntries() {
        map.put("key1", "value1");
        map.put("key1", "value2");
        map.put("key2", "value3");
        Iterator<Map.Entry<String, String>> entries = map.iterator();
        int count = 0;
        while (entries.hasNext()) {
            Map.Entry<String, String> entry = entries.next();
            assertNotNull(entry.getKey());
            assertNotNull(entry.getValue());
            count++;
        }
        assertEquals(3, count);
    }

    @Test
    public void testIteratorAllEntriesSetValue() {
        map.put("key1", "value1");
        map.put("key1", "value2");
        Iterator<Map.Entry<String, String>> entries = map.iterator();
        assertTrue(entries.hasNext());
        Map.Entry<String, String> entry = entries.next();
        String oldValue = entry.getValue();
        String newValue = entry.setValue("newValue");
        assertEquals(oldValue, newValue);
        assertTrue(map.containsValue("newValue"));
    }
}