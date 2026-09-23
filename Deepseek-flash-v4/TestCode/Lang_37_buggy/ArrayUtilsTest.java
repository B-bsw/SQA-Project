package org.apache.commons.lang3;

import static org.junit.Assert.*;
import org.junit.Test;

public class ArrayUtilsTest {

    @Test
    public void testToString() {
        assertEquals("{}", ArrayUtils.toString(null));
        int[] arr = {1, 2};
        String result = ArrayUtils.toString(arr);
        assertNotNull(result);
        assertTrue(result.contains("1"));
    }

    @Test
    public void testToStringWithDefault() {
        assertEquals("default", ArrayUtils.toString(null, "default"));
        int[] arr = {3};
        String result = ArrayUtils.toString(arr, "fallback");
        assertTrue(result.contains("3"));
    }

    @Test
    public void testIsEquals() {
        assertTrue(ArrayUtils.isEquals(null, null));
        int[] a = {1};
        int[] b = {1};
        assertTrue(ArrayUtils.isEquals(a, b));
        assertFalse(ArrayUtils.isEquals(new int[]{1}, new int[]{2}));
    }

    @Test
    public void testToMap() {
        assertNull(ArrayUtils.toMap(null));
        Object[] input = {new java.util.AbstractMap.SimpleEntry<>("key", "val")};
        assertEquals("val", ArrayUtils.toMap(input).get("key"));
        Object[] entryArray = {new Object[]{"k", "v"}};
        assertEquals("v", ArrayUtils.toMap(entryArray).get("k"));
        try {
            ArrayUtils.toMap(new Object[]{new Object[]{"only"}});
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) { /* expected */ }
        try {
            ArrayUtils.toMap(new Object[]{"string"});
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) { /* expected */ }
    }

    @Test
    public void testClone() {
        assertNull(ArrayUtils.clone((Object[]) null));
        String[] original = {"a", "b"};
        String[] cloned = ArrayUtils.clone(original);
        assertNotNull(cloned);
        assertNotSame(original, cloned);
        assertArrayEquals(original, cloned);
        assertNull(ArrayUtils.clone((int[]) null));
        int[] iOrig = {1,2};
        int[] iClone = ArrayUtils.clone(iOrig);
        assertNotSame(iOrig, iClone);
        assertArrayEquals(iOrig, iClone);
    }

    @Test
    public void testSubarray() {
        assertNull(ArrayUtils.subarray((Object[]) null, 0, 1));
        Object[] arr = {"x", "y", "z"};
        assertArrayEquals(new Object[]{"x","y"}, ArrayUtils.subarray(arr, 0, 2));
        assertArrayEquals(new Object[]{"x","y","z"}, ArrayUtils.subarray(arr, -1, 5));
        assertArrayEquals(new Object[0], ArrayUtils.subarray(arr, 2, 2));
        assertArrayEquals(new Object[0], ArrayUtils.subarray(arr, 3, 2));
        assertArrayEquals(new int[]{2,3}, ArrayUtils.subarray(new int[]{1,2,3,4}, 1, 3));
        int[] empty = ArrayUtils.subarray(new int[]{1}, 1, 1);
        assertEquals(0, empty.length);
    }

    @Test
    public void testIsSameLength() {
        assertTrue(ArrayUtils.isSameLength((Object[]) null, (Object[]) null));
        assertFalse(ArrayUtils.isSameLength(new Object[]{"a"}, null));
        assertFalse(ArrayUtils.isSameLength(null, new Object[]{"a"}));
        assertTrue(ArrayUtils.isSameLength(new Object[0], null));
        assertFalse(ArrayUtils.isSameLength(new Object[2], new Object[1]));
        assertTrue(ArrayUtils.isSameLength(new int[3], new int[3]));
        assertFalse(ArrayUtils.isSameLength(new int[1], new int[2]));
        assertTrue(ArrayUtils.isSameLength(new int[0], null));
        assertTrue(ArrayUtils.isSameLength((boolean[]) null, (boolean[]) null));
        assertFalse(ArrayUtils.isSameLength(new boolean[1], null));
    }

    @Test
    public void testGetLength() {
        assertEquals(0, ArrayUtils.getLength(null));
        assertEquals(3, ArrayUtils.getLength(new Object[3]));
        assertEquals(0, ArrayUtils.getLength(new int[0]));
    }

    @Test
    public void testIsSameType() {
        try {
            ArrayUtils.isSameType(null, new int[1]);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) { /* expected */ }
        try {
            ArrayUtils.isSameType(new int[1], null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) { /* expected */ }
        assertTrue(ArrayUtils.isSameType(new int[1], new int[2]));
        assertFalse(ArrayUtils.isSameType(new int[1], new long[1]));
    }

    @Test
    public void testReverse() {
        int[] arr = null;
        ArrayUtils.reverse(arr); // no exception
        int[] reverseInt = {1,2,3};
        ArrayUtils.reverse(reverseInt);
        assertArrayEquals(new int[]{3,2,1}, reverseInt);
        String[] revObj = {"a","b","c"};
        ArrayUtils.reverse(revObj);
        assertArrayEquals(new String[]{"c","b","a"}, revObj);
        boolean[] revBool = {true, false, true};
        ArrayUtils.reverse(revBool);
        assertArrayEquals(new boolean[]{true, false, true}, revBool);
        char[] revChar = {'x','y'};
        ArrayUtils.reverse(revChar);
        assertArrayEquals(new char[]{'y','x'}, revChar);
        int[] single = {42};
        ArrayUtils.reverse(single);
        assertArrayEquals(new int[]{42}, single);
    }

    @Test
    public void testIndexOf() {
        assertEquals(-1, ArrayUtils.indexOf((Object[]) null, "x"));
        assertEquals(-1, ArrayUtils.indexOf(new Object[]{"a","b"}, null, 0));
        assertEquals(1, ArrayUtils.indexOf(new Object[]{"a",null,"b"}, null));
        assertEquals(0, ArrayUtils.indexOf(new Integer[]{1,2}, 1));
        assertEquals(-1, ArrayUtils.indexOf(new Object[]{"a","b"}, 1)); // type mismatch
        assertEquals(1, ArrayUtils.indexOf(new Object[]{"a","b","a"}, "b", 1));
        assertEquals(-1, ArrayUtils.indexOf(new Object[]{"a","b"}, "c"));
        assertEquals(0, ArrayUtils.indexOf(new int[]{1,2,3}, 1, -1));
        assertEquals(-1, ArrayUtils.indexOf(new int[]{}, 5));
    }

    @Test
    public void testLastIndexOf() {
        assertEquals(-1, ArrayUtils.lastIndexOf((Object[]) null, "x"));
        assertEquals(2, ArrayUtils.lastIndexOf(new Object[]{"a",null,"b",null}, null));
        assertEquals(2, ArrayUtils.lastIndexOf(new Integer[]{1,2,1}, 1));
        assertEquals(-1, ArrayUtils.lastIndexOf(new Object[]{"a"}, "b"));
        assertEquals(1, ArrayUtils.lastIndexOf(new int[]{1,2,1}, 2));
        assertEquals(-1, ArrayUtils.lastIndexOf(new int[]{}, 1, -5));
    }

    @Test
    public void testContains() {
        assertFalse(ArrayUtils.contains((Object[]) null, "x"));
        assertTrue(ArrayUtils.contains(new String[]{"a","b"}, "a"));
        assertFalse(ArrayUtils.contains(new boolean[]{true,false}, false, 1));
        assertTrue(ArrayUtils.contains(new double[]{1.0,2.0}, 2.0, 0.001));
        float[] f = {1.0f};
        assertTrue(ArrayUtils.contains(f, 1.0f));
    }

    @Test
    public void testIsEmpty() {
        assertTrue(ArrayUtils.isEmpty((Object[]) null));
        assertTrue(ArrayUtils.isEmpty(new Object[0]));
        assertFalse(ArrayUtils.isEmpty(new Object[1]));
        assertTrue(ArrayUtils.isEmpty((int[]) null));
        assertTrue(ArrayUtils.isEmpty(new int[0]));
        assertFalse(ArrayUtils.isEmpty(new int[]{1}));
    }

    @Test
    public void testAddAll() {
        assertNull(ArrayUtils.addAll((Object[]) null, (Object[]) null));
        String[] a = {"a"};
        assertArrayEquals(a, ArrayUtils.addAll(a, (String[]) null));
        assertArrayEquals(a, ArrayUtils.addAll((String[]) null, a));
        assertArrayEquals(new String[]{"a","b","c"}, ArrayUtils.addAll(new String[]{"a","b"}, new String[]{"c"}));
        assertArrayEquals(new int[]{1,2}, ArrayUtils.addAll(new int[]{1}, new int[]{2}));
        int[] empty = {};
        assertArrayEquals(new int[]{1}, ArrayUtils.addAll(empty, new int[]{1}));
    }

    @Test
    public void testAddElement() {
        assertArrayEquals(new String[]{"x"}, ArrayUtils.add((String[]) null, "x"));
        assertArrayEquals(new String[]{"a","b"}, ArrayUtils.add(new String[]{"a"}, "b"));
        boolean[] boolArr = {true};
        assertArrayEquals(new boolean[]{true, false}, ArrayUtils.add(boolArr, false));
        int[] intArr = {};
        assertArrayEquals(new int[]{1}, ArrayUtils.add(intArr, 1));
    }

    @Test
    public void testAddAtIndex() {
        assertEquals(new String[]{"a"}, ArrayUtils.add((String[]) null, 0, "a"));
        String[] arr = {"a","c"};
        assertArrayEquals(new String[]{"a","b","c"}, ArrayUtils.add(arr, 1, "b"));
        try {
            ArrayUtils.add((String[]) null, 1, "x");
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) { /* expected */ }
        try {
            ArrayUtils.add(new int[]{1}, -1, 2);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) { /* expected */ }
        try {
            ArrayUtils.add(new int[]{1}, 2, 3);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) { /* expected */ }
        // primitive add
        assertArrayEquals(new int[]{1,2,3}, ArrayUtils.add(new int[]{1,3}, 1, 2));
    }

    @Test
    public void testRemove() {
        try {
            ArrayUtils.remove(new int[]{1}, -1);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) { /* expected */ }
        try {
            ArrayUtils.remove(new int[]{1}, 1);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) { /* expected */ }
        assertArrayEquals(new int[]{1,3}, ArrayUtils.remove(new int[]{1,2,3}, 1));
        assertArrayEquals(new String[]{"a","c"}, ArrayUtils.remove(new String[]{"a","b","c"}, 1));
        char[] charArr = {'x','y','z'};
        assertArrayEquals(new char[]{'x','z'}, ArrayUtils.remove(charArr, 1));
    }

    @Test
    public void testRemoveElement() {
        assertArrayEquals(new int[]{1,3}, ArrayUtils.removeElement(new int[]{1,2,3}, 2));
        assertArrayEquals(new int[]{1,2,3}, ArrayUtils.removeElement(new int[]{1,2,3}, 4)); // not found
        String[] s = {"a","b","a"};
        String[] after = ArrayUtils.removeElement(s, "a");
        assertArrayEquals(new String[]{"b","a"}, after);
        assertArrayEquals(new boolean[]{true}, ArrayUtils.removeElement(new boolean[]{true, false}, false));
        assertArrayEquals(new boolean[]{true, false}, ArrayUtils.removeElement(new boolean[]{true, false}, true)); // removes first occurrence
    }
}