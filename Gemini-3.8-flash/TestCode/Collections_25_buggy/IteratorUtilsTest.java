package org.apache.commons.collections4;

import org.apache.commons.collections4.iterators.LoopingIterator;
import org.apache.commons.collections4.iterators.PushbackIterator;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class IteratorUtilsTest {

    @Test
    public void emptyIterator_shouldHaveNoElements() {
        // Arrange & Act
        Iterator it = IteratorUtils.emptyIterator();

        // Assert
        Assert.assertNotNull(it);
        Assert.assertFalse(it.hasNext());
    }

    @Test(expected = NoSuchElementException.class)
    public void emptyIterator_givenNextCall_shouldThrowNoSuchElementException() {
        // Arrange
        Iterator it = IteratorUtils.emptyIterator();

        // Act & Assert
        it.next();
    }

    @Test
    public void emptyListIterator_shouldHaveNoElements() {
        // Arrange & Act
        ListIterator it = IteratorUtils.emptyListIterator();

        // Assert
        Assert.assertNotNull(it);
        Assert.assertFalse(it.hasNext());
        Assert.assertFalse(it.hasPrevious());
        Assert.assertEquals(0, it.nextIndex());
        Assert.assertEquals(-1, it.previousIndex());
    }

    @Test
    public void singletonIterator_givenElement_shouldIterateSingleItem() {
        // Arrange
        Iterator it = IteratorUtils.singletonIterator("item");

        // Act & Assert
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("item", it.next());
        Assert.assertFalse(it.hasNext());
    }

    @Test
    public void arrayIterator_givenArray_shouldTraverseElements() {
        // Arrange
        String[] arr = new String[] { "A", "B", "C" };

        // Act
        ResettableIterator it = IteratorUtils.arrayIterator(arr);

        // Assert
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("A", it.next());
        Assert.assertEquals("B", it.next());
        Assert.assertEquals("C", it.next());
        Assert.assertFalse(it.hasNext());

        // Reset
        it.reset();
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("A", it.next());
    }

    @Test
    public void toList_givenIterator_shouldReturnListContainingAllElements() {
        // Arrange
        List original = Arrays.asList(new String[] { "1", "2", "3" });
        Iterator it = original.iterator();

        // Act
        List result = IteratorUtils.toList(it);

        // Assert
        Assert.assertEquals(3, result.size());
        Assert.assertEquals("1", result.get(0));
        Assert.assertEquals("2", result.get(1));
        Assert.assertEquals("3", result.get(2));
    }

    @Test
    public void toArray_givenIteratorAndClass_shouldReturnTypedArray() {
        // Arrange
        List list = Arrays.asList(new String[] { "X", "Y" });

        // Act
        Object[] arr = IteratorUtils.toArray(list.iterator(), String.class);

        // Assert
        Assert.assertNotNull(arr);
        Assert.assertEquals(2, arr.length);
        Assert.assertEquals("X", arr[0]);
        Assert.assertEquals("Y", arr[1]);
    }

    @Test
    public void get_givenIteratorAndIndex_shouldRetrieveElementAtIndex() {
        // Arrange
        List list = Arrays.asList(new String[] { "first", "second", "third" });

        // Act
        Object item = IteratorUtils.get(list.iterator(), 1);

        // Assert
        Assert.assertEquals("second", item);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void get_givenOutOfBoundsIndex_shouldThrowIndexOutOfBoundsException() {
        // Arrange
        List list = Arrays.asList(new String[] { "a" });

        // Act & Assert
        IteratorUtils.get(list.iterator(), 5);
    }

    @Test
    public void sizeAndIsEmpty_givenIterators_shouldEvaluateCorrectly() {
        // Arrange
        List empty = new ArrayList();
        List populated = Arrays.asList(new String[] { "a", "b" });

        // Act & Assert
        Assert.assertTrue(IteratorUtils.isEmpty(empty.iterator()));
        Assert.assertFalse(IteratorUtils.isEmpty(populated.iterator()));
        Assert.assertEquals(0, IteratorUtils.size(empty.iterator()));
        Assert.assertEquals(2, IteratorUtils.size(populated.iterator()));
    }

    @Test
    public void contains_givenIteratorAndTarget_shouldDetectPresence() {
        // Arrange
        List list = Arrays.asList(new String[] { "apple", "banana" });

        // Act & Assert
        Assert.assertTrue(IteratorUtils.contains(list.iterator(), "apple"));
        Assert.assertFalse(IteratorUtils.contains(list.iterator(), "cherry"));
    }

    @Test
    public void loopingIterator_givenCollection_shouldLoopContinuously() {
        // Arrange
        List list = Arrays.asList(new String[] { "A", "B" });

        // Act
        LoopingIterator it = IteratorUtils.loopingIterator(list);

        // Assert
        Assert.assertEquals("A", it.next());
        Assert.assertEquals("B", it.next());
        Assert.assertEquals("A", it.next());
        Assert.assertEquals("B", it.next());
    }

    @Test
    public void pushbackIterator_givenIterator_shouldAllowPushback() {
        // Arrange
        List list = Arrays.asList(new String[] { "A", "B" });
        PushbackIterator it = IteratorUtils.pushbackIterator(list.iterator());

        // Act
        Object first = it.next();
        it.pushback(first);
        Object second = it.next();

        // Assert
        Assert.assertEquals("A", first);
        Assert.assertEquals("A", second);
        Assert.assertEquals("B", it.next());
    }
}
