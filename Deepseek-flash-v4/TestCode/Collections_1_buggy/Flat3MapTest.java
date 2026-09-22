package org.apache.commons.collections.map;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.Iterator;
import java.util.Collection;

public class Flat3MapTest {
    private Flat3Map map;

    @Before
    public void setUp() {
        map = new Flat3Map();
    }

    @After
    public void tearDown() {
        map = null;
    }

    @Test
    public void testPutGetNullKey() {
        Assert.assertNull(map.put(null, "nullValue"));
        Assert.assertEquals("nullValue", map.get(null));
        Assert.assertEquals(1, map.size());
    }

    @Test
    public void testPutGetMultipleKeys() {
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");
        Assert.assertEquals("1", map.get("a"));
        Assert.assertEquals("2", map.get("b"));
        Assert.assertEquals("3", map.get("c"));
        Assert.assertEquals(3, map.size());
    }

    @Test
    public void testPutOverwriteKey() {
        map.put("a", "1");
        Assert.assertEquals("1", map.put("a", "2"));
        Assert.assertEquals("2", map.get("a"));
        Assert.assertEquals(1, map.size());
    }

    @Test
    public void testPutFourthKeyTriggersConversion() {
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");
        map.put("d", "4");
        Assert.assertEquals(4, map.size());
        Assert.assertEquals("1", map.get("a"));
        Assert.assertEquals("2", map.get("b"));
        Assert.assertEquals("3", map.get("c"));
        Assert.assertEquals("4", map.get("d"));
    }

    @Test
    public void testPutAllEmptyMap() {
        map.putAll(new HashMap<Object, Object>());
        Assert.assertEquals(0, map.size());
        Assert.assertTrue(map.isEmpty());
    }

    @Test
    public void testPutAllFourEntries() {
        Map<Object, Object> input = new HashMap<Object, Object>();
        input.put("a", "1");
        input.put("b", "2");
        input.put("c", "3");
        input.put("d", "4");
        map.putAll(input);
        Assert.assertEquals(4, map.size());
        Assert.assertEquals("1", map.get("a"));
        Assert.assertEquals("4", map.get("d"));
    }

    @Test
    public void testGetMissingKey() {
        map.put("a", "1");
        Assert.assertNull(map.get("zz"));
        Assert.assertNull(map.get(null));
    }

    @Test
    public void testContainsKey() {
        map.put("a", "1");
        map.put(null, "nullValue");
        Assert.assertTrue(map.containsKey("a"));
        Assert.assertTrue(map.containsKey(null));
        Assert.assertFalse(map.containsKey("zz"));
    }

    @Test
    public void testContainsValue() {
        map.put("a", "1");
        map.put("b", null);
        Assert.assertTrue(map.containsValue("1"));
        Assert.assertTrue(map.containsValue(null));
        Assert.assertFalse(map.containsValue("99"));
    }

    @Test
    public void testRemove() {
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");
        Assert.assertEquals("1", map.remove("a"));
        Assert.assertEquals(2, map.size());
        Assert.assertNull(map.remove("zz"));
        Assert.assertNull(map.get("a"));
    }

    @Test
    public void testRemoveNullKey() {
        map.put(null, "1");
        Assert.assertEquals("1", map.remove(null));
        Assert.assertEquals(0, map.size());
        Assert.assertNull(map.remove(null));
    }

    @Test
    public void testRemoveAllThreeKeys() {
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");
        map.remove("a");
        map.remove("b");
        map.remove("c");
        Assert.assertEquals(0, map.size());
        Assert.assertTrue(map.isEmpty());
    }

    @Test
    public void testClear() {
        map.put("a", "1");
        map.put("b", "2");
        map.clear();
        Assert.assertEquals(0, map.size());
        Assert.assertTrue(map.isEmpty());
        Assert.assertNull(map.get("a"));
    }

    @Test
    public void testSize() {
        Assert.assertEquals(0, map.size());
        map.put("a", "1");
        Assert.assertEquals(1, map.size());
        map.put("b", "2");
        Assert.assertEquals(2, map.size());
    }

    @Test
    public void testIsEmpty() {
        Assert.assertTrue(map.isEmpty());
        map.put("a", "1");
        Assert.assertFalse(map.isEmpty());
        map.clear();
        Assert.assertTrue(map.isEmpty());
    }

    @Test
    public void testEquals() {
        map.put("a", "1");
        map.put("b", "2");
        
        Flat3Map other = new Flat3Map();
        other.put("a", "1");
        other.put("b", "2");
        
        Assert.assertEquals(map, other);
        Assert.assertEquals(map, map);
        Assert.assertFalse(map.equals(new Object()));
        
        other.put("c", "3");
        Assert.assertFalse(map.equals(other));
    }

    @Test
    public void testHashCode() {
        map.put("a", "1");
        map.put("b", "2");
        
        Map<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("a", "1");
        hashMap.put("b", "2");
        
        Assert.assertEquals(hashMap.hashCode(), map.hashCode());
    }

    @Test
    public void testToString() {
        Assert.assertEquals("{}", map.toString());
        
        map.put("a", "1");
        Assert.assertTrue(map.toString().contains("a"));
        Assert.assertTrue(map.toString().contains("1"));
    }

    @Test
    public void testClone() {
        map.put("a", "1");
        map.put("b", "2");
        
        Flat3Map cloned = (Flat3Map) map.clone();
        Assert.assertNotSame(map, cloned);
        Assert.assertEquals(map, cloned);
        
        cloned.put("c", "3");
        Assert.assertFalse(map.equals(cloned));
    }

    @Test
    public void testKeySet() {
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");
        
        Set<Object> keys = map.keySet();
        Assert.assertEquals(3, keys.size());
        Assert.assertTrue(keys.contains("a"));
        Assert.assertTrue(keys.contains("b"));
        Assert.assertTrue(keys.contains("c"));
        
        Assert.assertTrue(keys.remove("a"));
        Assert.assertFalse(map.containsKey("a"));
    }

    @Test
    public void testValues() {
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");
        
        Collection<Object> values = map.values();
        Assert.assertEquals(3, values.size());
        Assert.assertTrue(values.contains("1"));
        Assert.assertTrue(values.contains("2"));
        Assert.assertTrue(values.contains("3"));
    }

    @Test
    public void testEntrySet() {
        map.put("a", "1");
        map.put("b", "2");
        
        Set<Map.Entry<Object, Object>> entries = map.entrySet();
        Assert.assertEquals(2, entries.size());
        
        Iterator<Map.Entry<Object, Object>> iter = entries.iterator();
        Assert.assertTrue(iter.hasNext());
        Map.Entry<Object, Object> entry = iter.next();
        Assert.assertNotNull(entry.getKey());
        Assert.assertNotNull(entry.getValue());
    }

    @Test(expected = NoSuchElementException.class)
    public void testEntrySetIteratorNoSuchElement() {
        Iterator<Map.Entry<Object, Object>> iter = map.entrySet().iterator();
        iter.next();
    }

    @Test
    public void testMapIterator() {
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");
        
        MapIterator it = map.mapIterator();
        int count = 0;
        while (it.hasNext()) {
            Object key = it.next();
            Assert.assertNotNull(key);
            Assert.assertNotNull(it.getValue());
            count++;
        }
        Assert.assertEquals(3, count);
    }

    @Test
    public void testMapIteratorEmpty() {
        MapIterator it = map.mapIterator();
        Assert.assertFalse(it.hasNext());
    }

    @Test
    public void testMapIteratorRemove() {
        map.put("a", "1");
        
        MapIterator it = map.mapIterator();
        Assert.assertTrue(it.hasNext());
        it.next();
        it.remove();
        Assert.assertEquals(0, map.size());
    }

    @Test(expected = IllegalStateException.class)
    public void testMapIteratorRemoveWithoutNext() {
        MapIterator it = map.mapIterator();
        it.remove();
    }

    @Test
    public void testEmptyMapIterator() {
        map.put("a", "1");
        map.remove("a");
        Assert.assertNotNull(map.mapIterator());
        Assert.assertFalse(map.mapIterator().hasNext());
    }
}