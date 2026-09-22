package org.apache.commons.collections4.collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.collections4.BoundedCollection;
import org.junit.Before;
import org.junit.Test;

public class UnmodifiableBoundedCollectionTest {

    private BoundedCollection<String> boundedColl;
    private UnmodifiableBoundedCollection<String> unmodifiableColl;

    @Before
    public void setUp() {
        // Create a simple BoundedCollection implementation for testing
        boundedColl = new BoundedCollection<String>() {
            private final List<String> delegate = new ArrayList<String>(Arrays.asList("a", "b", "c"));
            private final int maxSize = 5;

            @Override
            public boolean isFull() {
                return delegate.size() >= maxSize;
            }

            @Override
            public int maxSize() {
                return maxSize;
            }

            @Override
            public int size() {
                return delegate.size();
            }

            @Override
            public boolean isEmpty() {
                return delegate.isEmpty();
            }

            @Override
            public boolean contains(Object o) {
                return delegate.contains(o);
            }

            @Override
            public Iterator<String> iterator() {
                return delegate.iterator();
            }

            @Override
            public Object[] toArray() {
                return delegate.toArray();
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return delegate.toArray(a);
            }

            @Override
            public boolean add(String e) {
                if (isFull()) {
                    return false;
                }
                return delegate.add(e);
            }

            @Override
            public boolean remove(Object o) {
                return delegate.remove(o);
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return delegate.containsAll(c);
            }

            @Override
            public boolean addAll(Collection<? extends String> c) {
                boolean changed = false;
                for (String s : c) {
                    if (add(s)) {
                        changed = true;
                    }
                }
                return changed;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return delegate.removeAll(c);
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return delegate.retainAll(c);
            }

            @Override
            public void clear() {
                delegate.clear();
            }
        };
        
        unmodifiableColl = (UnmodifiableBoundedCollection<String>) 
                UnmodifiableBoundedCollection.<String>unmodifiableBoundedCollection(boundedColl);
    }

    @Test
    public void testUnmodifiableBoundedCollectionFactoryWithBoundedCollection() {
        UnmodifiableBoundedCollection<String> result = 
                (UnmodifiableBoundedCollection<String>) 
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection(boundedColl);
        assertNotNull(result);
        assertSame(boundedColl, result.decorated());
    }

    @Test
    public void testUnmodifiableBoundedCollectionFactoryWithNonBoundedCollection() {
        Collection<String> normalColl = new ArrayList<String>();
        try {
            UnmodifiableBoundedCollection.unmodifiableBoundedCollection(normalColl);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testUnmodifiableBoundedCollectionFactoryWithNullCollection() {
        try {
            UnmodifiableBoundedCollection.unmodifiableBoundedCollection((Collection<String>) null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testIsFull() {
        assertFalse(unmodifiableColl.isFull());
    }

    @Test
    public void testMaxSize() {
        assertEquals(5, unmodifiableColl.maxSize());
    }

    @Test
    public void testIterator() {
        Iterator<String> it = unmodifiableColl.iterator();
        assertNotNull(it);
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
        try {
            it.remove();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAdd() {
        unmodifiableColl.add("x");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAddAll() {
        unmodifiableColl.addAll(Arrays.asList("x", "y"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testClear() {
        unmodifiableColl.clear();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testRemove() {
        unmodifiableColl.remove("a");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testRemoveAll() {
        unmodifiableColl.removeAll(Arrays.asList("a"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testRetainAll() {
        unmodifiableColl.retainAll(Arrays.asList("a"));
    }

    @Test
    public void testUnmodifiableBoundedCollectionWithDecorator() {
        // Create a collection that is wrapped in a decorator that implements BoundedCollection
        final BoundedCollection<String> bounded = new BoundedCollection<String>() {
            private final List<String> values = new ArrayList<String>();
            @Override
            public boolean isFull() { return false; }
            @Override
            public int maxSize() { return 10; }
            @Override
            public int size() { return values.size(); }
            @Override
            public boolean isEmpty() { return values.isEmpty(); }
            @Override
            public boolean contains(Object o) { return values.contains(o); }
            @Override
            public Iterator<String> iterator() { return values.iterator(); }
            @Override
            public Object[] toArray() { return values.toArray(); }
            @Override
            public <T> T[] toArray(T[] a) { return values.toArray(a); }
            @Override
            public boolean add(String e) { return values.add(e); }
            @Override
            public boolean remove(Object o) { return values.remove(o); }
            @Override
            public boolean containsAll(Collection<?> c) { return values.containsAll(c); }
            @Override
            public boolean addAll(Collection<? extends String> c) { return values.addAll(c); }
            @Override
            public boolean removeAll(Collection<?> c) { return values.removeAll(c); }
            @Override
            public boolean retainAll(Collection<?> c) { return values.retainAll(c); }
            @Override
            public void clear() { values.clear(); }
        };
        
        AbstractCollectionDecorator<String> decorator = new AbstractCollectionDecorator<String>(bounded) {};
        UnmodifiableBoundedCollection<String> unmod = 
                (UnmodifiableBoundedCollection<String>) 
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection(decorator);
        
        assertNotNull(unmod);
        assertFalse(unmod.isFull());
        assertEquals(10, unmod.maxSize());
    }

    @Test
    public void testLoopBoundary() {
        // Test with exactly one decorator level
        AbstractCollectionDecorator<String> deco1 = new AbstractCollectionDecorator<String>(boundedColl) {};
        UnmodifiableBoundedCollection<String> result1 = 
                (UnmodifiableBoundedCollection<String>) 
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection(deco1);
        assertNotNull(result1);
    }

    @Test
    public void testMultipleDecorators() {
        // Test with more than one decorator level (loop iterations)
        AbstractCollectionDecorator<String> deco1 = new AbstractCollectionDecorator<String>(boundedColl) {};
        AbstractCollectionDecorator<String> deco2 = new AbstractCollectionDecorator<String>(deco1) {};
        UnmodifiableBoundedCollection<String> result = 
                (UnmodifiableBoundedCollection<String>) 
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection(deco2);
        assertNotNull(result);
    }

    @Test
    public void testSynchronizedCollectionDecorator() {
        // Test with SynchronizedCollection
        Collection<String> sync = new org.apache.commons.collections4.collection.SynchronizedCollection<String>(boundedColl);
        UnmodifiableBoundedCollection<String> result = 
                (UnmodifiableBoundedCollection<String>) 
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection(sync);
        assertNotNull(result);
    }
}