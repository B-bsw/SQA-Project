package org.apache.commons.collections4.trie;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

import org.apache.commons.collections4.OrderedMapIterator;
import org.apache.commons.collections4.Trie;
import org.apache.commons.collections4.Unmodifiable;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Complete Unit Test Suite for {@link UnmodifiableTrie}.
 */
public class UnmodifiableTrieTest {

    private MockTrie<String, String> rawTrie;
    private UnmodifiableTrie<String, String> unmodifiableTrie;

    @Before
    public void setUp() {
        rawTrie = new MockTrie<String, String>();
        rawTrie.put("apple", "fruit_apple");
        rawTrie.put("application", "software_app");
        rawTrie.put("banana", "fruit_banana");
        rawTrie.put("band", "music_band");
        rawTrie.put("cat", "animal_cat");

        unmodifiableTrie = new UnmodifiableTrie<String, String>(rawTrie);
    }

    // -----------------------------------------------------------------------
    // Factory Method & Constructor Tests
    // -----------------------------------------------------------------------

    @Test
    public void unmodifiableTrie_givenValidTrie_shouldWrapSuccessfully() {
        // Arrange
        final MockTrie<String, String> trie = new MockTrie<String, String>();
        trie.put("k1", "v1");

        // Act
        final Trie<String, String> wrapped = UnmodifiableTrie.unmodifiableTrie(trie);

        // Assert
        Assert.assertNotNull(wrapped);
        Assert.assertTrue(wrapped instanceof UnmodifiableTrie);
        Assert.assertEquals("v1", wrapped.get("k1"));
    }

    @Test
    public void unmodifiableTrie_givenNullTrie_shouldThrowIllegalArgumentException() {
        // Arrange & Act & Assert
        try {
            UnmodifiableTrie.unmodifiableTrie(null);
            Assert.fail("Expected IllegalArgumentException when trie is null");
        } catch (IllegalArgumentException ex) {
            Assert.assertEquals("Trie must not be null", ex.getMessage());
        }
    }

    @Test
    public void constructor_givenValidTrie_shouldWrapSuccessfully() {
        // Arrange
        final MockTrie<String, String> trie = new MockTrie<String, String>();
        trie.put("a", "1");

        // Act
        final UnmodifiableTrie<String, String> wrapped = new UnmodifiableTrie<String, String>(trie);

        // Assert
        Assert.assertNotNull(wrapped);
        Assert.assertEquals(1, wrapped.size());
        Assert.assertEquals("1", wrapped.get("a"));
    }

    @Test
    public void constructor_givenNullTrie_shouldThrowIllegalArgumentException() {
        // Arrange & Act & Assert
        try {
            new UnmodifiableTrie<String, String>(null);
            Assert.fail("Expected IllegalArgumentException when trie is null");
        } catch (IllegalArgumentException ex) {
            Assert.assertEquals("Trie must not be null", ex.getMessage());
        }
    }

    // -----------------------------------------------------------------------
    // Mutation Operations - Should Throw UnsupportedOperationException
    // -----------------------------------------------------------------------

    @Test(expected = UnsupportedOperationException.class)
    public void clear_whenInvoked_shouldThrowUnsupportedOperationException() {
        // Arrange & Act
        unmodifiableTrie.clear();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void put_whenInvoked_shouldThrowUnsupportedOperationException() {
        // Arrange & Act
        unmodifiableTrie.put("new_key", "new_value");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void putAll_whenInvoked_shouldThrowUnsupportedOperationException() {
        // Arrange
        final Map<String, String> toAdd = new HashMap<String, String>();
        toAdd.put("new_key", "new_value");

        // Act
        unmodifiableTrie.putAll(toAdd);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void remove_whenInvoked_shouldThrowUnsupportedOperationException() {
        // Arrange & Act
        unmodifiableTrie.remove("apple");
    }

    // -----------------------------------------------------------------------
    // Read Operations & View Tests
    // -----------------------------------------------------------------------

    @Test
    public void size_givenPopulatedTrie_shouldReturnCorrectSize() {
        // Arrange & Act
        final int size = unmodifiableTrie.size();

        // Assert
        Assert.assertEquals(5, size);
    }

    @Test
    public void isEmpty_givenEmptyAndNonEmptyTrie_shouldDelegateCorrectly() {
        // Arrange & Act & Assert
        Assert.assertFalse(unmodifiableTrie.isEmpty());

        final MockTrie<String, String> emptyMock = new MockTrie<String, String>();
        final UnmodifiableTrie<String, String> emptyTrie = new UnmodifiableTrie<String, String>(emptyMock);
        Assert.assertTrue(emptyTrie.isEmpty());
    }

    @Test
    public void containsKey_givenExistingAndNonExistingKey_shouldDelegateCorrectly() {
        // Arrange & Act & Assert
        Assert.assertTrue(unmodifiableTrie.containsKey("apple"));
        Assert.assertFalse(unmodifiableTrie.containsKey("unknown"));
        Assert.assertFalse(unmodifiableTrie.containsKey(null));
    }

    @Test
    public void containsValue_givenExistingAndNonExistingValue_shouldDelegateCorrectly() {
        // Arrange & Act & Assert
        Assert.assertTrue(unmodifiableTrie.containsValue("fruit_apple"));
        Assert.assertFalse(unmodifiableTrie.containsValue("non_existent"));
        Assert.assertFalse(unmodifiableTrie.containsValue(null));
    }

    @Test
    public void get_givenExistingAndNonExistingKey_shouldDelegateCorrectly() {
        // Arrange & Act & Assert
        Assert.assertEquals("fruit_apple", unmodifiableTrie.get("apple"));
        Assert.assertNull(unmodifiableTrie.get("not_found"));
        Assert.assertNull(unmodifiableTrie.get(null));
    }

    @Test
    public void entrySet_whenInvoked_shouldReturnUnmodifiableSet() {
        // Arrange
        final Set<Map.Entry<String, String>> entries = unmodifiableTrie.entrySet();

        // Act & Assert
        Assert.assertNotNull(entries);
        Assert.assertEquals(5, entries.size());

        try {
            entries.clear();
            Assert.fail("Modifying entrySet must throw UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            // expected
        }
    }

    @Test
    public void keySet_whenInvoked_shouldReturnUnmodifiableSet() {
        // Arrange
        final Set<String> keys = unmodifiableTrie.keySet();

        // Act & Assert
        Assert.assertNotNull(keys);
        Assert.assertEquals(5, keys.size());
        Assert.assertTrue(keys.contains("apple"));

        try {
            keys.remove("apple");
            Assert.fail("Modifying keySet must throw UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            // expected
        }
    }

    @Test
    public void values_whenInvoked_shouldReturnUnmodifiableCollection() {
        // Arrange
        final Collection<String> values = unmodifiableTrie.values();

        // Act & Assert
        Assert.assertNotNull(values);
        Assert.assertEquals(5, values.size());
        Assert.assertTrue(values.contains("fruit_apple"));

        try {
            values.clear();
            Assert.fail("Modifying values must throw UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            // expected
        }
    }

    // -----------------------------------------------------------------------
    // SortedMap & Trie Navigation Operations
    // -----------------------------------------------------------------------

    @Test
    public void firstKey_whenInvoked_shouldDelegateCorrectly() {
        // Arrange & Act
        final String first = unmodifiableTrie.firstKey();

        // Assert
        Assert.assertEquals("apple", first);
    }

    @Test
    public void lastKey_whenInvoked_shouldDelegateCorrectly() {
        // Arrange & Act
        final String last = unmodifiableTrie.lastKey();

        // Assert
        Assert.assertEquals("cat", last);
    }

    @Test
    public void headMap_whenInvoked_shouldReturnUnmodifiableSortedMap() {
        // Arrange & Act
        final SortedMap<String, String> head = unmodifiableTrie.headMap("banana");

        // Assert
        Assert.assertNotNull(head);
        Assert.assertEquals(2, head.size());
        Assert.assertTrue(head.containsKey("apple"));
        Assert.assertTrue(head.containsKey("application"));

        try {
            head.put("another", "value");
            Assert.fail("Modifying headMap must throw UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            // expected
        }
    }

    @Test
    public void subMap_whenInvoked_shouldReturnUnmodifiableSortedMap() {
        // Arrange & Act
        final SortedMap<String, String> sub = unmodifiableTrie.subMap("application", "cat");

        // Assert
        Assert.assertNotNull(sub);
        Assert.assertEquals(3, sub.size());
        Assert.assertTrue(sub.containsKey("application"));
        Assert.assertTrue(sub.containsKey("banana"));
        Assert.assertTrue(sub.containsKey("band"));

        try {
            sub.clear();
            Assert.fail("Modifying subMap must throw UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            // expected
        }
    }

    @Test
    public void tailMap_whenInvoked_shouldReturnUnmodifiableSortedMap() {
        // Arrange & Act
        final SortedMap<String, String> tail = unmodifiableTrie.tailMap("band");

        // Assert
        Assert.assertNotNull(tail);
        Assert.assertEquals(2, tail.size());
        Assert.assertTrue(tail.containsKey("band"));
        Assert.assertTrue(tail.containsKey("cat"));

        try {
            tail.remove("cat");
            Assert.fail("Modifying tailMap must throw UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            // expected
        }
    }

    @Test
    public void prefixMap_whenInvoked_shouldReturnUnmodifiableSortedMap() {
        // Arrange & Act
        final SortedMap<String, String> prefix = unmodifiableTrie.prefixMap("app");

        // Assert
        Assert.assertNotNull(prefix);
        Assert.assertEquals(2, prefix.size());
        Assert.assertTrue(prefix.containsKey("apple"));
        Assert.assertTrue(prefix.containsKey("application"));

        try {
            prefix.clear();
            Assert.fail("Modifying prefixMap must throw UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            // expected
        }
    }

    @Test
    public void comparator_givenNaturalOrdering_shouldDelegateCorrectly() {
        // Arrange & Act
        final Comparator<? super String> comp = unmodifiableTrie.comparator();

        // Assert
        Assert.assertNull(comp);
    }

    @Test
    public void comparator_givenCustomComparator_shouldDelegateCorrectly() {
        // Arrange
        final Comparator<String> customComp = Collections.reverseOrder();
        final MockTrie<String, String> customMock = new MockTrie<String, String>(customComp);
        final UnmodifiableTrie<String, String> customTrie = new UnmodifiableTrie<String, String>(customMock);

        // Act
        final Comparator<? super String> returned = customTrie.comparator();

        // Assert
        Assert.assertSame(customComp, returned);
    }

    @Test
    public void nextKey_givenKey_shouldDelegateCorrectly() {
        // Arrange & Act & Assert
        Assert.assertEquals("application", unmodifiableTrie.nextKey("apple"));
        Assert.assertEquals("banana", unmodifiableTrie.nextKey("application"));
        Assert.assertNull(unmodifiableTrie.nextKey("cat"));
    }

    @Test
    public void previousKey_givenKey_shouldDelegateCorrectly() {
        // Arrange & Act & Assert
        Assert.assertEquals("band", unmodifiableTrie.previousKey("cat"));
        Assert.assertEquals("banana", unmodifiableTrie.previousKey("band"));
        Assert.assertNull(unmodifiableTrie.previousKey("apple"));
    }

    // -----------------------------------------------------------------------
    // OrderedMapIterator Tests
    // -----------------------------------------------------------------------

    @Test
    public void mapIterator_whenIterating_shouldIterateCorrectly() {
        // Arrange
        final OrderedMapIterator<String, String> it = unmodifiableTrie.mapIterator();

        // Act & Assert
        Assert.assertTrue(it.hasNext());
        Assert.assertFalse(it.hasPrevious());

        final String k1 = it.next();
        Assert.assertEquals("apple", k1);
        Assert.assertEquals("apple", it.getKey());
        Assert.assertEquals("fruit_apple", it.getValue());
        Assert.assertTrue(it.hasPrevious());

        final String k2 = it.next();
        Assert.assertEquals("application", k2);
        Assert.assertEquals("application", it.getKey());
        Assert.assertEquals("software_app", it.getValue());

        final String prev = it.previous();
        Assert.assertEquals("apple", prev);
        Assert.assertEquals("apple", it.getKey());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void mapIterator_whenSetValue_shouldThrowUnsupportedOperationException() {
        // Arrange
        final OrderedMapIterator<String, String> it = unmodifiableTrie.mapIterator();
        it.next();

        // Act
        it.setValue("updated_value");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void mapIterator_whenRemove_shouldThrowUnsupportedOperationException() {
        // Arrange
        final OrderedMapIterator<String, String> it = unmodifiableTrie.mapIterator();
        it.next();

        // Act
        it.remove();
    }

    // -----------------------------------------------------------------------
    // Object Standard Methods (equals, hashCode, toString)
    // -----------------------------------------------------------------------

    @Test
    public void equals_and_hashCode_shouldDelegateCorrectly() {
        // Arrange
        final MockTrie<String, String> identicalMock = new MockTrie<String, String>();
        identicalMock.put("apple", "fruit_apple");
        identicalMock.put("application", "software_app");
        identicalMock.put("banana", "fruit_banana");
        identicalMock.put("band", "music_band");
        identicalMock.put("cat", "animal_cat");

        final UnmodifiableTrie<String, String> sameTrie = new UnmodifiableTrie<String, String>(identicalMock);

        // Act & Assert
        Assert.assertTrue(unmodifiableTrie.equals(unmodifiableTrie));
        Assert.assertTrue(unmodifiableTrie.equals(rawTrie));
        Assert.assertEquals(rawTrie.hashCode(), unmodifiableTrie.hashCode());
        Assert.assertEquals(sameTrie.hashCode(), unmodifiableTrie.hashCode());

        Assert.assertFalse(unmodifiableTrie.equals(null));
        Assert.assertFalse(unmodifiableTrie.equals("not_a_trie"));
    }

    @Test
    public void toString_whenInvoked_shouldDelegateCorrectly() {
        // Arrange & Act
        final String str = unmodifiableTrie.toString();

        // Assert
        Assert.assertNotNull(str);
        Assert.assertEquals(rawTrie.toString(), str);
    }

    // -----------------------------------------------------------------------
    // Type Hierarchy & Serialization Tests
    // -----------------------------------------------------------------------

    @Test
    public void typeHierarchy_shouldImplementTrieAndUnmodifiableAndSerializable() {
        // Assert
        Assert.assertTrue(unmodifiableTrie instanceof Trie);
        Assert.assertTrue(unmodifiableTrie instanceof Unmodifiable);
        Assert.assertTrue(unmodifiableTrie instanceof Serializable);
    }

    @Test
    public void serialization_shouldSerializeAndDeserializeSuccessfully() throws Exception {
        // Arrange
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final ObjectOutputStream oos = new ObjectOutputStream(baos);

        // Act
        oos.writeObject(unmodifiableTrie);
        oos.close();

        final ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        final ObjectInputStream ois = new ObjectInputStream(bais);
        @SuppressWarnings("unchecked")
        final UnmodifiableTrie<String, String> deserialized =
                (UnmodifiableTrie<String, String>) ois.readObject();
        ois.close();

        // Assert
        Assert.assertNotNull(deserialized);
        Assert.assertEquals(unmodifiableTrie.size(), deserialized.size());
        Assert.assertEquals(unmodifiableTrie.get("apple"), deserialized.get("apple"));
    }

    // -----------------------------------------------------------------------
    // Internal Mock Trie implementation for independent execution
    // -----------------------------------------------------------------------

    private static class MockTrie<K, V> implements Trie<K, V>, Serializable {
        private static final long serialVersionUID = 1L;
        private final TreeMap<K, V> map;

        public MockTrie() {
            this.map = new TreeMap<K, V>();
        }

        public MockTrie(final Comparator<? super K> comparator) {
            this.map = new TreeMap<K, V>(comparator);
        }

        public Set<Map.Entry<K, V>> entrySet() {
            return map.entrySet();
        }

        public Set<K> keySet() {
            return map.keySet();
        }

        public Collection<V> values() {
            return map.values();
        }

        public void clear() {
            map.clear();
        }

        public boolean containsKey(final Object key) {
            try {
                return map.containsKey(key);
            } catch (ClassCastException ex) {
                return false;
            } catch (NullPointerException ex) {
                return false;
            }
        }

        public boolean containsValue(final Object value) {
            return map.containsValue(value);
        }

        public V get(final Object key) {
            try {
                return map.get(key);
            } catch (ClassCastException ex) {
                return null;
            } catch (NullPointerException ex) {
                return null;
            }
        }

        public boolean isEmpty() {
            return map.isEmpty();
        }

        public V put(final K key, final V value) {
            return map.put(key, value);
        }

        public void putAll(final Map<? extends K, ? extends V> m) {
            map.putAll(m);
        }

        public V remove(final Object key) {
            return map.remove(key);
        }

        public int size() {
            return map.size();
        }

        public K firstKey() {
            return map.firstKey();
        }

        public K lastKey() {
            return map.lastKey();
        }

        public SortedMap<K, V> headMap(final K toKey) {
            return map.headMap(toKey);
        }

        public SortedMap<K, V> subMap(final K fromKey, final K toKey) {
            return map.subMap(fromKey, toKey);
        }

        public SortedMap<K, V> tailMap(final K fromKey) {
            return map.tailMap(fromKey);
        }

        public SortedMap<K, V> prefixMap(final K key) {
            final TreeMap<K, V> prefixResult = new TreeMap<K, V>(map.comparator());
            final String prefixStr = String.valueOf(key);
            for (Map.Entry<K, V> entry : map.entrySet()) {
                if (String.valueOf(entry.getKey()).startsWith(prefixStr)) {
                    prefixResult.put(entry.getKey(), entry.getValue());
                }
            }
            return prefixResult;
        }

        public Comparator<? super K> comparator() {
            return map.comparator();
        }

        public OrderedMapIterator<K, V> mapIterator() {
            final List<Map.Entry<K, V>> entries = new ArrayList<Map.Entry<K, V>>(map.entrySet());
            return new MockOrderedMapIterator<K, V>(entries);
        }

        public K nextKey(final K key) {
            return map.higherKey(key);
        }

        public K previousKey(final K key) {
            return map.lowerKey(key);
        }

        @Override
        public int hashCode() {
            return map.hashCode();
        }

        @Override
        public boolean equals(final Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof MockTrie) {
                final MockTrie<?, ?> other = (MockTrie<?, ?>) obj;
                return this.map.equals(other.map);
            }
            return this.map.equals(obj);
        }

        @Override
        public String toString() {
            return map.toString();
        }
    }

    private static class MockOrderedMapIterator<K, V> implements OrderedMapIterator<K, V> {
        private final List<Map.Entry<K, V>> list;
        private int cursor;
        private int lastReturned;

        public MockOrderedMapIterator(final List<Map.Entry<K, V>> list) {
            this.list = list;
            this.cursor = 0;
            this.lastReturned = -1;
        }

        public boolean hasNext() {
            return cursor < list.size();
        }

        public K next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            lastReturned = cursor;
            cursor++;
            return list.get(lastReturned).getKey();
        }

        public boolean hasPrevious() {
            return cursor > 0;
        }

        public K previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            cursor--;
            lastReturned = cursor;
            return list.get(lastReturned).getKey();
        }

        public K getKey() {
            if (lastReturned < 0 || lastReturned >= list.size()) {
                throw new IllegalStateException();
            }
            return list.get(lastReturned).getKey();
        }

        public V getValue() {
            if (lastReturned < 0 || lastReturned >= list.size()) {
                throw new IllegalStateException();
            }
            return list.get(lastReturned).getValue();
        }

        public V setValue(final V value) {
            throw new UnsupportedOperationException();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}