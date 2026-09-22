package org.apache.commons.collections4.trie;

import org.junit.Before;
import org.junit.Test;
import org.apache.commons.collections4.OrderedMapIterator;

import java.util.Map;
import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class AbstractPatriciaTrieTest {

    @Test
    public void testClearEmptyTrie() {
        AbstractPatriciaTrie<String, String> trie = createTrie();
        trie.clear();
        assertEquals(0, trie.size());
        assertTrue(trie.isEmpty());
    }

    @Test
    public void testClearNonEmptyTrie() {
        AbstractPatriciaTrie<String, String> trie = createTrie();
        trie.put("key1", "value1");
        trie.put("key2", "value2");
        trie.clear();
        assertEquals(0, trie.size());
        assertNull(trie.get("key1"));
        assertNull(trie.get("key2"));
    }

    @Test
    public void testSizeEmpty() {
        AbstractPatriciaTrie<String, String> trie = createTrie();
        assertEquals(0, trie.size());
    }

    @Test
    public void testSizeNonEmpty() {
        AbstractPatriciaTrie<String, String> trie = createTrie();
        trie.put("a", "1");
        trie.put("b", "2");
        assertEquals(2, trie.size());
    }

    @Test
    public void testPutNullKey() {
        AbstractPatriciaTrie<String, String> trie = createTrie();
        try {
            trie.put(null, "value");
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testPutNewKey() {
        AbstractPatriciaTrie<String, String> trie = createTrie();
        assertNull(trie.put("key", "value"));
        assertEquals("value", trie.get("key"));
    }

    @Test
    public void testPutUpdateValue() {
        AbstractPatriciaTrie<String, String> trie = createTrie();
        trie.put("key", "value1");
        assertEquals("value1", trie.put("key", "value2"));
        assertEquals("value2", trie.get("key"));
    }

    @Test
    public void testPutZeroLengthKey() {
        AbstractPatriciaTrie<String, String> trie = createTrie();
        assertNull(trie.put("", "empty"));
        assertEquals("empty", trie.get(""));
    }

    @Test
    public void testGetNonExistentKey() {
        AbstractPatriciaTrie<String, String> trie = createTrie();
        assertNull(trie.get("nonexistent"));
    }

    @Test
    public void testGetNullKey() {
        AbstractPatriciaTrie<String, String> trie = createTrie();
        trie.put("key", "value");
        try {
            trie.get(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testContainsKey() {
        AbstractPatriciaTrie<String, String> trie = createTrie();
        trie.put("key", "value");
        assertTrue(trie.containsKey("key"));
        assertFalse(trie.containsKey("nonexistent"));
        assertFalse(trie.containsKey(null));
    }

    @Test
    public void testRemoveExistingKey() {
        AbstractPatriciaTrie<String, String> trie = createTrie();
        trie.put("key", "value");
        assertEquals("value", trie.remove("key"));
        assertEquals(0, trie.size());
    }

    @Test
    public void testRemoveNonExistentKey() {
        AbstractPatriciaTrie<String, String> trie = createTrie();
        trie.put("key", "value");
        assertNull(trie.remove("nonexistent"));
        assertEquals(1, trie.size());
    }

    @Test
    public void testFirstKeyEmpty() {
        AbstractPatriciaTrie<String, String> trie = createTrie();
        try {
            trie.firstKey();
            fail("Expected NoSuchElementException");
        } catch (NoSuchElementException e) {
            // Expected
        }
    }

    @Test
    public void testFirstKeyNonEmpty() {
        AbstractPatriciaTrie<String, String> trie = createTrie();
        trie.put("b", "2");
        trie.put("a", "1");
        trie.put("c", "3");
        assertEquals("a", trie.firstKey());
    }

    @Test
    public void testLastKeyEmpty() {
        AbstractPatriciaTrie<String, String> trie = createTrie();
        try {
            trie.lastKey();
            fail("Expected NoSuchElementException");
        } catch (NoSuchElementException e) {
            // Expected
        }
    }

    @Test
    public void testLastKeyNonEmpty() {
        AbstractPatriciaTrie<String, String> trie = createTrie();
        trie.put("b", "2");
        trie.put("a", "1");
        trie.put("c", "3");
        assertEquals("c", trie.lastKey());
    }

    @Test
    public void testNextKey() {
        AbstractPatriciaTrie<String, String> trie = createTrie();
        trie.put("a", "1");
        trie.put("b", "2");
        trie.put("c", "3");
        assertEquals("b", trie.nextKey("a"));
        assertEquals("c", trie.nextKey("b"));
        assertNull(trie.nextKey("c"));
        try {
            trie.nextKey(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testPreviousKey() {
        AbstractPatriciaTrie<String, String> trie = createTrie();
        trie.put("a", "1");
        trie.put("b", "2");
        trie.put("c", "3");
        assertEquals("b", trie.previousKey("c"));
        assertEquals("a", trie.previousKey("b"));
        assertNull(trie.previousKey("a"));
        try {
            trie.previousKey(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testHeadMap() {
        AbstractPatriciaTrie<String, String> trie = createTrie();
        trie.put("a", "1");
        trie.put("b", "2");
        trie.put("c", "3");
        Map<String, String> subMap = trie.headMap("b");
        assertEquals(1, subMap.size());
        assertTrue(subMap.containsKey("a"));
        assertFalse(subMap.containsKey("b"));
    }

    @Test
    public void testSubMap() {
        AbstractPatriciaTrie<String, String> trie = createTrie();
        trie.put("a", "1");
        trie.put("b", "2");
        trie.put("c", "3");
        trie.put("d", "4");
        Map<String, String> subMap = trie.subMap("b", "c");
        assertEquals(1, subMap.size());
        assertTrue(subMap.containsKey("b"));
        assertFalse(subMap.containsKey("c"));
    }

    @Test
    public void testTailMap() {
        AbstractPatriciaTrie<String, String> trie = createTrie();
        trie.put("a", "1");
        trie.put("b", "2");
        trie.put("c", "3");
        Map<String, String> subMap = trie.tailMap("b");
        assertEquals(2, subMap.size());
        assertTrue(subMap.containsKey("b"));
        assertTrue(subMap.containsKey("c"));
    }

    @Test
    public void testPrefixMap() {
        AbstractPatriciaTrie<String, String> trie = createTrie();
        trie.put("apple", "1");
        trie.put("app", "2");
        trie.put("apricot", "3");
        trie.put("banana", "4");
        Map<String, String> prefixMap = trie.prefixMap("ap");
        assertEquals(3, prefixMap.size());
        assertTrue(prefixMap.containsKey("apple"));
        assertTrue(prefixMap.containsKey("app"));
        assertTrue(prefixMap.containsKey("apricot"));
    }

    @Test
    public void testEntrySet() {
        AbstractPatriciaTrie<String, String> trie = createTrie();
        trie.put("a", "1");
        trie.put("b", "2");
        assertEquals(2, trie.entrySet().size());
        assertTrue(trie.entrySet().contains(java.util.Collections.singletonMap("a", "1").entrySet().iterator().next()));
    }

    @Test
    public void testKeySet() {
        AbstractPatriciaTrie<String, String> trie = createTrie();
        trie.put("a", "1");
        trie.put("b", "2");
        assertEquals(2, trie.keySet().size());
        assertTrue(trie.keySet().contains("a"));
        assertTrue(trie.keySet().contains("b"));
    }

    @Test
    public void testValues() {
        AbstractPatriciaTrie<String, String> trie = createTrie();
        trie.put("a", "1");
        trie.put("b", "2");
        assertEquals(2, trie.values().size());
        assertTrue(trie.values().contains("1"));
        assertTrue(trie.values().contains("2"));
    }

    @Test
    public void testMapIterator() {
        AbstractPatriciaTrie<String, String> trie = createTrie();
        trie.put("a", "1");
        trie.put("b", "2");
        OrderedMapIterator<String, String> it = trie.mapIterator();
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
        assertEquals("1", it.getValue());
        it.setValue("10");
        assertEquals("10", it.getValue());
        assertTrue(it.hasPrevious());
        assertEquals("a", it.previous());
        assertTrue(it.hasNext());
    }

    @Test
    public void testRangeMap() {
        AbstractPatriciaTrie<String, String> trie = createTrie();
        trie.put("a", "1");
        trie.put("b", "2");
        trie.put("c", "3");
        SortedMap<String, String> rangeMap = trie.subMap("a", "c");
        assertEquals(1, rangeMap.size());
        assertTrue(rangeMap.containsKey("a"));
        assertFalse(rangeMap.containsKey("c"));
        assertEquals("1", rangeMap.get("a"));
        rangeMap.put("b", "20");
        assertEquals("20", trie.get("b"));
    }

    private AbstractPatriciaTrie<String, String> createTrie() {
        return new AbstractPatriciaTrie<String, String>(new org.apache.commons.collections4.trie.StringKeyAnalyzer()) {
            // Abstract class implementation
        };
    }
}