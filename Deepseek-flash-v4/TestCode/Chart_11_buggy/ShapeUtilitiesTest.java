package org.jfree.chart.util;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class ShapeUtilitiesTest {
    private static final double EPSILON = 0.0000001;

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testCloneNullShapeReturnsNull() {
        assertNull(ShapeUtilities.clone(null));
    }

    @Test
    public void testCloneNonCloneableShapeReturnsNull() {
        Shape shape = new Shape() {
            @Override
            public Rectangle2D getBounds() { return null; }
            @Override
            public Rectangle2D getBounds2D() { return null; }
            @Override
            public boolean contains(double x, double y) { return false; }
            @Override
            public boolean contains(Point2D p) { return false; }
            @Override
            public boolean intersects(double x, double y, double w, double h) { return false; }
            @Override
            public boolean intersects(Rectangle2D r) { return false; }
            @Override
            public boolean contains(double x, double y, double w, double h) { return false; }
            @Override
            public boolean contains(Rectangle2D r) { return false; }
            @Override
            public PathIterator getPathIterator(AffineTransform at) { return null; }
            @Override
            public PathIterator getPathIterator(AffineTransform at, double flatness) { return null; }
        };
        assertNull(ShapeUtilities.clone(shape));
    }

    @Test
    public void testCloneCloneableShape() {
        Line2D line = new Line2D.Double(1, 2, 3, 4);
        Shape clone = ShapeUtilities.clone(line);
        assertNotNull(clone);
        assertEquals(line, clone);
    }

    @Test
    public void testEqualBothNullShapes() {
        assertTrue(ShapeUtilities.equal((Shape) null, (Shape) null));
    }

    @Test
    public void testEqualFirstNullSecondNotNullShape() {
        assertFalse(ShapeUtilities.equal(null, new Line2D.Double()));
    }

    @Test
    public void testEqualFirstNotNullSecondNullShape() {
        assertFalse(ShapeUtilities.equal(new Line2D.Double(), null));
    }

    @Test
    public void testEqualLine2DNullP1AndNullP2() {
        assertTrue(ShapeUtilities.equal((Line2D) null, (Line2D) null));
    }

    @Test
    public void testEqualLine2DFirstNullSecondNotNull() {
        assertFalse(ShapeUtilities.equal(null, new Line2D.Double(1, 2, 3, 4)));
    }

    @Test
    public void testEqualLine2DFirstNotNullSecondNull() {
        assertFalse(ShapeUtilities.equal(new Line2D.Double(1, 2, 3, 4), null));
    }

    @Test
    public void testEqualLine2DSamePoints() {
        Line2D l1 = new Line2D.Double(1, 2, 3, 4);
        Line2D l2 = new Line2D.Double(1, 2, 3, 4);
        assertTrue(ShapeUtilities.equal(l1, l2));
    }

    @Test
    public void testEqualLine2DDifferentP1() {
        Line2D l1 = new Line2D.Double(1, 2, 3, 4);
        Line2D l2 = new Line2D.Double(5, 2, 3, 4);
        assertFalse(ShapeUtilities.equal(l1, l2));
    }

    @Test
    public void testEqualLine2DDifferentP2() {
        Line2D l1 = new Line2D.Double(1, 2, 3, 4);
        Line2D l2 = new Line2D.Double(1, 2, 5, 4);
        assertFalse(ShapeUtilities.equal(l1, l2));
    }

    @Test
    public void testEqualEllipse2DBothNull() {
        assertTrue(ShapeUtilities.equal((Ellipse2D) null, (Ellipse2D) null));
    }

    @Test
    public void testEqualEllipse2DFirstNullSecondNotNull() {
        assertFalse(ShapeUtilities.equal(null, new Ellipse2D.Double(1, 2, 3, 4)));
    }

    @Test
    public void testEqualEllipse2DFirstNotNullSecondNull() {
        assertFalse(ShapeUtilities.equal(new Ellipse2D.Double(1, 2, 3, 4), null));
    }

    @Test
    public void testEqualEllipse2DSameFrame() {
        Ellipse2D e1 = new Ellipse2D.Double(1, 2, 3, 4);
        Ellipse2D e2 = new Ellipse2D.Double(1, 2, 3, 4);
        assertTrue(ShapeUtilities.equal(e1, e2));
    }

    @Test
    public void testEqualEllipse2DDifferentFrame() {
        Ellipse2D e1 = new Ellipse2D.Double(1, 2, 3, 4);
        Ellipse2D e2 = new Ellipse2D.Double(1, 2, 4, 4);
        assertFalse(ShapeUtilities.equal(e1, e2));
    }

    @Test
    public void testEqualArc2DBothNull() {
        assertTrue(ShapeUtilities.equal((Arc2D) null, (Arc2D) null));
    }

    @Test
    public void testEqualArc2DFirstNullSecondNotNull() {
        assertFalse(ShapeUtilities.equal(null, new Arc2D.Double(1, 2, 3, 4, 0, 90, Arc2D.PIE)));
    }

    @Test
    public void testEqualArc2DFirstNotNullSecondNull() {
        assertFalse(ShapeUtilities.equal(new Arc2D.Double(1, 2, 3, 4, 0, 90, Arc2D.PIE), null));
    }

    @Test
    public void testEqualArc2DSameParameters() {
        Arc2D a1 = new Arc2D.Double(1, 2, 3, 4, 10, 80, Arc2D.PIE);
        Arc2D a2 = new Arc2D.Double(1, 2, 3, 4, 10, 80, Arc2D.PIE);
        assertTrue(ShapeUtilities.equal(a1, a2));
    }

    @Test
    public void testEqualArc2DDifferentFrame() {
        Arc2D a1 = new Arc2D.Double(1, 2, 3, 4, 10, 80, Arc2D.PIE);
        Arc2D a2 = new Arc2D.Double(1, 2, 4, 4, 10, 80, Arc2D.PIE);
        assertFalse(ShapeUtilities.equal(a1, a2));
    }

    @Test
    public void testEqualArc2DDifferentAngleStart() {
        Arc2D a1 = new Arc2D.Double(1, 2, 3, 4, 10, 80, Arc2D.PIE);
        Arc2D a2 = new Arc2D.Double(1, 2, 3, 4, 20, 80, Arc2D.PIE);
        assertFalse(ShapeUtilities.equal(a1, a2));
    }

    @Test
    public void testEqualArc2DDifferentAngleExtent() {
        Arc2D a1 = new Arc2D.Double(1, 2, 3, 4, 10, 80, Arc2D.PIE);
        Arc2D a2 = new Arc2D.Double(1, 2, 3, 4, 10, 90, Arc2D.PIE);
        assertFalse(ShapeUtilities.equal(a1, a2));
    }

    @Test
    public void testEqualArc2DDifferentArcType() {
        Arc2D a1 = new Arc2D.Double(1, 2, 3, 4, 10, 80, Arc2D.PIE);
        Arc2D a2 = new Arc2D.Double(1, 2, 3, 4, 10, 80, Arc2D.CHORD);
        assertFalse(ShapeUtilities.equal(a1, a2));
    }

    @Test
    public void testEqualPolygonBothNull() {
        assertTrue(ShapeUtilities.equal((Polygon) null, (Polygon) null));
    }

    @Test
    public void testEqualPolygonFirstNullSecondNotNull() {
        assertFalse(ShapeUtilities.equal(null, new Polygon()));
    }

    @Test
    public void testEqualPolygonFirstNotNullSecondNull() {
        assertFalse(ShapeUtilities.equal(new Polygon(), null));
    }

    @Test
    public void testEqualPolygonDifferentNPoints() {
        Polygon p1 = new Polygon(new int[]{1}, new int[]{1}, 1);
        Polygon p2 = new Polygon(new int[]{1, 2}, new int[]{1, 2}, 2);
        assertFalse(ShapeUtilities.equal(p1, p2));
    }

    @Test
    public void testEqualPolygonSameNPointsDifferentXCoordinates() {
        Polygon p1 = new Polygon(new int[]{1, 2}, new int[]{1, 2}, 2);
        Polygon p2 = new Polygon(new int[]{1, 3}, new int[]{1, 2}, 2);
        assertFalse(ShapeUtilities.equal(p1, p2));
    }

    @Test
    public void testEqualPolygonSameNPointsDifferentYCoordinates() {
        Polygon p1 = new Polygon(new int[]{1, 2}, new int[]{1, 2}, 2);
        Polygon p2 = new Polygon(new int[]{1, 2}, new int[]{1, 3}, 2);
        assertFalse(ShapeUtilities.equal(p1, p2));
    }

    @Test
    public void testEqualPolygonSamePoints() {
        Polygon p1 = new Polygon(new int[]{1, 2}, new int[]{1, 2}, 2);
        Polygon p2 = new Polygon(new int[]{1, 2}, new int[]{1, 2}, 2);
        assertTrue(ShapeUtilities.equal(p1, p2));
    }

    @Test
    public void testEqualGeneralPathSamePaths() {
        GeneralPath p1 = new GeneralPath();
        p1.moveTo(1, 2);
        p1.lineTo(3, 4);
        p1.closePath();
        GeneralPath p2 = new GeneralPath();
        p2.moveTo(1, 2);
        p2.lineTo(3, 4);
        p2.closePath();
        assertTrue(ShapeUtilities.equal(p1, p2));
    }

    @Test
    public void testEqualGeneralPathDifferentWindingRules() {
        GeneralPath p1 = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        p1.moveTo(1, 2);
        p1.lineTo(3, 4);
        p1.closePath();
        GeneralPath p2 = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        p2.moveTo(1, 2);
        p2.lineTo(3, 4);
        p2.closePath();
        assertFalse(ShapeUtilities.equal(p1, p2));
    }

    @Test
    public void testEqualGeneralPathDifferentSegments() {
        GeneralPath p1 = new GeneralPath();
        p1.moveTo(1, 2);
        p1.lineTo(3, 4);
        p1.closePath();
        GeneralPath p2 = new GeneralPath();
        p2.moveTo(1, 2);
        p2.lineTo(5, 6);
        p2.closePath();
        assertFalse(ShapeUtilities.equal(p1, p2));
    }

    @Test
    public void testCreateTranslatedShape() {
        Rectangle2D rect = new Rectangle2D.Double(0, 0, 10, 10);
        Shape translated = ShapeUtilities.createTranslatedShape(rect, 5, 3);
        Rectangle2D bounds = translated.getBounds2D();
        assertEquals(5, bounds.getX(), EPSILON);
        assertEquals(3, bounds.getY(), EPSILON);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateTranslatedShapeNullShape() {
        ShapeUtilities.createTranslatedShape(null, 0, 0);
    }

    @Test
    public void testRotateShapeNullBase() {
        assertNull(ShapeUtilities.rotateShape(null, 0.5, 0, 0));
    }

    @Test
    public void testRotateShapeNotNullBase() {
        Rectangle2D rect = new Rectangle2D.Double(0, 0, 10, 10);
        Shape rotated = ShapeUtilities.rotateShape(rect, Math.PI / 2, 5, 5);
        assertNotNull(rotated);
        Rectangle2D bounds = rotated.getBounds2D();
        assertEquals(0, bounds.getX(), EPSILON);
        assertEquals(10, bounds.getY(), EPSILON);
    }

    @Test
    public void testCreateDiagonalCross() {
        Shape cross = ShapeUtilities.createDiagonalCross(10, 2);
        assertNotNull(cross);
        assertTrue(cross instanceof GeneralPath);
    }

    @Test
    public void testCreateRegularCross() {
        Shape cross = ShapeUtilities.createRegularCross(10, 2);
        assertNotNull(cross);
        assertTrue(cross instanceof Polygon);
    }

    @Test
    public void testCreateDiamond() {
        Shape diamond = ShapeUtilities.createDiamond(10);
        assertNotNull(diamond);
        assertTrue(diamond instanceof Polygon);
    }

    @Test
    public void testCreateUpTriangle() {
        Shape triangle = ShapeUtilities.createUpTriangle(10);
        assertNotNull(triangle);
        assertTrue(triangle instanceof Polygon);
    }

    @Test
    public void testCreateDownTriangle() {
        Shape triangle = ShapeUtilities.createDownTriangle(10);
        assertNotNull(triangle);
        assertTrue(triangle instanceof Polygon);
    }

    @Test
    public void testCreateLineRegion() {
        Line2D line = new Line2D.Double(0, 0, 10, 10);
        Shape region = ShapeUtilities.createLineRegion(line, 4);
        assertNotNull(region);
        assertTrue(region instanceof PathIterator);
    }

    @Test
    public void testCreateLineRegionVerticalLine() {
        Line2D line = new Line2D.Double(10, 0, 10, 10);
        Shape region = ShapeUtilities.createLineRegion(line, 4);
        assertNotNull(region);
        assertTrue(region instanceof PathIterator);
    }

    @Test
    public void testGetPointInRectangleMinXMinY() {
        Rectangle2D rect = new Rectangle2D.Double(0, 0, 10, 10);
        Point2D point = ShapeUtilities.getPointInRectangle(0, 0, rect);
        assertEquals(0, point.getX(), EPSILON);
        assertEquals(0, point.getY(), EPSILON);
    }

    @Test
    public void testGetPointInRectangleMaxXMaxY() {
        Rectangle2D rect = new Rectangle2D.Double(0, 0, 10, 10);
        Point2D point = ShapeUtilities.getPointInRectangle(20, 20, rect);
        assertEquals(10, point.getX(), EPSILON);
        assertEquals(10, point.getY(), EPSILON);
    }

    @Test
    public void testGetPointInRectangleInside() {
        Rectangle2D rect = new Rectangle2D.Double(0, 0, 10, 10);
        Point2D point = ShapeUtilities.getPointInRectangle(5, 5, rect);
        assertEquals(5, point.getX(), EPSILON);
        assertEquals(5, point.getY(), EPSILON);
    }

    @Test
    public void testContainsBothNull() {
        assertFalse(ShapeUtilities.contains(null, null));
    }

    @Test
    public void testContainsRect1NullRect2NotNull() {
        assertFalse(ShapeUtilities.contains(null, new Rectangle2D.Double()));
    }

    @Test
    public void testContainsRect1NotNullRect2Null() {
        assertFalse(ShapeUtilities.contains(new Rectangle2D.Double(), null));
    }

    @Test
    public void testContainsRect1ContainsRect2() {
        Rectangle2D r1 = new Rectangle2D.Double(0, 0, 10, 10);
        Rectangle2D r2 = new Rectangle2D.Double(2, 2, 3, 3);
        assertTrue(ShapeUtilities.contains(r1, r2));
    }

    @Test
    public void testContainsRect1DoesNotContainRect2() {
        Rectangle2D r1 = new Rectangle2D.Double(0, 0, 10, 10);
        Rectangle2D r2 = new Rectangle2D.Double(12, 2, 3, 3);
        assertFalse(ShapeUtilities.contains(r1, r2));
    }

    @Test
    public void testIntersectsBothNull() {
        assertFalse(ShapeUtilities.intersects(null, null));
    }

    @Test
    public void testIntersectsRect1NullRect2NotNull() {
        assertFalse(ShapeUtilities.intersects(null, new Rectangle2D.Double()));
    }

    @Test
    public void testIntersectsRect1NotNullRect2Null() {
        assertFalse(ShapeUtilities.intersects(new Rectangle2D.Double(), null));
    }

    @Test
    public void testIntersectsRectanglesOverlap() {
        Rectangle2D r1 = new Rectangle2D.Double(0, 0, 10, 10);
        Rectangle2D r2 = new Rectangle2D.Double(5, 5, 10, 10);
        assertTrue(ShapeUtilities.intersects(r1, r2));
    }

    @Test
    public void testIntersectsRectanglesNoOverlap() {
        Rectangle2D r1 = new Rectangle2D.Double(0, 0, 10, 10);
        Rectangle2D r2 = new Rectangle2D.Double(20, 20, 10, 10);
        assertFalse(ShapeUtilities.intersects(r1, r2));
    }
}