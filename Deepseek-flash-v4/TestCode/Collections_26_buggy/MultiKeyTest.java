package org.apache.commons.collections4.keyvalue;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class MultiKeyTest {

    // ==================== equals() tests ====================
    @Test
    public void testEqualsSameReference() {
        MultiKey<String> mk = new MultiKey<String>("a", "b");
        assertTrue(mk.equals(mk));
    }

    @Test
    public void testEqualsNull() {
        MultiKey<String> mk = new MultiKey<String>("a", "b");
        assertFalse(mk.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() {
        MultiKey<String> mk = new MultiKey<String>("a", "b");
        assertFalse(mk.equals("not a multikey"));
    }

    @Test
    public void testEqualsEqualKeys() {
        MultiKey<String> mk1 = new MultiKey<String>("a", "b");
        MultiKey<String> mk2 = new MultiKey<String>("a", "b");
        assertTrue(mk1.equals(mk2));
        assertTrue(mk2.equals(mk1));
    }

    @Test
    public void testEqualsDifferentKeys() {
        MultiKey<String> mk1 = new MultiKey<String>("a", "b");
        MultiKey<String> mk2 = new MultiKey<String>("a", "c");
        assertFalse(mk1.equals(mk2));
    }

    @Test
    public void testEqualsNullInKeys() {
        MultiKey<String> mk1 = new MultiKey<String>(null, "b");
        MultiKey<String> mk2 = new MultiKey<String>(null, "b");
        MultiKey<String> mk3 = new MultiKey<String>(null, "c");
        assertTrue(mk1.equals(mk2));
        assertFalse(mk1.equals(mk3));
    }

    @Test
    public void testEqualsDifferentSize() {
        MultiKey<String> mk1 = new MultiKey<String>("a", "b");
        MultiKey<String> mk2 = new MultiKey<String>("a", "b", "c");
        assertFalse(mk1.equals(mk2));
    }

    // ==================== hashCode() tests ====================
    @Test
    public void testHashCodeConsistentWithEquals() {
        MultiKey<String> mk1 = new MultiKey<String>("a", "b");
        MultiKey<String> mk2 = new MultiKey<String>("a", "b");
        assertEquals(mk1.hashCode(), mk2.hashCode());
    }

    @Test
    public void testHashCodeDifferentKeys() {
        MultiKey<String> mk1 = new MultiKey<String>("a", "b");
        MultiKey<String> mk2 = new MultiKey<String>("a", "c");
        assertFalse(mk1.hashCode() == mk2.hashCode());
    }

    @Test
    public void testHashCodeWithNulls() {
        MultiKey<String> mk1 = new MultiKey<String>(null, "b");
        MultiKey<String> mk2 = new MultiKey<String>(null, "b");
        assertEquals(mk1.hashCode(), mk2.hashCode());
    }

    // ==================== getKeys() tests ====================
    @Test
    public void testGetKeysReturnsClone() {
        String[] keysArray = {"a", "b"};
        MultiKey<String> mk = new MultiKey<String>(keysArray);
        String[] result = mk.getKeys();
        assertNotSame(keysArray, result);
        assertArrayEquals(keysArray, result);
        // modify returned array should not affect original
        result[0] = "changed";
        assertEquals("a", mk.getKey(0));
    }

    @Test
    public void testGetKeysForTwoArgConstructor() {
        MultiKey<String> mk = new MultiKey<String>("a", "b");
        String[] expected = {"a", "b"};
        assertArrayEquals(expected, mk.getKeys());
    }

    // ==================== getKey() tests ====================
    @Test
    public void testGetKeyValidIndex() {
        MultiKey<String> mk = new MultiKey<String>("a", "b", "c");
        assertEquals("a", mk.getKey(0));
        assertEquals("c", mk.getKey(2));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetKeyNegativeIndex() {
        MultiKey<String> mk = new MultiKey<String>("a", "b");
        mk.getKey(-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetKeyIndexTooLarge() {
        MultiKey<String> mk = new MultiKey<String>("a", "b");
        mk.getKey(2);
    }

    // ==================== size() tests ====================
    @Test
    public void testSizeForTwoKeys() {
        MultiKey<String> mk = new MultiKey<String>("a", "b");
        assertEquals(2, mk.size());
    }

    @Test
    public void testSizeForArrayConstructor() {
        String[] keys = {"a", "b", "c", "d"};
        MultiKey<String> mk = new MultiKey<String>(keys);
        assertEquals(4, mk.size());
    }

    @Test
    public void testSizeForArrayWithClone() {
        String[] keys = {"a"};
        MultiKey<String> mk = new MultiKey<String>(keys, true);
        assertEquals(1, mk.size());
    }

    // ==================== toString() tests ====================
    @Test
    public void testToString() {
        MultiKey<String> mk = new MultiKey<String>("a", "b");
        String result = mk.toString();
        assertEquals("MultiKey[a, b]", result);
    }

    // ==================== Constructors tests ====================
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithNullArray() {
        new MultiKey<String>((String[]) null);
    }

    @Test
    public void testConstructorWithClone() {
        String[] keys = {"a", "b"};
        MultiKey<String> mk = new MultiKey<String>(keys, true);
        keys[0] = "changed";
        assertEquals("a", mk.getKey(0));
    }

    @Test
    public void testConstructorWithoutClone() {
        String[] keys = {"a", "b"};
        MultiKey<String> mk = new MultiKey<String>(keys, false);
        keys[0] = "changed";
        assertEquals("changed", mk.getKey(0));
    }

    @Test
    public void testTwoArgConstructor() {
        MultiKey<String> mk = new MultiKey<String>("a", "b");
        assertEquals(2, mk.size());
        assertEquals("a", mk.getKey(0));
        assertEquals("b", mk.getKey(1));
    }

    @Test
    public void testThreeArgConstructor() {
        MultiKey<Integer> mk = new MultiKey<Integer>(1, 2, 3);
        assertEquals(3, mk.size());
        assertEquals(Integer.valueOf(2), mk.getKey(1));
    }

    @Test
    public void testFourArgConstructor() {
        MultiKey<String> mk = new MultiKey<String>("a", "b", "c", "d");
        assertEquals(4, mk.size());
    }

    @Test
    public void testFiveArgConstructor() {
        MultiKey<String> mk = new MultiKey<String>("a", "b", "c", "d", "e");
        assertEquals(5, mk.size());
    }

    // ==================== Equals and HashCode with different types ====================
    @Test
    public void testEqualsWithSubclass() {
        MultiKey<String> mk1 = new MultiKey<String>("a", "b");
        MultiKey<String> mk2 = new MultiKey<String>("a", "b");
        assertTrue(mk1.getClass() != mk2.getClass() || mk1.equals(mk2));
    }

    // ==================== Test with null values ====================
    @Test
    public void testWithNullValueInConstructor() {
        MultiKey<String> mk = new MultiKey<String>(null, "b");
        assertNull(mk.getKey(0));
        assertEquals("b", mk.getKey(1));
    }

    @Test
    public void testAllNullsHashCode() {
        MultiKey<String> mk1 = new MultiKey<String>(null, null);
        MultiKey<String> mk2 = new MultiKey<String>(null, null);
        assertEquals(mk1.hashCode(), mk2.hashCode());
        assertTrue(mk1.equals(mk2));
    }
}