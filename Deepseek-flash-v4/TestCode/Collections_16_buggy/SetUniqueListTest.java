package org.apache.commons.collections.list;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.junit.Before;
import org.junit.Test;

public class SetUniqueListTest {

    private SetUniqueList setUniqueList;
    private List list;
    private Set set;

    @Before
    public void setUp() {
        list = new ArrayList();
        set = new HashSet();
        setUniqueList = new SetUniqueList(list, set);
    }

    @Test
    public void testDecorateWithNullList() {
        try {
            SetUniqueList.decorate(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("List must not be null", e.getMessage());
        }
    }

    @Test
    public void testDecorateWithEmptyList() {
        SetUniqueList decorated = SetUniqueList.decorate(new ArrayList());
        assertTrue(decorated.isEmpty());
    }

    @Test
    public void testDecorateWithNonEmptyList() {
        List input = new ArrayList();
        input.add("a");
        input.add("b");
        input.add("a");
        SetUniqueList decorated = SetUniqueList.decorate(input);
        assertEquals(2, decorated.size());
        assertTrue(decorated.contains("a"));
        assertTrue(decorated.contains("b"));
    }

    @Test
    public void testAddUniqueElement() {
        assertTrue(setUniqueList.add("a"));
        assertEquals(1, list.size());
        assertTrue(list.contains("a"));
        assertTrue(set.contains("a"));
    }

    @Test
    public void testAddDuplicateElement() {
        assertTrue(setUniqueList.add("a"));
        assertFalse(setUniqueList.add("a"));
        assertEquals(1, list.size());
    }

    @Test
    public void testAddAtIndexUnique() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        setUniqueList.add(1, "c");
        assertEquals(3, setUniqueList.size());
        assertEquals("a", setUniqueList.get(0));
        assertEquals("c", setUniqueList.get(1));
        assertEquals("b", setUniqueList.get(2));
    }

    @Test
    public void testAddAtIndexDuplicate() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        setUniqueList.add(1, "a");
        assertEquals(2, setUniqueList.size());
        assertTrue(setUniqueList.contains("a"));
        assertTrue(setUniqueList.contains("b"));
    }

    @Test
    public void testAddAll() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        Collection coll = Arrays.asList(new Object[]{"b", "c", "a", "d"});
        assertTrue(setUniqueList.addAll(coll));
        assertEquals(4, setUniqueList.size());
    }

    @Test
    public void testAddAllWithDuplicatesFromColl() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        Collection coll = Arrays.asList(new Object[]{"a", "a", "b", "c"});
        assertTrue(setUniqueList.addAll(1, coll));
        assertEquals(3, setUniqueList.size());
        assertTrue(setUniqueList.contains("a"));
        assertTrue(setUniqueList.contains("b"));
        assertTrue(setUniqueList.contains("c"));
    }

    @Test
    public void testAddAllWithNoChange() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        Collection coll = Arrays.asList(new Object[]{"a", "b"});
        assertFalse(setUniqueList.addAll(coll));
        assertEquals(2, setUniqueList.size());
    }

    @Test
    public void testSetWithNewObject() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        Object old = setUniqueList.set(1, "c");
        assertEquals("b", old);
        assertEquals("c", list.get(1));
        assertTrue(set.contains("c"));
    }

    @Test
    public void testSetWithExistingObject() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        Object old = setUniqueList.set(0, "b");
        assertEquals("a", old);
        assertEquals(2, setUniqueList.size());
        assertTrue(setUniqueList.contains("b"));
        assertFalse(setUniqueList.contains("a"));
    }

    @Test
    public void testRemoveObject() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        assertTrue(setUniqueList.remove("a"));
        assertFalse(setUniqueList.contains("a"));
        assertFalse(set.contains("a"));
        assertFalse(setUniqueList.remove("a"));
    }

    @Test
    public void testRemoveIndex() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        Object removed = setUniqueList.remove(0);
        assertEquals("a", removed);
        assertFalse(set.contains("a"));
        assertEquals(1, setUniqueList.size());
    }

    @Test
    public void testRemoveAll() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        setUniqueList.add("c");
        Collection coll = Arrays.asList(new Object[]{"a", "c"});
        assertTrue(setUniqueList.removeAll(coll));
        assertFalse(setUniqueList.contains("a"));
        assertFalse(setUniqueList.contains("c"));
        assertFalse(set.contains("a"));
        assertFalse(set.contains("c"));
    }

    @Test
    public void testRetainAll() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        setUniqueList.add("c");
        Collection coll = Arrays.asList(new Object[]{"a", "c"});
        assertTrue(setUniqueList.retainAll(coll));
        assertTrue(setUniqueList.contains("a"));
        assertTrue(setUniqueList.contains("c"));
        assertFalse(setUniqueList.contains("b"));
        assertFalse(set.contains("b"));
    }

    @Test
    public void testClear() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        setUniqueList.clear();
        assertTrue(setUniqueList.isEmpty());
        assertTrue(set.isEmpty());
    }

    @Test
    public void testContains() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        assertTrue(setUniqueList.contains("a"));
        assertFalse(setUniqueList.contains("c"));
    }

    @Test
    public void testContainsAll() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        Collection coll = Arrays.asList(new Object[]{"a", "b"});
        assertTrue(setUniqueList.containsAll(coll));
        assertFalse(setUniqueList.containsAll(Arrays.asList(new Object[]{"a", "c"})));
    }

    @Test
    public void testIterator() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        Iterator iter = setUniqueList.iterator();
        assertTrue(iter.hasNext());
        assertEquals("a", iter.next());
        iter.remove();
        assertFalse(setUniqueList.contains("a"));
        assertFalse(set.contains("a"));
    }

    @Test
    public void testListIterator() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        ListIterator lit = setUniqueList.listIterator();
        assertTrue(lit.hasNext());
        assertEquals("a", lit.next());
        assertEquals("b", lit.next());
        assertEquals("b", lit.previous());
        lit.remove();
        assertFalse(setUniqueList.contains("b"));
        assertFalse(set.contains("b"));
    }

    @Test
    public void testListIteratorAtIndex() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        ListIterator lit = setUniqueList.listIterator(1);
        assertEquals("b", lit.next());
    }

    @Test
    public void testListIteratorAdd() {
        setUniqueList.add("a");
        ListIterator lit = setUniqueList.listIterator();
        lit.add("a");  // duplicate, should not be added
        assertEquals(1, setUniqueList.size());
        lit.add("b");  // unique, should be added
        assertEquals(2, setUniqueList.size());
        assertTrue(setUniqueList.contains("b"));
    }

    @Test
    public void testListIteratorSet() {
        setUniqueList.add("a");
        ListIterator lit = setUniqueList.listIterator();
        lit.next();
        try {
            lit.set("b");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testSubList() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        setUniqueList.add("c");
        List sub = setUniqueList.subList(0, 2);
        assertTrue(sub instanceof SetUniqueList);
        assertEquals(2, sub.size());
    }

    @Test
    public void testConstructorWithNullList() {
        try {
            new SetUniqueList(null, new HashSet());
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testConstructorWithNullSet() {
        try {
            new SetUniqueList(new ArrayList(), null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Set must not be null", e.getMessage());
        }
    }

    @Test
    public void testAsSet() {
        setUniqueList.add("a");
        set.asSet();
        assertTrue(true); // no exception expected
    }
}