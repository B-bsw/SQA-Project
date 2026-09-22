package org.apache.commons.collections.map;

import org.junit.Before;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.*;

public class CaseInsensitiveMapTest {

    private CaseInsensitiveMap map;

    @Before
    public void setUp() {
        map = new CaseInsensitiveMap();
    }

    @Test
    public void testDefaultConstructor() {
        assertNotNull(new CaseInsensitiveMap());
        assertEquals(0, new CaseInsensitiveMap().size());
    }

    @Test
    public void testConstructorWithInitialCapacity() {
        CaseInsensitiveMap map = new CaseInsensitiveMap(10);
        assertEquals(0, map.size());
        try {
            new CaseInsensitiveMap(0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testConstructorWithCapacityAndLoadFactor() {
        CaseInsensitiveMap map = new CaseInsensitiveMap(10, 0.75f);
        assertEquals(0, map.size());
        try {
            new CaseInsensitiveMap(-1, 0.75f);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
        try {
            new CaseInsensitiveMap(10, 0.0f);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testConstructorWithMap() {
        Map<String, String> input = new HashMap<>();
        input.put("Key1", "value1");
        input.put("KEY2", "value2");
        input.put(null, "value3");
        map = new CaseInsensitiveMap(input);
        assertEquals(2, map.size());
        assertEquals("value1", map.get("key1"));
        assertEquals("value2", map.get("key2"));
        assertEquals("value3", map.get(null));
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorWithNullMap() {
        new CaseInsensitiveMap(null);
    }

    @Test
    public void testPutAndGetCaseInsensitive() {
        map.put("Key", "value");
        assertEquals("value", map.get("KEY"));
        assertEquals("value", map.get("key"));
        assertEquals("value", map.get("kEy"));
    }

    @Test
    public void testPutNullKey() {
        map.put(null, "nullValue");
        assertEquals(1, map.size());
        assertEquals("nullValue", map.get(null));
        map.put("null", "stringNull");
        assertEquals(2, map.size());
        assertNotEquals("nullValue", map.get("NULL"));
    }

    @Test
    public void testPutDuplicateCaseInsensitive() {
        map.put("Key", "first");
        map.put("KEY", "second");
        assertEquals(1, map.size());
        assertEquals("second", map.get("key"));
    }

    @Test
    public void testGetNonExistentKey() {
        map.put("a", "1");
        assertNull(map.get("b"));
        assertNull(map.get(null));
    }

    @Test
    public void testConvertKeyNonNull() {
        String input = "TestString";
        Object result = map.convertKey(input);
        assertEquals("teststring", result);
    }

    @Test
    public void testConvertKeyNull() {
        Object result = map.convertKey(null);
        assertNotNull(result);
        // Since AbstractHashedMap.NULL is null? Actually tests spec: returns AbstractHashedMap.NULL
        assertNull(result);
    }

    @Test
    public void testPutAll() {
        Map<String, String> other = new HashMap<>();
        other.put("Key1", "1");
        other.put("Key2", "2");
        map.putAll(other);
        assertEquals(2, map.size());
        assertEquals("1", map.get("key1"));
    }

    @Test
    public void testRemove() {
        map.put("Key", "value");
        assertEquals("value", map.remove("KEY"));
        assertEquals(0, map.size());
        assertNull(map.remove("nonexistent"));
    }

    @Test
    public void testContainsKeyCaseInsensitive() {
        map.put("Key", "value");
        assertTrue(map.containsKey("KEY"));
        assertTrue(map.containsKey("key"));
        assertFalse(map.containsKey("no"));
        assertFalse(map.containsKey(null));
    }

    @Test
    public void testClone() {
        map.put("Key", "value");
        Object clone = map.clone();
        assertNotNull(clone);
        assertNotSame(map, clone);
        assertTrue(clone instanceof CaseInsensitiveMap);
        assertEquals("value", ((CaseInsensitiveMap) clone).get("KEY"));
    }

    @Test
    public void testKeySetReturnsLowerCaseKeys() {
        map.put("Key1", "1");
        map.put("Key2", "2");
        map.put(null, "3");
        assertTrue(map.keySet().contains("key1"));
        assertTrue(map.keySet().contains("key2"));
        assertTrue(map.keySet().contains(null));
        assertFalse(map.keySet().contains("Key1"));
    }

    @Test
    public void testEntrySet() {
        map.put("Key", "value");
        assertEquals(1, map.entrySet().size());
        Map.Entry entry = map.entrySet().iterator().next();
        assertEquals("key", entry.getKey());
        assertEquals("value", entry.getValue());
    }
}