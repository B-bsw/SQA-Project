package org.apache.commons.collections.map;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class CaseInsensitiveMapTest {

    private CaseInsensitiveMap map;

    @Before
    public void setUp() {
        map = new CaseInsensitiveMap();
    }

    // ---------------------------------------------------------------
    // Constructor tests
    // ---------------------------------------------------------------

    @Test
    public void testDefaultConstructor() {
        CaseInsensitiveMap m = new CaseInsensitiveMap();
        assertNotNull(m);
        assertEquals(0, m.size());
        assertTrue(m.isEmpty());
    }

    @Test
    public void testConstructorWithInitialCapacity() {
        CaseInsensitiveMap m = new CaseInsensitiveMap(10);
        assertNotNull(m);
        assertEquals(0, m.size());
    }

    @Test
    public void testConstructorWithInitialCapacityBoundaryZeroThrows() {
        try {
            new CaseInsensitiveMap(0);
            fail("Expected IllegalArgumentException for capacity 0");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testConstructorWithNegativeCapacityThrows() {
        try {
            new CaseInsensitiveMap(-1);
            fail("Expected IllegalArgumentException for negative capacity");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testConstructorWithCapacityAndLoadFactor() {
        CaseInsensitiveMap m = new CaseInsensitiveMap(16, 0.5f);
        assertNotNull(m);
        assertEquals(0, m.size());
    }

    @Test
    public void testConstructorWithNegativeLoadFactorThrows() {
        try {
            new CaseInsensitiveMap(16, -0.1f);
            fail("Expected IllegalArgumentException for negative load factor");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testConstructorWithZeroLoadFactorThrows() {
        try {
            new CaseInsensitiveMap(16, 0f);
            fail("Expected IllegalArgumentException for zero load factor");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testConstructorFromMap() {
        Map<String, String> source = new HashMap<String, String>();
        source.put("One", "value1");
        source.put("Two", "value2");
        CaseInsensitiveMap m = new CaseInsensitiveMap(source);
        assertEquals(2, m.size());
        assertEquals("value1", m.get("one"));
        assertEquals("value2", m.get("TWO"));
    }

    @Test
    public void testConstructorFromMapWithDuplicateKeysDifferentCase() {
        Map<String, String> source = new HashMap<String, String>();
        source.put("One", "value1");
        source.put("one", "value2");
        CaseInsensitiveMap m = new CaseInsensitiveMap(source);
        // Only one entry should remain since keys collapse to same lowercase
        assertEquals(1, m.size());
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorFromNullMapThrows() {
        new CaseInsensitiveMap(null);
    }

    @Test
    public void testConstructorFromEmptyMap() {
        Map<String, String> source = new HashMap<String, String>();
        CaseInsensitiveMap m = new CaseInsensitiveMap(source);
        assertEquals(0, m.size());
        assertTrue(m.isEmpty());
    }

    // ---------------------------------------------------------------
    // convertKey (tested indirectly through put/get/keySet)
    // ---------------------------------------------------------------

    @Test
    public void testPutAndGetCaseInsensitive() {
        map.put("One", "One");
        map.put("Two", "Two");
        map.put(null, "Three");
        map.put("one", "Four");

        assertEquals(3, map.size());
        assertEquals("Three", map.get(null));
        assertEquals("Four", map.get("ONE"));
        assertEquals("Four", map.get("one"));
        assertEquals("Two", map.get("TWO"));
    }

    @Test
    public void testKeySetLowerCaseAndNull() {
        map.put("One", "One");
        map.put("Two", "Two");
        map.put(null, "Three");

        Set keys = map.keySet();
        assertEquals(3, keys.size());
        assertTrue(keys.contains("one"));
        assertTrue(keys.contains("two"));
        assertTrue(keys.contains(null));
    }

    @Test
    public void testConvertKeyNonStringObject() {
        Integer key = new Integer(123);
        map.put(key, "intValue");
        assertEquals("intValue", map.get(key));
        // The lower-cased string representation should be used as key.
        assertTrue(map.containsKey("123"));
    }

    @Test
    public void testNullKeyHandling() {
        map.put(null, "nullValue");
        assertTrue(map.containsKey(null));
        assertEquals("nullValue", map.get(null));
    }

    @Test
    public void testPutOverwriteExistingKeyDifferentCase() {
        map.put("Key", "value1");
        Object old = map.put("KEY", "value2");
        assertEquals("value1", old);
        assertEquals(1, map.size());
        assertEquals("value2", map.get("key"));
    }

    @Test
    public void testRemoveCaseInsensitive() {
        map.put("Key", "value1");
        Object removed = map.remove("KEY");
        assertEquals("value1", removed);
        assertTrue(map.isEmpty());
    }

    @Test
    public void testContainsKeyCaseIns