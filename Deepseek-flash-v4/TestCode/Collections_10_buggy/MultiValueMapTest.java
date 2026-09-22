package org.apache.commons.collections.map;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.collections.Factory;
import org.apache.commons.collections.MultiMap;

public class MultiValueMapTest {
    private MultiValueMap multiMap;
    private Map<Object, Collection<Object>> map;

    @Before
    public void setUp() {
        map = new HashMap<Object, Collection<Object>>();
        multiMap = new MultiValueMap(map, new Factory() {
            public Object create() {
                return new ArrayList();
            }
        });
    }

    @Test
    public void testDecorate() {
        Map<Object, Collection<Object>> decoratedMap = new HashMap<Object, Collection<Object>>();
        MultiValueMap decorated = MultiValueMap.decorate(decoratedMap);
        assertNotNull(decorated);
        assertTrue(decorated instanceof MultiValueMap);
    }

    @Test
    public void testDecorateWithCollectionClass() {
        Map<Object, Collection<Object>> decoratedMap = new HashMap<Object, Collection<Object>>();
        MultiValueMap decorated = MultiValueMap.decorate(decoratedMap, ArrayList.class);
        assertNotNull(decorated);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDecorateWithNullFactory() {
        MultiValueMap.decorate(new HashMap(), (Factory) null);
    }

    @Test
    public void testDefaultConstructor() {
        MultiValueMap defaultMap = new MultiValueMap();
        assertNotNull(defaultMap);
        assertTrue(defaultMap.isEmpty());
    }

    @Test
    public void testPutNewKey() {
        Object result = multiMap.put("key1", "value1");
        assertEquals("value1", result);
        assertTrue(multiMap.containsKey("key1"));
        assertEquals(1, multiMap.size("key1"));
    }

    @Test
    public void testPutExistingKey() {
        multiMap.put("key1", "value1");
        Object result = multiMap.put("key1", "value2");
        assertEquals("value2", result);
        assertEquals(2, multiMap.size("key1"));
    }

    @Test
    public void testPutAllWhenMapIsMultiMap() {
        MultiValueMap sourceMap = new MultiValueMap();
        sourceMap.put("key1", "value1");
        sourceMap.put("key1", "value2");
        multiMap.put("key1", "existing");
        multiMap.putAll(sourceMap);
        assertEquals(3, multiMap.size("key1"));
    }

    @Test
    public void testPutAllWhenMapIsNotMultiMap() {
        Map<Object, Object> normalMap = new HashMap<Object, Object>();
        normalMap.put("key1", "value1");
        multiMap.putAll(normalMap);
        assertEquals(1, multiMap.size("key1"));
    }

    @Test
    public void testPutAllWithNullValues() {
        multiMap.put("key1", "existing");
        boolean result = multiMap.putAll("key1", null);
        assertFalse(result);
        assertEquals(1, multiMap.size("key1"));
    }

    @Test
    public void testPutAllWithEmptyCollection() {
        multiMap.put("key1", "existing");
        boolean result = multiMap.putAll("key1", new ArrayList());
        assertFalse(result);
        assertEquals(1, multiMap.size("key1"));
    }

    @Test
    public void testTotalSize_Empty() {
        assertEquals(0, multiMap.totalSize());
    }

    @Test
    public void testTotalSize_WithValues() {
        multiMap.put("key1", "value1");
        multiMap.put("key1", "value2");
        multiMap.put("key2", "value3");
        assertEquals(3, multiMap.totalSize());
    }

    @Test
    public void testRemoveMapping_ExistingValue() {
        multiMap.put("key1", "value1");
        multiMap.put("key1", "value2");
        Object result = multiMap.removeMapping("key1", "value1");
        assertEquals("value1", result);
        assertEquals(1, multiMap.size("key1"));
    }

    @Test
    public void testRemoveMapping_LastValue() {
        multiMap.put("key1", "value1");
        Object result = multiMap.removeMapping("key1", "value1");
        assertEquals("value1", result);
        assertNull(multiMap.getCollection("key1"));
        assertEquals(0, multiMap.size("key1"));
    }

    @Test
    public void testRemoveMapping_NonExistingKey() {
        Object result = multiMap.removeMapping("key1", "value1");
        assertNull(result);
    }

    @Test
    public void testRemoveMapping_NonExistingValue() {
        multiMap.put("key1", "value1");
        Object result = multiMap.removeMapping("key1", "nonexistent");
        assertNull(result);
        assertEquals(1, multiMap.size("key1"));
    }

    @Test
    public void testContainsValue_Existing() {
        multiMap.put("key1", "value1");
        multiMap.put("key2", "value2");
        assertTrue(multiMap.containsValue("key1", "value1"));
        assertTrue(multiMap.containsValue("key2", "value2"));
    }

    @Test
    public void testContainsValue_NonExisting() {
        multiMap.put("key1", "value1");
        assertFalse(multiMap.containsValue("key1", "nonexistent"));
        assertFalse(multiMap.containsValue("nonexistent", "value1"));
    }

    @Test
    public void testGetCollection_ExistingKey() {
        multiMap.put("key1", "value1");
        Collection coll = multiMap.getCollection("key1");
        assertNotNull(coll);
        assertEquals(1, coll.size());
        assertTrue(coll.contains("value1"));
    }

    @Test
    public void testGetCollection_NonExistingKey() {
        assertNull(multiMap.getCollection("nonexistent"));
    }

    @Test
    public void testSize_ExistingKey() {
        multiMap.put("key1", "value1");
        multiMap.put("key1", "value2");
        assertEquals(2, multiMap.size("key1"));
    }

    @Test
    public void testSize_NonExistingKey() {
        assertEquals(0, multiMap.size("nonexistent"));
    }

    @Test
    public void testValues_AllValues() {
        multiMap.put("key1", "value1");
        multiMap.put("key1", "value2");
        multiMap.put("key2", "value3");
        Collection values = multiMap.values();
        assertEquals(3, values.size());
        assertTrue(values.contains("value1"));
        assertTrue(values.contains("value2"));
        assertTrue(values.contains("value3"));
    }

    @Test
    public void testValues_SizeWithRemove() {
        multiMap.put("key1", "value1");
        multiMap.put("key1", "value2");
        multiMap.put("key2", "value3");
        multiMap.removeMapping("key1", "value1");
        Collection values = multiMap.values();
        assertEquals(2, values.size());
    }

    @Test
    public void testIterator_ExistingKey() {
        multiMap.put("key1", "value1");
        multiMap.put("key1", "value2");
        Iterator iter = multiMap.iterator("key1");
        assertTrue(iter.hasNext());
        assertEquals("value1", iter.next());
        assertTrue(iter.hasNext());
        assertEquals("value2", iter.next());
        assertFalse(iter.hasNext());
    }

    @Test
    public void testIterator_NonExistingKey() {
        Iterator iter = multiMap.iterator("nonexistent");
        assertNotNull(iter);
        assertFalse(iter.hasNext());
    }

    @Test
    public void testIterator_WithRemove() {
        multiMap.put("key1", "value1");
        multiMap.put("key1", "value2");
        Iterator iter = multiMap.iterator("key1");
        iter.next();
        iter.remove();
        assertEquals(1, multiMap.size("key1"));
    }

    @Test
    public void testClear() {
        multiMap.put("key1", "value1");
        multiMap.put("key2", "value2");
        multiMap.clear();
        assertTrue(multiMap.isEmpty());
        assertEquals(0, multiMap.totalSize());
    }

    @Test
    public void testContainsValueMethod() {
        multiMap.put("key1", "value1");
        assertTrue(multiMap.containsValue("value1"));
        assertFalse(multiMap.containsValue("nonexistent"));
    }

    @Test
    public void testContainsEmptyKey() {
        multiMap.put("key1", null);
        assertTrue(multiMap.containsKey("key1"));
        assertEquals(1, multiMap.size("key1"));
    }

    @Test
    public void testValues_EmptyMap() {
        assertEquals(0, multiMap.values().size());
    }

    @Test
    public void testRemoveMapping_ThenAddAgain() {
        multiMap.put("key1", "value1");
        multiMap.removeMapping("key1", "value1");
        assertNull(multiMap.getCollection("key1"));
        multiMap.put("key1", "newValue");
        assertEquals(1, multiMap.size("key1"));
        assertTrue(multiMap.containsValue("key1", "newValue"));
    }
}