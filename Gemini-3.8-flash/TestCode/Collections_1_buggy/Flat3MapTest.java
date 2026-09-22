package org.apache.commons.collections.map;

import org.apache.commons.collections.MapIterator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class Flat3MapTest {

    private Flat3Map map;

    @Before
    public void setUp() {
        this.map = new Flat3Map();
    }

    @Test
    public void defaultConstructor_givenNoParameters_shouldInitializeEmptyMap() {
        // Arrange & Act
        Flat3Map emptyMap = new Flat3Map();

        // Assert
        Assert.assertNotNull(emptyMap);
        Assert.assertTrue(emptyMap.isEmpty());
        Assert.assertEquals(0, emptyMap.size());
    }

    @Test
    public void mapConstructor_givenExistingMap_shouldCopyEntries() {
        // Arrange
        Map original = new HashMap();
        original.put("k1", "v1");
        original.put("k2", "v2");

        // Act
        Flat3Map copied = new Flat3Map(original);

        // Assert
        Assert.assertEquals(2, copied.size());
        Assert.assertEquals("v1", copied.get("k1"));
        Assert.assertEquals("v2", copied.get("k2"));
    }

    @Test
    public void putAndGet_givenOneToThreeEntries_shouldOperateInFlatMode() {
        // Arrange & Act
        this.map.put("key1", "val1");
        this.map.put("key2", "val2");
        this.map.put("key3", "val3");

        // Assert
        Assert.assertEquals(3, this.map.size());
        Assert.assertFalse(this.map.isEmpty());
        Assert.assertEquals("val1", this.map.get("key1"));
        Assert.assertEquals("val2", this.map.get("key2"));
        Assert.assertEquals("val3", this.map.get("key3"));
        Assert.assertNull(this.map.get("nonExistent"));
    }

    @Test
    public void putAndGet_givenMoreThanThreeEntries_shouldSwitchToDelegateMode() {
        // Arrange & Act
        this.map.put("k1", "v1");
        this.map.put("k2", "v2");
        this.map.put("k3", "v3");
        this.map.put("k4", "v4");
        this.map.put("k5", "v5");

        // Assert
        Assert.assertEquals(5, this.map.size());
        Assert.assertEquals("v1", this.map.get("k1"));
        Assert.assertEquals("v2", this.map.get("k2"));
        Assert.assertEquals("v3", this.map.get("k3"));
        Assert.assertEquals("v4", this.map.get("k4"));
        Assert.assertEquals("v5", this.map.get("k5"));
    }

    @Test
    public void put_givenExistingKey_shouldUpdateValueAndReturnOldValue() {
        // Arrange
        this.map.put("k1", "initial");

        // Act
        Object oldVal = this.map.put("k1", "updated");

        // Assert
        Assert.assertEquals("initial", oldVal);
        Assert.assertEquals("updated", this.map.get("k1"));
        Assert.assertEquals(1, this.map.size());
    }

    @Test
    public void remove_givenKeyInFlatMode_shouldRemoveAndDecrementSize() {
        // Arrange
        this.map.put("k1", "v1");
        this.map.put("k2", "v2");

        // Act
        Object removed = this.map.remove("k1");

        // Assert
        Assert.assertEquals("v1", removed);
        Assert.assertEquals(1, this.map.size());
        Assert.assertNull(this.map.get("k1"));
        Assert.assertEquals("v2", this.map.get("k2"));
    }

    @Test
    public void remove_givenKeyInDelegateMode_shouldRemoveFromDelegate() {
        // Arrange
        this.map.put("k1", "v1");
        this.map.put("k2", "v2");
        this.map.put("k3", "v3");
        this.map.put("k4", "v4");

        // Act
        Object removed = this.map.remove("k1");

        // Assert
        Assert.assertEquals("v1", removed);
        Assert.assertEquals(3, this.map.size());
        Assert.assertNull(this.map.get("k1"));
    }

    @Test
    public void clear_givenPopulatedMap_shouldResetToFlatModeAndEmpty() {
        // Arrange
        this.map.put("k1", "v1");
        this.map.put("k2", "v2");
        this.map.put("k3", "v3");
        this.map.put("k4", "v4");

        // Act
        this.map.clear();

        // Assert
        Assert.assertEquals(0, this.map.size());
        Assert.assertTrue(this.map.isEmpty());
        Assert.assertNull(this.map.get("k1"));
    }

    @Test
    public void containsKeyAndContainsValue_givenValues_shouldReturnAccurately() {
        // Arrange
        this.map.put("name", "Alice");
        this.map.put("city", "Paris");

        // Act & Assert
        Assert.assertTrue(this.map.containsKey("name"));
        Assert.assertFalse(this.map.containsKey("age"));
        Assert.assertTrue(this.map.containsValue("Alice"));
        Assert.assertFalse(this.map.containsValue("London"));
    }

    @Test
    public void mapIterator_givenEntries_shouldIterateAllKeysAndValues() {
        // Arrange
        this.map.put("a", "1");
        this.map.put("b", "2");

        // Act
        MapIterator it = this.map.mapIterator();
        int count = 0;
        while (it.hasNext()) {
            it.next();
            Assert.assertNotNull(it.getKey());
            Assert.assertNotNull(it.getValue());
            count++;
        }

        // Assert
        Assert.assertEquals(2, count);
    }

    @Test
    public void clone_givenPopulatedMap_shouldReturnIndependentCopy() {
        // Arrange
        this.map.put("x", "100");
        this.map.put("y", "200");

        // Act
        Flat3Map cloned = (Flat3Map) this.map.clone();

        // Assert
        Assert.assertNotNull(cloned);
        Assert.assertEquals(this.map.size(), cloned.size());
        Assert.assertEquals(this.map.get("x"), cloned.get("x"));

        // Mutate clone
        cloned.put("x", "999");
        Assert.assertEquals("100", this.map.get("x"));
    }

    @Test
    public void equalsAndHashCode_givenMapsWithSameEntries_shouldBeEqual() {
        // Arrange
        Flat3Map m1 = new Flat3Map();
        m1.put("k1", "v1");
        Flat3Map m2 = new Flat3Map();
        m2.put("k1", "v1");

        // Act & Assert
        Assert.assertTrue(m1.equals(m2));
        Assert.assertEquals(m1.hashCode(), m2.hashCode());
    }
}
