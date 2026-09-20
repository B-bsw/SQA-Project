package org.mockito.internal.matchers;

import org.junit.Assert;
import org.junit.Test;

public class EqualityTest {

    @Test
    public void constructor_whenInstantiated_shouldNotBeNull() {
        // Arrange & Act
        Equality equality = new Equality();

        // Assert
        Assert.assertNotNull(equality);
    }

    @Test
    public void areEqual_givenBothNull_shouldReturnTrue() {
        // Arrange
        Object o1 = null;
        Object o2 = null;

        // Act
        boolean result = Equality.areEqual(o1, o2);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void areEqual_givenFirstNullSecondNonNull_shouldReturnFalse() {
        // Arrange
        Object o1 = null;
        Object o2 = "test";

        // Act
        boolean result = Equality.areEqual(o1, o2);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void areEqual_givenFirstNonNullSecondNull_shouldReturnFalse() {
        // Arrange
        Object o1 = "test";
        Object o2 = null;

        // Act
        boolean result = Equality.areEqual(o1, o2);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void areEqual_givenEqualNonArrayObjects_shouldReturnTrue() {
        // Arrange
        Object o1 = new String("hello");
        Object o2 = new String("hello");

        // Act
        boolean result = Equality.areEqual(o1, o2);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void areEqual_givenUnequalNonArrayObjects_shouldReturnFalse() {
        // Arrange
        Object o1 = "hello";
        Object o2 = "world";

        // Act
        boolean result = Equality.areEqual(o1, o2);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void areEqual_givenArrayFirstAndNonArraySecond_shouldReturnFalse() {
        // Arrange
        Object o1 = new int[]{1, 2, 3};
        Object o2 = "notAnArray";

        // Act
        boolean result = Equality.areEqual(o1, o2);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void areEqual_givenNonArrayFirstAndArraySecond_shouldReturnFalse() {
        // Arrange
        Object o1 = "notAnArray";
        Object o2 = new int[]{1, 2, 3};

        // Act
        boolean result = Equality.areEqual(o1, o2);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void areEqual_givenEqualPrimitiveIntArrays_shouldReturnTrue() {
        // Arrange
        int[] a1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{1, 2, 3};

        // Act
        boolean result = Equality.areEqual(a1, a2);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void areEqual_givenDifferentLengthsPrimitiveIntArrays_shouldReturnFalse() {
        // Arrange
        int[] a1 = new int[]{1, 2};
        int[] a2 = new int[]{1, 2, 3};

        // Act
        boolean result = Equality.areEqual(a1, a2);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void areEqual_givenSameLengthDifferentElementsPrimitiveIntArrays_shouldReturnFalse() {
        // Arrange
        int[] a1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{1, 4, 3};

        // Act
        boolean result = Equality.areEqual(a1, a2);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void areEqual_givenBothEmptyArrays_shouldReturnTrue() {
        // Arrange
        int[] a1 = new int[0];
        int[] a2 = new int[0];

        // Act
        boolean result = Equality.areEqual(a1, a2);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void areEqual_givenEqualObjectArrays_shouldReturnTrue() {
        // Arrange
        String[] a1 = new String[]{"alpha", "beta"};
        String[] a2 = new String[]{"alpha", "beta"};

        // Act
        boolean result = Equality.areEqual(a1, a2);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void areEqual_givenObjectArraysWithNullElements_shouldReturnTrue() {
        // Arrange
        Object[] a1 = new Object[]{"alpha", null, "gamma"};
        Object[] a2 = new Object[]{"alpha", null, "gamma"};

        // Act
        boolean result = Equality.areEqual(a1, a2);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void areEqual_givenObjectArraysWithOneNullElementMismatch_shouldReturnFalse() {
        // Arrange
        Object[] a1 = new Object[]{"alpha", null};
        Object[] a2 = new Object[]{"alpha", "notNull"};

        // Act
        boolean result = Equality.areEqual(a1, a2);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void areEqual_givenMultiDimensionalArraysEqual_shouldReturnTrue() {
        // Arrange
        int[][] a1 = new int[][]{{1, 2}, {3, 4}};
        int[][] a2 = new int[][]{{1, 2}, {3, 4}};

        // Act
        boolean result = Equality.areEqual(a1, a2);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void areEqual_givenMultiDimensionalArraysDifferent_shouldReturnFalse() {
        // Arrange
        int[][] a1 = new int[][]{{1, 2}, {3, 4}};
        int[][] a2 = new int[][]{{1, 2}, {3, 5}};

        // Act
        boolean result = Equality.areEqual(a1, a2);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void areEqual_givenDifferentPrimitiveArrayTypes_shouldReturnFalse() {
        // Arrange
        int[] a1 = new int[]{1, 2};
        long[] a2 = new long[]{1L, 2L};

        // Act
        boolean result = Equality.areEqual(a1, a2);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void areEqual_givenEqualBooleanArrays_shouldReturnTrue() {
        // Arrange
        boolean[] a1 = new boolean[]{true, false};
        boolean[] a2 = new boolean[]{true, false};

        // Act
        boolean result = Equality.areEqual(a1, a2);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void areEqual_givenEqualByteArray_shouldReturnTrue() {
        // Arrange
        byte[] a1 = new byte[]{1, 2};
        byte[] a2 = new byte[]{1, 2};

        // Act
        boolean result = Equality.areEqual(a1, a2);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void areEqual_givenEqualCharArray_shouldReturnTrue() {
        // Arrange
        char[] a1 = new char[]{'a', 'b'};
        char[] a2 = new char[]{'a', 'b'};

        // Act
        boolean result = Equality.areEqual(a1, a2);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void areEqual_givenEqualShortArray_shouldReturnTrue() {
        // Arrange
        short[] a1 = new short[]{10, 20};
        short[] a2 = new short[]{10, 20};

        // Act
        boolean result = Equality.areEqual(a1, a2);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void areEqual_givenEqualFloatArray_shouldReturnTrue() {
        // Arrange
        float[] a1 = new float[]{1.0f, 2.5f};
        float[] a2 = new float[]{1.0f, 2.5f};

        // Act
        boolean result = Equality.areEqual(a1, a2);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void areEqual_givenEqualDoubleArray_shouldReturnTrue() {
        // Arrange
        double[] a1 = new double[]{1.0, 2.5};
        double[] a2 = new double[]{1.0, 2.5};

        // Act
        boolean result = Equality.areEqual(a1, a2);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void areArraysEqual_givenIdenticalArrays_shouldReturnTrue() {
        // Arrange
        String[] a1 = new String[]{"one", "two"};
        String[] a2 = new String[]{"one", "two"};

        // Act
        boolean result = Equality.areArraysEqual(a1, a2);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void areArraysEqual_givenDifferentLengthArrays_shouldReturnFalse() {
        // Arrange
        String[] a1 = new String[]{"one"};
        String[] a2 = new String[]{"one", "two"};

        // Act
        boolean result = Equality.areArraysEqual(a1, a2);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void areArraysEqual_givenSameLengthDifferentElements_shouldReturnFalse() {
        // Arrange
        String[] a1 = new String[]{"one", "two"};
        String[] a2 = new String[]{"one", "three"};

        // Act
        boolean result = Equality.areArraysEqual(a1, a2);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void areArrayLengthsEqual_givenSameLength_shouldReturnTrue() {
        // Arrange
        int[] a1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{4, 5, 6};

        // Act
        boolean result = Equality.areArrayLengthsEqual(a1, a2);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void areArrayLengthsEqual_givenDifferentLengths_shouldReturnFalse() {
        // Arrange
        int[] a1 = new int[]{1};
        int[] a2 = new int[]{1, 2};

        // Act
        boolean result = Equality.areArrayLengthsEqual(a1, a2);

        // Assert
        Assert.assertFalse(result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void areArrayLengthsEqual_givenNonArrayFirstArgument_shouldThrowIllegalArgumentException() {
        // Arrange
        Object notAnArray = "string";
        int[] validArray = new int[]{1};

        // Act
        Equality.areArrayLengthsEqual(notAnArray, validArray);
    }

    @Test(expected = IllegalArgumentException.class)
    public void areArrayLengthsEqual_givenNonArraySecondArgument_shouldThrowIllegalArgumentException() {
        // Arrange
        int[] validArray = new int[]{1};
        Object notAnArray = "string";

        // Act
        Equality.areArrayLengthsEqual(validArray, notAnArray);
    }

    @Test
    public void areArrayElementsEqual_givenMatchingElements_shouldReturnTrue() {
        // Arrange
        String[] a1 = new String[]{"x", "y", "z"};
        String[] a2 = new String[]{"x", "y", "z"};

        // Act
        boolean result = Equality.areArrayElementsEqual(a1, a2);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void areArrayElementsEqual_givenMismatchAtFirstElement_shouldReturnFalse() {
        // Arrange
        String[] a1 = new String[]{"x", "y", "z"};
        String[] a2 = new String[]{"diff", "y", "z"};

        // Act
        boolean result = Equality.areArrayElementsEqual(a1, a2);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void areArrayElementsEqual_givenMismatchAtLastElement_shouldReturnFalse() {
        // Arrange
        String[] a1 = new String[]{"x", "y", "z"};
        String[] a2 = new String[]{"x", "y", "diff"};

        // Act
        boolean result = Equality.areArrayElementsEqual(a1, a2);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void areArrayElementsEqual_givenEmptyArrays_shouldReturnTrue() {
        // Arrange
        int[] a1 = new int[0];
        int[] a2 = new int[0];

        // Act
        boolean result = Equality.areArrayElementsEqual(a1, a2);

        // Assert
        Assert.assertTrue(result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void areArrayElementsEqual_givenNonArray_shouldThrowIllegalArgumentException() {
        // Arrange
        Object notAnArray = "string";
        int[] validArray = new int[]{1};

        // Act
        Equality.areArrayElementsEqual(notAnArray, validArray);
    }

    @Test
    public void isArray_givenArrayObject_shouldReturnTrue() {
        // Arrange
        Object arrayObj = new int[]{1, 2};

        // Act
        boolean result = Equality.isArray(arrayObj);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void isArray_givenNonArrayObject_shouldReturnFalse() {
        // Arrange
        Object nonArrayObj = "string";

        // Act
        boolean result = Equality.isArray(nonArrayObj);

        // Assert
        Assert.assertFalse(result);
    }

    @Test(expected = NullPointerException.class)
    public void isArray_givenNull_shouldThrowNullPointerException() {
        // Arrange
        Object nullObj = null;

        // Act
        Equality.isArray(nullObj);
    }
}