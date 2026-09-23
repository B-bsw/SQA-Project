```java
package org.apache.commons.lang3;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Map;

public class ArrayUtilsTest {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testToString_ObjectArray() {
        String[] array = new String[]{"a", "b", "c"};
        String result = ArrayUtils.toString(array);
        assertNotNull(result);
    }

    @Test
    public void testToString_SimpleArray() {
        int[] array = new int[]{1, 2, 3};
        ArrayUtils.toString(array);
    }

    @Test
    public void testToString_NullArray() {
        assertEquals("null", ArrayUtils.toString(null, "null"));
    }

    @Test
    public void testToString_IntegerArray() {
        Integer[] array = new Integer[]{1, 2, 3};
        ArrayUtils.toString(array);
    }

    @Test
    public void testToString_MultiDimensionalArray() {
        int[][] array = new int[][]{{1, 2}, {3, 4}};
        ArrayUtils.toString(array);
    }

    @Test
    public void testToString_StringArrayWithDefault() {
        String[] array = new String[]{"x", "y"};
        assertNotNull(ArrayUtils.toString(array, "default"));
    }

    @Test
    public void testToString_ByteArray() {
        byte[] array = new byte[]{1, 2, 3};
        ArrayUtils.toString(array);
    }

    @Test
    public void testToString_CharArray() {
        char[] array = new char[]{'a', 'b', 'c'};
        ArrayUtils.toString(array);
    }
}