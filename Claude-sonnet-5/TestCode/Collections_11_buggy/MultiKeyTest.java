package org.apache.commons.collections.keyvalue;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class MultiKeyTest {

    @Test
    public void testTwoKeyConstructor() {
        MultiKey mk = new MultiKey("A", "B");
        assertEquals(2, mk.size());
        assertEquals("A", mk.getKey(0));
        assertEquals("B", mk.getKey(1));
    }

    @Test
    public void testThreeKeyConstructor() {
        MultiKey mk = new MultiKey("A", "B", "C");
        assertEquals(3, mk.size());
        assertEquals("A", mk.getKey(0));
        assertEquals("B", mk.getKey(1));
        assertEquals("C", mk.getKey(2));
    }

    @Test
    public void testFourKeyConstructor() {
        MultiKey mk = new MultiKey("A", "B", "C", "D");
        assertEquals(4, mk.size());
        assertEquals("A", mk.getKey(0));
        assertEquals("B", mk.getKey(1));
        assertEquals("C", mk.getKey(2));
        assertEquals("D", mk.getKey(3));
    }

    @Test
    public void testFiveKeyConstructor() {
        MultiKey mk = new MultiKey("A", "B", "C", "D", "E");
        assertEquals(5, mk.size());
        assertEquals("A", mk.getKey(0));
        assertEquals("B", mk.getKey(1));
        assertEquals("C", mk.getKey(2));
        assertEquals("D", mk.getKey(3));
        assertEquals("E", mk.getKey(4));
    }

    @Test
    public void testArrayConstructorClonesArray() {
        Object[] keys = new Object[] {"A", "B", "C"};
        MultiKey mk = new MultiKey(keys);
        assertEquals(3, mk.size());
        assertEquals("A", mk.getKey(0));
        assertEquals("B", mk.getKey(1));
        assertEquals("C", mk.getKey(2));

        // modify original array, should not affect mk since cloned
        keys[0] = "Z";
        assertEquals("A", mk.getKey(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArrayConstructorNullThrows() {
        new MultiKey((Object[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArrayCloneConstructorNullThrows() {
        new MultiKey(null, true);
    }

    @Test
    public void testArrayConstructorWithCloneTrue() {
        Object[] keys = new Object[] {"A", "B"};
        MultiKey mk = new MultiKey(keys, true);
        assertEquals(2, mk.size());
        keys[0] = "Z";
        assertEquals("A", mk.getKey(0));
    }

    @Test
    public void testArrayConstructorWithCloneFalse() {
        Object[] keys = new Object[] {"A", "B"};
        MultiKey mk = new MultiKey(keys, false);
        assertEquals(2, mk.size());
        // Since not cloned, the internal array reference should be the same;
        // getKeys() should still return a clone though.
        Object[] gotten = mk.getKeys();
        assertNotSame(keys, gotten);
        assertArrayEquals(keys, gotten);
    }

    @Test
    public void testGetKeysReturnsClone() {
        MultiKey mk = new MultiKey("A", "B");
        Object[] keys1 = mk.getKeys();
        Object[] keys2 = mk.getKeys();
        assertNotSame(keys1, keys2);
        assertArrayEquals(keys1, keys2);
    }

    @Test
    public void testGetKeyBoundary() {
        MultiKey mk = new MultiKey("A", "B", "C");
        assertEquals("A", mk.getKey(0));
        assertEquals("C", mk.getKey(2));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetKeyOutOfBoundsNegative() {
        MultiKey mk = new MultiKey("A", "B");
        mk.getKey(-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetKeyOutOfBoundsHigh() {
        MultiKey mk = new MultiKey("A", "B");
        mk.getKey(2);
    }

    @Test
    public void testSize() {
        MultiKey mk2 = new MultiKey("A", "B");
        assertEquals(2, mk2.size());

        MultiKey mk5 = new MultiKey("A", "B", "C", "D", "E");
        assertEquals(5, mk5.size());

        MultiKey mkArr = new MultiKey(new Object[0]);
        assertEquals(0, mkArr.size());
    }

    @Test
    public void testEqualsSameInstance() {
        MultiKey mk = new MultiKey("A", "B");
        assertTrue(mk.equals(mk));
    }

    @Test
    public void testEqualsEqualKeys() {
        MultiKey mk1 = new MultiKey("A", "B");
        MultiKey mk2 = new MultiKey("A", "B");
        assertTrue(mk1.equals(mk2));
        assertTrue(mk2.equals(mk1));
    }

    @Test
    public void testEqualsDifferentKeys() {
        MultiKey mk1 = new MultiKey("A", "B");
        MultiKey mk2 = new MultiKey("A", "C");
        assertFalse(mk1.equals(mk2));
    }

    @Test
    public void testEqualsDifferentSize() {
        MultiKey mk1 = new MultiKey("A", "B");
        MultiKey mk2 = new MultiKey("A", "B", "C");
        assertFalse(mk1.equals(mk2));
    }

    @Test
    public void testEqualsNotAMultiKey() {
        MultiKey mk = new MultiKey("A", "B");
        assertFalse(mk.equals("Not a MultiKey"));
    }

    @Test
    public void testEqualsNull() {
        MultiKey mk = new MultiKey("A", "B");
        assertFalse(mk.equals(null));
    }

    @Test
    public void testEqualsWithNullKeys() {
        MultiKey mk1 = new MultiKey(null, "B");
        MultiKey mk2 = new MultiKey(null, "B");
        assertTrue(mk1.equals(mk2));
    }

    @Test
    public void testHashCodeConsistency() {
        MultiKey mk1 = new MultiKey("A", "B");
        MultiKey mk2 = new MultiKey("A", "B");
        assertEquals(mk1.hashCode(), mk2.hashCode());
    }

    @Test
    public void testHashCodeWithNullKeys() {
        MultiKey mk = new MultiKey((Object) null, (Object) null);
        assertEquals(0, mk.hashCode());
    }

    @Test
    public void testHashCodeDifferentForDifferentKeys() {
        MultiKey mk1 = new MultiKey("A", "B");
        MultiKey mk2 = new MultiKey("C", "D");
        assertNotEquals(mk1.hashCode(), mk2.hashCode());
    }

    @Test
    public void testHashCodeSingleKeyArray() {
        MultiKey mk = new MultiKey(new Object[] {"OnlyOne"});
        int expected = "OnlyOne".hashCode();
        assertEquals(expected, mk.hashCode());
    }

    @Test
    public void testHashCodeMultipleKeysXor() {
        MultiKey mk = new MultiKey("A", "B", "C");
        int expected = "A".hashCode() ^ "B".hashCode() ^ "C".hashCode();
        assertEquals(expected, mk.hashCode());
    }

    @Test
    public void testHashCodeEmptyArray() {
        MultiKey mk = new MultiKey(new Object[0]);
        assertEquals(0, mk.hashCode());
    }

    @Test
    public void testToString() {
        MultiKey mk = new MultiKey("A", "B");
        String str = mk.toString();
        assertTrue(str.startsWith("MultiKey"));
        assertTrue(str.contains("A"));
        assertTrue(str.contains("B"));
    }

    @Test
    public void testToStringWithNullElements() {
        MultiKey mk = new MultiKey((Object) null, "B");
        String str = mk.toString();
        assertTrue(str.startsWith("MultiKey"));
        assertTrue(str.contains("null"));
        assertTrue(str.contains("B"));
    }

    @Test
    public void testEqualsWithMultipleNullKeys() {
        MultiKey mk1 = new MultiKey(null, null, null);
        MultiKey mk2 = new MultiKey(null, null, null);
        assertTrue(mk1.equals(mk2));
        assertEquals(mk1.hashCode(), mk2.hashCode());
    }

    @Test
    public void testGetKeysArrayContentMatchesConstructorArgs() {
        Object k1 = new Object();
        Object k2 = new Object();
        Object k3 = new Object();
        Object k4 = new Object();
        Object k5 = new Object();
        MultiKey mk = new MultiKey(k1, k2, k3, k4, k5);
        Object[] gotten = mk.getKeys();
        assertEquals(5, gotten.length);
        assertEquals(k1, gotten[0]);
        assertEquals(k2, gotten[1]);
        assertEquals(k3, gotten[2]);
        assertEquals(k4, gotten[3]);
        assertEquals(k5, gotten[4]);
    }

    @Test
    public void testArrayConstructorEmptyArray() {
        MultiKey mk = new MultiKey(new Object[0]);
        assertEquals(0, mk.size());
        assertArrayEquals(new Object[0], mk.getKeys());
    }

    @Test
    public void testArrayConstructorSingleElement() {
        MultiKey mk = new MultiKey(new Object[] {"Solo"});
        assertEquals(1, mk.size());
        assertEquals("Solo", mk.getKey(0));
    }

    @Test
    public void testArrayConstructorManyElements() {
        Object[] keys = new Object[] {"A", "B", "C", "D", "E", "F", "G"};
        MultiKey mk = new MultiKey(keys);
        assertEquals(7, mk.size());
        for (int i = 0; i < keys.length; i++) {
            assertEquals(keys[i], mk.getKey(i));
        }
    }

    @Test
    public void testEqualsWithArrayConstructedKeysDifferentLengthZero() {
        MultiKey mk1 = new MultiKey(new Object[0]);
        MultiKey mk2 = new MultiKey(new Object[0]);
        assertTrue(mk1.equals(mk2));
        assertEquals(mk1.hashCode(), mk2.hashCode());
    }

    @Test
    public void testNotEqualToObjectOfDifferentType() {
        MultiKey mk = new MultiKey("A", "B");
        Object other = new Object();
        assertFalse(mk.equals(other));
    }
}