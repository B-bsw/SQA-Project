package org.apache.commons.collections4.trie;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

import org.apache.commons.collections4.OrderedMapIterator;
import org.apache.commons.collections4.Trie;
import org.junit.Before;
import org.junit.Test;

public class UnmodifiableTrieTest {

    private Trie<String, Integer> delegate;
    private UnmodifiableTrie<String, Integer> trie;

    @Before
    public void setUp() {
        delegate = new PatricaTrie<>();
        delegate.put("A", 1);
        delegate.put("AB", 2);
        delegate.put("ABC", 3);
        delegate.put("B", 4);
        trie = new UnmodifiableTrie<>(delegate);
    }

    @Test
    public void testConstructorNullTrieThrows() {
        try {
            new UnmodifiableTrie<>(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testUnmodifiableTrieFactory() {
        UnmodifiableTrie<String, Integer> result = UnmodifiableTrie.unmodifiableTrie(delegate);
        assertSame(trie.getClass(), result.getClass());
    }

    @Test
    public void testEntrySetIsUnmodifiable() {
        try {
            trie.entrySet().clear();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
        assertEquals(4, trie.entrySet().size());
    }

    @Test
    public void testKeySetIsUnmodifiable() {
        try {
            trie.keySet().clear();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
        assertEquals(4, trie.keySet().size());
    }

    @Test
    public void testValuesIsUnmodifiable() {
        try {
            trie.values().clear();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
        assertEquals(4, trie.values().size());
    }

    @Test
    public void testClearThrows() {
        try {
            trie.clear();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testContainsKey() {
        assertTrue(trie.containsKey("A"));
        assertFalse(trie.containsKey("Z"));
        assertFalse(trie.containsKey(null));
    }

    @Test
    public void testContainsValue() {
        assertTrue(trie.containsValue(1));
        assertFalse(trie.containsValue(99));
        assertFalse(trie.containsValue(null));
    }

    @Test
    public void testGetExistingKey() {
        assertEquals(Integer.valueOf(1), trie.get("A"));
        assertEquals(Integer.valueOf(3), trie.get("ABC"));
    }

    @Test
    public void testGetNullKey() {
        assertNull(trie.get(null));
    }

    @Test
    public void testIsEmpty() {
        assertFalse(trie.isEmpty());
        Trie<String, Integer> emptyTrie = new PatricaTrie<>();
        UnmodifiableTrie<String, Integer> emptyUnmod = new UnmodifiableTrie<>(emptyTrie);
        assertTrue(emptyUnmod.isEmpty());
    }

    @Test
    public void testPutThrows() {
        try {
            trie.put("X", 5);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testPutAllThrows() {
        try {
            Map<String, Integer> map = new HashMap<>();
            map.put("Z", 1);
            trie.putAll(map);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testRemoveThrows() {
        try {
            trie.remove("A");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testSize() {
        assertEquals(4, trie.size());
    }

    @Test
    public void testFirstKey() {
        assertEquals("A", trie.firstKey());
    }

    @Test
    public void testLastKey() {
        assertEquals("B", trie.lastKey());
    }

    @Test
    public void testHeadMapIsUnmodifiable() {
        SortedMap<String, Integer> headMap = trie.headMap("B");
        assertEquals(3, headMap.size());
        try {
            headMap.put("X", 1);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testSubMapIsUnmodifiable() {
        SortedMap<String, Integer> subMap = trie.subMap("A", "B");
        assertEquals(3, subMap.size());
        try {
            subMap.clear();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testTailMapIsUnmodifiable() {
        SortedMap<String, Integer> tailMap = trie.tailMap("AB");
        assertEquals(3, tailMap.size());
        try {
            tailMap.remove("AB");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testPrefixMapIsUnmodifiable() {
        SortedMap<String, Integer> prefixMap = trie.prefixMap("A");
        assertEquals(3, prefixMap.size());
        try {
            prefixMap.put("X", 1);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testComparator() {
        assertNull(trie.comparator());
    }

    @Test
    public void testMapIteratorUnmodifiable() {
        OrderedMapIterator<String, Integer> it = trie.mapIterator();
        assertTrue(it.hasNext());
        it.next();
        try {
            it.remove();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testNextKey() {
        assertEquals("AB", trie.nextKey("A"));
        assertNull(trie.nextKey("B"));
        assertNull(trie.nextKey(null));
    }

    @Test
    public void testPreviousKey() {
        assertEquals("AB", trie.previousKey("ABC"));
        assertNull(trie.previousKey("A"));
        assertNull(trie.previousKey(null));
    }

    @Test
    public void testHashCode() {
        assertEquals(delegate.hashCode(), trie.hashCode());
    }

    @Test
    public void testEquals() {
        assertTrue(trie.equals(delegate));
        assertFalse(trie.equals(null));
        assertFalse(trie.equals(new Object()));
    }

    @Test
    public void testToString() {
        assertEquals(delegate.toString(), trie.toString());
    }
}