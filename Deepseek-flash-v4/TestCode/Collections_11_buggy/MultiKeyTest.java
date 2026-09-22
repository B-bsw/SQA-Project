package org.apache.commons.collections.keyvalue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MultiKeyTest {

    private MultiKey multiKey;

    @Before
    public void setUp() {
        multiKey = new MultiKey("key1", "key2");
    }

    @After
    public void tearDown() {
        multiKey = null;
    }

    @Test
    public void testConstructorTwoKeys() {
        MultiKey mk = new MultiKey("a", "b");
        assertNotNull(mk);
        assertEquals(2, mk.size());
        assertEquals("a", mk.getKey(0));
        assertEquals("b", mk.getKey(1));
    }

    @Test
    public void testConstructorThreeKeys() {
        MultiKey mk = new MultiKey("a", "b", "c");
        assertNotNull(mk);
        assertEquals(3, mk.size());
        assertEquals("a", mk.getKey(0));
        assertEquals("b", mk.getKey(1));
        assertEquals("c", mk.getKey(2));
    }

    @Test
    public void testConstructorFourKeys() {
        MultiKey mk = new MultiKey("a", "b", "c", "d");
        assertNotNull(mk);
        assertEquals(4, mk.size());
        assertEquals("a", mk.getKey(0));
        assertEquals("d", mk.getKey(3));
    }

    @Test
    public void testConstructorFiveKeys() {
        MultiKey mk = new MultiKey("a", "b", "c", "d", "e");
        assertNotNull(mk);
        assertEquals(5, mk.size());
        assertEquals("e", mk.getKey(4));
    }

    @Test
    public void testConstructorArrayKeysClone() {
        Object[] keys = {"a", "b"};
        MultiKey mk = new MultiKey(keys);
        assertNotNull(mk);
        assertEquals(2, mk.size());
        keys[0] = "changed";
        assertEquals("a", mk.getKey(0));
        assertNotSame(keys, mk.getKeys());
    }

    @Test
    public void testConstructorArrayKeysNoClone() {
        Object[] keys = {"a", "b"};
        MultiKey mk = new MultiKey(keys, false);
        assertNotNull(mk);
        assertEquals(2, mk.size());
        keys[0] = "changed";
        assertEquals("changed", mk.getKey(0));
        assertSame(keys, mk.getKeys());
    }

    @Test
    public void testConstructorNullArray() {
        try {
            new MultiKey((Object[]) null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("The array of keys must not be null", e.getMessage());
        }
    }

    @Test
    public void testConstructorNullArrayWithMakeClone() {
        try {
            new MultiKey(null, true);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("The array of keys must not be null", e.getMessage());
        }
    }

    @Test
    public void testGetKeysReturnsClone() {
        Object[] keys = multiKey.getKeys();
        assertNotNull(keys);
        assertEquals(2, keys.length);
        keys[0] = "changed";
        assertEquals("key1", multiKey.getKey(0));
        assertNotSame(keys, multiKey.getKeys());
    }

    @Test
    public void testGetKeyValid() {
        assertEquals("key1", multiKey.getKey(0));
        assertEquals("key2", multiKey.getKey(1));
    }

    @Test
    public void testGetKeyInvalidIndex() {
        try {
            multiKey.getKey(2);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testSize() {
        assertEquals(2, multiKey.size());
        assertEquals(2, multiKey.getKeys().length);
    }

    @Test
    public void testEqualsSameInstance() {
        assertTrue(multiKey.equals(multiKey));
    }

    @Test
    public void testEqualsDifferentKeyValues() {
        MultiKey mk1 = new MultiKey("a", "b");
        MultiKey mk2 = new MultiKey("a", "b");
        MultiKey mk3 = new MultiKey("a", "c");
        assertTrue(mk1.equals(mk2));
        assertFalse(mk1.equals(mk3));
        assertFalse(mk1.equals(new Object()));
        assertFalse(mk1.equals(null));
    }

    @Test
    public void testEqualsNull() {
        assertFalse(multiKey.equals(null));
    }

    @Test
    public void testEqualsDifferentType() {
        assertFalse(multiKey.equals("not a MultiKey"));
    }

    @Test
    public void testHashCodeCachedAndConsistent() {
        int h1 = multiKey.hashCode();
        int h2 = multiKey.hashCode();
        assertEquals(h1, h2);
    }

    @Test
    public void testHashCodeWithNullKeys() {
        MultiKey mk = new MultiKey(new Object[] {null, null}, false);
        assertEquals(0, mk.hashCode());
    }

    @Test
    public void testHashCodeWithSomeNullKeys() {
        Object[] keys = {"a", null, "b"};
        MultiKey mk1 = new MultiKey(keys, false);
        Object[] keys2 = {"a", null, "b"};
        MultiKey mk2 = new MultiKey(keys2, false);
        assertEquals(mk1.hashCode(), mk2.hashCode());
    }

    @Test
    public void testHashCodeWithNullKeysOnly() {
        MultiKey mk = new MultiKey(new Object[] {null, null, null}, false);
        assertEquals(0, mk.hashCode());
    }

    @Test
    public void testToString() {
        MultiKey mk = new MultiKey("a", "b");
        assertEquals("MultiKey[a, b]", mk.toString());
    }

    @Test
    public void testSerialization() throws IOException, ClassNotFoundException {
        MultiKey original = new MultiKey("a", "b");
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try (ObjectOutputStream oos = new ObjectOutputStream(bos)) {
            oos.writeObject(original);
        }
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        try (ObjectInputStream ois = new ObjectInputStream(bis)) {
            MultiKey deserialized = (MultiKey) ois.readObject();
            assertEquals(original, deserialized);
            assertEquals(original.hashCode(), deserialized.hashCode());
        }
    }

    @Test
    public void testEqualsWithNullKeys() {
        MultiKey mk1 = new MultiKey(new Object[] {null, "b"}, false);
        MultiKey mk2 = new MultiKey(new Object[] {null, "b"}, false);
        MultiKey mk3 = new MultiKey(new Object[] {"a", null}, false);
        assertTrue(mk1.equals(mk2));
        assertFalse(mk1.equals(mk3));
    }

    @Test
    public void testNestedKeysWithDifferentTypes() {
        MultiKey mk1 = new MultiKey("a", 1);
        MultiKey mk2 = new MultiKey("a", 1);
        MultiKey mk3 = new MultiKey("a", 2);
        assertTrue(mk1.equals(mk2));
        assertFalse(mk1.equals(mk3));
    }

    @Test
    public void testConstructorArrayKeysWithClone() {
        Object[] keys = {"a"};
        MultiKey mk = new MultiKey(keys, true);
        keys[0] = "changed";
        assertEquals("a", mk.getKey(0));
        assertNotSame(keys, mk.getKeys());
    }

    @Test
    public void testConstructorArrayKeysWithoutClone() {
        Object[] keys = {"a"};
        MultiKey mk = new MultiKey(keys, false);
        keys[0] = "changed";
        assertEquals("changed", mk.getKey(0));
        assertSame(keys, mk.getKeys());
    }

    @Test
    public void testSizeForOneKey() {
        MultiKey mk = new MultiKey("only", false);
        assertEquals(1, mk.size());
    }

    @Test
    public void testGetKeyMultipleIndices() {
        MultiKey mk = new MultiKey("a", "b", "c");
        assertEquals("a", mk.getKey(0));
        assertEquals("c", mk.getKey(2));
    }

    @Test
    public void testEqualsWithDifferentKeyArrayLength() {
        MultiKey mk1 = new MultiKey("a", "b");
        MultiKey mk2 = new MultiKey("a", "b", "c");
        assertFalse(mk1.equals(mk2));
    }

    @Test
    public void testHashCodeWithArrayKeys() {
        Object[] keys1 = {"a", "b"};
        Object[] keys2 = {"a", "b"};
        MultiKey mk1 = new MultiKey(keys1, false);
        MultiKey mk2 = new MultiKey(keys2, false);
        assertEquals(mk1.hashCode(), mk2.hashCode());
    }

    @Test
    public void testEqualsWithDifferentArrayContent() {
        Object[] keys1 = {"a", "b"};
        Object[] keys2 = {"b", "a"};
        MultiKey mk1 = new MultiKey(keys1, false);
        MultiKey mk2 = new MultiKey(keys2, false);
        assertFalse(mk1.equals(mk2));
    }

    @Test
    public void testHashCodeWithNullAndNonNullKeys() {
        Object[] keys1 = {null, "a"};
        Object[] keys2 = {null, "a"};
        MultiKey mk1 = new MultiKey(keys1, false);
        MultiKey mk2 = new MultiKey(keys2, false);
        assertEquals(mk1.hashCode(), mk2.hashCode());
    }

    @Test
    public void testHashCodeWithOnlyNullKeys() {
        MultiKey mk1 = new MultiKey(new Object[] {null}, false);
        MultiKey mk2 = new MultiKey(new Object[] {null}, false);
        assertEquals(0, mk1.hashCode());
        assertEquals(mk1.hashCode(), mk2.hashCode());
    }

    @Test
    public void testArrayKeysNotModifiedAfterConstruction() {
        Object[] keys = {"a", "b"};
        MultiKey mk = new MultiKey(keys, true);
        keys[0] = "changed";
        assertEquals("a", mk.getKey(0));
    }

    @Test
    public void testArrayKeysModifiedAfterConstructionNoClone() {
        Object[] keys = {"a", "b"};
        MultiKey mk = new MultiKey(keys, false);
        keys[0] = "changed";
        assertEquals("changed", mk.getKey(0));
    }
}