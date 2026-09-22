package org.apache.commons.collections.list;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import static org.junit.Assert.*;

public class SetUniqueListTest {

    private SetUniqueList<String> list;

    @Before
    public void setUp() {
        list = SetUniqueList.setUniqueList(new ArrayList<String>());
    }

    @Test
    public void testSetUniqueListFactoryWithNull() {
        try {
            SetUniqueList.setUniqueList(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("List must not be null", e.getMessage());
        }
    }

    @Test
    public void testSetUniqueListFactoryWithEmptyList() {
        SetUniqueList<String> emptyList = SetUniqueList.setUniqueList(new ArrayList<String>());
        assertTrue(emptyList.isEmpty());
    }

    @Test
    public void testSetUniqueListFactoryWithDuplicates() {
        List<String> input = new ArrayList<String>(Arrays.asList("A", "B", "A", "C", "B"));
        SetUniqueList<String> result = SetUniqueList.setUniqueList(input);
        assertEquals(3, result.size());
        assertTrue(result.contains("A"));
        assertTrue(result.contains("B"));
        assertTrue(result.contains("C"));
    }

    @Test
    public void testAddDuplicateAndUniqueElements() {
        assertTrue(list.add("A"));
        assertFalse(list.add("A"));
        assertTrue(list.add("B"));
        assertEquals(2, list.size());
    }

    @Test
    public void testAddAtIndexDuplicate() {
        list.add("A");
        list.add("B");
        list.add(0, "A");
        assertEquals(Arrays.asList("A", "B"), list);
        list.add(1, "C");
        assertEquals(3, list.size());
        assertEquals("C", list.get(1));
    }

    @Test
    public void testAddAllAvoidsDuplicates() {
        list.add("A");
        Collection<String> coll = Arrays.asList("B", "A", "C");
        assertTrue(list.addAll(coll));
        assertEquals(3, list.size());
        assertTrue(list.containsAll(Arrays.asList("A", "B", "C")));
    }

    @Test
    public void testAddAllAtIndex() {
        list.addAll(Arrays.asList("A", "B", "C"));
        Collection<String> coll = Arrays.asList("D", "B", "E");
        assertTrue(list.addAll(1, coll));
        assertEquals(5, list.size());
        assertEquals("D", list.get(1));
        assertFalse(list.contains("B") || list.indexOf("B") != 2);
    }

    @Test
    public void testSetUniqueValue() {
        list.add("A");
        list.add("B");
        String previous = list.set(1, "C");
        assertEquals("B", previous);
        assertEquals(Arrays.asList("A", "C"), list);
    }

    @Test
    public void testSetDuplicateValue() {
        list.add("A");
        list.add("B");
        list.add("C");
        String previous = list.set(1, "A");
        assertEquals("B", previous);
        assertEquals(2, list.size());
        assertTrue(list.contains("A"));
        assertFalse(list.contains("B"));
    }

    @Test
    public void testSetDuplicateAtIndex() {
        list.add("A");
        list.add("B");
        String previous = list.set(1, "B");
        assertEquals("B", previous);
        assertEquals(2, list.size());
        assertEquals("B", list.get(1));
    }

    @Test
    public void testRemoveObject() {
        list.add("A");
        list.add("B");
        assertTrue(list.remove("A"));
        assertFalse(list.remove("C"));
        assertEquals(1, list.size());
    }

    @Test
    public void testRemoveIndex() {
        list.add("A");
        list.add("B");
        String removed = list.remove(0);
        assertEquals("A", removed);
        assertEquals(1, list.size());
    }

    @Test
    public void testRemoveAllAndRetainAll() {
        list.addAll(Arrays.asList("A", "B", "C", "D"));
        assertTrue(list.removeAll(Arrays.asList("B", "E")));
        assertEquals(Arrays.asList("A", "C", "D"), list);
        assertTrue(list.retainAll(Arrays.asList("C", "D", "E")));
        assertEquals(Arrays.asList("C", "D"), list);
    }

    @Test
    public void testRetainAllWithNoChanges() {
        list.addAll(Arrays.asList("A", "B"));
        assertFalse(list.retainAll(Arrays.asList("A", "B", "C")));
        assertEquals(2, list.size());
    }

    @Test
    public void testRetainAllWithNoCommonValues() {
        list.addAll(Arrays.asList("A", "B"));
        assertTrue(list.retainAll(Arrays.asList("C")));
        assertEquals(0, list.size());
    }

    @Test
    public void testClearAndContains() {
        list.add("A");
        list.clear();
        assertTrue(list.isEmpty());
        assertFalse(list.contains("A"));
    }

    @Test
    public void testContainsAll() {
        list.addAll(Arrays.asList("A", "B"));
        assertTrue(list.containsAll(Arrays.asList("A", "B")));
        assertFalse(list.containsAll(Arrays.asList("A", "C")));
    }

    @Test
    public void testAsSet() {
        list.add("A");
        list.add("B");
        Set<String> set = list.asSet();
        assertTrue(set.containsAll(Arrays.asList("A", "B")));
        try {
            set.add("C");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testIterator() {
        list.addAll(Arrays.asList("A", "B", "C"));
        Iterator<String> it = list.iterator();
        assertTrue(it.hasNext());
        assertEquals("A", it.next());
        it.remove();
        assertEquals(2, list.size());
        assertFalse(list.contains("A"));
    }

    @Test
    public void testListIteratorBasic() {
        list.addAll(Arrays.asList("A", "B", "C"));
        ListIterator<String> it = list.listIterator();
        assertTrue(it.hasNext());
        assertEquals("A", it.next());
        it.add("X");
        assertEquals(Arrays.asList("A", "X", "B", "C"), list);
    }

    @Test
    public void testListIteratorIndex() {
        list.addAll(Arrays.asList("A", "B", "C"));
        ListIterator<String> it = list.listIterator(1);
        assertEquals("B", it.next());
        it.previous();
        it.remove();
        assertEquals(Arrays.asList("A", "C"), list);
    }

    @Test
    public void testListIteratorSetUnsupported() {
        list.addAll(Arrays.asList("A", "B"));
        ListIterator<String> it = list.listIterator();
        it.next();
        try {
            it.set("Z");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testSubList() {
        list.addAll(Arrays.asList("A", "B", "C", "D"));
        SetUniqueList<String> subList = list.subList(1, 3);
        assertEquals(2, subList.size());
        assertTrue(subList.containsAll(Arrays.asList("B", "C")));
        subList.add("E");
        assertEquals(5, list.size());
        assertTrue(list.contains("E"));
    }

    @Test
    public void testCreateSetBasedOnListWithHashSet() {
        Set<String> set = new HashSet<String>(Arrays.asList("A", "B"));
        List<String> newList = new ArrayList<String>(Arrays.asList("B", "C"));
        Set<String> result = list.createSetBasedOnList(set, newList);
        assertTrue(result.containsAll(Arrays.asList("B", "C")));
    }

    @Test
    public void testListIteratorPreviousWithDuplicateRemoval() {
        list.addAll(Arrays.asList("A", "B", "C"));
        ListIterator<String> it = list.listIterator(2);
        it.previous();
        it.remove();
        assertFalse(list.contains("B"));
    }

    @Test
    public void testAddAllEmptyCollection() {
        list.addAll(Arrays.asList("A", "B"));
        assertFalse(list.addAll(new ArrayList<String>()));
        assertEquals(2, list.size());
    }

    @Test
    public void testAddAllWithAllDuplicates() {
        list.add("A");
        list.add("B");
        assertFalse(list.addAll(Arrays.asList("A", "B")));
        assertEquals(2, list.size());
    }

    @Test
    public void testRetainAllWithAllElementsPresent() {
        list.addAll(Arrays.asList("A", "B"));
        assertFalse(list.retainAll(Arrays.asList("B", "A")));
        assertEquals(2, list.size());
    }
}