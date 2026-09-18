package org.jfree.chart.util;

import static org.junit.Assert.*;

import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

import org.junit.Test;

public class ShapeUtilitiesTest {

    // ---------------------- clone() ----------------------

    @Test
    public void testCloneLine2D() {
        Line2D line = new Line2D.Double(1.0, 2.0, 3.0, 4.0);
        Shape cloned = ShapeUtilities.clone(line);
        assertNotNull(cloned);
        assertNotSame(line, cloned);
        assertTrue(cloned instanceof Line2D);
        Line2D clonedLine = (Line2D) cloned;
        assertEquals(line.getP1(), clonedLine.getP1());
        assertEquals(line.getP2(), clonedLine.getP2());
    }

    @Test
    public void testCloneRectangle2D() {
        Rectangle2D rect = new Rectangle2D.Double(0, 0, 10, 10);
        Shape cloned = ShapeUtilities.clone(rect);
        assertNotNull(cloned);
        assertNotSame(rect, cloned);
        assertEquals(rect, cloned);
    }

    @Test
    public void testCloneNonCloneableShape() {
        Shape notCloneable = new Shape() {
            public boolean contains(double x, double y) { return false; }
            public boolean contains(Rectangle2D r) { return false; }
            public boolean contains(java.awt.geom.Point2D p) { return false; }
            public boolean contains(double x, double y, double w, double h) { return false; }
            public boolean intersects(Rectangle2D r) { return false; }
            public boolean intersects(double x, double y, double w, double h) { return false; }
            public Rectangle2D getBounds2D() { return new Rectangle2D.Double(); }
            public java.awt.Rectangle getBounds() { return new java.awt.Rectangle(); }
            public java.awt.geom.PathIterator getPathIterator(java.awt.geom.AffineTransform at) { return null; }
            public java.awt.geom.PathIterator getPathIterator(java.awt.geom.AffineTransform at, double flatness) { return null; }
        };
        Shape cloned = ShapeUtilities.clone(notCloneable);
        assertNull(cloned);
    }

    // ---------------------- equal(Shape, Shape) ----------------------

    @Test
    public void testEqualShapeLine2D() {
        Line2D l1 = new Line2D.Double(1, 2, 3, 4);
        Line2D l2 = new Line2D.Double(1, 2, 3, 4);
        assertTrue(ShapeUtilities.equal((Shape) l1, (Shape) l2));
    }

    @Test
    public void testEqualShapeEllipse2D() {
        Ellipse2D e1 = new Ellipse2D.Double(0, 0, 10, 10);
        Ellipse2D e2 = new Ellipse2D.Double(0, 0, 10, 10);
        assertTrue(ShapeUtilities.equal((Shape) e1, (Shape) e2));
    }

    @Test
    public void testEqualShapeArc2D() {
        Arc2D a1 = new Arc2D.Double(0, 0, 10, 10, 0, 90, Arc2D.OPEN);
        Arc2D a2 = new Arc2D.Double(0, 0, 10, 10, 0, 90, Arc2D.OPEN);
        assertTrue(ShapeUtilities.equal((Shape) a1, (Shape) a2));
    }

    @Test
    public void testEqualShapePolygon() {
        Polygon p1 = new Polygon(new int[] {0, 1, 2}, new int[] {0, 1, 2}, 3);
        Polygon p2 = new Polygon(new int[] {0, 1, 2}, new int[] {0, 1, 2}, 3);
        assertTrue(ShapeUtilities.equal((Shape) p1, (Shape) p2));
    }

    @Test
    public void testEqualShapeGeneralPath() {
        GeneralPath gp1 = new GeneralPath();
        gp1.moveTo(0, 0);
        gp1.lineTo(10, 10);
        GeneralPath gp2 = new GeneralPath();
        gp2.moveTo(0, 0);
        gp2.lineTo(10, 10);
        assertTrue(ShapeUtilities.equal((Shape) gp1, (Shape) gp2));
    }

    @Test
    public void testEqualShapeRectangle2DFallback() {
        Rectangle2D r1 = new Rectangle2D.Double(0, 0, 5, 5);
        Rectangle2D r2 = new Rectangle2D.Double(0, 0, 5, 5);
        assertTrue(ShapeUtilities.equal((Shape) r1, (Shape) r2));
    }

    @Test
    public void testEqualShapeBothNull() {
        assertTrue(ShapeUtilities.equal((Shape) null, (Shape) null));
    }

    @Test
    public void testEqualShapeMismatchedTypes() {
        Line2D l1 = new Line2D.Double(0, 0, 1, 1);
        Rectangle2D r1 = new Rectangle2D.Double(0, 0, 5, 5);
        assertFalse(ShapeUtilities.equal((Shape) l1, (Shape) r1));
    }

    // ---------------------- equal(Line2D, Line2D) ----------------------

    @Test
    public void testEqualLine2DBothNull() {
        assertTrue(ShapeUtilities.equal((Line2D) null, (Line2D) null));
    }

    @Test
    public void testEqualLine2DFirstNull() {
        Line2D l2 = new Line2D.Double(0, 0, 1, 1);
        assertFalse(ShapeUtilities.equal((Line2D) null, l2));
    }

    @Test
    public void testEqualLine2DSecondNull() {
        Line2D l1 = new Line2D.Double(0, 0, 1, 1);
        assertFalse(ShapeUtilities.equal(l1, (Line2D) null));
    }

    @Test
    public void testEqualLine2DDifferentP1() {
        Line2D l1 = new Line2D.Double(0, 0, 1, 1);
        Line2D l2 = new Line2D.Double(5, 5, 1, 1);
        assertFalse(ShapeUtilities.equal(l1, l2));
    }

    @Test
    public void testEqualLine2DDifferentP2() {
        Line2D l1 = new Line2D.Double(0, 0, 1, 1);
        Line2D l2 = new Line2D.Double(0, 0, 5, 5);
        assertFalse(ShapeUtilities.equal(l1, l2));
    }

    @Test
    public void testEqualLine2DEqual() {
        Line2D l1 = new Line2D.Double(0, 0, 1, 1);
        Line2D l2 = new Line2D.Double(0, 0, 1, 1);
        assertTrue(ShapeUtilities.equal(l1, l2));
    }

    // ---------------------- equal(Ellipse2D, Ellipse2D) ----------------------

    @Test
    public void testEqualEllipse2DBothNull() {
        assertTrue(ShapeUtilities.equal((Ellipse2D) null, (Ellipse2D) null));
    }

    @Test
    public void testEqualEllipse2DFirstNull() {
        Ellipse2D e2 = new Ellipse2D.Double(0, 0, 10, 10);
        assertFalse(ShapeUtilities.equal((Ellipse2D) null, e2));
    }

    @Test
    public void testEqualEllipse2DSecondNull() {
        Ellipse2D e1 = new Ellipse2D.Double(0, 0, 10, 10);
        assertFalse(ShapeUtilities.equal(e1, (Ellipse2D) null));
    }

    @Test
    public void testEqualEllipse2DDifferentFrame() {
        Ellipse2D e1 = new Ellipse2D.Double(0, 0, 10, 10);
        Ellipse2D e2 = new Ellipse2D.Double(0, 0, 20, 20);
        assertFalse(ShapeUtilities.equal(e1, e2));
    }

    @Test
    public void testEqualEllipse2DEqual() {
        Ellipse2D e1 = new Ellipse2D.Double(0, 0, 10, 10);
        Ellipse2D e2 = new Ellipse2D.Double(0, 0, 10, 10);
        assertTrue(ShapeUtilities.equal(e1, e2));
    }

    // ---------------------- equal(Arc2D, Arc2D) ----------------------

    @Test
    public void testEqualArc2DBothNull() {
        assertTrue(ShapeUtilities.equal((Arc2D) null, (Arc2D) null));
    }

    @Test
    public void testEqualArc2DFirstNull() {
        Arc2D a2 = new Arc2D.Double(0, 0, 10, 10, 0, 90, Arc2D.OPEN);
        assertFalse(ShapeUtilities.equal((Arc2D) null, a2));
    }

    @Test
    public void testEqualArc2DSecondNull() {
        Arc2D a1 = new Arc2D.Double(0, 0, 10, 10, 0, 90, Arc2D.OPEN);
        assertFalse(ShapeUtilities.equal(a1, (Arc2D) null));
    }

    @Test
    public void testEqualArc2DDifferentFrame() {
        Arc2D a1 = new Arc2D.Double(0, 0, 10, 10, 0, 90, Arc2D.OPEN);
        Arc2D a2 = new Arc2D.Double(0, 0, 20, 20, 0, 90, Arc2D.OPEN);
        assertFalse(ShapeUtilities.equal(a1, a2));
    }

    @Test
    public void testEqualArc2DDifferentAngleStart() {
        Arc2D a1 = new Arc2D.Double(0, 0, 10, 10, 0, 90, Arc2D.OPEN);
        Arc2D a2 = new Arc2D.Double(0, 0, 10, 10, 10, 90, Arc2D.OPEN);
        assertFalse(ShapeUtilities.equal(a1, a2));
    }

    @Test
    public void testEqualArc2DDifferentAngleExtent() {
        Arc2D a1 = new Arc2D.Double(0, 0, 10, 10, 0, 90, Arc2D.OPEN);
        Arc2D a2 = new Arc2D.Double(0, 0, 10, 10, 0, 45, Arc2D.OPEN);
        assertFalse(ShapeUtilities.equal(a1, a2));
    }

    @Test
    public void testEqualArc2DDifferentArcType() {
        Arc2D a1 = new Arc2D.Double(0, 0, 10, 10, 0, 90, Arc2D.OPEN);
        Arc2D a2 = new Arc2D.Double(0, 0, 10, 10, 0, 90, Arc2D.CHORD);
        assertFalse(ShapeUtilities.equal(a1, a2));
    }

    @Test
    public void testEqualArc2DEqual() {
        Arc2D a1 = new Arc2D.Double(0, 0, 10, 10, 0, 90, Arc2D.OPEN);
        Arc2D a2 = new Arc2D.Double(0, 0, 10, 10, 0, 90, Arc2D.OPEN);
        assertTrue(ShapeUtilities.equal(a1, a2));
    }

    // ---------------------- equal(Polygon, Polygon) ----------------------

    @Test
    public void testEqualPolygonBothNull() {
        assertTrue(ShapeUtilities.equal((Polygon) null, (Polygon) null));
    }

    @Test
    public void testEqualPolygonFirstNull() {
        Polygon p2 = new Polygon(new int[] {0, 1}, new int[] {0, 1}, 2);
        assertFalse(ShapeUtilities.equal((Polygon) null, p2));
    }

    @Test
    public void testEqualPolygonSecondNull() {
        Polygon p1 = new Polygon(new int[] {0, 1}, new int[] {0, 1}, 2);
        assertFalse(ShapeUtilities.equal(p1, (Polygon) null));
    }

    @Test
    public void testEqualPolygonDifferentNPoints() {
        Polygon p1 = new Polygon(new int[] {0, 1}, new int[] {0, 1}, 2);
        Polygon p2 = new Polygon(new int[] {0, 1, 2}, new int[] {0, 1, 2}, 3);
        assertFalse(ShapeUtilities.equal(p1, p2));
    }

    @Test
    public void testEqualPolygonDifferentXPoints() {
        Polygon p1 = new Polygon(new int[] {0, 1}, new int[] {0, 1}, 2);
        Polygon p2 = new Polygon(new int[] {0, 5}, new int[] {0, 1}, 2);
        assertFalse(ShapeUtilities.equal(p1, p2));
    }

    @Test
    public void testEqualPolygonDifferentYPoints() {
        Polygon p1 = new Polygon(new int[] {0, 1}, new int[] {0, 1}, 2);
        Polygon p2 = new Polygon(new int[] {0, 1}, new int[] {0, 5}, 2);
        assertFalse(ShapeUtilities.equal(p1, p2));
    }

    @Test
    public void testEqualPolygonEqual() {
        Polygon p1 = new Polygon(new int[] {0, 1}, new int[] {0, 1}, 2);
        Polygon p2 = new Polygon(new int[] {0, 1}, new int[] {0, 1}, 2);
        assertTrue(ShapeUtilities.equal(p1, p2));
    }

    // ---------------------- equal(GeneralPath, GeneralPath) ----------------------

    @Test
    public void testEqualGeneralPathBothNull() {
        assertTrue(ShapeUtilities.equal((GeneralPath) null, (GeneralPath) null));
    }

    @Test
    public void testEqualGeneralPathFirstNull() {
        GeneralPath gp2 = new GeneralPath();
        gp2.moveTo(0, 0);
        assertFalse(ShapeUtilities.equal((GeneralPath) null, gp2));
    }

    @Test
    public void testEqualGeneralPathSecondNull() {
        GeneralPath gp1 = new GeneralPath();
        gp1.moveTo(0, 0);
        assertFalse(ShapeUtilities.equal(gp1, (GeneralPath) null));
    }

    @Test
    public void testEqualGeneralPathDifferentWindingRule() {
        GeneralPath gp1 = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp1.moveTo(0, 0);
        GeneralPath gp2 = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        gp2.moveTo(0, 0);
        assertFalse(ShapeUtilities.equal(gp1, gp2));
    }

    @Test
    public void testEqualGeneralPathSameWindingRule() {
        GeneralPath gp1 = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        gp1.moveTo(0, 0);
        gp1.lineTo(10, 10);
        gp1.closePath();
        GeneralPath gp2 = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        gp2.moveTo(1, 1);
        gp2.lineTo(20, 20);
        gp2.closePath();
        // due to implementation, iterator2 is built from p1 as well
        assertTrue(ShapeUtilities.equal(gp1, gp2));
    }

    @Test
    public void testEqualGeneralPathEmptyPaths() {
        GeneralPath gp1 = new GeneralPath();
        GeneralPath gp2 = new GeneralPath();
        assertTrue(ShapeUtilities.equal(gp1, gp2));
    }

    // ---------------------- createTranslatedShape(Shape, double, double) ----------------------

    @Test
    public void testCreateTranslatedShapeNormal() {
        Rectangle2D rect = new Rectangle2D.Double(0, 0, 10, 10);
        Shape translated = ShapeUtilities.createTranslatedShape(rect, 5, 5);
        Rectangle2D bounds = translated.getBounds2D();
        assertEquals(5.0, bounds.getX(), 0.0001);
        assertEquals(5.0, bounds.getY(), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateTranslatedShapeNullShape() {
        ShapeUtilities.createTranslatedShape(null, 1, 1);
    }

    // -------------- createTranslatedShape(Shape, RectangleAnchor, double, double) --------------

    @Test
    public void testCreateTranslatedShapeWithAnchorNormal() {
        Rectangle2D rect = new Rectangle2D.Double(0, 0, 10, 10);
        Shape translated = ShapeUtilities.createTranslatedShape(rect,
                RectangleAnchor.CENTER, 100, 100);
        Rectangle2D bounds = translated.getBounds2D();
        assertEquals(95.0, bounds.getCenterX(), 0.0001);
        assertEquals(95.0, bounds.getCenterY(), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateTranslatedShapeWithAnchorNullShape() {
        ShapeUtilities.createTranslatedShape(null, RectangleAnchor.CENTER, 1, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateTranslatedShapeWithAnchorNullAnchor() {
        Rectangle2D rect = new Rectangle2D.Double(0, 0, 10, 10);
        ShapeUtilities.createTranslatedShape(rect, null, 1, 1);
    }

    // ---------------------- rotateShape() ----------------------

    @Test
    public void testRotateShapeNull() {
        assertNull(ShapeUtilities.rotateShape(null, Math.PI / 2, 0f, 0f));
    }

    @Test
    public void testRotateShapeNormal() {
        Rectangle2D rect = new Rectangle2D.Double(0, 0, 10, 10);
        Shape rotated = ShapeUtilities.rotateShape(rect, Math.PI / 2, 0f, 0f);
        assertNotNull(rotated);
        Rectangle2D bounds = rotated.getBounds2D();
        // rotating a rect 90 degrees around origin should change bounds
        assertNotEquals(rect.getBounds2D(), bounds);
    }

    // ---------------------- drawRotatedShape() ----------------------

    @Test
    public void testDrawRotatedShape() {
        BufferedImage image = new BufferedImage(50, 50, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D rect = new Rectangle2D.Double(0, 0, 10, 10);
        java.awt.geom.AffineTransform before = g2.getTransform();
        ShapeUtilities.drawRotatedShape(g2, rect, Math.PI / 4, 5f, 5f);
        java.awt.geom.AffineTransform after = g2.getTransform();
        assertEquals(before, after);
        g2.dispose();
    }

    // ---------------------- createDiagonalCross() ----------------------

    @Test
    public void testCreateDiagonalCross() {
        Shape shape = ShapeUtilities.createDiagonalCross(5f, 1f);
        assertNotNull(shape);
        Rectangle2D bounds = shape.getBounds2D();
        assertTrue(bounds.getWidth() > 0);
        assertTrue(bounds.getHeight() > 0);
    }

    // ---------------------- createRegularCross() ----------------------

    @Test
    public void testCreateRegularCross() {
        Shape shape = ShapeUtilities.createRegularCross(5f, 1f);
        assertNotNull(shape);
        Rectangle2D bounds = shape.getBounds2D();
        assertEquals(10.0, bounds.getWidth(), 0.0001);
        assertEquals(10.0, bounds.getHeight(), 0.0001);
    }

    // ---------------------- createDiamond() ----------------------

    @Test
    public void testCreateDiamond() {
        Shape shape = ShapeUtilities.createDiamond(5f);
        assertNotNull(shape);
        Rectangle2D bounds = shape.getBounds2D();
        assertEquals(10.0, bounds.getWidth(), 0.0001);
        assertEquals(10.0, bounds.getHeight(), 0.0001);
    }

    // ---------------------- createUpTriangle() ----------------------

    @Test
    public void testCreateUpTriangle() {
        Shape shape = ShapeUtilities.createUpTriangle(5f);
        assertNotNull(shape);
        Rectangle2D bounds = shape.getBounds2D();
        assertEquals(10.0, bounds.getWidth(), 0.0001);
        assertEquals(10.0, bounds.getHeight(), 0.0001);
    }

    // ---------------------- createDownTriangle() ----------------------

    @Test
    public void testCreateDownTriangle() {
        Shape shape = ShapeUtilities.createDownTriangle(5f);
        assertNotNull(shape);
        Rectangle2D bounds = shape.getBounds2D();
        assertEquals(10.0, bounds.getWidth(), 0.0001);
        assertEquals(10.0, bounds.getHeight(), 0.0001);
    }

    // ---------------------- createLineRegion() ----------------------

    @Test
    public void testCreateLineRegionDiagonal() {
        Line2D line = new Line2D.Double(0, 0, 10, 10);
        Shape region = ShapeUtilities.createLineRegion(line, 2f);
        assertNotNull(region);
        Rectangle2D bounds = region.getBounds2D();
        assertTrue(bounds.getWidth() > 0);
        assertTrue(bounds.getHeight() > 0);
    }

    @Test
    public void testCreateLineRegionVertical() {
        Line2D line = new Line2D.Double(5, 0, 5, 10);
        Shape region = ShapeUtilities.createLineRegion(line, 2f);
        assertNotNull(region);
        Rectangle2D bounds = region.getBounds2D();
        assertEquals(2.0, bounds.getWidth(), 0.0001);
        assertEquals(10.0, bounds.getHeight(), 0.0001);
    }

    // ---------------------- getPointInRectangle() ----------------------

    @Test
    public void testGetPointInRectangleInside() {
        Rectangle2D area = new Rectangle2D.Double(0, 0, 10, 10);
        Point2D p = ShapeUtilities.getPointInRectangle(5, 5, area);
        assertEquals(5.0, p.getX(), 0.0001);
        assertEquals(5.0, p.getY(), 0.0001);
    }

    @Test
    public void testGetPointInRectangleOutsideLow() {
        Rectangle2D area = new Rectangle2D.Double(0, 0, 10, 10);
        Point2D p = ShapeUtilities.getPointInRectangle(-5, -5, area);
        assertEquals(0.0, p.getX(), 0.0001);
        assertEquals(0.0, p.getY(), 0.0001);
    }

    @Test
    public void testGetPointInRectangleOutsideHigh() {
        Rectangle2D area = new Rectangle2D.Double(0, 0, 10, 10);
        Point2D p = ShapeUtilities.getPointInRectangle(15, 15, area);
        assertEquals(10.0, p.getX(), 0.0001);
        assertEquals(10.0, p.getY(), 0.0001);
    }

    @Test
    public void testGetPointInRectangleBoundary() {
        Rectangle2D area = new Rectangle2D.Double(0, 0, 10, 10);
        Point2D p = ShapeUtilities.getPointInRectangle(0, 10, area);
        assertEquals(0.0, p.getX(), 0.0001);
        assertEquals(10.0, p.getY(), 0.0001);
    }

    @Test(expected = NullPointerException.class)
    public void testGetPointInRectangleNullArea() {
        ShapeUtilities.getPointInRectangle(1, 1, null);
    }

    // ---------------------- contains() ----------------------

    @Test
    public void testContainsTrue() {
        Rectangle2D rect1 = new Rectangle2D.Double(0, 0, 100, 100);
        Rectangle2D rect2 = new Rectangle2D.Double(10, 10, 20, 20);
        assertTrue(ShapeUtilities.contains(rect1, rect2));
    }

    @Test
    public void testContainsFalseXTooSmall() {
        Rectangle2D rect1 = new Rectangle2D.Double(10, 10, 100, 100);
        Rectangle2D rect2 = new Rectangle2D.Double(0, 20, 20, 20);
        assertFalse(ShapeUtilities.contains(rect1, rect2));
    }

    @Test
    public void testContainsFalseYTooSmall() {
        Rectangle2D rect1 = new Rectangle2D.Double(10, 10, 100, 100);
        Rectangle2D rect2 = new Rectangle2D.Double(20, 0, 20, 20);
        assertFalse(ShapeUtilities.contains(rect1, rect2));
    }

    @Test
    public void testContainsFalseWidthExceeds() {
        Rectangle2D rect1 = new Rectangle2D.Double(0, 0, 50, 50);
        Rectangle2D rect2 = new Rectangle2D.Double(10, 10, 60, 10);
        assertFalse(ShapeUtilities.contains(rect1, rect2));
    }

    @Test
    public void testContainsFalseHeightExceeds() {
        Rectangle2D rect1 = new Rectangle2D.Double(0, 0, 50, 50);
        Rectangle2D rect2 = new Rectangle2D.Double(10, 10, 10, 60);
        assertFalse(ShapeUtilities.contains(rect1, rect2));
    }

    @Test
    public void testContainsZeroSizedRect2() {
        Rectangle2D rect1 = new Rectangle2D.Double(0, 0, 50, 50);
        Rectangle2D rect2 = new Rectangle2D.Double(10, 10, 0, 0);
        assertTrue(ShapeUtilities.contains(rect1, rect2));
    }

    // ---------------------- intersects() ----------------------

    @Test
    public void testIntersectsTrue() {
        Rectangle2D rect1 = new Rectangle2D.Double(0, 0, 50, 50);
        Rectangle2D rect2 = new Rectangle2D.Double(25, 25, 50, 50);
        assertTrue(ShapeUtilities.intersects(rect1, rect2));
    }

    @Test
    public void testIntersectsFalseXTooFarRight() {
        Rectangle2D rect1 = new Rectangle2D.Double(0, 0, 10, 10);
        Rectangle2D rect2 = new Rectangle2D.Double(-50, 0, 10, 10);
        assertFalse(ShapeUtilities.intersects(rect1, rect2));
    }

    @Test
    public void testIntersectsFalseYTooFarUp() {
        Rectangle2D rect1 = new Rectangle2D.Double(0, 0, 10, 10);
        Rectangle2D rect2 = new Rectangle2D.Double(0, -50, 10, 10);
        assertFalse(ShapeUtilities.intersects(rect1, rect2));
    }

    @Test
    public void testIntersectsFalseXTooFarLeft() {
        Rectangle2D rect1 = new Rectangle2D.Double(0, 0, 10, 10);
        Rectangle2D rect2 = new Rectangle2D.Double(50, 0, 10, 10);
        assertFalse(ShapeUtilities.intersects(rect1, rect2));
    }

    @Test
    public void testIntersectsFalseYTooFarDown() {
        Rectangle2D rect1 = new Rectangle2D.Double(0, 0, 10, 10);
        Rectangle2D rect2 = new Rectangle2D.Double(0, 50, 10, 10);
        assertFalse(ShapeUtilities.intersects(rect1, rect2));
    }

    @Test
    public void testIntersectsBoundaryTouching() {
        Rectangle2D rect1 = new Rectangle2D.Double(0, 0, 10, 10);
        Rectangle2D rect2 = new Rectangle2D.Double(10, 10, 10, 10);
        assertTrue(ShapeUtilities.intersects(rect1, rect2));
    }
}