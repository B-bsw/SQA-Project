package org.jfree.chart.util;

import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.junit.Assert;
import org.junit.Test;

public class ShapeListTest {

    @Test
    public void constructor_givenDefault_shouldInitializeEmptyList() {
        // Arrange & Act
        ShapeList list = new ShapeList();

        // Assert
        Assert.assertEquals(0, list.size());
    }

    @Test
    public void getShape_givenValidIndex_shouldReturnCorrectShape() {
        // Arrange
        ShapeList list = new ShapeList();
        Shape shape = new Rectangle(0, 0, 10, 10);
        list.setShape(0, shape);

        // Act
        Shape result = list.getShape(0);

        // Assert
        Assert.assertEquals(shape, result);
    }

    @Test
    public void getShape_givenUnsetIndex_shouldReturnNull() {
        // Arrange
        ShapeList list = new ShapeList();

        // Act
        Shape result = list.getShape(0);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void setShape_givenValidIndexAndShape_shouldStoreAndExpandList() {
        // Arrange
        ShapeList list = new ShapeList();
        Shape shape1 = new Rectangle(5, 5, 20, 20);
        Shape shape2 = new Line2D.Double(0.0, 0.0, 10.0, 10.0);

        // Act
        list.setShape(0, shape1);
        list.setShape(3, shape2);

        // Assert
        Assert.assertEquals(shape1, list.getShape(0));
        Assert.assertNull(list.getShape(1));
        Assert.assertNull(list.getShape(2));
        Assert.assertEquals(shape2, list.getShape(3));
        Assert.assertEquals(4, list.size());
    }

    @Test
    public void setShape_givenNullValue_shouldStoreNull() {
        // Arrange
        ShapeList list = new ShapeList();
        Shape shape = new Rectangle(0, 0, 10, 10);
        list.setShape(0, shape);

        // Act
        list.setShape(0, null);

        // Assert
        Assert.assertNull(list.getShape(0));
    }

    @Test
    public void clone_givenPopulatedList_shouldReturnIndependentEqualClone() throws CloneNotSupportedException {
        // Arrange
        ShapeList original = new ShapeList();
        original.setShape(0, new Rectangle(0, 0, 10, 10));
        original.setShape(1, new Ellipse2D.Double(1.0, 1.0, 5.0, 5.0));

        // Act
        ShapeList cloned = (ShapeList) original.clone();

        // Assert
        Assert.assertNotSame(original, cloned);
        Assert.assertEquals(original.getClass(), cloned.getClass());
        Assert.assertEquals(original, cloned);

        // Mutate clone to verify independence
        cloned.setShape(0, new Rectangle(99, 99, 99, 99));
        Assert.assertFalse(original.equals(cloned));
    }

    @Test
    public void equals_givenSameInstance_shouldReturnTrue() {
        // Arrange
        ShapeList list = new ShapeList();

        // Act & Assert
        Assert.assertTrue(list.equals(list));
    }

    @Test
    public void equals_givenNull_shouldReturnFalse() {
        // Arrange
        ShapeList list = new ShapeList();

        // Act & Assert
        Assert.assertFalse(list.equals(null));
    }

    @Test
    public void equals_givenIncompatibleType_shouldReturnFalse() {
        // Arrange
        ShapeList list = new ShapeList();

        // Act & Assert
        Assert.assertFalse(list.equals("NotAShapeList"));
    }

    @Test
    public void equals_givenEqualLists_shouldReturnTrue() {
        // Arrange
        ShapeList list1 = new ShapeList();
        ShapeList list2 = new ShapeList();

        list1.setShape(0, new Rectangle(0, 0, 10, 10));
        list1.setShape(2, new Line2D.Double(0.0, 0.0, 1.0, 1.0));

        list2.setShape(0, new Rectangle(0, 0, 10, 10));
        list2.setShape(2, new Line2D.Double(0.0, 0.0, 1.0, 1.0));

        // Act & Assert
        Assert.assertTrue(list1.equals(list2));
        Assert.assertTrue(list2.equals(list1));
    }

    @Test
    public void equals_givenDifferentLists_shouldReturnFalse() {
        // Arrange
        ShapeList list1 = new ShapeList();
        ShapeList list2 = new ShapeList();

        list1.setShape(0, new Rectangle(0, 0, 10, 10));
        list2.setShape(0, new Rectangle(0, 0, 20, 20));

        // Act & Assert
        Assert.assertFalse(list1.equals(list2));
    }

    @Test
    public void hashCode_givenEqual