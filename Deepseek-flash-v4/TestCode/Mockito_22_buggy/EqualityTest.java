package org.mockito.internal.matchers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class EqualityTest {

    // ---------- Test areEqual method ----------

    @Test
    public void testAreEqualBothNull() {
        assertTrue(Equality.areEqual(null, null));
    }

    @Test
    public void testAreEqualFirstNullSecondNotNull() {
        assertFalse(Equality.areEqual(null, "value"));
    }

    @Test
    public void testAreEqualFirstNotNullSecondNull() {
        assertFalse(Equality.areEqual("value", null));
    }

    @Test
    public void testAreEqualBothNonNullNonArraysEqual() {
        assertTrue(Equality.areEqual("hello", "hello"));
    }

    @Test
    public void testAreEqualBothNonNullNonArraysNotEqual() {
        assertFalse(Equality.areEqual("hello", "world"));
    }

    @Test
    public void testAreEqualNonNullNonArrayVsArray() {
        String[] array = {"a"};
        assertFalse(Equality.areEqual("hello", array));
    }

    @Test
    public void testAreEqualArrayVsNonNullNonArray() {
        String[] array = {"a"};
        assertFalse(Equality.areEqual(array, "hello"));
    }

    @Test
    public void testAreEqualBothArraysEqual() {
        String[] array1 = {"a", "b", "c"};
        String[] array2 = {"a", "b", "c"};
        assertTrue(Equality.areEqual(array1, array2));
    }

    @Test
    public void testAreEqualBothArraysNotEqualLength() {
        String[] array1 = {"a", "b", "c"};
        String[] array2 = {"a", "b"};
        assertFalse(Equality.areEqual(array1, array2));
    }

    @Test
    public void testAreEqualBothArraysNotEqualElements() {
        String[] array1 = {"a", "b", "c"};
        String[] array2 = {"a", "b", "d"};
        assertFalse(Equality.areEqual(array1, array2));
    }

    @Test
    public void testAreEqualNestedArrays() {
        String[][] array1 = {{"a", "b"}, {"c", "d"}};
        String[][] array2 = {{"a", "b"}, {"c", "d"}};
        assertTrue(Equality.areEqual(array1, array2));
    }

    @Test
    public void testAreEqualPrimitiveArrays() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        assertTrue(Equality.areEqual(array1, array2));
    }

    @Test
    public void testAreEqualPrimitiveArraysNotEqual() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 4};
        assertFalse(Equality.areEqual(array1, array2));
    }

    @Test
    public void testAreEqualCharArray() {
        char[] array1 = {'a', 'b'};
        char[] array2 = {'a', 'b'};
        assertTrue(Equality.areEqual(array1, array2));
    }

    @Test
    public void testAreEqualBooleanArray() {
        boolean[] array1 = {true, false, true};
        boolean[] array2 = {true, false, true};
        assertTrue(Equality.areEqual(array1, array2));
    }

    @Test
    public void testAreEqualNullArrayElement() {
        String[] array1 = {"a", null, "c"};
        String[] array2 = {"a", null, "c"};
        assertTrue(Equality.areEqual(array1, array2));
    }

    @Test
    public void testAreEqualNullArrayElementNotEqual() {
        String[] array1 = {"a", null, "c"};
        String[] array2 = {"a", "b", "c"};
        assertFalse(Equality.areEqual(array1, array2));
    }

    @Test
    public void testAreEqualZeroLengthArrays() {
        String[] array1 = {};
        String[] array2 = {};
        assertTrue(Equality.areEqual(array1, array2));
    }

    // ---------- Test areArraysEqual method (directly) ----------

    @Test
    public void testAreArraysEqualLengthsEqualElementsEqual() {
        String[] array1 = {"a", "b"};
        String[] array2 = {"a", "b"};
        assertTrue(Equality.areArraysEqual(array1, array2));
    }

    @Test
    public void testAreArraysEqualLengthsEqualElementsNotEqual() {
        String[] array1 = {"a", "b"};
        String[] array2 = {"a", "c"};
        assertFalse(Equality.areArraysEqual(array1, array2));
    }

    @Test
    public void testAreArraysEqualLengthsNotEqual() {
        String[] array1 = {"a", "b"};
        String[] array2 = {"a"};
        assertFalse(Equality.areArraysEqual(array1, array2));
    }

    // ---------- Test areArrayLengthsEqual method (directly) ----------

    @Test
    public void testAreArrayLengthsEqualTrue() {
        String[] array1 = {"a", "b"};
        String[] array2 = {"x", "y"};
        assertTrue(Equality.areArrayLengthsEqual(array1, array2));
    }

    @Test
    public void testAreArrayLengthsEqualFalse() {
        String[] array1 = {"a", "b"};
        String[] array2 = {"x"};
        assertFalse(Equality.areArrayLengthsEqual(array1, array2));
    }

    // ---------- Test areArrayElementsEqual method (directly) ----------

    @Test
    public void testAreArrayElementsEqualTrue() {
        String[] array1 = {"a", "b"};
        String[] array2 = {"a", "b"};
        assertTrue(Equality.areArrayElementsEqual(array1, array2));
    }

    @Test
    public void testAreArrayElementsEqualFalse() {
        String[] array1 = {"a", "b"};
        String[] array2 = {"a", "c"};
        assertFalse(Equality.areArrayElementsEqual(array1, array2));
    }

    // ---------- Test isArray method (directly) ----------

    @Test
    public void testIsArrayWithArray() {
        String[] array = {"a"};
        assertTrue(Equality.isArray(array));
    }

    @Test
    public void testIsArrayWithNonArray() {
        String notArray = "not array";
        assertFalse(Equality.isArray(notArray));
    }

    @Test
    public void testIsArrayWithPrimitiveArray() {
        int[] array = {1, 2};
        assertTrue(Equality.isArray(array));
    }

    @Test
    public void testIsArrayWithNullArray() {
        String[] array = null;
        try {
            Equality.isArray(array);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }
}