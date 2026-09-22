package org.apache.commons.collections.map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class MultiValueMapTest {

    private MultiValueMap map;

    @Before
    public void setUp() {
        this.map = new MultiValueMap();
    }

    @Test
    public void defaultConstructor_shouldInitializeEmptyMap() {
        // Arrange & Act
        MultiValueMap emptyMap = new MultiValueMap();

        // Assert
        Assert.assertNotNull(emptyMap);
        Assert.assertTrue(emptyMap.isEmpty());
        Assert.assertEquals(0, emptyMap.size());
        Assert.assertEquals(0, emptyMap.totalSize());
    }

    @Test
    public void put_givenSameKeyMultipleTimes_shouldStoreInCollection() {
        // Arrange & Act
        this.map.put("numbers", new Integer(1));
        this.map.put("numbers", new Integer(2));
        this.map.put("numbers", new Integer(3));

        // Assert
        Assert.assertEquals(1, this.map.size());
        Assert.assertEquals(3, this.map.totalSize());
        Assert.assertEquals(3, this.map.size("numbers"));

        Collection vals = (Collection) this.map.get("numbers");
        Assert.assertNotNull(vals);
        Assert.assertEquals(3, vals.size());
        Assert.assertTrue(vals.contains(new Integer(1)));
        Assert.assertTrue(vals.contains(new Integer(2)));
        Assert.assertTrue(vals.contains(new Integer(3)));
    }

    @Test
    public void getCollection_givenKey_shouldReturnCollectionOfValues() {
        // Arrange
        this.map.put("k", "v1");
        this.map.put("k", "v2");

        // Act
        Collection coll = this.map.getCollection("k");

        // Assert
        Assert.assertNotNull(coll);
        Assert.assertEquals(2, coll.size());
        Assert.assertTrue(coll.contains("v1"));
        Assert.assertTrue(coll.contains("v2"));
    }

    @Test
    public void remove_givenKeyAndItem_shouldRemoveSpecificItem() {
        // Arrange
        this.map.put("colors", "red");
        this.map.put("colors", "blue");
        this.map.put("colors", "green");

        // Act
        Object removed = this.map.remove("colors", "blue");

        // Assert
        Assert.assertEquals("blue", removed);
        Assert.assertEquals(2, this.map.size("colors"));
        Assert.assertFalse(this.map.containsValue("colors", "blue"));
        Assert.assertTrue(this.map.containsValue("colors", "red"));
    }

    @Test
    public void containsValue_givenValue_shouldFindInAnyKey() {
        // Arrange
        this.map.put("k1", "apple");
        this.map.put("k2", "banana");

        // Act & Assert
        Assert.assertTrue(this.map.containsValue("apple"));
        Assert.assertTrue(this.map.containsValue("banana"));
        Assert.assertFalse(this.map.containsValue("orange"));
    }

    @Test
    public void putAll_givenCollectionOfValues_shouldAddAllToKey() {
        // Arrange
        List items = Arrays.asList(new String[] { "a", "b", "c" });

        // Act
        boolean changed = this.map.putAll("letters", items);

        // Assert
        Assert.assertTrue(changed);
        Assert.assertEquals(3, this.map.size("letters"));
    }

    @Test
    public void clear_givenPopulatedMap_shouldRemoveAllEntries() {
        // Arrange
        this.map.put("k1", "v1");
        this.map.put("k2", "v2");

        // Act
        this.map.clear();

        // Assert
        Assert.assertTrue(this.map.isEmpty());
        Assert.assertEquals(0, this.map.size());
        Assert.assertEquals(0, this.map.totalSize());
    }

    @Test
    public void iterator_givenKey_shouldIterateValues() {
        // Arrange
        this.map.put("group", "val1");
        this.map.put("group", "val2");

        // Act
        Iterator it = this.map.iterator("group");
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }

        // Assert
        Assert.assertEquals(2, count);
    }
}
