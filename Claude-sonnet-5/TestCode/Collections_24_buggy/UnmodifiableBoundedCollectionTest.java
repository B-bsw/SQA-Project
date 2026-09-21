package org.apache.commons.collections4.collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

import org.apache.commons.collections4.BoundedCollection;
import org.apache.commons.collections4.functors.TruePredicate;
import org.junit.Before;
import org.junit.Test;

public class UnmodifiableBoundedCollectionTest {

    /**
     * Simple BoundedCollection implementation used for testing.
     */
    private static class TestBoundedCollection<E> extends ArrayList<E> implements BoundedCollection<E> {
        private static final long serialVersionUID = 1L;
        private final int maxSize;

        TestBoundedCollection(final int maxSize) {
            this.maxSize = maxSize;
        }

        @Override
        public boolean add(final E e) {
            if (isFull()) {
                throw new IllegalStateException("collection is full");
            }
            return super.add(e);
        }

        public boolean isFull() {
            return size() >= maxSize;
        }

        public int maxSize() {
            return maxSize;
        }
    }

    private TestBoundedCollection<String> bounded;

    @Before
    public void setUp() {
        bounded = new TestBoundedCollection<String>(3);
    }

    // ---------------------------------------------------------------
    // Factory method 1: unmodifiableBoundedCollection(BoundedCollection)
    // ---------------------------------------------------------------

    @Test
    public void testFactoryBoundedCollectionNormal() {
        bounded.add("a");
        bounded.add("b");
        final BoundedCollection<String> result =
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection(bounded);
        assertNotNull(result);
        assertEquals(2, result.size());
        assertFalse(result.isFull());
        assertEquals(3, result.maxSize());
    }

    @Test
    public void testFactoryBoundedCollectionEmpty() {
        final BoundedCollection<String> result =
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection(bounded);
        assertEquals(0, result.size());
        assertFalse(result.isFull());
    }

    @Test
    public void testFactoryBoundedCollectionFull() {
        bounded.add("a");
        bounded.add("b");
        bounded.add("c");
        final BoundedCollection<String> result =
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection(bounded);
        assertTrue(result.isFull());
        assertEquals(3, result.size());
    }

    // ---------------------------------------------------------------
    // Factory method 2: unmodifiableBoundedCollection(Collection)
    // ---------------------------------------------------------------

    @Test
    public void testFactoryCollectionNull() {
        try {
            UnmodifiableBoundedCollection.unmodifiableBoundedCollection((Collection<String>) null);
            fail("Should have thrown IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testFactoryCollectionAlreadyBounded() {
        bounded.add("x");
        final BoundedCollection<String> result =
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection((Collection<String>) bounded);
        assertEquals(1, result.size());
    }

    @Test
    public void testFactoryCollectionDrillThroughAbstractCollectionDecorator() {
        bounded.add("x");
        bounded.add("y");
        final Collection<String> predicated =
                PredicatedCollection.predicatedCollection(bounded, TruePredicate.<String>truePredicate());
        final BoundedCollection<String> result =
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection(predicated);
        assertEquals(2, result.size());
        assertEquals(3, result.maxSize());
    }

    @Test
    public void testFactoryCollectionDrillThroughSynchronizedCollection() {
        bounded.add("x");
        final Collection<String> sync = SynchronizedCollection.synchronizedCollection(bounded);
        final BoundedCollection<String> result =
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection(sync);
        assertEquals(1, result.size());
        assertEquals(3, result.maxSize());
    }

    @Test
    public void testFactoryCollectionDrillThroughMultipleDecorators() {
        bounded.add("x");
        final Collection<String> sync = SynchronizedCollection.synchronizedCollection(bounded);
        final Collection<String> predicated =
                PredicatedCollection.predicatedCollection(sync, TruePredicate.<String>truePredicate());
        final BoundedCollection<String> result =
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection(predicated);
        assertEquals(1, result.size());
        assertEquals(3, result.maxSize());
    }

    @Test
    public void testFactoryCollectionNotBounded() {
        final Collection<String> notBounded = new ArrayList<String>();
        notBounded.add("a");
        try {
            UnmodifiableBoundedCollection.unmodifiableBoundedCollection(notBounded);
            fail("Should have thrown IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }
    }

    // ---------------------------------------------------------------
    // iterator()
    // ---------------------------------------------------------------

    @Test
    public void testIteratorZeroElements() {
        final BoundedCollection<String> result =
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection(bounded);
        final Iterator<String> it = result.iterator();
        assertFalse(it.hasNext());
        try {
            it.next();
            fail("Should have thrown NoSuchElementException");
        } catch (final NoSuchElementException e) {
            // expected
        }
    }

    @Test
    public void testIteratorOneElement() {
        bounded.add("only");
        final BoundedCollection<String> result =
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection(bounded);
        final Iterator<String> it = result.iterator();
        assertTrue(it.hasNext());
        assertEquals("only", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testIteratorMultipleElements() {
        bounded.add("a");
        bounded.add("b");
        bounded.add("c");
        final BoundedCollection<String> result =
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection(bounded);
        final Iterator<String> it = result.iterator();
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(3, count);
    }

    @Test
    public void testIteratorRemoveUnsupported() {
        bounded.add("a");
        final BoundedCollection<String> result =
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection(bounded);
        final Iterator<String> it = result.iterator();
        it.next();
        try {
            it.remove();
            fail("Should have thrown UnsupportedOperationException");
        } catch (final UnsupportedOperationException e) {
            // expected
        }
    }

    // ---------------------------------------------------------------
    // Mutation methods should throw UnsupportedOperationException
    // ---------------------------------------------------------------

    @Test
    public void testAddThrowsException() {
        final BoundedCollection<String> result =
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection(bounded);
        try {
            result.add("z");
            fail("Should have thrown UnsupportedOperationException");
        } catch (final UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testAddAllThrowsException() {
        final BoundedCollection<String> result =
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection(bounded);
        final Collection<String> toAdd = new ArrayList<String>();
        toAdd.add("z");
        try {
            result.addAll(toAdd);
            fail("Should have thrown UnsupportedOperationException");
        } catch (final UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testClearThrowsException() {
        final BoundedCollection<String> result =
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection(bounded);
        try {
            result.clear();
            fail("Should have thrown UnsupportedOperationException");
        } catch (final UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testRemoveThrowsException() {
        bounded.add("a");
        final BoundedCollection<String> result =
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection(bounded);
        try {
            result.remove("a");
            fail("Should have thrown UnsupportedOperationException");
        } catch (final UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testRemoveAllThrowsException() {
        bounded.add("a");
        final BoundedCollection<String> result =
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection(bounded);
        final Collection<String> toRemove = new ArrayList<String>();
        toRemove.add("a");
        try {
            result.removeAll(toRemove);
            fail("Should have thrown UnsupportedOperationException");
        } catch (final UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testRetainAllThrowsException() {
        bounded.add("a");
        final BoundedCollection<String> result =
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection(bounded);
        final Collection<String> toRetain = new ArrayList<String>();
        toRetain.add("a");
        try {
            result.retainAll(toRetain);
            fail("Should have thrown UnsupportedOperationException");
        } catch (final UnsupportedOperationException e) {
            // expected
        }
    }

    // ---------------------------------------------------------------
    // isFull() / maxSize()
    // ---------------------------------------------------------------

    @Test
    public void testIsFullFalse() {
        bounded.add("a");
        final BoundedCollection<String> result =
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection(bounded);
        assertFalse(result.isFull());
    }

    @Test
    public void testIsFullTrue() {
        bounded.add("a");
        bounded.add("b");
        bounded.add("c");
        final BoundedCollection<String> result =
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection(bounded);
        assertTrue(result.isFull());
    }

    @Test
    public void testMaxSize() {
        final BoundedCollection<String> result =
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection(bounded);
        assertEquals(3, result.maxSize());
    }
}