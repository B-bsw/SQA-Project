package org.apache.commons.collections4.trie;

import org.apache.commons.collections4.OrderedMapIterator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.SortedMap;

public class AbstractPatriciaTrieTest {

    private static class SimpleStringKeyAnalyzer extends KeyAnalyzer<String> {
        private static final long serialVersionUID = 1L;

        @Override
        public int bitsPerElement() {
            return 16;
        }

        @Override
        public int lengthInBits(final String key) {
            return key == null ? 0 : key.length() * 16;
        }

        @Override
        public boolean isBitSet(final String key, final int bitIndex, final int lengthInBits) {
            if (key == null || bitIndex >= lengthInBits) {
                return false;
            }
            final int index = bitIndex / 16;
            final int bit = bitIndex % 16;
            return (key.charAt(index) & (1 << (15 - bit))) != 0;
        }

        @Override
        public int bitIndex(final String key, final int offsetInBits, final int lengthInBits,
                            final String other, final int otherOffsetInBits, final int otherLengthInBits) {
            if (key == null || other == null) {
                return NULL_BIT_KEY;
            }
            final int length = Math.max(lengthInBits, otherLengthInBits);
            for (int i = 0; i < length; i++) {
                final boolean b1 = isBitSet(key, i, lengthInBits);
                final boolean b2 = isBitSet(other, i, otherLengthInBits);
                if (b1 != b2) {
                    return i;
                }
            }
            return EQUAL_BIT_KEY;
        }
    }

    private static class ConcretePatriciaTrie<V> extends AbstractPatriciaTrie<String, V> {
        private static final long serialVersionUID = 1L;

        public ConcretePatriciaTrie() {
            super(new SimpleStringKeyAnalyzer());
        }

        public ConcretePatriciaTrie(final Map<? extends String, ? extends V> m) {
            super(new SimpleStringKeyAnalyzer(), m);
        }
    }

    private ConcretePatriciaTrie<String> trie;

    @Before
    public void setUp() {
        this.trie = new ConcretePatriciaTrie<String>();
    }

    @Test
    public void defaultConstructor_shouldInitializeEmptyTrie() {
        // Arrange & Act
        ConcretePatriciaTrie<String> t = new ConcretePatriciaTrie<String>();

        // Assert
        Assert.assertNotNull(t);
        Assert.assertTrue(t.isEmpty());
        Assert.assertEquals(0, t.size());
    }

    @Test
    public void mapConstructor_givenMap_shouldInitializeWithEntries() {
        // Arrange
        Map<String, String> map = new HashMap<String, String>();
        map.put("one", "1");
        map.put("two", "2");

        // Act
        ConcretePatriciaTrie<String> t = new ConcretePatriciaTrie<String>(map);

        // Assert
        Assert.assertEquals(2, t.size());
        Assert.assertEquals("1", t.get("one"));
        Assert.assertEquals("2", t.get("two"));
    }

    @Test
    public void putAndGet_givenEntries_shouldStoreAndRetrieveAccurately() {
        // Arrange & Act
        this.trie.put("apple", "fruit_apple");
        this.trie.put("app", "software_app");
        this.trie.put("application", "full_app");

        // Assert
        Assert.assertEquals(3, this.trie.size());
        Assert.assertEquals("fruit_apple", this.trie.get("apple"));
        Assert.assertEquals("software_app", this.trie.get("app"));
        Assert.assertEquals("full_app", this.trie.get("application"));
        Assert.assertNull(this.trie.get("orange"));
    }

    @Test
    public void containsKeyAndContainsValue_shouldCheckPresence() {
        // Arrange
        this.trie.put("cat", "feline");

        // Act & Assert
        Assert.assertTrue(this.trie.containsKey("cat"));
        Assert.assertFalse(this.trie.containsKey("dog"));
        Assert.assertTrue(this.trie.containsValue("feline"));
        Assert.assertFalse(this.trie.containsValue("canine"));
    }

    @Test
    public void remove_givenKey_shouldRemoveAndReturnOldValue() {
        // Arrange
        this.trie.put("k1", "v1");
        this.trie.put("k2", "v2");

        // Act
        String removed = this.trie.remove("k1");

        // Assert
        Assert.assertEquals("v1", removed);
        Assert.assertEquals(1, this.trie.size());
        Assert.assertNull(this.trie.get("k1"));
    }

    @Test
    public void clear_givenPopulatedTrie_shouldResetSizeAndState() {
        // Arrange
        this.trie.put("a", "1");
        this.trie.put("b", "2");

        // Act
        this.trie.clear();

        // Assert
        Assert.assertTrue(this.trie.isEmpty());
        Assert.assertEquals(0, this.trie.size());
        Assert.assertNull(this.trie.get("a"));
    }

    @Test
    public void firstKeyAndLastKey_shouldReturnOrderedExtremes() {
        // Arrange
        this.trie.put("b", "B");
        this.trie.put("a", "A");
        this.trie.put("c", "C");

        // Act & Assert
        Assert.assertEquals("a", this.trie.firstKey());
        Assert.assertEquals("c", this.trie.lastKey());
    }

    @Test(expected = NoSuchElementException.class)
    public void firstKey_givenEmptyTrie_shouldThrowNoSuchElementException() {
        // Arrange & Act & Assert
        this.trie.firstKey();
    }

    @Test
    public void nextKeyAndPreviousKey_shouldNavigateKeys() {
        // Arrange
        this.trie.put("alpha", "1");
        this.trie.put("beta", "2");
        this.trie.put("gamma", "3");

        // Act & Assert
        Assert.assertEquals("beta", this.trie.nextKey("alpha"));
        Assert.assertEquals("gamma", this.trie.nextKey("beta"));
        Assert.assertNull(this.trie.nextKey("gamma"));

        Assert.assertEquals("beta", this.trie.previousKey("gamma"));
        Assert.assertEquals("alpha", this.trie.previousKey("beta"));
        Assert.assertNull(this.trie.previousKey("alpha"));
    }

    @Test
    public void prefixMap_givenPrefix_shouldReturnSubMapMatchingPrefix() {
        // Arrange
        this.trie.put("car", "vehicle");
        this.trie.put("cart", "wagon");
        this.trie.put("carbon", "element");
        this.trie.put("dog", "animal");

        // Act
        SortedMap<String, String> pMap = this.trie.prefixMap("car");

        // Assert
        Assert.assertNotNull(pMap);
        Assert.assertEquals(3, pMap.size());
        Assert.assertTrue(pMap.containsKey("car"));
        Assert.assertTrue(pMap.containsKey("cart"));
        Assert.assertTrue(pMap.containsKey("carbon"));
        Assert.assertFalse(pMap.containsKey("dog"));
    }

    @Test
    public void mapIterator_shouldIterateAllEntries() {
        // Arrange
        this.trie.put("k1", "v1");
        this.trie.put("k2", "v2");

        // Act
        OrderedMapIterator<String, String> it = this.trie.mapIterator();
        int count = 0;
        while (it.hasNext()) {
            it.next();
            Assert.assertNotNull(it.getKey());
            Assert.assertNotNull(it.getValue());
            count++;
        }

        // Assert
        Assert.assertEquals(2, count);
    }
}
