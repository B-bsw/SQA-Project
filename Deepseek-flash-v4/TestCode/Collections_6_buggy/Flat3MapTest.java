package org.apache.commons.collections.map;

import static org.junit.Assert.*;
import java.util.Map;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Flat3MapTest {
    private Flat3Map map;

    @Before
    public void setUp() {
        map = new Flat3Map();
    }

    @After
    public void tearDown() {
        map.clear();
        map = null;
    }

    @Test
    public void testInitialState() {
        assertTrue(map.isEmpty());
        assertEquals(0, map.size());
        assertNull(map.get("any"));
        assertNull(map.get(null));
        assertFalse(map.containsKey("x"));
        assertFalse(map.containsValue("y"));
    }

    @Test
    public void testPutAndGetSingleEntry() {
        assertNull(map.put("key1", "value1"));
        assertEquals(1, map.size());
        assertEquals("value1", map.get("key1"));
        assertFalse(map.isEmpty());
    }

    @Test
    public void testPutAndGetNullKey() {
        assertNull(map.put(null, "nullValue"));
        assertEquals(1, map.size());
        assertEquals("nullValue", map.get(null));
        assertTrue(map.containsKey(null));
    }

    @Test
    public void testPutAndGetNullValue() {
        assertNull(map.put("key", null));
        assertEquals(1, map.size());
        assertNull(map.get("key"));
        assertTrue(map.containsValue(null));
        assertTrue(map.containsKey("key"));
    }

    @Test
    public void testPutOverwrite() {
        map.put("key", "first");
        assertEquals("first", map.put("key", "second"));
        assertEquals(1, map.size());
        assertEquals("second", map.get("key"));
    }

    @Test
    public void testPutUpToThreeEntries() {
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        assertEquals(3, map.size());
        assertEquals("one", map.get(1));
        assertEquals("two", map.get(2));
        assertEquals("three", map.get(3));
    }

    @Test
    public void testPutFourthEntryTriggersConversion() {
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        assertEquals(4, map.size());
        assertEquals("one", map.get(1));
        assertEquals("four", map.get(4));
        assertNotNull(map.entrySet());
    }

    @Test
    public void testPutAllEmptyMap() {
        map.putAll(new Flat3Map());
        assertTrue(map.isEmpty());
        assertEquals(0, map.size());
    }

    @Test
    public void testPutAllSingleEntry() {
        Flat3Map other = new Flat3Map();
        other.put("a", "1");
        map.putAll(other);
        assertEquals(1, map.size());
        assertEquals("1", map.get("a"));
    }

    @Test
    public void testPutAllFourEntries() {
        Flat3Map other = new Flat3Map();
        other.put(1, "one");
        other.put(2, "two");
        other.put(3, "three");
        other.put(4, "four");
        map.putAll(other);
        assertEquals(4, map.size());
        assertEquals("four", map.get(4));
    }

    @Test
    public void testRemoveFirstEntry() {
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");
        assertEquals("1", map.remove("a"));
        assertEquals(2, map.size());
        assertNull(map.get("a"));
        assertEquals("2", map.get("b"));
        assertEquals("3", map.get("c"));
    }

    @Test
    public void testRemoveSecondEntry() {
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");
        assertEquals("2", map.remove("b"));
        assertEquals(2, map.size());
        assertNull(map.get("b"));
        assertEquals("1", map.get("a"));
        assertEquals("3", map.get("c"));
    }

    @Test
    public void testRemoveThirdEntry() {
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");
        assertEquals("3", map.remove("c"));
        assertEquals(2, map.size());
        assertNull(map.get("c"));
        assertEquals("1", map.get("a"));
        assertEquals("2", map.get("b"));
    }

    @Test
    public void testRemoveOnlyEntry() {
        map.put("a", "1");
        assertEquals("1", map.remove("a"));
        assertEquals(0, map.size());
        assertTrue(map.isEmpty());
    }

    @Test
    public void testRemoveNonExistentKey() {
        map.put("a", "1");
        assertNull(map.remove("nonexistent"));
        assertEquals(1, map.size());
    }

    @Test
    public void testRemoveNullKey() {
        map.put(null, "nullValue");
        assertEquals("nullValue", map.remove(null));
        assertEquals(0, map.size());
    }

    @Test
    public void testClear() {
        map.put("a", "1");
        map.put("b", "2");
        map.clear();
        assertTrue(map.isEmpty());
        assertEquals(0, map.size());
        assertNull(map.get("a"));
    }

    @Test
    public void testContainsKeyAndValue() {
        map.put("key", "value");
        map.put(null, "nullKey");
        map.put("nullValue", null);
        assertTrue(map.containsKey("key"));
        assertTrue(map.containsKey(null));
        assertTrue(map.containsKey("nullValue"));
        assertTrue(map.containsValue("value"));
        assertTrue(map.containsValue(null));
        assertTrue(map.containsValue("nullKey"));
        assertFalse(map.containsKey("missing"));
        assertFalse(map.containsValue("missing"));
    }

    @Test
    public void testClone() {
        map.put("a", "1");
        map.put("b", "2");
        Flat3Map cloned = (Flat3Map) map.clone();
        assertNotSame(map, cloned);
        assertEquals(map, cloned);
        assertEquals("1", cloned.get("a"));
        assertNotNull(cloned.toString());
    }

    @Test
    public void testCloneWithDelegateMap() {
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");
        map.put("d", "4");
        Flat3Map cloned = (Flat3Map) map.clone();
        assertEquals(map, cloned);
        assertEquals(4, cloned.size());
        assertNotSame(map.entrySet(), cloned.entrySet());
    }

    @Test
    public void testEqualsAndHashCode() {
        Flat3Map other = new Flat3Map();
        map.put("a", "1");
        map.put("b", "2");
        other.put("a", "1");
        other.put("b", "2");
        assertEquals(map, other);
        assertEquals(map.hashCode(), other.hashCode());
        assertFalse(map.equals(null));
        assertFalse(map.equals(new Object()));
    }

    @Test
    public void testEqualsNullValues() {
        Flat3Map other = new Flat3Map();
        map.put("a", null);
        map.put(null, "null");
        other.put("a", null);
        other.put(null, "null");
        assertEquals(map, other);
    }

    @Test
    public void testEqualsDifferentSize() {
        Flat3Map other = new Flat3Map();
        other.put("a", "1");
        map.put("a", "1");
        map.put("b", "2");
        assertFalse(map.equals(other));
    }

    @Test
    public void testEntrySet() {
        map.put("a", "1");
        map.put("b", "2");
        assertEquals(2, map.entrySet().size());
        assertFalse(map.entrySet().isEmpty());
        assertTrue(map.entrySet().contains(new java.util.AbstractMap.SimpleEntry<>("a", "1")));
    }

    @Test
    public void testEntrySetRemove() {
        map.put("a", "1");
        map.put("b", "2");
        java.util.Iterator it = map.entrySet().iterator();
        it.next();
        it.remove();
        assertEquals(1, map.size());
    }

    @Test
    public void testKeySetAndValues() {
        map.put("a", "1");
        map.put("b", "2");
        assertTrue(map.keySet().contains("a"));
        assertTrue(map.keySet().contains("b"));
        assertTrue(map.values().contains("1"));
        assertTrue(map.values().contains("2"));
        assertEquals(2, map.keySet().size());
        assertEquals(2, map.values().size());
    }

    @Test
    public void testMapIteratorBasicIteration() {
        map.put("a", "1");
        map.put("b", "2");
        org.apache.commons.collections.MapIterator it = map.mapIterator();
        assertTrue(it.hasNext());
        Object key = it.next();
        assertNotNull(key);
        assertTrue(it.hasNext());
        it.next();
        assertFalse(it.hasNext());
    }

    @Test
    public void testMapIteratorRemove() {
        map.put("a", "1");
        org.apache.commons.collections.MapIterator it = map.mapIterator();
        it.next();
        it.remove();
        assertEquals(0, map.size());
    }

    @Test
    public void testMapIteratorEntrySetEmpty() {
        org.apache.commons.collections.MapIterator it = map.mapIterator();
        assertFalse(it.hasNext());
    }

    @Test(expected = java.util.NoSuchElementException.class)
    public void testMapIteratorNextEmpty() {
        map.mapIterator().next();
    }

    @Test
    public void testToString() {
        assertEquals("{}", map.toString());
        map.put("a", "1");
        String str = map.toString();
        assertTrue(str.contains("a=1"));
        map.put("b", "2");
        assertTrue(map.toString().contains("b=2"));
    }

    @Test
    public void testEntrySetIteratorMethods() {
        map.put("a", "1");
        java.util.Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        assertEquals("1", entry.getValue());
        entry.setValue("updated");
        assertEquals("updated", map.get("a"));
    }

    @Test
    public void testEntrySetEqualsAndHashCode() {
        map.put("a", "1");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map.Entry same = new java.util.AbstractMap.SimpleEntry<>("a", "1");
        assertEquals(entry, same);
        assertEquals(entry.hashCode(), same.hashCode());
    }

    @Test
    public void testEntrySetToStirng() {
        map.put("a", "1");
        String str = map.entrySet().iterator().next().toString();
        assertTrue(str.contains("a=1"));
    }
}