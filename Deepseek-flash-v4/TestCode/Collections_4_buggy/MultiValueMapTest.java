package org.apache.commons.collections.map;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import org.apache.commons.collections.Factory;
import org.apache.commons.collections.MultiMap;
import java.util.*;
import java.lang.reflect.*;

public class MultiValueMapTest {

    private MultiValueMap map;
    private Map baseMap;

    @Before
    public void setUp() {
        baseMap = new HashMap();
        map = new MultiValueMap(baseMap, new Factory() {
            @Override
            public Object create() {
                return new ArrayList();
            }
        });
    }

    @After
    public void tearDown() {
        map = null;
        baseMap = null;
    }

    @Test
    public void testDecorateWithMap() {
        Map decorated = MultiValueMap.decorate(new HashMap());
        assertNotNull(decorated);
        assertTrue(decorated instanceof MultiValueMap);
    }

    @Test
    public void testDecorateWithClass() {
        MultiValueMap decorated = (MultiValueMap) MultiValueMap.decorate(new HashMap(), ArrayList.class);
        assertNotNull(decorated);
        assertTrue(decorated.getCollection("key") == null);
    }

    @Test
    public void testDecorateWithFactory() {
        Factory factory = new Factory() {
            @Override
            public Object create() {
                return new ArrayList();
            }
        };
        MultiValueMap decorated = (MultiValueMap) MultiValueMap.decorate(new HashMap(), factory);
        assertNotNull(decorated);
    }

    @Test
    public void testPutNewKey() {
        Object result = map.put("key1", "value1");
        assertEquals("value1", result);
        assertTrue(map.containsKey("key1"));
        Collection coll = map.getCollection("key1");
        assertNotNull(coll);
        assertEquals(1, coll.size());
        assertTrue(coll.contains("value1"));
    }

    @Test
    public void testPutExistingKey() {
        map.put("key1", "value1");
        Object result = map.put("key1", "value2");
        assertEquals("value2", result);
        Collection coll = map.getCollection("key1");
        assertEquals(2, coll.size());
        assertTrue(coll.contains("value1"));
        assertTrue(coll.contains("value2"));
    }

    @Test
    public void testPutDuplicateValue() {
        map.put("key1", "value1");
        Object result = map.put("key1", "value1");
        assertNull(result);
        Collection coll = map.getCollection("key1");
        assertEquals(1, coll.size());
    }

    @Test
    public void testPutNullValue() {
        map.put("key1", null);
        assertTrue(map.containsKey("key1"));
        assertNull(map.getCollection("key1").get(0));
    }

    @Test
    public void testPutAllWithNormalMap() {
        Map normalMap = new HashMap();
        normalMap.put("a", "1");
        normalMap.put("b", "2");
        map.putAll(normalMap);
        assertEquals(1, map.getCollection("a").size());
        assertEquals("1", map.getCollection("a").get(0));
        assertEquals("2", map.getCollection("b").get(0));
    }

    @Test
    public void testPutAllWithMultiMap() {
        MultiValueMap multiMap = new MultiValueMap();
        multiMap.put("key", "v1");
        multiMap.put("key", "v2");
        map.putAll(multiMap);
        assertEquals(2, map.getCollection("key").size());
    }

    @Test
    public void testPutAllWithNullValuesCollection() {
        map.putAll("key", null);
        assertFalse(map.containsKey("key"));
    }

    @Test
    public void testPutAllWithEmptyCollection() {
        map.putAll("key", new ArrayList());
        assertFalse(map.containsKey("key"));
    }

    @Test
    public void testRemoveMappingExistingValue() {
        map.put("key1", "value1");
        map.put("key1", "value2");
        Object removed = map.removeMapping("key1", "value1");
        assertEquals("value1", removed);
        Collection coll = map.getCollection("key1");
        assertEquals(1, coll.size());
        assertFalse(coll.contains("value1"));
    }

    @Test
    public void testRemoveMappingLastValue() {
        map.put("key1", "value1");
        Object removed = map.removeMapping("key1", "value1");
        assertEquals("value1", removed);
        assertFalse(map.containsKey("key1"));
        assertNull(map.getCollection("key1"));
    }

    @Test
    public void testRemoveMappingNonExistentValue() {
        map.put("key1", "value1");
        Object removed = map.removeMapping("key1", "nonexistent");
        assertNull(removed);
        assertTrue(map.containsKey("key1"));
    }

    @Test
    public void testRemoveMappingNonExistentKey() {
        Object removed = map.removeMapping("nonexistent", "value");
        assertNull(removed);
    }

    @Test
    public void testContainsValueFound() {
        map.put("key1", "value1");
        map.put("key2", "value2");
        assertTrue(map.containsValue("value1"));
        assertTrue(map.containsValue("value2"));
    }

    @Test
    public void testContainsValueNotFound() {
        map.put("key1", "value1");
        assertFalse(map.containsValue("notfound"));
    }

    @Test
    public void testContainsValueEmptyMap() {
        assertFalse(map.containsValue("value"));
    }

    @Test
    public void testContainsValueWithKeyAndValue() {
        map.put("key1", "value1");
        map.put("key1", "value2");
        assertTrue(map.containsValue("key1", "value1"));
        assertTrue(map.containsValue("key1", "value2"));
        assertFalse(map.containsValue("key1", "value3"));
    }

    @Test
    public void testGetCollectionExistingKey() {
        map.put("key1", "value1");
        Collection coll = map.getCollection("key1");
        assertNotNull(coll);
        assertEquals(1, coll.size());
    }

    @Test
    public void testGetCollectionNonExistentKey() {
        Collection coll = map.getCollection("nonexistent");
        assertNull(coll);
    }

    @Test
    public void testSizeWithKey() {
        assertEquals(0, map.size("key"));
        map.put("key", "v1");
        assertEquals(1, map.size("key"));
        map.put("key", "v2");
        assertEquals(2, map.size("key"));
    }

    @Test
    public void testSizeWithNonExistentKey() {
        assertEquals(0, map.size("nonexistent"));
    }

    @Test
    public void testIterator() {
        map.put("key", "v1");
        map.put("key", "v2");
        Iterator it = map.iterator("key");
        assertTrue(it.hasNext());
        assertEquals("v1", it.next());
        assertTrue(it.hasNext());
        assertEquals("v2", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testIteratorNonExistentKey() {
        Iterator it = map.iterator("nonexistent");
        assertFalse(it.hasNext());
    }

    @Test
    public void testIteratorRemove() {
        map.put("key", "v1");
        map.put("key", "v2");
        Iterator it = map.iterator("key");
        assertEquals("v1", it.next());
        it.remove();
        assertFalse(map.getCollection("key").contains("v1"));
        assertEquals(1, map.getCollection("key").size());
    }

    @Test
    public void testIteratorRemoveLastValue() {
        map.put("key", "v1");
        Iterator it = map.iterator("key");
        assertEquals("v1", it.next());
        it.remove();
        assertFalse(map.containsKey("key"));
    }

    @Test
    public void testTotalSize() {
        assertEquals(0, map.totalSize());
        map.put("k1", "v1");
        map.put("k1", "v2");
        map.put("k2", "v3");
        assertEquals(3, map.totalSize());
    }

    @Test
    public void testValues() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k2", "v3");
        Collection values = map.values();
        assertNotNull(values);
        assertEquals(3, values.size());
        assertTrue(values.contains("v1"));
        assertTrue(values.contains("v2"));
        assertTrue(values.contains("v3"));
    }

    @Test
    public void testValuesIteratorWithEmptyMap() {
        Collection values = map.values();
        assertEquals(0, values.size());
        assertFalse(values.iterator().hasNext());
    }

    @Test
    public void testClear() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.clear();
        assertTrue(map.isEmpty());
        assertEquals(0, map.totalSize());
    }

    @Test
    public void testCreateCollection() throws Exception {
        MultiValueMap testMap = new MultiValueMap(new HashMap(), new Factory() {
            @Override
            public Object create() {
                return new ArrayList();
            }
        });
        Collection coll = testMap.createCollection(10);
        assertNotNull(coll);
        assertTrue(coll instanceof ArrayList);
        assertEquals(0, coll.size());
    }

    @Test
    public void testCreateCollectionWithNullFactory() {
        try {
            new MultiValueMap(new HashMap(), null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }

    @Test
    public void testPutAllEmptyMultiValueMap() {
        MultiValueMap emptyMulti = MultiValueMap.decorate(new HashMap());
        map.putAll(emptyMulti);
        assertTrue(map.isEmpty());
    }

    @Test
    public void testPutAllWithEmptyMultiMapValues() {
        MultiValueMap multiMap = new MultiValueMap();
        multiMap.put("key", "value");
        multiMap.putAll("anotherKey", new ArrayList());
        map.putAll(multiMap);
        assertEquals(1, map.size());
        assertFalse(map.containsKey("anotherKey"));
    }

    @Test
    public void testValuesNotEmpty() {
        map.put("key1", "value1");
        map.put("key2", "value2");
        Collection values = map.values();
        assertNotNull(values);
        assertEquals(2, values.size());
        values.clear();
        assertEquals(0, map.totalSize());
    }

    @Test
    public void testContainsValueNullValue() {
        map.put("key", null);
        assertTrue(map.containsValue(null));
    }

    @Test
    public void testContainsValueKeyNullValue() {
        map.put("key", null);
        assertTrue(map.containsValue("key", null));
        assertFalse(map.containsValue("key", "other"));
    }
}