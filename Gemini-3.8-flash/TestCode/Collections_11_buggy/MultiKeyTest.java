package org.apache.commons.collections.keyvalue;

import org.junit.Assert;
import org.junit.Test;

public class MultiKeyTest {

    @Test
    public void twoKeyConstructor_givenKeys_shouldInitializeProperly() {
        // Arrange & Act
        MultiKey mk = new MultiKey("k1", "k2");

        // Assert
        Assert.assertEquals(2, mk.size());
        Assert.assertEquals("k1", mk.getKey(0));
        Assert.assertEquals("k2", mk.getKey(1));
    }

    @Test
    public void threeKeyConstructor_givenKeys_shouldInitializeProperly() {
        // Arrange & Act
        MultiKey mk = new MultiKey("k1", "k2", "k3");

        // Assert
        Assert.assertEquals(3, mk.size());
        Assert.assertEquals("k1", mk.getKey(0));
        Assert.assertEquals("k2", mk.getKey(1));
        Assert.assertEquals("k3", mk.getKey(2));
    }

    @Test
    public void fourKeyConstructor_givenKeys_shouldInitializeProperly() {
        // Arrange & Act
        MultiKey mk = new MultiKey("1", "2", "3", "4");

        // Assert
        Assert.assertEquals(4, mk.size());
        Assert.assertEquals("4", mk.getKey(3));
    }

    @Test
    public void fiveKeyConstructor_givenKeys_shouldInitializeProperly() {
        // Arrange & Act
        MultiKey mk = new MultiKey("1", "2", "3", "4", "5");

        // Assert
        Assert.assertEquals(5, mk.size());
        Assert.assertEquals("5", mk.getKey(4));
    }

    @Test(expected = IllegalArgumentException.class)
    public void arrayConstructor_givenNullArray_shouldThrowIllegalArgumentException() {
        // Arrange, Act & Assert
        new MultiKey((Object[]) null);
    }

    @Test
    public void getKeys_shouldReturnCopyOrUnderlyingArray() {
        // Arrange
        MultiKey mk = new MultiKey("A", "B");

        // Act
        Object[] keys = mk.getKeys();

        // Assert
        Assert.assertNotNull(keys);
        Assert.assertEquals(2, keys.length);
        Assert.assertEquals("A", keys[0]);
        Assert.assertEquals("B", keys[1]);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void getKey_givenOutOfBoundsIndex_shouldThrowArrayIndexOutOfBoundsException() {
        // Arrange
        MultiKey mk = new MultiKey("A", "B");

        // Act & Assert
        mk.getKey(5);
    }

    @Test
    public void equalsAndHashCode_givenSameKeys_shouldBeEqual() {
        // Arrange
        MultiKey mk1 = new MultiKey("x", "y");
        MultiKey mk2 = new MultiKey("x", "y");

        // Act & Assert
        Assert.assertTrue(mk1.equals(mk2));
        Assert.assertTrue(mk2.equals(mk1));
        Assert.assertEquals(mk1.hashCode(), mk2.hashCode());
    }

    @Test
    public void equalsAndHashCode_givenDifferentKeys_shouldNotBeEqual() {
        // Arrange
        MultiKey mk1 = new MultiKey("x", "y");
        MultiKey mk2 = new MultiKey("x", "z");

        // Act & Assert
        Assert.assertFalse(mk1.equals(mk2));
        Assert.assertFalse(mk1.equals(null));
        Assert.assertFalse(mk1.equals("differentType"));
    }

    @Test
    public void toString_shouldIncludeAllKeys() {
        // Arrange
        MultiKey mk = new MultiKey("apple", "banana");

        // Act
        String str = mk.toString();

        // Assert
        Assert.assertTrue(str.contains("apple"));
        Assert.assertTrue(str.contains("banana"));
    }
}
