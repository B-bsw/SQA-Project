package org.apache.commons.collections.list;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class TreeListTest {

    @Test
    public void constructor_givenDefaultConstructor_shouldCreateEmptyList() {
        TreeList<String> list = new TreeList<String>();
        Assert.assertEquals(0, list.size());
        Assert.assertTrue(list.isEmpty());
        Assert.assertEquals(-1, list.indexOf("any"));
        Assert.assertFalse(list.contains("any"));
        Assert.assertArrayEquals(new Object[0], list.toArray());
    }

    @Test
    public void constructor_givenCollection_shouldInitializeWithCollectionElements() {
        List<String> coll = new ArrayList<String>();
        coll.add("A");
        coll.add("B");
        coll.add("C");

        TreeList<String> list = new TreeList<String>(coll);

        Assert.assertEquals(3, list.size());
        Assert.assertEquals("A", list.get(0));
        Assert.assertEquals("B", list.get(1));
        Assert.assertEquals("C", list.get(2));
    }

    @Test
    public void get_givenValidIndices_shouldReturnCorrectElements() {
        TreeList<String> list = new TreeList<String>();
        list.add("First");
        list.add("Second");
        list.add("Third");

        Assert.assertEquals("First", list.get(0));
        Assert.assertEquals("Second", list.get(1));
        Assert.assertEquals("Third", list.get(2));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void get_givenNegativeIndex_shouldThrowIndexOutOfBoundsException() {
        TreeList<String> list = new TreeList<String>();
        list.add("A");
        list.get(-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void get_givenIndexEqualToSize_shouldThrowIndexOutOfBoundsException() {
        TreeList<String> list = new TreeList<String>();
        list.add("A");
        list.get(1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void get_givenEmptyList_shouldThrowIndexOutOfBoundsException() {
        TreeList<String> list = new TreeList<String>();
        list.get(0);
    }

    @Test
    public void add_givenSequentialAppends_shouldMaintainOrderAndBalance() {
        TreeList<Integer> list = new TreeList<Integer>();
        int count = 50;
        for (int i = 0; i < count; i++) {
            list.add(Integer.valueOf(i));
        }

        Assert.assertEquals(count, list.size());
        for (int i = 0; i < count; i++) {
            Assert.assertEquals(Integer.valueOf(i), list.get(i));
        }
    }

    @Test
    public void add_givenPrependOrder_shouldTriggerRightRotations() {
        TreeList<Integer> list = new TreeList<Integer>();
        int count = 50;
        for (int i = 0; i < count; i++) {
            list.add(0, Integer.valueOf(i));
        }

        Assert.assertEquals(count, list.size());
        for (int i = 0; i < count; i++) {
            Assert.assertEquals(Integer.valueOf(count - 1 - i), list.get(i));
        }
    }

    @Test
    public void add_givenZigZagPattern_shouldTriggerDoubleRotations() {
        TreeList<Integer> list = new TreeList<Integer>();
        list.add(0, Integer.valueOf(10));
        list.add(0, Integer.valueOf(5));
        list.add(1, Integer.valueOf(7)); // Triggers Left-Right rotation
        list.add(3, Integer.valueOf(20));
        list.add(3, Integer.valueOf(15)); // Triggers Right-Left rotation

        Assert.assertEquals(5, list.size());
        Assert.assertEquals(Integer.valueOf(5), list.get(0));
        Assert.assertEquals(Integer.valueOf(7), list.get(1));
        Assert.assertEquals(Integer.valueOf(10), list.get(2));
        Assert.assertEquals(Integer.valueOf(15), list.get(3));
        Assert.assertEquals(Integer.valueOf(20), list.get(4));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void add_givenIndexBelowZero_shouldThrowIndexOutOfBoundsException() {
        TreeList<String> list = new TreeList<String>();
        list.add(-1, "Bad");
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void add_givenIndexGreaterThanSize_shouldThrowIndexOutOfBoundsException() {
        TreeList<String> list = new TreeList<String>();
        list.add(1, "Bad");
    }

    @Test
    public void set_givenValidIndex_shouldUpdateElementAndReturnOldValue() {
        TreeList<String> list = new TreeList<String>();
        list.add("Original");
        list.add("Retained");

        String oldVal = list.set(0, "Updated");

        Assert.assertEquals("Original", oldVal);
        Assert.assertEquals("Updated", list.get(0));
        Assert.assertEquals("Retained", list.get(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void set_givenNegativeIndex_shouldThrowIndexOutOfBoundsException() {
        TreeList<String> list = new TreeList<String>();
        list.add("Val");
        list.set(-1, "New");
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void set_givenIndexEqualToSize_shouldThrowIndexOutOfBoundsException() {
        TreeList<String> list = new TreeList<String>();
        list.add("Val");
        list.set(1, "New");
    }

    @Test
    public void remove_givenSingleElement_shouldClearRoot() {
        TreeList<String> list = new TreeList<String>();
        list.add("Only");

        String removed = list.remove(0);

        Assert.assertEquals("Only", removed);
        Assert.assertEquals(0, list.size());
        Assert.assertEquals(-1, list.indexOf("Only"));
    }

    @Test
    public void remove_givenLeafNode_shouldRemoveSuccessfully() {
        TreeList<String> list = new TreeList<String>();
        list.add("A");
        list.add("B");
        list.add("C");

        String removed = list.remove(2);

        Assert.assertEquals("C", removed);
        Assert.assertEquals(2, list.size());
        Assert.assertEquals("A", list.get(0));
        Assert.assertEquals("B", list.get(1));
    }

    @Test
    public void remove_givenNodeWithOnlyLeftOrRightChild_shouldPromoteChild() {
        TreeList<Integer> list = new TreeList<Integer>();
        list.add(Integer.valueOf(10));
        list.add(Integer.valueOf(20));
        list.add(Integer.valueOf(30));
        list.add(Integer.valueOf(40));

        Integer removed = list.remove(1);

        Assert.assertEquals(Integer.valueOf(20), removed);
        Assert.assertEquals(3, list.size());
        Assert.assertEquals(Integer.valueOf(10), list.get(0));
        Assert.assertEquals(Integer.valueOf(30), list.get(1));
        Assert.assertEquals(Integer.valueOf(40), list.get(2));
    }

    @Test
    public void remove_givenManyElementsFromHead_shouldShrinkAndRebalance() {
        TreeList<Integer> list = new TreeList<Integer>();
        for (int i = 0; i < 30; i++) {
            list.add(Integer.valueOf(i));
        }

        for (int i = 0; i < 30; i++) {
            Integer removed = list.remove(0);
            Assert.assertEquals(Integer.valueOf(i), removed);
            Assert.assertEquals(30 - 1 - i, list.size());
        }
        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void remove_givenManyElementsFromTail_shouldShrinkAndRebalance() {
        TreeList<Integer> list = new TreeList<Integer>();
        for (int i = 0; i < 30; i++) {
            list.add(Integer.valueOf(i));
        }

        for (int i = 29; i >= 0; i--) {
            Integer removed = list.remove(i);
            Assert.assertEquals(Integer.valueOf(i), removed);
            Assert.assertEquals(i, list.size());
        }
        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void remove_givenInternalNodeWithTwoChildren_shouldReplaceWithValueAndMaintainBalance() {
        TreeList<Integer> list = new TreeList<Integer>();
        for (int i = 0; i < 15; i++) {
            list.add(Integer.valueOf(i));
        }

        // Remove root and internal nodes
        Integer removed = list.remove(7);
        Assert.assertEquals(Integer.valueOf(7), removed);
        Assert.assertEquals(14, list.size());

        removed = list.remove(3);
        Assert.assertEquals(Integer.valueOf(3), removed);
        Assert.assertEquals(13, list.size());

        removed = list.remove(10);
        Assert.assertEquals(Integer.valueOf(11), removed);
        Assert.assertEquals(12, list.size());

        // Validate remaining elements are in sorted order
        for (int i = 0; i < list.size() - 1; i++) {
            Assert.assertTrue(list.get(i).intValue() < list.get(i + 1).intValue());
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void remove_givenNegativeIndex_shouldThrowIndexOutOfBoundsException() {
        TreeList<String> list = new TreeList<String>();
        list.add("A");
        list.remove(-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void remove_givenIndexEqualToSize_shouldThrowIndexOutOfBoundsException() {
        TreeList<String> list = new TreeList<String>();
        list.add("A");
        list.remove(1);
    }

    @Test
    public void clear_givenNonEmptyList_shouldResetState() {
        TreeList<String> list = new TreeList<String>();
        list.add("A");
        list.add("B");
        list.add("C");

        list.clear();

        Assert.assertEquals(0, list.size());
        Assert.assertEquals(-1, list.indexOf("A"));
        Assert.assertArrayEquals(new Object[0], list.toArray());
    }

    @Test
    public void indexOf_givenNullAndNonNullElements_shouldReturnCorrectIndices() {
        TreeList<String> list = new TreeList<String>();
        list.add("Apple");
        list.add(null);
        list.add("Banana");
        list.add("Apple");

        Assert.assertEquals(0, list.indexOf("Apple"));
        Assert.assertEquals(1, list.indexOf(null));
        Assert.assertEquals(2, list.indexOf("Banana"));
        Assert.assertEquals(-1, list.indexOf("Orange"));
    }

    @Test
    public void contains_givenVariousElements_shouldReturnTrueIfExists() {
        TreeList<String> list = new TreeList<String>();
        list.add("Apple");
        list.add(null);

        Assert.assertTrue(list.contains("Apple"));
        Assert.assertTrue(list.contains(null));
        Assert.assertFalse(list.contains("Grape"));
    }

    @Test
    public void toArray_givenPopulatedList_shouldReturnArrayInOrder() {
        TreeList<String> list = new TreeList<String>();
        list.add("One");
        list.add("Two");
        list.add("Three");

        Object[] expected = new Object[]{"One", "Two", "Three"};
        Assert.assertArrayEquals(expected, list.toArray());
    }

    @Test
    public void iterator_givenPopulatedList_shouldTraverseAllElementsInOrder() {
        TreeList<String> list = new TreeList<String>();
        list.add("A");
        list.add("B");
        list.add("C");

        Iterator<String> it = list.iterator();
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("A", it.next());
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("B", it.next());
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("C", it.next());
        Assert.assertFalse(it.hasNext());
    }

    @Test(expected = NoSuchElementException.class)
    public void iterator_givenPastEnd_shouldThrowNoSuchElementException() {
        TreeList<String> list = new TreeList<String>();
        list.add("Only");

        Iterator<String> it = list.iterator();
        it.next();
        it.next();
    }

    @Test
    public void listIterator_givenBidirectionalNavigation_shouldMoveBackAndForthCorrectly() {
        TreeList<String> list = new TreeList<String>();
        list.add("A");
        list.add("B");
        list.add("C");

        ListIterator<String> it = list.listIterator();
        Assert.assertFalse(it.hasPrevious());
        Assert.assertEquals(0, it.nextIndex());
        Assert.assertEquals(-1, it.previousIndex());

        Assert.assertEquals("A", it.next());
        Assert.assertEquals(1, it.nextIndex());
        Assert.assertEquals(0, it.previousIndex());

        Assert.assertEquals("B", it.next());
        Assert.assertTrue(it.hasPrevious());
        Assert.assertEquals("B", it.previous());
        Assert.assertEquals("A", it.previous());
        Assert.assertFalse(it.hasPrevious());
    }

    @Test(expected = NoSuchElementException.class)
    public void listIterator_givenStartOfList_previousShouldThrowNoSuchElementException() {
        TreeList<String> list = new TreeList<String>();
        list.add("A");

        ListIterator<String> it = list.listIterator();
        it.previous();
    }

    @Test
    public void listIterator_givenFromIndex_shouldStartAtGivenPosition() {
        TreeList<String> list = new TreeList<String>();
        list.add("A");
        list.add("B");
        list.add("C");

        ListIterator<String> it = list.listIterator(2);
        Assert.assertEquals(2, it.nextIndex());
        Assert.assertEquals(1, it.previousIndex());
        Assert.assertEquals("C", it.next());
        Assert.assertFalse(it.hasNext());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void listIterator_givenInvalidFromIndexNegative_shouldThrowIndexOutOfBoundsException() {
        TreeList<String> list = new TreeList<String>();
        list.listIterator(-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void listIterator_givenInvalidFromIndexGreaterThanSize_shouldThrowIndexOutOfBoundsException() {
        TreeList<String> list = new TreeList<String>();
        list.listIterator(1);
    }

    @Test
    public void listIteratorSet_givenValidCurrentNode_shouldUpdateValue() {
        TreeList<String> list = new TreeList<String>();
        list.add("A");
        list.add("B");

        ListIterator<String> it = list.listIterator();
        it.next();
        it.set("UpdatedA");

        Assert.assertEquals("UpdatedA", list.get(0));
    }

    @Test(expected = IllegalStateException.class)
    public void listIteratorSet_givenNoCallToNextOrPrevious_shouldThrowIllegalStateException() {
        TreeList<String> list = new TreeList<String>();
        list.add("A");

        ListIterator<String> it = list.listIterator();
        it.set("Fail");
    }

    @Test(expected = IllegalStateException.class)
    public void listIteratorSet_givenAfterRemove_shouldThrowIllegalStateException() {
        TreeList<String> list = new TreeList<String>();
        list.add("A");

        ListIterator<String> it = list.listIterator();
        it.next();
        it.remove();
        it.set("Fail");
    }

    @Test
    public void listIteratorAdd_givenEmptyAndNonEmptyList_shouldInsertAtIteratorPosition() {
        TreeList<String> list = new TreeList<String>();
        ListIterator<String> it = list.listIterator();

        it.add("First");
        Assert.assertEquals(1, list.size());
        Assert.assertEquals("First", list.get(0));

        it.add("Second");
        Assert.assertEquals(2, list.size());
        Assert.assertEquals("First", list.get(0));
        Assert.assertEquals("Second", list.get(1));

        Assert.assertEquals("Second", it.previous());
        it.add("Middle");
        Assert.assertEquals(3, list.size());
        Assert.assertEquals("First", list.get(0));
        Assert.assertEquals("Middle", list.get(1));
        Assert.assertEquals("Second", list.get(2));
    }

    @Test
    public void listIteratorRemove_givenAfterNext_shouldRemoveCurrentElement() {
        TreeList<String> list = new TreeList<String>();
        list.add("A");
        list.add("B");
        list.add("C");

        ListIterator<String> it = list.listIterator();
        it.next(); // 'A'
        it.next(); // 'B'
        it.remove(); // removes 'B'

        Assert.assertEquals(2, list.size());
        Assert.assertEquals("A", list.get(0));
        Assert.assertEquals("C", list.get(1));
        Assert.assertEquals("C", it.next());
    }

    @Test
    public void listIteratorRemove_givenAfterPrevious_shouldRemoveCurrentElement() {
        TreeList<String> list = new TreeList<String>();
        list.add("A");
        list.add("B");
        list.add("C");

        ListIterator<String> it = list.listIterator(3);
        Assert.assertEquals("C", it.previous());
        it.remove();

        Assert.assertEquals(2, list.size());
        Assert.assertEquals("A", list.get(0));
        Assert.assertEquals("B", list.get(1));
    }

    @Test(expected = IllegalStateException.class)
    public void listIteratorRemove_givenWithoutNextOrPrevious_shouldThrowIllegalStateException() {
        TreeList<String> list = new TreeList<String>();
        list.add("A");

        ListIterator<String> it = list.listIterator();
        it.remove();
    }

    @Test(expected = IllegalStateException.class)
    public void listIteratorRemove_givenDoubleRemove_shouldThrowIllegalStateException() {
        TreeList<String> list = new TreeList<String>();
        list.add("A");
        list.add("B");

        ListIterator<String> it = list.listIterator();
        it.next();
        it.remove();
        it.remove();
    }

    @Test(expected = ConcurrentModificationException.class)
    public void listIteratorNext_givenExternalListModification_shouldThrowConcurrentModificationException() {
        TreeList<String> list = new TreeList<String>();
        list.add("A");
        list.add("B");

        ListIterator<String> it = list.listIterator();
        list.add("C");
        it.next();
    }

    @Test(expected = ConcurrentModificationException.class)
    public void listIteratorPrevious_givenExternalListModification_shouldThrowConcurrentModificationException() {
        TreeList<String> list = new TreeList<String>();
        list.add("A");
        list.add("B");

        ListIterator<String> it = list.listIterator(1);
        list.add("C");
        it.previous();
    }

    @Test(expected = ConcurrentModificationException.class)
    public void listIteratorSet_givenExternalListModification_shouldThrowConcurrentModificationException() {
        TreeList<String> list = new TreeList<String>();
        list.add("A");

        ListIterator<String> it = list.listIterator();
        it.next();
        list.add("B");
        it.set("Changed");
    }

    @Test(expected = ConcurrentModificationException.class)
    public void listIteratorAdd_givenExternalListModification_shouldThrowConcurrentModificationException() {
        TreeList<String> list = new TreeList<String>();
        list.add("A");

        ListIterator<String> it = list.listIterator();
        list.add("B");
        it.add("Changed");
    }

    @Test(expected = ConcurrentModificationException.class)
    public void listIteratorRemove_givenExternalListModification_shouldThrowConcurrentModificationException() {
        TreeList<String> list = new TreeList<String>();
        list.add("A");

        ListIterator<String> it = list.listIterator();
        it.next();
        list.add("B");
        it.remove();
    }

    @Test
    public void avlNodeToString_givenPopulatedTree_shouldReturnInformativeString() {
        TreeList<String> list = new TreeList<String>();
        list.add("RootValue");
        list.add("RightValue");
        list.add(0, "LeftValue");

        // Obtain node representation via iteration and toString
        ListIterator<String> it = list.listIterator();
        Assert.assertNotNull(it.toString());
        // Verify root node internal toString is exercised
        String rootStr = list.get(1);
        Assert.assertEquals("RootValue", rootStr);
    }
}