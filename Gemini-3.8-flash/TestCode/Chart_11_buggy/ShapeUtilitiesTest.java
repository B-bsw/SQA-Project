package org.jfree.chart.util;

import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit tests for {@link ShapeUtilities}.
 */
public class ShapeUtilitiesTest {

    private static final double EPSILON = 1e-6;

    private static class NonCloneableShape implements Shape {
        public Rectangle getBounds() {
            return new Rectangle(0, 0, 10, 10);
        }
        public Rectangle2D getBounds2D() {
            return new Rectangle2D.Double(0.0, 0.0, 10.0, 10.0);
        }
        public boolean contains(double x, double y) {
            return false;
        }
        public boolean contains(Point2D p) {
            return false;
        }
        public boolean intersects(double x, double y, double w, double h) {
            return false;
        }
        public boolean intersects(Rectangle2D r) {
            return false;
        }
        public boolean contains(double x, double y, double w, double h) {
            return false;
        }
        public boolean contains(Rectangle2D r) {
            return false;
        }
        public PathIterator getPathIterator(AffineTransform at) {
            return new GeneralPath().getPathIterator(at);
        }
        public PathIterator getPathIterator(AffineTransform at, double flatness) {
            return new GeneralPath().getPathIterator(at, flatness);
        }
    }

    @Test
    public void clone_givenNull_shouldReturnNull() {
        // Arrange
        Shape shape = null;

        // Act
        Shape result = ShapeUtilities.clone(shape);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void clone_givenCloneableShape_shouldReturnClonedInstance() {
        // Arrange
        Rectangle2D.Double original = new Rectangle2D.Double(10.0, 20.0, 30.0, 40.0);

        // Act
        Shape cloned = ShapeUtilities.clone(original);

        // Assert
        Assert.assertNotNull(cloned);
        Assert.assertNotSame(original, cloned);
        Assert.assertEquals(original, cloned);
    }

    @Test
    public void clone_givenNonCloneableShape_shouldReturnNull() {
        // Arrange
        Shape nonCloneable = new NonCloneableShape();

        // Act
        Shape result = ShapeUtilities.clone(nonCloneable);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void equalShape_givenBothNull_shouldReturnTrue() {
        // Arrange & Act & Assert
        Assert.assertTrue(ShapeUtilities.equal((Shape) null, (Shape) null));
    }

    @Test
    public void equalShape_givenOneNull_shouldReturnFalse() {
        // Arrange
        Shape line = new Line2D.Double(0.0, 0.0, 1.0, 1.0);

        // Act & Assert
        Assert.assertFalse(ShapeUtilities.equal(line, (Shape) null));
        Assert.assertFalse(ShapeUtilities.equal((Shape) null, line));
    }

    @Test
    public void equalShape_givenDifferentTypes_shouldReturnFalse() {
        // Arrange
        Shape line = new Line2D.Double(0.0, 0.0, 10.0, 10.0);
        Shape rect = new Rectangle2D.Double(0.0, 0.0, 10.0, 10.0);

        // Act & Assert
        Assert.assertFalse(ShapeUtilities.equal(line, rect));
        Assert.assertFalse(ShapeUtilities.equal(rect, line));
    }

    @Test
    public void equalShape_givenLine2DInstances_shouldDelegateToLineEqual() {
        // Arrange
        Shape l1 = new Line2D.Double(0.0, 0.0, 10.0, 10.0);
        Shape l2 = new Line2D.Double(0.0, 0.0, 10.0, 10.0);
        Shape l3 = new Line2D.Double(0.0, 0.0, 10.0, 20.0);

        // Act & Assert
        Assert.assertTrue(ShapeUtilities.equal(l1, l2));
        Assert.assertFalse(ShapeUtilities.equal(l1, l3));
    }

    @Test
    public void equalShape_givenEllipse2DInstances_shouldDelegateToEllipseEqual() {
        // Arrange
        Shape e1 = new Ellipse2D.Double(1.0, 2.0, 3.0, 4.0);
        Shape e2 = new Ellipse2D.Double(1.0, 2.0, 3.0, 4.0);
        Shape e3 = new Ellipse2D.Double(1.0, 2.0, 5.0, 4.0);

        // Act & Assert
        Assert.assertTrue(ShapeUtilities.equal(e1, e2));
        Assert.assertFalse(ShapeUtilities.equal(e1, e3));
    }

    @Test
    public void equalShape_givenArc2DInstances_shouldDelegateToArcEqual() {
        // Arrange
        Shape a1 = new Arc2D.Double(0.0, 0.0, 10.0, 10.0, 0.0, 90.0, Arc2D.OPEN);
        Shape a2 = new Arc2D.Double(0.0, 0.0, 10.0, 10.0, 0.0, 90.0, Arc2D.OPEN);
        Shape a3 = new Arc2D.Double(0.0, 0.0, 10.0, 10.0, 0.0, 45.0, Arc2D.OPEN);

        // Act & Assert
        Assert.assertTrue(ShapeUtilities.equal(a1, a2));
        Assert.assertFalse(ShapeUtilities.equal(a1, a3));
    }

    @Test
    public void equalShape_givenPolygonInstances_shouldDelegateToPolygonEqual() {
        // Arrange
        Shape p1 = new Polygon(new int[] {0, 5, 10}, new int[] {0, 5, 0}, 3);
        Shape p2 = new Polygon(new int[] {0, 5, 10}, new int[] {0, 5, 0}, 3);
        Shape p3 = new Polygon(new int[] {0, 5, 10}, new int[] {0, 5, 1}, 3);

        // Act & Assert
        Assert.assertTrue(ShapeUtilities.equal(p1, p2));
        Assert.assertFalse(ShapeUtilities.equal(p1, p3));
    }

    @Test
    public void equalShape_givenGeneralPathInstances_shouldDelegateToGeneralPathEqual() {
        // Arrange
        GeneralPath gp1 = new GeneralPath();
        gp1.moveTo(0.0f, 0.0f);
        gp1.lineTo(10.0f, 10.0f);

        GeneralPath gp2 = new GeneralPath();
        gp2.moveTo(0.0f, 0.0f);
        gp2.lineTo(10.0f, 10.0f);

        GeneralPath gp3 = new GeneralPath();
        gp3.moveTo(0.0f, 0.0f);
        gp3.lineTo(10.0f, 20.0f);

        // Act & Assert
        Assert.assertTrue(ShapeUtilities.equal((Shape) gp1, (Shape) gp2));
        Assert.assertFalse(ShapeUtilities.equal((Shape) gp1, (Shape) gp3));
    }

    @Test
    public void equalShape_givenRectangle2DInstances_shouldHandleViaObjectUtilities() {
        // Arrange
        Shape r1 = new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0);
        Shape r2 = new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0);
        Shape r3 = new Rectangle2D.Double(1.0, 2.0, 3.0, 5.0);

        // Act & Assert
        Assert.assertTrue(ShapeUtilities.equal(r1, r2));
        Assert.assertFalse(ShapeUtilities.equal(r1, r3));
    }

    @Test
    public void equalLine2D_givenBothNull_shouldReturnTrue() {
        // Arrange & Act & Assert
        Assert.assertTrue(ShapeUtilities.equal((Line2D) null, (Line2D) null));
    }

    @Test
    public void equalLine2D_givenFirstNull_shouldReturnFalse() {
        // Arrange
        Line2D l2 = new Line2D.Double(0.0, 0.0, 1.0, 1.0);

        // Act & Assert
        Assert.assertFalse(ShapeUtilities.equal((Line2D) null, l2));
    }

    @Test
    public void equalLine2D_givenSecondNull_shouldReturnFalse() {
        // Arrange
        Line2D l1 = new Line2D.Double(0.0, 0.0, 1.0, 1.0);

        // Act & Assert
        Assert.assertFalse(ShapeUtilities.equal(l1, (Line2D) null));
    }

    @Test
    public void equalLine2D_givenDifferentP1_shouldReturnFalse() {
        // Arrange
        Line2D l1 = new Line2D.Double(0.0, 0.0, 10.0, 10.0);
        Line2D l2 = new Line2D.Double(1.0, 0.0, 10.0, 10.0);

        // Act & Assert
        Assert.assertFalse(ShapeUtilities.equal(l1, l2));
    }

    @Test
    public void equalLine2D_givenDifferentP2_shouldReturnFalse() {
        // Arrange
        Line2D l1 = new Line2D.Double(0.0, 0.0, 10.0, 10.0);
        Line2D l2 = new Line2D.Double(0.0, 0.0, 10.0, 11.0);

        // Act & Assert
        Assert.assertFalse(ShapeUtilities.equal(l1, l2));
    }

    @Test
    public void equalLine2D_givenEqualLines_shouldReturnTrue() {
        // Arrange
        Line2D l1 = new Line2D.Double(0.0, 0.0, 10.0, 10.0);
        Line2D l2 = new Line2D.Double(0.0, 0.0, 10.0, 10.0);

        // Act & Assert
        Assert.assertTrue(ShapeUtilities.equal(l1, l2));
    }

    @Test
    public void equalEllipse2D_givenBothNull_shouldReturnTrue() {
        // Arrange & Act & Assert
        Assert.assertTrue(ShapeUtilities.equal((Ellipse2D) null, (Ellipse2D) null));
    }

    @Test
    public void equalEllipse2D_givenFirstNull_shouldReturnFalse() {
        // Arrange
        Ellipse2D e2 = new Ellipse2D.Double(0.0, 0.0, 1.0, 1.0);

        // Act & Assert
        Assert.assertFalse(ShapeUtilities.equal((Ellipse2D) null, e2));
    }

    @Test
    public void equalEllipse2D_givenSecondNull_shouldReturnFalse() {
        // Arrange
        Ellipse2D e1 = new Ellipse2D.Double(0.0, 0.0, 1.0, 1.0);

        // Act & Assert
        Assert.assertFalse(ShapeUtilities.equal(e1, (Ellipse2D) null));
    }

    @Test
    public void equalEllipse2D_givenDifferentFrame_shouldReturnFalse() {
        // Arrange
        Ellipse2D e1 = new Ellipse2D.Double(0.0, 0.0, 10.0, 20.0);
        Ellipse2D e2 = new Ellipse2D.Double(0.0, 0.0, 10.0, 21.0);

        // Act & Assert
        Assert.assertFalse(ShapeUtilities.equal(e1, e2));
    }

    @Test
    public void equalEllipse2D_givenEqualFrames_shouldReturnTrue() {
        // Arrange
        Ellipse2D e1 = new Ellipse2D.Double(1.0, 2.0, 3.0, 4.0);
        Ellipse2D e2 = new Ellipse2D.Double(1.0, 2.0, 3.0, 4.0);

        // Act & Assert
        Assert.assertTrue(ShapeUtilities.equal(e1, e2));
    }

    @Test
    public void equalArc2D_givenBothNull_shouldReturnTrue() {
        // Arrange & Act & Assert
        Assert.assertTrue(ShapeUtilities.equal((Arc2D) null, (Arc2D) null));
    }

    @Test
    public void equalArc2D_givenFirstNull_shouldReturnFalse() {
        // Arrange
        Arc2D a2 = new Arc2D.Double(0.0, 0.0, 10.0, 10.0, 0.0, 90.0, Arc2D.OPEN);

        // Act & Assert
        Assert.assertFalse(ShapeUtilities.equal((Arc2D) null, a2));
    }

    @Test
    public void equalArc2D_givenSecondNull_shouldReturnFalse() {
        // Arrange
        Arc2D a1 = new Arc2D.Double(0.0, 0.0, 10.0, 10.0, 0.0, 90.0, Arc2D.OPEN);

        // Act & Assert
        Assert.assertFalse(ShapeUtilities.equal(a1, (Arc2D) null));
    }

    @Test
    public void equalArc2D_givenDifferentFrame_shouldReturnFalse() {
        // Arrange
        Arc2D a1 = new Arc2D.Double(0.0, 0.0, 10.0, 10.0, 0.0, 90.0, Arc2D.OPEN);
        Arc2D a2 = new Arc2D.Double(1.0, 0.0, 10.0, 10.0, 0.0, 90.0, Arc2D.OPEN);

        // Act & Assert
        Assert.assertFalse(ShapeUtilities.equal(a1, a2));
    }

    @Test
    public void equalArc2D_givenDifferentAngleStart_shouldReturnFalse() {
        // Arrange
        Arc2D a1 = new Arc2D.Double(0.0, 0.0, 10.0, 10.0, 0.0, 90.0, Arc2D.OPEN);
        Arc2D a2 = new Arc2D.Double(0.0, 0.0, 10.0, 10.0, 15.0, 90.0, Arc2D.OPEN);

        // Act & Assert
        Assert.assertFalse(ShapeUtilities.equal(a1, a2));
    }

    @Test
    public void equalArc2D_givenDifferentAngleExtent_shouldReturnFalse() {
        // Arrange
        Arc2D a1 = new Arc2D.Double(0.0, 0.0, 10.0, 10.0, 0.0, 90.0, Arc2D.OPEN);
        Arc2D a2 = new Arc2D.Double(0.0, 0.0, 10.0, 10.0, 0.0, 45.0, Arc2D.OPEN);

        // Act & Assert
        Assert.assertFalse(ShapeUtilities.equal(a1, a2));
    }

    @Test
    public void equalArc2D_givenDifferentArcType_shouldReturnFalse() {
        // Arrange
        Arc2D a1 = new Arc2D.Double(0.0, 0.0, 10.0, 10.0, 0.0, 90.0, Arc2D.OPEN);
        Arc2D a2 = new Arc2D.Double(0.0, 0.0, 10.0, 10.0, 0.0, 90.0, Arc2D.PIE);

        // Act & Assert
        Assert.assertFalse(ShapeUtilities.equal(a1, a2));
    }

    @Test
    public void equalArc2D_givenAllAttributesEqual_shouldReturnTrue() {
        // Arrange
        Arc2D a1 = new Arc2D.Double(1.0, 2.0, 10.0, 20.0, 30.0, 60.0, Arc2D.CHORD);
        Arc2D a2 = new Arc2D.Double(1.0, 2.0, 10.0, 20.0, 30.0, 60.0, Arc2D.CHORD);

        // Act & Assert
        Assert.assertTrue(ShapeUtilities.equal(a1, a2));
    }

    @Test
    public void equalPolygon_givenBothNull_shouldReturnTrue() {
        // Arrange & Act & Assert
        Assert.assertTrue(ShapeUtilities.equal((Polygon) null, (Polygon) null));
    }

    @Test
    public void equalPolygon_givenFirstNull_shouldReturnFalse() {
        // Arrange
        Polygon p2 = new Polygon(new int[] {1}, new int[] {1}, 1);

        // Act & Assert
        Assert.assertFalse(ShapeUtilities.equal((Polygon) null, p2));
    }

    @Test
    public void equalPolygon_givenSecondNull_shouldReturnFalse() {
        // Arrange
        Polygon p1 = new Polygon(new int[] {1}, new int[] {1}, 1);

        // Act & Assert
        Assert.assertFalse(ShapeUtilities.equal(p1, (Polygon) null));
    }

    @Test
    public void equalPolygon_givenDifferentNpoints_shouldReturnFalse() {
        // Arrange
        Polygon p1 = new Polygon(new int[] {0, 1, 2}, new int[] {0, 1, 2}, 3);
        Polygon p2 = new Polygon(new int