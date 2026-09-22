package org.apache.commons.collections4.map;

import org.junit.Before;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import static org.junit.Assert.*;

public class ListOrderedMapTest {
    private ListOrderedMap<String, Integer> map;

    @Before
    public void setUp() {
        map = new ListOrderedMap<String, Integer>();
    }

    @Test
    public void testPutNewKey() {
        assertNull(map.put("one", 1));
        assertEquals(1, map.size());
        assertEquals(Integer.valueOf(1), map.get("one"));
        assertEquals("one", map.get(0));
    }

    @Test
    public void testPutExistingKeyUpdatesValue() {
        map.put("one", 1);
        Integer old = map.put("one", 100);
        assertEquals(Integer.valueOf(1), old);
        assertEquals(Integer.valueOf(100), map.get("one"));
        assertEquals(1, map.size());
    }

    @Test
    public void testPutOrderPreserved() {
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        assertEquals("a", map.get(0));
        assertEquals("b", map.get(1));
        assertEquals("c", map.get(2));
    }

    @Test
    public void testFirstKey() {
        assertNull(map.put("first", 1));
        assertNull(map.put("second", 2));
        assertEquals("first", map.firstKey());
    }

    @Test(expected = NoSuchElementException.class)
    public void testFirstKeyEmpty() {
        map.firstKey();
    }

    @Test
    public void testLastKey() {
        map.put("first", 1);
        map.put("second", 2);
        map.put("third", 3);
        assertEquals("third", map.lastKey());
    }

    @Test
    public void testLastKeySingleElement() {
        map.put("only", 1);
        assertEquals("only", map.lastKey());
    }

    @Test
    public void testNextKey() {
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        assertEquals("b", map.nextKey("a"));
        assertNull(map.nextKey("c"));
        assertNull(map.nextKey("nonexistent"));
    }

    @Test
    public void testPreviousKey() {
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        assertEquals("b", map.previousKey("c"));
        assertNull(map.previousKey("a"));
        assertNull(map.previousKey("nonexistent"));
    }

    @Test
    public void testRemoveByKey() {
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        assertEquals(Integer.valueOf(2), map.remove("b"));
        assertEquals(2, map.size());
        assertNull(map.get("b"));
        assertEquals("a", map.get(0));
        assertEquals("c", map.get(1));
    }

    @Test
    public void testRemoveNonexistentKey() {
        map.put("a", 1);
        assertNull(map.remove("nonexistent"));
        assertEquals(1, map.size());
    }

    @Test
    public void testPutAll() {
        Map<String, Integer> other = new HashMap<String, Integer>();
        other.put("x", 10);
        other.put("y", 20);
        map.putAll(other);
        assertEquals(2, map.size());
        assertEquals(Integer.valueOf(10), map.get("x"));
        assertEquals("x", map.get(0));
        assertEquals("y", map.get(1));
    }

    @Test
    public void testClear() {
        map.put("a", 1);
        map.put("b", 2);
        map.clear();
        assertTrue(map.isEmpty());
        assertEquals(0, map.size());
    }

    @Test
    public void testKeySet() {
        map.put("a", 1);
        map.put("b", 2);
        Set<String> keys = map.keySet();
        assertEquals(2, keys.size());
        assertTrue(keys.contains("a"));
        assertTrue(keys.contains("b"));
    }

    @Test
    public void testKeyList() {
        map.put("a", 1);
        map.put("b", 2);
        assertEquals("a", map.keyList().get(0));
        assertEquals("b", map.keyList().get(1));
        assertEquals(2, map.keyList().size());
    }

    @Test
    public void testValues() {
        map.put("a", 1);
        map.put("b", 2);
        assertTrue(map.values().contains(1));
        assertTrue(map.values().contains(2));
        assertEquals(2, map.values().size());
    }

    @Test
    public void testValueList() {
        map.put("a", 1);
        map.put("b", 2);
        assertEquals(Integer.valueOf(1), map.valueList().get(0));
        assertEquals(Integer.valueOf(2), map.valueList().get(1));
    }

    @Test
    public void testToString() {
        assertEquals("{}", map.toString());
        map.put("a", 1);
        assertEquals("{a=1}", map.toString());
        map.put("b", 2);
        assertEquals("{a=1, b=2}", map.toString());
    }

    @Test
    public void testGetByIndex() {
        map.put("a", 1);
        map.put("b", 2);
        assertEquals("a", map.get(0));
        assertEquals("b", map.get(1));
    }

    @Test
    public void testGetValueByIndex() {
        map.put("a", 1);
        map.put("b", 2);
        assertEquals(Integer.valueOf(1), map.getValue(0));
        assertEquals(Integer.valueOf(2), map.getValue(1));
    }

    @Test
    public void testIndexOf() {
        map.put("a", 1);
        map.put("b", 2);
        assertEquals(0, map.indexOf("a"));
        assertEquals(1, map.indexOf("b"));
        assertEquals(-1, map.indexOf("nonexistent"));
    }

    @Test
    public void testSetValueByIndex() {
        map.put("a", 1);
        map.put("b", 2);
        assertEquals(Integer.valueOf(1), map.setValue(0, 100));
        assertEquals(Integer.valueOf(100), map.get("a"));
        assertEquals(2, map.size());
    }

    @Test
    public void testPutByIndexNewKey() {
        map.put("a", 1);
        map.put("b", 2);
        assertNull(map.put(1, "c", 30));
        assertEquals(3, map.size());
        assertEquals("a", map.get(0));
        assertEquals("c", map.get(1));
        assertEquals("b", map.get(2));
    }

    @Test
    public void testPutByIndexExistingKey() {
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        Integer old = map.put(1, "b", 200);
        assertEquals(Integer.valueOf(2), old);
        assertEquals(3, map.size());
        assertEquals(Integer.valueOf(200), map.get("b"));
    }

    @Test
    public void testRemoveByIndex() {
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        assertEquals(Integer.valueOf(2), map.remove(1));
        assertEquals(2, map.size());
        assertEquals("a", map.get(0));
        assertEquals("c", map.get(1));
    }

    @Test
    public void testAsList() {
        map.put("a", 1);
        map.put("b", 2);
        assertEquals("a", map.asList().get(0));
        assertEquals("b", map.asList().get(1));
    }

    @Test
    public void testMapIterator() {
        map.put("a", 1);
        map.put("b", 2);
        OrderedMapIterator<String, Integer> it = map.mapIterator();
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
        assertEquals("b", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testEntrySet() {
        map.put("a", 1);
        map.put("b", 2);
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        assertEquals(2, entries.size());
    }

    @Test
    public void testListOrderedMapStaticFactory() {
        Map<String, Integer> source = new HashMap<String, Integer>();
        source.put("a", 1);
        ListOrderedMap<String, Integer> fromFactory = ListOrderedMap.listOrderedMap(source);
        assertEquals(1, fromFactory.size());
        assertEquals(Integer.valueOf(1), fromFactory.get("a"));
    }

    @Test
    public void testEmptyMapInitialState() {
        assertTrue(map.isEmpty());
        assertEquals(0, map.size());
        assertNull(map.firstKeySafe());
        assertNull(map.lastKeySafe());
    }
}