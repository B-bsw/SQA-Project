package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Comprehensive Unit Tests for {@link ArrayUtils}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class ArrayUtilsTest {

    @Test
    public void isEmptyAndGetLength_givenArrays_shouldEvaluateProperly() {
        // Arrange & Act & Assert
        assertTrue(ArrayUtils.isEmpty((Object[]) null));
        assertTrue(ArrayUtils.isEmpty(new String[0]));
        assertFalse(ArrayUtils.isEmpty(new String[] { "a" }));
        assertEquals(0, ArrayUtils.getLength(null));
        assertEquals(3, ArrayUtils.getLength(new int[] { 1, 2, 3 }));
    }

    @Test
    public void containsAndIndexOf_shouldLocateElements() {
        // Arrange
        String[] array = new String[] { "apple", "banana", "cherry" };

        // Act & Assert
        assertTrue(ArrayUtils.contains(array, "banana"));
        assertFalse(ArrayUtils.contains(array, "orange"));
        assertEquals(1, ArrayUtils.indexOf(array, "banana"));
        assertEquals(-1, ArrayUtils.indexOf(array, "grape"));
    }

    @Test
    public void addAndAddAll_shouldAppendElements() {
        // Arrange
        String[] original = new String[] { "a", "b" };

        // Act
        String[] withAdded = ArrayUtils.add(original, "c");
        String[] combined = ArrayUtils.addAll(original, new String[] { "x", "y" });

        // Assert
        assertArrayEquals(new String[] { "a", "b", "c" }, withAdded);
        assertArrayEquals(new String[] { "a", "b", "x", "y" }, combined);
    }

    @Test
    public void remove_shouldRemoveElementAtIndex() {
        // Arrange
        String[] array = new String[] { "a", "b", "c", "d" };

        // Act
        String[] result = ArrayUtils.remove(array, 1);

        // Assert
        assertArrayEquals(new String[] { "a", "c", "d" }, result);
    }

    @Test
    public void toPrimitiveAndToObject_shouldBoxAndUnbox() {
        // Arrange
        Integer[] boxed = new Integer[] { Integer.valueOf(1), Integer.valueOf(2) };
        int[] primitive = new int[] { 1, 2 };

        // Act & Assert
        assertArrayEquals(primitive, ArrayUtils.toPrimitive(boxed));
        assertArrayEquals(boxed, ArrayUtils.toObject(primitive));
    }
}
