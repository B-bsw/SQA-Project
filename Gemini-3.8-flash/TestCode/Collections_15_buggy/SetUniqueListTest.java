package org.apache.commons.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit 4 Test Suite for {@link SetUniqueList}.
 * Covers branch, line, and edge cases under legacy Java compatibility constraints.
 */
public class SetUniqueListTest {

    private List underlyingList;
    private Set underlyingSet;
    private SetUniqueList uniqueList;

    @Before
    public void setUp() {
        underlyingList = new ArrayList();
        underlyingSet = new HashSet();
        uniqueList = new SetUniqueList(underlyingList, underlyingSet);
    }

    // =========================================================================
    // Factory & Constructor Tests
    // =========================================================================

    @Test(expected = IllegalArgumentException.class)
    public void decorate_givenNullList_shouldThrowIllegalArgumentException() {
        // Arrange & Act & Assert
        SetUniqueList.decorate(null);
    }

    @Test
    public void decorate_givenEmptyList_shouldReturnEmptySetUniqueList() {
        // Arrange
        List empty = new ArrayList();

        // Act
        SetUniqueList result = SetUniqueList.decorate(empty);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result.isEmpty());
        Assert.assertEquals(0, result.size());
    }

    @Test
    public void decorate_givenListWithDuplicates_shouldRetainOrderAndRemoveDuplicates() {
        // Arrange
        List list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add("A");
        list.add("C");
        list.add("B");

        // Act
        SetUniqueList result = SetUniqueList.decorate(list);

        // Assert
        Assert.assertEquals(3, result.size());
        Assert.assertEquals("A", result.get(0));
        Assert.assertEquals("B", result.get(1));
        Assert.assertEquals("C", result.get(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenNullSet_shouldThrowIllegalArgumentException() {
        // Arrange & Act & Assert
        new SetUniqueList(new ArrayList(), null);
    }

    // =========================================================================
    // asSet Tests
    // =========================================================================

    @Test
    public void asSet_givenPopulatedList_shouldReturnUnmodifiableSetView() {
        // Arrange
        uniqueList.add("A");
        uniqueList.add("B");

        // Act
        Set setView = uniqueList.asSet();

        // Assert
        Assert.assertNotNull(setView);
        Assert.assertEquals(2, setView.size());
        Assert.assertTrue(setView.contains("A"));
        Assert.assertTrue(setView.contains("B"));

        try {
            setView.add("C");
            Assert.fail("asSet view should be unmodifiable");
        } catch (UnsupportedOperationException expected) {
            // Success
        }
    }

    // =========================================================================
    // add(Object) & add(int, Object) Tests
    // =========================================================================

    @Test
    public void add_givenUniqueElement_shouldReturnTrueAndIncreaseSize() {
        // Arrange & Act
        boolean added = uniqueList.add("A");

        // Assert
        Assert.assertTrue(added);
        Assert.assertEquals(1, uniqueList.size());
        Assert.assertEquals("A", uniqueList.get(0));
        Assert.assertTrue(uniqueList.contains("A"));
    }

    @Test
    public void add_givenDuplicateElement_shouldReturnFalseAndNotChangeSize() {
        // Arrange
        uniqueList.add("A");

        // Act
        boolean addedAgain = uniqueList.add("A");

        // Assert
        Assert.assertFalse(addedAgain);
        Assert.assertEquals(1, uniqueList.size());
    }

    @Test
    public void add_givenNullElement_shouldSupportNullValue() {
        // Arrange & Act
        boolean addedNull = uniqueList.add(null);
        boolean addedNullDuplicate = uniqueList.add(null);

        // Assert
        Assert.assertTrue(addedNull);
        Assert.assertFalse(addedNullDuplicate);
        Assert.assertEquals(1, uniqueList.size());
        Assert.assertNull(uniqueList.get(0));
        Assert.assertTrue(uniqueList.contains(null));
    }

    @Test
    public void addAtIndex_givenUniqueElement_shouldInsertAtSpecifiedIndex() {
        // Arrange
        uniqueList.add("A");
        uniqueList.add("C");

        // Act
        uniqueList.add(1, "B");

        // Assert
        Assert.assertEquals(3, uniqueList.size());
        Assert.assertEquals("A", uniqueList.get(0));
        Assert.assertEquals("B", uniqueList.get(1));
        Assert.assertEquals("C", uniqueList.get(2));
    }

    @Test
    public void addAtIndex_givenDuplicateElement_shouldIgnoreInsertion() {
        // Arrange
        uniqueList.add("A");
        uniqueList.add("B");

        // Act
        uniqueList.add(0, "B");

        // Assert
        Assert.assertEquals(2, uniqueList.size());
        Assert.assertEquals("A", uniqueList.get(0));
        Assert.assertEquals("B", uniqueList.get(1));
    }

    // =========================================================================
    // addAll(Collection) & addAll(int, Collection) Tests
    // =========================================================================

    @Test
    public void addAll_givenCollectionWithMixedElements_shouldAddOnlyUnique() {
        // Arrange
        uniqueList.add("A");
        List toAdd = new ArrayList();
        toAdd.add("B");
        toAdd.add("A");
        toAdd.add("C");
        toAdd.add("B");

        // Act
        boolean changed = uniqueList.addAll(toAdd);

        // Assert
        Assert.assertTrue(changed);
        Assert.assertEquals(3, uniqueList.size());
        Assert.assertEquals("A", uniqueList.get(0));
        Assert.assertEquals("B", uniqueList.get(1));
        Assert.assertEquals("C", uniqueList.get(2));
    }

    @Test
    public void addAll_givenCollectionWithOnlyExistingElements_shouldReturnFalse() {
        // Arrange
        uniqueList.add("A");
        uniqueList.add("B");
        List toAdd = new ArrayList();
        toAdd.add("A");
        toAdd.add("B");

        // Act
        boolean changed = uniqueList.addAll(toAdd);

        // Assert
        Assert.assertFalse(changed);
        Assert.assertEquals(2, uniqueList.size());
    }

    @Test
    public void addAllAtIndex_givenMixedElements_shouldInsertAtCorrectPositions() {
        // Arrange
        uniqueList.add("A");
        uniqueList.add("D");

        List toAdd = new ArrayList();
        toAdd.add("B");
        toAdd.add("A"); // Duplicate, ignored, index should not increment
        toAdd.add("C");

        // Act
        boolean changed = uniqueList.addAll(1, toAdd);

        // Assert
        Assert.assertTrue(changed);
        Assert.assertEquals(4, uniqueList.size());
        Assert.assertEquals("A", uniqueList.get(0));
        Assert.assertEquals("B", uniqueList.get(1));
        Assert.assertEquals("C", uniqueList.get(2));
        Assert.assertEquals("D", uniqueList.get(3));
    }

    @Test
    public void addAllAtIndex_givenEmptyCollection_shouldReturnFalse() {
        // Arrange
        uniqueList.add("A");

        // Act
        boolean changed = uniqueList.addAll(0, new ArrayList());

        // Assert
        Assert.assertFalse(changed);
        Assert.assertEquals(1, uniqueList.size());
    }

    // =========================================================================
    // set(int, Object) Tests
    // =========================================================================

    @Test
    public void set_givenNewElement_shouldReplaceAndReturnPrevious() {
        // Arrange
        uniqueList.add("A");
        uniqueList.add("B");

        // Act
        Object previous = uniqueList.set(1, "C");

        // Assert
        Assert.assertEquals("B", previous);
        Assert.assertEquals(2, uniqueList.size());
        Assert.assertEquals("A", uniqueList.get(0));
        Assert.assertEquals("C", uniqueList.get(1));
        Assert.assertFalse(uniqueList.contains("B"));
        Assert.assertTrue(uniqueList.contains("C"));
    }

    @Test
    public void set_givenSameElementAtSameIndex_shouldReturnSameElement() {
        // Arrange
        uniqueList.add("A");
        uniqueList.add("B");

        // Act
        Object previous = uniqueList.set(1, "B");

        // Assert
        Assert.assertEquals("B", previous);
        Assert.assertEquals(2, uniqueList.size());
        Assert.assertEquals("B", uniqueList.get(1));
    }

    @Test
    public void set_givenElementExistingAtHigherIndex_shouldReplaceAndRemoveOldDuplicate() {
        // Arrange
        uniqueList.add("A");
        uniqueList.add("B");
        uniqueList.add("C");

        // Act: replacing index 0 ("A") with "C" (which is currently at index 2)
        Object previous = uniqueList.set(0, "C");

        // Assert
        Assert.assertEquals("A", previous);
        Assert.assertEquals(2, uniqueList.size());
        Assert.assertEquals("C", uniqueList.get(0));
        Assert.assertEquals("B", uniqueList.get(1));
        Assert.assertFalse(uniqueList.contains("A"));
        Assert.assertTrue(uniqueList.contains("C"));
        Assert.assertTrue(uniqueList.contains("B"));
    }

    @Test
    public void set_givenElementExistingAtLowerIndex_shouldReplaceAndRemoveOldDuplicate() {
        // Arrange
        uniqueList.add("A");
        uniqueList.add("B");
        uniqueList.add("C");

        // Act: replacing index 2 ("C") with "A" (which is currently at index 0)
        Object previous = uniqueList.set(2, "A");

        // Assert
        Assert.assertEquals("C", previous);
        Assert.assertEquals(2, uniqueList.size());
        Assert.assertEquals("B", uniqueList.get(0));
        Assert.assertEquals("A", uniqueList.get(1));
        Assert.assertFalse(uniqueList.contains("C"));
        Assert.assertTrue(uniqueList.contains("A"));
        Assert.assertTrue(uniqueList.contains("B"));
    }

    // =========================================================================
    // remove, removeAll, retainAll & clear Tests
    // =========================================================================

    @Test
    public void removeObject_givenExistingElement_shouldRemoveFromListAndSet() {
        // Arrange
        uniqueList.add("A");
        uniqueList.add("B");

        // Act
        boolean removed = uniqueList.remove("A");

        // Assert
        Assert.assertTrue(removed);
        Assert.assertEquals(1, uniqueList.size());
        Assert.assertFalse(uniqueList.contains("A"));
    }

    @Test
    public void removeObject_givenNonExistingElement_shouldReturnFalse() {
        // Arrange
        uniqueList.add("A");

        // Act
        boolean removed = uniqueList.remove("Z");

        // Assert
        Assert.assertFalse(removed);
        Assert.assertEquals(1, uniqueList.size());
    }

    @Test
    public void removeIndex_givenValidIndex_shouldReturnRemovedElement() {
        // Arrange
        uniqueList.add("A");
        uniqueList.add("B");

        // Act
        Object removed = uniqueList.remove(0);

        // Assert
        Assert.assertEquals("A", removed);
        Assert.assertEquals(1, uniqueList.size());
        Assert.assertFalse(uniqueList.contains("A"));
    }

    @Test
    public void removeAll_givenMatchingCollection_shouldRemoveAndReturnTrue() {
        // Arrange
        uniqueList.add("A");
        uniqueList.add("B");
        uniqueList.add("C");

        List toRemove = new ArrayList();
        toRemove.add("A");
        toRemove.add("C");

        // Act
        boolean changed = uniqueList.removeAll(toRemove);

        // Assert
        Assert.assertTrue(changed);
        Assert.assertEquals(1, uniqueList.size());
        Assert.assertEquals("B", uniqueList.get(0));
        Assert.assertFalse(uniqueList.contains("A"));
        Assert.assertFalse(uniqueList.contains("C"));
    }

    @Test
    public void removeAll_givenNoMatchingElements_shouldReturnFalse() {
        // Arrange
        uniqueList.add("A");
        List toRemove = new ArrayList();
        toRemove.add("X");

        // Act
        boolean changed = uniqueList.removeAll(toRemove);

        // Assert
        Assert.assertFalse(changed);
        Assert.assertEquals(1, uniqueList.size());
    }

    @Test
    public void retainAll_givenSubset_shouldRetainOnlyGivenAndReturnTrue() {
        // Arrange
        uniqueList.add("A");
        uniqueList.add("B");
        uniqueList.add("C");

        List toRetain = new ArrayList();
        toRetain.add("B");

        // Act
        boolean changed = uniqueList.retainAll(toRetain);

        // Assert
        Assert.assertTrue(changed);
        Assert.assertEquals(1, uniqueList.size());
        Assert.assertEquals("B", uniqueList.get(0));
        Assert.assertFalse(uniqueList.contains("A"));
        Assert.assertTrue(uniqueList.contains("B"));
        Assert.assertFalse(uniqueList.contains("C"));
    }

    @Test
    public void retainAll_givenIdenticalCollection_shouldReturnFalse() {
        // Arrange
        uniqueList.add("A");
        uniqueList.add("B");

        List toRetain = new ArrayList();
        toRetain.add("A");
        toRetain.add("B");

        // Act
        boolean changed = uniqueList.retainAll(toRetain);

        // Assert
        Assert.assertFalse(changed);
        Assert.assertEquals(2, uniqueList.size());
    }

    @Test
    public void clear_givenPopulatedList_shouldEmptyBothListAndSet() {
        // Arrange
        uniqueList.add("A");
        uniqueList.add("B");

        // Act
        uniqueList.clear();

        // Assert
        Assert.assertEquals(0, uniqueList.size());
        Assert.assertFalse(uniqueList.contains("A"));
        Assert.assertFalse(uniqueList.contains("B"));
        Assert.assertTrue(uniqueList.isEmpty());
    }

    // =========================================================================
    // contains & containsAll Tests
    // =========================================================================

    @Test
    public void contains_givenVariousElements_shouldCheckInternalSetCorrectly() {
        // Arrange
        uniqueList.add("A");

        // Act & Assert
        Assert.assertTrue(uniqueList.contains("A"));
        Assert.assertFalse(uniqueList.contains("B"));
    }

    @Test
    public void containsAll_givenVariousCollections_shouldReturnCorrectResult() {
        // Arrange
        uniqueList.add("A");
        uniqueList.add("B");

        List match = Arrays.asList(new Object[]{"A", "B"});
        List partial = Arrays.asList(new Object[]{"A", "C"});

        // Act & Assert
        Assert.assertTrue(uniqueList.containsAll(match));
        Assert.assertFalse(uniqueList.containsAll(partial));
    }

    // =========================================================================
    // Iterator & SetListIterator Tests
    // =========================================================================

    @Test
    public void iterator_remove_shouldRemoveFromListAndSet() {
        // Arrange
        uniqueList.add("A");
        uniqueList.add("B");

        // Act
        Iterator it = uniqueList.iterator();
        Assert.assertTrue(it.hasNext());
        Object next1 = it.next();
        Assert.assertEquals("A", next1);
        it.remove();

        // Assert
        Assert.assertEquals(1, uniqueList.size());
        Assert.assertFalse(uniqueList.contains("A"));
        Assert.assertTrue(uniqueList.contains("B"));
        Assert.assertEquals("B", uniqueList.get(0));
    }

    // =========================================================================
    // ListIterator & SetListListIterator Tests
    // =========================================================================

    @Test
    public void listIterator_traversalAndRemove_shouldMaintainUniqueness() {
        // Arrange
        uniqueList.add("A");
        uniqueList.add("B");
        uniqueList.add("C");

        ListIterator lit = uniqueList.listIterator();

        // Act
        Assert.assertTrue(lit.hasNext());
        Assert.assertEquals("A", lit.next());
        Assert.assertEquals("B", lit.next());
        Assert.assertEquals("B", lit.previous());
        Assert.assertEquals("B", lit.next());
        lit.remove();

        // Assert
        Assert.assertEquals(2, uniqueList.size());
        Assert.assertFalse(uniqueList.contains("B"));
        Assert.assertEquals("A", uniqueList.get(0));
        Assert.assertEquals("C", uniqueList.get(1));
    }

    @Test
    public void listIterator_add_givenUniqueElement_shouldInsertSuccessfully() {
        // Arrange
        uniqueList.add("A");
        uniqueList.add("C");

        ListIterator lit = uniqueList.listIterator(1);

        // Act
        lit.add("B");

        // Assert
        Assert.assertEquals(3, uniqueList.size());
        Assert.assertEquals("A", uniqueList.get(0));
        Assert.assertEquals("B", uniqueList.get(1));
        Assert.assertEquals("C", uniqueList.get(2));
        Assert.assertTrue(uniqueList.contains("B"));
    }

    @Test
    public void listIterator_add_givenDuplicateElement_shouldIgnoreInsert() {
        // Arrange
        uniqueList.add("A");
        uniqueList.add("B");

        ListIterator lit = uniqueList.listIterator();
        lit.next(); // at "A"

        // Act
        lit.add("B"); // duplicate of existing element

        // Assert
        Assert.assertEquals(2, uniqueList.size());
        Assert.assertEquals("A", uniqueList.get(0));
        Assert.assertEquals("B", uniqueList.get(1));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void listIterator_set_shouldThrowUnsupportedOperationException() {
        // Arrange
        uniqueList.add("A");
        ListIterator lit = uniqueList.listIterator();
        lit.next();

        // Act & Assert
        lit.set("Z");
    }

    // =========================================================================
    // subList Tests
    // =========================================================================

    @Test
    public void subList_givenValidRange_shouldReturnFunctionalSetUniqueList() {
        // Arrange
        uniqueList.add("A");
        uniqueList.add("B");
        uniqueList.add("C");
        uniqueList.add("D");

        // Act
        List sub = uniqueList.subList(1, 3);

        // Assert
        Assert.assertTrue(sub instanceof SetUniqueList);
        Assert.assertEquals(2, sub.size());
        Assert.assertEquals("B", sub.get(0));
        Assert.assertEquals("C", sub.get(1));

        // Add duplicate existing in main set into sublist
        boolean addedDup = sub.add("A");
        Assert.assertFalse(addedDup);
        Assert.assertEquals(2, sub.size());

        // Add new unique element into sublist
        boolean addedNew = sub.add("E");
        Assert.assertTrue(addedNew);
        Assert.assertEquals(3, sub.size());
        Assert.assertTrue(uniqueList.contains("E"));
    }
}