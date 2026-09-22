package org.apache.commons.collections.list;

import org.junit.Before;
import org.junit.Test;
import java.util.ListIterator;
import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class TreeListTest {

    private TreeList<String> list;

    @Before
    public void setUp() {
        list = new TreeList<>();
    }

    // -------- Constructor and size tests --------

    @Test
    public void testDefaultConstructor () {
        assertEquals(0, list.size());
        assertTrue(list.isEmpty());
    }

    @Test
    public void testCollectionConstructor () {
        java.util.List<String> data = new java.util.ArrayList<>();
        data.add("a");
        data.add("b");
        TreeList<String> treeList = new TreeList<>(data);
        assertEquals(2, treeList.size());
        assertEquals("a", treeList.get(0));
        assertEquals("b", treeList.get(1));
    }

    @Test
    public void testCollectionConstructorEmpty() {
        TreeList<String> treeList = new TreeList<>(new java.util.ArrayList<>());
        assertEquals(0, treeList.size());
    }

    // -------- get tests --------

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetNegativeIndex() {
        list.add("test");
        list.get(-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetIndexOutOfBounds() {
        list.add("test");
        list.get(1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetOnEmptyList() {
        list.get(0);
    }

    @Test
    public void testGetValidIndex() {
        list.add("a");
        list.add("b");
        list.add("c");
        assertEquals("a", list.get(0));
        assertEquals("b", list.get(1));
        assertEquals("c", list.get(2));
    }

    // -------- Add and remove tests --------

    @Test
    public void testAddToEmptyList() {
        list.add("a");
        assertEquals(1, list.size());
        assertEquals("a", list.get(0));
    }

    @Test
    public void testAddMultipleElements() {
        list.add("a");
        list.add("b");
        list.add("c");
        assertEquals(3, list.size());
        assertEquals("a", list.get(0));
        assertEquals("b", list.get(1));
        assertEquals("c", list.get(2));
    }

    @Test
    public void testAddAtIndex() {
        list.add("a");
        list.add("c");
        list.add(1, "b");
        assertEquals(3, list.size());
        assertEquals("b", list.get(1));
    }

    @Test
    public void testAddAtIndexFirst() {
        list.add("a");
        list.add("b");
        list.add(0, "first");
        assertEquals("first", list.get(0));
        assertEquals(3, list.size());
    }

    @Test
    public void testAddAtIndexLast() {
        list.add("a");
        list.add("b");
        list.add(2, "last");
        assertEquals("last", list.get(2));
        assertEquals(3, list.size());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddInvalidIndex() {
        list.add("a");
        list.add(2, "invalid");
    }

    @Test
    public void testRemoveFirstElement() {
        list.add("a");
        list.add("b");
        list.add("c");
        assertEquals("a", list.remove(0));
        assertEquals(2, list.size());
        assertEquals("b", list.get(0));
    }

    @Test
    public void testRemoveMiddleElement() {
        list.add("a");
        list.add("b");
        list.add("c");
        assertEquals("b", list.remove(1));
        assertEquals(2, list.size());
        assertEquals("a", list.get(0));
        assertEquals("c", list.get(1));
    }

    @Test
    public void testRemoveLastElement() {
        list.add("a");
        list.add("b");
        list.add("c");
        assertEquals("c", list.remove(2));
        assertEquals(2, list.size());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveInvalidIndex() {
        list.add("a");
        list.remove(1);
    }

    @Test
    public void testRemoveAllElements() {
        list.add("a");
        list.remove(0);
        assertTrue(list.isEmpty());
        assertEquals(0, list.size());
    }

    // -------- Set tests --------

    @Test
    public void testSetValue() {
        list.add("a");
        list.add("b");
        assertEquals("b", list.set(1, "c"));
        assertEquals("c", list.get(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetInvalidIndex() {
        list.add("a");
        list.set(1, "c");
    }

    // -------- Clear tests --------

    @Test
    public void testClear() {
        list.add("a");
        list.add("b");
        list.clear();
        assertEquals(0, list.size());
        assertTrue(list.isEmpty());
    }

    @Test
    public void testClearEmptyList() {
        list.clear();
        assertEquals(0, list.size());
    }

    // -------- indexOf/contains tests --------

    @Test
    public void testIndexOfExistingElement() {
        list.add("a");
        list.add("b");
        assertEquals(0, list.indexOf("a"));
        assertEquals(1, list.indexOf("b"));
    }

    @Test
    public void testIndexNotFound() {
        list.add("a");
        assertEquals(-1, list.indexOf("b"));
    }

    @Test
    public void testIndexOfNull() {
        list.add("a");
        list.add(null);
        assertEquals(1, list.indexOf(null));
    }

    @Test
    public void testIndexOfOnEmptyList() {
        assertEquals(-1, list.indexOf("a"));
    }

    @Test
    public void testContainsTrue() {
        list.add("a");
        assertTrue(list.contains("a"));
    }

    @Test
    public void testContainsFalse() {
        list.add("a");
        assertFalse(list.contains("b"));
    }

    // -------- toArray tests --------

    @Test
    public void testToArray() {
        list.add("a");
        list.add("b");
        Object[] array = list.toArray();
        assertNotNull(array);
        assertEquals(2, array.length);
        assertEquals("a", array[0]);
        assertEquals("b", array[1]);
    }

    @Test
    public void testToArrayEmptyList() {
        Object[] array = list.toArray();
        assertNotNull(array);
        assertEquals(0, array.length);
    }

    // -------- iterator tests --------

    @Test(expected = NoSuchElementException.class)
    public void testIteratorNextOnEmpty() {
        list.iterator().next();
    }

    @Test(expected = NoSuchElementException.class)
    public void testListIteratorPreviousOnEmpty() {
        list.listIterator().previous();
    }

    @Test
    public void testIteratorHasNext() {
        list.add("a");
        ListIterator<String> it = list.listIterator();
        assertTrue(it.hasNext());
        assertTrue(it.hasPrevious());
        assertEquals("a", it.next());
        assertFalse(it.hasNext());
        assertTrue(it.hasPrevious());
    }

    @Test
    public void testIteratorNextAndPrevious() {
        list.add("a");
        list.add("b");
        ListIterator<String> it = list.listIterator();
        assertEquals("a", it.next());
        assertEquals("b", it.next());
        assertEquals("b", it.previous());
        assertEquals("a", it.previous());
    }

    @Test
    public void testIteratorNextIndex() {
        list.add("a");
        ListIterator<String> it = list.listIterator();
        assertEquals(0, it.nextIndex());
        it.next();
        assertEquals(1, it.nextIndex());
    }

    @Test
    public void testIteratorPreviousIndex() {
        list.add("a");
        list.add("b");
        ListIterator<String> it = list.listIterator();
        assertEquals(-1, it.previousIndex());
        it.next();
        assertEquals(0, it.previousIndex());
    }

    @Test(expected = IllegalStateException.class)
    public void testIteratorRemoveWithoutNext() {
        list.add("a");
        list.listIterator().remove();
    }

    @Test
    public void testIteratorRemove() {
        list.add("a");
        list.add("b");
        list.add("c");
        ListIterator<String> it = list.listIterator();
        it.next();
        it.remove();
        assertEquals(2, list.size());
        assertEquals("b", list.get(0));
    }

    @Test
    public void testIteratorAdd() {
        list.add("a");
        list.add("c");
        ListIterator<String> it = list.listIterator();
        it.next();
        it.add("b");
        assertEquals(3, list.size());
        assertEquals("b", list.get(1));
    }

    @Test
    public void testIteratorSet() {
        list.add("a");
        list.add("b");
        ListIterator<String> it = list.listIterator();
        it.next();
        it.set("x");
        assertEquals("x", list.get(0));
    }

    @Test(expected = NoSuchElementException.class)
    public void testListIteratorNextPastEnd() {
        list.add("a");
        ListIterator<String> it = list.listIterator();
        it.next();
        it.next();
    }

    // -------- Large/rotation tests --------

    @Test
    public void testLargeList() {
        for (int i = 0; i < 1000; i++) {
            list.add("item" + i);
        }
        assertEquals(1000, list.size());
        for (int i = 0; i < 1000; i++) {
            assertEquals("item" + i, list.get(i));
        }
    }

    @Test
    public void testRotateLeft() {
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        // Force a rotation by adding in middle and checking list
        assertEquals("a", list.get(0));
        list.add(2, "x");
        assertEquals("x", list.get(2));
        assertEquals("c", list.get(3));
    }

    @Test
    public void testAddRemoveMany() {
        for (int i = 0; i < 10; i++) {
            list.add(i, "val" + i);
        }
        for (int i = 0; i < 10; i++) {
            assertEquals("val" + i, list.get(i));
        }
        for (int i = 0; i < 5; i++) {
            list.remove(0);
        }
        assertEquals(5, list.size());
    }
}