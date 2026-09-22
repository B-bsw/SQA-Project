/*
 * Phase 1 - Code Analysis & Test Matrix:
 * 
 * 1. Factory Methods:
 *    - listOrderedSet(Set, List):
 *      * null Set -> IllegalArgumentException ("Set must not be null")
 *      * null List -> IllegalArgumentException ("List must not be null")
 *      * non-empty Set -> IllegalArgumentException ("Set and List must be empty")
 *      * non-empty List -> IllegalArgumentException ("Set and List must be empty")
 *      * valid empty Set and List -> correctly decorated ListOrderedSet instance
 *    - listOrderedSet(Set):
 *      * null Set -> IllegalArgumentException
 *      * valid Set -> correctly decorated ListOrderedSet instance preserving elements
 *    - listOrderedSet(List):
 *      * null List -> IllegalArgumentException ("List must not be null")
 *      * List with duplicate elements -> duplicates removed, unique order retained
 * 
 * 2. Constructors:
 *    - ListOrderedSet() default constructor -> initializes empty HashSet and ArrayList
 *    - ListOrderedSet(Set) constructor -> initializes with setOrder containing set elements
 *    - ListOrderedSet(Set, List) constructor:
 *      * null List -> IllegalArgumentException ("List must not be null")
 *      * valid instances -> initializes set and list
 * 
 * 3. Collection Interface & Ordering Methods:
 *    - asList(): returns unmodifiable view; mutation throws UnsupportedOperationException
 *    - clear(): clears both internal set and setOrder list
 *    - add(E):
 *      * new element -> returns true, added to both set and list
 *      * existing element -> returns false, set and list unchanged
 *    - addAll(Collection):
 *      * new elements -> returns true, all added
 *      * duplicate elements -> returns false, list unchanged
 *      * mixed elements -> returns true, only new elements added in order
 *    - remove(Object):
 *      * existing element -> returns true, removed from both set and list
 *      * non-existing element -> returns false
 *    - removeAll(Collection):
 *      * elements present -> returns true, removed
 *      * elements absent -> returns false
 *    - retainAll(Collection):
 *      * no elements changed -> returns false
 *      * some elements removed -> returns true, retains remaining in original order
 *      * all elements removed (size == 0 branch) -> returns true, setOrder cleared
 *    - toArray() and toArray(T[]): correctly returns array matching setOrder
 * 
 * 4. List-like Indexed Access Operations:
 *    - get(int): valid index, IndexOutOfBoundsException on invalid index
 *    - indexOf(Object): returns correct index if present, -1 if absent
 *    - add(int, E):
 *      * new element -> inserted at specified index in list and added to set
 *      * already contained element -> ignored, no duplicate added
 *    - addAll(int, Collection):
 *      * new elements -> inserted at index in list, returns true
 *      * all elements already present -> returns false, no changes
 *      * mixed elements -> only non-contained elements inserted at index, returns true
 *    - remove(int): removes from both set and list, returns removed object
 *    - toString(): returns list representation matching setOrder.toString()
 * 
 * 5. OrderedSetIterator:
 *    - next(), hasNext(), remove(): removes from both iterator and underlying set
 *    - previous(), hasPrevious(): bidirectional navigation retaining order
 */
package org.apache.commons.collections.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.commons.collections.OrderedIterator;
import org.junit.Assert;
import org.junit.Test;

public class ListOrderedSetTest {

    // -----------------------------------------------------------------------
    // Factory method: listOrderedSet(Set, List)
    // -----------------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void listOrderedSet_givenNullSetAndNonNullList_shouldThrowIllegalArgumentException() {
        // Arrange
        Set<String> set = null;
        List<String> list = new ArrayList<String>();

        // Act
        ListOrderedSet.listOrderedSet(set, list);
    }

    @Test(expected = IllegalArgumentException.class)
    public void listOrderedSet_givenNonNullSetAndNullList_shouldThrowIllegalArgumentException() {
        // Arrange
        Set<String> set = new HashSet<String>();
        List<String> list = null;

        // Act
        ListOrderedSet.listOrderedSet(set, list);
    }

    @Test(expected = IllegalArgumentException.class)
    public void listOrderedSet_givenNonEmptySetAndEmptyList_shouldThrowIllegalArgumentException() {
        // Arrange
        Set<String> set = new HashSet<String>();
        set.add("A");
        List<String> list = new ArrayList<String>();

        // Act
        ListOrderedSet.listOrderedSet(set, list);
    }

    @Test(expected = IllegalArgumentException.class)
    public void listOrderedSet_givenEmptySetAndNonEmptyList_shouldThrowIllegalArgumentException() {
        // Arrange
        Set<String> set = new HashSet<String>();
        List<String> list = new ArrayList<String>();
        list.add("A");

        // Act
        ListOrderedSet.listOrderedSet(set, list);
    }

    @Test
    public void listOrderedSet_givenEmptySetAndEmptyList_shouldCreateEmptyOrderedSet() {
        // Arrange
        Set<String> set = new HashSet<String>();
        List<String> list = new ArrayList<String>();

        // Act
        ListOrderedSet<String> orderedSet = ListOrderedSet.listOrderedSet(set, list);

        // Assert
        Assert.assertNotNull(orderedSet);
        Assert.assertTrue(orderedSet.isEmpty());
        Assert.assertEquals(0, orderedSet.size());
    }

    // -----------------------------------------------------------------------
    // Factory method: listOrderedSet(Set)
    // -----------------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void listOrderedSet_givenNullSet_shouldThrowIllegalArgumentException() {
        // Arrange
        Set<String> set = null;

        // Act
        ListOrderedSet.listOrderedSet(set);
    }

    @Test
    public void listOrderedSet_givenPopulatedSet_shouldPreserveElements() {
        // Arrange
        Set<String> set = new HashSet<String>();
        set.add("X");
        set.add("Y");

        // Act
        ListOrderedSet<String> orderedSet = ListOrderedSet.listOrderedSet(set);

        // Assert
        Assert.assertEquals(2, orderedSet.size());
        Assert.assertTrue(orderedSet.contains("X"));
        Assert.assertTrue(orderedSet.contains("Y"));
    }

    // -----------------------------------------------------------------------
    // Factory method: listOrderedSet(List)
    // -----------------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void listOrderedSet_givenNullList_shouldThrowIllegalArgumentException() {
        // Arrange
        List<String> list = null;

        // Act
        ListOrderedSet.listOrderedSet(list);
    }

    @Test
    public void listOrderedSet_givenListWithDuplicates_shouldRemoveDuplicatesAndRetainOrder() {
        // Arrange
        List<String> list = new ArrayList<String>();
        list.add("First");
        list.add("Second");
        list.add("First");
        list.add("Third");
        list.add("Second");

        // Act
        ListOrderedSet<String> orderedSet = ListOrderedSet.listOrderedSet(list);

        // Assert
        Assert.assertEquals(3, orderedSet.size());
        Assert.assertEquals("First", orderedSet.get(0));
        Assert.assertEquals("Second", orderedSet.get(1));
        Assert.assertEquals("Third", orderedSet.get(2));
    }

    // -----------------------------------------------------------------------
    // Constructors
    // -----------------------------------------------------------------------

    @Test
    public void defaultConstructor_shouldCreateEmptyInstance() {
        // Arrange & Act
        ListOrderedSet<String> set = new ListOrderedSet<String>();

        // Assert
        Assert.assertTrue(set.isEmpty());
        Assert.assertEquals(0, set.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void protectedConstructor_givenNullList_shouldThrowIllegalArgumentException() {
        // Arrange
        Set<String> set = new HashSet<String>();
        List<String> list = null;

        // Act
        new ListOrderedSet<String>(set, list);
    }

    // -----------------------------------------------------------------------
    // asList()
    // -----------------------------------------------------------------------

    @Test(expected = UnsupportedOperationException.class)
    public void asList_givenUnmodifiableListReturned_shouldThrowExceptionOnModification() {
        // Arrange
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("A");
        List<String> listView = set.asList();

        // Act
        listView.add("B");
    }

    @Test
    public void asList_shouldReflectOrderOfSet() {
        // Arrange
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");

        // Act
        List<String> listView = set.asList();

        // Assert
        Assert.assertEquals(3, listView.size());
        Assert.assertEquals("A", listView.get(0));
        Assert.assertEquals("B", listView.get(1));
        Assert.assertEquals("C", listView.get(2));
    }

    // -----------------------------------------------------------------------
    // add(E) & addAll(Collection)
    // -----------------------------------------------------------------------

    @Test
    public void add_givenNewElement_shouldReturnTrueAndAppendToListEnd() {
        // Arrange
        ListOrderedSet<String> set = new ListOrderedSet<String>();

        // Act
        boolean addedFirst = set.add("One");
        boolean addedSecond = set.add("Two");

        // Assert
        Assert.assertTrue(addedFirst);
        Assert.assertTrue(addedSecond);
        Assert.assertEquals(2, set.size());
        Assert.assertEquals("One", set.get(0));
        Assert.assertEquals("Two", set.get(1));
    }

    @Test
    public void add_givenDuplicateElement_shouldReturnFalseAndNotChangeOrder() {
        // Arrange
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("One");
        set.add("Two");

        // Act
        boolean addedDuplicate = set.add("One");

        // Assert
        Assert.assertFalse(addedDuplicate);
        Assert.assertEquals(2, set.size());
        Assert.assertEquals("One", set.get(0));
        Assert.assertEquals("Two", set.get(1));
    }

    @Test
    public void addAll_givenCollectionWithNewAndDuplicateElements_shouldOnlyAddNewElements() {
        // Arrange
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("A");

        List<String> toAdd = new ArrayList<String>();
        toAdd.add("A");
        toAdd.add("B");
        toAdd.add("C");

        // Act
        boolean changed = set.addAll(toAdd);

        // Assert
        Assert.assertTrue(changed);
        Assert.assertEquals(3, set.size());
        Assert.assertEquals("A", set.get(0));
        Assert.assertEquals("B", set.get(1));
        Assert.assertEquals("C", set.get(2));
    }

    @Test
    public void addAll_givenCollectionWithAllDuplicates_shouldReturnFalse() {
        // Arrange
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("A");
        set.add("B");

        List<String> toAdd = new ArrayList<String>();
        toAdd.add("A");
        toAdd.add("B");

        // Act
        boolean changed = set.addAll(toAdd);

        // Assert
        Assert.assertFalse(changed);
        Assert.assertEquals(2, set.size());
    }

    // -----------------------------------------------------------------------
    // remove(Object) & removeAll(Collection)
    // -----------------------------------------------------------------------

    @Test
    public void remove_givenExistingElement_shouldReturnTrueAndRemoveFromListAndSet() {
        // Arrange
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");

        // Act
        boolean removed = set.remove("B");

        // Assert
        Assert.assertTrue(removed);
        Assert.assertEquals(2, set.size());
        Assert.assertFalse(set.contains("B"));
        Assert.assertEquals("A", set.get(0));
        Assert.assertEquals("C", set.get(1));
    }

    @Test
    public void remove_givenNonExistingElement_shouldReturnFalse() {
        // Arrange
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("A");

        // Act
        boolean removed = set.remove("Z");

        // Assert
        Assert.assertFalse(removed);
        Assert.assertEquals(1, set.size());
    }

    @Test
    public void removeAll_givenMatchingElements_shouldRemoveAndReturnTrue() {
        // Arrange
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");

        List<String> toRemove = new ArrayList<String>();
        toRemove.add("A");
        toRemove.add("C");
        toRemove.add("D");

        // Act
        boolean changed = set.removeAll(toRemove);

        // Assert
        Assert.assertTrue(changed);
        Assert.assertEquals(1, set.size());
        Assert.assertEquals("B", set.get(0));
    }

    @Test
    public void removeAll_givenNoMatchingElements_shouldReturnFalse() {
        // Arrange
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("A");
        set.add("B");

        List<String> toRemove = new ArrayList<String>();
        toRemove.add("X");
        toRemove.add("Y");

        // Act
        boolean changed = set.removeAll(toRemove);

        // Assert
        Assert.assertFalse(changed);
        Assert.assertEquals(2, set.size());
    }

    // -----------------------------------------------------------------------
    // retainAll(Collection)
    // -----------------------------------------------------------------------

    @Test
    public void retainAll_givenSubset_shouldRetainOnlyGivenElementsAndReturnTrue() {
        // Arrange
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");

        List<String> toRetain = new ArrayList<String>();
        toRetain.add("B");
        toRetain.add("D");

        // Act
        boolean changed = set.retainAll(toRetain);

        // Assert
        Assert.assertTrue(changed);
        Assert.assertEquals(2, set.size());
        Assert.assertEquals("B", set.get(0));
        Assert.assertEquals("D", set.get(1));
    }

    @Test
    public void retainAll_givenIdenticalCollection_shouldReturnFalse() {
        // Arrange
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("A");
        set.add("B");

        List<String> toRetain = new ArrayList<String>();
        toRetain.add("A");
        toRetain.add("B");

        // Act
        boolean changed = set.retainAll(toRetain);

        // Assert
        Assert.assertFalse(changed);
        Assert.assertEquals(2, set.size());
    }

    @Test
    public void retainAll_givenEmptyCollection_shouldClearBothSetAndOrder() {
        // Arrange
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("A");
        set.add("B");

        List<String> emptyRetain = new ArrayList<String>();

        // Act
        boolean changed = set.retainAll(emptyRetain);

        // Assert
        Assert.assertTrue(changed);
        Assert.assertTrue(set.isEmpty());
        Assert.assertEquals(0, set.size());
    }

    // -----------------------------------------------------------------------
    // clear()
    // -----------------------------------------------------------------------

    @Test
    public void clear_givenPopulatedSet_shouldEmptySetAndOrder() {
        // Arrange
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("A");
        set.add("B");

        // Act
        set.clear();

        // Assert
        Assert.assertTrue(set.isEmpty());
        Assert.assertEquals(0, set.size());
        Assert.assertEquals(-1, set.indexOf("A"));
    }

    // -----------------------------------------------------------------------
    // toArray() & toArray(T[])
    // -----------------------------------------------------------------------

    @Test
    public void toArray_shouldReturnElementsInCorrectOrder() {
        // Arrange
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("First");
        set.add("Second");

        // Act
        Object[] array = set.toArray();

        // Assert
        Assert.assertEquals(2, array.length);
        Assert.assertEquals("First", array[0]);
        Assert.assertEquals("Second", array[1]);
    }

    @Test
    public void toArray_givenTypedArray_shouldFillAndReturnTypedArray() {
        // Arrange
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("One");
        set.add("Two");

        String[] target = new String[2];

        // Act
        String[] result = set.toArray(target);

        // Assert
        Assert.assertSame(target, result);
        Assert.assertEquals("One", result[0]);
        Assert.assertEquals("Two", result[1]);
    }

    // -----------------------------------------------------------------------
    // Indexed List Methods: get(int), indexOf(Object), remove(int)
    // -----------------------------------------------------------------------

    @Test
    public void get_givenValidIndex_shouldReturnElement() {
        // Arrange
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("A");
        set.add("B");

        // Act & Assert
        Assert.assertEquals("A", set.get(0));
        Assert.assertEquals("B", set.get(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void get_givenIndexOutOfBounds_shouldThrowIndexOutOfBoundsException() {
        // Arrange
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("A");

        // Act
        set.get(1);
    }

    @Test
    public void indexOf_givenContainedElement_shouldReturnZeroBasedIndex() {
        // Arrange
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("X");
        set.add("Y");

        // Act & Assert
        Assert.assertEquals(0, set.indexOf("X"));
        Assert.assertEquals(1, set.indexOf("Y"));
    }

    @Test
    public void indexOf_givenNonContainedElement_shouldReturnMinusOne() {
        // Arrange
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("X");

        // Act & Assert
        Assert.assertEquals(-1, set.indexOf("Z"));
    }

    @Test
    public void remove_givenIndex_shouldRemoveElementAndReturnRemovedObject() {
        // Arrange
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");

        // Act
        Object removedObj = set.remove(1);

        // Assert
        Assert.assertEquals("B", removedObj);
        Assert.assertEquals(2, set.size());
        Assert.assertFalse(set.contains("B"));
        Assert.assertEquals("A", set.get(0));
        Assert.assertEquals("C", set.get(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void remove_givenNegativeIndex_shouldThrowIndexOutOfBoundsException() {
        // Arrange
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("A");

        // Act
        set.remove(-1);
    }

    // -----------------------------------------------------------------------
    // Indexed Insertion: add(int, E), addAll(int, Collection)
    // -----------------------------------------------------------------------

    @Test
    public void addAtIndex_givenNewElement_shouldInsertAtSpecifiedIndex() {
        // Arrange
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("A");
        set.add("C");

        // Act
        set.add(1, "B");

        // Assert
        Assert.assertEquals(3, set.size());
        Assert.assertEquals("A", set.get(0));
        Assert.assertEquals("B", set.get(1));
        Assert.assertEquals("C", set.get(2));
    }

    @Test
    public void addAtIndex_givenExistingElement_shouldDoNothing() {
        // Arrange
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("A");
        set.add("B");

        // Act
        set.add(0, "B");

        // Assert
        Assert.assertEquals(2, set.size());
        Assert.assertEquals("A", set.get(0));
        Assert.assertEquals("B", set.get(1));
    }

    @Test
    public void addAllAtIndex_givenNewElements_shouldInsertAtSpecifiedIndexAndReturnTrue() {
        // Arrange
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("A");
        set.add("D");

        List<String> toInsert = new ArrayList<String>();
        toInsert.add("B");
        toInsert.add("C");

        // Act
        boolean changed = set.addAll(1, toInsert);

        // Assert
        Assert.assertTrue(changed);
        Assert.assertEquals(4, set.size());
        Assert.assertEquals("A", set.get(0));
        Assert.assertEquals("B", set.get(1));
        Assert.assertEquals("C", set.get(2));
        Assert.assertEquals("D", set.get(3));
    }

    @Test
    public void addAllAtIndex_givenAllExistingElements_shouldReturnFalseAndLeaveListUnchanged() {
        // Arrange
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("A");
        set.add("B");

        List<String> toInsert = new ArrayList<String>();
        toInsert.add("A");
        toInsert.add("B");

        // Act
        boolean changed = set.addAll(1, toInsert);

        // Assert
        Assert.assertFalse(changed);
        Assert.assertEquals(2, set.size());
        Assert.assertEquals("A", set.get(0));
        Assert.assertEquals("B", set.get(1));
    }

    @Test
    public void addAllAtIndex_givenPartiallyExistingElements_shouldInsertOnlyNewElements() {
        // Arrange
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("A");
        set.add("D");

        List<String> toInsert = new ArrayList<String>();
        toInsert.add("A");
        toInsert.add("B");
        toInsert.add("D");
        toInsert.add("C");

        // Act
        boolean changed = set.addAll(1, toInsert);

        // Assert
        Assert.assertTrue(changed);
        Assert.assertEquals(4, set.size());
        Assert.assertEquals("A", set.get(0));
        Assert.assertEquals("B", set.get(1));
        Assert.assertEquals("C", set.get(2));
        Assert.assertEquals("D", set.get(3));
    }

    // -----------------------------------------------------------------------
    // toString()
    // -----------------------------------------------------------------------

    @Test
    public void toString_shouldMatchListToString() {
        // Arrange
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("Item1");
        set.add("Item2");

        // Act & Assert
        Assert.assertEquals("[Item1, Item2]", set.toString());
    }

    // -----------------------------------------------------------------------
    // OrderedIterator tests
    // -----------------------------------------------------------------------

    @Test
    public void iterator_forwardAndBackwardTraversal_shouldTraverseInOrder() {
        // Arrange
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("First");
        set.add("Second");
        set.add("Third");

        OrderedIterator<String> it = set.iterator();

        // Act & Assert - Forward
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("First", it.next());
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("Second", it.next());
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("Third", it.next());
        Assert.assertFalse(it.hasNext());

        // Act & Assert - Backward
        Assert.assertTrue(it.hasPrevious());
        Assert.assertEquals("Third", it.previous());
        Assert.assertTrue(it.hasPrevious());
        Assert.assertEquals("Second", it.previous());
        Assert.assertTrue(it.hasPrevious());
        Assert.assertEquals("First", it.previous());
        Assert.assertFalse(it.hasPrevious());
    }

    @Test
    public void iterator_remove_shouldRemoveFromBothSetAndListOrder() {
        // Arrange
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("One");
        set.add("Two");
        set.add("Three");

        OrderedIterator<String> it = set.iterator();

        // Act
        Assert.assertEquals("One", it.next());
        Assert.assertEquals("Two", it.next());
        it.remove();

        // Assert
        Assert.assertEquals(2, set.size());
        Assert.assertFalse(set.contains("Two"));
        Assert.assertEquals("One", set.get(0));
        Assert.assertEquals("Three", set.get(1));
        Assert.assertEquals("Three", it.next());
    }
}