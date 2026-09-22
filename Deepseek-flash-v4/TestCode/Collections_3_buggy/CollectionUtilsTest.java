package org.apache.commons.collections;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.util.*;

public class CollectionUtilsTest {

    private Collection<String> collectionA;
    private Collection<String> collectionB;
    private Collection<String> emptyCollection;
    private Collection<String> singleCollection;
    private Collection<String> nullCollection;

    @Before
    public void setUp() {
        collectionA = new ArrayList<String>();
        collectionA.add("a");
        collectionA.add("b");
        collectionA.add("c");

        collectionB = new ArrayList<String>();
        collectionB.add("b");
        collectionB.add("c");
        collectionB.add("d");

        emptyCollection = new ArrayList<String>();
        singleCollection = new ArrayList<String>();
        singleCollection.add("x");
        nullCollection = null;
    }

    @After
    public void tearDown() {
        collectionA = null;
        collectionB = null;
        emptyCollection = null;
        singleCollection = null;
        nullCollection = null;
    }

    @Test
    public void testUnion() {
        Collection<String> result = CollectionUtils.union(collectionA, collectionB);
        assertEquals(5, result.size());
        assertTrue(result.contains("a"));
        assertTrue(result.contains("b"));
        assertTrue(result.contains("c"));
        assertTrue(result.contains("d"));
    }

    @Test
    public void testUnionWithEmptyCollections() {
        Collection<String> result = CollectionUtils.union(emptyCollection, emptyCollection);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testIntersection() {
        Collection<String> result = CollectionUtils.intersection(collectionA, collectionB);
        assertEquals(2, result.size());
        assertTrue(result.contains("b"));
        assertTrue(result.contains("c"));
    }

    @Test
    public void testDisjunction() {
        Collection<String> result = CollectionUtils.disjunction(collectionA, collectionB);
        assertEquals(2, result.size());
        assertTrue(result.contains("a"));
        assertTrue(result.contains("d"));
    }

    @Test
    public void testSubtract() {
        Collection<String> result = CollectionUtils.subtract(collectionA, collectionB);
        assertEquals(1, result.size());
        assertTrue(result.contains("a"));
    }

    @Test
    public void testSubtractWithDuplicates() {
        Collection<String> a = new ArrayList<String>();
        a.add("a"); a.add("a"); a.add("b");
        Collection<String> b = new ArrayList<String>();
        b.add("a");

        Collection<String> result = CollectionUtils.subtract(a, b);
        assertEquals(2, result.size());
        assertTrue(result.contains("a"));
        assertTrue(result.contains("b"));
    }

    @Test
    public void testContainsAnyTrue() {
        Collection<String> coll1 = new ArrayList<String>();
        coll1.add("x"); coll1.add("y");
        assertTrue(CollectionUtils.containsAny(coll1, collectionA));
    }

    @Test
    public void testContainsAnyFalse() {
        Collection<String> coll2 = new ArrayList<String>();
        coll2.add("z"); coll2.add("w");
        assertFalse(CollectionUtils.containsAny(coll2, collectionA));
    }

    @Test
    public void testGetCardinalityMap() {
        Map<Object, Integer> map = CollectionUtils.getCardinalityMap(collectionA);
        assertEquals(3, map.size());
        assertEquals(new Integer(1), map.get("a"));
        assertEquals(new Integer(1), map.get("b"));
    }

    @Test
    public void testGetCardinalityMapWithDuplicates() {
        Collection<String> coll = new ArrayList<String>();
        coll.add("a"); coll.add("a"); coll.add("b");
        Map<Object, Integer> map = CollectionUtils.getCardinalityMap(coll);
        assertEquals(2, map.size());
        assertEquals(new Integer(2), map.get("a"));
        assertEquals(new Integer(1), map.get("b"));
    }

    @Test
    public void testIsSubCollectionTrue() {
        Collection<String> sub = new ArrayList<String>();
        sub.add("b"); sub.add("c");
        assertTrue(CollectionUtils.isSubCollection(sub, collectionA));
    }

    @Test
    public void testIsSubCollectionFalse() {
        Collection<String> sub = new ArrayList<String>();
        sub.add("z");
        assertFalse(CollectionUtils.isSubCollection(sub, collectionA));
    }

    @Test
    public void testIsProperSubCollectionTrue() {
        Collection<String> sub = new ArrayList<String>();
        sub.add("b");
        assertTrue(CollectionUtils.isProperSubCollection(sub, collectionA));
    }

    @Test
    public void testIsProperSubCollectionFalse() {
        Collection<String> sub = new ArrayList<String>();
        sub.add("a"); sub.add("b"); sub.add("c");
        assertFalse(CollectionUtils.isProperSubCollection(sub, collectionA));
    }

    @Test
    public void testIsEqualCollectionEqual() {
        Collection<String> other = new ArrayList<String>();
        other.add("a"); other.add("b"); other.add("c");
        assertTrue(CollectionUtils.isEqualCollection(collectionA, other));
    }

    @Test
    public void testIsEqualCollectionDifferent() {
        assertFalse(CollectionUtils.isEqualCollection(collectionA, collectionB));
    }

    @Test
    public void testCardinalityInSet() {
        Set<String> set = new HashSet<String>();
        set.add("a");
        assertEquals(1, CollectionUtils.cardinality("a", set));
        assertEquals(0, CollectionUtils.cardinality("z", set));
    }

    @Test
    public void testCardinalityInCollection() {
        assertEquals(1, CollectionUtils.cardinality("a", collectionA));
        assertEquals(0, CollectionUtils.cardinality("z", collectionA));
    }

    @Test
    public void testFindFound() {
        Predicate<String> pred = new Predicate<String>() {
            public boolean evaluate(String obj) { return obj.equals("b"); }
        };
        assertEquals("b", CollectionUtils.find(collectionA, pred));
    }

    @Test
    public void testFindNotFound() {
        Predicate<String> pred = new Predicate<String>() {
            public boolean evaluate(String obj) { return obj.equals("zzz"); }
        };
        assertNull(CollectionUtils.find(collectionA, pred));
    }

    @Test
    public void testForAllDo() {
        final List<String> result = new ArrayList<String>();
        Closure<String> closure = new Closure<String>() {
            public void execute(String input) { result.add(input); }
        };
        CollectionUtils.forAllDo(collectionA, closure);
        assertEquals(3, result.size());
        assertTrue(result.contains("a"));
    }

    @Test
    public void testFilter() {
        Collection<String> coll = new ArrayList<String>(collectionA);
        Predicate<String> pred = new Predicate<String>() {
            public boolean evaluate(String obj) { return !obj.equals("b"); }
        };
        CollectionUtils.filter(coll, pred);
        assertEquals(2, coll.size());
        assertFalse(coll.contains("b"));
    }

    @Test
    public void testTransform() {
        List<String> list = new ArrayList<String>(collectionA);
        Transformer<String, String> transformer = new Transformer<String, String>() {
            public String transform(String input) { return input.toUpperCase(); }
        };
        CollectionUtils.transform(list, transformer);
        assertTrue(list.contains("A"));
        assertTrue(list.contains("B"));
        assertTrue(list.contains("C"));
    }

    @Test
    public void testCountMatches() {
        Predicate<String> pred = new Predicate<String>() {
            public boolean evaluate(String obj) { return obj.equals("a") || obj.equals("b"); }
        };
        assertEquals(2, CollectionUtils.countMatches(collectionA, pred));
    }

    @Test
    public void testExistsTrue() {
        Predicate<String> pred = new Predicate<String>() {
            public boolean evaluate(String obj) { return obj.equals("c"); }
        };
        assertTrue(CollectionUtils.exists(collectionA, pred));
    }

    @Test
    public void testExistsFalse() {
        Predicate<String> pred = new Predicate<String>() {
            public boolean evaluate(String obj) { return obj.equals("zzz"); }
        };
        assertFalse(CollectionUtils.exists(collectionA, pred));
    }

    @Test
    public void testSelect() {
        Predicate<String> pred = new Predicate<String>() {
            public boolean evaluate(String obj) { return obj.equals("a"); }
        };
        Collection<String> result = CollectionUtils.select(collectionA, pred);
        assertEquals(1, result.size());
        assertTrue(result.contains("a"));
    }

    @Test
    public void testSelectRejected() {
        Predicate<String> pred = new Predicate<String>() {
            public boolean evaluate(String obj) { return obj.equals("a"); }
        };
        Collection<String> result = CollectionUtils.selectRejected(collectionA, pred);
        assertEquals(2, result.size());
        assertFalse(result.contains("a"));
    }

    @Test
    public void testCollect() {
        Transformer<String, String> transformer = new Transformer<String, String>() {
            public String transform(String input) { return input + "!"; }
        };
        Collection<String> result = CollectionUtils.collect(collectionA, transformer);
        assertEquals(3, result.size());
        assertTrue(result.contains("a!"));
    }

    @Test
    public void testAddIgnoreNull() {
        Collection<String> coll = new ArrayList<String>();
        assertTrue(CollectionUtils.addIgnoreNull(coll, "a"));
        assertTrue(coll.contains("a"));
        assertFalse(CollectionUtils.addIgnoreNull(coll, null));
        assertEquals(1, coll.size());
    }

    @Test
    public void testAddAllIterator() {
        Collection<String> coll = new ArrayList<String>();
        CollectionUtils.addAll(coll, collectionA.iterator());
        assertEquals(3, coll.size());
    }

    @Test
    public void testAddAllEnumeration() {
        Vector<String> v = new Vector<String>();
        v.add("a"); v.add("b");
        Collection<String> coll = new ArrayList<String>();
        CollectionUtils.addAll(coll, v.elements());
        assertEquals(2, coll.size());
    }

    @Test
    public void testAddAllArray() {
        String[] arr = new String[] {"a", "b"};
        Collection<String> coll = new ArrayList<String>();
        CollectionUtils.addAll(coll, arr);
        assertEquals(2, coll.size());
    }

    @Test
    public void testIndexWithList() {
        List<String> list = new ArrayList<String>();
        list.add("a"); list.add("b"); list.add("c");
        assertEquals("a", CollectionUtils.index(list, 0));
        assertEquals("b", CollectionUtils.index(list, 1));
    }

    @Test
    public void testIndexWithNegative() {
        List<String> list = new ArrayList<String>();
        assertEquals(list, CollectionUtils.index(list, -1));
    }

    @Test
    public void testIndexWithArray() {
        String[] arr = new String[] {"a", "b"};
        assertEquals("a", CollectionUtils.index(arr, 0));
        assertEquals("b", CollectionUtils.index(arr, 1));
    }

    @Test
    public void testGetWithMap() {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("key", 100);
        assertEquals(new Integer(100), CollectionUtils.get(map, "key"));
    }

    @Test
    public void testGetWithList() {
        List<String> list = new ArrayList<String>();
        list.add("a"); list.add("b");
        assertEquals("a", CollectionUtils.get(list, 0));
    }

    @Test
    public void testGetWithArray() {
        String[] arr = new String[] {"a", "b"};
        assertEquals("b", CollectionUtils.get(arr, 1));
    }

    @Test
    public void testGetWithNullObject() {
        try {
            CollectionUtils.get(null, 0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Unsupported object type: null", e.getMessage());
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetWithNegativeIndex() {
        CollectionUtils.get(new String[] {"a"}, -1);
    }

    @Test
    public void testSizeWithCollection() {
        assertEquals(3, CollectionUtils.size(collectionA));
    }

    @Test
    public void testSizeWithArray() {
        String[] arr = new String[] {"a", "b", "c", "d"};
        assertEquals(4, CollectionUtils.size(arr));
    }

    @Test
    public void testSizeIsEmptyTrue() {
        assertTrue(CollectionUtils.sizeIsEmpty(emptyCollection));
        assertFalse(CollectionUtils.sizeIsEmpty(collectionA));
    }

    @Test
    public void testIsEmpty() {
        assertTrue(CollectionUtils.isEmpty(null));
        assertTrue(CollectionUtils.isEmpty(emptyCollection));
        assertFalse(CollectionUtils.isEmpty(collectionA));
    }

    @Test
    public void testIsNotEmpty() {
        assertFalse(CollectionUtils.isNotEmpty(null));
        assertFalse(CollectionUtils.isNotEmpty(emptyCollection));
        assertTrue(CollectionUtils.isNotEmpty(collectionA));
    }

    @Test
    public void testReverseArray() {
        String[] arr = new String[] {"a", "b", "c"};
        CollectionUtils.reverseArray(arr);
        assertEquals("c", arr[0]);
        assertEquals("b", arr[1]);
        assertEquals("a", arr[2]);
    }

    @Test
    public void testIsFullNull() {
        try {
            CollectionUtils.isFull(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testIsFullWithBoundedCollection() {
        assertFalse(CollectionUtils.isFull(collectionA));
    }

    @Test
    public void testIsFullWithUnboundedCollection() {
        Collection<String> coll = new ArrayList<String>();
        assertFalse(CollectionUtils.isFull(coll));
    }

    @Test
    public void testMaxSize() {
        Collection<String> coll = new ArrayList<String>();
        assertTrue(CollectionUtils.maxSize(coll) < 0);
    }

    @Test
    public void testRetainAll() {
        Collection<String> result = CollectionUtils.retainAll(collectionA, collectionB);
        assertEquals(2, result.size());
        assertTrue(result.contains("b"));
        assertTrue(result.contains("c"));
    }

    @Test
    public void testRemoveAll() {
        Collection<String> result = CollectionUtils.removeAll(collectionA, collectionB);
        assertEquals(1, result.size());
        assertTrue(result.contains("a"));
    }

    @Test
    public void testSynchronizedCollection() {
        Collection<String> synced = CollectionUtils.synchronizedCollection(collectionA);
        assertNotNull(synced);
        assertEquals(3, synced.size());
    }

    @Test
    public void testUnmodifiableCollection() {
        Collection<String> unmod = CollectionUtils.unmodifiableCollection(collectionA);
        assertNotNull(unmod);
        assertEquals(3, unmod.size());
        try {
            unmod.add("x");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    @Test
    public void testPredicatedCollection() {
        Predicate<String> pred = new Predicate<String>() {
            public boolean evaluate(String obj) { return obj.length() > 1; }
        };
        Collection<String> coll = CollectionUtils.predicatedCollection(collectionA, pred);
        assertEquals(3, coll.size());
    }

    @Test
    public void testTypedCollection() {
        Collection<String> typed = CollectionUtils.typedCollection(collectionA, String.class);
        assertNotNull(typed);
    }

    @Test
    public void testTransformedCollection() {
        Transformer<String, String> transformer = new Transformer<String, String>() {
            public String transform(String input) { return input + "!"; }
        };
        Collection<String> transformed = CollectionUtils.transformedCollection(collectionA, transformer);
        assertNotNull(transformed);
    }
}