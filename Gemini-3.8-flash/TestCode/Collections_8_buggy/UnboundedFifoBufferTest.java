package org.apache.commons.collections.buffer;

import org.apache.commons.collections.BufferUnderflowException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

public class UnboundedFifoBufferTest {

    private UnboundedFifoBuffer buffer;

    @Before
    public void setUp() {
        this.buffer = new UnboundedFifoBuffer();
    }

    @Test
    public void defaultConstructor_shouldInitializeEmptyBuffer() {
        // Arrange & Act
        UnboundedFifoBuffer b = new UnboundedFifoBuffer();

        // Assert
        Assert.assertNotNull(b);
        Assert.assertTrue(b.isEmpty());
        Assert.assertEquals(0, b.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void initialSizeConstructor_givenZero_shouldThrowIllegalArgumentException() {
        // Arrange, Act & Assert
        new UnboundedFifoBuffer(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void initialSizeConstructor_givenNegative_shouldThrowIllegalArgumentException() {
        // Arrange, Act & Assert
        new UnboundedFifoBuffer(-5);
    }

    @Test
    public void addAndGet_givenElements_shouldFollowFifoOrder() {
        // Arrange & Act
        this.buffer.add("First");
        this.buffer.add("Second");
        this.buffer.add("Third");

        // Assert
        Assert.assertEquals(3, this.buffer.size());
        Assert.assertFalse(this.buffer.isEmpty());
        Assert.assertEquals("First", this.buffer.get());

        // Remove elements
        Assert.assertEquals("First", this.buffer.remove());
        Assert.assertEquals("Second", this.buffer.get());
        Assert.assertEquals("Second", this.buffer.remove());
        Assert.assertEquals("Third", this.buffer.get());
        Assert.assertEquals("Third", this.buffer.remove());

        Assert.assertTrue(this.buffer.isEmpty());
    }

    @Test(expected = BufferUnderflowException.class)
    public void remove_givenEmptyBuffer_shouldThrowBufferUnderflowException() {
        // Arrange, Act & Assert
        this.buffer.remove();
    }

    @Test(expected = BufferUnderflowException.class)
    public void get_givenEmptyBuffer_shouldThrowBufferUnderflowException() {
        // Arrange, Act & Assert
        this.buffer.get();
    }

    @Test(expected = NullPointerException.class)
    public void add_givenNull_shouldThrowNullPointerException() {
        // Arrange, Act & Assert
        this.buffer.add(null);
    }

    @Test
    public void clear_givenPopulatedBuffer_shouldResetState() {
        // Arrange
        this.buffer.add("A");
        this.buffer.add("B");

        // Act
        this.buffer.clear();

        // Assert
        Assert.assertTrue(this.buffer.isEmpty());
        Assert.assertEquals(0, this.buffer.size());
    }

    @Test
    public void iterator_shouldTraverseInFifoOrder() {
        // Arrange
        this.buffer.add("1");
        this.buffer.add("2");
        this.buffer.add("3");

        // Act
        Iterator it = this.buffer.iterator();
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("1", it.next());
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("2", it.next());
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("3", it.next());
        Assert.assertFalse(it.hasNext());
    }
}
