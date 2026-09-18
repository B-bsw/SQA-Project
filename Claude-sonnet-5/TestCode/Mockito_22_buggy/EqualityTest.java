package org.mockito.internal.matchers;

import org.junit.Test;
import static org.junit.Assert.*;

public class EqualityTest {

    @Test
    public void bothNullShouldBeEqual() {
        assertTrue(Equality.areEqual(null, null));
    }

    @Test
    public void firstNullSecondNotNullShouldNotBeEqual() {
        assertFalse(Equality.areEqual(null, "foo"));
    }

    @Test
    public void firstNotNullSecondNullShouldNotBeEqual() {
        assertFalse(Equality.areEqual("foo", null));
    }

    @Test
    public void equalObjectsShouldBeEqual() {
        assertTrue(Equality.areEqual("foo", "foo"));
    }

    @Test
    public void differentObjectsShouldNotBeEqual() {
        assertFalse(Equality.areEqual("foo", "bar"));
    }

    @Test
    public void sameIntegerValuesShouldBeEqual() {
        assertTrue(Equality.areEqual(Integer.valueOf(5), Integer.valueOf(5)));
    }

    @Test
    public void arrayAndNonArrayShouldNotBeEqual() {
        int[] array = new int[]{1, 2, 3};
        assertFalse(Equality.areEqual(array, "notAnArray"));
    }

    @Test
    public void nonArrayAndArrayShouldNotBeEqual() {
        int[] array = new int[]{1, 2, 3};
        assertFalse(Equality.areEqual("notAnArray", array));
    }

    @Test
    public void equalIntArraysShouldBeEqual() {
        int[] a1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{1, 2, 3};
        assertTrue(Equality.areEqual(a1, a2));
    }

    @Test
    public void differentLengthArraysShouldNotBeEqual() {
        int[] a1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{1, 2};
        assertFalse(Equality.areEqual(a1, a2));
    }

    @Test
    public void differentElementsArraysShouldNotBeEqual() {
        int[] a1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{1, 2, 4};
        assertFalse(Equality.areEqual(a1, a2));
    }

    @Test
    public void emptyArraysShouldBeEqual() {
        int[] a1 = new int[]{};
        int[] a2 = new int[]{};
        assertTrue(Equality.areEqual(a1, a2));
    }

    @Test
    public void singleElementArraysEqualShouldBeEqual() {
        int[] a1 = new int[]{42};
        int[] a2 = new int[]{42};
        assertTrue(Equality.areEqual(a1, a2));
    }

    @Test
    public void multiElementArraysWithNullElementsShouldBeEqual() {
        String[] a1 = new String[]{"a", null, "c"};
        String[] a2 = new String[]{"a", null, "c"};
        assertTrue(Equality.areEqual(a1, a2));
    }

    @Test
    public void multiElementArraysWithDifferentNullPositionsShouldNotBeEqual() {
        String[] a1 = new String[]{"a", null, "c"};
        String[] a2 = new String[]{"a", "b", "c"};
        assertFalse(Equality.areEqual(a1, a2));
    }

    @Test
    public void nestedArraysEqualShouldBeEqual() {
        int[][] a1 = new int[][]{{1, 2}, {3, 4}};
        int[][] a2 = new int[][]{{1, 2}, {3, 4}};
        assertTrue(Equality.areEqual(a1, a2));
    }

    @Test
    public void nestedArraysDifferentShouldNotBeEqual() {
        int[][] a1 = new int[][]{{1, 2}, {3, 4}};
        int[][] a2 = new int[][]{{1, 2}, {3, 5}};
        assertFalse(Equality.areEqual(a1, a2));
    }

    @Test
    public void objectArraysEqualShouldBeEqual() {
        Object[] a1 = new Object[]{"foo", Integer.valueOf(1)};
        Object[] a2 = new Object[]{"foo", Integer.valueOf(1)};
        assertTrue(Equality.areEqual(a1, a2));
    }

    @Test
    public void areArraysEqualDirectCallEqualArrays() {
        int[] a1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{1, 2, 3};
        assertTrue(Equality.areArraysEqual(a1, a2));
    }

    @Test
    public void areArraysEqualDirectCallDifferentLength() {
        int[] a1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{1, 2};
        assertFalse(Equality.areArraysEqual(a1, a2));
    }

    @Test
    public void areArrayLengthsEqualSameLength() {
        int[] a1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{4, 5, 6};
        assertTrue(Equality.areArrayLengthsEqual(a1, a2));
    }

    @Test
    public void areArrayLengthsEqualDifferentLength() {
        int[] a1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{4, 5};
        assertFalse(Equality.areArrayLengthsEqual(a1, a2));
    }

    @Test
    public void areArrayElementsEqualZeroIterations() {
        int[] a1 = new int[]{};
        int[] a2 = new int[]{};
        assertTrue(Equality.areArrayElementsEqual(a1, a2));
    }

    @Test
    public void areArrayElementsEqualOneIteration() {
        int[] a1 = new int[]{7};
        int[] a2 = new int[]{7};
        assertTrue(Equality.areArrayElementsEqual(a1, a2));
    }

    @Test
    public void areArrayElementsEqualMultipleIterationsEqual() {
        int[] a1 = new int[]{1, 2, 3, 4};
        int[] a2 = new int[]{1, 2, 3, 4};
        assertTrue(Equality.areArrayElementsEqual(a1, a2));
    }

    @Test
    public void areArrayElementsEqualMultipleIterationsNotEqual() {
        int[] a1 = new int[]{1, 2, 3, 4};
        int[] a2 = new int[]{1, 2, 9, 4};
        assertFalse(Equality.areArrayElementsEqual(a1, a2));
    }

    @Test
    public void isArrayTrueForArray() {
        int[] a = new int[]{1, 2, 3};
        assertTrue(Equality.isArray(a));
    }

    @Test
    public void isArrayFalseForNonArray() {
        assertFalse(Equality.isArray("notAnArray"));
    }

    @Test(expected = NullPointerException.class)
    public void isArrayThrowsNullPointerExceptionForNull() {
        Equality.isArray(null);
    }
}