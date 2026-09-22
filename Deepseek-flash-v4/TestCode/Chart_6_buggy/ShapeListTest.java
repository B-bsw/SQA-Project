package org.jfree.chart.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.awt.Rectangle;
import java.awt.Shape;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Before;
import org.junit.Test;

public class ShapeListTest {

    private ShapeList list;

    @Before
    public void setUp() {
        list = new ShapeList();
    }

    @Test
    public void testDefaultConstructor() {
        assertEquals(0, list.size());
    }

    @Test
    public void testGetShapeEmptyList() {
        assertNull(list.getShape(0));
        assertNull(list.getShape(5));
        assertNull(list.getShape(-1));
    }

    @Test
    public void testSetShapeAndGetShape() {
        Shape shape = new Rectangle(1, 2, 3, 4);
        list.setShape(0, shape);
        assertSame(shape, list.getShape(0));
        assertEquals(1, list.size());
    }

    @Test
    public void testSetShapeExpandsList() {
        Shape shape = new Rectangle(10, 20, 30, 40);
        list.setShape(2, shape);
        assertNull(list.getShape(0));
        assertNull(list.getShape(1));
        assertSame(shape, list.getShape(2));
        assertEquals(3, list.size());
    }

    @Test
    public void testSetShapeNull() {
        list.setShape(0, null);
        assertNull(list.getShape(0));
        assertEquals(1, list.size());
    }

    @Test
    public void testCloneEmptyList() throws CloneNotSupportedException {
        ShapeList clone = (ShapeList) list.clone();
        assertNotNull(clone);
        assertEquals(0, clone.size());
    }

    @Test
    public void testCloneWithElements() throws CloneNotSupportedException {
        Shape shape = new Rectangle(5, 6, 7, 8);
        list.setShape(0, shape);
        ShapeList clone = (ShapeList) list.clone();
        assertNotSame(list, clone);
        assertNotSame(shape, clone.getShape(0)); // shallow copy
        assertSame(list.getShape(0), clone.getShape(0));
    }

    @Test
    public void testEqualsSameObject() {
        assertTrue(list.equals(list));
    }

    @Test
    public void testEqualsNull() {
        assertFalse(list.equals(null));
    }

    @Test
    public void testEqualsDifferentType() {
        assertFalse(list.equals(new Object()));
    }

    @Test
    public void testEqualsEmptyLists() {
        ShapeList other = new ShapeList();
        assertTrue(list.equals(other));
    }

    @Test
    public void testEqualsNonEmptyListsSameContent() {
        Shape shape1 = new Rectangle(1, 2, 3, 4);
        Shape shape2 = new Rectangle(5, 6, 7, 8);
        list.setShape(0, shape1);
        list.setShape(1, shape2);

        ShapeList other = new ShapeList();
        other.setShape(0, shape1);
        other.setShape(1, shape2);
        assertTrue(list.equals(other));
    }

    @Test
    public void testEqualsDifferentContent() {
        Shape shape1 = new Rectangle(1, 2, 3, 4);
        Shape shape2 = new Rectangle(9, 9, 9, 9);
        list.setShape(0, shape1);

        ShapeList other = new ShapeList();
        other.setShape(0, shape2);
        assertFalse(list.equals(other));
    }

    @Test
    public void testEqualsDifferentSize() {
        Shape shape = new Rectangle(1, 1, 1, 1);
        list.setShape(0, shape);

        ShapeList other = new ShapeList();
        assertFalse(list.equals(other));
    }

    @Test
    public void testHashCodeEmpty() {
        ShapeList other = new ShapeList();
        assertEquals(other.hashCode(), list.hashCode());
    }

    @Test
    public void testHashCodeWithElements() {
        Shape shape = new Rectangle(2, 3, 4, 5);
        list.setShape(0, shape);

        ShapeList other = new ShapeList();
        other.setShape(0, shape);
        assertEquals(other.hashCode(), list.hashCode());
    }

    @Test
    public void testSerializationEmpty() throws Exception {
        ShapeList original = new ShapeList();
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(original);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        ShapeList deserialized = (ShapeList) in.readObject();
        in.close();
        assertEquals(original, deserialized);
    }

    @Test
    public void testSerializationWithElements() throws Exception {
        ShapeList original = new ShapeList();
        original.setShape(0, new Rectangle(10, 20, 30, 40));
        original.setShape(3, new Rectangle(50, 60, 70, 80));

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(original);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        ShapeList deserialized = (ShapeList) in.readObject();
        in.close();
        assertEquals(original, deserialized);
        assertEquals(4, deserialized.size());
        assertEquals(new Rectangle(10, 20, 30, 40), deserialized.getShape(0));
        assertEquals(new Rectangle(50, 60, 70, 80), deserialized.getShape(3));
    }

    @Test
    public void testLoopZeroIterationsSerialization() throws Exception {
        ShapeList original = new ShapeList();
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(original);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        ShapeList deserialized = (ShapeList) in.readObject();
        in.close();
        assertEquals(0, deserialized.size());
    }

    @Test
    public void testLoopOneIterationSerialization() throws Exception {
        ShapeList original = new ShapeList();
        Shape shape = new Rectangle(1, 2, 3, 4);
        original.setShape(0, shape);
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(original);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        ShapeList deserialized = (ShapeList) in.readObject();
        in.close();
        assertEquals(1, deserialized.size());
        assertEquals(shape, deserialized.getShape(0));
    }

    @Test
    public void testLoopManyIterationsSerialization() throws Exception {
        ShapeList original = new ShapeList();
        for (int i = 0; i < 5; i++) {
            original.setShape(i, new Rectangle(i, i, i + 1, i + 2));
        }
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(original);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        ShapeList deserialized = (ShapeList) in.readObject();
        in.close();
        assertEquals(5, deserialized.size());
        assertEquals(new Rectangle(2, 2, 3, 4), deserialized.getShape(2));
    }

    @Test
    public void testSetShapeBoundaryNegativeIndex() {
        Shape shape = new Rectangle(0, 0, 0, 0);
        try {
            list.setShape(-1, shape);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testGetShapeBoundaryNegativeIndex() {
        try {
            list.getShape(-5);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testSerializationWithNullElement() throws Exception {
        ShapeList original = new ShapeList();
        original.setShape(0, new Rectangle(1, 1, 1, 1));
        original.setShape(1, null);
        original.setShape(2, new Rectangle(2, 2, 2, 2));

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(original);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        ShapeList deserialized = (ShapeList) in.readObject();
        in.close();
        assertEquals(3, deserialized.size());
        assertEquals(new Rectangle(1, 1, 1, 1), deserialized.getShape(0));
        assertNull(deserialized.getShape(1));
        assertEquals(new Rectangle(2, 2, 2, 2), deserialized.getShape(2));
    }

    @Test
    public void testSerializationWithLargeNullGap() throws Exception {
        ShapeList original = new ShapeList();
        original.setShape(0, new Rectangle(0, 0, 1, 1));
        original.setShape(10, new Rectangle(10, 10, 11, 11));
        original.setShape(100, null);

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(original);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        ShapeList deserialized = (ShapeList) in.readObject();
        in.close();
        assertEquals(101, deserialized.size());
        assertNotNull(deserialized.getShape(0));
        assertNull(deserialized.getShape(1));
        assertNull(deserialized.getShape(9));
        assertNotNull(deserialized.getShape(10));
        assertNull(deserialized.getShape(11));
        assertNull(deserialized.getShape(99));
        assertNull(deserialized.getShape(100));
    }

    @Test
    public void testCloneSingleElement() throws CloneNotSupportedException {
        Shape shape = new Rectangle(3, 4, 5, 6);
        list.setShape(0, shape);
        ShapeList clone = (ShapeList) list.clone();
        assertEquals(1, clone.size());
        assertSame(shape, clone.getShape(0));
    }

    @Test
    public void testEqualsInheritedFromAbstractObjectList() {
        ShapeList other = new ShapeList();
        assertTrue(list.equals(other));
        other.setShape(0, new Rectangle(1, 2, 3, 4));
        assertFalse(list.equals(other));
        list.setShape(0, new Rectangle(1, 2, 3, 4));
        assertTrue(list.equals(other));
        list.setShape(1, new Rectangle(5, 6, 7, 8));
        other.setShape(1, new Rectangle(5, 6, 7, 8));
        assertTrue(list.equals(other));
        ShapeList third = new ShapeList();
        third.setShape(0, new Rectangle(1, 2, 3, 4));
        third.setShape(1, new Rectangle(9, 9, 9, 9));
        assertFalse(list.equals(third));
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        ShapeList other = new ShapeList();
        assertTrue(list.equals(other));
        assertEquals(list.hashCode(), other.hashCode());

        Shape shape = new Rectangle(7, 8, 9, 10);
        list.setShape(0, shape);
        other.setShape(0, shape);
        assertTrue(list.equals(other));
        assertEquals(list.hashCode(), other.hashCode());

        other.setShape(1, new Rectangle(1, 1, 1, 1));
        assertFalse(list.equals(other));
        // Note: hashCode not guaranteed to be different, but should be consistent if equals is true
        // We just test that calling hashCode on both doesn't throw and is the same when equals
    }

}