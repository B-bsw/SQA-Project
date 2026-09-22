package org.apache.commons.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Assert;
import org.junit.Test;

/**
 * Complete JUnit 4 Test Suite for {@link SetUniqueList}.
 * Target coverage: maximum line, branch, and edge-case coverage.
 * Compatible with Java 1.4 / Java 7 syntax (no diamond operators, lambdas, or streams).
 */
public class SetUniqueListTest {

    // -----------------------------------------------------------------------
    // Helper Classes for Reflection Exceptions in createSetBasedOnList
    // -----------------------------------------------------------------------

    public static class NoDefaultConstructorSet<E> extends HashSet<E> {
        private static final long serialVersionUID = 1L;

        public NoDefaultConstructorSet(final String dummy) {
            super();
        }
    }

    private static class PrivateConstructorSet<E> extends HashSet<E> {
        private static final long serialVersionUID = 1L;

        private PrivateConstructorSet() {
            super();
        }

        public static <T> PrivateConstructorSet<T> create() {
            return new PrivateConstructorSet<T>();
        }
    }

    // -----------------------------------------------------------------------
    // Factory Method & Constructor Tests
    // -----------------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void setUniqueList_givenNullList_shouldThrowIllegalArgumentException() {
        SetUniqueList.setUniqueList(null);
    }

    @Test
    public void setUniqueList_givenEmptyList_shouldReturnEmptySetUniqueList() {
        final List<String> list = new ArrayList<String>();
        final SetUniqueList<String> setUniqueList = SetUniqueList.setUniqueList(list);

        Assert.assertNotNull(setUniqueList);
        Assert.assertTrue(setUniqueList.isEmpty());
        Assert.assertEquals(0, setUniqueList.size());
    }

    @Test
    public void setUniqueList_givenListWithDuplicates_shouldRetainFirstOccurrenceOrderAndRemoveDuplicates() {
        final List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("A");
        list.add("C");
        list.add("B");

        final SetUniqueList<String> setUniqueList = SetUniqueList.setUniqueList(list);

        Assert.assertEquals(3, setUniqueList.size());
        Assert.assertEquals("A", setUniqueList.get(0));
        Assert.assertEquals("B", setUniqueList.get(1));
        Assert.assertEquals("C", setUniqueList.get(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenNullSet_shouldThrowIllegalArgumentException() {
        final List<String> list = new ArrayList<String>();
        new SetUniqueList<String>(list, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenNullList_shouldThrowIllegalArgumentException() {
        final Set<String> set = new HashSet<String>();
        new SetUniqueList<String>(null, set);
    }

    // -----------------------------------------------------------------------
    // asSet() Tests
    // -----------------------------------------------------------------------

    @Test
    public void asSet_givenPopulatedList_shouldReturnUnmodifiableSetView() {
        final List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        final SetUniqueList<String> setUniqueList = SetUniqueList.setUniqueList(list);

        final Set<String> setView = setUniqueList.asSet();

        Assert.assertEquals(2, setView.size());
        Assert.assertTrue(setView.contains("A"));
        Assert.assertTrue(setView.contains("B"));

        try {
            setView.add("C");
            Assert.fail("Expected UnsupportedOperationException when mutating unmodifiable set view");
        } catch (final UnsupportedOperationException e) {
            // expected
        }
    }

    // -----------------------------------------------------------------------
    // add(E) & add(int, E) Tests
    // -----------------------------------------------------------------------

    @Test
    public void add_givenNewElement_shouldAppendAndReturnTrue() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());

        final boolean added = list.add("Alpha");

        Assert.assertTrue(added);
        Assert.assertEquals(1, list.size());
        Assert.assertEquals("Alpha", list.get(0));
        Assert.assertTrue(list.contains("Alpha"));
    }

    @Test
    public void add_givenDuplicateElement_shouldNotAppendAndReturnFalse() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("Alpha");

        final boolean addedAgain = list.add("Alpha");

        Assert.assertFalse(addedAgain);
        Assert.assertEquals(1, list.size());
        Assert.assertEquals("Alpha", list.get(0));
    }

    @Test
    public void addAtIndex_givenNewElement_shouldInsertAtIndex() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("Alpha");
        list.add("Gamma");

        list.add(1, "Beta");

        Assert.assertEquals(3, list.size());
        Assert.assertEquals("Alpha", list.get(0));
        Assert.assertEquals("Beta", list.get(1));
        Assert.assertEquals("Gamma", list.get(2));
        Assert.assertTrue(list.contains("Beta"));
    }

    @Test
    public void addAtIndex_givenDuplicateElement_shouldIgnoreInsertion() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("Alpha");
        list.add("Beta");

        list.add(0, "Beta");

        Assert.assertEquals(2, list.size());
        Assert.assertEquals("Alpha", list.get(0));
        Assert.assertEquals("Beta", list.get(1));
    }

    // -----------------------------------------------------------------------
    // addAll(Collection) & addAll(int, Collection) Tests
    // -----------------------------------------------------------------------

    @Test
    public void addAll_givenCollectionWithUniqueAndDuplicates_shouldAppendOnlyUniqueAndReturnTrue() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("A");

        final Collection<String> toAdd = Arrays.asList(new String[]{"B", "A", "C", "B"});
        final boolean changed = list.addAll(toAdd);

        Assert.assertTrue(changed);
        Assert.assertEquals(3, list.size());
        Assert.assertEquals("A", list.get(0));
        Assert.assertEquals("B", list.get(1));
        Assert.assertEquals("C", list.get(2));
    }

    @Test
    public void addAll_givenCollectionWithOnlyExistingElements_shouldNotAppendAndReturnFalse() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("A");
        list.add("B");

        final Collection<String> toAdd = Arrays.asList(new String[]{"A", "B", "A"});
        final boolean changed = list.addAll(toAdd);

        Assert.assertFalse(changed);
        Assert.assertEquals(2, list.size());
    }

    @Test
    public void addAllAtIndex_givenCollectionWithUniqueElements_shouldInsertAtIndexAndReturnTrue() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("A");
        list.add("D");

        final Collection<String> toAdd = Arrays.asList(new String[]{"B", "C"});
        final boolean changed = list.addAll(1, toAdd);

        Assert.assertTrue(changed);
        Assert.assertEquals(4, list.size());
        Assert.assertEquals("A", list.get(0));
        Assert.assertEquals("B", list.get(1));
        Assert.assertEquals("C", list.get(2));
        Assert.assertEquals("D", list.get(3));
    }

    @Test
    public void addAllAtIndex_givenEmptyCollection_shouldReturnFalse() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("A");

        final boolean changed = list.addAll(0, new ArrayList<String>());

        Assert.assertFalse(changed);
        Assert.assertEquals(1, list.size());
    }

    // -----------------------------------------------------------------------
    // set(int, E) Tests
    // -----------------------------------------------------------------------

    @Test
    public void set_givenNewElement_shouldReplaceAndReturnOldElement() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("A");
        list.add("B");

        final String old = list.set(1, "C");

        Assert.assertEquals("B", old);
        Assert.assertEquals(2, list.size());
        Assert.assertEquals("C", list.get(1));
        Assert.assertFalse(list.contains("B"));
        Assert.assertTrue(list.contains("C"));
    }

    @Test
    public void set_givenSameElementAtSameIndex_shouldRetainElementAndReturnPrevious() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("A");
        list.add("B");

        final String old = list.set(0, "A");

        Assert.assertEquals("A", old);
        Assert.assertEquals(2, list.size());
        Assert.assertEquals("A", list.get(0));
        Assert.assertEquals("B", list.get(1));
    }

    @Test
    public void set_givenExistingElementAtDifferentIndex_shouldMoveElementAndRemovePreviousDuplicate() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("A");
        list.add("B");
        list.add("C");

        // Set "C" at index 0. "C" was previously at index 2.
        // Old item at index 0 was "A".
        // "A" should be removed from set. "C" should be at index 0, duplicate "C" removed.
        final String old = list.set(0, "C");

        Assert.assertEquals("A", old);
        Assert.assertEquals(2, list.size());
        Assert.assertEquals("C", list.get(0));
        Assert.assertEquals("B", list.get(1));
        Assert.assertFalse(list.contains("A"));
        Assert.assertTrue(list.contains("B"));
        Assert.assertTrue(list.contains("C"));
    }

    // -----------------------------------------------------------------------
    // remove(Object) & remove(int) Tests
    // -----------------------------------------------------------------------

    @Test
    public void removeObject_givenExistingElement_shouldRemoveFromListAndSetAndReturnTrue() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("A");
        list.add("B");

        final boolean removed = list.remove("A");

        Assert.assertTrue(removed);
        Assert.assertEquals(1, list.size());
        Assert.assertEquals("B", list.get(0));
        Assert.assertFalse(list.contains("A"));
    }

    @Test
    public void removeObject_givenNonExistentElement_shouldReturnFalse() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("A");

        final boolean removed = list.remove("NonExistent");

        Assert.assertFalse(removed);
        Assert.assertEquals(1, list.size());
    }

    @Test
    public void removeIndex_givenValidIndex_shouldRemoveElementAndReturnRemoved() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("A");
        list.add("B");

        final String removed = list.remove(0);

        Assert.assertEquals("A", removed);
        Assert.assertEquals(1, list.size());
        Assert.assertEquals("B", list.get(0));
        Assert.assertFalse(list.contains("A"));
    }

    // -----------------------------------------------------------------------
    // removeAll(Collection) Tests
    // -----------------------------------------------------------------------

    @Test
    public void removeAll_givenMatchingElements_shouldRemoveAndReturnTrue() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("A");
        list.add("B");
        list.add("C");

        final boolean changed = list.removeAll(Arrays.asList(new String[]{"A", "C", "D"}));

        Assert.assertTrue(changed);
        Assert.assertEquals(1, list.size());
        Assert.assertEquals("B", list.get(0));
        Assert.assertFalse(list.contains("A"));
        Assert.assertFalse(list.contains("C"));
    }

    @Test
    public void removeAll_givenNonMatchingElements_shouldReturnFalse() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("A");
        list.add("B");

        final boolean changed = list.removeAll(Arrays.asList(new String[]{"X", "Y"}));

        Assert.assertFalse(changed);
        Assert.assertEquals(2, list.size());
    }

    // -----------------------------------------------------------------------
    // retainAll(Collection) Tests
    // -----------------------------------------------------------------------

    @Test
    public void retainAll_givenAllElementsRetained_shouldReturnFalse() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("A");
        list.add("B");

        final boolean changed = list.retainAll(Arrays.asList(new String[]{"A", "B", "C"}));

        Assert.assertFalse(changed);
        Assert.assertEquals(2, list.size());
    }

    @Test
    public void retainAll_givenNoElementsRetained_shouldClearAndReturnTrue() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("A");
        list.add("B");

        final boolean changed = list.retainAll(Arrays.asList(new String[]{"X", "Y"}));

        Assert.assertTrue(changed);
        Assert.assertEquals(0, list.size());
        Assert.assertTrue(list.isEmpty());
        Assert.assertFalse(list.contains("A"));
        Assert.assertFalse(list.contains("B"));
    }

    @Test
    public void retainAll_givenPartialMatch_shouldRetainOnlyMatchedAndReturnTrue() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("A");
        list.add("B");
        list.add("C");

        final boolean changed = list.retainAll(Arrays.asList(new String[]{"B"}));

        Assert.assertTrue(changed);
        Assert.assertEquals(1, list.size());
        Assert.assertEquals("B", list.get(0));
        Assert.assertFalse(list.contains("A"));
        Assert.assertTrue(list.contains("B"));
        Assert.assertFalse(list.contains("C"));
    }

    // -----------------------------------------------------------------------
    // clear(), contains(), containsAll() Tests
    // -----------------------------------------------------------------------

    @Test
    public void clear_givenPopulatedList_shouldRemoveAllElements() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("A");
        list.add("B");

        list.clear();

        Assert.assertEquals(0, list.size());
        Assert.assertTrue(list.isEmpty());
        Assert.assertFalse(list.contains("A"));
    }

    @Test
    public void contains_givenElement_shouldCheckSetPresence() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("A");

        Assert.assertTrue(list.contains("A"));
        Assert.assertFalse(list.contains("B"));
    }

    @Test
    public void containsAll_givenCollection_shouldCheckSetPresence() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("A");
        list.add("B");

        Assert.assertTrue(list.containsAll(Arrays.asList(new String[]{"A", "B"})));
        Assert.assertFalse(list.containsAll(Arrays.asList(new String[]{"A", "C"})));
    }

    // -----------------------------------------------------------------------
    // Iterator Tests (SetListIterator)
    // -----------------------------------------------------------------------

    @Test
    public void iterator_givenIterationAndRemove_shouldRemoveFromListAndSet() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("A");
        list.add("B");

        final Iterator<String> it = list.iterator();
        Assert.assertTrue(it.hasNext());
        final String first = it.next();
        Assert.assertEquals("A", first);

        it.remove();

        Assert.assertEquals(1, list.size());
        Assert.assertEquals("B", list.get(0));
        Assert.assertFalse(list.contains("A"));
    }

    // -----------------------------------------------------------------------
    // ListIterator Tests (SetListListIterator)
    // -----------------------------------------------------------------------

    @Test
    public void listIterator_givenTraverseAndRemove_shouldSynchronizeListAndSet() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("A");
        list.add("B");

        final ListIterator<String> lit = list.listIterator();
        Assert.assertTrue(lit.hasNext());
        Assert.assertEquals("A", lit.next());
        Assert.assertTrue(lit.hasNext());
        Assert.assertEquals("B", lit.next());

        Assert.assertTrue(lit.hasPrevious());
        Assert.assertEquals("B", lit.previous());

        lit.remove();

        Assert.assertEquals(1, list.size());
        Assert.assertEquals("A", list.get(0));
        Assert.assertFalse(list.contains("B"));
    }

    @Test
    public void listIteratorWithIndex_givenValidIndex_shouldStartAtPosition() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("A");
        list.add("B");
        list.add("C");

        final ListIterator<String> lit = list.listIterator(1);
        Assert.assertTrue(lit.hasNext());
        Assert.assertEquals("B", lit.next());
    }

    @Test
    public void listIterator_givenAddUnique_shouldInsertElement() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("A");
        list.add("C");

        final ListIterator<String> lit = list.listIterator();
        lit.next(); // after "A"
        lit.add("B");

        Assert.assertEquals(3, list.size());
        Assert.assertEquals("A", list.get(0));
        Assert.assertEquals("B", list.get(1));
        Assert.assertEquals("C", list.get(2));
        Assert.assertTrue(list.contains("B"));
    }

    @Test
    public void listIterator_givenAddDuplicate_shouldIgnoreElement() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("A");
        list.add("B");

        final ListIterator<String> lit = list.listIterator();
        lit.next(); // after "A"
        lit.add("B"); // duplicate

        Assert.assertEquals(2, list.size());
        Assert.assertEquals("A", list.get(0));
        Assert.assertEquals("B", list.get(1));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void listIterator_givenSetCall_shouldThrowUnsupportedOperationException() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("A");

        final ListIterator<String> lit = list.listIterator();
        lit.next();
        lit.set("Z");
    }

    // -----------------------------------------------------------------------
    // subList() & createSetBasedOnList Tests
    // -----------------------------------------------------------------------

    @Test
    public void subList_givenValidRange_shouldReturnNewSetUniqueList() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        final List<String> sub = list.subList(1, 3);

        Assert.assertNotNull(sub);
        Assert.assertTrue(sub instanceof SetUniqueList);
        Assert.assertEquals(2, sub.size());
        Assert.assertEquals("B", sub.get(0));
        Assert.assertEquals("C", sub.get(1));
    }

    @Test
    public void createSetBasedOnList_givenTreeSet_shouldInstantiateViaReflection() {
        final List<String> list = new ArrayList<String>();
        list.add("X");
        final Set<String> treeSet = new TreeSet<String>();
        treeSet.add("X");

        final SetUniqueList<String> setUniqueList = new SetUniqueList<String>(list, treeSet);
        final Set<String> createdSet = setUniqueList.createSetBasedOnList(treeSet, Arrays.asList(new String[]{"Y", "Z"}));

        Assert.assertTrue(createdSet instanceof TreeSet);
        Assert.assertEquals(2, createdSet.size());
        Assert.assertTrue(createdSet.contains("Y"));
        Assert.assertTrue(createdSet.contains("Z"));
    }

    @Test
    public void createSetBasedOnList_givenInstantiationException_shouldFallbackToHashSet() {
        final List<String> list = new ArrayList<String>();
        final Set<String> customSet = new NoDefaultConstructorSet<String>("dummy");

        final SetUniqueList<String> setUniqueList = new SetUniqueList<String>(list, customSet);
        final Set<String> createdSet = setUniqueList.createSetBasedOnList(customSet, Arrays.asList(new String[]{"Fallback1"}));

        Assert.assertTrue(createdSet instanceof HashSet);
        Assert.assertEquals(1, createdSet.size());
        Assert.assertTrue(createdSet.contains("Fallback1"));
    }

    @Test
    public void createSetBasedOnList_givenIllegalAccessException_shouldFallbackToHashSet() {
        final List<String> list = new ArrayList<String>();
        final Set<String> customSet = PrivateConstructorSet.create();

        final SetUniqueList<String> setUniqueList = new SetUniqueList<String>(list, customSet);
        final Set<String> createdSet = setUniqueList.createSetBasedOnList(customSet, Arrays.asList(new String[]{"Fallback2"}));

        Assert.assertTrue(createdSet instanceof HashSet);
        Assert.assertEquals(1, createdSet.size());
        Assert.assertTrue(createdSet.contains("Fallback2"));
    }
}