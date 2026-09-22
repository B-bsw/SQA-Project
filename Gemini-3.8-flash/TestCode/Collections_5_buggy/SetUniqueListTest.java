package org.apache.commons.collections.list;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class SetUniqueListTest {

    @Test(expected = IllegalArgumentException.class)
    public void decorate_givenNullList_shouldThrowIllegalArgumentException() {
        // Arrange, Act & Assert
        SetUniqueList.decorate(null);
    }

    @Test
    public void decorate_givenListWithDuplicates_shouldRemoveDuplicatesPreservingOrder() {
        // Arrange
        List list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add("A");
        list.add("C");
        list.add("B");

        // Act
        SetUniqueList uniqueList = SetUniqueList.decorate(list);

        // Assert
        Assert.assertEquals(3, uniqueList.size());
        Assert.assertEquals("A", uniqueList.get(0));
        Assert.assertEquals("B", uniqueList.get(1));
        Assert.assertEquals("C", uniqueList.get(2));
    }

    @Test
    public void add_givenNewElement_shouldAddSuccessfully() {
        // Arrange
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());

        // Act
        boolean added = list.add("Element1");

        // Assert
        Assert.assertTrue(added);
        Assert.assertEquals(1, list.size());
        Assert.assertTrue(list.contains("Element1"));
    }

    @Test
    public void add_givenDuplicateElement_shouldNotAddAndReturnFalse() {
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
    public void addAtIndex_givenDuplicateElement_shouldNotAdd() {
        // Arrange
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("First");
        list.add("Second");

        // Act
        list.add(0, "Second"); // Duplicate

        // Assert
        Assert.assertEquals(2, list.size());
        Assert.assertEquals("First", list.get(0));
        Assert.assertEquals("Second", list.get(1));
    }

    @Test
    public void addAll_givenCollectionWithDuplicates_shouldOnlyAddUnique() {
        // Arrange
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("X");

        List toAdd = Arrays.asList(new String[] { "Y", "X", "Z", "Y" });

        // Act
        boolean changed = list.addAll(toAdd);

        // Assert
        Assert.assertTrue(changed);
        Assert.assertEquals(3, list.size());
        Assert.assertEquals("X", list.get(0));
        Assert.assertEquals("Y", list.get(1));
        Assert.assertEquals("Z", list.get(2));
    }

    @Test
    public void remove_givenElement_shouldRemoveFromBothListAndSet() {
        // Arrange
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");
        list.add("B");

        // Act
        boolean removed = list.remove("A");

        // Assert
        Assert.assertTrue(removed);
        Assert.assertEquals(1, list.size());
        Assert.assertFalse(list.contains("A"));

        // Re-add should now succeed
        Assert.assertTrue(list.add("A"));
    }

    @Test
    public void asSet_shouldReturnUnmodifiableSetView() {
        // Arrange
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("1");
        list.add("2");

        // Act
        Set set = list.asSet();

        // Assert
        Assert.assertNotNull(set);
        Assert.assertEquals(2, set.size());
        Assert.assertTrue(set.contains("1"));
        Assert.assertTrue(set.contains("2"));
    }

    @Test
    public void subList_shouldReturnDecoratedSubList() {
        // Arrange
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("1");
        list.add("2");
        list.add("3");

        // Act
        List sub = list.subList(0, 2);

        // Assert
        Assert.assertEquals(2, sub.size());
        Assert.assertTrue(sub instanceof SetUniqueList);
    }
}
