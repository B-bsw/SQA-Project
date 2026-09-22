package org.apache.commons.collections4.list;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class SetUniqueListTest {

    private SetUniqueList<String> list;
    private List<String> baseList;

    @Before
    public void setUp() {
        baseList = new ArrayList<>();
        list = SetUniqueList.setUniqueList(baseList);
    }

    @Test
    public void testSetUniqueListNull() {
        try {
            SetUniqueList.setUniqueList(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("List must not be null", e.getMessage());
        }
    }

    @Test
    public void testSetUniqueListEmpty() {
        List<String> emptyList = new ArrayList<>();
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(emptyList);
        assertNotNull(uniqueList);
        assertTrue(uniqueList.isEmpty());
    }

    @Test
    public void testSetUniqueListWithDuplicates() {
        List<String> duplicatedList = new ArrayList<>(Arrays.asList("a", "b", "a", "c", "b"));
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(duplicatedList);
        assertEquals(3, uniqueList.size());
        assertEquals(Arrays.asList("a", "b", "c"), uniqueList);
    }

    @Test
    public void testAddNewElement() {
        assertTrue(list.add("a"));
        assertEquals(1, list.size());
        assertTrue(list.contains("a"));
    }

    @Test
    public void testAddDuplicate() {
        list.add("a");
        assertFalse(list.add("a"));
        assertEquals(1, list.size());
    }

    @Test
    public void testAddByIndexNewElement() {
        list.add("a");
        list.add("c");
        list.add(1, "b");
        assertEquals(Arrays.asList("a", "b", "c"), list);
        assertTrue(list.contains("b"));
    }

    @Test
    public void testAddByIndexDuplicate() {
        list.add("a");
        list.add("b");
        list.add(1, "a");
        assertEquals(2, list.size());
        assertEquals(Arrays.asList("a", "b"), list);
    }

    @Test
    public void testAddAllNewCollection() {
        list.add("a");
        Collection<String> coll = Arrays.asList("b", "c");
        assertTrue(list.addAll(coll));
        assertEquals(3, list.size());
        assertTrue(list.containsAll(coll));
    }

    @Test
    public void testAddAllWithDuplicates() {
        list.add("a");
        Collection<String> coll = Arrays.asList("a", "b", "a");
        assertTrue(list.addAll(coll));
        assertEquals(2, list.size());
        assertTrue(list.contains("a"));
        assertTrue(list.contains("b"));
    }

    @Test
    public void testAddAllAtIndex() {
        list.add("a");
        list.add("d");
        Collection<String> coll = Arrays.asList("b", "c");
        assertTrue(list.addAll(1, coll));
        assertEquals(4, list.size());
        assertEquals(Arrays.asList("a", "b", "c", "d"), list);
    }

    @Test
    public void testSetNewObject() {
        list.add("a");
        list.add("b");
        String old = list.set(1, "c");
        assertEquals("b", old);
        assertTrue(list.contains("c"));
        assertFalse(list.contains("b"));
    }

    @Test
    public void testSetDuplicateDifferentIndex() {
        list.add("a");
        list.add("b");
        list.add("c");
        String old = list.set(1, "a");
        assertEquals("b", old);
        assertTrue(list.contains("a"));
        assertEquals(2, list.size());
        assertEquals(Arrays.asList("a", "c"), list);
    }

    @Test
    public void testSetSameIndex() {
        list.add("a");
        list.add("b");
        String old = list.set(0, "a");
        assertEquals("a", old);
        assertEquals(2, list.size());
        assertEquals(Arrays.asList("a", "b"), list);
    }

    @Test
    public void testRemoveObject() {
        list.add("a");
        list.add("b");
        assertTrue(list.remove("a"));
        assertFalse(list.contains("a"));
        assertTrue(list.contains("b"));
        assertEquals(1, list.size());
    }

    @Test
    public void testRemoveNonExistentObject() {
        list.add("a");
        assertFalse(list.remove("b"));
        assertEquals(1, list.size());
    }

    @Test
    public void testRemoveByIndex() {
        list.add("a");
        list.add("b");
        String removed = list.remove(1);
        assertEquals("b", removed);
        assertFalse(list.contains("b"));
        assertTrue(list.contains("a"));
        assertEquals(1, list.size());
    }

    @Test
    public void testRemoveAllWithOverlap() {
        list.add("a");
        list.add("b");
        list.add("c");
        Collection<String> coll = Arrays.asList("a", "c");
        assertTrue(list.removeAll(coll));
        assertEquals(1, list.size());
        assertTrue(list.contains("b"));
    }

    @Test
    public void testRemoveAllNoOverlap() {
        list.add("a");
        list.add("b");
        Collection<String> coll = Arrays.asList("c", "d");
        assertFalse(list.removeAll(coll));
        assertEquals(2, list.size());
    }

    @Test
    public void testRetainAllWithOverlap() {
        list.add("a");
        list.add("b");
        list.add("c");
        Collection<String> coll = Arrays.asList("a", "c", "d");
        assertTrue(list.retainAll(coll));
        assertEquals(2, list.size());
        assertTrue(list.contains("a"));
        assertTrue(list.contains("c"));
    }

    @Test
    public void testRetainAllKeepAll() {
        list.add("a");
        list.add("b");
        Collection<String> coll = Arrays.asList("a", "b");
        assertFalse(list.retainAll(coll));
        assertEquals(2, list.size());
    }

    @Test
    public void testRetainAllClearAll() {
        list.add("a");
        list.add("b");
        Collection<String> coll = Arrays.asList("c");
        assertTrue(list.retainAll(coll));
        assertTrue(list.isEmpty());
    }

    @Test
    public void testClear() {
        list.add("a");
        list.add("b");
        list.clear();
        assertTrue(list.isEmpty());
        assertTrue(list.asSet().isEmpty());
    }

    @Test
    public void testContains() {
        list.add("a");
        assertTrue(list.contains("a"));
        assertFalse(list.contains("b"));
    }

    @Test
    public void testContainsAll() {
        list.add("a");
        list.add("b");
        assertTrue(list.containsAll(Arrays.asList("a", "b")));
        assertFalse(list.containsAll(Arrays.asList("a", "c")));
    }

    @Test
    public void testAsSet() {
        list.add("a");
        list.add("b");
        Set<String> set = list.asSet();
        assertEquals(2, set.size());
        try {
            set.add("c");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    @Test
    public void testIteratorRemove() {
        list.add("a");
        list.add("b");
        list.add("c");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().equals("b")) {
                it.remove();
                break;
            }
        }
        assertEquals(2, list.size());
        assertFalse(list.contains("b"));
        assertTrue(list.contains("a"));
        assertTrue(list.contains("c"));
    }

    @Test
    public void testListIteratorRemove() {
        list.add("a");
        list.add("b");
        list.add("c");
        ListIterator<String> it = list.listIterator();
        while (it.hasNext()) {
            if (it.next().equals("b")) {
                it.remove();
                break;
            }
        }
        assertEquals(2, list.size());
        assertFalse(list.contains("b"));
    }

    @Test
    public void testListIteratorAddNewElement() {
        list.add("a");
        list.add("c");
        ListIterator<String> it = list.listIterator();
        it.next();
        it.add("b");
        assertEquals(3, list.size());
        assertTrue(list.contains("b"));
    }

    @Test
    public void testListIteratorAddDuplicate() {
        list.add("a");
        list.add("c");
        ListIterator<String> it = list.listIterator();
        it.next();
        it.add("a");
        assertEquals(2, list.size());
    }

    @Test
    public void testListIteratorAtLastPosition() {
        list.add("a");
        ListIterator<String> it = list.listIterator(list.size());
        assertFalse(it.hasNext());
        assertTrue(it.hasPrevious());
        assertEquals("a", it.previous());
    }

    @Test
    public void testLeftIndexListIteratorDuplicate() {
        list.add("a");
        list.add("b");
        ListIterator<String> it = list.listIterator();
        it.next();
        it.next();
        try {
            it.set("a");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    @Test
    public void testSubList() {
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        List<String> subList = list.subList(1, 3);
        assertEquals(2, subList.size());
        assertEquals(Arrays.asList("b", "c"), subList);
    }

    @Test
    public void testCreateSetBasedOnListHashSet() {
        Set<String> set = new HashSet<>();
        set.add("a");
        List<String> listContent = Arrays.asList("a", "b", "c");
        Set<String> result = list.createSetBasedOnList(set, listContent);
        assertEquals(3, result.size());
        assertTrue(result.contains("a"));
        assertTrue(result.contains("b"));
        assertTrue(result.contains("c"));
    }
}