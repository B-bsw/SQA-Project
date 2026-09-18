package org.jfree.chart.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

public class ShapeListTest {

    @Test
    public void testSetAndGetShapeNormalCase() {
        ShapeList list = new ShapeList();
        Shape shape = new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0);
        list.setShape(0, shape);
        assertEquals(shape, list.getShape(0));
    }

    @Test
    public void testGetShapeReturnsNullForUnsetIndex() {
        ShapeList list = new ShapeList();
        list.setShape(2, new Rectangle2D.Double(0, 0, 1, 1));
        // index 0 and 1 were never set explicitly, should be null
        assertNull(list.getShape(0));
        assertNull(list.getShape(1));
        assertNotNull(list.getShape(2));
    }

    @Test
    public void testSetShapeExpandsList() {
        ShapeList list = new ShapeList();
        Shape shape = new Rectangle2D.Double(5.0, 5.0, 5.0, 5.0);
        // Setting at a high index should expand the list without error
        list.setShape(10, shape);
        assertEquals(shape, list.getShape(10));
    }

    @Test
    public void testSetShapeNull() {
        ShapeList list = new ShapeList();
        list.setShape(0, new Rectangle2D.Double(0, 0, 1, 1));
        list.setShape(0, null);
        assertNull(list.getShape(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetShapeNegativeIndexThrowsException() {
        ShapeList list = new ShapeList();
        list.getShape(-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetShapeNegativeIndexThrowsException() {
        ShapeList list = new ShapeList();
        list.setShape(-1, new Rectangle2D.Double(0, 0, 1, 1));
    }

    @Test
    public void testEqualsSameObject() {
        ShapeList list = new ShapeList();
        list.setShape(0, new Rectangle2D.Double(0, 0, 1, 1));
        assertTrue(list.equals(list));
    }

    @Test
    public void testEqualsNull() {
        ShapeList list = new ShapeList();
        assertFalse(list.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() {
        ShapeList list = new ShapeList();
        assertFalse(list.equals("not a ShapeList"));
    }

    @Test
    public void testEqualsEqualLists() {
        ShapeList list1 = new ShapeList();
        ShapeList list2 = new ShapeList();
        Shape shape = new Rectangle2D.Double(1.0, 1.0, 2.0, 2.0);
        list1.setShape(0, shape);
        list2.setShape(0, new Rectangle2D.Double(1.0, 1.0, 2.0, 2.0));
        assertTrue(list1.equals(list2));
        assertTrue(list2.equals(list1));
    }

    @Test
    public void testEqualsDifferentLists() {
        ShapeList list1 = new ShapeList();
        ShapeList list2 = new ShapeList();
        list1.setShape(0, new Rectangle2D.Double(1.0, 1.0, 2.0, 2.0));
        list2.setShape(0, new Rectangle2D.Double(3.0, 3.0, 4.0, 4.0));
        assertFalse(list1.equals(list2));
    }

    @Test
    public void testEqualsBothEmpty() {
        ShapeList list1 = new ShapeList();
        ShapeList list2 = new ShapeList();
        assertTrue(list1.equals(list2));
    }

    @Test
    public void testHashCodeConsistency() {
        ShapeList list1 = new ShapeList();
        ShapeList list2 = new ShapeList();
        Shape shape = new Rectangle2D.Double(1.0, 1.0, 2.0, 2.0);
        list1.setShape(0, shape);
        list2.setShape(0, new Rectangle2D.Double(1.0, 1.0, 2.0, 2.0));
        assertEquals(list1.hashCode(), list2.hashCode());
    }

    @Test
    public void testCloneIndependence() throws CloneNotSupportedException {
        ShapeList list = new ShapeList();
        Shape shape = new Rectangle2D.Double(1.0, 1.0, 2.0, 2.0);
        list.setShape(0, shape);

        ShapeList clone = (ShapeList) list.clone();
        assertNotSame(list, clone);
        assertEquals(list, clone);

        clone.setShape(0, new Rectangle2D.Double(5.0, 5.0, 6.0, 6.0));
        assertFalse(list.equals(clone));
    }

    @Test
    public void testCloneEmptyList() throws CloneNotSupportedException {
        ShapeList list = new ShapeList();
        ShapeList clone = (ShapeList) list.clone();
        assertNotSame(list, clone);
        assertEquals(list, clone);
    }

    @Test
    public void testSerializationWithShapesAndNulls() throws Exception {
        ShapeList list = new ShapeList();
        list.setShape(0, new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0));
        list.setShape(1, null);
        list.setShape(2, new Rectangle2D.Double(5.0, 6.0, 7.0, 8.0));

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(list);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        ShapeList result = (ShapeList) ois.readObject();
        ois.close();

        assertEquals(list, result);
        assertNotNull(result.getShape(0));
        assertNull(result.getShape(1));
        assertNotNull(result.getShape(2));
    }

    @Test
    public void testSerializationEmptyList() throws Exception {
        ShapeList list = new ShapeList();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(list);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        ShapeList result = (ShapeList) ois.readObject();
        ois.close();

        assertEquals(list, result);
    }

    @Test
    public void testSerializationAllNulls() throws Exception {
        ShapeList list = new ShapeList();
        list.setShape(0, null);
        list.setShape(1, null);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(list);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        ShapeList result = (ShapeList) ois.readObject();
        ois.close();

        assertEquals(list, result);
        assertNull(result.getShape(0));
        assertNull(result.getShape(1));
    }
}