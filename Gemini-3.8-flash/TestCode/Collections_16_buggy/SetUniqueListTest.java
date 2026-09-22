package org.apache.commons.collections.list;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class SetUniqueListTest {

    // ==========================================
    // 1. Factory method & Constructor Tests
    // ==========================================

    @Test(expected = IllegalArgumentException.class)
    public void decorate_givenNullList_shouldThrowIllegalArgumentException() {
        // Arrange & Act & Assert
        SetUniqueList.decorate(null);
    }

    @Test
    public void decorate_givenEmptyList_shouldReturnEmptySetUniqueList() {
        // Arrange
        List emptyList = new ArrayList();

        // Act
        SetUniqueList list = SetUniqueList.decorate(emptyList);

        // Assert
        Assert.assertNotNull(list);
        Assert.assertTrue(list.isEmpty());
        Assert.assertEquals(0, list.size());
    }

    @Test
    public void decorate_givenListWithDuplicates_shouldRetainFirstOccurrenceOnly() {
        // Arrange
        List sourceList = new ArrayList();
        sourceList.add("A");
        sourceList.add("B");
        sourceList.add("A");
        sourceList.add("C");
        sourceList.add("B");

        // Act
        SetUniqueList list = SetUniqueList.decorate(sourceList);

        // Assert
        Assert.assertEquals(3, list.size());
        Assert.assertEquals("A", list.get(0));
        Assert.assertEquals("B", list.get(1));
        Assert.assertEquals("C", list.get(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenNullSet_shouldThrowIllegalArgumentException() {
        // Arrange
        List rawList = new ArrayList();

        // Act & Assert
        new SetUniqueList(rawList, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenNullList_shouldThrowIllegalArgumentException() {
        // Arrange
        Set rawSet = new HashSet();

        // Act & Assert
        new SetUniqueList(null, rawSet);
    }

    // ==========================================
    // 2. asSet() Tests
    // ==========================================

    @Test
    public void asSet_givenPopulatedList_shouldReturnUnmodifiableSetView() {
        // Arrange
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("Alpha");
        list.add("Beta");

        // Act
        Set setView = list.asSet();

        // Assert
        Assert.assertEquals(2, setView.size());
        Assert.assertTrue(setView.contains("Alpha"));
        Assert.assertTrue(setView.contains("Beta"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void asSet_whenAttemptingToModify_shouldThrowUnsupportedOperationException() {
        // Arrange
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("Alpha");
        Set setView = list.asSet();

        // Act & Assert
        setView.add("Gamma");
    }

    // ==========================================
    // 3. add(Object) & add(int, Object) Tests
    // ==========================================

    @Test
    public void add_givenNewElement_shouldReturnTrueAndAppendToList() {
        // Arrange
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());

        // Act
        boolean added = list.add("Element1");

        // Assert
        Assert.assertTrue(added);
        Assert.assertEquals(1, list.size());
        Assert.assertEquals("Element1", list.get(0));
        Assert.assertTrue(list.contains("Element1"));
    }

    @Test
    public void add_givenDuplicateElement_shouldReturnFalseAndNotChangeList() {
        // Arrange
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("Element1");

        // Act
        boolean addedAgain = list.add("Element1");

        // Assert
        Assert.assertFalse(addedAgain);
        Assert.assertEquals(1, list.size());
    }

    @Test
    public void add_givenNullElement_shouldAllowAddingNullOnce() {
        // Arrange
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());

        // Act
        boolean firstAdd = list.add(null);
        boolean secondAdd = list.add(null);

        // Assert
        Assert.assertTrue(firstAdd);
        Assert.assertFalse(secondAdd);
        Assert.assertEquals(1, list.size());
        Assert.assertNull(list.get(0));
        Assert.assertTrue(list.contains(null));
    }

    @Test
    public void addAtIndex_givenNewElement_shouldInsertAtSpecifiedIndex() {
        // Arrange
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");
        list.add("C");

        // Act
        list.add(1, "B");

        // Assert
        Assert.assertEquals(3, list.size());
        Assert.assertEquals("A", list.get(0));
        Assert.assertEquals("B", list.get(1));
        Assert.assertEquals("C", list.get(2));
        Assert.assertTrue(list.contains("B"));
    }

    @Test
    public void addAtIndex_givenDuplicateElement_shouldSilentlyIgnore() {
        // Arrange
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");
        list.add("B");

        // Act
        list.add(0, "B");

        // Assert
        Assert.assertEquals(2, list.size());
        Assert.assertEquals("A", list.get(0));
        Assert.assertEquals("B", list.get(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void addAtIndex_givenNegativeIndex_shouldThrowIndexOutOfBoundsException() {
        // Arrange
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());

        // Act & Assert
        list.add(-1, "A");
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void addAtIndex_givenIndexGreaterThanSize_shouldThrowIndexOutOfBoundsException() {
        // Arrange
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());

        // Act & Assert
        list.add(1, "A");
    }

    // ==========================================
    // 4. addAll(Collection) & addAll(int, Collection) Tests
    // ==========================================

    @Test
    public void addAll_givenCollectionWithUniqueElements_shouldAppendAllAndReturnTrue() {
        // Arrange
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");

        Collection toAdd = new ArrayList();
        toAdd.add("B");
        toAdd.add("C");

        // Act
        boolean changed = list.addAll(toAdd);

        // Assert
        Assert.assertTrue(changed);
        Assert.assertEquals(3, list.size());
        Assert.assertEquals("A", list.get(0));
        Assert.assertEquals("B", list.get(1));
        Assert.assertEquals("C", list.get(2));
    }

    @Test
    public void addAll_givenCollectionWithInternalAndExistingDuplicates_shouldOnlyAddUnseen() {
        // Arrange
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");
        list.add("B");

        Collection toAdd = new ArrayList();
        toAdd.add("B");
        toAdd.add("C");
        toAdd.add("C");
        toAdd.add("D");

        // Act
        boolean changed = list.addAll(toAdd);

        // Assert
        Assert.assertTrue(changed);
        Assert.assertEquals(4, list.size());
        Assert.assertEquals("A", list.get(0));
        Assert.assertEquals("B", list.get(1));
        Assert.assertEquals("C", list.get(2));
        Assert.assertEquals("D", list.get(3));
    }

    @Test
    public void addAll_givenCollectionWithAllDuplicates_shouldReturnFalse() {
        // Arrange
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");
        list.add("B");

        Collection toAdd = new ArrayList();
        toAdd.add("A");
        toAdd.add("B");

        // Act
        boolean changed = list.addAll(toAdd);

        // Assert
        Assert.assertFalse(changed);
        Assert.assertEquals(2, list.size());
    }

    @Test
    public void addAll_givenEmptyCollection_shouldReturnFalse() {
        // Arrange
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");

        // Act
        boolean changed = list.addAll(new ArrayList());

        // Assert
        Assert.assertFalse(changed);
        Assert.assertEquals(1, list.size());
    }

    @Test
    public void addAllAtIndex_givenCollectionWithUniqueElements_shouldInsertInOrderAndReturnTrue() {
        // Arrange
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");
        list.add("D");

        Collection toAdd = new ArrayList();
        toAdd.add("B");
        toAdd.add("C");

        // Act
        boolean changed = list.addAll(1, toAdd);

        // Assert
        Assert.assertTrue(changed);
        Assert.assertEquals(4, list.size());
        Assert.assertEquals("A", list.get(0));
        Assert.assertEquals("B", list.get(1));
        Assert.assertEquals("C", list.get(2));
        Assert.assertEquals("D", list.get(3));
    }

    @Test
    public void addAllAtIndex_givenCollectionWithSomeDuplicates_shouldOnlyIncrementIndexForInserted() {
        // Arrange
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");
        list.add("C");

        Collection toAdd = new ArrayList();
        toAdd.add("A"); // Duplicate, ignored
        toAdd.add("B"); // Added at index 1
        toAdd.add("B"); // Duplicate, ignored
        toAdd.add("D"); // Added at index 2

        // Act
        boolean changed = list.addAll(1, toAdd);

        // Assert
        Assert.assertTrue(changed);
        Assert.assertEquals(4, list.size());
        Assert.assertEquals("A", list.get(0));
        Assert.assertEquals("B", list.get(1));
        Assert.assertEquals("D", list.get(2));
        Assert.assertEquals("C", list.get(3));
    }

    // ==========================================
    // 5. set(int, Object) Tests
    // ==========================================

    @Test
    public void set_givenNewElement_shouldReplaceOldElement() {
        // Arrange
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");
        list.add("B");

        // Act
        Object removed = list.set(1, "C");

        // Assert
        Assert.assertEquals("B", removed);
        Assert.assertEquals(2, list.size());
        Assert.assertEquals("A", list.get(0));
        Assert.assertEquals("C", list.get(1));
        Assert.assertFalse(list.contains("B"));
        Assert.assertTrue(list.contains("C"));
    }

    @Test
    public void set_givenElementPresentAtHigherIndex_shouldReplaceAndRemoveDuplicate() {
        // Arrange
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");
        list.add("B");
        list.add("C");

        // Act: replacing index 0 ("A") with "C" (which is currently at index 2)
        Object removed = list.set(0, "C");

        // Assert
        Assert.assertEquals("A", removed);
        Assert.assertEquals(2, list.size());
        Assert.assertEquals("C", list.get(0));
        Assert.assertEquals("B", list.get(1));
        Assert.assertTrue(list.contains("C"));
        Assert.assertFalse(list.contains("A"));
    }

    @Test
    public void set_givenElementPresentAtLowerIndex_shouldReplaceAndRemoveDuplicate() {
        // Arrange
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");
        list.add("B");
        list.add("C");

        // Act: replacing index 2 ("C") with "A" (which is currently at index 0)
        Object removed = list.set(2, "A");

        // Assert
        Assert.assertEquals("C", removed);
        Assert.assertEquals(2, list.size());
        Assert.assertEquals("B", list.get(0));
        Assert.assertEquals("A", list.get(1));
        Assert.assertTrue(list.contains("A"));
        Assert.assertFalse(list.contains("C"));
    }

    @Test
    public void set_givenSameElementAtSameIndex_shouldRetainElementInList() {
        // Arrange
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");
        list.add("B");

        // Act
        Object removed = list.set(0, "A");

        // Assert
        Assert.assertEquals("A", removed);
        Assert.assertEquals(2, list.size());
        Assert.assertEquals("A", list.get(0));
        Assert.assertEquals("B", list.get(1));
    }

    // ==========================================
    // 6. remove(Object), remove(int), removeAll, retainAll Tests
    // ==========================================

    @Test
    public void removeObject_givenExistingElement_shouldRemoveFromListAndSet() {
        // Arrange
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");
        list.add("B");

        // Act
        boolean removed = list.remove("A");

        // Assert
        Assert.assertTrue(removed);
        Assert.assertEquals(1, list.size());
        Assert.assertEquals("B", list.get(0));
        Assert.assertFalse(list.contains("A"));
    }

    @Test
    public void removeObject_givenNonExistingElement_shouldReturnFalse() {
        // Arrange
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");

        // Act
        boolean removed = list.remove("Z");

        // Assert
        Assert.assertFalse(removed);
        Assert.assertEquals(1, list.size());
        Assert.assertTrue(list.contains("A"));
    }

    @Test
    public void removeIndex_givenValidIndex_shouldReturnElementAndRemoveFromSet() {
        // Arrange
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");
        list.add("B");

        // Act
        Object removed = list.remove(0);

        // Assert
        Assert.assertEquals("A", removed);
        Assert.assertEquals(1, list.size());
        Assert.assertFalse(list.contains("A"));
        Assert.assertTrue(list.contains("B"));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void removeIndex_givenInvalidIndex_shouldThrowIndexOutOfBoundsException() {
        // Arrange
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");

        // Act & Assert
        list.remove(1);
    }

    @Test
    public void removeAll_givenMatchingCollection_shouldRemoveAllAndReturnTrue() {
        // Arrange
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");
        list.add("B");
        list.add("C");

        Collection toRemove = new ArrayList();
        toRemove.add("A");
        toRemove.add("C");

        // Act
        boolean modified = list.removeAll(toRemove);

        // Assert
        Assert.assertTrue(modified);
        Assert.assertEquals(1, list.size());
        Assert.assertEquals("B", list.get(0));
        Assert.assertFalse(list.contains("A"));
        Assert.assertFalse(list.contains("C"));
    }

    @Test
    public void removeAll_givenNonMatchingCollection_shouldReturnFalse() {
        // Arrange
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");
        list.add("B");

        Collection toRemove = new ArrayList();
        toRemove.add("X");
        toRemove.add("Y");

        // Act
        boolean modified = list.removeAll(toRemove);

        // Assert
        Assert.assertFalse(modified);
        Assert.assertEquals(2, list.size());
    }

    @Test
    public void retainAll_givenPartialMatchingCollection_shouldRetainMatchingAndReturnTrue() {
        // Arrange
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");
        list.add("B");
        list.add("C");

        Collection toRetain = new ArrayList();
        toRetain.add("B");
        toRetain.add("D");

        // Act
        boolean modified = list.retainAll(toRetain);

        // Assert
        Assert.assertTrue(modified);
        Assert.assertEquals(1, list.size());
        Assert.assertEquals("B", list.get(0));
        Assert.assertFalse(list.contains("A"));
        Assert.assertTrue(list.contains("B"));
        Assert.assertFalse(list.contains("C"));
    }

    @Test
    public void retainAll_givenCollectionContainingAll_shouldReturnFalse() {
        // Arrange
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");
        list.add("B");

        Collection toRetain = new ArrayList();
        toRetain.add("A");
        toRetain.add("B");
        toRetain.add("C");

        // Act
        boolean modified = list.retainAll(toRetain);

        // Assert
        Assert.assertFalse(modified);
        Assert.assertEquals(2, list.size());
    }

    @Test
    public void clear_givenNonEmptyList_shouldClearListAndSet() {
        // Arrange
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");
        list.add("B");

        // Act
        list.clear();

        // Assert
        Assert.assertTrue(list.isEmpty());
        Assert.assertEquals(0, list.size());
        Assert.assertFalse(list.contains("A"));
        Assert.assertFalse(list.contains("B"));
    }

    // ==========================================
    // 7. contains & containsAll Tests
    // ==========================================

    @Test
    public void contains_givenContainedAndNonContainedElements_shouldReturnExpected() {
        // Arrange
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");

        // Act & Assert
        Assert.assertTrue(list.contains("A"));
        Assert.assertFalse(list.contains("B"));
    }

    @Test
    public void containsAll_givenVariousCollections_shouldReturnExpectedBoolean() {
        // Arrange
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");
        list.add("B");

        Collection allMatch = Arrays.asList(new Object[]{"A", "B"});
        Collection partialMatch = Arrays.asList(new Object[]{"A", "Z"});

        // Act & Assert
        Assert.assertTrue(list.containsAll(allMatch));
        Assert.assertFalse(list.containsAll(partialMatch));
    }

    // ==========================================
    // 8. subList Tests
    // ==========================================

    @Test
    public void subList_givenValidRange_shouldReturnNewSetUniqueListSharingSet() {
        // Arrange
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        // Act
        List sub = list.subList(1, 3);

        // Assert
        Assert.assertTrue(sub instanceof SetUniqueList);
        Assert.assertEquals(2, sub.size());
        Assert.assertEquals("B", sub.get(0));
        Assert.assertEquals("C", sub.get(1));
    }

    @Test
    public void subList_whenElementAddedToSubList_shouldAffectParentListSet() {
        // Arrange
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");
        list.add("B");
        List sub = list.subList(0, 1);

        // Act
        boolean addedDuplicate = sub.add("B"); // "B" already in list's set
        boolean addedNew = sub.add("C");       // "C" is unique

        // Assert
        Assert.assertFalse(addedDuplicate);
        Assert.assertTrue(addedNew);
        Assert.assertTrue(list.contains("C"));
    }

    // ==========================================
    // 9. Iterator (SetListIterator) Tests
    // ==========================================

    @Test
    public void iterator_nextAndRemove_shouldRemoveFromListAndSet() {
        // Arrange
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");
        list.add("B");
        list.add("C");

        // Act
        Iterator it = list.iterator();
        Assert.assertTrue(it.hasNext());
        Object first = it.next();
        Assert.assertEquals("A", first);
        it.remove();

        // Assert
        Assert.assertEquals(2, list.size());
        Assert.assertEquals("B", list.get(0));
        Assert.assertFalse(list.contains("A"));
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("B", it.next());
    }

    @Test(expected = IllegalStateException.class)
    public void iterator_removeTwiceInRow_shouldThrowIllegalStateException() {
        // Arrange
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");
        Iterator it = list.iterator();

        // Act
        it.next();
        it.remove();
        it.remove(); // Illegal second call
    }

    // ==========================================
    // 10. ListIterator (SetListListIterator) Tests
    // ==========================================

    @Test
    public void listIterator_traverseForwardAndBackward_shouldFunctionCorrectly() {
        // Arrange
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");
        list.add("B");

        ListIterator it = list.listIterator();

        // Act & Assert
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("A", it.next());
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("B", it.next());
        Assert.assertFalse(it.hasNext());

        Assert.assertTrue(it.hasPrevious());
        Assert.assertEquals("B", it.previous());
        Assert.assertTrue(it.hasPrevious());
        Assert.assertEquals("A", it.previous());
        Assert.assertFalse(it.hasPrevious());
    }

    @Test
    public void listIterator_removeAfterPrevious_shouldRemoveFromListAndSet() {
        // Arrange
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");
        list.add("B");

        ListIterator it = list.listIterator();
        it.next();
        it.next(); // at "B"

        // Act
        Object prev = it.previous(); // prev is "B"
        Assert.assertEquals("B", prev);
        it.remove();

        // Assert
        Assert.assertEquals(1, list.size());
        Assert.assertEquals("A", list.get(0));
        Assert.assertFalse(list.contains("B"));
    }

    @Test
    public void listIterator_addUniqueElement_shouldInsertAndTrackInSet() {
        // Arrange
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");
        list.add("C");

        ListIterator it = list.listIterator();
        it.next(); // past "A"

        // Act
        it.add("B");

        // Assert
        Assert.assertEquals(3, list.size());
        Assert.assertEquals("A", list.get(0));
        Assert.assertEquals("B", list.get(1));
        Assert.assertEquals("C", list.get(2));
        Assert.assertTrue(list.contains("B"));
    }

    @Test
    public void listIterator_addDuplicateElement_shouldIgnoreAddition() {
        // Arrange
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");
        list.add("B");

        ListIterator it = list.listIterator();
        it.next(); // past "A"

        // Act
        it.add("B"); // duplicate of existing "B"

        // Assert
        Assert.assertEquals(2, list.size());
        Assert.assertEquals("A", list.get(0));
        Assert.assertEquals("B", list.get(1));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void listIterator_set_shouldThrowUnsupportedOperationException() {
        // Arrange
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");
        ListIterator it = list.listIterator();
        it.next();

        // Act & Assert
        it.set("Z");
    }

    @Test
    public void listIteratorWithIndex_givenValidIndex_shouldStartAtPosition() {
        // Arrange
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");
        list.add("B");
        list.add("C");

        // Act
        ListIterator it = list.listIterator(1);

        // Assert
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("B", it.next());
    }
}