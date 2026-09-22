package org.apache.commons.collections.set;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class ListOrderedSetTest {

    @Test
    public void testListOrderedSetAndAddInOrder() {
        ListOrderedSet<String> set = ListOrderedSet.listOrderedSet(new HashSet<String>());
        set.add("a");
        set.add("b");
        set.add("c");
        assertEquals("[a, b, c]", set.toString());
        assertEquals(3, set.size());
    }

    @Test
    public void testAddDuplicateDoesNotChangeOrder() {
        ListOrderedSet<String> set = new ListOrderedSet<String>(new HashSet<String>());
        set.add("x");
        set.add("y");
        set.add("x");
        assertEquals("[x, y]", set.toString());
        assertEquals(2, set.size());
    }

    @Test
    public void testAddRejectsNull() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        assertFalse(set.add(null));
        assertEquals(0, set.size());
    }

    @Test
    public void testAddRejectsNullCollection() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        try {
            set.addAll(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testAddAllAtEnd() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        List<String> coll = Arrays.asList("a", "b", "c");
        assertTrue(set.addAll(coll));
        assertEquals("[a, b, c]", set.toString());
    }

    @Test
    public void testAddAllAtBeginning() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("x");
        set.add("y");
        List<String> coll = Arrays.asList("1", "2");
        assertTrue(set.addAll(0, coll));
        assertEquals("[1, 2, x, y]", set.toString());
    }

    @Test
    public void testAddAllAtMiddle() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("a");
        set.add("b");
        set.add("c");
        List<String> coll = Arrays.asList("z");
        assertTrue(set.addAll(1, coll));
        assertEquals("[a, z, b, c]", set.toString());
    }

    @Test
    public void testAddAllAtInvalidIndex() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        try {
            set.addAll(1, Arrays.asList("a"));
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testRemoveByObject() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("a");
        set.add("b");
        set.add("c");
        assertTrue(set.remove("b"));
        assertEquals("[a, c]", set.toString());
    }

    @Test
    public void testRemoveNonExistent() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("a");
        assertFalse(set.remove("zzz"));
        assertEquals("[a]", set.toString());
    }

    @Test
    public void testRemoveByIndex() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("a");
        set.add("b");
        set.add("c");
        assertEquals("b", set.remove(1));
        assertEquals("[a, c]", set.toString());
    }

    @Test
    public void testRemoveByIndexOutOfBounds() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("a");
        try {
            set.remove(5);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testClear() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("a");
        set.add("b");
        set.clear();
        assertTrue(set.isEmpty());
        assertTrue(set.setOrder.isEmpty());
        assertEquals(0, set.size());
    }

    @Test
    public void testToList() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("a");
        set.add("b");
        List<String> list = set.asList();
        assertEquals("[a, b]", list.toString());
        try {
            list.add("z");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testIteratorRemove() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("a");
        set.add("b");
        set.add("c");
        Iterator<String> it = set.iterator();
        it.next();
        it.remove();
        assertEquals("[b, c]", set.toString());
        assertEquals(2, set.size());
    }

    @Test
    public void testGet() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("a");
        set.add("b");
        assertEquals("a", set.get(0));
        assertEquals("b", set.get(1));
    }

    @Test
    public void testIndexOf() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("a");
        set.add("b");
        assertEquals(0, set.indexOf("a"));
        assertEquals(1, set.indexOf("b"));
        assertEquals(-1, set.indexOf("zzz"));
    }

    @Test
    public void testRetainAllEmpty() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("a");
        set.add("b");
        assertTrue(set.retainAll(new ArrayList<String>()));
        assertTrue(set.isEmpty());
        assertTrue(set.setOrder.isEmpty());
    }

    @Test
    public void testRetainAllSameElements() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("a");
        set.add("b");
        assertFalse(set.retainAll(Arrays.asList("a", "b")));
        assertEquals("[a, b]", set.toString());
    }

    @Test
    public void testRetainAllSubset() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("a");
        set.add("b");
        set.add("c");
        assertTrue(set.retainAll(Arrays.asList("b")));
        assertEquals("[b]", set.toString());
    }

    @Test
    public void testRemoveAll() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("a");
        set.add("b");
        set.add("c");
        assertTrue(set.removeAll(Arrays.asList("a", "c")));
        assertEquals("[b]", set.toString());
    }

    @Test
    public void testRemoveAllEmptyColl() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("a");
        set.add("b");
        assertFalse(set.removeAll(new ArrayList<String>()));
        assertEquals("[a, b]", set.toString());
    }

    @Test
    public void testToArray() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("a");
        set.add("b");
        Object[] array = set.toArray();
        assertEquals(2, array.length);
        assertArrayEquals(new Object[]{"a", "b"}, array);
    }

    @Test
    public void testToArrayT() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("a");
        set.add("b");
        String[] array = set.toArray(new String[0]);
        assertArrayEquals(new String[]{"a", "b"}, array);
    }

    @Test
    public void testToArrayTWithLargerArray() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("a");
        String[] array = set.toArray(new String[]{"x", "y", "z"});
        assertArrayEquals(new String[]{"a", null, "z"}, array);
    }

    @Test
    public void testAddAllDuplicateElementsInColl() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        List<String> coll = Arrays.asList("a", "b", "a", "c");
        assertTrue(set.addAll(coll));
        assertEquals("[a, b, c]", set.toString());
    }

    @Test
    public void testAddAllAtNonZeroIndexWithDuplicates() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("x");
        set.add("y");
        List<String> coll = Arrays.asList("a", "b", "a");
        assertTrue(set.addAll(1, coll));
        assertEquals("[x, a, b, y]", set.toString());
    }

    @Test
    public void testAddAllAtNonZeroIndexAllDuplicates() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("a");
        set.add("b");
        List<String> coll = Arrays.asList("a", "b");
        assertFalse(set.addAll(0, coll));
        assertEquals("[a, b]", set.toString());
    }

    @Test
    public void testListOrderedSetFactoryWithEmptySetAndList() {
        ListOrderedSet<String> set = ListOrderedSet.listOrderedSet(new HashSet<String>(), new ArrayList<String>());
        assertNotNull(set);
    }

    @Test
    public void testListOrderedSetFactorySetNull() {
        try {
            ListOrderedSet.listOrderedSet(null, new ArrayList<String>());
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Set must not be null", e.getMessage());
        }
    }

    @Test
    public void testListOrderedSetFactoryListNull() {
        try {
            ListOrderedSet.listOrderedSet(new HashSet<String>(), null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("List must not be null", e.getMessage());
        }
    }

    @Test
    public void testListOrderedSetFactorySetNotEmpty() {
        Set<String> set = new HashSet<String>();
        set.add("a");
        try {
            ListOrderedSet.listOrderedSet(set, new ArrayList<String>());
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Set and List must be empty", e.getMessage());
        }
    }

    @Test
    public void testListOrderedSetFactoryListNotEmpty() {
        List<String> list = Arrays.asList("a");
        try {
            ListOrderedSet.listOrderedSet(new HashSet<String>(), list);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Set and List must be empty", e.getMessage());
        }
    }

    @Test
    public void testListOrderedSetProtectedConstructorWithNullList() {
        try {
            new ListOrderedSet<String>(new HashSet<String>(), null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("List must not be null", e.getMessage());
        }
    }

    @Test
    public void testListOrderedSetFactoryWithList() {
        List<String> list = Arrays.asList("a", "b", "c");
        ListOrderedSet<String> set = ListOrderedSet.listOrderedSet(list);
        assertEquals("[a, b, c]", set.toString());
    }

    @Test
    public void testListOrderedSetFactoryWithListDuplicatesRemoved() {
        List<String> list = Arrays.asList("a", "b", "a", "c");
        ListOrderedSet<String> set = ListOrderedSet.listOrderedSet(list);
        assertEquals("[a, b, c]", set.toString());
        assertEquals("[a, b, c]", list.toString()); // altered list
    }

    @Test
    public void testListOrderedSetFactoryWithNullList() {
        try {
            ListOrderedSet.listOrderedSet((List<String>) null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("List must not be null", e.getMessage());
        }
    }

    @Test
    public void testIteratorHasPrevious() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("a");
        set.add("b");
        OrderedSetIterator<String> it = new OrderedSetIterator<>(set.setOrder.listIterator(), set);
        assertFalse(it.hasPrevious());
        assertEquals("a", it.next());
        assertTrue(it.hasPrevious());
        assertEquals("a", it.previous());
    }

    @Test
    public void testIteratorPreviousAndLastCleared() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("a");
        set.add("b");
        OrderedSetIterator<String> it = new OrderedSetIterator<>(set.setOrder.listIterator(), set);
        assertEquals("a", it.next());
        assertEquals("a", it.previous());
        assertEquals("a", it.previous()); // last is now "a"
        it.remove();
        assertEquals(1, set.size());
        assertEquals("[b]", set.setOrder.toString());
    }

    @Test
    public void testIteratorRemoveClearsLast() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("a");
        set.add("b");
        OrderedSetIterator<String> it = new OrderedSetIterator<>(set.setOrder.listIterator(), set);
        it.next();
        it.remove();
        assertEquals(1, set.size());
        assertEquals("[b]", set.setOrder.toString());
    }

    @Test
    public void testRetainAllClearsSetOrderWhenEmpty() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("a");
        set.add("b");
        set.retainAll(new ArrayList<String>());
        assertTrue(set.setOrder.isEmpty());
        assertTrue(set.collection.isEmpty());
    }

    @Test
    public void testRetainAllNonNullCollection() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("a");
        set.add("b");
        assertTrue(set.retainAll(Arrays.asList("a")));
        assertEquals("[a]", set.toString());
    }

    @Test
    public void testAddAllWithNullCollection() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        try {
            set.addAll(0, null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testAddAllWithSelfCollection() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("a");
        ListOrderedSet<String> other = new ListOrderedSet<String>();
        other.add("b");
        assertTrue(set.addAll(other.collection));
        assertEquals("[a, b]", set.toString());
        assertTrue(other.collection.isEmpty() == false);
    }
}