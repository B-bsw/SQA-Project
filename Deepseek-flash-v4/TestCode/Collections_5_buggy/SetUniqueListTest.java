package org.apache.commons.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SetUniqueListTest {

    private List<String> list;
    private SetUniqueList uniqueList;

    @Before
    public void setUp() {
        list = new ArrayList<String>();
        uniqueList = new SetUniqueList(list, new HashSet<String>());
    }

    // ---------- decorate() ----------
    @Test
    public void testDecorateNullList() {
        try {
            SetUniqueList.decorate(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("List must not be null", e.getMessage());
        }
    }

    @Test
    public void testDecorateEmptyList() {
        List<String> decoratedList = SetUniqueList.decorate(new LinkedList<String>());
        assertNotNull(decoratedList);
        assertEquals(0, decoratedList.size());
    }

    @Test
    public void testDecorateWithDuplicates() {
        List<String> input = new ArrayList<String>();
        input.add("b");
        input.add("a");
        input.add("b");
        List<String> temp = new ArrayList<String>(input);
        SetUniqueList result = SetUniqueList.decorate(input);
        assertEquals(2, result.size());
        assertEquals("b", result.get(0));
        assertEquals("a", result.get(1));
        assertTrue(result.containsAll(Arrays.asList("a", "b")));
    }

    // ---------- add(Object) ----------
    @Test
    public void testAddUnique() {
        assertTrue(uniqueList.add("A"));
        assertEquals(1, uniqueList.size());
        assertTrue(uniqueList.contains("A"));
    }

    @Test
    public void testAddDuplicate() {
        uniqueList.add("A");
        assertFalse(uniqueList.add("A"));
        assertEquals(1, uniqueList.size());
        assertTrue(uniqueList.contains("A"));
    }

    // ---------- add(int, Object) ----------
    @Test
    public void testAddAtIndexUnique() {
        uniqueList.add("A");
        uniqueList.add("B");
        uniqueList.add(1, "C");
        assertEquals(3, uniqueList.size());
        assertEquals("C", uniqueList.get(1));
        assertEquals("A", uniqueList.get(0));
        assertEquals("B", uniqueList.get(2));
    }

    @Test
    public void testAddAtIndexDuplicate() {
        uniqueList.add("A");
        uniqueList.add("B");
        uniqueList.add(1, "A");
        assertEquals(2, uniqueList.size());
        assertEquals("A", uniqueList.get(0));
        assertEquals("B", uniqueList.get(1));
    }

    // ---------- addAll(Collection) ----------
    @Test
    public void testAddAllEmptyCollection() {
        assertFalse(uniqueList.addAll(new ArrayList<String>()));
        assertEquals(0, uniqueList.size());
    }

    @Test
    public void testAddAllUnique() {
        List<String> coll = Arrays.asList("A", "B", "C");
        assertTrue(uniqueList.addAll(coll));
        assertEquals(3, uniqueList.size());
        assertTrue(uniqueList.containsAll(Arrays.asList("A", "B", "C")));
    }

    @Test
    public void testAddAllWithDuplicatesInColl() {
        List<String> coll = Arrays.asList("A", "A", "B");
        assertTrue(uniqueList.addAll(coll));
        assertEquals(2, uniqueList.size());
        assertTrue(uniqueList.contains("A"));
        assertTrue(uniqueList.contains("B"));
    }

    @Test
    public void testAddAllWithDuplicatesInList() {
        uniqueList.add("A");
        uniqueList.add("B");
        List<String> coll = Arrays.asList("B", "C");
        assertTrue(uniqueList.addAll(coll));
        assertEquals(3, uniqueList.size());
        assertTrue(uniqueList.contains("C"));
    }

    // ---------- addAll(int, Collection) ----------
    @Test
    public void testAddAllAtIndexEmpty() {
        uniqueList.add("A");
        assertFalse(uniqueList.addAll(1, new ArrayList<String>()));
        assertEquals(1, uniqueList.size());
    }

    @Test
    public void testAddAllAtIndexWithDuplicates() {
        uniqueList.add("A");
        uniqueList.add("C");
        List<String> coll = Arrays.asList("C", "B");
        assertTrue(uniqueList.addAll(1, coll));
        assertEquals(3, uniqueList.size());
        assertEquals("A", uniqueList.get(0));
        assertEquals("B", uniqueList.get(1));
        assertEquals("C", uniqueList.get(2));
    }

    // ---------- set() ----------
    @Test
    public void testSetUnique() {
        uniqueList.add("A");
        uniqueList.add("B");
        Object old = uniqueList.set(1, "C");
        assertEquals("B", old);
        assertEquals(2, uniqueList.size());
        assertEquals("C", uniqueList.get(1));
    }

    @Test
    public void testSetDuplicate() {
        uniqueList.add("A");
        uniqueList.add("B");
        uniqueList.add("C");
        Object old = uniqueList.set(2, "A");
        assertEquals("C", old);
        assertEquals(2, uniqueList.size());
        assertTrue(uniqueList.contains("A"));
        assertTrue(uniqueList.contains("B"));
    }

    @Test
    public void testSetDuplicateSameIndex() {
        uniqueList.add("A");
        uniqueList.add("B");
        Object old = uniqueList.set(1, "B");
        assertEquals("B", old);
        assertEquals(2, uniqueList.size());
        assertEquals("B", uniqueList.get(1));
    }

    // ---------- remove(Object) ----------
    @Test
    public void testRemoveExisting() {
        uniqueList.add("A");
        uniqueList.add("B");
        assertTrue(uniqueList.remove("A"));
        assertEquals(1, uniqueList.size());
        assertFalse(uniqueList.contains("A"));
    }

    @Test
    public void testRemoveNonExistent() {
        uniqueList.add("A");
        assertFalse(uniqueList.remove("X"));
        assertEquals(1, uniqueList.size());
    }

    // ---------- remove(int) ----------
    @Test
    public void testRemoveAtIndex() {
        uniqueList.add("A");
        uniqueList.add("B");
        uniqueList.add("C");
        Object removed = uniqueList.remove(1);
        assertEquals("B", removed);
        assertEquals(2, uniqueList.size());
        assertFalse(uniqueList.contains("B"));
    }

    // ---------- removeAll(Collection) ----------
    @Test
    public void testRemoveAll() {
        uniqueList.add("A");
        uniqueList.add("B");
        uniqueList.add("C");
        assertTrue(uniqueList.removeAll(Arrays.asList("B", "D")));
        assertEquals(2, uniqueList.size());
        assertTrue(uniqueList.contains("A"));
        assertTrue(uniqueList.contains("C"));
    }

    @Test
    public void testRemoveAllNonExistent() {
        uniqueList.add("A");
        assertFalse(uniqueList.removeAll(Arrays.asList("X", "Y")));
        assertEquals(1, uniqueList.size());
    }

    // ---------- retainAll(Collection) ----------
    @Test
    public void testRetainAll() {
        uniqueList.add("A");
        uniqueList.add("B");
        uniqueList.add("C");
        assertTrue(uniqueList.retainAll(Arrays.asList("B", "C", "D")));
        assertEquals(2, uniqueList.size());
        assertFalse(uniqueList.contains("A"));
        assertTrue(uniqueList.contains("B"));
        assertTrue(uniqueList.contains("C"));
    }

    @Test
    public void testRetainAllNoChange() {
        uniqueList.add("A");
        uniqueList.add("B");
        assertFalse(uniqueList.retainAll(Arrays.asList("A", "B", "C")));
        assertEquals(2, uniqueList.size());
    }

    // ---------- clear(), contains(), containsAll() ----------
    @Test
    public void testClear() {
        uniqueList.add("A");
        uniqueList.add("B");
        uniqueList.clear();
        assertTrue(uniqueList.isEmpty());
        assertFalse(uniqueList.contains("A"));
        assertFalse(uniqueList.containsAll(Arrays.asList("A")));
    }

    @Test
    public void testContainsWithSetSynchronization() {
        uniqueList.add("A");
        uniqueList.add("B");
        assertTrue(uniqueList.contains("A"));
        assertTrue(uniqueList.containsAll(Arrays.asList("A", "B")));
        assertFalse(uniqueList.contains("C"));
        assertFalse(uniqueList.containsAll(Arrays.asList("A", "X")));
    }

    // ---------- iterator() and listIterator() ----------
    @Test
    public void testIteratorRemove() {
        uniqueList.add("A");
        uniqueList.add("B");
        uniqueList.add("C");
        Iterator<String> it = uniqueList.iterator();
        it.next();
        it.remove();
        assertEquals(2, uniqueList.size());
        assertFalse(uniqueList.contains("A"));
        assertTrue(uniqueList.contains("B"));
        assertTrue(uniqueList.contains("C"));
    }

    @Test
    public void testListIteratorRemove() {
        uniqueList.add("A");
        uniqueList.add("B");
        uniqueList.add("C");
        ListIterator<String> lit = uniqueList.listIterator();
        lit.next();
        lit.remove();
        assertEquals(2, uniqueList.size());
        assertFalse(uniqueList.contains("A"));
    }

    @Test
    public void testListIteratorAddUnique() {
        uniqueList.add("A");
        uniqueList.add("C");
        ListIterator<String> lit = uniqueList.listIterator();
        lit.next();
        lit.add("B");
        assertEquals(3, uniqueList.size());
        assertTrue(uniqueList.contains("B"));
    }

    @Test
    public void testListIteratorAddDuplicate() {
        uniqueList.add("A");
        uniqueList.add("C");
        ListIterator<String> lit = uniqueList.listIterator();
        lit.next();
        lit.add("A");
        assertEquals(2, uniqueList.size());
        assertFalse(uniqueList.contains("X"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testListIteratorSetUnsupported() {
        uniqueList.add("A");
        uniqueList.add("B");
        ListIterator<String> lit = uniqueList.listIterator();
        lit.next();
        lit.set("X");
    }

    @Test
    public void testListIteratorPrevious() {
        uniqueList.add("A");
        uniqueList.add("B");
        ListIterator<String> lit = uniqueList.listIterator(1);
        assertEquals("B", lit.previous());
        lit.remove();
        assertEquals(1, uniqueList.size());
        assertFalse(uniqueList.contains("B"));
    }

    // ---------- subList() ----------
    @Test
    public void testSubList() {
        uniqueList.add("A");
        uniqueList.add("B");
        uniqueList.add("C");
        SetUniqueList sub = (SetUniqueList) uniqueList.subList(1, 3);
        assertEquals(2, sub.size());
        assertEquals("B", sub.get(0));
        assertEquals("C", sub.get(1));
    }

    // ---------- asSet() ----------
    @Test
    public void testAsSetUnmodifiable() {
        uniqueList.add("A");
        uniqueList.add("B");
        Set<String> setView = (Set<String>) uniqueList.asSet();
        assertNotNull(setView);
        assertTrue(setView.contains("A"));
        assertEquals(2, setView.size());
        try {
            setView.add("C");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testAsSetReflectsChanges() {
        uniqueList.add("A");
        Set<String> setView = (Set<String>) uniqueList.asSet();
        uniqueList.add("B");
        assertTrue(setView.contains("B"));
        uniqueList.remove("A");
        assertFalse(setView.contains("A"));
    }
}