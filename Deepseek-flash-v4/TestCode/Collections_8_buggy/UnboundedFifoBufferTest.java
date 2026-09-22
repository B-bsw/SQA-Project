package org.apache.commons.collections.buffer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.Test;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class UnboundedFifoBufferTest {

    private UnboundedFifoBuffer buffer;

    @Before
    public void setUp() {
        buffer = new UnboundedFifoBuffer();
    }

    @Test
    public void testDefaultConstructor() {
        assertEquals(0, buffer.size());
        assertTrue(buffer.isEmpty());
    }

    @Test
    public void testConstructorWithInvalidSize() {
        try {
            new UnboundedFifoBuffer(0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            new UnboundedFifoBuffer(-1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testConstructorWithValidSize() {
        UnboundedFifoBuffer b = new UnboundedFifoBuffer(5);
        assertEquals(0, b.size());
        assertTrue(b.isEmpty());
    }

    @Test
    public void testAddAndSize() {
        assertTrue(buffer.add("a"));
        assertTrue(buffer.add("b"));
        assertEquals(2, buffer.size());
        assertFalse(buffer.isEmpty());
    }

    @Test
    public void testAddNullElement() {
        try {
            buffer.add(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testAddAndGet() {
        buffer.add("one");
        buffer.add("two");
        assertEquals("one", buffer.get());
        assertEquals(2, buffer.size());
    }

    @Test
    public void testGetOnEmptyBuffer() {
        try {
            buffer.get();
            fail("Expected BufferUnderflowException");
        } catch (BufferUnderflowException e) {
            // expected
        }
    }

    @Test
    public void testRemove() {
        buffer.add("x");
        buffer.add("y");
        assertEquals("x", buffer.remove());
        assertEquals(1, buffer.size());
        assertEquals("y", buffer.remove());
        assertEquals(0, buffer.size());
        assertTrue(buffer.isEmpty());
    }

    @Test
    public void testRemoveOnEmptyBuffer() {
        try {
            buffer.remove();
            fail("Expected BufferUnderflowException");
        } catch (BufferUnderflowException e) {
            // expected
        }
    }

    @Test
    public void testSizeAfterMultipleOperations() {
        for (int i = 0; i < 10; i++) {
            buffer.add("element" + i);
        }
        assertEquals(10, buffer.size());
        for (int i = 0; i < 5; i++) {
            buffer.remove();
        }
        assertEquals(5, buffer.size());
        for (int i = 0; i < 5; i++) {
            buffer.remove();
        }
        assertEquals(0, buffer.size());
        assertTrue(buffer.isEmpty());
    }

    @Test
    public void testGrow() {
        for (int i = 0; i < 100; i++) {
            buffer.add("value" + i);
        }
        assertEquals(100, buffer.size());
        assertEquals("value0", buffer.get());
        for (int i = 0; i < 100; i++) {
            assertEquals("value" + i, buffer.remove());
        }
        assertTrue(buffer.isEmpty());
    }

    @Test
    public void testWrapAround() {
        for (int i = 0; i < 10; i++) {
            buffer.add(i);
        }
        for (int i = 0; i < 5; i++) {
            assertEquals(i, buffer.remove());
        }
        for (int i = 10; i < 20; i++) {
            buffer.add(i);
        }
        assertEquals(15, buffer.size());
        for (int i = 5; i < 20; i++) {
            assertEquals(i, buffer.remove());
        }
        assertTrue(buffer.isEmpty());
    }

    @Test
    public void testIterator() {
        buffer.add("a");
        buffer.add("b");
        buffer.add("c");
        Iterator it = buffer.iterator();
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
        assertTrue(it.hasNext());
        assertEquals("b", it.next());
        it.remove();
        assertTrue(it.hasNext());
        assertEquals("c", it.next());
        assertFalse(it.hasNext());
        assertEquals(2, buffer.size());
    }

    @Test
    public void testIteratorHasNextOnEmpty() {
        Iterator it = buffer.iterator();
        assertFalse(it.hasNext());
    }

    @Test
    public void testIteratorNextOnEmpty() {
        Iterator it = buffer.iterator();
        try {
            it.next();
            fail("Expected NoSuchElementException");
        } catch (NoSuchElementException e) {
            // expected
        }
    }

    @Test
    public void testIteratorRemoveBeforeNext() {
        buffer.add("a");
        Iterator it = buffer.iterator();
        try {
            it.remove();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
    }

    @Test
    public void testIteratorRemoveAfterNext() {
        buffer.add("a");
        buffer.add("b");
        Iterator it = buffer.iterator();
        it.next();
        it.remove();
        assertEquals(1, buffer.size());
        assertEquals("b", buffer.get());
    }

    @Test
    public void testIteratorRemoveHeadElement() {
        buffer.add("a");
        buffer.add("b");
        Iterator it = buffer.iterator();
        it.next();
        it.remove();
        assertEquals(1, buffer.size());
        assertEquals("b", buffer.get());
    }

    @Test
    public void testSerialization() throws Exception {
        buffer.add("one");
        buffer.add("two");
        buffer.add("three");
        java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
        java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(baos);
        oos.writeObject(buffer);
        oos.close();
        java.io.ByteArrayInputStream bais = new java.io.ByteArrayInputStream(baos.toByteArray());
        java.io.ObjectInputStream ois = new java.io.ObjectInputStream(bais);
        UnboundedFifoBuffer deserialized = (UnboundedFifoBuffer) ois.readObject();
        ois.close();
        assertEquals(buffer.size(), deserialized.size());
        assertEquals("one", deserialized.remove());
        assertEquals("two", deserialized.remove());
        assertEquals("three", deserialized.remove());
        assertTrue(deserialized.isEmpty());
    }
}