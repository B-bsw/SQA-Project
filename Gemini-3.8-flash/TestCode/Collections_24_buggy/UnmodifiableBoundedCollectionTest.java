package org.apache.commons.collections4.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import org.apache.commons.collections4.BoundedCollection;
import org.apache.commons.collections4.iterators.UnmodifiableIterator;
import org.junit.Assert;
import org.junit.Test;

public class UnmodifiableBoundedCollectionTest {

    private static class MockBoundedCollection<E> extends ArrayList<E> implements BoundedCollection<E> {
        private static final long serialVersionUID = 1L;
        private final int maximumSize;

        public MockBoundedCollection(int maximumSize) {
            super();
            this.maximumSize = maximumSize;
        }

        public boolean isFull() {
            return size() >= maximumSize;
        }

        public int maxSize() {
            return maximumSize;
        }
    }

    private static class MockCollectionDecorator<E> extends AbstractCollectionDecorator<E> {
        private static final long serialVersionUID = 1L;

        public MockCollectionDecorator(Collection<E> coll) {
            super(coll);
        }
    }

    @Test
    public void unmodifiableBoundedCollection_givenBoundedCollection_shouldDecorateSuccessfully() {
        MockBoundedCollection<String> mock = new MockBoundedCollection<String>(2);
        mock.add("item1");

        BoundedCollection<String> result = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(mock);

        Assert.assertNotNull(result);
        Assert.assertEquals(1, result.size());
        Assert.assertEquals(2, result.maxSize());
        Assert.assertFalse(result.isFull());
        Assert.assertTrue(result.contains("item1"));
    }

    @Test
    public void unmodifiableBoundedCollection_givenCollectionAsBoundedCollection_shouldDecorateSuccessfully() {
        MockBoundedCollection<String> mock = new MockBoundedCollection<String>(1);
        mock.add("test");
        Collection<String> coll = mock;

        BoundedCollection<String> result = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(coll);

        Assert.assertNotNull(result);
        Assert.assertEquals(1, result.size());
        Assert.assertEquals(1, result.maxSize());
        Assert.assertTrue(result.isFull());
    }

    @Test
    public void unmodifiableBoundedCollection_givenNullCollection_shouldThrowIllegalArgumentException() {
        try {
            Collection<String> nullColl = null;
            UnmodifiableBoundedCollection.unmodifiableBoundedCollection(nullColl);
            Assert.fail("Expected IllegalArgumentException when passing null collection");
        } catch (IllegalArgumentException ex) {
            Assert.assertEquals("The collection must not be null", ex.getMessage());
        }
    }

    @Test
    public void unmodifiableBoundedCollection_givenNonBoundedCollection_shouldThrowIllegalArgumentException() {
        Collection<String> plainList = new ArrayList<String>();
        plainList.add("data");

        try {
            UnmodifiableBoundedCollection.unmodifiableBoundedCollection(plainList);
            Assert.fail("Expected IllegalArgumentException for non-bounded collection");
        } catch (IllegalArgumentException ex) {
            Assert.assertEquals("The collection is not a bounded collection", ex.getMessage());
        }
    }

    @Test
    public void unmodifiableBoundedCollection_givenAbstractCollectionDecorator_shouldUnwrapAndDecorate() {
        MockBoundedCollection<String> mock = new MockBoundedCollection<String>(5);
        mock.add("wrapped1");
        MockCollectionDecorator<String> decorator = new MockCollectionDecorator<String>(mock);

        BoundedCollection<String> result = UnmodifiableBoundedCollection.unmodifiableBoundedCollection((Collection<String>) decorator);

        Assert.assertNotNull(result);
        Assert.assertEquals(5, result.maxSize());
        Assert.assertEquals(1, result.size());
        Assert.assertTrue(result.contains("wrapped1"));
    }

    @Test
    public void unmodifiableBoundedCollection_givenSynchronizedCollection_shouldUnwrapAndDecorate() {
        MockBoundedCollection<String> mock = new MockBoundedCollection<String>(3);
        mock.add("sync1");
        SynchronizedCollection<String> syncColl = SynchronizedCollection.synchronizedCollection(mock);

        BoundedCollection<String> result = UnmodifiableBoundedCollection.unmodifiableBoundedCollection((Collection<String>) syncColl);

        Assert.assertNotNull(result);
        Assert.assertEquals(3, result.maxSize());
        Assert.assertEquals(1, result.size());
        Assert.assertTrue(result.contains("sync1"));
    }

    @Test
    public void unmodifiableBoundedCollection_givenNestedDecorators_shouldUnwrapMultiLevel() {
        MockBoundedCollection<String> mock = new MockBoundedCollection<String>(4);
        mock.add("nested");
        Collection<String> current = mock;
        current = new MockCollectionDecorator<String>(current);
        current = SynchronizedCollection.synchronizedCollection(current);
        current = new MockCollectionDecorator<String>(current);

        BoundedCollection<String> result = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(current);

        Assert.assertNotNull(result);
        Assert.assertEquals(4, result.maxSize());
        Assert.assertEquals(1, result.size());
    }

    @Test
    public void unmodifiableBoundedCollection_givenExceededMaxDecoratorDepth_shouldThrowIllegalArgumentException() {
        MockBoundedCollection<String> mock = new MockBoundedCollection<String>(10);
        Collection<String> current = mock;
        for (int i = 0; i < 1001; i++) {
            current = new MockCollectionDecorator<String>(current);
        }

        try {
            UnmodifiableBoundedCollection.unmodifiableBoundedCollection(current);
            Assert.fail("Expected IllegalArgumentException when exceeding maximum unwrapping depth");
        } catch (IllegalArgumentException ex) {
            Assert.assertEquals("The collection is not a bounded collection", ex.getMessage());
        }
    }

    @Test
    public void iterator_givenElements_shouldReturnUnmodifiableIterator() {
        MockBoundedCollection<String> mock = new MockBoundedCollection<String>(2);
        mock.add("alpha");
        mock.add("beta");
        BoundedCollection<String> bounded = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(mock);

        Iterator<String> it = bounded.iterator();

        Assert.assertTrue(it instanceof UnmodifiableIterator);
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("alpha", it.next());
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("beta", it.next());
        Assert.assertFalse(it.hasNext());

        try {
            it.remove();
            Assert.fail("Expected UnsupportedOperationException on iterator remove");
        } catch (UnsupportedOperationException ex) {
            // expected
        }
    }

    @Test(expected = UnsupportedOperationException.class)
    public void add_givenElement_shouldThrowUnsupportedOperationException() {
        MockBoundedCollection<String> mock = new MockBoundedCollection<String>(2);
        BoundedCollection<String> bounded = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(mock);

        bounded.add("forbidden");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void addAll_givenCollection_shouldThrowUnsupportedOperationException() {
        MockBoundedCollection<String> mock = new MockBoundedCollection<String>(2);
        BoundedCollection<String> bounded = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(mock);

        bounded.addAll(Arrays.asList(new String[]{"item1", "item2"}));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void clear_givenCollection_shouldThrowUnsupportedOperationException() {
        MockBoundedCollection<String> mock = new MockBoundedCollection<String>(2);
        mock.add("item");
        BoundedCollection<String> bounded = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(mock);

        bounded.clear();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void remove_givenObject_shouldThrowUnsupportedOperationException() {
        MockBoundedCollection<String> mock = new MockBoundedCollection<String>(2);
        mock.add("item");
        BoundedCollection<String> bounded = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(mock);

        bounded.remove("item");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void removeAll_givenCollection_shouldThrowUnsupportedOperationException() {
        MockBoundedCollection<String> mock = new MockBoundedCollection<String>(2);
        mock.add("item");
        BoundedCollection<String> bounded = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(mock);

        bounded.removeAll(Arrays.asList(new String[]{"item"}));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void retainAll_givenCollection_shouldThrowUnsupportedOperationException() {
        MockBoundedCollection<String> mock = new MockBoundedCollection<String>(2);
        mock.add("item");
        BoundedCollection<String> bounded = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(mock);

        bounded.retainAll(Arrays.asList(new String[]{"item"}));
    }

    @Test
    public void isFull_givenNotFullBoundedCollection_shouldReturnFalse() {
        MockBoundedCollection<String> mock = new MockBoundedCollection<String>(3);
        mock.add("item1");
        BoundedCollection<String> bounded = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(mock);

        Assert.assertFalse(bounded.isFull());
    }

    @Test
    public void isFull_givenFullBoundedCollection_shouldReturnTrue() {
        MockBoundedCollection<String> mock = new MockBoundedCollection<String>(2);
        mock.add("item1");
        mock.add("item2");
        BoundedCollection<String> bounded = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(mock);

        Assert.assertTrue(bounded.isFull());
    }

    @Test
    public void maxSize_givenCapacity_shouldReturnCorrectCapacity() {
        MockBoundedCollection<String> mock = new MockBoundedCollection<String>(42);
        BoundedCollection<String> bounded = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(mock);

        Assert.assertEquals(42, bounded.maxSize());
    }

    @Test
    public void decorated_givenDirectCallViaSubclassMethod_shouldReturnInnerBoundedCollection() {
        MockBoundedCollection<String> mock = new MockBoundedCollection<String>(5);
        UnmodifiableBoundedCollection<String> bounded = (UnmodifiableBoundedCollection<String>) UnmodifiableBoundedCollection.unmodifiableBoundedCollection(mock);

        BoundedCollection<String> inner = bounded.decorated();

        Assert.assertSame(mock, inner);
    }
}