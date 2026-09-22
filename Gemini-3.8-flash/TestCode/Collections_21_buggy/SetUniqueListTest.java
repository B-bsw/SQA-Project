package org.apache.commons.collections4.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Assert;
import org.junit.Test;

public class SetUniqueListTest {

    // -------------------------------------------------------------------------
    // Factory method: setUniqueList(List)
    // -------------------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void setUniqueList_givenNullList_shouldThrowIllegalArgumentException() {
        // Arrange, Act & Assert
        SetUniqueList.setUniqueList(null);
    }

    @Test
    public void setUniqueList_givenEmptyList_shouldReturnEmptySetUniqueList() {
        // Arrange
        final List<String> list = new ArrayList<String>();

        // Act
        final SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(list);

        // Assert
        Assert.assertNotNull(uniqueList);
        Assert.assertTrue(uniqueList.isEmpty());
        Assert.assertEquals(0, uniqueList.size());
    }

    @Test
    public void setUniqueList_givenListWithDuplicates_shouldRetainFirstOccurrenceOnly() {
        // Arrange
        final List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("A");
        list.add("C");
        list.add("B");

        // Act
        final SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(list);

        // Assert
        Assert.assertEquals(3, uniqueList.size());
        Assert.assertEquals("A", uniqueList.get(0));
        Assert.assertEquals("B", uniqueList.get(1));
        Assert.assertEquals("C", uniqueList.get(2));
    }

    // -------------------------------------------------------------------------
    // Constructor
    // -------------------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenNullSet_shouldThrowIllegalArgumentException() {
        // Arrange
        final List<String> list = new ArrayList<String>();

        // Act & Assert
        new SetUniqueList<String>(list, null);
    }

    @Test(expected = NullPointerException.class)
    public void constructor_givenNullList_shouldThrowNullPointerException() {
        // Arrange
        final Set<String> set = new HashSet<String>();

        // Act & Assert
        new SetUniqueList<String>(null, set);
    }

    // -------------------------------------------------------------------------
    // asSet()
    // -------------------------------------------------------------------------

    @Test
    public void asSet_givenPopulatedList_shouldReturnUnmodifiableSetView() {
        // Arrange
        final List<String> list = new ArrayList<String>();
        list.add("One");
        list.add("Two");
        final SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(list);

        // Act
        final Set<String> setView = uniqueList.asSet();

        // Assert
        Assert.assertEquals(2, setView.size());
        Assert.assertTrue(setView.contains("One"));
        Assert.assertTrue(setView.contains("Two"));

        try {
            setView.add("Three");
            Assert.fail("Expected UnsupportedOperationException when mutating unmodifiable set");
        } catch (final UnsupportedOperationException ex) {
            // Success
        }
    }

    // -------------------------------------------------------------------------
    // add(E) & add(int, E)
    // -------------------------------------------------------------------------

    @Test
    public void add_givenUniqueElement_shouldAppendAndReturnTrue() {
        // Arrange
        final SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(new ArrayList<String>());

        // Act
        final boolean added = uniqueList.add("Alpha");

        // Assert
        Assert.assertTrue(added);
        Assert.assertEquals(1, uniqueList.size());
        Assert.assertEquals("Alpha", uniqueList.get(0));
        Assert.assertTrue(uniqueList.contains("Alpha"));
    }

    @Test
    public void add_givenDuplicateElement_shouldNotAddAndReturnFalse() {
        // Arrange
        final SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(new ArrayList<String>());
        uniqueList.add("Alpha");

        // Act
        final boolean addedAgain = uniqueList.add("Alpha");

        // Assert
        Assert.assertFalse(addedAgain);
        Assert.assertEquals(1, uniqueList.size());
    }

    @Test
    public void add_givenIndexAndUniqueElement_shouldInsertAtSpecifiedIndex() {
        // Arrange
        final SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(new ArrayList<String>());
        uniqueList.add("Alpha");
        uniqueList.add("Gamma");

        // Act
        uniqueList.add(1, "Beta");

        // Assert
        Assert.assertEquals(3, uniqueList.size());
        Assert.assertEquals("Alpha", uniqueList.get(0));
        Assert.assertEquals("Beta", uniqueList.get(1));
        Assert.assertEquals("Gamma", uniqueList.get(2));
    }

    @Test
    public void add_givenIndexAndDuplicateElement_shouldIgnoreInsertion() {
        // Arrange
        final SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(new ArrayList<String>());
        uniqueList.add("Alpha");
        uniqueList.add("Beta");

        // Act
        uniqueList.add(0, "Beta");

        // Assert
        Assert.assertEquals(2, uniqueList.size());
        Assert.assertEquals("Alpha", uniqueList.get(0));
        Assert.assertEquals("Beta", uniqueList.get(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void add_givenOutOfBoundsIndex_shouldThrowIndexOutOfBoundsException() {
        // Arrange
        final SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(new ArrayList<String>());

        // Act & Assert
        uniqueList.add(5, "Invalid");
    }

    // -------------------------------------------------------------------------
    // addAll(Collection) & addAll(int, Collection)
    // -------------------------------------------------------------------------

    @Test
    public void addAll_givenCollectionWithMixedElements_shouldAddOnlyUniqueOnes() {
        // Arrange
        final SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(new ArrayList<String>());
        uniqueList.add("A");

        final List<String> toAdd = new ArrayList<String>();
        toAdd.add("B");
        toAdd.add("A");
        toAdd.add("C");
        toAdd.add("B");

        // Act
        final boolean changed = uniqueList.addAll(toAdd);

        // Assert
        Assert.assertTrue(changed);
        Assert.assertEquals(3, uniqueList.size());
        Assert.assertEquals("A", uniqueList.get(0));
        Assert.assertEquals("B", uniqueList.get(1));
        Assert.assertEquals("C", uniqueList.get(2));
    }

    @Test
    public void addAll_givenAllDuplicateElements_shouldReturnFalseAndNotChangeList() {
        // Arrange
        final SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(new ArrayList<String>());
        uniqueList.add("A");
        uniqueList.add("B");

        final List<String> toAdd = new ArrayList<String>();
        toAdd.add("A");
        toAdd.add("B");

        // Act
        final boolean changed = uniqueList.addAll(toAdd);

        // Assert
        Assert.assertFalse(changed);
        Assert.assertEquals(2, uniqueList.size());
    }

    @Test
    public void addAll_givenIndexAndCollection_shouldInsertAtSpecifiedIndex() {
        // Arrange
        final SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(new ArrayList<String>());
        uniqueList.add("First");
        uniqueList.add("Last");

        final List<String> toAdd = new ArrayList<String>();
        toAdd.add("Second");
        toAdd.add("Third");

        // Act
        final boolean changed = uniqueList.addAll(1, toAdd);

        // Assert
        Assert.assertTrue(changed);
        Assert.assertEquals(4, uniqueList.size());
        Assert.assertEquals("First", uniqueList.get(0));
        Assert.assertEquals("Second", uniqueList.get(1));
        Assert.assertEquals("Third", uniqueList.get(2));
        Assert.assertEquals("Last", uniqueList.get(3));
    }

    // -------------------------------------------------------------------------
    // set(int, E)
    // -------------------------------------------------------------------------

    @Test
    public void set_givenNewElement_shouldReplaceAndReturnOldElement() {
        // Arrange
        final SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(new ArrayList<String>());
        uniqueList.add("A");
        uniqueList.add("B");

        // Act
        final String old = uniqueList.set(1, "Z");

        // Assert
        Assert.assertEquals("B", old);
        Assert.assertEquals(2, uniqueList.size());
        Assert.assertEquals("Z", uniqueList.get(1));
        Assert.assertFalse(uniqueList.contains("B"));
        Assert.assertTrue(uniqueList.contains("Z"));
    }

    @Test
    public void set_givenSameElementAtSameIndex_shouldRemainUnchanged() {
        // Arrange
        final SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(new ArrayList<String>());
        uniqueList.add("A");
        uniqueList.add("B");

        // Act
        final String old = uniqueList.set(1, "B");

        // Assert
        Assert.assertEquals("B", old);
        Assert.assertEquals(2, uniqueList.size());
        Assert.assertEquals("B", uniqueList.get(1));
        Assert.assertTrue(uniqueList.contains("B"));
    }

    @Test
    public void set_givenElementExistingAtDifferentLowerIndex_shouldMoveElementAndShrinkSize() {
        // Arrange: ["A", "B", "C"]
        final SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(new ArrayList<String>());
        uniqueList.add("A");
        uniqueList.add("B");
        uniqueList.add("C");

        // Act: setting index 2 to "A" (pos = 0, index = 2)
        final String old = uniqueList.set(2, "A");

        // Assert: old is "C", duplicate at index 0 removed, resulting in ["B", "A"]
        Assert.assertEquals("C", old);
        Assert.assertEquals(2, uniqueList.size());
        Assert.assertEquals("B", uniqueList.get(0));
        Assert.assertEquals("A", uniqueList.get(1));
        Assert.assertTrue(uniqueList.contains("A"));
        Assert.assertFalse(uniqueList.contains("C"));
    }

    @Test
    public void set_givenElementExistingAtDifferentHigherIndex_shouldMoveElementAndShrinkSize() {
        // Arrange: ["A", "B", "C"]
        final SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(new ArrayList<String>());
        uniqueList.add("A");
        uniqueList.add("B");
        uniqueList.add("C");

        // Act: setting index 0 to "C" (pos = 2, index = 0)
        final String old = uniqueList.set(0, "C");

        // Assert: old is "A", duplicate at index 2 removed, resulting in ["C", "B"]
        Assert.assertEquals("A", old);
        Assert.assertEquals(2, uniqueList.size());
        Assert.assertEquals("C", uniqueList.get(0));
        Assert.assertEquals("B", uniqueList.get(1));
        Assert.assertTrue(uniqueList.contains("C"));
        Assert.assertFalse(uniqueList.contains("A"));
    }

    // -------------------------------------------------------------------------
    // remove(Object) & remove(int)
    // -------------------------------------------------------------------------

    @Test
    public void remove_givenExistingObject_shouldRemoveFromListAndSetAndReturnTrue() {
        // Arrange
        final SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(new ArrayList<String>());
        uniqueList.add("A");
        uniqueList.add("B");

        // Act
        final boolean removed = uniqueList.remove("A");

        // Assert
        Assert.assertTrue(removed);
        Assert.assertEquals(1, uniqueList.size());
        Assert.assertFalse(uniqueList.contains("A"));
        Assert.assertEquals("B", uniqueList.get(0));
    }

    @Test
    public void remove_givenNonExistingObject_shouldReturnFalse() {
        // Arrange
        final SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(new ArrayList<String>());
        uniqueList.add("A");

        // Act
        final boolean removed = uniqueList.remove("NonExistent");

        // Assert
        Assert.assertFalse(removed);
        Assert.assertEquals(1, uniqueList.size());
    }

    @Test
    public void remove_givenValidIndex_shouldRemoveElementAndReturnIt() {
        // Arrange
        final SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(new ArrayList<String>());
        uniqueList.add("A");
        uniqueList.add("B");

        // Act
        final String removed = uniqueList.remove(0);

        // Assert
        Assert.assertEquals("A", removed);
        Assert.assertEquals(1, uniqueList.size());
        Assert.assertFalse(uniqueList.contains("A"));
        Assert.assertEquals("B", uniqueList.get(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void remove_givenInvalidIndex_shouldThrowIndexOutOfBoundsException() {
        // Arrange
        final SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(new ArrayList<String>());
        uniqueList.add("A");

        // Act & Assert
        uniqueList.remove(5);
    }

    // -------------------------------------------------------------------------
    // removeAll(Collection)
    // -------------------------------------------------------------------------

    @Test
    public void removeAll_givenMatchingElements_shouldRemoveThemAndReturnTrue() {
        // Arrange
        final SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(new ArrayList<String>());
        uniqueList.add("A");
        uniqueList.add("B");
        uniqueList.add("C");

        final List<String> toRemove = new ArrayList<String>();
        toRemove.add("A");
        toRemove.add("C");

        // Act
        final boolean changed = uniqueList.removeAll(toRemove);

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
        final SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(new ArrayList<String>());
        uniqueList.add("A");
        uniqueList.add("B");

        final List<String> toRemove = new ArrayList<String>();
        toRemove.add("X");
        toRemove.add("Y");

        // Act
        final boolean changed = uniqueList.removeAll(toRemove);

        // Assert
        Assert.assertFalse(changed);
        Assert.assertEquals(2, uniqueList.size());
    }

    // -------------------------------------------------------------------------
    // retainAll(Collection)
    // -------------------------------------------------------------------------

    @Test
    public void retainAll_givenCollectionContainingAllElements_shouldReturnFalse() {
        // Arrange
        final SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(new ArrayList<String>());
        uniqueList.add("A");
        uniqueList.add("B");

        final List<String> retainList = new ArrayList<String>();
        retainList.add("A");
        retainList.add("B");
        retainList.add("C");

        // Act
        final boolean changed = uniqueList.retainAll(retainList);

        // Assert
        Assert.assertFalse(changed);
        Assert.assertEquals(2, uniqueList.size());
    }

    @Test
    public void retainAll_givenDisjointCollection_shouldClearListAndReturnTrue() {
        // Arrange
        final SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(new ArrayList<String>());
        uniqueList.add("A");
        uniqueList.add("B");

        final List<String> retainList = new ArrayList<String>();
        retainList.add("X");
        retainList.add("Y");

        // Act
        final boolean changed = uniqueList.retainAll(retainList);

        // Assert
        Assert.assertTrue(changed);
        Assert.assertTrue(uniqueList.isEmpty());
        Assert.assertEquals(0, uniqueList.size());
        Assert.assertFalse(uniqueList.contains("A"));
    }

    @Test
    public void retainAll_givenPartialMatchCollection_shouldRetainMatchesAndReturnTrue() {
        // Arrange
        final SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(new ArrayList<String>());
        uniqueList.add("A");
        uniqueList.add("B");
        uniqueList.add("C");

        final List<String> retainList = new ArrayList<String>();
        retainList.add("B");

        // Act
        final boolean changed = uniqueList.retainAll(retainList);

        // Assert
        Assert.assertTrue(changed);
        Assert.assertEquals(1, uniqueList.size());
        Assert.assertEquals("B", uniqueList.get(0));
        Assert.assertFalse(uniqueList.contains("A"));
        Assert.assertFalse(uniqueList.contains("C"));
    }

    // -------------------------------------------------------------------------
    // clear(), contains(), containsAll()
    // -------------------------------------------------------------------------

    @Test
    public void clear_givenPopulatedList_shouldEmptyBothListAndSet() {
        // Arrange
        final SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(new ArrayList<String>());
        uniqueList.add("A");
        uniqueList.add("B");

        // Act
        uniqueList.clear();

        // Assert
        Assert.assertTrue(uniqueList.isEmpty());
        Assert.assertEquals(0, uniqueList.size());
        Assert.assertFalse(uniqueList.contains("A"));
        Assert.assertFalse(uniqueList.contains("B"));
    }

    @Test
    public void contains_givenExistingAndNonExisting_shouldReturnAccurateResults() {
        // Arrange
        final SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(new ArrayList<String>());
        uniqueList.add("Alpha");

        // Act & Assert
        Assert.assertTrue(uniqueList.contains("Alpha"));
        Assert.assertFalse(uniqueList.contains("Beta"));
        Assert.assertFalse(uniqueList.contains(null));
    }

    @Test
    public void containsAll_givenVariousCollections_shouldReturnAccurateResults() {
        // Arrange
        final SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(new ArrayList<String>());
        uniqueList.add("Alpha");
        uniqueList.add("Beta");

        final List<String> subset = new ArrayList<String>();
        subset.add("Alpha");

        final List<String> nonSubset = new ArrayList<String>();
        nonSubset.add("Alpha");
        nonSubset.add("Gamma");

        // Act & Assert
        Assert.assertTrue(uniqueList.containsAll(subset));
        Assert.assertFalse(uniqueList.containsAll(nonSubset));
    }

    // -------------------------------------------------------------------------
    // iterator() & SetListIterator
    // -------------------------------------------------------------------------

    @Test
    public void iterator_givenIterationAndRemove_shouldRemoveFromListAndSet() {
        // Arrange
        final SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(new ArrayList<String>());
        uniqueList.add("A");
        uniqueList.add("B");
        uniqueList.add("C");

        // Act
        final Iterator<String> iterator = uniqueList.iterator();
        Assert.assertTrue(iterator.hasNext());
        final String first = iterator.next();
        Assert.assertEquals("A", first);

        iterator.remove();

        // Assert
        Assert.assertEquals(2, uniqueList.size());
        Assert.assertFalse(uniqueList.contains("A"));
        Assert.assertEquals("B", uniqueList.get(0));
    }

    @Test(expected = IllegalStateException.class)
    public void iterator_givenRemoveBeforeNext_shouldThrowIllegalStateException() {
        // Arrange
        final SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(new ArrayList<String>());
        uniqueList.add("A");

        // Act & Assert
        final Iterator<String> iterator = uniqueList.iterator();
        iterator.remove();
    }

    // -------------------------------------------------------------------------
    // listIterator() & SetListListIterator
    // -------------------------------------------------------------------------

    @Test
    public void listIterator_givenBidirectionalIteration_shouldNavigateCorrectly() {
        // Arrange
        final SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(new ArrayList<String>());
        uniqueList.add("A");
        uniqueList.add("B");

        // Act & Assert
        final ListIterator<String> it = uniqueList.listIterator();
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
    public void listIterator_givenRemove_shouldRemoveFromListAndSet() {
        // Arrange
        final SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(new ArrayList<String>());
        uniqueList.add("A");
        uniqueList.add("B");

        // Act
        final ListIterator<String> it = uniqueList.listIterator();
        it.next();
        it.remove();

        // Assert
        Assert.assertEquals(1, uniqueList.size());
        Assert.assertFalse(uniqueList.contains("A"));
        Assert.assertEquals("B", uniqueList.get(0));
    }

    @Test
    public void listIterator_givenAddUnique_shouldInsertElement() {
        // Arrange
        final SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(new ArrayList<String>());
        uniqueList.add("A");
        uniqueList.add("C");

        // Act
        final ListIterator<String> it = uniqueList.listIterator();
        it.next(); // at "A"
        it.add("B");

        // Assert
        Assert.assertEquals(3, uniqueList.size());
        Assert.assertEquals("A", uniqueList.get(0));
        Assert.assertEquals("B", uniqueList.get(1));
        Assert.assertEquals("C", uniqueList.get(2));
        Assert.assertTrue(uniqueList.contains("B"));
    }

    @Test
    public void listIterator_givenAddDuplicate_shouldIgnoreAddition() {
        // Arrange
        final SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(new ArrayList<String>());
        uniqueList.add("A");
        uniqueList.add("B");

        // Act
        final ListIterator<String> it = uniqueList.listIterator();
        it.next();
        it.add("B");

        // Assert
        Assert.assertEquals(2, uniqueList.size());
        Assert.assertEquals("A", uniqueList.get(0));
        Assert.assertEquals("B", uniqueList.get(1));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void listIterator_givenSetCall_shouldThrowUnsupportedOperationException() {
        // Arrange
        final SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(new ArrayList<String>());
        uniqueList.add("A");

        final ListIterator<String> it = uniqueList.listIterator();
        it.next();

        // Act & Assert
        it.set("Modified");
    }

    @Test
    public void listIterator_givenSpecificIndex_shouldStartAtThatIndex() {
        // Arrange
        final SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(new ArrayList<String>());
        uniqueList.add("A");
        uniqueList.add("B");
        uniqueList.add("C");

        // Act
        final ListIterator<String> it = uniqueList.listIterator(1);

        // Assert
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("B", it.next());
    }

    // -------------------------------------------------------------------------
    // subList(int, int) & createSetBasedOnList
    // -------------------------------------------------------------------------

    @Test
    public void subList_givenDefaultHashSet_shouldReturnCorrectSubList() {
        // Arrange
        final SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(new ArrayList<String>());
        uniqueList.add("A");
        uniqueList.add("B");
        uniqueList.add("C");
        uniqueList.add("D");

        // Act
        final List<String> sub = uniqueList.subList(1, 3);

        // Assert
        Assert.assertEquals(2, sub.size());
        Assert.assertEquals("B", sub.get(0));
        Assert.assertEquals("C", sub.get(1));
        Assert.assertTrue(sub.contains("B"));
        Assert.assertTrue(sub.contains("C"));
        Assert.assertFalse(sub.contains("A"));
    }

    @Test
    public void subList_givenCustomTreeSet_shouldInstantiateSameSetType() {
        // Arrange
        final List<String> list = new ArrayList<String>();
        list.add("B");
        list.add("A");
        final Set<String> treeSet = new TreeSet<String>();
        treeSet.addAll(list);

        final SetUniqueList<String> uniqueList = new SetUniqueList<String>(list, treeSet);

        // Act
        final List<String> sub = uniqueList.subList(0, 1);

        // Assert
        Assert.assertEquals(1, sub.size());
        Assert.assertEquals("B", sub.get(0));
        Assert.assertTrue(sub instanceof SetUniqueList);
        final SetUniqueList<String> subUniqueList = (SetUniqueList<String>) sub;
        Assert.assertTrue(subUniqueList.set instanceof TreeSet);
    }

    public static class PrivateConstructorSet<E> extends HashSet<E> {
        private static final long serialVersionUID = 1L;

        private PrivateConstructorSet() {
            super();
        }

        public static <E> PrivateConstructorSet<E> create() {
            return new PrivateConstructorSet<E>();
        }
    }

    @Test
    public void subList_givenSetWithPrivateConstructor_shouldFallbackToHashSet() {
        // Arrange
        final List<String> list = new ArrayList<String>();
        list.add("Item1");
        final Set<String> privateSet = PrivateConstructorSet.create();
        privateSet.add("Item1");

        final SetUniqueList<String> uniqueList = new SetUniqueList<String>(list, privateSet);

        // Act
        final List<String> sub = uniqueList.subList(0, 1);

        // Assert
        Assert.assertEquals(1, sub.size());
        Assert.assertTrue(sub instanceof SetUniqueList);
        final SetUniqueList<String> subUniqueList = (SetUniqueList<String>) sub;
        Assert.assertTrue(subUniqueList.set instanceof HashSet);
    }

    public static abstract class AbstractTestSet<E> extends HashSet<E> {
        private static final long serialVersionUID = 1L;
    }

    public static class ConcreteAbstractSetSubclass<E> extends AbstractTestSet<E> {
        private static final long serialVersionUID = 1L;
    }

    @Test
    public void createSetBasedOnList_givenAbstractSetClass_shouldCatchInstantiationExceptionAndFallbackToHashSet() {
        // Arrange
        final List<String> list = new ArrayList<String>();
        list.add("Item1");
        final Set<String> set = new ConcreteAbstractSetSubclass<String>();
        set.add("Item1");

        final SetUniqueList<String> uniqueList = new SetUniqueList<String>(list, set);

        // Act: invoking createSetBasedOnList with anonymous abstract class instance
        final Set<String> abstractSetMock = new AbstractTestSet<String>() {
            private static final long serialVersionUID = 1L;
        };
        final Set<String> result = uniqueList.createSetBasedOnList(abstractSetMock, list);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(1, result.size());
        Assert.assertTrue(result.contains("Item1"));
        Assert.assertEquals(HashSet.class, result.getClass());
    }
}